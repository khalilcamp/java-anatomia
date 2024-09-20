public class CondicionaisSUm {
    //Condicionais simples justamente servem para vermos de uma condição é verdadeira ou falsa.
    // Apeans ocorre uma validação de fluxo quando a condição for positiva.
    // Exemplo:
        public static void main(String[] args){
            // Execução SIMPLES
            double saldo = 25.0;
            double valorSolicitado = 17.0;

            // SE o saldo for menor do que o valor solicitado, o que está abaixo
            // é executado.
            // Do contrário, nada rola.
            if (valorSolicitado < saldo)
                saldo = saldo - valorSolicitado;
                // Criando um complexo
            else 
                System.out.println("Saldo insuficiente");
            // Caso seja verdadeira, ele passa o próximo comando.
            System.out.println(saldo);

        }

}
