package com.example.tr.model;

public class TopCollectionData {

    String judul;
    Integer imageUrl;

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }

    public TopCollectionData(String judul, Integer imageUrl) {
        this.judul = judul;
        this.imageUrl = imageUrl;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }
}
