import java.util.Scanner;
class Demo35{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("a:");
        int a=sc.nextInt();
        System.out.println("b:");
        int b=sc.nextInt();
        if(a>b){
           System.out.println("The biggest number is:"+a); 
        }
        else{
            System.out.println("The biggest number is:"+b); 
        
        }
    }
}