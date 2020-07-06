
package herança.animal;

/**
 *
 * @author Vitor Fonseca
 */
public class mamifero extends Animal {
  Animal ani = new Animal();
    public mamifero() {
        
    }

    
    public void emitirSom(String som){
        System.out.println("Som emitido: "+som);
        
    }
     
}
