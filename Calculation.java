import java.util.Scanner;
public class Calculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = sc.nextInt();
       System.out.println("enter the value of b");
       int b=sc.nextInt();
       int sum=a+b;
       System.out.println("sum " +sum);
       System.out.println("enter the value of c");
       int c=sc.nextInt();
       System.out.println("enter value of d");
       int d=sc.nextInt();
       int mul=c*d;
       System.out.println("multiplication " +mul);
       //circle area 
       System.out.println("enter radius");
       Float r=sc.nextFloat();
       float area = 3.14f*r*r;
       System.out.println("area of circle " +area );

    }
}
