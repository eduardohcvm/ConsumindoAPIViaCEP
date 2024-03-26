import com.google.gson.annotations.SerializedName;

public class Endereco implements Comparable<Endereco> {
    @SerializedName("cep")
    private String cep;
    @SerializedName("logradouro")
    private String logradouro;
    private String complemento;
    private String bairro;

    @SerializedName("localidade")
    private String cidade;
    private String uf;
    private int gia;
    private int ddd;
    private int siafi;

    public int getSiafi() {
        return siafi;
    }
    public Endereco(EnderecoViaCep meuEnderecoViaCEP){
        this.bairro = meuEnderecoViaCEP.bairro();
        this.ddd = meuEnderecoViaCEP.ddd();
        this.cep = meuEnderecoViaCEP.cep();
        this.gia = meuEnderecoViaCEP.gia();
        this.cidade = meuEnderecoViaCEP.localidade();
        this.bairro = meuEnderecoViaCEP.bairro();
        this.complemento = meuEnderecoViaCEP.complemento();
        this.logradouro = meuEnderecoViaCEP.logradouro();
        this.siafi = meuEnderecoViaCEP.siafi();
        this.uf = meuEnderecoViaCEP.uf();
    }

    public void setSiafi(int siafi) {
        this.siafi = siafi;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public int compareTo(Endereco o) {
        return 0;
    }
}
