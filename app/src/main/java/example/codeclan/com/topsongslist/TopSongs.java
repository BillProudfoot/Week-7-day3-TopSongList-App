/**
 * Created by user on 19/04/2017.
 */

package example.codeclan.com.topsongslist;

import java.util.ArrayList;

public class TopSongs {

    private ArrayList<Song> list;

    public TopSongs (){
        list = new ArrayList<Song>();
        list.add(new Song(1, "Sign of The Times", "Harry Styles", R.drawable.sign_of_the_times));
        list.add(new Song(2, "Shape of You", "Ed Sheeran", R.drawable.shape_of_you));
        list.add(new Song(3, "Galway Girl", "Ed Sheeran", R.drawable.galway_girl));
        list.add(new Song(4, "Symphony", "Clean Bandit FT Zara Larsson", R.drawable.symphony));
        list.add(new Song(5, "Passionfruit", "Drake",R.drawable.passionfruit));
        list.add(new Song(6, "Something Just Like This", "Chainsmokers & Coldplay", R.drawable.something_just_like_this));
        list.add(new Song(7, "Solo Dance", "Matin Jensen", R.drawable.solo_dance));
        list.add(new Song(8, "Stay", "Zedd & Alessia Cara", R.drawable.stay));
        list.add(new Song(9, "It Ain't Me", "Kygo & Selena Gomez", R.drawable.it_aint_me));
        list.add(new Song(10, "Castle on the Hill", "Ed Sheeran", R.drawable.castle_on_the_hill));
        list.add(new Song(11, "Issues", "Julia Michaels", R.drawable.issues));
        list.add(new Song(12, "Ciao Adios", "Anne-marie", R.drawable.ciao_adios));
        list.add(new Song(13, "That's What I like", "Bruno Mars", R.drawable.thats_what_i_like));
        list.add(new Song(14, "You Don't Know Me", "Jax Jones FT Raye", R.drawable.you_dont_know_me));
        list.add(new Song(15, "Slide", "Calvin Harris/Ocean/Migos", R.drawable.slide));
        list.add(new Song(16, "No More Sad Songs", "Little Mix", R.drawable.no_more_sad_songs));
        list.add(new Song(17, "Chained to The Rhythm", "Katy Peery Ft Skip Marley", R.drawable.chained_to_the_rhythm));
        list.add(new Song(18, "Skin", "Ragnbone Man", R.drawable.skin));
        list.add(new Song(19, "Human", "Ragnbone Man", R.drawable.human));
        list.add(new Song(20, "Green Light", "Lorde", R.drawable.green_light));

    }

    public ArrayList<Song> getList(){ return new ArrayList<Song>(list);}
}
