import calculator.*;
import java.util.Scanner;

public class packageexample {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Calc cal=new Calc();
        System.out.println("enter number1:");
        int n=scanner.nextInt();
        System.out.println("enter number2:");
        int m=scanner.nextInt();
        System.out.println("select one option:\n 1.add\n2.sub");
        int ch=scanner.nextInt();
        switch (ch){
            case 1:
                System.out.println("result="+cal.add(n,m));
                break;
            case 2:
                System.out.println("result="+cal.sub(n,m));
                break;
            default:
                System.out.println("invalid");
        }
    }
}

