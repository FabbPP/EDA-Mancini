import java.util.*;
public class CalculadoraTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer operador: ");
        String input1 = sc.nextLine();
        System.out.print("Ingrese el signo de la operación (+, -, *): ");
        String operador = sc.nextLine();
        System.out.print("Ingrese el segundo operador: ");
        String input2 = sc.nextLine();

        Number num1, num2;
        boolean esEntero = true;

        try {
            num1 = Integer.parseInt(input1);
            num2 = Integer.parseInt(input2);
        } 
        catch (NumberFormatException e) {
            esEntero = false;
            num1 = Double.parseDouble(input1);
            num2 = Double.parseDouble(input2);
        }

        if (esEntero) {
            Calculadora<Integer> calc = new Calculadora<>((Integer) num1, (Integer) num2);
            ejecutarOperacion(calc, operador);
        } 
        else {
            Calculadora<Double> calc = new Calculadora<>((Double) num1, (Double) num2);
            ejecutarOperacion(calc, operador);
        }
    }

    private static <T extends Number> void ejecutarOperacion(Calculadora<T> calc, String operador) {
        switch (operador) {
            case "+":
                System.out.println("Resultado: " + calc.sumar());
                break;
            case "-":
                System.out.println("Resultado: " + calc.restar());
                break;
            case "*":
                System.out.println("Resultado: " + calc.multiplicar());
                break;
            default:
                System.out.println("Operador no válido.");
                break;
        }
    }
}