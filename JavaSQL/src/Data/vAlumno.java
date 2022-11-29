package Data;

public class vAlumno {
    private int id;
    private String nombre;
    private Integer N1;
    private Integer N2;
    private Integer N3;
    private String codigo;
    private Double promedio;
    private String condicion;
    //Constructor con todos los campos

    public vAlumno(int id, String nombre, Integer n1, Integer n2, Integer n3) {
        this.id = id;
        this.nombre = nombre;
        N1 = n1;
        N2 = n2;
        N3 = n3;
        this.promedio = (double) ((N1 + N2 + N3) / 3);
        if (promedio >= 40){
            this.condicion = "Aprobado";
        }
        else{
            this.condicion = "Reprobado";
        }
    }

    //Constructor en blanco

    public vAlumno() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPromedio() {
        return Double.toString(promedio);
    }

    public String getCondicion() {
        return condicion;
    }

    public String getN1() {
        return Integer.toString(N1);
    }

    public String getN2() {
        return Integer.toString(N2);
    }

    public String getN3() {
        return Integer.toString(N3);
    }

    public String getCodigo() {
        return codigo;
    }
}
