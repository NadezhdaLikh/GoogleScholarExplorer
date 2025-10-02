package app.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Profiles {
    private String name;
    private String link;
    private String author_id;
    private String affiliations;
    private int cited_by;

    public String getName() {
        return name;
    }
    public String getLink() {
        return link;
    }
    public String getAuthor_id() {
        return author_id;
    }
    public String getAffiliations() {
        return affiliations;
    }
    public int getCited_by() {
        return cited_by;
    }
}
