public class CalculadoraSalaRetangular implements CalculoGeometrico {
    @Override
    public void calcularArea(double largura, double altura) {
        double area = largura * altura;
        System.out.println(area);
    }

    @Override
    public void calcularPerimetro(double largura, double altura) {
        double perimetro = (2 * largura) + (2 * altura);
        System.out.println(perimetro);
    }
}
