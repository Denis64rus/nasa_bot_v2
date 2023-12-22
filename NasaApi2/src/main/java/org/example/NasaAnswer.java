package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

    public class NasaAnswer {
        String date;
        String explanation;
        String hdurl;
        String media_type;
        String service_version;
        String title;
        String url;
        String copyright;

        public NasaAnswer(@JsonProperty("date") java.lang.String date,
                          @JsonProperty("explanation") java.lang.String explanation,
                          @JsonProperty("hdurl") java.lang.String hdurl,
                          @JsonProperty("media_type") java.lang.String media_type,
                          @JsonProperty("service_version") java.lang.String service_version,
                          @JsonProperty("title") java.lang.String title,
                          @JsonProperty("url") java.lang.String url,
                          @JsonProperty("copyright") java.lang.String copyright) {
            this.date = date;
            this.explanation = explanation;
            this.hdurl = hdurl;
            this.media_type = media_type;
            this.service_version = service_version;
            this.title = title;
            this.url = url;
            this.copyright = copyright;
        }
}
