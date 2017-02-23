import javafx.geometry.Pos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Michael Servilla
 * @version date 2017-02-21
 */
public class PostfixCalculator {
    private Stack<Double> operandStack = new DoubleStack();
    private Map<String, Operator> operatorMap = new HashMap<>();

    public PostfixCalculator() {
        operatorMap.put("+", new Add());
        operatorMap.put("add", new Add());
        operatorMap.put("-", new Subtract());
        operatorMap.put("sub", new Subtract());
        operatorMap.put("*", new Multiply());
        operatorMap.put("mult", new Multiply());
        operatorMap.put("/", new Divide());
        operatorMap.put("div", new Divide());
        operatorMap.put("=", new Print());
        operatorMap.put("print", new Print());
    }

    public void storeOperand(double operand) {
        operandStack.push(operand);
    }
    public void evalOperator(String operator) {

    }

    public static class Add implements Operator {
        @Override
        public int numArgs() {
            return 0;
        }

        @Override
        public double eval(List<Double> args) {
            return 0;
        }
    }
    public static class Subtract implements Operator {

        @Override
        public int numArgs() {
            return 0;
        }

        @Override
        public double eval(List<Double> args) {
            return 0;
        }
    }
    public static class Multiply implements Operator {

        @Override
        public int numArgs() {
            return 0;
        }

        @Override
        public double eval(List<Double> args) {
            return 0;
        }
    }
    public static class Divide implements Operator {

        @Override
        public int numArgs() {
            return 0;
        }

        @Override
        public double eval(List<Double> args) {
            return 0;
        }
    }
    public static class Print implements Operator {

        @Override
        public int numArgs() {
            return 0;
        }

        @Override
        public double eval(List<Double> args) {
            return 0;
        }
    }
}
