
import java.util.Scanner;

class Check_lower_upper_digit{
    String check_case(char ch){
        int  asciiVal = (int)ch;
        if ((asciiVal >= 48) && (asciiVal <= 57))
            return "digit";
        else if ((asciiVal >= 65) && (asciiVal <= 90))
            return "upper case";
        else if ((asciiVal >= 97) && (asciiVal <= 122))
            return "lower case";
        else
            return "unknown";
    }
}
public class Demo39 {
    public static void main(String[] args) {
        Check_lower_upper_digit obj = new Check_lower_upper_digit();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a char");
        char ch = sc.next().charAt(0);
        String res = obj.check_case(ch);
        System.out.println(res);
    }
} 
    

