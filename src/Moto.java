public class Moto extends Veiculo {

    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void ligar() {
        System.out.println("A Moto " + modelo + " está ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("A Moto " + modelo + " está desligado.");
    }

    @Override
    public void acelerar() {
        System.out.println("A Moto " + modelo + " está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("A Moto " + modelo + " está freando.");
    }

    public String toString() {
        return "CARRO\n" +
            "marca: " + marca + "|" +
            "modelo: " + modelo + "|" +
            "ano: " + ano;
    }
}