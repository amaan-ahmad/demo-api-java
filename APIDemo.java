package DemoAPI;

public class APIDemo {
    private static String url = "https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY";

    // API used only for testing!
    public static void main(String[] args) {
        NetworkAPI.Fetch(url);
    }

}
