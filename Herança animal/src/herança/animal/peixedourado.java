
package herança.animal;
import java.util.Random;
/**
 *
 * @author Vitor Fonseca
 */
public class peixedourado extends aquatico {
    private String Nome;
    private float peso;
    Random r = new Random();
   aquatico aqua = new aquatico();

    public String getNome() {
        return Nome;
    }

    public void setNome() {
        this.Nome = "Douradinho";
    }

    public float getPeso() {
        
        return peso;
    }

    public void setPeso() {
        this.peso = 6;
    }
    public void animal2(){
        boolean agua= false;
        setHabitat("Aquatico");
        setNome();
        setPeso();
        ani.setExpectivaVida(5);
        aqua.setAguaSalgada(false);
        
    }
    public void apresentar2(){
        System.out.println("\n========================\n");
        String bolha = "Glub Glub";
        animal2();
        System.out.println("Habitat: "+getHabitat());
        System.out.println("Expectativa de vida: "+ani.getExpectivaVida()+" anos");
        System.out.println("Água Salgada: "+aqua.isAguaSalgada());
        soltaBolhas(bolha);
        System.out.println("Nome: "+getNome());
        System.out.println("Peso: "+getPeso()+"Kg");
    }
}
