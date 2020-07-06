
package herança.animal;
import  java.util.Random;
/**
 *
 * @author Vitor Fonseca
 */
public class cachorro extends mamifero{
    private String Nome;
    private int patas;
    Random r = new Random();
    mamifero m = new mamifero();
    public cachorro() {
        this.Nome = Nome;
    }
    

    public String getNome() {
        return Nome;
    }

    public void setNome() {
        int a = r.nextInt(2)+1;
        if(a==1){
            this.Nome = "Lili";
        }else{
            this.Nome = "Bob";
        }
        
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas() {
        this.patas = 4;
    }
    public void animal(){
        setHabitat("Terra");
        ani.setExpectivaVida(12);
        setPatas();
         setNome();
       
       
    }
    
    public void apresentar(){
        String som1 = "Au Au";
        animal();
         System.out.println("Habitat: "+getHabitat());
         System.out.println("Expectativa de vida: "+ani.getExpectivaVida()+" anos");
         emitirSom(som1);
         System.out.println("Nome: "+getNome());
         System.out.println("Número de patas: "+getPatas());
         
    }

    
}
