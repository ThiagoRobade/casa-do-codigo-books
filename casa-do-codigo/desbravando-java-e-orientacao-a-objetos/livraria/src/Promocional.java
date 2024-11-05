/**
 * Interface funcional que define a operação de aplicação de desconto.
 * Marcada com @FunctionalInterface para indicar que possui um único método abstrato.
 */
@FunctionalInterface
public interface Promocional {

    /**
     * Aplica um desconto de acordo com a porcentagem informada.
     *
     * @param porcentagem Percentual de desconto a ser aplicado
     * @return true se o desconto foi aplicado com sucesso, false caso contrário
     */
    boolean aplicaDescontoDe(double porcentagem);

    /**
     * Aplica um desconto padrão de 10% no valor do item.
     *
     * @return true se o desconto de 10% foi aplicado com sucesso, false caso contrário
     */
    default boolean aplicadescontoDe10Porcento() {
        return aplicaDescontoDe(0.1);
    }
}

