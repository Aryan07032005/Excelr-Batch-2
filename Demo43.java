
import java.util.Scanner;
class up_2_low{
    char upper_to_lower(char ch){
        char res = Character.toLowerCase(ch); 
        return res;
    }
}
public class Demo43 {
    public static void main(String[] args) {
        System.out.println("enter a char");
        up_2_low obj = new up_2_low();
        char ch;
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);
        char res = obj.upper_to_lower(ch);
        System.out.println(res);
    }
}

