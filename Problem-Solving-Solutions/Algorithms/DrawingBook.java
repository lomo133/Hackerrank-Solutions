/**
* @Author: Joakim Olsson
* @Date:   2019-06-30T00:20:36+02:00
 * @Last modified by:   Joakim Olsson
 * @Last modified time: 2019-06-30T00:21:01+02:00
*/

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
    * Complete the pageCount function below.
    */
    static int pageCount(int n, int p) {
        int total = n/2;
        int right = p/2;
        int left = total - right;
        return (left < right) ? left : right;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}