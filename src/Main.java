import java.util.Arrays;
import java.util.List;

public class Main {

    /*encrypt("Hello") ➞ [72, 29, 7, 0, 3]
        H = 72, the difference between the H and e is 29 (upper- and lowercase).
        The difference between the two l's is obviously 0.

        encrypt("Sunshine") ➞ [83, 34, -7, 5, -11, 1, 5, -9]

        decrypt([ 72, 33, -73, 84, -12, -3, 13, -13, -68 ]) ➞ "Hi there!"
     */

    public static void main(String[] args) {

//        int[] array = encrypt("Sunshine");
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + ", ");
//        }

        int[] arr = {72, 33, -73, 84, -12, -3, 13, -13, -68};
        System.out.println(decrypt(arr));
    }

    public static String decrypt(int[] arr) {
        char letter = 0;
        String result = "";

        for (int i = 0; i < arr.length; i++) {
            letter += (char) (arr[i]);
            result += letter;
        }

        return result;
    }

    public static int[] encrypt(String str) {
        char[] arrayOfLetters = new char[str.length()];
        int[] arrayOfNumbers = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arrayOfLetters[i] = str.charAt(i);
        }

        for (int j = 0; j < arrayOfLetters.length; j++) {
            if (j == 0) {
                arrayOfNumbers[j] = arrayOfLetters[j];
            } else {
                arrayOfNumbers[j] = arrayOfLetters[j] - arrayOfLetters[j - 1];
            }
        }
        return arrayOfNumbers;
    }
}
