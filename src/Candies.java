
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Candies {

    // Complete the candies function below.
    static long candies(int n, int[] arr) {


        int candies[] = new int[n];
         int pre = arr[0];
         int cur=arr[0];
         candies[0]=1;
        for(int i=1 ; i<n ;i++)
        {
            cur = arr[i];
            if(cur>pre)
            {
                candies[i]=candies[i-1]+1;
            }
            else
            {
                candies[i]=1;
            }
            pre=cur;
           
       }



       pre=cur=arr[n-1];

    long   tcan = candies[n-1];

    for(int i = n-2 ; i>=0 ; i--)
    {
        cur=arr[i];
        if(cur>pre && candies[i+1] >=candies[i])
        {
            candies[i]= candies[i+1] + 1;
        }
        tcan = tcan+candies[i];
        pre=cur;
    }




return tcan;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            arr[i] = arrItem;
        }

        long result = candies(n, arr);

        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}


//Sample Input 2
//
//8
//2
//4
//3
//5
//2
//6
//4
//5
//Sample Output 2
//
//12
//Explanation 2
//
//Optimal distribution will be .12121212
