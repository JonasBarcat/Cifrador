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
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuRefrescar = new javax.swing.JMenu();
        menuVer = new javax.swing.JMenu();
        menuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        encriptador.setBackground(java.awt.Color.green);

        encriptar.setText("ENCRIPTAR");
        encriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encriptarActionPerformed(evt);
            }
        });

        pegar1.setText("Pegar");
        pegar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pegar1ActionPerformed(evt);
            }
        });

        copiar1.setText("Copiar");
        copiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copiar1ActionPerformed(evt);
            }
        });

        textAencriptar.setColumns(20);
        textAencriptar.setRows(5);
        jScrollPane1.setViewportView(textAencriptar);

        textoEncriptado.setColumns(20);
        textoEncriptado.setRows(5);
        jScrollPane2.setViewportView(textoEncriptado);

        jLabel1.setText("Mensaje a encriptar :");

        jLabel2.setText("Mensaje encriptado :");

        jLabel6.setText("Codigo :");

        javax.swing.GroupLayout encriptadorLayout = new javax.swing.GroupLayout(encriptador);
        encriptador.setLayout(encriptadorLayout);
        encriptadorLayout.setHorizontalGroup(
            encriptadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encriptadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(encriptadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, encriptadorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(encriptadorLayout.createSequentialGroup()
                        .addGroup(encriptadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(encriptadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(encriptadorLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(copiar1)))
                            .addGroup(encriptadorLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(pegar1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(encriptadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(encriptar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(encriptadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(codigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        encriptadorLayout.setVerticalGroup(
            encriptadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, encriptadorLayout.createSequentialGroup()
                .addGroup(encriptadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(encriptadorLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(encriptadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pegar1)
                            .addComponent(jLabel1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, encriptadorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(encriptadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(encriptadorLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(encriptadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(copiar1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(encriptadorLayout.createSequentialGroup()
                        .addComponent(codigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(encriptar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        panelprincipal.addTab("Encriptador", encriptador);

        copiar2.setText("Copiar");
        copiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copiar2ActionPerformed(evt);
            }
        });

        pegar2.setText("Pegar");
        pegar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pegar2ActionPerformed(evt);
            }
        });

        desencriptar.setText("DESENCRIPTAR");
        desencriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desencriptarActionPerformed(evt);
            }
        });

        textAdesencriptar.setColumns(20);
        textAdesencriptar.setRows(5);
        jScrollPane3.setViewportView(textAdesencriptar);

        textdesencriptado.setColumns(20);
        textdesencriptado.setRows(5);
        jScrollPane4.setViewportView(textdesencriptado);

        jLabel3.setText("Mensaje a desencriptar :");

        jLabel4.setText("Mensaje desencriptado :");

        jLabel7.setText("Codigo:");

        javax.swing.GroupLayout desencriptadorLayout = new javax.swing.GroupLayout(desencriptador);
        desencriptador.setLayout(desencriptadorLayout);
        desencriptadorLayout.setHorizontalGroup(
            desencriptadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desencriptadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(desencriptadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(desencriptadorLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pegar2))
                    .addGroup(desencriptadorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(desencriptadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(desencriptadorLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(copiar2)))
                .addGap(18, 18, 18)
                .addGroup(desencriptadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(desencriptar)
                    .addGroup(desencriptadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7)
                        .addComponent(codigo2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        desencriptadorLayout.setVerticalGroup(
            desencriptadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desencriptadorLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(desencriptadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pegar2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(desencriptadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desencriptadorLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(desencriptadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(copiar2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(desencriptadorLayout.createSequentialGroup()
                        .addComponent(codigo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(desencriptar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        panelprincipal.addTab("Desencriptador", desencriptador);

        jLabel5.setText("Encriptador V8 by Jonas Barcat");

        menuRefrescar.setText("Refrescar");
        menuRefrescar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuRefrescarMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuRefrescar);

        menuVer.setText("Ver");
        menuVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuVerMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuVer);

        menuSalir.setText("Salir");
        menuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(panelprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void encriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encriptarActionPerformed
        textoEncriptado.removeAll(); // limpia el contenedor de salida por si es que ya se encripto algo
        String mensajencriptado;
        Cifrado nuevoCifrado=new Cifrado();
        mensajencriptado=nuevoCifrado.funcionmaster(textAencriptar.getText(), codigo1.getText());
        textoEncriptado.setText(mensajencriptado);
    }//GEN-LAST:event_encriptarActionPerformed

    private void desencriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desencriptarActionPerformed
        textdesencriptado.removeAll(); // limpia el contenedor de salida por si es que ya se encripto algo
        String mensajedesencriptado;
        Cifrado nuevoCifrado=new Cifrado();
        mensajedesencriptado=nuevoCifrado.funcionmaster2(textAdesencriptar.getText(), codigo2.getText()); // la funcion master 2 es la que desencripta
        textdesencriptado.setText(mensajedesencriptado);
    }//GEN-LAST:event_desencriptarActionPerformed

    private void copiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copiar1ActionPerformed
        textoEncriptado.selectAll();
        textoEncriptado.copy();
    }//GEN-LAST:event_copiar1ActionPerformed

    private void menuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSalirMouseClicked
     System.exit(0);
    }//GEN-LAST:event_menuSalirMouseClicked

    private void menuVerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuVerMouseClicked
        JOptionPane.showMessageDialog(null, "Creado por Jonás Ezequiel Barcat v1.0\n"+"Ing. en Computación\nFACET | UNT | 2019","Info",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuVerMouseClicked

    private void menuRefrescarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRefrescarMouseClicked
        textoEncriptado.removeAll();
        textdesencriptado.removeAll();
        textAencriptar.removeAll();
        textAdesencriptar.removeAll();
        codigo1.removeAll();
        codigo2.removeAll();
    }//GEN-LAST:event_menuRefrescarMouseClicked

    private void pegar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pegar1ActionPerformed
        textAencriptar.paste();
    }//GEN-LAST:event_pegar1ActionPerformed

    private void pegar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pegar2ActionPerformed
       textAdesencriptar.paste();
    }//GEN-LAST:event_pegar2ActionPerformed

    private void copiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copiar2ActionPerformed
        textdesencriptado.selectAll();
        textdesencriptado.copy();
    }//GEN-LAST:event_copiar2ActionPerformed

    

    
    
   
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JMenu menuRefrescar;
    private javax.swing.JMenu menuSalir;
    private javax.swing.JMenu menuVer;
    private javax.swing.JTabbedPane panelprincipal;
    private javax.swing.JButton pegar1;
    private javax.swing.JButton pegar2;
    private javax.swing.JTextArea textAdesencriptar;
    private javax.swing.JTextArea textAencriptar;
    private javax.swing.JTextArea textdesencriptado;
    private javax.swing.JTextArea textoEncriptado;
    // End of variables declaration//GEN-END:variables
}
