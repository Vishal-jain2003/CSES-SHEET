import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        for (int i=1;i<=n;i++)
        {
          // total ways to put two knights in n*n matrix it will be n^2 C 2
          long squaree=(long)(i*i);
        long total=(long)((squaree)*(squaree-1)/2);
        // calculate ways in which 2 knights attack each other 
        // 2 horse so 2*(2*(n-1)*(n-2)) here 2 horses 2 ways 
        // long attackways=2*(2*(i-1)*(i-2));
        long attackways=4*(i-1)*(i-2);

        System.out.println(total-attackways);
        }
        
        

        System.out.println(); 

        sc.close(); 
    }
}
