/**
 * Representa um Livro Físico, que herda as propriedades da classe Livro.
 */
public class LivroFisico extends Livro implements Promocional {

    /**
     * Construtor que inicializa o livro físico com o autor.
     *
     * @param autor Autor do livro
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

