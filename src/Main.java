import com.music.*;
/**
 * Created by localadmin on 7/27/16.
 */
public class Main {

    public static void main(String[] args) {
        Song s1 = new Song("name1", "blah blah", (byte) 5);
        Song s2 = new Song("name2", "blah blah", (byte) 5);
        Song s3 = new Song("name3", "blah blah", (byte) 5);
        Song s4 = new Song("name4", "blah blah", (byte) 5);
        Album a1 = new Album("MyAlbum", "Classical", "http://x.x");
        Album a2 = new Album("MyAlbum2", "Rock", "http://x.x");
        a1.addSong(s1);
        a1.addSong(s2);
        a1.addSong(s3);
        a1.addSong(s4);
        a1.deleteSong(s2.getName());
        int totalDur = a1.getDuration();

        Artist prince = new Artist("Prince");
        prince.addAlbum(a1);
        prince.addAlbum(a2);
        prince.deleteAlbum("MyAlbum2");
        System.out.println(prince);
    }
}
