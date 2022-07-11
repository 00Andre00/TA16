package TA14;

public abstract class Persona {

    protected String nombre;
    protected String apellido;
    protected String fechaNacimiento;

    public Persona(String nombre, String apellido, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;

    }

    public String getNombres() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public abstract Integer calcularEdad();
}