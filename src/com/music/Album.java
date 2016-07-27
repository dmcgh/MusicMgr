package com.music;
import com.music.Song;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by localadmin on 7/27/16.
 */
public class Album implements Playable {
    private String name;
    private String genre;
    private String artwork;
    ArrayList<Song> songs;

    public Album(String name, String genre, String artwork) {
        this.name = name;
        this.genre = genre;
        this.artwork = artwork;
        songs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getArtwork() {
        return artwork;
    }

    public void setArtwork(String artwork) {
        this.artwork = artwork;
    }

    @Override
    public void play() {
        System.out.println("Playing album" + this.name);
    }

    public void addSong(Song s) {
        this.songs.add(s);
    }
    public void deleteSong(Song s) {
        this.songs.remove(s);
    }
    public void deleteSong(String songName) {
        boolean removed = this.songs.removeIf(s -> s.getName().equals(songName));
    }

    public int getDuration() {
        List<Song> lSongs = (List<Song>) this.songs;
//        int sum = lSongs.stream().map(s -> s.getDuration()).mapToInt(Integer::new).sum();
//        return sum;
        return songs.stream().map(s -> (int) s.getDuration()).reduce(0, (sum, val) -> sum + val);
        //return songs.stream().reduce(0, (sum, s) -> sum + ((int) s.getDuration()));
    }
}
