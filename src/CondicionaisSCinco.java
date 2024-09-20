public class CondicionaisSCinco {
    public static void main(String[] args) {
        // A estrutura switch compara o valor de cada caso com o da variável sequencialmnete
        // Sempre encontra um valor correspondente e executa o código relacioando
        // ao caso.
        String sigla = "M";

        switch( sigla ){
            case "P":{
                System.out.println("Pequeno");
                break;
            }
            case "M":{
                System.out.println("Medio");
                break;
            }
            case "G":{
                System.out.println("Grande");
                break;
            }
            default:
                System.out.println("Indefinido");
        }
    }
}
