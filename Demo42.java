
import java.util.Scanner;
class low_2_up{
    char lower_to_upper(char ch){
        char res = Character.toUpperCase(ch); 
        return res;
    }
}
public class Demo42 {
    public static void main(String[] args) {
        System.out.println("enter a char");
        low_2_up obj = new low_2_up();
        char ch;
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);
        char res = obj.lower_to_upper(ch);
        System.out.println(res);
    }
}
