import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        scan.nextLine();
        
        for (int i=0; i < n; i++) {
            String word = scan.nextLine();
            char[] charArray = word.toCharArray();
            
            for (int j=0; j < charArray.length; j++) {
                if (j%2 == 0) {
                    System.out.print(charArray[j]);
                }
            }
        
            System.out.print(" ");
            
            for (int j=0; j < charArray.length; j++) {
            if (j%2 != 0) {
                System.out.print(charArray[j]);
                }
            }
        
            System.out.println();
            
        }
        
        scan.close();
    }
}