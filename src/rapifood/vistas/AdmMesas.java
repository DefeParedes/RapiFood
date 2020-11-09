/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapifood.vistas;

import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import rapifood.modelo.Conexion;
import rapifood.modelo.Mesa;
import rapifood.modelo.MesaData;


public class AdmMesas extends javax.swing.JFrame {
    private static String Horario;
    private static int NMesa;
    
    public static int getNMesa() {
        return NMesa;
    }
    public static String getHorario() {
        return Horario;
    }
    
    Conexion con = new Conexion();
    MesaData mesaData = new MesaData(con);
    List<Mesa> mesas = mesaData.obtenerMesas();
    
    public AdmMesas() {
        initComponents();
        this.setLocationRelativeTo(null);
              
        int cont;
        JButton[] arrBotones = {jbMesa1,jbMesa2,jbMesa3,jbMesa4,jbMesa5,jbMesa6,jbMesa7,jbMesa8,jbMesa9,jbMesa10,jbMesa11,jbMesa12,jbMesa13,jbMesa14,jbMesa15};
        boolean control;
        for(cont=0;cont<arrBotones.length;cont++){
            Mesa mesa = mesaData.buscarMesa(Integer.parseInt(arrBotones[cont].getName()));
            if(mesa.isEstado()){
                arrBotones[cont].setIcon(new ImageIcon(getClass().getResource("../RSC/MesasIconos/Mesa"+(cont+1)+"Verde.png")));
            }
            else{
                arrBotones[cont].setIcon(new ImageIcon(getClass().getResource("../RSC/MesasIconos/Mesa"+(cont+1)+"Rojo.png")));
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TAB1 = new javax.swing.JTabbedPane();
        Horario1 = new javax.swing.JPanel();
        jbMesa2 = new javax.swing.JButton();
        jbMesa1 = new javax.swing.JButton();
        jbMesa4 = new javax.swing.JButton();
        jbMesa5 = new javax.swing.JButton();
        jbMesa3 = new javax.swing.JButton();
        jbMesa8 = new javax.swing.JButton();
        jbMesa6 = new javax.swing.JButton();
        jbMesa10 = new javax.swing.JButton();
        jbMesa9 = new javax.swing.JButton();
        jbMesa7 = new javax.swing.JButton();
        jbMesa11 = new javax.swing.JButton();
        jbMesa14 = new javax.swing.JButton();
        jbMesa12 = new javax.swing.JButton();
        jbMesa15 = new javax.swing.JButton();
        jbMesa13 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        TAB1.setName("11:00 - 12:00"); // NOI18N

        jbMesa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RSC/mesaroja.png"))); // NOI18N
        jbMesa2.setText("jButton2");
        jbMesa2.setMaximumSize(new java.awt.Dimension(200, 204));
        jbMesa2.setMinimumSize(new java.awt.Dimension(200, 204));
        jbMesa2.setName("2"); // NOI18N
        jbMesa2.setPreferredSize(new java.awt.Dimension(204, 200));
        jbMesa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMesa2ActionPerformed(evt);
            }
        });

