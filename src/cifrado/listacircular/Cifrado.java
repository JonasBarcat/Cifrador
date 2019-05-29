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
     * @param areaTextMensaje    
     * @param codigoEncriptacion    
     * @return     
     * @toEncript es LC que contiene los caracteres de una determinada cadena a cifrar
     * con el metodo StringToLinkedList a una cadena la insertamos en una LC donde cada
     * item de la cadena es un caracter del string ingresado
     * NOTA: cada cadena debe ingresarse con una marca final '$'
     * @code LC que contiene la clave para la encriptacion
     */
    
     public String funcionmaster(String areaTextMensaje,String codigoEncriptacion){
     
         
         //##FILTROS
         
            if(areaTextMensaje.isEmpty() || codigoEncriptacion.isEmpty()){
                return "Error.Ingrese mensaje y código";    
            }  
            ///
            char marcafinal=areaTextMensaje.charAt(areaTextMensaje.length()-1);
            if(marcafinal!='$'){
                return "Error.Ausencia de marca final($)";
            }
            ///
            boolean esCodigoNumerico; // esta seccion me ayuda a verificar que el codigo sea numerico
            try {
            Integer.parseInt(codigoEncriptacion);
            esCodigoNumerico = true;
             } catch (NumberFormatException excepcion) {
            esCodigoNumerico = false;
            }
            if(!esCodigoNumerico){
              return "Error.Codigo incorrecto";      
            }
            
            
//###############################################################################33            
            
            
         //al llamar esta funcion, se generan 2 listas circulares
            ListaCircular toEncript; //aqui va la cadena a enciptar
            ListaCircular code; //codigo para la encriptacion
  
            toEncript=Cifrado.StringToLinkedList(areaTextMensaje);//la funcion recibe el mensaje y lo vuelva a una listaCircular
            code=Cifrado.StringToLinkedList(codigoEncriptacion);

            Cifrado.encriptar(toEncript, code); // aqui es donde se produce el incriptamiento
           
            
            System.out.print("Cadena encriptada: ");
            System.out.println(toEncript.verLC());
            System.out.println();
            
                      
            
            
            System.out.println("###################################################");
            System.out.println("###################################################");
            System.out.println("###################################################");
         
//            
//            code=Cifrado.StringToLinkedList("12371"); 
//            /*
//            se debe reinsertar el codigo, sino al utilizar la desencriptacion en lugar
//            de comenzar a leer el codigo desde cero entonces lo lee desde el valor en
//            el que quedó anteriormente
//            */
//            
//            
//            if(!toEncript.esLCvacia() && !code.esLCvacia()){
//                        Cifrado.desencriptar(toEncript, code);
//            }else{System.out.println("No se pudo desencriptar: ENTRADA ERRONEA");}
//            
//            
//            System.out.print("Cadena desencriptada: ");
//            System.out.println(toEncript.verLC());
//            System.out.println();
//            
        return toEncript.verLC(); // la funcion verLC devuelve la """cadena""" almacenada en la lista Circular
     }
    
    
    
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
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
    
    
    public static void desencriptar(ListaCircular listaToDecrypt,ListaCircular CodeList){
        listaToDecrypt.LCRotar(); // en la ventana aparecera inicialmente la anteulitma letra ingresada, sino se modificaria la marca final
        
        if(listaToDecrypt.LCValor().getLetra()=='$'){ 
               System.out.println();
               System.out.println("Desencriptacion realizada con exito");
        }else{
              char letra=listaToDecrypt.LCValor().getLetra();  // obtengo la letra a repeemplazar
              int desplazar=(int)CodeList.LCValor().getLetra()-48; // obtengo uno de los valores numericos del codigo
              /*
              Cunado se realiza un cast de ej: 2 a int, ese se transforma en el valor pero en 
              ascii, por ejemplo: 1(char)=49 en ascii, por este motivo se le resta 48
              */
              
              
              // hago el encriptamiento de la letra
              int asciiValue = (int)letra;      
              asciiValue=asciiValue-desplazar;
              letra = (char)asciiValue;  
              listaToDecrypt.LCValor().setLetra(letra);
                
              
              // avanzo al siguiente numero del codigo
              CodeList.LCRotar();
              desencriptar(listaToDecrypt,CodeList);
        }       
    }
    
    
    
    
}
