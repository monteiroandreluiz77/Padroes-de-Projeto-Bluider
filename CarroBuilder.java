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
public abstract class CarroBuilder {

    protected CarroProduct carro;

    public CarroBuilder() {
        carro = new CarroProduct();
    }

    public abstract void buildPrecoCarro();

    public abstract void buildAno();

    public abstract void buildMarca();

    public abstract void buildCombustivel();

    public abstract void buildCor();
    
    public CarroProduct getCarro(){
        return carro;
    }

}
