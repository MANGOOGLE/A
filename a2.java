import java.util.Scanner;
public class a2 {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        if(a%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        scan.close();
    }
}