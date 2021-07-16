

// import java.util.Scanner;

// public class Test {
  
//   public static void main(String[] args) {
  

// Scanner sc = new Scanner(System.in);    
// String s1=sc.next();
// int x = sc.nextInt();

// sc.close();

// System.out.printf("%-15s  %03d  %n", s1, x);

//   }







// }
import java.io.*;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scan = new Scanner(System.in);
    String name =scan.next();
    int num = scan.nextInt();
    scan.close();
    
    System.out.printf("%-15s%03d%n", name, num);
    }
}
