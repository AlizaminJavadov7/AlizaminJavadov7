import java.util.Scanner;
//public class Caculator {
public class Caculator {
    public static void main(String[] args) {


        int a = 1221;
        int b = a;
       int c;
        int d = 0;
        while (a > 0) {

            d = (d * 10) + a % 10;
            a /= 10;

        }

        if (b == d) {
            System.out.println("it is polindrome");

        } else
            System.out.println(" it is not ");
    }
}







//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter num1");
//        double num1 = scanner.nextDouble();
//        System.out.println("enter num2");
//        double num2 = scanner.nextDouble();
//        System.out.println("what do you want");
//        String x = scanner.next();
//        if (x.equals("+")) {
//            System.out.println(num1 + num2);
//        } else if (x.equals("-")) {
//            System.out.println(num1 - num2);
//
//        } else if (x.equals("/")) {
//            System.out.println(num1 / num2);
//
//        } else if (x.equals("*")) {
//            System.out.println(num1 * num2);
//        }

 //   }
//}
