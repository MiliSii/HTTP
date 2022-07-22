package demo;

import demo.http_requests.DeleteRequest;
import demo.http_requests.GetRequest;
import demo.http_requests.PostHttpRequest;
import demo.http_requests.PutRequest;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.IOException;
import java.net.HttpURLConnection;


public class Main {

    private static HttpURLConnection connection;                                                 //def connection

    public static void main(String[] args) throws IOException, InterruptedException {

       GetRequest.getRequest();
        PostHttpRequest.postRequest();
        DeleteRequest.deleteRequest();
        PutRequest.putRequest();

    }

    public static String parse(String responseBody){
        JSONArray albums = new JSONArray(responseBody);
        for (int i = 0; i < albums.length(); i++) {
            JSONObject album = albums.getJSONObject(i);
            int id = album.getInt("id");
            int userId = album.getInt("userId");
            String title = album.getString("title");
            System.out.println(i + " " + title + " " + userId);
        }
        return null;
    }

}