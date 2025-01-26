import java.util.Scanner;
class Demo37{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("a:");
        int a=sc.nextInt();
        System.out.println("b:");
        int b=sc.nextInt();
        System.out.println("c:");
        int c=sc.nextInt();
        System.out.println("d:");
        int d=sc.nextInt();
        if(a>b && a>c && a>d){
            System.out.println("The biggest number is:"+a); 
        }
        else if(b>a && b>c && b>d){
            System.out.println("The biggest number is:"+b); 
        }
        else if(c>a && c>b && c>d){ 
            System.out.println("The biggest number is:"+c); 
        }
        else{
            System.out.println("The biggest number is:"+d); 
        }
        }
        }