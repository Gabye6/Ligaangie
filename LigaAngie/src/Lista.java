import static java.awt.SystemColor.info;

public class Lista<T> {

    private Nodo<T> content;

    public void insert(T info) {
        this.content.insert(info);
    }

    public void get(String n) {
        this.content.getT(n);
    }

    public void buscar(int n) {

    }

    public void swap(T info) {

    }
}
