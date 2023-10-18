/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejercicio.componentes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author luisc
 */
public class Ventana extends javax.swing.JFrame {
    private ArrayList<Personaje> arreglo;
    private JTextField[] arreglo_textos = new JTextField[6];
    private TipoZombie zombies[] = TipoZombie.values();
    private TipoDefensa defensas[] = TipoDefensa.values();
    private boolean isValid[] = new boolean[8];
    private String rutaImagen;
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        arreglo = new ArrayList<Personaje>();
        initComponents();
        aparecerTipoPersonaje();         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPanelBackground1 = new javax.swing.JPanel();
        cbxTipo = new javax.swing.JComboBox<>();
        lblCrear = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblTipoEspecial = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblVida = new javax.swing.JLabel();
        lblDaño = new javax.swing.JLabel();
        lblCantidadGolpes = new javax.swing.JLabel();
        lblNivel = new javax.swing.JLabel();
        lblCampos = new javax.swing.JLabel();
        lblNivelAparicion = new javax.swing.JLabel();
        txfNombre = new javax.swing.JTextField();
        cbxTipoEspecial = new javax.swing.JComboBox<>();
        txfVida = new javax.swing.JTextField();
        txfCantidadGolpes = new javax.swing.JTextField();
        txfDaño = new javax.swing.JTextField();
        txfNivel = new javax.swing.JTextField();
        txfNivelAparicion = new javax.swing.JTextField();
        txfCampos = new javax.swing.JTextField();
        lblImagen = new javax.swing.JLabel();
        btnAgregarImagen = new javax.swing.JButton();
        lblRango = new javax.swing.JLabel();
        txfRango = new javax.swing.JTextField();
        btnCrearPersonaje = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPanelBackground1.setBackground(new java.awt.Color(255, 153, 0));
        pnlPanelBackground1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DEFENSA", "ZOMBIE" }));
        cbxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoActionPerformed(evt);
            }
        });

        lblCrear.setBackground(new java.awt.Color(51, 153, 255));
        lblCrear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCrear.setText("Crea tu Defensa o Zombie");
        lblCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblCrear.setOpaque(true);

        lblTipo.setBackground(new java.awt.Color(255, 102, 51));
        lblTipo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipo.setText("Tipo");
        lblTipo.setOpaque(true);

        lblTipoEspecial.setBackground(new java.awt.Color(255, 102, 51));
        lblTipoEspecial.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTipoEspecial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipoEspecial.setText("Tipo Especial");
        lblTipoEspecial.setOpaque(true);

        lblNombre.setBackground(new java.awt.Color(255, 102, 51));
        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("Nombre");
        lblNombre.setOpaque(true);

        lblVida.setBackground(new java.awt.Color(255, 102, 51));
        lblVida.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblVida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVida.setText("Vida");
        lblVida.setOpaque(true);

        lblDaño.setBackground(new java.awt.Color(255, 102, 51));
        lblDaño.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblDaño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDaño.setText("Daño");
        lblDaño.setOpaque(true);

        lblCantidadGolpes.setBackground(new java.awt.Color(255, 102, 51));
        lblCantidadGolpes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblCantidadGolpes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantidadGolpes.setText("Cantidad de Golpes");
        lblCantidadGolpes.setOpaque(true);

        lblNivel.setBackground(new java.awt.Color(255, 102, 51));
        lblNivel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblNivel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNivel.setText("Nivel");
        lblNivel.setOpaque(true);

        lblCampos.setBackground(new java.awt.Color(255, 102, 51));
        lblCampos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblCampos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampos.setText("Campos");
        lblCampos.setOpaque(true);

        lblNivelAparicion.setBackground(new java.awt.Color(255, 102, 51));
        lblNivelAparicion.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblNivelAparicion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNivelAparicion.setText("Nivel Aparicion");
        lblNivelAparicion.setOpaque(true);

        txfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNombreActionPerformed(evt);
            }
        });

        cbxTipoEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoEspecialActionPerformed(evt);
            }
        });

        txfVida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfVidaActionPerformed(evt);
            }
        });

        txfCantidadGolpes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfCantidadGolpesActionPerformed(evt);
            }
        });

        txfDaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfDañoActionPerformed(evt);
            }
        });

        txfNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNivelActionPerformed(evt);
            }
        });

        txfNivelAparicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNivelAparicionActionPerformed(evt);
            }
        });

        txfCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfCamposActionPerformed(evt);
            }
        });

        lblImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblImagen.setOpaque(true);

        btnAgregarImagen.setText("Agregar Imagen");
        btnAgregarImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarImagenMouseClicked(evt);
            }
        });

        lblRango.setBackground(new java.awt.Color(255, 102, 51));
        lblRango.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblRango.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRango.setText("Rango");
        lblRango.setOpaque(true);

        txfRango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfRangoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPanelBackground1Layout = new javax.swing.GroupLayout(pnlPanelBackground1);
        pnlPanelBackground1.setLayout(pnlPanelBackground1Layout);
        pnlPanelBackground1Layout.setHorizontalGroup(
            pnlPanelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPanelBackground1Layout.createSequentialGroup()
                .addGroup(pnlPanelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPanelBackground1Layout.createSequentialGroup()
                        .addGroup(pnlPanelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPanelBackground1Layout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(btnAgregarImagen)
                                .addGap(18, 18, 18)
                                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlPanelBackground1Layout.createSequentialGroup()
                                .addGap(350, 350, 350)
                                .addComponent(lblCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlPanelBackground1Layout.createSequentialGroup()
                        .addGroup(pnlPanelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPanelBackground1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(lblNivelAparicion, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlPanelBackground1Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addGroup(pnlPanelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRango, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlPanelBackground1Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(pnlPanelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCantidadGolpes, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlPanelBackground1Layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addGroup(pnlPanelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblVida, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDaño, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTipoEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlPanelBackground1Layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addGroup(pnlPanelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPanelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txfNombre)
                                .addComponent(cbxTipoEspecial, 0, 238, Short.MAX_VALUE)
                                .addComponent(txfVida)
                                .addComponent(txfDaño)
                                .addComponent(txfCantidadGolpes)
                                .addComponent(txfNivel)
                                .addComponent(txfNivelAparicion)
                                .addComponent(txfCampos)
                                .addComponent(txfRango))
                            .addComponent(cbxTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pnlPanelBackground1Layout.setVerticalGroup(
            pnlPanelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPanelBackground1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlPanelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPanelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(pnlPanelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxTipoEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipoEspecial))
                .addGap(18, 18, 18)
                .addGroup(pnlPanelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVida)
                    .addComponent(txfVida, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPanelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfDaño, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDaño))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPanelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfCantidadGolpes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCantidadGolpes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPanelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNivel))
                .addGroup(pnlPanelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPanelBackground1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(pnlPanelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCampos))
                        .addGap(25, 25, 25)
                        .addGroup(pnlPanelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfNivelAparicion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNivelAparicion))
                        .addGap(34, 34, 34)
                        .addGroup(pnlPanelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImagen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregarImagen, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(pnlPanelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txfRango, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblRango)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        btnCrearPersonaje.setText("Crear Personaje");
        btnCrearPersonaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearPersonajeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(pnlPanelBackground1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCrearPersonaje)
                .addGap(199, 199, 199))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(pnlPanelBackground1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnCrearPersonaje)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoActionPerformed
        aparecerTipoPersonaje();
    }//GEN-LAST:event_cbxTipoActionPerformed

    private void txfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombreActionPerformed

    private void cbxTipoEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoEspecialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTipoEspecialActionPerformed

    private void txfCantidadGolpesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfCantidadGolpesActionPerformed
        String input = txfCantidadGolpes.getText();
                try {
                    double number = Double.parseDouble(input);
                    isValid[0] = true;
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "No es un número válido.");
                    isValid[0] = false;
                }
    }//GEN-LAST:event_txfCantidadGolpesActionPerformed

    private void txfDañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfDañoActionPerformed
        String input = txfDaño.getText();
                try {
                    double number = Double.parseDouble(input);
                    isValid[1] = true;
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "No es un número válido.");
                     isValid[1] = false;
                }
    }//GEN-LAST:event_txfDañoActionPerformed

    private void txfNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNivelActionPerformed
        String input = txfNivel.getText();
                try {
                    double number = Double.parseDouble(input);
                    isValid[2] = true;
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "No es un número válido.");
                     isValid[2]= false;
                }
    }//GEN-LAST:event_txfNivelActionPerformed

    private void txfNivelAparicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNivelAparicionActionPerformed
        String input = txfNivelAparicion.getText();
                try {
                    double number = Double.parseDouble(input);
                    isValid[3] = true;
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "No es un número válido.");
                     isValid[3] = false;
                }
    }//GEN-LAST:event_txfNivelAparicionActionPerformed

    private void txfCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfCamposActionPerformed
        String input = txfCampos.getText();
                try {
                    double number = Double.parseDouble(input);
                    isValid[4] = true;
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "No es un número válido.");
                    isValid[4] = false;
                }
    }//GEN-LAST:event_txfCamposActionPerformed

    private void txfVidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfVidaActionPerformed
        String input = txfVida.getText();
                try {
                    double number = Double.parseDouble(input);
                   isValid[5] = true;
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "No es un número válido.");
                     isValid[5] = false;
                }
    }//GEN-LAST:event_txfVidaActionPerformed

    private void btnCrearPersonajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearPersonajeMouseClicked
        if(verificarTextos()){
            String nombre = txfNombre.getText();
            int vida = Integer.parseInt(txfVida.getText());
            int cantidad_golpes = Integer.parseInt(txfCantidadGolpes.getText());
            int nivel = Integer.parseInt(txfNivel.getText());
            int campos = Integer.parseInt(txfCampos.getText());
            int nivel_aparicion = Integer.parseInt(txfNivelAparicion.getText());
            int rango = Integer.parseInt(txfRango.getText());
            int daño = Integer.parseInt(txfDaño.getText());
            
            
            
            
            JOptionPane.showMessageDialog(this, "Se ha creado un " + cbxTipo.getSelectedItem() + " exitosamente");
            if((String)cbxTipo.getSelectedItem() == "ZOMBIE"){
                for (int i = 0; i < isValid.length-1; i++) {
                    isValid[i] = false;
                }
                
                Personaje p1 = new Zombie(zombies[cbxTipoEspecial.getSelectedIndex()], nombre, vida, cantidad_golpes, nivel, campos, nivel_aparicion, (String)cbxTipo.getSelectedItem(), rango, daño, rutaImagen);
                arreglo.add(p1);
                System.out.println(p1.toString());
            }else{
                for (int i = 0; i < isValid.length-1; i++) {
                    isValid[i] = false;
                }
                Personaje p1 = new Defensa(defensas[cbxTipoEspecial.getSelectedIndex()], nombre, vida, cantidad_golpes, nivel, campos, nivel_aparicion, (String)cbxTipo.getSelectedItem(), rango, daño, rutaImagen);
                arreglo.add(p1);
                System.out.println(p1.toString());
            }
            FileManager.writeObject(arreglo, "nuevopath.dat");
        }
        else{
            JOptionPane.showMessageDialog(this, "Error, no se ha creado el personaje");
        }
    }//GEN-LAST:event_btnCrearPersonajeMouseClicked

    private void btnAgregarImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarImagenMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos GIF", "gif");
        fileChooser.setFileFilter(filter);

                int resultado = fileChooser.showOpenDialog(this);
                if (resultado == JFileChooser.APPROVE_OPTION) {
                    try{
                    File archivoSeleccionado = fileChooser.getSelectedFile();
                    ImageIcon imagen = new ImageIcon(archivoSeleccionado.getAbsolutePath());
                    rutaImagen = archivoSeleccionado.getAbsolutePath();
                    Image imagenRedimensionada = imagen.getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_REPLICATE);
                    
                    lblImagen.setIcon(new ImageIcon(imagenRedimensionada));
                    isValid[7] = true;
                    
  
                    
                    
                    }catch(Exception e1){
                        System.out.println("No se ha encontrado la imagen");
                    
                    }
                }
    }//GEN-LAST:event_btnAgregarImagenMouseClicked

    private void txfRangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfRangoActionPerformed
        String input = txfRango.getText();
                try {
                    double number = Double.parseDouble(input);
                   isValid[6] = true;
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "No es un número válido.");
                     isValid[6] = false;
                }
    }//GEN-LAST:event_txfRangoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
    // esta funcion cambia el combo box del tipo por los enums dependiendo del personaje
    private void aparecerTipoPersonaje(){
        if(cbxTipo.getSelectedItem().equals("ZOMBIE")){
            cbxTipoEspecial.removeAllItems();
            System.out.println("Esto es zombi");
            TipoZombie[] values = TipoZombie.values();
            String[] enumNames = new String[values.length-1];
            for (int i = 0; i < values.length-1; i++) {
            enumNames[i] = values[i].getNombre();
            cbxTipoEspecial.addItem(enumNames[i]);
            cbxTipoEspecial.repaint();
            }
        }
        else if(cbxTipo.getSelectedItem().equals("DEFENSA")){
            cbxTipoEspecial.removeAllItems();
            System.out.println("Esto es una defensa");
            TipoDefensa[] values = TipoDefensa.values();
            String[] enumNames = new String[values.length-1];
            for (int i = 0; i < values.length-1; i++) {
            enumNames[i] = values[i].getNombre();
            cbxTipoEspecial.addItem(enumNames[i]);
            cbxTipoEspecial.repaint();
            }
        } 
    }
    // funcion que verifica la GUI para saber si añadir los personajes
