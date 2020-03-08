package exerciciofinal;

/**
 *
 * @author amanda cleto
 */
public class Supervisor extends Funcionario {
    
    public double calculaImposto() {
        return this.getSalario() * 0.05;
    }
}
