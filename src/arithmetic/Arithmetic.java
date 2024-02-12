/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;
import static java.time.Clock.system;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * 
 */
public class Arithmetic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        double n = in.nextDouble();
        double m = in.nextDouble();

        ArithmeticBase arithmetic = new ArithmeticBase(n, m);

        System.out.println("Select arithmetic operation to perform:");
        for (Operation operation : Operation.values()) {
            System.out.println(operation.name());
        }

        Operation selectedOperation = Operation.valueOf(in.next().toUpperCase());

        double result = arithmetic.calculate(selectedOperation);
        System.out.println("Result: " + result);
    }
}
