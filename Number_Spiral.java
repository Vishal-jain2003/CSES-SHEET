import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Number_Spiral {
    public static void main(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while(t-- >0)
        {
          String[] input=br.readLine().split(" ");
          long x = Long.parseLong(input[0]); // row 
          long y=Long.parseLong(input[1]);   // col

          // we are doing operations on cols 
          long ans =0;

          if (x<y) // when cols are greater than row  // they are decreasing ex- 9 .. 8 and then 25 .24
          { 
              if (y%2!=0)
              {
                 ans=y*y-x+1;
              }
              else{
                 ans=(y-1)*(y-1)+x;
              }
          }
          else{
            if (x%2!=0)
            {
              ans = (x-1)*(x-1)+y;
            }
            else{
              ans = x*x-y+1;  
            }
          }

         sb.append(ans).append("\n");
        }

        
        System.out.println(sb.toString()); 

    }
}