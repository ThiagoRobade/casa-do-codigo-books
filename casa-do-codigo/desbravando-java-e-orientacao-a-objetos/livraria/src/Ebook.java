/**
 * Representa um Ebook, um tipo de Livro digital.
 * Implementa a interface Promocional, permitindo que descontos sejam aplicados ao valor do Ebook.
 */
public class Ebook extends Livro implements Produto, Promocional {

    private String waterMark;

    /**
     * Construtor que inicializa o Ebook com o autor.
     *
     * @param autor Autor do livro
     */
    public Ebook(Autor autor) {
        super(autor);
    }

    /**
     * Aplica um desconto ao Ebook, com limite máximo de 15%.
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
     * Obtém a marca d'água (watermark) do Ebook.
     *
     * @return Marca d'água do Ebook
     */
    public String getWaterMark() {
        return waterMark;
    }

    /**
     * Define a marca d'água (watermark) do Ebook.
     *
     * @param waterMark Marca d'água do Ebook
     */
    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
}
