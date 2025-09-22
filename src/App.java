import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Carro("Toyota", "Corolla", 2022));
        veiculos.add(new Carro("Ford", "Fiesta", 2018));
        veiculos.add(new Moto("Honda", "CB500", 2021));
        veiculos.add(new Moto("Yamaha", "MT-07", 2019));

        System.out.println("-------- Lista dos Veículos -----------");
        for (Veiculo i : veiculos) {
            System.out.println(i);
        }

        for (Veiculo v : veiculos) {
            v.ligar();
            v.acelerar();
            v.frear();
            v.desligar();
            System.out.println("-----------------------");
        }
    }

}
