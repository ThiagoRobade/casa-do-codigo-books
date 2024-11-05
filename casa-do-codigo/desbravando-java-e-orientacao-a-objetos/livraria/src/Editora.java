/**
 * Representa uma Editora, responsável pela publicação de livros e revistas.
 * Contém informações básicas como nome fantasia, razão social e CNPJ.
 */
public class Editora {

    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;


    // Getters e Setters

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}

