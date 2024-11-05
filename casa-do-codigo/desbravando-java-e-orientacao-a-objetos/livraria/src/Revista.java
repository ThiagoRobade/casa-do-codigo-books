/**
 * Representa uma Revista com informações básicas como nome, descrição, valor
 * e a editora responsável. Implementa a interface Promocional, permitindo que
 * descontos sejam aplicados ao valor da revista.
 */
public class Revista implements Produto, Promocional {

    private String nome;
    private String descricao;
    private double valor;
    private Editora editora;

    /**
     * Aplica um desconto ao valor da revista. O desconto máximo permitido é de 10%.
     *
     * @param porcentagem Percentual de desconto a ser aplicado
     * @return true se o desconto foi aplicado com sucesso, false se o desconto ultrapassa 10%
     */
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.1) {
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        return true;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }
}
