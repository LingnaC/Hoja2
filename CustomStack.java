/*Universidad del Valle de Guatemala
Algoritmos y estruccturas de datos
Linda Chen 23173
Isabella Obando 23074*/
import java.util.EmptyStackException;

public class CustomStack<T> {
    private Node<T> lastNode;
    private Node<T> firstNode;

    public void push(T value){
        if(lastNode == null){
            lastNode = new Node<T> (value);
            firstNode = lastNode;
        }else{
            Node<T> current = new Node<T>(value);
            current.setNext(firstNode);
            firstNode = current;
        }
    }

    public T pop(){
        
        if(firstNode != null){
            T data = firstNode.getData();
            firstNode = firstNode.getNext();
            return data;
        }
        throw new EmptyStackException();
    }
}
