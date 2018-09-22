 /*
     * Find PI to the Nth Digit with loop:
     * Enter the loop to do as much pi round up as you want
     * Enter value to round up pi to your respected decimals
     * Don't exceed the limit for PI
     */

import java.math.BigDecimal;
import java.util.Scanner;

    public class Pi {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            BigDecimal n1 = new BigDecimal(22.0);
            BigDecimal n2 = new BigDecimal(7.0);


            System.out.println("How many times do you want to loop for PI decimals: ");
            int l = input.nextInt();
 for(int i = 1; i <= l; i++)  {
System.out.println("How many decimals would you like your PI to be: ");
int n = input.nextInt();
if(n<99999999) {
    System.out.println(n1.divide(n2, n, BigDecimal.ROUND_UP));
}
else
    System.out.println("Limit exceeded!");
        }
        }
    }


