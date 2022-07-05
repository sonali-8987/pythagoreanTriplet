import java.util.*;
import java.io.*;


class pythagoreanTriplet{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a, b, c = 0;
        int m = 2;
        while (c < n) {
 
            for (int n = 1; n < m; ++n) {
                a = m * m - n * n;
                b = 2 * m * n;
                c = m * m + n * n;
 
                if (c > n)
                    break;
 
                System.out.println(a + " " + b + " " + c);
            }
            m++;
        }
    }   
}
