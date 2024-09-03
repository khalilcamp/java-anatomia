public class MetodosUm {
    // Método deve ser nomeado com VERBO para facilitação.
    // Padrão camelCase, obviamente.

    abrirConexão(){};
    concluirProcessamento(){};
    findById(){};
    // Exemplos.
    // Separação de parametros por virgula.
    public double somarNumerosMesmo(int num1, int num2){
        // lógica completa.
        return ...;
    }
    // novamente, void já deixa claro que não irá retornar nada,
    // podendo ser redeclarado em uma instancia main para printar, se for o caso.
    // ele espera uma string.
    public void imprimir(String texto){
        // lógica aqui
    }
    // throw Exception: indica que o método pode gerar exceção/erro.
    public double dividir (int dividendo, int divisor) throws Exception{
        return divisor;

    }

    //private faz um método que não pode ser visto fora de sua própria classe.
    private void metodoPrivado(){
        // lógica
    }
}
