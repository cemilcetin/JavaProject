package day02_dataTurleri_scanner;
import java.util.Scanner;

public class C11_newclassforsandeep {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
      /*
      a=5;
      b=77;

      int temp =a;
      a=b;
      b=temp;
      */

        // Swapping two variables without using the third variable
        //(a+b)-a=b


        int a = 5;
        int b = 77;

        System.out.println("a= " + a);
        System.out.println("b=" + b);

        //do something
        // a=77;
        // b= 5;

        a=a+b;
        //a=82;
        //b=77;

        b= a - b;
        //a= 82;
        // b= 5;

        //a= 77;
        a= a -b;

        System.out.println("a= " + a);
        System.out.println("b= " + b);


    }

}
