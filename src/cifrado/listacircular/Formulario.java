/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifrado.listacircular;
import java.applet.AudioClip;
/**
 *
 * @author jonas
 */
public class Formulario extends javax.swing.JFrame {

    /**
     * Creates new form Formulario
     */
    public static String mensaje;
    public static String codigo;
    public static String salida;
    
    public Formulario() {
        initComponents();
            
          AudioClip sonido;
          sonido=java.applet.Applet.newAudioClip(getClass().getResource("/imagenes/sound.wav"));
          sonido.play();
       
            
    }
    
    
    


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonSalir = new javax.swing.JButton();
        botonEncriptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaMensajeIN = new javax.swing.JTextArea();
        textCodigo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaMensajeOUT = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Encriptador V8 by JB");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonSalir.setBackground(java.awt.Color.black);
        botonSalir.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        botonSalir.setForeground(java.awt.Color.red);
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

        botonEncriptar.setBackground(java.awt.Color.darkGray);
        botonEncriptar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botonEncriptar.setForeground(java.awt.Color.green);
        botonEncriptar.setText("Encriptar");
        botonEncriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEncriptarActionPerformed(evt);
            }
        });
        getContentPane().add(botonEncriptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 135, 120, 55));

        areaMensajeIN.setBackground(java.awt.Color.black);
        areaMensajeIN.setColumns(20);
        areaMensajeIN.setForeground(java.awt.Color.white);
        areaMensajeIN.setRows(5);
        jScrollPane1.setViewportView(areaMensajeIN);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 74, -1, -1));

        textCodigo.setBackground(java.awt.Color.black);
        textCodigo.setForeground(java.awt.Color.red);
        getContentPane().add(textCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 74, 88, 30));

        areaMensajeOUT.setBackground(java.awt.Color.black);
        areaMensajeOUT.setColumns(20);
        areaMensajeOUT.setForeground(java.awt.Color.white);
        areaMensajeOUT.setRows(5);
        jScrollPane2.setViewportView(areaMensajeOUT);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 196, -1, -1));

        jLabel1.setBackground(java.awt.Color.black);
        jLabel1.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.green);
        jLabel1.setText("ENCRIPTADOR V8 by Jonas Barcat");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 12, 311, 33));

        jLabel2.setForeground(java.awt.Color.green);
        jLabel2.setText("Mensaje a encriptar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 51, -1, -1));

        jLabel3.setForeground(java.awt.Color.green);
        jLabel3.setText("Código");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 51, -1, -1));

        jLabel4.setForeground(java.awt.Color.green);
        jLabel4.setText("Mensaje encriptado");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 167, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonEncriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEncriptarActionPerformed
       mensaje=areaMensajeIN.getText();
       codigo=areaMensajeIN.getText();
       funcion();
       areaMensajeOUT.setText(salida);
    }//GEN-LAST:event_botonEncriptarActionPerformed

    
    public static void main(String args[]) {
        
        
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        
            Formulario ventana=new Formulario();
            ventana.setVisible(true);
            ventana.setLocationRelativeTo(null);
            
            
           
       
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaMensajeIN;
    private javax.swing.JTextArea areaMensajeOUT;
    private javax.swing.JButton botonEncriptar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField textCodigo;
    // End of variables declaration//GEN-END:variables


public static void funcion(){
        
            ListaCircular toEncript; //cadena a enciptar
            ListaCircular code; //codigo para la encriptacion
  
            toEncript=Formulario.StringToLinkedList(mensaje);
            code=Formulario.StringToLinkedList(codigo);


            if(!toEncript.esLCvacia() && !code.esLCvacia()){
                        Formulario.encriptar(toEncript, code);
            }else{System.out.println("No se pudo encriptar: ENTRADA ERRONEA");}
           
            
            System.out.print("Cadena encriptada: ");
            System.out.println(toEncript.verLC());
            System.out.println();
            
           salida=toEncript.verLC();

}    
    

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
