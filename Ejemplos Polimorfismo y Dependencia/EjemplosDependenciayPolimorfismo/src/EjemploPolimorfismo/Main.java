package EjemploPolimorfismo;

public class Main {
    public static void main(String[] args) {
        Animal Generico=new Animal();
        Perro p1=new Perro();
        Gato g1=new Gato();
        //Animal hace su sonido=
        Generico.hacerSonido();
        //Perro hace su sonido=
        p1.hacerSonido();
        //Gato hace su sonido=
        g1.hacerSonido();
    }
}
