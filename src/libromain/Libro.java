package libromain;

public class Libro {
    String ISBN;
    String Titulo;
    String Autor;
    
    static private int ejemplares = 0;
    
    public Libro(String ISBN, String Titulo, String Autor) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
    }
    
    private void prestar(){        
    }    
    
    private void recoger(){        
    }
    
    static private int incrementarEjemplares(){
        
        ejemplares=ejemplares+1;
        return ejemplares;
    }
    
    Libro(final Libro L){
        this.ISBN = L.ISBN;
        this.Titulo = L.Titulo;
        this.Autor = L.Autor;
    }
    @Override
        public String toString(){
            return("ISBN: " + ISBN + "\t Titulo: " + Titulo + "\t Autor: " + Autor + "\t\t Nº de ejemplares: " + incrementarEjemplares());
        }
    
    public static void main(String[] args){
        Libro L1 = new Libro("123","El color púrpura","Walker");
        Libro L2 = new Libro("123","El color púrpura","Walker");
        Libro L3 = new Libro(L1);
        Libro L4 = new Libro(L1);
        Libro L5 = new Libro(L1);
        
        System.out.println(L1.toString());
        System.out.println(L2.toString());
        System.out.println(L3.toString());
        System.out.println(L4.toString());
        System.out.println(L5.toString());
    }
    
}
