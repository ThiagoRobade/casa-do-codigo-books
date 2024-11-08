package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

/**
 * Representa um br.com.casadocodigo.livraria.produtos.Ebook, um tipo de br.com.casadocodigo.livraria.produtos.Livro digital.
 * Implementa a interface br.com.casadocodigo.livraria.produtos.Promocional, permitindo que descontos sejam aplicados ao valor do br.com.casadocodigo.livraria.produtos.Ebook.
 */
public class Ebook extends Livro implements Produto, Promocional {

    private String waterMark;

    /**
     * Construtor que inicializa o br.com.casadocodigo.livraria.produtos.Ebook com o autor.
     *
     * @param autor br.com.casadocodigo.livraria.Autor do livro
     */
    public Ebook(Autor autor) {
        super(autor);
    }

    /**
     * Aplica um desconto ao br.com.casadocodigo.livraria.produtos.Ebook, com limite máximo de 15%.
     *
     * @param porcentagem Percentual de desconto a ser aplicado
     * @return true se o desconto foi aplicado com sucesso, false se o desconto ultrapassa 15%
     */
    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.15) {
            return false;
        }
        return super.aplicaDescontoDe(porcentagem);
    }

    /**
     * Obtém a marca d'água (watermark) do br.com.casadocodigo.livraria.produtos.Ebook.
     *
     * @return Marca d'água do br.com.casadocodigo.livraria.produtos.Ebook
     */
    public String getWaterMark() {
        return waterMark;
    }

    /**
     * Define a marca d'água (watermark) do br.com.casadocodigo.livraria.produtos.Ebook.
     *
     * @param waterMark Marca d'água do br.com.casadocodigo.livraria.produtos.Ebook
     */
    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
}
