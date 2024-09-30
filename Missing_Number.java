import java.util.*;

public class Missing_Number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n =sc.nextLong();
     Long[] a = new Long[(int) (n-1)];
     HashSet<Long> hs = new HashSet<>();
 
     for (int i=0;i<n-1;i++)
     {
      a[i]=sc.nextLong();
      hs.add(a[i]);
    }
      long ans =0;
       for (long i=1;i<=n;i++)
       {
        if (!hs.contains(i))
        {
          ans =i;
          break;
        }
       }
       System.out.println(ans);

    }
}