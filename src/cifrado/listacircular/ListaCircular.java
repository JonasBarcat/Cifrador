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
    private int c=0;

    
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
        c++;
    }
    
    public void LCBorrar(){  // si esta vacia entonces no hace nada
        if(esLCvacia()){
        }else{
            if(lc.getSiguiente()==lc){
                lc=null;
                c--;
            }else{
                lc.setSiguiente(lc.getSiguiente().getSiguiente());
                c--;
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
    
    
    public int LClongitud(){// no cuenta la marca final '$'
        return this.c-1;
    }
    
    
//    public void verLC(){
//      Item auxiliar=lc.getSiguiente().getSiguiente();
//     for(int i=0;i<LClongitud();i++){
//         System.out.print(auxiliar.getLetra());
//         auxiliar=auxiliar.getSiguiente();
//        } 
//    }
    
     public String verLC(){
      Item auxiliar=lc.getSiguiente().getSiguiente();
      String palabra="";
      for(int i=0;i<LClongitud();i++){       // cargo cada elemento de LC en un string
         palabra=palabra+auxiliar.getLetra();
         auxiliar=auxiliar.getSiguiente();
        } 
      StringBuilder builder=new StringBuilder(palabra);  // doy vuelta el string para mostrar la palabra al derecho
      String palabrainvertida=builder.reverse().toString();
      return palabrainvertida;
    }
    
    
    
   
}
