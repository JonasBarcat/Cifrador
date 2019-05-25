/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifrado.listacircular;

/**
 *
 * @author jonas
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Item uno=new Item('a');
        Item dos=new Item('b');
        Item tres=new Item('c');
        Item cuatro=new Item('d');
        Item cinco=new Item('e');
        Item seis=new Item('f');
        
        
        ListaCircular mylista=new ListaCircular();
        mylista.LCInsertar(uno);
        mylista.LCInsertar(dos);
        mylista.LCInsertar(tres);
        mylista.LCInsertar(cuatro);
        mylista.LCInsertar(cinco);
        mylista.LCInsertar(seis);
        

 
        
    
        
    }
    
}
