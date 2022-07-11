package TA14;

public class Main {

    public static void main(String[] args){

        User user = new User("André","Panduro Moscoso","17/05/2003");
        Ubicacion ubicacion = new Ubicacion("Perú","Huánuco");
        Private x = new Private(72728129,923123193,"Universitario");
        RedSocial redsocial = new RedSocial("Facebook");

        System.out.println ("\n"); 
        System.out.println("Se esta registrando en "+redsocial.getApp());

        System.out.println("----Usuario-----------");
        System.out.println("Nombre: "+user.getNombres());
        System.out.println("Apellido: "+user.getApellido());
        System.out.println("Fecha de Nacimiento: "+user.getFechaNacimiento());
        user.setDia(17);
        user.setMes(05);
        user.setAño(2003);
        user.calcularEdad();

        System.out.println("----Ubicacion---------");
        System.out.println("Pais: "+ubicacion.getPais());
        System.out.println("Ciudad: "+ubicacion.getCiudad());

        System.out.println("----Datos privados----");
        System.out.println("Dni: "+x.getDni());
        System.out.println("Celular: "+x.getCelular());
        System.out.println("Ocupacion: "+x.getOcupacion());
        System.out.println("Estos datos son privados solo tu los puedes visualizar");
        System.out.println ("\n");
    }

}