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
public class CarroPopularBuilder extends CarroBuilder{
     @Override
    public void buildPrecoCarro(){
        carro.precoCarro = 45000;
    }
    @Override
    public void buildAno(){
        carro.ano = 2019;
    }
    @Override
    public void buildMarca(){
        carro.marca = "Chevrolet";
    }
    @Override
    public void buildCombustivel(){
        carro.combustivel = "Flex";
    }
    @Override
    public void buildCor(){
        carro.cor = "Vermelho";
    }
    
}
