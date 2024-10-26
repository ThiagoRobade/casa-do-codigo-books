/**
 * Representa um MiniLivro, que herda as propriedades da classe Livro.
 * MiniLivros não permitem a aplicação de desconto.
 */
public class MiniLivro extends Livro {

    /**
     * Construtor que inicializa o MiniLivro com o autor.
     *
     * @param autor Autor do livro
     */
    public MiniLivro(Autor autor) {
        super(autor);
    }

    /**
     * Impede a aplicação de qualquer desconto para MiniLivro.
     *
     * @param porcentagem Percentual de desconto solicitado
     * @return false indicando que o desconto não é aplicado
     */
    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        return false;
    }
}