//    private boolean verificarGUI(){
//    
//    
//    }

    public ArrayList<Personaje> getArreglo() {
        return arreglo;
    }
    // funcion que verifica los textos de la gui
    private boolean verificarTextos(){
        for (int i = 0; i < isValid.length; i++) {
            if(isValid[i] == false)
                return false;
        }
        return true;
    
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarImagen;
    private javax.swing.JButton btnCrearPersonaje;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JComboBox<String> cbxTipoEspecial;
    private javax.swing.JLabel lblCampos;
    private javax.swing.JLabel lblCantidadGolpes;
    private javax.swing.JLabel lblCrear;
    private javax.swing.JLabel lblDaño;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblNivelAparicion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRango;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTipoEspecial;
    private javax.swing.JLabel lblVida;
    private javax.swing.JPanel pnlPanelBackground1;
    private javax.swing.JTextField txfCampos;
    private javax.swing.JTextField txfCantidadGolpes;
    private javax.swing.JTextField txfDaño;
    private javax.swing.JTextField txfNivel;
    private javax.swing.JTextField txfNivelAparicion;
    private javax.swing.JTextField txfNombre;
    private javax.swing.JTextField txfRango;
    private javax.swing.JTextField txfVida;
    // End of variables declaration//GEN-END:variables
}
