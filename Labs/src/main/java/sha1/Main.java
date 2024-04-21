package sha1;

import static sha1.implementation.SHA1.bytesToHex;
import static sha1.implementation.SHA1.calculateSHA1;

public class Main {
    public static void main(String[] args) {

        String message = "Hello, World!";
        byte[] sha1Hash = calculateSHA1(message.getBytes());
        String sha1HashHex_m = bytesToHex(sha1Hash);


        System.out.println("SHA-1 hash: " + sha1HashHex_m);

    }

}
