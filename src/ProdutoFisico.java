public class ProdutoFisico extends Produto implements Calculavel{
    @Override
    public double calcularPrecoFinal() {
        double taxasAdicionais = 1.05;
        return getPreco() * taxasAdicionais;
    }
}
