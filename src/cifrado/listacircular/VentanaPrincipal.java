/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifrado.listacircular;
import java.applet.AudioClip;
import javax.swing.*;

/**
 *
 * @author jonas
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    AudioClip sonido;
    
    public VentanaPrincipal() {
        initComponents();
        sonido=java.applet.Applet.newAudioClip(getClass().getResource("/imagenes/sound.wav"));
        sonido.loop();
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelprincipal = new javax.swing.JTabbedPane();
        encriptador = new javax.swing.JPanel();
        encriptar = new javax.swing.JButton();
        pegar1 = new javax.swing.JButton();
        copiar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAencriptar = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        textoEncriptado = new javax.swing.JTextArea();
        codigo1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        desencriptador = new javax.swing.JPanel();
        copiar2 = new javax.swing.JButton();
        pegar2 = new javax.swing.JButton();
        desencriptar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        textAdesencriptar = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        textdesencriptado = new javax.swing.JTextArea();
        codigo2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Encriptador V8 by Jonás Barcat");
        setBackground(java.awt.Color.black);
        setResizable(false);
        setSize(new java.awt.Dimension(300, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelprincipal.setBackground(java.awt.Color.lightGray);
        panelprincipal.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N

        encriptador.setBackground(java.awt.Color.green);
        encriptador.setLayout(null);

        encriptar.setBackground(java.awt.Color.lightGray);
        encriptar.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        encriptar.setForeground(java.awt.Color.red);
        encriptar.setText("ENCRIPTAR");
        encriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encriptarActionPerformed(evt);
            }
        });
        encriptador.add(encriptar);
        encriptar.setBounds(300, 130, 110, 60);

        pegar1.setBackground(java.awt.Color.lightGray);
        pegar1.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        pegar1.setForeground(java.awt.Color.red);
        pegar1.setText("Pegar");
        pegar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pegar1ActionPerformed(evt);
            }
        });
        encriptador.add(pegar1);
        pegar1.setBounds(204, 32, 70, 22);

        copiar1.setBackground(java.awt.Color.lightGray);
        copiar1.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        copiar1.setForeground(java.awt.Color.red);
        copiar1.setText("Copiar");
        copiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copiar1ActionPerformed(evt);
            }
        });
        encriptador.add(copiar1);
        copiar1.setBounds(200, 160, 70, 22);

        textAencriptar.setBackground(java.awt.Color.black);
        textAencriptar.setColumns(20);
        textAencriptar.setForeground(java.awt.Color.white);
        textAencriptar.setRows(5);
        jScrollPane1.setViewportView(textAencriptar);

        encriptador.add(jScrollPane1);
        jScrollPane1.setBounds(12, 65, 262, 87);

        textoEncriptado.setBackground(java.awt.Color.black);
        textoEncriptado.setColumns(20);
        textoEncriptado.setForeground(java.awt.Color.white);
        textoEncriptado.setRows(5);
        jScrollPane2.setViewportView(textoEncriptado);

        encriptador.add(jScrollPane2);
        jScrollPane2.setBounds(12, 191, 262, 87);

        codigo1.setBackground(java.awt.Color.black);
        codigo1.setFont(new java.awt.Font("utkal", 1, 15)); // NOI18N
        codigo1.setForeground(java.awt.Color.red);
        encriptador.add(codigo1);
        codigo1.setBounds(303, 65, 99, 20);

        jLabel1.setForeground(java.awt.Color.green);
        jLabel1.setText("Mensaje a encriptar :");
        encriptador.add(jLabel1);
        jLabel1.setBounds(12, 42, 164, 17);

        jLabel2.setForeground(java.awt.Color.green);
        jLabel2.setText("Mensaje encriptado :");
        encriptador.add(jLabel2);
        jLabel2.setBounds(12, 168, 170, 17);

        jLabel6.setForeground(java.awt.Color.green);
        jLabel6.setText("Codigo :");
        encriptador.add(jLabel6);
        jLabel6.setBounds(312, 42, 90, 17);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.jpg"))); // NOI18N
        encriptador.add(jLabel8);
        jLabel8.setBounds(0, 0, 470, 360);

        panelprincipal.addTab("Encriptador", encriptador);

        desencriptador.setLayout(null);

        copiar2.setBackground(java.awt.Color.lightGray);
        copiar2.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        copiar2.setForeground(java.awt.Color.red);
        copiar2.setText("Copiar");
        copiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copiar2ActionPerformed(evt);
            }
        });
        desencriptador.add(copiar2);
        copiar2.setBounds(204, 159, 70, 22);

        pegar2.setBackground(java.awt.Color.lightGray);
        pegar2.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        pegar2.setForeground(java.awt.Color.red);
        pegar2.setText("Pegar");
        pegar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pegar2ActionPerformed(evt);
            }
        });
        desencriptador.add(pegar2);
        pegar2.setBounds(204, 32, 70, 22);

        desencriptar.setBackground(java.awt.Color.lightGray);
        desencriptar.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        desencriptar.setForeground(java.awt.Color.red);
        desencriptar.setText("DESENCRIPTAR");
        desencriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desencriptarActionPerformed(evt);
            }
        });
        desencriptador.add(desencriptar);
        desencriptar.setBounds(290, 120, 130, 63);

        textAdesencriptar.setBackground(java.awt.Color.black);
        textAdesencriptar.setColumns(20);
        textAdesencriptar.setForeground(java.awt.Color.white);
        textAdesencriptar.setRows(5);
        jScrollPane3.setViewportView(textAdesencriptar);

        desencriptador.add(jScrollPane3);
        jScrollPane3.setBounds(12, 60, 262, 87);

        textdesencriptado.setBackground(java.awt.Color.black);
        textdesencriptado.setColumns(20);
        textdesencriptado.setForeground(java.awt.Color.white);
        textdesencriptado.setRows(5);
        jScrollPane4.setViewportView(textdesencriptado);

        desencriptador.add(jScrollPane4);
        jScrollPane4.setBounds(12, 187, 262, 87);

        codigo2.setBackground(java.awt.Color.black);
        codigo2.setFont(new java.awt.Font("utkal", 0, 15)); // NOI18N
        codigo2.setForeground(java.awt.Color.red);
        desencriptador.add(codigo2);
        codigo2.setBounds(298, 60, 100, 20);

        jLabel3.setForeground(java.awt.Color.green);
        jLabel3.setText("Mensaje a desencriptar :");
        desencriptador.add(jLabel3);
        jLabel3.setBounds(12, 37, 190, 17);

        jLabel4.setForeground(java.awt.Color.green);
        jLabel4.setText("Mensaje desencriptado :");
        desencriptador.add(jLabel4);
        jLabel4.setBounds(12, 164, 190, 17);

        jLabel7.setForeground(java.awt.Color.green);
        jLabel7.setText("Codigo:");
        desencriptador.add(jLabel7);
        jLabel7.setBounds(308, 37, 90, 17);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.jpg"))); // NOI18N
        desencriptador.add(jLabel9);
        jLabel9.setBounds(0, 0, 470, 310);

        panelprincipal.addTab("Desencriptador", desencriptador);

        getContentPane().add(panelprincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 441, 328));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void desencriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desencriptarActionPerformed
        textdesencriptado.removeAll(); // limpia el contenedor de salida por si es que ya se encripto algo
        String mensajedesencriptado;
        Cifrado nuevoCifrado=new Cifrado();
        mensajedesencriptado=nuevoCifrado.funcionmaster2(textAdesencriptar.getText(), codigo2.getText()); // la funcion master 2 es la que desencripta
        textdesencriptado.setText(mensajedesencriptado);
    }//GEN-LAST:event_desencriptarActionPerformed

    private void pegar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pegar2ActionPerformed
        textAdesencriptar.paste();
    }//GEN-LAST:event_pegar2ActionPerformed

    private void copiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copiar2ActionPerformed
        textdesencriptado.selectAll();
        textdesencriptado.copy();
    }//GEN-LAST:event_copiar2ActionPerformed

    private void copiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copiar1ActionPerformed
        textoEncriptado.selectAll();
        textoEncriptado.copy();
    }//GEN-LAST:event_copiar1ActionPerformed

    private void pegar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pegar1ActionPerformed
        textAencriptar.paste();
    }//GEN-LAST:event_pegar1ActionPerformed

    private void encriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encriptarActionPerformed
        textoEncriptado.removeAll(); // limpia el contenedor de salida por si es que ya se encripto algo
        String mensajencriptado;
        Cifrado nuevoCifrado=new Cifrado();
        mensajencriptado=nuevoCifrado.funcionmaster(textAencriptar.getText(), codigo1.getText());
        textoEncriptado.setText(mensajencriptado);
    }//GEN-LAST:event_encriptarActionPerformed

    

    
    
   
    public static void main(String args[]) {
        VentanaPrincipal ventana= new VentanaPrincipal();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigo1;
    private javax.swing.JTextField codigo2;
    private javax.swing.JButton copiar1;
    private javax.swing.JButton copiar2;
    private javax.swing.JPanel desencriptador;
    private javax.swing.JButton desencriptar;
    private javax.swing.JPanel encriptador;
    private javax.swing.JButton encriptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane panelprincipal;
    private javax.swing.JButton pegar1;
    private javax.swing.JButton pegar2;
    private javax.swing.JTextArea textAdesencriptar;
    private javax.swing.JTextArea textAencriptar;
    private javax.swing.JTextArea textdesencriptado;
    private javax.swing.JTextArea textoEncriptado;
    // End of variables declaration//GEN-END:variables
}
