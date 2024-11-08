package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

/**
 * Representa um br.com.casadocodigo.livraria.produtos.Livro Físico, que herda as propriedades da classe br.com.casadocodigo.livraria.produtos.Livro.
 */
public class LivroFisico extends Livro implements Promocional {

    /**
     * Construtor que inicializa o livro físico com o autor.
     *
     * @param autor br.com.casadocodigo.livraria.Autor do livro
     */
    public LivroFisico(Autor autor) {
        super(autor);
    }

    /**
     * Calcula a taxa de impressão do livro, que é de 5% sobre o valor do livro.
     *
     * @return Valor da taxa de impressão
     */
    public double getTaxaImpressao() {
        return this.getValor() * 0.05;
    }
}

