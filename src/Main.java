public class Main {
    public static void main(String[] args) {
        String[] cities = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
        int[][] temperatures = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};
        int min = 0, max = 0;

        for (int i = 1; i < temperatures.length; ++i) {
            if (temperatures[i][0] < temperatures[min][0])
                min = i;
            if (temperatures[i][1] > temperatures[max][1])
                max = i;
        }

        System.out.printf("A temperatura mais baixa foi em %s, com %d graus celsius.\n", cities[min], temperatures[min][0]);
        System.out.printf("A temperatura mais alta foi em %s, com %d graus celsius.\n", cities[max], temperatures[max][1]);
    }
}
