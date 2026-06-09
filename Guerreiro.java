package eldoria;

/**
 * Classe que representa um Guerreiro no reino de Eldoria.
 * Herda de Personagem e implementa habilidades específicas de combate.
 */
public class Guerreiro extends Personagem {

    public Guerreiro(String nome, int nivel, int pontosDeVida, double poderBase) {
        // Passa "Guerreiro" fixo como o atributo de classe para a superclasse
        super(nome, "Guerreiro", nivel, pontosDeVida, poderBase);
    }

    @Override
    public void usarHabilidade() {
        System.out.println("Habilidade: " + getNome() + " avança com um ataque devastador!");
    }
}

