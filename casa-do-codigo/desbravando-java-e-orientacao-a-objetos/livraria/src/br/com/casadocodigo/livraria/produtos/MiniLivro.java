package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

/**
 * Representa um br.com.casadocodigo.livraria.produtos.MiniLivro, que herda as propriedades da classe br.com.casadocodigo.livraria.produtos.Livro.
 * MiniLivros não permitem a aplicação de desconto.
 */
public class MiniLivro extends Livro {

    /**
     * Construtor que inicializa o br.com.casadocodigo.livraria.produtos.MiniLivro com o autor.
     *
     * @param autor br.com.casadocodigo.livraria.Autor do livro
     */
    public MiniLivro(Autor autor) {
        super(autor);
    }

    /**
     * Impede a aplicação de qualquer desconto para br.com.casadocodigo.livraria.produtos.MiniLivro.
     *
     * @param porcentagem Percentual de desconto solicitado
     * @return false indicando que o desconto não é aplicado
     */
    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        return false;
    }
}

