public class Empleado {

    public String nombre;
    public int puntosTrabajo;
    public int puntosActitud;


    public Empleado(String nombre, int puntosTrabajo, int puntosActitud){
        this.nombre = nombre;
        this.puntosTrabajo = puntosTrabajo;
        this.puntosActitud = puntosActitud;
    }

    public void evaluarDesempeno(){
        if (this.puntosTrabajo >= 80 && this.puntosActitud >= 80) {
            System.out.println("El desempeño de " +this.nombre +" es EXCELENTE");
        } else if (this.puntosTrabajo >= 70 && this.puntosTrabajo <80 && this.puntosActitud >= 70) {
            System.out.println("El desempeño de " +this.nombre +" es BUENO");
        } else if (this.puntosTrabajo < 70 && this.puntosActitud >= 70 ) {
            System.out.println("El desempeño de " +this.nombre +" es ACEPTABLE");
        } else if (this.puntosTrabajo < 70 && this.puntosActitud < 70) {
            System.out.println("El desempeño de " +this.nombre +" NECESITA MEJORA");
        }

    }





}
