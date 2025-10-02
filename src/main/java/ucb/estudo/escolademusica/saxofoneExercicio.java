package ucb.estudo.escolademusica;

public class saxofoneExercicio extends instrumentoMusical {
    private String tipo;

    public saxofoneExercicio(String nome, String material, String tipo) {
        super(nome, material);
        this.tipo = tipo;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando jazz suave no " + nome + " " + tipo + "...");
        System.out.println("Melodia envolvente se intensifica...");
    }

    @Override
    public void afinar() {
        super.afinar();
        System.out.println("Afinando o saxofone...");
    }

    @Override
    public void mostrarInformacoes (){
        super.mostrarInformacoes();
        System.out.println("Tipo de saxofone: " + tipo);
    }

    public String getTipo(){
        return tipo;
    }
}


