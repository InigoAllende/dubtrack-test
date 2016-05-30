package dubtrack;

import java.util.ArrayList;

public class songList {
	
	private static ArrayList<Song> songArray = new ArrayList<Song>();
	private static songList mySongList = null;

	public static songList getSongList() {
		if (mySongList == null) {
			mySongList = new songList();
		}
		return mySongList;
	}


	public ArrayList<Song> getSongArray() {
		return songArray;
	}

	public void setSongArray(ArrayList<Song> songArray) {
		this.songArray = songArray;
	}
	
	public static void addSong(Song song){
		songArray.add(song);
	}


	public static  void printSongs(){
		
		for(int i = 0; i < songArray.size(); i++){
			System.out.println("Song name: "+ songArray.get(i).getName() +"\n"
					+"Song picker: "+ songArray.get(i).getChooser() +"\n"
					+"Song upvotes: "+ songArray.get(i).getUpVotes() +"\n"
					+"Song downvotes: "+ songArray.get(i).getDownVotes() +"\n");		
		}
	}
}
