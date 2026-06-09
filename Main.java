package eldoria;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== BEM-VINDOS AO REINO DE ELDORIA ===");

        // Criando a lista polimórfica (Nível Mestre)
        List<Personagem> herois = new ArrayList<>();

        // Adicionando múltiplos personagens (2 Magos e 2 Guerreiros)
        herois.add(new Mago("Eldoran", 7, 60, 18.0));
        herois.add(new Guerreiro("Arthemis", 8, 90, 25.5));
        herois.add(new Mago("Valerius", 5, 50, 22.0));
        herois.add(new Guerreiro("Gideon", 8, 95, 27.0));

        // Iterando sobre a lista demonstrando polimorfismo dinâmico
        for (int i = 0; i < herois.size(); i++) {
            Personagem heroi = herois.get(i);
            
            System.out.println("--- Herói " + (i + 1) + " ---");
            // Exibe os dados cadastrados usando o toString() sobrescrito
            System.out.println(heroi);
            
            // Vinculação dinâmica do método usarHabilidade()
            heroi.usarHabilidade();

            // Verificação de tipos em tempo de execução com instanceof (Nível Mestre)
            if (heroi instanceof Mago) {
                System.out.println("O personagem " + heroi.getNome() + " é um Mago de nível " + heroi.getNivel() + ".");
            } else if (heroi instanceof Guerreiro) {
                System.out.println("O personagem " + heroi.getNome() + " é um Guerreiro lendário de nível " + heroi.getNivel() + ".");
            }
            System.out.println(); // Linha em branco para separar os heróis
        }

        // Demonstração de comparação entre personagens usando equals()
        System.out.println("Comparação: " + herois.get(0).getNome() + " e " + herois.get(1).getNome() + 
                           (herois.get(0).equals(herois.get(1)) ? " são iguais." : " são diferentes."));
                           
        // Teste extra opcional de validação (Nível Aventureiro)
        try {
            System.out.println("\n[Tentando criar um personagem com vida negativa...]");
            new Mago("Mago Sombrio", 1, -10, 5.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Tratamento de exceção executado com sucesso: " + e.getMessage());
        }
    }
}
