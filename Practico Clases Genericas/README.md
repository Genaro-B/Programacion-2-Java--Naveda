# Trabajo Práctico N°1 - Clases Genéricas en Java

## Materia
**Laboratorio II – UTN FRM – Ciclo Lectivo 2023**

## Tema
**Clases Genéricas en Java**

## Descripción
Este trabajo práctico tiene como objetivo aplicar conceptos de programación genérica en Java, mediante la implementación de interfaces y clases genéricas, estructuras de datos personalizadas (como pilas), y el uso de comodines genéricos (`<? extends>` y `<? super>`) para gestionar listas de objetos.

Los ejercicios están organizados en paquetes separados y comprenden:

- Definición de una interfaz genérica para operaciones matemáticas.
- Implementación de una pila genérica usando arrays.
- Gestión de productos en un almacén usando clases genéricas con restricciones.
- Uso de comodines genéricos para trabajar con jerarquías de clases.

## Requisitos para ejecutar el proyecto

1. Tener instalado JDK 11 o superior.
2. Clonar este repositorio:
   ```bash
   git clone https://github.com/usuario/TP1-ClasesGenericas-Java.git
   cd TP1-ClasesGenericas-Java
   ```
3. Compilar los archivos `.java`:
   ```bash
   javac */*.java
   ```
4. Ejecutar la clase `Main` para probar los ejemplos:
   ```bash
   java ejercicio3.Main
   ```

---

## Conclusión

Durante el desarrollo de este trabajo práctico, pude afianzar los conceptos clave de las clases genéricas en Java. Comprendí cómo utilizar parámetros de tipo para crear código más reutilizable y seguro, especialmente al trabajar con estructuras de datos que deben funcionar con distintos tipos de objetos.

Me resultó muy útil implementar la pila genérica desde cero, ya que me obligó a pensar en cómo manejar internamente los arrays y cómo evitar errores de tipo. También entendí mejor cómo los comodines genéricos (`<? extends T>` y `<? super T>`) permiten mantener la flexibilidad en métodos que deben trabajar con jerarquías de clases.

Además, aprendí a organizar un proyecto en múltiples paquetes y a documentar correctamente el código para facilitar su mantenimiento y comprensión. Resolver este práctico me ayudó a consolidar la lógica de creación de objetos genéricos y a entender la importancia de las restricciones de tipo para evitar errores en tiempo de ejecución.

En definitiva, fue una experiencia muy enriquecedora que me dio más confianza para aplicar programación genérica en proyectos reales y para entender mejor cómo funciona la biblioteca de colecciones de Java.
