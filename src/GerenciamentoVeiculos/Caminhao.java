package GerenciamentoVeiculos;

public class Caminhao extends Veiculo{
    private int capacidade;
    private int eixos;
    private int rodas;

    public Caminhao(String marca, String modelo, int ano, float preco, String placa, int capacidade, int eixos, int rodas) {
        super(marca, modelo, ano, preco, placa);
        this.capacidade = capacidade;
        this.eixos = eixos;
        this.rodas = rodas;
    }

    @Override
    public void detalhes(){
        super.detalhes();
        System.out.println("Capacidade (toneladas): " + this.capacidade + "\nNúmero de eixos: " + this.eixos
                + "\nNúmero de rodas: " + this.rodas);
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public float getPreco() {
        return preco;
    }

    @Override
    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public int getAno() {
        return ano;
    }

    @Override
    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }



}
