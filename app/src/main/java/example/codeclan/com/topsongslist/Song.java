package example.codeclan.com.topsongslist;

/**
 * Created by user on 19/04/2017.
 */

public class Song {

    private int ranking;
    private String title;
    private String artist;
    private int image;

    public Song(Integer ranking, String title, String artist, int image){
        this.ranking = ranking;
        this.title = title;
        this.artist = artist;
        this.image = image;
    }

    public Integer getRanking() { return ranking; }
    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public int getImage() { return image; }
}
