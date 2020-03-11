package com.example.uploadimage;

import com.google.gson.annotations.SerializedName;

import java.io.File;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ServerResponse {

    @SerializedName("error")
    @Expose
    private Boolean error;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("name")
    @Expose
    private String name;

    public ServerResponse() {
    }
    public ServerResponse(Boolean error, String url, String name) {
        super();
        this.error = error;
        this.url = url;
        this.name = name;
    }

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}