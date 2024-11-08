package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

/**
 * Representa um br.com.casadocodigo.livraria.produtos.Livro com informações básicas como nome, descrição, valor,
 * ISBN, autor e se é impresso. Implementa a interface br.com.casadocodigo.livraria.produtos.Produto, indicando que
 * um br.com.casadocodigo.livraria.produtos.Livro é um tipo de produto com métodos específicos definidos pela interface.
 */
public abstract class Livro implements Produto, Promocional {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    private boolean impresso;


    /**
     * Construtor que inicializa o livro com um autor e valores padrão
     * para ISBN e indicação de que o livro é impresso.
     *
     * @param autor br.com.casadocodigo.livraria.Autor do livro
     */
   public Livro(Autor autor) {
       this.autor = autor;
       this.isbn = "000-000-00000-00-0";
       this.impresso = true;
   }

    /**
     * Verifica se o livro possui um autor.
     *
     * @return true se o livro possui um autor, false caso contrário
     */
   boolean temAutor() {
       return this.autor != null;
   }


    /**
     * Exibe os detalhes do livro no console, incluindo nome, descrição, valor e ISBN.
     * Caso tenha um autor, também exibe seus detalhes.
     */
    public void mostarDetalhes() {
        System.out.println("Mostrando detalhes do livro");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);


        if (this.temAutor()) {
            autor.mostarDetalhes();
        }

        System.out.println("---\n");

        }

    /**
     * Aplica um desconto ao valor do livro. Este método deve ser sobrescrito
     * pelas classes filhas para definir uma lógica de desconto.
     *
     * @param porcentagem Percentual de desconto a ser aplicado
     * @return true se o desconto foi aplicado com sucesso, false caso contrário
     */
    public boolean aplicaDescontoDe(double porcentagem) {
      return false;
    }

    // Getters e Setters

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

}
