package ucb.estudo.escolademusica;

public class bateriaExercicio extends instrumentoMusical{
    private int pecas;

    public bateriaExercicio(String nome, String material, int pecas) {
        super(nome, material);
        this.pecas = pecas;
    }
    
    @Override
    public void tocar() {
        System.out.println("Tocando uma melodica intensa na bateria de " + pecas + " pecas...");
        System.out.println("Sons de bateria se intensificam cada vez mais...");
    }

    @Override
    public void afinar() {
        super.afinar();
        System.out.println("Ajustando as " + pecas + " pecas.");
    }

    @Override
    public void mostrarInformacoes (){
        super.mostrarInformacoes();
        System.out.println("Número de pecas " + pecas);
    }

    public int getPecas() {
        return pecas;
    }

}
