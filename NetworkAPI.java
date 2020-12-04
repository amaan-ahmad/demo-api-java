package DemoAPI;

// import dummy.APOD;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class NetworkAPI {
    public static void Fetch(String urlString) {
        try {
            System.out.println("fetching data...");
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("accept", "application/json");
            InputStream responseStream = connection.getInputStream();
            ObjectMapper mapper = new ObjectMapper();
            APOD apod = mapper.readValue(responseStream, APOD.class);
            System.out.println(apod.title);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
