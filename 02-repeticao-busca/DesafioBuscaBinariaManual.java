public class DesafioBuscaBinariaManual {
    public static void main(String[] args) {
        /*
         * Objetivo:
         * Melhorar seu exercicio do numero secreto usando um algoritmo mais limpo.
         *
         * Cenario:
         * O numero secreto esta entre 1 e 100.
         * A cada tentativa, o programa deve chutar o meio do intervalo.
         *
         * Regras:
         * - Se o chute for menor que o segredo, o minimo vira chute + 1.
         * - Se o chute for maior que o segredo, o maximo vira chute - 1.
         * - Se acertar, pare o while.
         * - Conte quantas tentativas foram usadas.
         */

        int numeroSecreto = 84;
        int minimo = 1;
        int maximo = 100;
        int tentativas = 0;
        boolean encontrou = false;

        // TODO 1: crie um while que continue enquanto encontrou for false.

        // TODO 2: dentro do while, calcule int chute = (minimo + maximo) / 2.

        // TODO 3: incremente tentativas.

        // TODO 4: imprima o chute atual.

        // TODO 5: use if/else if/else para comparar chute com numeroSecreto.

        // TODO 6: ao acertar, mude encontrou para true e imprima a quantidade de tentativas.

        /*
         * Saida aproximada:
         * Chute atual: 50
         * Chute atual: 75
         * Chute atual: 88
         * Chute atual: 81
         * Chute atual: 84
         * Numero encontrado em 5 tentativas
         */
    }
}
