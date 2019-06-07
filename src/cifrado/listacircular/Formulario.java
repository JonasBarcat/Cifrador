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
        AudioClip sonido;
        
    public Formulario() {     
        initComponents();      
        sonido=java.applet.Applet.newAudioClip(getClass().getResource("/imagenes/sound.wav"));
        sonido.loop();
        areaMensajeOUT.setLineWrap(true); // para hacer saltos de line automaticos
        areaMensajeIN.setLineWrap(true); 
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
        pegarTexto = new javax.swing.JButton();
        copiarTexto = new javax.swing.JButton();
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
        getContentPane().add(botonEncriptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 120, 55));

        areaMensajeIN.setBackground(java.awt.Color.black);
        areaMensajeIN.setColumns(20);
        areaMensajeIN.setForeground(java.awt.Color.white);
        areaMensajeIN.setRows(5);
        jScrollPane1.setViewportView(areaMensajeIN);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 74, -1, -1));

        textCodigo.setBackground(java.awt.Color.black);
        textCodigo.setForeground(java.awt.Color.red);
        textCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(textCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 74, 88, 30));

        areaMensajeOUT.setBackground(java.awt.Color.black);
        areaMensajeOUT.setColumns(20);
        areaMensajeOUT.setForeground(java.awt.Color.white);
        areaMensajeOUT.setRows(5);
        jScrollPane2.setViewportView(areaMensajeOUT);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 196, -1, -1));

        pegarTexto.setBackground(java.awt.Color.gray);
        pegarTexto.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        pegarTexto.setForeground(java.awt.Color.red);
        pegarTexto.setText("Pegar");
        pegarTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pegarTextoActionPerformed(evt);
            }
        });
        getContentPane().add(pegarTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        copiarTexto.setBackground(java.awt.Color.gray);
        copiarTexto.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        copiarTexto.setForeground(java.awt.Color.red);
        copiarTexto.setText("Copiar\n");
        copiarTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copiarTextoActionPerformed(evt);
            }
        });
        getContentPane().add(copiarTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

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
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonEncriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEncriptarActionPerformed
        areaMensajeOUT.removeAll(); // limpia el contenedor de salida por si es que ya se encripto algo
        String mensajencriptado;
        Cifrado nuevoCifrado=new Cifrado();
        mensajencriptado=nuevoCifrado.funcionmaster(areaMensajeIN.getText(), textCodigo.getText());
        areaMensajeOUT.setText(mensajencriptado);
    }//GEN-LAST:event_botonEncriptarActionPerformed

    private void textCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCodigoActionPerformed

    private void pegarTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pegarTextoActionPerformed
        areaMensajeIN.paste();
    }//GEN-LAST:event_pegarTextoActionPerformed

    private void copiarTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copiarTextoActionPerformed
        areaMensajeOUT.selectAll();
        areaMensajeOUT.copy();
    }//GEN-LAST:event_copiarTextoActionPerformed

    
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
    private javax.swing.JButton copiarTexto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton pegarTexto;
    private javax.swing.JTextField textCodigo;
    // End of variables declaration//GEN-END:variables

}
