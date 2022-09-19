package gui;

import clases.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *                        Imagenes obtenidas de https://www.iconfinder.com/
 * @author Olman
 */
public final class Gui extends javax.swing.JFrame {
    private ImageIcon imagen;
    private Icon icono;
    
    Metodos metodos = new Metodos();
    
    DefaultTableModel tabla_Rank = new DefaultTableModel(); //Instanciador para la jtable que va a mostrar los ranks
    DefaultTableModel tabla_RankAdicion = new DefaultTableModel(); 
    
    double puntosPais;
    String nombrePais;
     
    public Gui() {   
        initComponents();
        this.setTitle("FIFA-Femenino"); //Título de la ventana de la GUI.
        this.setLocationRelativeTo(null); //Centrar la ventana de la GUI.     
        insertarImagenes();
        
        tabla_Rank = (DefaultTableModel)this.jTable_Ranking.getModel();
        tabla_RankAdicion = (DefaultTableModel)this.jTable_RankAdicion.getModel();
        
        metodos.datosPais(); //datos de los paises
        metodos.QuickSort(metodos.arrayPais, 0, metodos.arrayPais.length-1); //ordenarlo por quicksort descendente
        llenarTablaDatos(); //Llenar la tabla ranking 
        llenarTablaAdicion();//Llenar la tabla rankingAdicion

    }
    
     public void llenarTablaDatos() {
        
         for (Pais obj : metodos.arrayPais) {
              
             tabla_Rank.addRow(new Object[]{
                 
                 obj.getNombre(), obj.getPuntos()
                  
             }); 
         }  
        
    }
     
     public void llenarTablaAdicion(){     
         for (Pais obj : metodos.arrayPais) {
              
             tabla_RankAdicion.addRow(new Object[]{
                 
                 obj.getNombre(), obj.getPuntos()
                  
             }); 
         }  
     }
     
     public void refrescarTablas(){
        int fila;
        //Borrar datos de tablas 
        fila = tabla_RankAdicion.getRowCount();

        for(int i = fila-1;i >=0; i--){  
         tabla_RankAdicion.removeRow(i);
         tabla_Rank.removeRow(i);
         
        } 
        
    }
     
    public void reset(){
        this.txt_Puntos.setText("");
        this.txt_Puntos.setEnabled(false);
        this.btn_GuardarPuntos.setEnabled(false);
        this.label_Mensaje.setText("#Click en el pais a adicionar puntos");
    }
    
