package app.service;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class UniversitySearch {
    private String paramForUrl;
    public void setParamForUrl(String paramForUrl) {
        this.paramForUrl = paramForUrl;
    }

    private int pagination;
    public void setPagination(int pagination) {
        this.pagination = pagination;
    }

    public void DoUSearch() throws IOException {
        System.out.println("Я здесь!");
        ObjectMapper objectMapper = new ObjectMapper();

        String queryWithParam = String.format("https://serpapi.com/search.json?engine=google_scholar&q=%s&start=%s&api_key=62ec709f6a551a59f58d5e95bd41c3ffe4a4914c55f6fd51780f30503294ce06", paramForUrl, pagination);

        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection) new URL(queryWithParam).openConnection();
            connection.setRequestMethod("GET");
            connection.setUseCaches(false);

            connection.connect();

            StringBuilder sb = new StringBuilder();

            if (HttpURLConnection.HTTP_OK == connection.getResponseCode()) {
                System.out.println("Я здесь!");
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

                String line;
                while ((line = in.readLine()) != null) {
                    sb.append(line);
                    sb.append("\n");
                }

                String json = sb.toString();

                GoogleScholarUniversityResponse googleScholarResponse = objectMapper.readValue(json, GoogleScholarUniversityResponse.class);
                for (OrganicResult result : googleScholarResponse.getOrganic_results()) {
                    System.out.println("Я здесь!");
                    System.out.println(result.getTitle());
                    System.out.println(result.getLink());
                    PublicationInfo publicationInfo = result.getPublication_info();
                    System.out.println(publicationInfo.getSummary());
                    List<Author> authorList = publicationInfo.getAuthors();
                    if (authorList != null) {
                        for (Author author : publicationInfo.getAuthors()) {
                            if (author == null) {
                                System.out.println("No information available");
                            } else {
                                if (author.getName() != null) {
                                    System.out.println(author.getName());
                                    System.out.println(author.getAuthor_id());
                                } else {
                                    System.out.println("No information available");
                                }
                            }
                        }
                    } else {
                        System.out.println("No information available");
                    }
                    System.out.println("--------------------");
                }

            } else {
                System.out.println("fail: " + connection.getResponseCode() + ", " + connection.getResponseMessage());
            }

        } catch (Throwable cause) {
            cause.printStackTrace();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
}
