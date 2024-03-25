public class fazerConexao {
    public String fazerConexao(String cep){
        String endereco ="viacep.com.br/ws/" + cep + "/json/";
        return endereco;
    }
}
