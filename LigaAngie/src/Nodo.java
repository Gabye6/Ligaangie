public class Nodo<T>{
    
    T info;
    Nodo<T>next;
    Nodo<T>prev;
    int n=1;
    
    public Nodo(T info){
        this.info=info;
    }
    
    public void insert (T info){
        if (this.info== null){
            this.next= new Nodo(info);
            this.next.prev= this;
            this.next.n=this.n+1;
          }else{  
            this.next.insert(info);
        }
    }
    
    public T getT(String a) {
        if (info.toString().equals(n)) {
            return this.info;
        } else {
            return null;
        }
    }
    public void buscar(int n) {
        }
       public void swap(T info) {
} 
}



