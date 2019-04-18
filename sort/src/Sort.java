import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

public class Sort {
    void input(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        String str = in.nextLine();
        String strArr[] = str.split(" ");
        int numArr[] = new int[strArr.length];
        System.out.printf("Your number: %s \n", str);
        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        }
        in.close();
        Arrays.sort(numArr);
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(numArr[i]);
        }
    }
}