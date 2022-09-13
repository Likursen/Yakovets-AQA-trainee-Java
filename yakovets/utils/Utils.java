package yakovets.utils;

import java.util.Arrays;
import java.util.Scanner;

public class Utils {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static int scanInt() {
        while (!SCANNER.hasNextInt()) {
            SCANNER.next();
        }
        return SCANNER.nextInt();
    }

    public static String scanString() {
        return SCANNER.nextLine();
    }

    public static int[] createAndFillArray(int size) {
        return Arrays.stream(new int[size])
                .map(element -> scanInt())
                .toArray();
    }
}