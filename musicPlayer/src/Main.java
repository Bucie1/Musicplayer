import jdk.internal.jimage.ImageStrings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Song songObj = new Song();
        PlayLists play = new PlayLists();
        Scanner songScan = new Scanner(System.in);


        System.out.println("---------------------------------------------------");
        songObj.addSong();
        System.out.println("enter number to perform any of the following actions:\n" +
                "1.Delete Song\n" +
                "2.Search Song\n" );
        int action = songScan.nextInt();
        if(action == 1) {
            System.out.println("artist name of the song do you want to delete");
            String songName = songScan.next();
            songObj.deleteSong(songName);
            System.out.println("---------------------------------------------------");
        } else if (action==2) {
            System.out.println("name of the searched song");
            String songTitle = songScan.next();
            songObj.searchSong(songTitle);
            System.out.println("---------------------------------------------------");

        }else{
            System.out.println("****Invalid Option**");
        }
        System.out.println("-------***ADDING SONGS TO PLAYLIST***------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("create playlist name\n");
        String name = scanner.next();
        play.createPlaylist(name);
        System.out.println("---------------------------------------------------");
        play.addSong();
        System.out.println("added to playlist");
        System.out.println("---------------------------------------------------");


    }
}
