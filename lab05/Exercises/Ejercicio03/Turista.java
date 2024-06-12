public class Turista{
    private String dni;
    private String nombres;
    private String apellidos;

    public Turista(int dni, String nombres, String apellidos){
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
    public String getNombres(){
        return nombres;
    }
    public String getApellidos(){
        return apellidos;
    }
    public int getDni(){
        return dni;
    }
    public String toString(){
        return "Turista ["+nombres + apellidos + ", DNI: " + dni + "]";
    }
}