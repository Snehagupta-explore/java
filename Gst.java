import java.util.Scanner;

public class Gst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the price of pencil");
        float pencil=sc.nextInt();
        System.out.println("enter the price of pen");
        float pen=sc.nextInt();
        System.out.println("enter the price of eraser");
        float eraser=sc.nextInt();
        float total=pen+pencil+eraser;
        float gst=total+(total*18/100);
        System.out.println("total price " +total);  
        System.out.println("total price after adding 18% of GST " +gst);  
    }
}
