import java.util.Scanner;

public class If {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
    
        switch (n) {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("sunday");
                break;        
        
            default:
                System.out.println("invalid");
        }

    //     System.out.println("enter your age");
    //     int age=sc.nextInt();
    //     if(age>=18){
    //         System.out.println("you are adult");
    //     }
    //     else{
    //         System.out.println("you cannot vote");
    //     }
    //     int a=1;
    //     int b=3;
    //     if(a>b){
    //         System.out.println("a is greter " +a);
    //     }
    //     else{
    //         System.out.println("b is greater " +b);
    //     }

    //     System.out.println("enter the number");
    //     int n=sc.nextInt();
    //     if(n%2==0){
    //         System.out.println("even " +n);
    //     }
    //     else{
    //         System.out.println("odd " +n);
    //     }

    //     //else-if
    //     System.out.println("enter your income");
    //     double income=sc.nextDouble();
    //     if(income<500000){
    //         System.out.println("0% tax");
    //     }
    //     else if(income>=500000 && income<=1000000){
    //         System.out.println("20% tax");
    //         int tax=(int)(income*0.2);
    //         System.out.println("tax " +tax);
    //     }
    //     else{
    //         int tax= (int) (income*0.3);
    //         System.out.println("above 30lkh tax " +tax);
    //     }
    //     int n1=40;
    //     int n2=50;
    //     int n3=8;
    //     if(n1>n2 && n1>n3){
    //         System.out.println("n1 is greater " +n1);
    //     }
    //     else if( n2>n3){
    //         System.out.println("n2 is greater " +n2);
    //     }
    //     else{
    //         System.out.println("n3 is gretaer " +n3);
    //     }
    //     int num = 4;
    //     String type=((num%2)==0) ? "even" : "odd";
    //     System.out.println(type);

    // System.out.println("enter percentage");
    // float p=sc.nextFloat();
    // String percentage=(p>=33) ? "pass" : "fail";
    // System.out.println(percentage);

    // //switch 
    // int numb=2;
    // switch(numb){
    //     case 1:System.out.println("burger");
    //     break;
    //     case 2: System.out.println("pizza");
    //     break;
    //     case 3:System.out.println("cold drink");
    // }

    // System.out.println("enter a ");
    // int a=sc.nextInt();
    // System.out.println("enter b ");
    // int b=sc.nextInt();
    // char operator= sc.next().charAt(0);
    // switch (operator) {
    //     case '+':
    //        System.out.println(a+b); 
    //         break;
    //     case '-':
    //        System.out.println(a-b);
    //        break;
    //     case '*'   :
    //        System.out.println(a*b);
    //        break;
    //     case '/':
    //         System.out.println(a/b);
    //         break;
    //     default:
    //         System.out.println("invalid operator");
            
    // }
    }
    
    
}


