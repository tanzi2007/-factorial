import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("x=");
        double x=scanner.nextDouble();
        int x_integer;
        double result=1;
        if(x<0&&x%1==0){
            x_integer=(int)x;
            System.out.println(x_integer+"! 无意义");
        }else if(x==0){
            System.out.println("0!=1");
        }else if(x%1==0){
            for(int i=2;i<=x;i++){
                result=result*i;
            }
            x_integer=(int)x;
            int result_integer=(int)result;
            System.out.println(x_integer+"!="+result_integer);
        }else {
            int N=100;
            for(double n=1;n<=N;n++){
                result=result*(n/(x+n));
            }
            result=result*Math.pow(N,x);
            System.out.println(x+"!="+result);
        }
    }
}