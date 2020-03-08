package exerciciofinal;

/**
 *
 * @author amanda cleto
 */
public class ExercicioFinal {
    public static void main(String[] args) {
        Funcionario Raphael = new Gerente();
        Funcionario Leonardo = new Supervisor();
        Funcionario Donatello = new Atendente();
        
        //Set salary
        Raphael.setSalario(1000.0);
        Leonardo.setSalario(1000.0);
        Donatello.setSalario(1000.0);
        
        //print incomes
        System.out.println("O gerente Raphael paga: " + Raphael.calculaImposto() + " reais de imposto");
        System.out.println("O supervisor Leonardo paga: " + Leonardo.calculaImposto() + " reais de imposto");
        System.out.println("O donatello Donatello paga: " + Donatello.calculaImposto() + " reais de imposto");
    }
}
