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
public class CarroLuxoBuilder extends CarroBuilder{
    
    @Override
    public void buildPrecoCarro(){
        carro.precoCarro = 300000;
    }
    @Override
    public void buildAno(){
        carro.ano = 2020;
    }
    @Override
    public void buildMarca(){
        carro.marca = "BMW";
    }
    @Override
    public void buildCombustivel(){
        carro.combustivel = "Gasolina";
    }
    @Override
    public void buildCor(){
        carro.cor = "Branco";
    }
    
}
