package exerciciofinal;

/**
 *
 * @author amanda cleto
 */
public class Atendente extends Funcionario {
    
    public double calculaImposto() {
        return this.getSalario() * 0.01;
    }
}
