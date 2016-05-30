package dubtrack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;




public class get_request {
	private static URL obj;
	private static HttpURLConnection con;
	private static  String roomId;

	public get_request(String roomId) {
		super();
		this.roomId = roomId;
	}


	public static void GetRoomId(String roomName) throws IOException, ParseException{

		JSONParser parser = new JSONParser();
		JSONObject json = (JSONObject) parser.parse(GET("https://api.dubtrack.fm/room/"+roomName));
		JSONObject data = (JSONObject)json.get("data");
        roomId = (String) data.get("_id");
		
	}
	
	public static void GetHistory() throws ParseException, IOException{
		
		JSONParser parser = new JSONParser();
		JSONObject json = (JSONObject) parser.parse(GET("https://api.dubtrack.fm/room/"+roomId+"/playlist/history"));
		JSONArray songs = (JSONArray) json.get("data");
		String songName = null;
		String songPicker = null;
		String songUpVotes = null;
		String songDownVotes = null;
		
		for(int i = 0; i < songs.size(); i++){
			JSONObject item = (JSONObject) songs.get(i);
			JSONObject user = (JSONObject) item.get("_user");
			songPicker = (String) user.get("username");
			JSONObject song = (JSONObject) item.get("_song");
			songName = (String) song.get("name");
			songUpVotes = item.get("updubs").toString();
			songDownVotes = item.get("downdubs").toString();
			
			Song newSong = new Song(songName, songPicker, songUpVotes, songDownVotes, null);
			songList.addSong(newSong);
		}
	}
	
	private static  String GET(String url) throws IOException{
	
	obj = new URL(url);
	con = (HttpURLConnection) obj.openConnection();
	con.setRequestMethod("GET");
	con.setRequestProperty("User-Agent", "Mozilla/5.0");
	
	BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
	String inputLine;
	StringBuffer response = new StringBuffer();

	while ((inputLine = in.readLine()) != null) {
		response.append(inputLine);
	}
	in.close();

	return response.toString();
	}
	
	
}
