import java.util.Scanner;
public class factorial_new {
    public static void main(String[] args){
        Calculate calculate=new Calculate();
        Scanner scanner = new Scanner(System.in);
        System.out.print("x=");
        calculate.x=scanner.nextDouble();
        if(calculate.x==0){
            calculate.zero();
        }else if(calculate.x<0){
            calculate.negative_numbers(calculate.x);
        }else {
            calculate.positive_numbers(calculate.x);
        }
    }
}
class Calculate{
    double result=1;
    double N=1000000;
    public double x;
    public void zero(){
        System.out.println("0!=1");
    }
    public void negative_numbers(double x){
        if(x%1==0){
            System.out.println(x+"!无意义");
        }else {
            result=result*Math.pow(N,x);
            for(double n=1;n<=N;n++){
                result=result*(n/(x+n));
            }
            System.out.println(x+"!="+result);
        }
    }
    public void positive_numbers(double x){
        double k=x;
        if(x%1==0) {
            for(int i=2;i<=x;i++){
                result=result*i;
            }
        }else {
            if (x>1) {
                while (k>1){
                    result=result*k;
                    k--;
                }
            }
            result=result*Math.pow(N, k);
            for (double n=1;n<=N;n++) {
                result=result*(n/(k+n));
            }
        }
        System.out.println(x+"!="+result);
    }
}