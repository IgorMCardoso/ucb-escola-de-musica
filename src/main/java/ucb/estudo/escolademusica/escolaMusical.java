package ucb.estudo.escolademusica;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class escolaMusical {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.out.println("Iniciar orquestra");

        instrumentoMusical[] banda = new instrumentoMusical[4];

        banda[0] = new bateriaExercicio("Violao classico", "Madeira", 6);

        banda[1] = new pianoExercicio("Piano de Cauda", "Madeira e Metal", 88);

        banda[2] = new bateriaExercicio("Bateria", "Metal e Madeira", 5);

        banda[3] = new saxofoneExercicio("Saxofone alto", "Latão", "Alto");

        escolaMusical em = new escolaMusical();
            em.apresentar(banda);

    }

    public void apresentar(instrumentoMusical[] banda) {
        System.out.println( "a oquestra vai começar");

        System.out.println("Afinação dos intrumentos");
        for(instrumentoMusical instrumento : banda) {
            instrumento.afinar();
        }
        System.out.println();

        System.out.println("Instrumentos começam a tocar");
        for(instrumentoMusical instrumento : banda) {
            instrumento.mostrarInformacoes();
            instrumento.tocar();
        }
        System.out.println();

        System.out.println("-----Mostrando informações dos Instrumento--------");

        for(int i = 0; i < banda.length; i++){
            System.out.println("Instrumento musical " + (i + 1) + ":");
            banda[i].mostrarInformacoes();
            System.out.println(" ");
        }

        
    }
}