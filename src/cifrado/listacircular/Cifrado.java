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
     * @toEncript es LC que contiene los caracteres de una determinada cadena a cifrar
     * con el metodo StringToLinkedList a una cadena la insertamos en una LC donde cada
     * item de la cadena es un caracter del string ingresado
     * NOTA: cada cadena debe ingresarse con una marca final '$'
     * @code LC que contiene la clave para la encriptacion
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            ListaCircular toEncript; //cadena a enciptar
            ListaCircular code; //codigo para la encriptacion
  
                
            toEncript=Cifrado.StringToLinkedList("hola soy jonas$");
            code=Cifrado.StringToLinkedList("4311");


            if(!toEncript.esLCvacia() && !code.esLCvacia()){
                        Cifrado.encriptar(toEncript, code);
            }else{System.out.println("No se pudo encriptar: ENTRADA ERRONEA");}
            
            
            System.out.println("La lingutod de LC es: "+toEncript.LClongitud());
            
            System.out.print("Cadena encriptada: ");
//            toEncript.verLC();
            System.out.println(toEncript.verLC());
            System.out.println();
         
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
        listaToEncript.LCRotar(); // en la ventana aparecera inicialmente la anteulitma letra ingresada, sino se modificaria la marca final
        
        if(listaToEncript.LCValor().getLetra()=='$'){ 
               System.out.println();
               System.out.println("Encriptacion realizada con exito");
        }else{
              char letra=listaToEncript.LCValor().getLetra();  // obtengo la letra a repeemplazar
              int desplazar=(int)CodeList.LCValor().getLetra()-48; // obtengo uno de los valores numericos del codigo
              /*
              Cunado se realiza un cast de ej: 2 a int, ese se transforma en el valor pero en 
              ascii, por ejemplo: 1(char)=49 en ascii, por este motivo se le resta 48
              */
              
              
              // hago el encriptamiento de la letra
              int asciiValue = (int)letra;      
              asciiValue=asciiValue+desplazar;
              letra = (char)asciiValue;  
              listaToEncript.LCValor().setLetra(letra);
                    
              
              // avanzo al siguiente numero del codigo
              CodeList.LCRotar();
              encriptar(listaToEncript,CodeList);
        }       
    }
    
    
    
    
    
}
