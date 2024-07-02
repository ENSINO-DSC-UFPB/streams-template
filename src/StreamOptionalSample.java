import java.util.*;

public class StreamOptionalSample {

    //Converta cada um dos blocos de códigos abaixo para usar streams.
    //Cada um dos trechos está precedido por um comenário indicadondo o número do trecho
    public static void main(String[] args) {
        List<String> words = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");

        // 1. Filtrar palavras com mais de três caracteres
        List<String> filteredWords = new ArrayList<>();
        for (String word : words) {
            if (word.length() > 3) {
                filteredWords.add(word);
            }
        }

        // 2. Converter palavras filtradas para maiúsculas
        List<String> upperCaseWords = new ArrayList<>();
        for (String word : filteredWords) {
            upperCaseWords.add(word.toUpperCase());
        }

        // 3. Ordenar as palavras em ordem alfabética
        Collections.sort(upperCaseWords);

        // 4. Imprimir cada palavra
        for (String word : upperCaseWords) {
            System.out.println(word);
        }

        // 5. Encontrar a primeira palavra que começa com 'T'
        String firstWordStartingWithT = null;
        for (String word : words) {
            if (word.startsWith("t")) {
                firstWordStartingWithT = word;
                break;
            }
        }

        // 6. Imprimir a primeira palavra que começa com 'T', se presente
        if (firstWordStartingWithT != null) {
            System.out.println(firstWordStartingWithT);
        }

        // 7. Contar o número de palavras com comprimento par
        int countEvenLengthWords = 0;
        for (String word : words) {
            if (word.length() % 2 == 0) {
                countEvenLengthWords++;
            }
        }
        System.out.println("Number of words with even length: " + countEvenLengthWords);

        // 8. Transformar palavras para uma lista dos seus comprimentos
        List<Integer> wordLengths = new ArrayList<>();
        for (String word : words) {
            wordLengths.add(word.length());
        }

        // 9. Imprimir os comprimentos das palavras
        for (Integer length : wordLengths) {
            System.out.println(length);
        }

        // 10. Usar Optional para evitar NullPointerException
        String searchWord = "zero";
        String foundWord = null;
        for (String word : words) {
            if (word.equals(searchWord)) {
                foundWord = word;
                break;
            }
        }
        System.out.println(foundWord.toUpperCase());
    }
}
