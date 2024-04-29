public class Carro {

    private String nome;
    private double precoMedio1;
    private double precoMedio2;
    private double precoMedio3;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoMedio1() {
        return precoMedio1;
    }

    public void setPrecoMedio1(double precoMedio1) {
        this.precoMedio1 = precoMedio1;
    }

    public double getPrecoMedio2() {
        return precoMedio2;
    }

    public void setPrecoMedio2(double precoMedio2) {
        this.precoMedio2 = precoMedio2;
    }

    public double getPrecoMedio3() {
        return precoMedio3;
    }

    public void setPrecoMedio3(double precoMedio3) {
        this.precoMedio3 = precoMedio3;
    }

    public void exibirInformacoes(){
        System.out.println("Modelo: " + nome);
        System.out.println("Preço ano 1: " + precoMedio1);
        System.out.println("Preço ano 2: " + precoMedio2);
        System.out.println("Preço ano 3: " + precoMedio3);
    }

    public double calcularMenorPreco(){
        double menorPreco = precoMedio1;

        if(menorPreco > precoMedio2) {
            return menorPreco = precoMedio2;
        }

        if(menorPreco > precoMedio3) {
            return menorPreco = precoMedio3;
        }

        return menorPreco;
    }

    public double calcularMaiorPreco(){
        double maiorPreco = precoMedio1;

        if(maiorPreco < precoMedio2) {
            return maiorPreco = precoMedio2;
        }

        if(maiorPreco < precoMedio3) {
            return maiorPreco = precoMedio3;
        }

        return maiorPreco;
    }
}