    public void ajustarImagen(JLabel lbl, String ruta){
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(
                lbl.getWidth(), 
                lbl.getHeight(), 
                Image.SCALE_DEFAULT
             )   
      );
      lbl.setIcon(this.icono);
      this.repaint();      
    }
    
    public void insertarImagenes(){
        this.ajustarImagen(this.label_Imagen1, "src\\com\\images\\fifalogo.png");
        this.ajustarImagen(this.label_Imagen2, "src\\com\\images\\ranking.png"); 
        this.ajustarImagen(this.label_Imagen3, "src\\com\\images\\girlplayer.png"); 
        this.ajustarImagen(this.label_Imagen4, "src\\com\\images\\balonAdidasAzul.png"); 
        this.ajustarImagen(this.label_Imagen5, "src\\com\\images\\balonAdidasRojo.png"); 
        this.ajustarImagen(this.label_Imagen6, "src\\com\\images\\fifalogo.png"); 
        this.ajustarImagen(this.label_Imagen7, "src\\com\\images\\girlplayer.png"); 
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Ranking = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        label_Imagen1 = new javax.swing.JLabel();
        label_Imagen2 = new javax.swing.JLabel();
        label_Imagen3 = new javax.swing.JLabel();
        btn_Salir1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_RankAdicion = new javax.swing.JTable();
        txt_Puntos = new javax.swing.JTextField();
        label_Mensaje = new javax.swing.JLabel();
        btn_GuardarPuntos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        label_Imagen4 = new javax.swing.JLabel();
        label_Imagen5 = new javax.swing.JLabel();
        label_Imagen6 = new javax.swing.JLabel();
        label_Imagen7 = new javax.swing.JLabel();
        btn_Salir = new javax.swing.JButton();
        label_MensajeAscenso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelPrincipal.setBackground(new java.awt.Color(0, 102, 153));

        jTabbedPane1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(102, 255, 153));

        jTable_Ranking.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTable_Ranking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Puntos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Ranking.setEnabled(false);
        jTable_Ranking.setRowHeight(30);
        jTable_Ranking.getTableHeader().setResizingAllowed(false);
        jTable_Ranking.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable_Ranking);
        if (jTable_Ranking.getColumnModel().getColumnCount() > 0) {
            jTable_Ranking.getColumnModel().getColumn(0).setResizable(false);
            jTable_Ranking.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setText("Ranking FIFA Femenino");

        btn_Salir1.setBackground(new java.awt.Color(255, 0, 0));
        btn_Salir1.setText("Salir");
        btn_Salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Salir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_Imagen1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_Imagen3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_Imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(143, 143, 143))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_Salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_Salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addComponent(label_Imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(label_Imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_Imagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))))
        );

        jTabbedPane1.addTab("Mostrar Ranking", jPanel1);

        jPanel2.setBackground(new java.awt.Color(102, 255, 153));

        jTable_RankAdicion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTable_RankAdicion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Puntos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_RankAdicion.setRowHeight(30);
        jTable_RankAdicion.setSelectionBackground(new java.awt.Color(0, 102, 153));
        jTable_RankAdicion.getTableHeader().setResizingAllowed(false);
        jTable_RankAdicion.getTableHeader().setReorderingAllowed(false);
        jTable_RankAdicion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_RankAdicionMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_RankAdicion);
        if (jTable_RankAdicion.getColumnModel().getColumnCount() > 0) {
            jTable_RankAdicion.getColumnModel().getColumn(0).setResizable(false);
            jTable_RankAdicion.getColumnModel().getColumn(1).setResizable(false);
        }

        txt_Puntos.setEnabled(false);
        txt_Puntos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_PuntosKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PuntosKeyTyped(evt);
            }
        });

        label_Mensaje.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        label_Mensaje.setText("#Click en el pais a adicionar puntos");

        btn_GuardarPuntos.setBackground(new java.awt.Color(0, 102, 153));
        btn_GuardarPuntos.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btn_GuardarPuntos.setText("Guardar");
        btn_GuardarPuntos.setEnabled(false);
        btn_GuardarPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarPuntosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("Lista paises FIFA Femenino");

        btn_Salir.setBackground(new java.awt.Color(255, 0, 0));
        btn_Salir.setText("Salir");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        label_MensajeAscenso.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_Imagen7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_Imagen6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_MensajeAscenso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(183, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_Puntos, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_GuardarPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_Mensaje)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(label_Imagen4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_Imagen5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(65, 65, 65)
                        .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(label_Imagen4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_Imagen5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(label_Imagen6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_Imagen7, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(label_MensajeAscenso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(label_Mensaje)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Puntos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_GuardarPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Adicion de puntos", jPanel2);

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_RankAdicionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_RankAdicionMouseClicked
        //Pasar un auxiliar el indice de la tabla seleccionada
        int indice = jTable_RankAdicion.rowAtPoint(evt.getPoint());
        //Obtener los puntos del pais clickeado
        puntosPais = Double.valueOf(tabla_RankAdicion.getValueAt(indice, 1).toString());
        nombrePais = tabla_RankAdicion.getValueAt(indice, 0).toString();
        //Habilitar botones de la pantalla adopción si se marca un tipo
        if(indice >= 0){
            this.label_Mensaje.setText("Digite los puntos adicionales para " + nombrePais);      
            this.txt_Puntos.setEnabled(true);
            
        }
    }//GEN-LAST:event_jTable_RankAdicionMouseClicked

    private void btn_GuardarPuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarPuntosActionPerformed
        double puntosAdicionales = Double.valueOf(this.txt_Puntos.getText()); //Puntos adicionales
        puntosAdicionales = Math.round(puntosAdicionales * 100.00)/100.00; //redondea los decimales a 2 maximo
        //Sumar los puntos del pais con los puntos adicionales
        puntosAdicionales = puntosPais + puntosAdicionales;
        
        for (int i = 0; i < metodos.arrayPais.length; i++) {
            //Condicional para encontrar y asignar los puntos sumados al pais seleccionado
            if(metodos.arrayPais[i].getNombre().equals(nombrePais)){
                int indicePais = i;//atrapa el indice de la igualación
                metodos.arrayPais[indicePais].setPuntos(puntosAdicionales); //asigna el total de la suma al pais indice
            }
        }
        
        //Ordenar los datos insertados a la array con la funcion QuickSort y Actualiza las tablas
        refrescarTablas();      
        metodos.QuickSort(metodos.arrayPais, 0, metodos.arrayPais.length-1);
        llenarTablaAdicion();
        llenarTablaDatos();
        reset();
        
    }//GEN-LAST:event_btn_GuardarPuntosActionPerformed

    private void txt_PuntosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PuntosKeyReleased
        if(!txt_Puntos.getText().isEmpty()){
             this.btn_GuardarPuntos.setEnabled(true);          
         }else{
             this.btn_GuardarPuntos.setEnabled(false);
         }
    }//GEN-LAST:event_txt_PuntosKeyReleased

    private void txt_PuntosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PuntosKeyTyped
        char caracter = evt.getKeyChar();

        if(((caracter < '0' || caracter > '9'))
            && (caracter != KeyEvent.VK_BACK_SPACE)
            && ((caracter != '.') || this.txt_Puntos.getText().contains("."))) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txt_PuntosKeyTyped

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void btn_Salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Salir1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_Salir1ActionPerformed

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
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_GuardarPuntos;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JButton btn_Salir1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable_RankAdicion;
    private javax.swing.JTable jTable_Ranking;
    private javax.swing.JLabel label_Imagen1;
    private javax.swing.JLabel label_Imagen2;
    private javax.swing.JLabel label_Imagen3;
    private javax.swing.JLabel label_Imagen4;
    private javax.swing.JLabel label_Imagen5;
    private javax.swing.JLabel label_Imagen6;
    private javax.swing.JLabel label_Imagen7;
    private javax.swing.JLabel label_Mensaje;
    private javax.swing.JLabel label_MensajeAscenso;
    private javax.swing.JTextField txt_Puntos;
    // End of variables declaration//GEN-END:variables
}
