package EjemploDependencia;

public class Main {
    public static void main(String[] args) {
        Auto a1=new Auto();
        Motor m1=new Motor();
        a1.arrancar(m1);
    }
}
