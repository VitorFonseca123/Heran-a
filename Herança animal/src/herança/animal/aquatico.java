
package herança.animal;

/**
 *
 * @author Vitor Fonseca
 */
public class aquatico extends Animal{
private boolean aguaSalgada;
Animal ani = new Animal();
    public aquatico() {
    }

    public boolean isAguaSalgada() {
        return aguaSalgada;
    }

    public void setAguaSalgada(boolean agua) {
        this.aguaSalgada = agua;
    }

    public void soltaBolhas(String b){
        System.out.println("Bolhas: "+b);
    }
    
}
