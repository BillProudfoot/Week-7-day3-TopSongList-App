package example.codeclan.com.topsongslist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

import static example.codeclan.com.topsongslist.R.*;
import static example.codeclan.com.topsongslist.R.id.image;

public class TopSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(layout.songs_list);

        TopSongs topSongs = new TopSongs();
        ArrayList<Song> list = topSongs.getList();

        TopSongsAdapter songsAdapter = new TopSongsAdapter(this, list);

        ListView listView = (ListView) findViewById(id.list);
        listView.setAdapter(songsAdapter);

        ImageView myImageView = (ImageView) findViewById(id.list);
        myImageView.setImageResource(image);
    }

    public void getSong(View listItem) {
        Song song = (Song) listItem.getTag();
        Log.d("Song title: ", song.getTitle());
    }

//    public void getSongIcon(View listItem){
//        Drawable songIcon = getResources().getDrawable( R.drawable.icon );
//    }
    }

