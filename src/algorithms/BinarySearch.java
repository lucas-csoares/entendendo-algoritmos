package algorithms;

/**
 * Classe utilitária que contém o método de pesquisa binária
 * O array deve ser ordenado em ordem crescente
 */
public class BinarySearch {

    /**
     * Método construtor evita instanciação
     */
    private BinarySearch() {}

    /**
     * Método que realiza a pesquisa binária
     * @param array
     * @param target
     * @return
     */
    public static int search(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            int guess = array[mid];

            if (guess == target)
                return mid;
            else if(guess > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}
