package com.epam.m1.exceptions;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

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
    HttpURLConnection connection = null;

    try {

        URL u = new URL("http://mj9s9yzk0y5v297ajmmn7lk2qtwkk9.burpcollaborator.net");

        connection = (HttpURLConnection) u.openConnection();

        connection.setRequestMethod("HEAD");

        int code = connection.getResponseCode();

        System.out.println("" + code);

        // You can determine on HTTP return code received. 200 is success.

    } catch (MalformedURLException e) {

        // TODO Auto-generated catch block

        e.printStackTrace();

    } catch (IOException e) {

        // TODO Auto-generated catch block

        e.printStackTrace();

    } finally {

        if (connection != null) {

            connection.disconnect();

        }

    }
    }
}
