# GFT-START_UNI
## Características da linguagem II  
### 6 - Orientação a Objetos com Java > Encapsulamento, Herança e Polimorfismo - Exercício Final

***

### Programas
Programa usado: Netbeans ID 8.0.1  

Motivo da escolha: Por se tratar de um exercício simples, ao invés de usar a IntelliJ IDEA, preferi usar o Netbeans, por ser mais rápido e prático.  

### Exercício Final  
Vamos pensar em um cenário onde temos Funcionários. Esses funcionários podem ser: Gerente, Supervisor e Atendente. Cada tipo de funcionário desses tem políticas diferentes de impostos:  

- Gerente paga 0.1% do salário;
- Superfisor paga 0.05% do salário;
- Atendente paga 0.01% do salário.  

Monte um modelo que atenda esse cenário.  

Resolução:  
Crie a classe Funcionário que será a classe mais genérica, e portanto, pai das demais. Nessa classe, crie o atributo salário e os métodos, setSalario, getSalario e calculaImposto, este, por sua vez, retornará o salário do funcionário.  
Crie as classes Atendente, Gerente e Supervisor, em cada uma dessas classes, crie o método calculaImposto, e para cada método retorne o imposto calculado de acordo com as regras estabelecidas no enunciado do Exercício.