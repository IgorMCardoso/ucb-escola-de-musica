package ucb.estudo.escolademusica;

public class violaoExercicio extends instrumentoMusical{
    private int numeroCordas;

    public violaoExercicio(String nome, String material, int numeroCordas) {
        super(nome, material);
        this.numeroCordas = numeroCordas;
    }
    
    @Override
    public void tocar() {
        System.out.println("Tocando notas suaves em " + nome + "com " + numeroCordas + "cordas...");
        System.out.println("Dedilhando uma melodia romântica...");
    }

    @Override
    public void afinar() {
        super.afinar();
        System.out.println("Ajustando a tensão das " + numeroCordas + " cordas.");
    }

    @Override
    public void mostrarInformacoes (){
        super.mostrarInformacoes();
        System.out.println("Número de cordas " + numeroCordas);
    }

    public int getNumeroCordas() {
        return numeroCordas;
    }

}
