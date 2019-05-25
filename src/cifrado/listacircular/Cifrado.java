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
public class Cifrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            ListaCircular toEncript; //cadena a enciptar
            ListaCircular code; //codigo para la encriptacion
                
            toEncript=Cifrado.StringToLinkedList("abc");
            code=Cifrado.StringToLinkedList("541");


            if(!toEncript.esLCvacia() && !code.esLCvacia()){
                        Cifrado.encriptar(toEncript, code);
            }else{System.out.println("No se pudo encriptar: su entrada es erronea");}
      
        
            toEncript.verLC();
    }
    
    
    
    // esta funcion vuelva todos los caracteres de un string a una lista circular
    public static ListaCircular StringToLinkedList(String cadena){
        ListaCircular LC=new ListaCircular();
        for(int i=0; i<cadena.length();i++){
            Item letra=new Item(cadena.charAt(i));
            LC.LCInsertar(letra);
        }   
    return LC;
    } 
    
    
    public static void encriptar(ListaCircular listaToEncript,ListaCircular CodeList){
        if(listaToEncript.LCValor().getLetra()=='$'){ // donde $ es una marca final(indica el final de la frase)
                // termina
        }else{
              char letra=listaToEncript.LCValor().getLetra();  // obtengo la letra a repeemplazar(letra en la ventana)
              int desplazar=(int)CodeList.LCValor().getLetra(); // obtengo uno de los valores numericos del codigo
        
              // hago el encriptamiento de la letra
              int asciiValue = (int)letra;      
              asciiValue=asciiValue+desplazar;
              letra = (char)asciiValue;  
              listaToEncript.LCValor().setLetra(letra);
        
              // avanzo a la siguiente letra
              listaToEncript.LCRotar();
              CodeList.LCRotar();
              encriptar(listaToEncript,CodeList);
        }       
    }
    
    
    
    
    
}
