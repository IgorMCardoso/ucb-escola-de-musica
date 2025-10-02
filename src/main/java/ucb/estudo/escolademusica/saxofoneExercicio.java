package ucb.estudo.escolademusica;

public class saxofoneExercicio {
    private String tipo;

    public saxofoneExercicio(String nome, String material, String tipo) {
        super(nome, material);
        this.tipo = tipo;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando jazz suave no " + nome + " " + tipo + "...");
        System.out.println("melodia envolvente se ");
    }

    @Override
    public void afinar() {

    }
}


