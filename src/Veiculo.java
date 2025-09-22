public abstract class Veiculo {

    protected String marca;
    protected String modelo;
    protected int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public abstract void ligar();
    public abstract void desligar();
    public abstract void acelerar();
    public abstract void frear();

    @Override
    public String toString() {
        return "marca: '" + marca + '|' +
               "modelo: '" + modelo + '|' +
               "ano: " + ano;
    }
}
