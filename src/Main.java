public class Main {
    public static void main(String[] args) {
        String[] cidades = {
                "Londres",
                "Madrid",
                "Nueva York",
                "Buenos Aires",
                "Asunción",
                "São Paulo",
                "Lima",
                "Santiago de Chile",
                "Lisboa",
                "Tokio"
        };

        int[][] temperaturas = {
                {-2, 33},
                {-3, 32},
                {-8, 27},
                {4, 37},
                {6, 42},
                {5, 43},
                {0, 39},
                {-7, 26},
                {-1, 31},
                {-10, 35}
        };

        int min = 0, max = 0;

        for (int i = 1; i < temperaturas.length; ++i) {
            if (temperaturas[i][0] < temperaturas[min][0])
                min = i;
            if (temperaturas[i][1] > temperaturas[max][1])
                max = i;
        }

        System.out.printf("A temperatura mais baixa foi em %s, com %d graus celsius.\n", cidades[min], temperaturas[min][0]);
        System.out.printf("A temperatura mais alta foi em %s, com %d graus celsius.\n", cidades[max], temperaturas[max][1]);
    }
}
