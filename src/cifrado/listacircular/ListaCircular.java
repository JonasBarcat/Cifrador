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
public class ListaCircular {
      
    private Item lc;
   

    
    public ListaCircular() {
    }
    
    
    public boolean esLCvacia(){
        if(lc==null){
            return true;
        }else return false;
    }
   
    public void LCInsertar(Item elemento){ // tres casos: cuando esta vacia, un solo elemento, mas de un elemento
        if(esLCvacia()){
         lc=elemento;
         elemento.setSiguiente(elemento);
        }else{
         elemento.setSiguiente(lc.getSiguiente());
         lc.setSiguiente(elemento);
        }
        
    }
    
    public void LCBorrar(){  // si esta vacia entonces no hace nada
        if(esLCvacia()){
        }else{
            if(lc.getSiguiente()==lc){
                lc=null;
            }else{
                lc.setSiguiente(lc.getSiguiente().getSiguiente());
            }
        }
    }
    
    public Item LCValor(){  // devuelve el item que se encuentra en la ventana
        if(esLCvacia()){
            return null;
        }else{
            return lc.getSiguiente();
        }
    }
    
    
    public void LCRotar(){  // rota la lista circular
        if(esLCvacia()){
              //no hago nada
        }else{
            lc=lc.getSiguiente();
        }
    }
    
    public void verLC(){
//        System.out.println("LC puntero : "+lc.getLetra());
//        System.out.println("Ventana : "+lc.getSiguiente().getLetra());
        Item aux=lc;    
        for(int i=0; i<9; i++){
            System.out.println(aux.getLetra());
            aux=aux.getSiguiente();
        }
        
    }
   
}
