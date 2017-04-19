package example.codeclan.com.topsongslist;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 19/04/2017.
 */

public class TopSongsTest {

    @Test
    public void getListTest(){
        TopSongs topSongs = new TopSongs();
        assertEquals(20, topSongs.getList().size());
    }
}