        jbMesa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RSC/mesaroja.png"))); // NOI18N
        jbMesa1.setText("jButton2");
        jbMesa1.setMaximumSize(new java.awt.Dimension(200, 204));
        jbMesa1.setMinimumSize(new java.awt.Dimension(200, 204));
        jbMesa1.setName("1"); // NOI18N
        jbMesa1.setPreferredSize(new java.awt.Dimension(204, 200));
        jbMesa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMesa1ActionPerformed(evt);
            }
        });

        jbMesa4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RSC/mesaroja.png"))); // NOI18N
        jbMesa4.setText("jButton2");
        jbMesa4.setMaximumSize(new java.awt.Dimension(200, 204));
        jbMesa4.setMinimumSize(new java.awt.Dimension(200, 204));
        jbMesa4.setName("4"); // NOI18N
        jbMesa4.setPreferredSize(new java.awt.Dimension(204, 200));
        jbMesa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMesa4ActionPerformed(evt);
            }
        });

        jbMesa5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RSC/mesaroja.png"))); // NOI18N
        jbMesa5.setText("jButton2");
        jbMesa5.setMaximumSize(new java.awt.Dimension(200, 204));
        jbMesa5.setMinimumSize(new java.awt.Dimension(200, 204));
        jbMesa5.setName("5"); // NOI18N
        jbMesa5.setPreferredSize(new java.awt.Dimension(204, 200));
        jbMesa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMesa5ActionPerformed(evt);
            }
        });

        jbMesa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RSC/mesaroja.png"))); // NOI18N
        jbMesa3.setText("jButton2");
        jbMesa3.setMaximumSize(new java.awt.Dimension(200, 204));
        jbMesa3.setMinimumSize(new java.awt.Dimension(200, 204));
        jbMesa3.setName("3"); // NOI18N
        jbMesa3.setPreferredSize(new java.awt.Dimension(204, 200));
        jbMesa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMesa3ActionPerformed(evt);
            }
        });

        jbMesa8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RSC/mesaroja.png"))); // NOI18N
        jbMesa8.setText("jButton2");
        jbMesa8.setMaximumSize(new java.awt.Dimension(200, 204));
        jbMesa8.setMinimumSize(new java.awt.Dimension(200, 204));
        jbMesa8.setName("8"); // NOI18N
        jbMesa8.setPreferredSize(new java.awt.Dimension(204, 200));
        jbMesa8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMesa8ActionPerformed(evt);
            }
        });

        jbMesa6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RSC/mesaroja.png"))); // NOI18N
        jbMesa6.setText("jButton2");
        jbMesa6.setMaximumSize(new java.awt.Dimension(200, 204));
        jbMesa6.setMinimumSize(new java.awt.Dimension(200, 204));
        jbMesa6.setName("6"); // NOI18N
        jbMesa6.setPreferredSize(new java.awt.Dimension(204, 200));
        jbMesa6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMesa6ActionPerformed(evt);
            }
        });

        jbMesa10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RSC/mesaroja.png"))); // NOI18N
        jbMesa10.setText("jButton2");
        jbMesa10.setMaximumSize(new java.awt.Dimension(200, 204));
        jbMesa10.setMinimumSize(new java.awt.Dimension(200, 204));
        jbMesa10.setName("10"); // NOI18N
        jbMesa10.setPreferredSize(new java.awt.Dimension(204, 200));
        jbMesa10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMesa10ActionPerformed(evt);
            }
        });

        jbMesa9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RSC/mesaroja.png"))); // NOI18N
        jbMesa9.setText("jButton2");
        jbMesa9.setMaximumSize(new java.awt.Dimension(200, 204));
        jbMesa9.setMinimumSize(new java.awt.Dimension(200, 204));
        jbMesa9.setName("9"); // NOI18N
        jbMesa9.setPreferredSize(new java.awt.Dimension(204, 200));
        jbMesa9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMesa9ActionPerformed(evt);
            }
        });

        jbMesa7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RSC/mesaroja.png"))); // NOI18N
        jbMesa7.setText("jButton2");
        jbMesa7.setMaximumSize(new java.awt.Dimension(200, 204));
        jbMesa7.setMinimumSize(new java.awt.Dimension(200, 204));
        jbMesa7.setName("7"); // NOI18N
        jbMesa7.setPreferredSize(new java.awt.Dimension(204, 200));
        jbMesa7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMesa7ActionPerformed(evt);
            }
        });

        jbMesa11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RSC/mesaroja.png"))); // NOI18N
        jbMesa11.setText("jButton2");
        jbMesa11.setMaximumSize(new java.awt.Dimension(200, 204));
        jbMesa11.setMinimumSize(new java.awt.Dimension(200, 204));
        jbMesa11.setName("11"); // NOI18N
        jbMesa11.setPreferredSize(new java.awt.Dimension(204, 200));
        jbMesa11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMesa11ActionPerformed(evt);
            }
        });

        jbMesa14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RSC/mesaroja.png"))); // NOI18N
        jbMesa14.setText("jButton2");
        jbMesa14.setMaximumSize(new java.awt.Dimension(200, 204));
        jbMesa14.setMinimumSize(new java.awt.Dimension(200, 204));
        jbMesa14.setName("14"); // NOI18N
        jbMesa14.setPreferredSize(new java.awt.Dimension(204, 200));
        jbMesa14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMesa14ActionPerformed(evt);
            }
        });

        jbMesa12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RSC/mesaroja.png"))); // NOI18N
        jbMesa12.setText("jButton2");
        jbMesa12.setMaximumSize(new java.awt.Dimension(200, 204));
        jbMesa12.setMinimumSize(new java.awt.Dimension(200, 204));
        jbMesa12.setName("12"); // NOI18N
        jbMesa12.setPreferredSize(new java.awt.Dimension(204, 200));
        jbMesa12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMesa12ActionPerformed(evt);
            }
        });

        jbMesa15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RSC/mesaroja.png"))); // NOI18N
        jbMesa15.setText("jButton2");
        jbMesa15.setMaximumSize(new java.awt.Dimension(200, 204));
        jbMesa15.setMinimumSize(new java.awt.Dimension(200, 204));
        jbMesa15.setName("15"); // NOI18N
        jbMesa15.setPreferredSize(new java.awt.Dimension(204, 200));
        jbMesa15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMesa15ActionPerformed(evt);
            }
        });

        jbMesa13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RSC/mesaroja.png"))); // NOI18N
        jbMesa13.setText("jButton2");
        jbMesa13.setMaximumSize(new java.awt.Dimension(200, 204));
        jbMesa13.setMinimumSize(new java.awt.Dimension(200, 204));
        jbMesa13.setName("13"); // NOI18N
        jbMesa13.setPreferredSize(new java.awt.Dimension(204, 200));
        jbMesa13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMesa13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Horario1Layout = new javax.swing.GroupLayout(Horario1);
        Horario1.setLayout(Horario1Layout);
        Horario1Layout.setHorizontalGroup(
            Horario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Horario1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(Horario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Horario1Layout.createSequentialGroup()
                        .addComponent(jbMesa11, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbMesa12, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jbMesa13, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbMesa14, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbMesa15, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Horario1Layout.createSequentialGroup()
                        .addGroup(Horario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Horario1Layout.createSequentialGroup()
                                .addComponent(jbMesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbMesa2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(Horario1Layout.createSequentialGroup()
                                .addComponent(jbMesa6, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbMesa7, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)
                        .addGroup(Horario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Horario1Layout.createSequentialGroup()
                                .addComponent(jbMesa8, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbMesa9, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbMesa10, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Horario1Layout.createSequentialGroup()
                                .addComponent(jbMesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbMesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbMesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        Horario1Layout.setVerticalGroup(
            Horario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Horario1Layout.createSequentialGroup()
                .addGroup(Horario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbMesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Horario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbMesa6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMesa7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMesa9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMesa10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMesa8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Horario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbMesa11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMesa12, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMesa14, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMesa15, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMesa13, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        TAB1.addTab("9:00 - 10:00", Horario1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TAB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TAB1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        TAB1.getAccessibleContext().setAccessibleName("horario1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbMesa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMesa1ActionPerformed
        cargarEliminarMesa(jbMesa1);
    }//GEN-LAST:event_jbMesa1ActionPerformed

    private void jbMesa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMesa2ActionPerformed
        cargarEliminarMesa(jbMesa2);
    }//GEN-LAST:event_jbMesa2ActionPerformed

    private void jbMesa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMesa3ActionPerformed
        cargarEliminarMesa(jbMesa3);
    }//GEN-LAST:event_jbMesa3ActionPerformed

    private void jbMesa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMesa4ActionPerformed
        cargarEliminarMesa(jbMesa4);
    }//GEN-LAST:event_jbMesa4ActionPerformed

    private void jbMesa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMesa5ActionPerformed
        cargarEliminarMesa(jbMesa5);
    }//GEN-LAST:event_jbMesa5ActionPerformed

    private void jbMesa6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMesa6ActionPerformed
        cargarEliminarMesa(jbMesa6);
    }//GEN-LAST:event_jbMesa6ActionPerformed

    private void jbMesa7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMesa7ActionPerformed
        cargarEliminarMesa(jbMesa7);
    }//GEN-LAST:event_jbMesa7ActionPerformed

    private void jbMesa8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMesa8ActionPerformed
        cargarEliminarMesa(jbMesa8);
    }//GEN-LAST:event_jbMesa8ActionPerformed

    private void jbMesa9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMesa9ActionPerformed
        cargarEliminarMesa(jbMesa9);
    }//GEN-LAST:event_jbMesa9ActionPerformed

    private void jbMesa10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMesa10ActionPerformed
        cargarEliminarMesa(jbMesa10);
    }//GEN-LAST:event_jbMesa10ActionPerformed

    private void jbMesa11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMesa11ActionPerformed
        cargarEliminarMesa(jbMesa11);
    }//GEN-LAST:event_jbMesa11ActionPerformed

    private void jbMesa12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMesa12ActionPerformed
        cargarEliminarMesa(jbMesa12);
    }//GEN-LAST:event_jbMesa12ActionPerformed

    private void jbMesa13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMesa13ActionPerformed
        cargarEliminarMesa(jbMesa13);
    }//GEN-LAST:event_jbMesa13ActionPerformed

    private void jbMesa14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMesa14ActionPerformed
        cargarEliminarMesa(jbMesa14);
    }//GEN-LAST:event_jbMesa14ActionPerformed

    private void jbMesa15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMesa15ActionPerformed
        cargarEliminarMesa(jbMesa15);
    }//GEN-LAST:event_jbMesa15ActionPerformed
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(AdmMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdmMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdmMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdmMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdmMesas().setVisible(true);
            }
        });
    }
    
    public void cargarEliminarMesa(JButton boton){
        Mesa mesa = mesaData.buscarMesa(Integer.parseInt(boton.getName()));
        if(mesa.isEstado()){
            mesa.setEstado(false);
            mesaData.actualizarMesa(mesa);
            boton.setIcon(new ImageIcon(getClass().getResource("../RSC/MesasIconos/Mesa"+Integer.parseInt(boton.getName())+"Rojo.png")));
        }
        else{
            mesa.setEstado(true);
            mesaData.actualizarMesa(mesa);
            boton.setIcon(new ImageIcon(getClass().getResource("../RSC/MesasIconos/Mesa"+Integer.parseInt(boton.getName())+"Verde.png")));
        }
    }                                                                                                                                                                                                                  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Horario1;
    private javax.swing.JTabbedPane TAB1;
    private javax.swing.JButton jbMesa1;
    private javax.swing.JButton jbMesa10;
    private javax.swing.JButton jbMesa11;
    private javax.swing.JButton jbMesa12;
    private javax.swing.JButton jbMesa13;
    private javax.swing.JButton jbMesa14;
    private javax.swing.JButton jbMesa15;
    private javax.swing.JButton jbMesa2;
    private javax.swing.JButton jbMesa3;
    private javax.swing.JButton jbMesa4;
    private javax.swing.JButton jbMesa5;
    private javax.swing.JButton jbMesa6;
    private javax.swing.JButton jbMesa7;
    private javax.swing.JButton jbMesa8;
    private javax.swing.JButton jbMesa9;
    // End of variables declaration//GEN-END:variables
}
