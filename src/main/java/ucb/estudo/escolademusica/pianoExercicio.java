package ucb.estudo.escolademusica;

public class pianoExercicio extends instrumentoMusical {
    private int numeroTeclas;

    public pianoExercicio(String nome, String material, int numeroTeclas) {
        super(nome, material);
        this.numeroTeclas = numeroTeclas;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando uma bela melodia no " + nome + " com " + numeroTeclas + " teclas");
    

    @Override
    public void afinar() {
        super.afinar();
        System.out.println("Ajustando a tensão das cordas internas do piano");
    }
}
