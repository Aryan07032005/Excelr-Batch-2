import java.util.Scanner;
class Demo38{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word:");
        char c=sc.next().charAt(0);
        if(Character.isLowerCase(c)){
            System.out.println("It is in lowercase");
        }
        else if(Character.isUpperCase(c)){
            System.out.println("It is in uppercase");
        }
        else{
            System.out.println("not defined");
        }
    }
}