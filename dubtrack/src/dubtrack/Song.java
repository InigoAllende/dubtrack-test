package dubtrack;

import java.util.ArrayList;

public class Song {
	
	private String name;
	private String chooser;
	private String upVotes;
	private String downVotes;
	private ArrayList<String> listeners;
	
	public Song(String name, String chooser, String upVotes, String downVotes, ArrayList<String> listeners) {
		super();
		this.name = name;
		this.chooser = chooser;
		this.upVotes = upVotes;
		this.downVotes = downVotes;
		this.listeners = listeners;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getChooser() {
		return chooser;
	}

	public void setChooser(String chooser) {
		this.chooser = chooser;
	}

	public String getUpVotes() {
		return upVotes;
	}

	public void setUpVotes(String upVotes) {
		this.upVotes = upVotes;
	}

	public String getDownVotes() {
		return downVotes;
	}

	public void setDownVotes(String downVotes) {
		this.downVotes = downVotes;
	}

	public ArrayList<String> getListeners() {
		return listeners;
	}

	public void setListeners(ArrayList<String> listeners) {
		this.listeners = listeners;
	}
	
	
	

}
