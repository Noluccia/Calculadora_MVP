package pe.edu.upeu.calculadora_mvp;

public interface Main {
    public interface Vista{
        public void mostrarResultado(String r);
    }
    public interface Presentador{
        public void mostrarResultado(String r);
        public void calcularSuma(String op1, String op2);
        public void calcularResta(String op1, String op2);
        public void calcularMultiplicacion(String op1, String op2);
        public void calcularDivision(String op1, String op2);
    }
    public interface Model{
        public void calcularSuma(String op1, String op2);
        public void calcularResta(String op1, String op2);
        public void calcularMultiplicacion(String op1, String op2);
        public void calcularDivision(String op1, String op2);
    }
}
