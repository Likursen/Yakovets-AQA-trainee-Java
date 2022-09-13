package yakovets.tasks;

import yakovets.utils.Utils;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int arraySize = 5;
        int[] array = Utils.createAndFillArray(arraySize);
        Arrays.stream(array)
                .filter(i -> i % 3 == 0)
                .forEach(System.out::println);
    }
}