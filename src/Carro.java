public class Carro extends Veiculo {

    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void ligar() {
        System.out.println("O carro " + modelo + " está ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("O carro " + modelo + " está desligado.");
    }

    @Override
    public void acelerar() {
        System.out.println("O carro " + modelo + " está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("O carro " + modelo + " está freando.");
    }

    public String toString() {
        return "CARRO\n" +
               "marca: '" + marca + '|' +
               "modelo: '" + modelo + '|' +
               "ano: " + ano;
    }
}