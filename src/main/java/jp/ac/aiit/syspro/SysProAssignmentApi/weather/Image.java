package jp.ac.aiit.syspro.SysProAssignmentApi.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

@JsonIgnoreType
public class Image {

    private String title;

    private String link;

    private String url;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
