import java.util.*;

public class Increasing_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
    int[] a = new int[n];
    for (int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
   long move=0;
    for (int i=1;i<n;i++)
    {
      if (a[i]<a[i-1])
      {
        move+=(a[i-1]-a[i]);
        
        a[i]=a[i-1];
      }
 
    }
    System.out.println(move);

    }
}