import java.util.Scanner;

class Calculator{
    int a,b,result;
    void add(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        a=scan.nextInt();
        b=scan.nextInt();
        result=a+b;
        System.out.println("Addition is "+result);
    }
    void sub(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        a=scan.nextInt();
        b=scan.nextInt();
        result=a-b;
        System.out.println("Subtracton is "+result);
    }

    void mul(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        a=scan.nextInt();
        b=scan.nextInt();
        result=a*b;
        System.out.println("Multiplication is "+result);
    }

    void div(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        a=scan.nextInt();
        b=scan.nextInt();
        result=a/b;
        System.out.println("Division is "+result);
    }
}
class calculatorApp{
    public static void main(String[]args){
        Calculator c=new Calculator();
        c.add();
        c.sub();
        c.mul();
        c.div();
    }
}
