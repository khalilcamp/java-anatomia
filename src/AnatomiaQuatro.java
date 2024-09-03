public class AnatomiaQuatro {
    // Identação.
    // Escrever o código de forma hierarquica, fácil de entendimento.
    // Sem baguncinha no código. Ele vai ficar bonito.
    // Famosa bagunça de tudo na mesma linha.
    public static void main(String[] args) {
        // ISSO é um código sem indentar.
        int mediaFinal = 6;
        if (mediaFinal<6)
        System.out.println("Reprovado");
        else if(mediaFinal==6)
        System.out.println("Recuperação");
        else
        System.out.println("Aprovado!");
        // ISSO é indentação.
        // Separação por fluxos.
        if (mediaFinal<6)
            System.out.println("Reprovado");
        else if(mediaFinal==6)
            System.out.println("Recuperação");
        else
            System.out.println("Aprovado!");
    }

}
