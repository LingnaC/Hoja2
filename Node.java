/*Universidad del Valle de Guatemala
Algoritmos y estruccturas de datos
Linda Chen 23173
Isabella Obando 23074*/
public class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setData(T newData){
        data = newData;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}

