import java.util.*;

/**
 * Postfix calculator class. Takes double values from the command line,
 * evaluates and performs the entered operations (add, subtract, multiply, and
 * divide).
 * @author Michael Servilla
 * @version date 2017-02-21
 */
public class PostfixCalculator {
    private Stack<Double> operandStack = new DoubleStack();

    //Creates map variable to hold input operator keys, and associated values.
    private Map<String, Operator> operatorMap = new HashMap<>();

    //Constructor that builds map.
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

    /**
     * Method to build operand stack (LinkedList) of Double values from CLI.
     * @param operand Operands are entered through scanner by CLI.
     */
    public void storeOperand(double operand) {
        operandStack.push(operand);
    }

    /**
     * Method to evaluate entered operator, call the associated map values, and
     * perform associated operations on operands taken from operandStack.
     * @param operator Operator is entered through scanner by CLI.
     */
    public void evalOperator(String operator) {
        List<Double> tmpOperands = new ArrayList<>(); //Creates temporary list.
        //Error checking for illegal input and empty list.
        if (operatorMap.containsKey(operator) && !operandStack.isEmpty()) {
            Operator testOp = operatorMap.get(operator);
            for (int i = 0; i < testOp.numArgs(); i++) {
                tmpOperands.add(i, operandStack.pop());
            }
            operandStack.push(testOp.eval(tmpOperands));
            } else if (!(operatorMap.containsKey(operator)) ||
                    operandStack.isEmpty()) {
            System.out.println("I do not understand your input! :)");
            }
    }

    public class Add implements Operator {
        /**
         * Method to return number of arguments to be popped off operandStack.
         * @return Returns int number of arguments.
         */
        @Override
        public int numArgs() {
            return 2;
        }

        /**
         * Method to perform operation.
         * @param args Argument list.
         * @return Returns double results of operation.
         */
        @Override
        public double eval(List<Double> args) {
            return (args.get(0) + args.get(1));
        }
    }
    public class Subtract implements Operator {
        /**
         * Method to return number of arguments to be popped off operandStack.
         * @return Returns int number of arguments.
         */
        @Override
        public int numArgs() {
            return 2;
        }
        /**
         * Method to perform operation.
         * @param args Argument list.
         * @return Returns double results of operation.
         */
        @Override
        public double eval(List<Double> args) {
            return (args.get(1) - args.get(0));
        }
    }
    public class Multiply implements Operator {
        /**
         * Method to return number of arguments to be popped off operandStack.
         * @return Returns int number of arguments.
         */
        @Override
        public int numArgs() {
            return 2;
        }
        /**
         * Method to perform operation.
         * @param args Argument list.
         * @return Returns double results of operation.
         */
        @Override
        public double eval(List<Double> args) {
            return (args.get(0) * args.get(1));
        }
    }
    public class Divide implements Operator {
        /**
         * Method to return number of arguments to be popped off operandStack.
         * @return Returns int number of arguments.
         */
        @Override
        public int numArgs() {
            return 2;
        }
        /**
         * Method to perform operation.
         * @param args Argument list.
         * @return Returns double results of operation.
         */
        @Override
        public double eval(List<Double> args) {
            if (args.get(0) == 0) {
                System.out.println("Attempting to divide by 0!");
            }
            return (args.get(1) / args.get(0));
        }
    }
    public class Print implements Operator {
        /**
         * Method to return number of arguments to be popped off operandStack.
         * @return Returns int number of arguments.
         */
        @Override
        public int numArgs() {
            return 1;
        }
        /**
         * Method to perform operation, print out top value on operandStack.
         * @param args Argument list.
         * @return Returns double results of operation.
         */
        @Override
        public double eval(List<Double> args) {
            System.out.println(args.get(args.size() - 1));
            return args.get(args.size() - 1);
        }
    }
}
