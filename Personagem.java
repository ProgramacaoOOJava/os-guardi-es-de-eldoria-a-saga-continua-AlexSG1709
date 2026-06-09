package eldoria;

import java.util.Objects;

public abstract class Personagem {
    // Atributos encapsulados (private)
    private String nome;
    private String classe;
    private int nivel;
    private int pontosDeVida;
    private double poderBase;

    // Construtor completo
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        setNivel(nivel);             // Usa o setter para garantir a validação
        setPontosDeVida(pontosDeVida); // Usa o setter para garantir a validação
        this.poderBase = poderBase;
    }

    // Método abstrato a ser implementado pelas subclasses (Nível Novato/Mestre)
    public abstract void usarHabilidade();

    // Getters e Setters com validações (Nível Aventureiro)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel < 0) {
            throw new IllegalArgumentException("O nível não pode ser negativo!");
        }
        this.nivel = nivel;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida) {
        if (pontosDeVida < 0) {
            throw new IllegalArgumentException("Os pontos de vida não podem ser negativos!");
        }
        this.pontosDeVida = pontosDeVida;
    }

    public double getPoderBase() {
        return poderBase;
    }

    public void setPoderBase(double poderBase) {
        this.poderBase = poderBase;
    }

    // Sobrescrita de toString() para formatação personalizada (Nível Aventureiro)
    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
               "Classe: " + classe + "\n" +
               "Nível: " + nivel + "\n" +
               "Pontos de Vida: " + pontosDeVida + "\n" +
               "Poder Base: " + poderBase;
    }

    // Sobrescrita de equals() baseada em nome e classe (Nível Aventureiro)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personagem that = (Personagem) o;
        return Objects.equals(nome, that.nome) && Objects.equals(classe, that.classe);
    }

    // Sobrescrita de hashCode() consistente com equals()
    @Override
    public int hashCode() {
        return Objects.hash(nome, classe);
    }
}
