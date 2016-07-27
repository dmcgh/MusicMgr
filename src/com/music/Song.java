package com.music;

/**
 * Created by localadmin on 7/27/16.
 */
public class Song implements Playable {

    private String name;
    private String lyrics;
    private byte duration;

    public Song(String name, String lyrics, byte duration) {
        this.name = name;
        this.lyrics = lyrics;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public byte getDuration() {
        return duration;
    }

    public void setDuration(byte duration) {
        this.duration = duration;
    }

    @Override
    public void play() {
        System.out.println("Playing " + this.name);
    }
}
