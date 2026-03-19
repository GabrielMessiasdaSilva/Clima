public class TemperaturaCidades {

    public static void main(String[] args) {

        String[] cidades = {"São Paulo", "Rio de Janeiro", "Curitiba"};

        double[] tempAtual = {20, 30, 14};
        double[] mediaAnual = {22, 26, 18};

        double somaAtual = 0;
        double somaAnual = 0;
        double maiorTemp = tempAtual[0];
        double menorTemp = tempAtual[0];
        String cidadeMaisQuente = cidades[0];
        String cidadeMaisFria = cidades[0];

        System.out.println("=== Análise das Temperaturas ===\n");

        for (int i = 0; i < cidades.length; i++) {

            somaAtual += tempAtual[i];
            somaAnual += mediaAnual[i];

            // Encontrar maior e menor temperatura
            if (tempAtual[i] > maiorTemp) {
                maiorTemp = tempAtual[i];
                cidadeMaisQuente = cidades[i];
            }
            if (tempAtual[i] < menorTemp) {
                menorTemp = tempAtual[i];
                cidadeMaisFria = cidades[i];
            }

            System.out.println("Cidade: " + cidades[i]);
            System.out.println("Temperatura atual: " + tempAtual[i] + "°C");
            System.out.println("Média anual: " + mediaAnual[i] + "°C");

            if (tempAtual[i] > mediaAnual[i]) {
                System.out.println("Hoje está mais quente que a média anual.");
            } else if (tempAtual[i] < mediaAnual[i]) {
                System.out.println("Hoje está mais frio que a média anual.");
            } else {
                System.out.println("Temperatura igual à média anual.");
            }

            sugerirRoupa(tempAtual[i]);
            System.out.println();
        }

        double mediaAtualGeral = somaAtual / cidades.length;
        double mediaAnualGeral = somaAnual / cidades.length;

        System.out.println("=== Resumo Geral ===");
        System.out.printf("Média atual das cidades: %.2f°C\n", mediaAtualGeral);
        System.out.printf("Média anual das cidades: %.2f°C\n", mediaAnualGeral);
        System.out.println("Cidade mais quente: " + cidadeMaisQuente + " (" + maiorTemp + "°C)");
        System.out.println("Cidade mais fria: " + cidadeMaisFria + " (" + menorTemp + "°C)");
    }

    public static void sugerirRoupa(double temperatura) {

        if (temperatura < 15) {
            System.out.println("Sugestão: Use casaco.");
        } else if (temperatura <= 25) {
            System.out.println("Sugestão: Use roupas leves.");
        } else {
            System.out.println("Sugestão: Use camiseta e shorts.");
        }
    }
}