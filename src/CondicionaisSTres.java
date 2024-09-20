public class CondicionaisSTres {
    // Encadeadas serve para mais do que apenas 2 resultados if else.
    public static void main(String[] args) {
        
        int nota = 6;

        if(nota >= 7){
            System.out.println("Aprovado");
            // Maior ou igual a 5 e menor que 7
        } else if(nota>=5 && nota<7 ){
            System.err.println("Recuperação");
        }
        else {
            System.out.println("Reprovado");
        }

    }
}
