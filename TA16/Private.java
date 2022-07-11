package TA14;

public class Private {

    private int dni;
    private int celular;
    private String ocupacion;

    public Private(int dni, int celular, String ocupacion) {
        this.dni = dni;
        this.celular = celular;
        this.ocupacion = ocupacion;
    }
    public int getDni() {
        return dni;
    }
    public int getCelular() {
        return celular;
    }
    public String getOcupacion() {
        return ocupacion;
    }
}