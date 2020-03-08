package exerciciofinal;

/**
 *
 * @author amanda cleto
 */
public class Funcionario {
    private double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public double calculaImposto() {
        return this.getSalario();
    }
    
}
