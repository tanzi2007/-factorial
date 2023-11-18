import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("x=");
        double x=scanner.nextDouble();
        long x_integer;
        double result=1;
        double k;
        if(x<0&&x%1==0){
            x_integer=(long)x;
            System.out.println(x_integer+"! 无意义");
        }else if(x==0){
            System.out.println("0!=1");
        }else if(x%1==0){
            for(int i=2;i<=x;i++){
                result=result*i;
            }
            x_integer=(long)x;
            long result_integer=(long)result;
            System.out.println(x_integer+"!="+result_integer);
        }else {
            int N=10000;
            k=x-x%1;
            for(double n=1;n<=N;n++){
                result=result*(n/(x+n));
                if(n<=k){
                    result=result*N;
                }
            }
            result=result*Math.pow(N,x%1);
            System.out.println(x+"!="+result);
        }
    }
}