public class Homework1 {
    public static void main(String[] args){
        System.out.println(Suma3(1,2,3));
        Coche miCoche = new Coche();
        miCoche.AumentarPuertas();
        System.out.println("El numero de puertas del coche es: " + miCoche.puertas);
    }
    public static int Suma3(int a, int b, int c){
        return a+b+c;
    }

}
class Coche{
    public int puertas = 0;

    public void AumentarPuertas(){
        this.puertas++;
    }
}
