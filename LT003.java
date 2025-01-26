import java.util.Scanner;

public class LT003 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=scanner.next();
        int number = Integer.parseInt(str);
        System.out.println("Converted integer: " + number);
    }
}