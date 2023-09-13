import java.util.Scanner;
public class Factorial{
public static void main(String args[]){
int number;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
number = sc.nextInt();
for(int i=1; i<=number;i++)
System.out.println(i);
}
}