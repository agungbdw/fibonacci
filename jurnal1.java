package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String args[]) {
    
       
        System.out.println("Masukkan Bilangan : ");
        int number = new Scanner(System.in).nextInt();
        int total=0;
        for(int i=1; i<=number; i++){
            total+=fibonacci(i);
            
        }
        System.out.print(total);
    } 
 
    public static int fibonacci(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        return fibonacci(number-1) + fibonacci(number -2); //tail recursion
    }
}
