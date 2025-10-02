# GoogleScholarExplorer - a Google Scholar search & monitoring tool
## Consept 
This is an information-analytical system for exploring and monitoring scientific publications using data from Google Scholar.

Since Google Scholar does not provide a public API, the project uses the [SerpApi](https://serpapi.com/) service to fetch search results. Please note that SerpApi has a request limit. To run the application, you must supply your personal api_key in the request parameters.

SerpApi also provides a playground where you can practice sending queries and review JSON-formatted responses.

## Features
User can perform:
+ **University** search – search publications by the name of an educational institution.
+ **Profile** search – search by author’s full name (supports Russian and English input).
+ **Author** search – search by author ID with details such as:
  + аull name and affiliation,
  + сitation count,
  + h-index,
  + titles, years, and citation counts of the first 10 publications.

Additional functionality:
+ Cyrillic-to-UTF8 conversion is supported for queries in Russian.
+ Pagination is implemented for university and profile searches (results are shown in sets of 10, with an option to load more).

## Tech Stack
+ **Java** – core programming language used to build the backend logic.
+ **Jakarta Servlet** (formerly Java Servlet) – framework for handling HTTP requests and responses.
+ **JSP** (JavaServer Pages) – server-side technology used to render dynamic content (search results, user lists) into HTML.
+ **Apache Tomcat** – servlet container and application server used to deploy and run the web application.
+ **Postman(** – API testing tool used to send HTTP requests and verify responses during development.
+ **JSON** – data exchange format used for communication with the SerpApi service and parsing responses.

## Web Interface

+ index.html – static entry page with a welcome message and form where the user selects the type of search (U = University, P = Profile, A = Author).
+ AuthorSearch.jsp, ProfileSearch.jsp, UniversitySearch.jsp, UniversityResults.jsp – JSP pages for displaying search results.
+ list.jsp – JSP page for listing users dynamically (names are passed via request.getAttribute("userNames")).

## Development Environment
+ IntelliJ IDEA Community Edition from JetBrains
+ Tested locally with Apache Tomcat server

## Running the Project
1. Clone the repository:
```
git clone https://github.com/your-username/GoogleScholarExplorer.git
```

2. Open the project in your IDE (e.g., IntelliJ IDEA).
3. Configure and run with Apache Tomcat.
4. Supply your SerpApi API key when making requests.
