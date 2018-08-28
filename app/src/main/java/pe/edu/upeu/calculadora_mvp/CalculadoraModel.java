package pe.edu.upeu.calculadora_mvp;

public class CalculadoraModel implements Main.Model{
    private Main.Presentador presentador;

    public CalculadoraModel(Main.Presentador presentador){
        this.presentador = presentador;
    }

    @Override
    public void calcularSuma(String op1, String op2) {
        int suma = 0;
            if(!op1.equals((""))&&!op2.equals((""))){

                int x = Integer.valueOf(op1);
                int y = Integer.valueOf(op2);
                suma = x+y;
                presentador.mostrarResultado(String.valueOf(suma));
            }
            else {
            }
    }

    @Override
    public void calcularResta(String op1, String op2) {
        int resta = 0;
        if(!op1.equals((""))&&!op2.equals((""))){

            int x = Integer.valueOf(op1);
            int y = Integer.valueOf(op2);
            resta = x-y;
            presentador.mostrarResultado(String.valueOf(resta));
        }
        else {
        }
    }

    @Override
    public void calcularMultiplicacion(String op1, String op2) {
        int multi = 0;
        if(!op1.equals((""))&&!op2.equals((""))){

            int x = Integer.valueOf(op1);
            int y = Integer.valueOf(op2);
            multi = x*y;
            presentador.mostrarResultado(String.valueOf(multi));
        }
        else {
        }
    }

    @Override
    public void calcularDivision(String op1, String op2) {
        int divi = 0;
        if(!op1.equals((""))&&!op2.equals((""))){

            int x = Integer.valueOf(op1);
            int y = Integer.valueOf(op2);
            divi = x/y;
            presentador.mostrarResultado(String.valueOf(divi));
        }
        else {
        }
    }
}
