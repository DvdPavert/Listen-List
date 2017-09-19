package com.example.daniel.a11045418_pset3;

/**
 * Created by Daniel on 19/09/2017.
 */

public class Song
{

    private String name;
    private String artist;
    private String album;
    private Boolean seen;


    public Song(String name, String artist, String album)
    {
        this.name = name;
        this.artist = artist;
        this.album = album;
        this.seen = false;

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
        album = album;
    }

    public Boolean getSeen() {
        return seen;
    }

    public void setSeen(Boolean seen) {
        this.seen = seen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
