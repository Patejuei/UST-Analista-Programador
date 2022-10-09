public class Electrodomestico {
    private int precioBase;
    private enum Color{
        BLANCO,
        NEGRO,
        ROJO,
        AZUL,
        GRIS
    }
    private enum Consumo{
        A,
        B,
        C,
        D,
        E,
        F
    }
    private Color color;
    private Consumo e_consume;
    private double peso;
    public Electrodomestico(){
        color = Color.BLANCO;
        e_consume = Consumo.F;
        precioBase = 100;
        peso = 5;
    }
    public Electrodomestico(int precio, double peso){
        this.precioBase = precio;
        this.peso = peso;
        e_consume = Consumo.F;
        color= Color.BLANCO;
    }

    public Electrodomestico(int precioBase, String color, char letra, double peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.e_consume = comprobarConsumoEnergetico(letra);
        this.peso = peso;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public Color getColor() {
        return color;
    }

    public Consumo getE_consume() {
        return e_consume;
    }

    public double getPeso() {
        return peso;
    }
    private Consumo comprobarConsumoEnergetico(char letra){
        switch (letra){
            case 'A':
                return Consumo.A;
            case 'B':
                return Consumo.B;
            case 'C':
                return Consumo.C;
            case 'D':
                return Consumo.D;
            case 'E':
                return Consumo.E;
            default:
                return Consumo.F;
        }
    }
    private Color comprobarColor(String color){
        switch (color.toLowerCase()){
            case "negro":
                return Color.NEGRO;
            case "rojo":
                return Color.ROJO;
            case "azul":
                return Color.AZUL;
            case "gris":
                return Color.GRIS;
            default:
                return Color.BLANCO;
        }
    }
    public int precioFinal(){
        int precioFinal = 0;
        switch (e_consume){
            case A:
                precioFinal = precioBase + 100;
                break;
            case B:
                precioFinal = precioBase + 80;
                break;
            case C:
                precioFinal = precioBase + 60;
                break;
            case D:
                precioFinal = precioBase + 50;
                break;
            case E:
                precioFinal = precioBase + 30;
                break;
            case F:
                precioFinal = precioBase + 10;
                break;
        }
        if(peso < 19 ){
                precioFinal += 10;}
        else if(20 < peso && peso < 49) {
            precioFinal += 50;
        }
        else if(50 < peso && peso < 79) {
            precioFinal += 80;
        }
        else {
                precioFinal += 100;
        }
        return precioFinal;
    }
}
class Lavadora extends Electrodomestico {
    double carga;

    public Lavadora() {
        carga = 5;
    }

    public Lavadora(int precio, double peso) {
        super(precio, peso);
        carga = 5;
    }

    public Lavadora(int precioBase, String color, char letra, double peso, double carga) {
        super(precioBase, color, letra, peso);
        this.carga = carga;
    }

    @Override
    public int precioFinal() {
        int precioFinal = super.precioFinal();
        if(carga > 30){
            precioFinal += 50;
        }
        return precioFinal;
    }
}

class Television extends Electrodomestico {
    int resolucion;
    boolean sintonizador_TDT;

    public Television() {
        resolucion = 20;
        sintonizador_TDT = false;
    }

    public Television(int precio, double peso) {
        super(precio, peso);
        resolucion = 20;
        sintonizador_TDT = false;
    }

    public Television(int precioBase, String color, char letra, double peso, int resolucion, boolean sintonizador_TDT) {
        super(precioBase, color, letra, peso);
        this.resolucion = resolucion;
        this.sintonizador_TDT = sintonizador_TDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizador_TDT() {
        return sintonizador_TDT;
    }

    @Override
    public int precioFinal(){
        int precioFinal = super.precioFinal();
        if(resolucion > 40){
            precioFinal *= 0.3;
        }
        if(sintonizador_TDT){
            precioFinal += 50;
        }
        return precioFinal;
    }

}