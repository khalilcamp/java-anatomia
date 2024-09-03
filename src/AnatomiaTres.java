public class AnatomiaTres {

    // Variaveis em Java possuem a seguinte estrutura:
    // Tipo Nome = Atribuição (opcional)
    // Declarar métodos é algo ainda mais fácil.
    // TipoRetorno NomeObjetivo Parametro(s)
    // por exemplo...
    public static void main(String[] args) {
        int numeroUm = 1;
        int numeroDois = 2;
        int somarNumeros = numeroUm + numeroDois;
        System.out.println(somarNumeros);
    };

    // int somar (int numeroUm, int numeroDois);
    // String formatarCep (long cep);

    // Abaixo, um método simples com declarações de variáveis. 
    // Use com main ou rode apeans essa aprte.
    public static void nomesInteiros(String[] args) {
        String primeiroNome = "João";
        String segundoNome = "Silva";
        // chamamos o método para seu retorno.
        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat("").concat(segundoNome);
    }

}
