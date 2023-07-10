public class Homework2 {
    public static void main(String[] args){
    int numeroIf = 6;

    if(numeroIf > 0){
        System.out.println("El numero es positivo");
    } else if(numeroIf < 0){
        System.out.println("El numero es negativo");
    } else{
        System.out.println("El numero es cero");
    }

    int numeroWhile = 0;
    while(numeroWhile < 3){
        numeroWhile++;
        System.out.println(numeroWhile);
    }

    int numeroDoWhile = 0;
    do{
        System.out.println(numeroDoWhile);
    } while(numeroWhile == 0);

    for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
        System.out.println(numeroFor);
    }

    String estacion = "Verano";

    switch(estacion){
        case "Verano":
            System.out.println("Es verano");
            break;
        case "Invierno":
            System.out.println("Es invierno");
            break;
        case "Primavera":
            System.out.println("Es primavera");
            break;
        case "Otoño":
            System.out.println("Es otoño");
            break;
        default:
            System.out.println("No es una estacion");
    }

    }
}
