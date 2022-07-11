package TA14;

public class Ubicacion {

    private String pais;
    private String ciudad;

    public Ubicacion(String pais, String ciudad) {
        this.pais = pais;
        this.ciudad = ciudad;
    }
    public String getPais() {
        return pais;
    }
    public String getCiudad() {
        return ciudad;
    }
}