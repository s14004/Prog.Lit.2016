import java.io.*;
  
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int x = Integer.parseInt(s);
        int res = x * x * x;
        System.out.println(res);
    }
}
