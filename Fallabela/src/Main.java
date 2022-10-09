
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner entry = new Scanner(System.in);
        int lav_price = 0;
        int tel_price = 0;
        int ele_price = 0;
        Electrodomestico[] electrodomesticos = {new Electrodomestico(600,50), new Lavadora(300,20), new Television(500,10), new Electrodomestico(300,"azul",'A',200)};

        for (Electrodomestico electrodomestico : electrodomesticos) {
            if (electrodomestico instanceof Lavadora) {
                lav_price += electrodomestico.precioFinal();
            } else if (electrodomestico instanceof Television) {
                tel_price += electrodomestico.precioFinal();
            }
            ele_price += electrodomestico.precioFinal();
        }
        System.out.println(String.format("Precio final de los electrodomesticos: %d €\nPrecio final de lavadoras: %d €\nPrecio final de televisores: %d €", ele_price, lav_price, tel_price));

    }
}