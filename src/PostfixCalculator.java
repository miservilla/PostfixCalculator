import java.util.*;

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
        List<Double> tmpOperands = new ArrayList<>();
        if (operatorMap.containsKey(operator)) {
            Operator testOp = operatorMap.get(operator);
            for (int i = 0; i < testOp.numArgs(); i++) {
                tmpOperands.add(i, operandStack.pop());
            }
            operandStack.push(testOp.eval(tmpOperands));
        } else if (!(operatorMap.containsKey(operator))) {
            System.out.println("I do not understand your input :(|)");
        }
    }

    public class Add implements Operator {

        @Override
        public int numArgs() {
            return 2;
        }

        @Override
        public double eval(List<Double> args) {
            return (args.get(0) + args.get(1));
        }
    }
    public class Subtract implements Operator {

        @Override
        public int numArgs() {
            return 2;
        }

        @Override
        public double eval(List<Double> args) {
            return (args.get(1) - args.get(0));
        }
    }
    public class Multiply implements Operator {

        @Override
        public int numArgs() {
            return 2;
        }

        @Override
        public double eval(List<Double> args) {
            return (args.get(0) * args.get(1));
        }
    }
    public class Divide implements Operator {

        @Override
        public int numArgs() {
            return 2;
        }

        @Override
        public double eval(List<Double> args) {
            if (args.get(0) == 0) {
                System.out.println("Attempting to divide by 0!");
            }
            return (args.get(1) / args.get(0));
        }
    }
    public class Print implements Operator {

        @Override
        public int numArgs() {
            return 1;
        }

        @Override
        public double eval(List<Double> args) {
            System.out.println(args.get(args.size() - 1));
            return args.get(args.size() - 1);
        }
    }
}
