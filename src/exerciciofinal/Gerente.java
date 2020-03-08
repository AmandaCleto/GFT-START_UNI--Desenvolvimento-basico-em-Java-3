package exerciciofinal;

/**
 *
 * @author amanda cleto
 */
public class Gerente extends Funcionario {
    
    public double calculaImposto() {
        return this.getSalario() * 0.1;
    }
    
}
