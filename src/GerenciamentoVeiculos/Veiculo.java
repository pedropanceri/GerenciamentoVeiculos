package GerenciamentoVeiculos;

public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected float preco;
    protected int ano;
    protected String placa;

    public Veiculo(String marca, String modelo, int ano, float preco, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.ano = ano;
        this.placa = placa;
    }

    public void detalhes(){
        System.out.println("Marca: " + this.marca + "\nModelo: " + this.modelo +
                "\nAno: " + this.ano + "\nValor: R$" + this.preco + "\nPlaca: " + this.placa);
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }



}
