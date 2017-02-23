/**
 * @author Michael Servilla
 * @version date 2017-02-21
 */
import java.util.Scanner;

/** Evaluates postfix expressions from standard input. */
public class CalcTestIntellij {

    public static void main(String[] args) {
        // Create a scanner from standard input
        Scanner scanner = new Scanner(System.in);

        // Make a new calculator
        PostfixCalculator calc = new PostfixCalculator();
        calc.a = 1;


        // keep reading tokens until we run out.
        while(scanner.hasNext()) {
            if(scanner.hasNextDouble()) {
                // Next item is a double, so must be an operand
                calc.storeOperand(scanner.nextDouble());
            } else {
                // otherwise, we have an operator
                calc.evalOperator(scanner.next());
            }
        }
    }
}
