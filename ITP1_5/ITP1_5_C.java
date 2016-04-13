import java.util.Scanner;
  
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
 
        while(h != 0 || w != 0){
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < h; i++){
  
                for(int j = 0; j < w; j++){
                    if((i + j) % 2 == 0 ){
                        sb.append("#");
                    }else{
                        sb.append(".");
                    }
                }
                sb.append("\n");
  
            }
            System.out.println(sb);
  
            h = sc.nextInt();
            w = sc.nextInt();
        }
    }
}
