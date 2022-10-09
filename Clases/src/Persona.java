public class Persona {
    protected String nombre;
    protected Character[] id;
    protected Integer edad;

    public Persona(String nombre, Character[] id, Integer edad) {
        this.nombre = nombre;
        if(id.length <= 12){
            this.id = id;
        }
        else{
            this.id = null;
            System.out.println("Rut no valido");
        }
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public Character[] getId() {
        return id;
    }

    public Integer getEdad() {
        return edad;
    }
}
