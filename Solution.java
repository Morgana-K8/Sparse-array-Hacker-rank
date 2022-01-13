import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] stringArr = new String[n];

        for (int i = 0; i < n; i++){
                stringArr[i] = scan.next();              
            }

        int q = scan.nextInt();
        for (int i = 0; i < q; i++){
                String stringQue = scan.next();

                int occNum = 0;
                for (int j = 0; j < n; j++){
                    if (stringQue.equals(stringArr[j])) occNum++;                                           
                }
             System.out.println(occNum);
        }   
    }
}