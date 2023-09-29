public class Motor {
    double cilindraje=0;

    String combustible="";
    //se crea un Mètodo, este se usarà para definiri un comportamiento
 public double caballosFuerza (){
double cf=0;
if(combustible.equals("Disel")){
    cf=10.5;
}else {
    cf=5.2;
}
return  cf;
}






 }
