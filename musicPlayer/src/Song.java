import java.util.*;

public class Song {

    Scanner scan = new Scanner(System.in);
    HashMap<String,String> song = new HashMap<String,String>();


    String title;



    public Song() {

    }
    public LinkedList<Song> addSong(){
        System.out.println("how many songs do u want to add");
        int numOfSongs = scan.nextInt();
        for (int i = 0; i <= numOfSongs- 1; i++) {
            System.out.println("Enter the artist");
            String artist = scan.next();
            System.out.println("Enter the songs title");
            String  title = scan.next();
            song.put(artist,title);
        }

       System.out.println("Here are your songs:\n "+song);
        return null;
    }
  public void deleteSong(String artist){


        System.out.println("You deleted this song: "+ song.remove(artist));
  }

  public void searchSong(String title){
        System.out.println(song.containsValue(title));
  }
}
