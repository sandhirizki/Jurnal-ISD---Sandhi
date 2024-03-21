import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Queuel<E> {
    private Queue<E> queueList;

    public Queuel() {
        queueList = new LinkedList<E>();
    }

    public void queued(E object) {
        queueList.add(object);
    }

    public E unqueue() throws NoSuchElementException {
        return queueList.remove();
    }

    public boolean isEmpty() {
        return queueList.isEmpty();
    }

    public E peek() {
        return queueList.peek();
    }

    public void printAll() {
        Iterator<E> iterator = queueList.iterator();
        while (iterator.hasNext()) {
            Object value = iterator.next();
            System.out.println(value + " ");
        }
    }
}