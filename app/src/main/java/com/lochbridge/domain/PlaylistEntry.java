package com.lochbridge.domain;


public class PlaylistEntry {

    private String title;
    private String id;
    private String description;
    private String thumbnailUrl;
    private boolean isPlaylist;

    public PlaylistEntry(String title, String ie, boolean isPlaylist, String description, String thumbnailUrl){
        this.title = title;
        this.id = id;
        this.isPlaylist = isPlaylist;
        this.description = description;
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isPlaylist() {
        return isPlaylist;
    }

    public void setPlaylist(boolean playlist) {
        isPlaylist = playlist;
    }
}
