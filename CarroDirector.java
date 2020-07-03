
package builder;

/**
 *
 * @author Andre
 */
public class CarroDirector {
    protected CarroBuilder fabrica;
    
    public CarroDirector(CarroBuilder fabrica){
        this.fabrica = fabrica;
    }
    public void fabricarCarro(){
        fabrica.buildPrecoCarro();
        fabrica.buildAno();
        fabrica.buildMarca();
        fabrica.buildCombustivel();
        fabrica.buildCor();
    }
    
    public CarroProduct getCarro(){
        return fabrica.getCarro();
    }
}
