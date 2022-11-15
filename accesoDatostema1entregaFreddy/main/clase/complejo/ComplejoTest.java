
package main.clase.complejo;
public class ComplejoTest {

    public static void main(String[] args) {
        Complejo complejo =  new Complejo(0.0, 0.0);
        System.out.println(complejo.toString());
        complejo.asignar(5, 8);
        System.out.println(complejo.toString());

    }
    
}