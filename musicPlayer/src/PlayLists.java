import java.util.ArrayList;
import java.util.LinkedList;

public class PlayLists extends Song{
    ArrayList<Song> arrSong = new ArrayList<Song>();


    public void createPlaylist(String name){
        System.out.println("you successfully created  "+name+" playlist");

    }

    @Override
    public LinkedList<Song> addSong() {
        super.addSong();
        return null;
    }

}
