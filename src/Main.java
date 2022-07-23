public class Main {
    //Definicion de funcion
    public static void suma (int a, int b, int c){
        int resultado;
        resultado= a+b+c;
        System.out.println("La suma es " + resultado);
    }

    //Invocacion de funcion

    public static void main(String[] args) {
        suma(2, 3, 4);
        suma(-5, 5, 0);

    //Creacion de objeto (miCoche)

        Coche miCoche = new Coche();

        miCoche.incrementarPuertas();
        System.out.println("El numero de puertas incrementado es: " + miCoche.numeroDePuertas);
        miCoche.incrementarPuertas();
        System.out.println("El numero de puertas incrementado es: " + miCoche.numeroDePuertas);
    }

   }
class Coche {
    public int numeroDePuertas = 4;
    public void incrementarPuertas(){
        this.numeroDePuertas++;
    }
}
