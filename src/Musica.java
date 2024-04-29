public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibirFicha(){
        System.out.println(titulo);
        System.out.println(artista);
        System.out.println(anoDeLancamento);
    }

    void avaliar(double nota){
        avaliacao += nota;
        numAvaliacoes++;
    }

    double mediaAvaliacoes(){
        return avaliacao / numAvaliacoes;
    }

}
