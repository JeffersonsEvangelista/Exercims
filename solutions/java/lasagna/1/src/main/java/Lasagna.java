public class Lasagna {

    // Tempo esperado que a lasanha deve ficar no forno
    public int expectedMinutesInOven() {
        return 40;
    }

    // Quanto tempo ainda falta no forno
    public int remainingMinutesInOven(int minutesInOven) {
        return expectedMinutesInOven() - minutesInOven;
    }

    // Tempo de preparação em minutos (cada camada leva 2 minutos)
    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    // Tempo total (preparo + forno)
    public int totalTimeInMinutes(int layers, int minutesInOven) {
        return preparationTimeInMinutes(layers) + minutesInOven;
    }

    // Método principal para testar
    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();

    // TODO: define the 'remainingMinutesInOven()' method

    // TODO: define the 'preparationTimeInMinutes()' method

    // TODO: define the 'totalTimeInMinutes()' method
}
   }

