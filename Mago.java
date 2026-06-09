package eldoria;

/**
 * Classe que representa um Mago no reino de Eldoria.
 * Herda de Personagem e implementa habilidades específicas de magia.
 */
public class Mago extends Personagem {

    public Mago(String nome, int nivel, int pontosDeVida, double poderBase) {
        // Passa "Mago" fixo como o atributo de classe para a superclasse
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
    }

    @Override
    public void usarHabilidade() {
        System.out.println("Habilidade: " + getNome() + " conjura um feitiço de proteção!");
    }
}
