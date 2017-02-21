import java.util.HashMap;
import java.util.Map;

/**
 * @author Michael Servilla
 * @version date 2017-02-21
 */
public class PostfixCalculator {
    private Stack<Double> operandStack = new DoubleStack();
    private Map<String, Operator> operatorMap;



    public PostfixCalculator() {
//        operatorMap.put("+", operandStack.pop() );
    }

    public void storeOperand(double operand) {
        operandStack.push(operand);
    }
    public void evalOperator(String operator) {
    }

}
