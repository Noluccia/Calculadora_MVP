package pe.edu.upeu.calculadora_mvp;

public class CalculadoraPresentador implements Main.Presentador{
    private Main.Model model;
    private Main.Vista vista;
    public CalculadoraPresentador(Main.Vista vista){
        this.vista = vista;
        model = new CalculadoraModel(this);
    }
    @Override
    public void mostrarResultado(String r) {
        if(vista!=null){
            vista.mostrarResultado(r);
        }
    }

    @Override
    public void calcularSuma(String op1, String op2) {
        if(vista!=null){
            model.calcularSuma(op1, op2);
        }
    }

    @Override
    public void calcularResta(String op1, String op2) {
        if(vista!=null){
            model.calcularResta(op1, op2);
        }
    }

    @Override
    public void calcularMultiplicacion(String op1, String op2) {
        if(vista!=null){
            model.calcularMultiplicacion(op1, op2);
        }
    }

    @Override
    public void calcularDivision(String op1, String op2) {
        if(vista!=null){
            model.calcularDivision(op1, op2);
        }
    }

}
