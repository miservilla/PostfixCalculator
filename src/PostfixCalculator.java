import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Michael Servilla
 * @version date 2017-02-21
 */
public class PostfixCalculator {
    private Stack<Double> operandStack = new DoubleStack();
    private Map<String, Operator> operatorMap;

    public PostfixCalculator() {
        operatorMap.put("+", Add);
//        operatorMap.put("add", );
//        operatorMap.put("-", );
//        operatorMap.put("sub", );
//        operatorMap.put("*", );
//        operatorMap.put("mult", );
//        operatorMap.put("/", );
//        operatorMap.put("div", );
//        operatorMap.put("=", );
//        operatorMap.put("print", );
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
