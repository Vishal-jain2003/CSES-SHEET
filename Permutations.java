import java.util.*;

public class Permutations
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // int[] arr = new int[n];
        StringBuilder sb = new StringBuilder();
        int k=0;  
        if (n==2 || n==3)
        {
          System.out.println("NO SOLUTION");
          return ;
        }

       for (int i=2;i<=n;i+=2)
       {
         sb.append(i).append(" ");
       }
       for (int i=1;i<=n;i+=2)
       {
        sb.append(i).append(" ");
       }
       System.out.println(sb.toString());



        System.out.println(); 

    }
}