import java.util.Scanner;

/**
 * Created by yanamiletskaya on 27.07.15.
 */
public class Lesson1 {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 5, 3, 7, 9, 4, 6};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int newArr = arr[i];
                    arr[i] = arr[j];
                    arr[j] = newArr;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }
}



