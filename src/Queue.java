/**
 * This should be a queue
 * Created 2020-02-14
 *
 * @author Magnus Silverdal
 */
public class Queue {
    LinkedList queue;

    public Queue() {
        queue = new LinkedList();
    }

    public void enqueue(String text) {
        queue.addLast(new Node (text));
    }

    public String dequeue() {
        String text = queue.first.data;
        queue.removeFirst();
        return text;
    }

    public boolean isEmpty() {
        return false;
    }

    public int size() {
        return -1;
    }
}
