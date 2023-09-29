//Se debe evitar usar caracteres especiales como la ñ
public class Duenio {
    String nombre="";
    int edad=0;
    String domicilio="";
    String cedula="";
    char genero;

    //se crea un Mètodo, este se usarà para definiri un comportamiento
    public String capacidadManejar(){
        String a="";
        if (edad<18){
            a="No es mayor de edad, no puede ,manejar";
            System.out.println(a);
    }
        else {
            a="Puede manejar";
            System.out.println(a);
        }
        return a;
        }
    }

