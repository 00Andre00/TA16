package TA14;

public class User extends Persona{

    protected int año;
    protected int mes;
    protected int dia;

    public User(String nombre, String apellido, String fechaNacimiento) {
        super(nombre, apellido,fechaNacimiento);
    }

    public void setAño(int año) {
        this.año = año;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }

    public Integer calcularEdad() {

        int edad;
        edad = 2022 - año;
        if( mes > 6 ||( mes == 6 && dia > 30))
            edad = edad - 1;
        System.out.println("Edad: " + edad);
        return edad;
        
    }

}