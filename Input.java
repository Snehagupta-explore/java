import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //typecasting

        float b=234.3f;
        int c= (int)b;
        System.out.println(c);
        //input
        String name=sc.nextLine();
        System.out.println(name);
        int number=sc.nextInt();
        System.out.println(number);

        //conversion
         float a=sc.nextInt();
         System.out.println(a);
         char ch='a';
         int num=ch;
         System.out.println(num);


       
    }
}
