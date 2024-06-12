public class Calculadora<T extends Number> {
    private T operando1;
    private T operando2;

    public Calculadora(T op1, T op2) {
        operando1 = op1;
        operando2 = op2;
    }

    public T sumar() {
        if (operando1 instanceof Integer) 
            return (T) Integer.valueOf(operando1.intValue() + operando2.intValue());
        else if (operando1 instanceof Double) 
            return (T) Double.valueOf(operando1.doubleValue() + operando2.doubleValue());
        else 
            throw new IllegalArgumentException("Tipo de dato no soportado");
    }

    public T restar() {
        if (operando1 instanceof Integer) 
            return (T) Integer.valueOf(operando1.intValue() - operando2.intValue());
        else if (operando1 instanceof Double) 
            return (T) Double.valueOf(operando1.doubleValue() - operando2.doubleValue());
        else 
            throw new IllegalArgumentException("Tipo de dato no soportado");
    }

    public T multiplicar() {
        if (operando1 instanceof Integer) 
            return (T) Integer.valueOf(operando1.intValue() * operando2.intValue());
        else if (operando1 instanceof Double) 
            return (T) Double.valueOf(operando1.doubleValue() * operando2.doubleValue());
        else 
            throw new IllegalArgumentException("Tipo de dato no soportado");
    }
}
