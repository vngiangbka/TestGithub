package com.product.ygd.retrofit2java;

public class ModelData {
    private String rank;
    private String song;
    private String singer;
    private String urlMV;

    public ModelData(String rank, String song, String singer, String urlMV) {
        this.rank = rank;
        this.song = song;
        this.singer = singer;
        this.urlMV = urlMV;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getUrlMV() {
        return urlMV;
    }

    public void setUrlMV(String urlMV) {
        this.urlMV = urlMV;
    }
}
