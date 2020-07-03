/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Andre
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarroDirector fabrica = new CarroDirector(
                new CarroLuxoBuilder());

        fabrica.fabricarCarro();

        CarroProduct carro = fabrica.getCarro();
        System.out.println("Carro Marca: " + carro.marca + "." + " Ano: " + carro.ano + ". Combusitvel: " + carro.combustivel + ". Cor: " + carro.cor + ". Preço: " + carro.precoCarro);

        System.out.println("");

        fabrica = new CarroDirector(new CarroPopularBuilder());
        fabrica.fabricarCarro();
        carro = fabrica.getCarro();
        System.out.println("Carro Marca: " + carro.marca + "." + " Ano: " + carro.ano + ". Combusitvel: " + carro.combustivel + ". Cor: " + carro.cor + ". Preço: " + carro.precoCarro);

    }

}
