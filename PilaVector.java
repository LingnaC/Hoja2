import java.util.Vector;

public class PilaVector<T> implements Pila<T> {
    private Vector<T> vector;

    public PilaVector() {
        this.vector = new Vector<>();
    }

    @Override
    public void push(T item) {
        vector.add(item);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Pila vacía");
        }
        return vector.remove(vector.size() - 1);
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Pila vacía");
        }
        return vector.get(vector.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return vector.isEmpty();
    }
}

