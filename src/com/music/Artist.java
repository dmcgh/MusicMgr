package com.music;

import java.util.ArrayList;

/**
 * Created by localadmin on 7/27/16.
 */
public class Artist {
    private String name;
    private ArrayList<Album> albums;

    public Artist(String name) {
        this.name = name;
        this.albums = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void addAlbum(Album album){
        this.albums.add(album);

    }

    public void deleteAlbum(String name){
        this.albums.removeIf(a -> a.getName().equals(name));
    }

    public String toString(){
        StringBuffer aBuf = new StringBuffer();
        aBuf.append("Artist: " + this.name);
        aBuf.append("\n");
        this.albums.forEach(a -> aBuf.append(a.getName() + "\n"));
        return aBuf.toString();
    }
}
