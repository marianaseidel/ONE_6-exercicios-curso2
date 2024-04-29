public class ConversorMoeda implements ConversaoFinanceira{

    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 5.10;
        double valorReal = valorDolar * cotacaoDolar;
    }
}
