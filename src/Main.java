import java.util.Scanner; //這行要打 才有Scanner

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, d ,e, f, g;
        a = input.nextInt();
        b = input.nextInt();
        System.out.printf("%d %d", a, b);

        c =a+b;
        d =a*b;
        e =a-b;
        f =a/b;
        g =a%b;

        System.out.printf("\n%d+%d=%d",a,b,c);
        System.out.printf("\n%d*%d=%d",a,b,d);
        System.out.printf("\n%d-%d=%d",a,b,e);
        System.out.printf("\n%d/%d=%d...%d",a,b,f,g);

    }
}