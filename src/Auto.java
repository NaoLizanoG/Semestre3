//Creamos el modelo principal, en este caso el modelo de un auto
public class Auto {
    private int numeroRuedas=0;
    private String color="";
    private int puertas=0;

    //Se declaran los otros modleos usados dentro del modelo principal Auto
    private Motor motor;
    private Duenio duenio;

    //metodos
    public int getPuertas(){
         return puertas;
    }
    public void setPuertas(int puertas){
        this.puertas = puertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    public void imprimirColorPuertas(){
        System.out.println("El color del vehiculo es: "+color+" y el numero de puertas es es : "+puertas+"");
    }
}
