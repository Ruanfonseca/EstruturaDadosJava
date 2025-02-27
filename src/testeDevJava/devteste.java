package testeDevJava;

public class devteste {
	
	    public static void main(String[] args) {
	        // Questão 1: Cálculo de SOMA - primeira questão feita
	        int INDICE = 13, SOMA = 0, K = 0;
	        while (K < INDICE) {
	            K = K + 1;
	            SOMA = SOMA + K;
	        }
	        
	        
	        System.out.println("Questão 1 - SOMA: " + SOMA); // Resultado: 91

	        // Questão 2: Verificação de número na sequência de Fibonacci
	        int numero = 21; // Número a ser verificado
	        if (pertenceFibonacci(numero)) {
	            System.out.println("Questão 2 - O numero " + numero + " pertence à sequência de Fibonacci.");
	        } else {
	            System.out.println("Questão 2 - O numero " + numero + " NÃO pertence à sequência de Fibonacci.");
	        }

	        // Questão 3: Análise do faturamento diário
	        double[] faturamentoDiario = {0, 1500, 2200, 0, 800, 900, 2000, 0, 1800, 2500, 3000, 0, 1000};
	        analisarFaturamento(faturamentoDiario);

	        // Questão 4: Cálculo percentual de faturamento por estado
	        double[] faturamentoEstados = {67836.43, 36678.66, 29229.88, 27165.48, 19849.53};
	        String[] estados = {"SP", "RJ", "MG", "ES", "Outros"};
	        calcularPercentualFaturamento(faturamentoEstados, estados);

	        // Questão 5: Inversão de string
	        String palavra = "Java";
	        System.out.println("Questão 5 - String invertida: " + inverterString(palavra));
	    }

	    // Método para verificar se um número pertence à sequência de Fibonacci
	    public static boolean pertenceFibonacci(int num) {
	        int a = 0, b = 1, c;
	        while (a < num) {
	            c = a + b;
	            a = b;
	            b = c;
	        }
	        return a == num;
	    }

	    // Método para analisar o faturamento diário
	    public static void analisarFaturamento(double[] faturamento) {
	        double menor = Double.MAX_VALUE, maior = Double.MIN_VALUE, soma = 0;
	        int diasValidos = 0, diasAcimaMedia = 0;

	        for (double valor : faturamento) {
	            if (valor > 0) {
	                if (valor < menor) menor = valor;
	                if (valor > maior) maior = valor;
	                soma += valor;
	                diasValidos++;
	            }
	        }

	        double media = soma / diasValidos;
	        for (double valor : faturamento) {
	            if (valor > media) diasAcimaMedia++;
	        }

	        System.out.println("Questão 3 - Menor faturamento: " + menor);
	        System.out.println("Questão 3 - Maior faturamento: " + maior);
	        System.out.println("Questão 3 - Dias acima da media: " + diasAcimaMedia);
	    }

	    // Método para calcular percentual de faturamento por estado
	    public static void calcularPercentualFaturamento(double[] faturamento, String[] estados) {
	        double total = 0;
	        for (double valor : faturamento) {
	            total += valor;
	        }

	        System.out.println("Questão 4 - Percentual de faturamento por estado:");
	        for (int i = 0; i < faturamento.length; i++) {
	            double percentual = (faturamento[i] / total) * 100;
	            System.out.printf("%s: %.2f%%\n", estados[i], percentual);
	        }
	    }

	    // Método para inverter uma string
	    public static String inverterString(String str) {
	        char[] caracteres = str.toCharArray();
	        int i = 0, j = caracteres.length - 1;
	        while (i < j) {
	            
	            //utilizando burbble sort , não é a melhor solução mas é mais rapida de implementar
	            char temp = caracteres[i];
	            caracteres[i] = caracteres[j];
	            caracteres[j] = temp;
	            i++;
	            j--;
	        }
	        return new String(caracteres);
	    }
	}

