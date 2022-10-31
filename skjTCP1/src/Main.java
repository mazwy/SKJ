import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args) throws IOException {

        String serverHostname = new String (null);

        Socket echoSocket = null;
        PrintWriter out = null;
        BufferedReader in = null;

        try {
            echoSocket = new Socket(serverHostname, null);
            out = new PrintWriter(echoSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(
                    echoSocket.getInputStream()));
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host: " + serverHostname);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for "
                    + "the connection to: " + serverHostname);
            System.exit(1);
        }

        out.println(null);

        /*int firstnum = Integer.parseInt(in.readLine().trim());
        int i;
        for(i = 0; Math.pow(i, 7) < firstnum; i++){}
        out.println(i - 1);

        int sum1 = Integer.parseInt(in.readLine().trim());
        int sum2 = Integer.parseInt(in.readLine().trim());
        int sum3 = Integer.parseInt(in.readLine().trim());
        int sum4 = Integer.parseInt(in.readLine().trim());
        int sum5 = Integer.parseInt(in.readLine().trim());

        int sum = sum1 + sum2 + sum3 + sum4 + sum5;
        out.println(sum);

        out.println(echoSocket.getLocalPort());

        String flag = in.readLine().trim();
        System.out.println(flag);*/

        out.println(echoSocket.getLocalPort());

        int secondstage = Integer.parseInt(in.readLine().trim());
        int i;
        for(i = 0; Math.pow(i, 8) < secondstage; i++){}
        out.println(i - 1);

        String third = in.readLine().replaceAll("9", "").trim();
        out.println(third);

        String flag = in.readLine().trim();
        System.out.println(flag);

    }

    static int findLargest(int[] arr, int n)
    {

        // Finding gcd of all the numbers
        // in the array
        int gcd = 0;
        for (int i = 0; i < n; i++)
            gcd = __gcd(arr[i], gcd);
        return gcd;
    }

    static int __gcd(int a, int b)
    {
        return b == 0 ? a : __gcd(b, a % b);
    }
}
