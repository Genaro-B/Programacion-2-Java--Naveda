package EjemploDependencia;

public class Auto {
    void arrancar(Motor motor) {  // Usa Motor, pero no lo tiene como atributo
        motor.encender();          // -> DEPENDENCIA
        System.out.println("Auto en marcha");
    }
}
