package example.codeclan.com.topsongslist;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 19/04/2017.
 */

public class SongTest {

    Song song;

    @Before
    public void before(){ song = new Song(22,"Paris", "Chainsmokers" ); }

    @Test
    public void getRankingTest(){
        assertEquals((Integer)22, song.getRanking());
    }

    @Test
    public void getTitleTest() {
        assertEquals("Paris", song.getTitle());
    }

    @Test
    public void getArtistTest() {
        assertEquals("Chainsmokers", song.getArtist());
    }
}
