/**
 * Classe que representa um Carro.
 */
public class Carro {
    // Propriedades
    private String marca;
    private String modelo;
    private int ano;
    private String cor;

    /**
     * Construtor da classe Carro.
     * @param marca A marca do carro.
     * @param modelo O modelo do carro.
     * @param ano O ano de fabricação do carro.
     * @param cor A cor do carro.
     */
    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
}

    /**
     * Obtém a marca do carro.
     * @return A marca do carro.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Obtém o modelo do carro.
     * @return O modelo do carro.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Obtém o ano de fabricação do carro.
     * @return O ano de fabricação do carro.
     */
    public int getAno() {
        return ano;
    }

    /**
     * Obtém a cor do carro.
     * @return A cor do carro.
     */
    public String getCor() {
        return cor;
    }

    /**
     * Liga o carro.
     */
    public void ligar() {
        System.out.println("O carro está ligado.");
    }

    /**
     * Desliga o carro.
     */
    public void desligar() {
        System.out.println("O carro está desligado.");
    }
}