import java.util.LinkedList;

/**
 * @author Michael Servilla
 * @version date 2017-02-21
 */
public class DoubleStack implements Stack<Double> {
    LinkedList tmpList = new LinkedList();

    @Override
    public boolean isEmpty() {
        return tmpList.isEmpty();
    }

    @Override
    public void push(Double val) {
        tmpList.push(val);
    }

    @Override
    public Double pop() {
        return (Double) tmpList.pop();
    }

    @Override
    public Double peek() {
        return (Double) tmpList.peek();
    }
}
