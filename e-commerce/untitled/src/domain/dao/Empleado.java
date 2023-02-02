package domain.dao;

public class Empleado {
    private int id;
    private String nombre;
    private int idJefe;

    public Empleado() {
    }

    public Empleado(int id, String nombre, int idJefe) {
        this.id = id;
        this.nombre = nombre;
        this.idJefe = idJefe;
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

    public int getIdJefe() {
        return idJefe;
    }

    public void setIdJefe(int idJefe) {
        this.idJefe = idJefe;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", idJefe=" + idJefe +
                '}';
    }


}
