import java.util.*;
public class RegistroAduanas {
    private ArrayList<Turista> turistas = new ArrayList<>();

    public void addTurista(Turista tur){
        turistas.add(tur);
    }
    public void showTuristas(){
        for (Turista turista: turistas){
            System.out.println(turista);
        }
    }
    public static void main(String[] args) {
        RegistroAduanas registro = new RegistroAduanas();
        Scanner sc = new Scanner(System.in);
        String continuar = "si";

        while (continuar.equals("si")) {
            System.out.print("Ingrese el nombre del turista: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese los apellidos del turista: ");
            String apellidos = sc.nextLine();
            System.out.print("Ingrese el documento de identidad del turista: ");
            String documentoIdentidad = sc.nextLine();

            if (esAlfanumerico(documentoIdentidad)) {
                registro.addTurista(new Turista(documentoIdentidad, nombre, apellidos ));
                System.out.println("Turista registrado correctamente.");
            } else {
                System.out.println("Documento de identidad inválido. Debe ser numérico o alfanumérico.");
            }

            System.out.print("¿Desea registrar otro turista? (si/no): ");
            continuar = sc.nextLine();
        }

        System.out.println("\nTuristas registrados:");
        registro.showTuristas();

    }
}
