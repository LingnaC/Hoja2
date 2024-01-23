/*Universidad del Valle de Guatemala
Algoritmos y estruccturas de datos
Linda Chen 23173
Isabella Obando 23074*/
public interface Pila<T> {
    void push(T item);
    T pop();
    T peek();
    boolean isEmpty();
}

