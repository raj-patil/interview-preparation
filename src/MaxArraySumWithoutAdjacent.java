import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MaxArraySumWithoutAdjacent {

    // Complete the maxSubsetSum function below.
    static int maxSubsetSum(int[] arr) {

int inc =arr[0];
int exc = 0;

        for(int i=1 ; i<arr.length ; i++)
        {
           int ex= (inc >  exc )? inc :exc ;
         inc = arr[i] + exc ;
         exc= ex;
        }

        return (inc >  exc )? inc :exc ;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = maxSubsetSum(arr);

        System.out.println(res);
//        bufferedWriter.write(String.valueOf(res));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}



//Sample Input 2
//
//5
//3 5 -7 8 10
//Sample Output 2
//
//15
//Explanation 2
//
//Our subsets are  and . The maximum subset sum is  from the fifth subset listed.