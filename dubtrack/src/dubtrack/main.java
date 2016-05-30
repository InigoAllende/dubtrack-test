package dubtrack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;



public class main {
	
	 public static void main(String[] args) throws Exception {
		 
		 get_request.GetRoomId(args[0]);
		 get_request.GetHistory();
		 songList.printSongs();
		 //get_request.GET("https://api.dubtrack.fm/room/55ff1c928b1171030098239c/users");
		/* String url = "https://api.dubtrack.fm/room/55ff1c928b1171030098239c/users";
			
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();

			// optional default is GET
			con.setRequestMethod("GET");

			//add request header
			con.setRequestProperty("User-Agent", "Mozilla/5.0");

			int responseCode = con.getResponseCode();
			System.out.println("\nSending 'GET' request to URL : " + url);
			System.out.println("Response Code : " + responseCode);

			BufferedReader in = new BufferedReader(
			        new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

			//print result
			System.out.println(response.toString());
			
			JSONParser parser = new JSONParser();
			JSONObject json = (JSONObject) parser.parse(response.toString());*/
	 
	 }

}
