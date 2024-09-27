import java.io.*;
import java.util.*;

public class Weird_Algorithm {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static class OutputWriter {
        BufferedWriter bw;

        public OutputWriter() {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        void print(Object o) throws IOException {
            bw.write(o.toString());
        }

        void println(Object o) throws IOException {
            bw.write(o.toString());
            bw.newLine();
        }

        void flush() throws IOException { bw.flush(); }
        void close() throws IOException { bw.close(); }
    }

    static long mod = 1_000_000_007;

    static long modAdd(long a, long b) { return (a % mod + b % mod) % mod; }
    static long modMul(long a, long b) { return (a % mod * b % mod) % mod; }
    static long modPow(long base, long exp) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) result = modMul(result, base);
            base = modMul(base, base);
            exp >>= 1;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        OutputWriter out = new OutputWriter();

        // Your logic here
        long n = sc.nextLong();
        while(n!=1)
        {
          out.print(n+" ");
          if (n%2!=0)
    {
      
      n=n*3+1;
      
    }
    else
    {
    
      n=n/2;
    }

        }

        out.println(n);  // Example output
        out.flush();  // Ensure output is flushed
    }
}