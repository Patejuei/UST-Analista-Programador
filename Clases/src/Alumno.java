import java.util.Arrays;

public class Alumno extends Persona{
    private final String[] materia;
    private Integer[] nota;

    public Alumno(String nombre, Character[] id, Integer edad, Integer[] nota) {
        super(nombre, id, edad);
        materia = new String[]{"POO", "EI", "Al", "DB", "DS", "EL"};
        this.nota = nota;
    }

    public String[] getMateria() {
        return materia;
    }

    public Integer[] getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "materia=" + Arrays.toString(materia) +
                ", nota=" + Arrays.toString(nota) +
                ", nombre='" + nombre + '\'' +
                ", id=" + Arrays.toString(id) +
                ", edad=" + edad +
                '}';
    }
}
