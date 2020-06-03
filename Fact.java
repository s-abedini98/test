
package fact;

import java.util.Scanner;
public class Fact {

    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
  
         int a=1;
        for( int i=2;i<=num;i++)
           
        {
           a=a*i; 
        }
        System.out.println("a:"+ a);
    }
    
}
