package com.example.musicplayer;

public class MusicFiles {
    private String path;
    private String title;
    private String artist;
    private String album;
    private String duration;

    public MusicFiles(String duration, String album, String artist, String title, String path) {
        this.duration = duration;
        this.album = album;
        this.artist = artist;
        this.title = title;
        this.path = path;
    }



    public MusicFiles() {
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
