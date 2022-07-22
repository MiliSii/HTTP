package demo.http_requests;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URI;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
import java.net.URL;
import java.net.http.*;

public class DeleteRequest {

    public static void deleteRequest() throws IOException {

        URL url = new URL("https://jsonplaceholder.typicode.com/posts/1");
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        http.setRequestMethod("DELETE");
        System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
        http.disconnect();

    }


}
