public class CarrinhoDeCompras {

    private double total;

    public void adiciona(Produto produto) {
        System.out.println("Adicionando: " + produto);
        total += produto.getValor();
    }

    /*
    public void adiciona(Livro livro) {
        System.out.println("Adicionando: " + livro);
        livro.aplicaDescontoDe(0.16);
        total += livro.getValor();
    }

     */
    public double getTotal() {
        return total;
    }

}
