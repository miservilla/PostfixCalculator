import java.util.LinkedList;

/** Class that is used to build LinkedList, implements Stack<Double> interface.
 * Input using scanner from CLI, stored as Double type.
 * @author Michael Servilla
 * @version date 2017-02-21
 */
public class DoubleStack implements Stack<Double> {
    LinkedList tmpList = new LinkedList();

    /**
     * Method to check if stack is empty.
     * @return Returns true if empty.
     */
    @Override
    public boolean isEmpty() {
        return tmpList.isEmpty();
    }

    /**
     * Method to push element to the stack.
     * @param val Element is entered by CLI.
     */
    @Override
    public void push(Double val) {
        tmpList.push(val);
    }

    /**
     * Method to pop element off of stack.
     * @return Returns Double value.
     */
    @Override
    public Double pop() {
        return (Double) tmpList.pop();
    }

    /**
     * Method to look at element at the top of the stack.
     * @return Returns Double value.
     */
    @Override
    public Double peek() {
        return (Double) tmpList.peek();
    }

    /**
     * Method to obtain the size of the list.
     * @return Return list size as an int.
     */
    public int size() {
        return tmpList.size();
    }
}
