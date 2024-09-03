public class TiposVariaveisUm {
    // Temos os tipos primitivos padrão.
    // Int - numero
    // byte, short, long
    public static void main(String[] args) {
        byte idade = 123;
        short ano = 2024;
        // int e long se começar com 0, deve ser usado outro tipo, provavel String.
        int cep = 12345678;
        long cpf = 12345678910L;
        float pi = 3.14F;
        double salarioMinimo = 1412.00;

        //casting é quando você atribui um valor primitivo à outro.
        int meuNumero = 9;
        double meuNumeroFavorito = meuNumero;

        // int dará 9, enquanto double será 9.0
    }
}
