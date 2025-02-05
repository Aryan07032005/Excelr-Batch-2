
import java.util.Scanner;
class vowelConst{
    String vC(char ch){
        if ((ch == 'a')||(ch == 'e')||(ch == 'i')||(ch == 'o')||(ch == 'u')||(ch == 'A')||(ch == 'E')||(ch == 'I')||(ch == 'O')||(ch == 'U'))
            return "vowel";
        else
            return "consonent";
    }
}
public class Demo41 {
    public static void main(String[] args) {
        System.out.println("enter a char");
        vowelConst obj = new vowelConst();
        char ch;
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);
        String res = obj.vC(ch);
        System.out.println(res);
    }
}
