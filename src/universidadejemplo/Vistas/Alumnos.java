package universidadejemplo.Vistas;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import universidadejemplo.conexionBaseDatos.alumnoData;
import universidadejemplo.entidades.Alumno;

public class Alumnos extends javax.swing.JInternalFrame {

    FondoPanel fondo = new FondoPanel();
    private int idAlumnoSeleccionado = -1;
    alumnoData ad = new alumnoData();

    public Alumnos() {
        this.setContentPane(fondo);
        initComponents();
        cargarCombo();
        desHabilitarBotones();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanel();
        jlTitulo = new javax.swing.JLabel();
        jlDoc = new javax.swing.JLabel();
        jlAp = new javax.swing.JLabel();
        jlNom = new javax.swing.JLabel();
        jlFecha = new javax.swing.JLabel();
        jlEst = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jdFecha = new com.toedter.calendar.JDateChooser();
        jrbEstado = new javax.swing.JRadioButton();
        jtApellido = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jbNuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jlEstDescrip = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jtDocumento = new javax.swing.JTextField();
        jlDoc1 = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setName(""); // NOI18N

        jlTitulo.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jlTitulo.setText("Alumno");

        jlDoc.setBackground(new java.awt.Color(255, 255, 255));
        jlDoc.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jlDoc.setText("Busqueda :");

        jlAp.setBackground(new java.awt.Color(255, 255, 255));
        jlAp.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jlAp.setText("Apellido :");

        jlNom.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jlNom.setText("Nombre :");

        jlFecha.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jlFecha.setText("Fecha :");

        jlEst.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jlEst.setText("Estado");

        jbBuscar.setBackground(new java.awt.Color(255, 153, 102));
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Buscar.png"))); // NOI18N
        jbBuscar.setBorder(null);
        jbBuscar.setBorderPainted(false);
        jbBuscar.setOpaque(false);
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jrbEstado.setSelected(true);
        jrbEstado.setOpaque(false);
        jrbEstado.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jrbEstadoStateChanged(evt);
            }
        });

        jtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtApellidoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtApellidoKeyTyped(evt);
            }
        });

        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreKeyTyped(evt);
            }
        });

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jlEstDescrip.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jlEstDescrip.setText("Activo");

        jtDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtDocumentoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDocumentoKeyTyped(evt);
            }
        });

        jlDoc1.setBackground(new java.awt.Color(255, 255, 255));
        jlDoc1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jlDoc1.setText("Documento :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlEst)
                    .addComponent(jbNuevo)
                    .addComponent(jlFecha))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jrbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlEstDescrip)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jbModificar)
                        .addGap(18, 18, 18)
                        .addComponent(jbEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlAp)
                            .addComponent(jlDoc1)
                            .addComponent(jlDoc)
                            .addComponent(jlNom))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jlTitulo)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jlTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlDoc)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDoc1))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlAp)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlNom)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlFecha)
                    .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jlEst)
                        .addComponent(jrbEstado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlEstDescrip)
                        .addGap(1, 1, 1)))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jbEliminar)
                    .addComponent(jbModificar)
                    .addComponent(jbNuevo))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        Alumno alumnoSelecionado = (Alumno) jComboBox1.getSelectedItem();
        ad.eliminarAlumno(alumnoSelecionado.getDni());
        limpiarcampos();
        //Deshabilito botones luego de ejecutar acccion!
        desHabilitarBotones();
        cargarCombo();
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

        try {
            Alumno alumnoSelecionado = (Alumno) jComboBox1.getSelectedItem();
            boolean activo = jrbEstado.isSelected();
            Alumno ae = ad.buscarAlumnoPorDni(alumnoSelecionado.getDni(), activo);
            if (ae != null) {
                jtDocumento.setText(String.valueOf(ae.getDni()));
                jtApellido.setText(ae.getApellido());
                jtNombre.setText(ae.getNombre());
                jdFecha.setDate(java.sql.Date.valueOf(ae.getFechaN()));
                jrbEstado.setSelected(ae.isActivo());
                idAlumnoSeleccionado = ae.getIdAlumno();
                //habilito botones luego de ejecutar acccion!
                //Habilito botones si esta todo OK!
                if(ae.isActivo()==true){
                      habilitarBusquedaBotones();
                } else {
                desHabilitarBotones(); 
                jbModificar.setEnabled(true);

                }

            } else {
                //Controlo el estado de la respuesta de la consulta y respondo 
                //segun parametros obtenidos
                if (activo == true) {
                    JOptionPane.showMessageDialog(this, "No existe un alumno Activo con ese DNI");
                } else if (activo == false) {
                    JOptionPane.showMessageDialog(this, "No existe un alumno Inactivo con ese DNI");
                } else {
                    JOptionPane.showMessageDialog(this, "No existe un alumno con ese DNI");
                }

            }
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "Solo se admiten numeros y no debe estar vacio");
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        guardar();

    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        if (idAlumnoSeleccionado != -1) { // Verifica que se haya seleccionado un alumno
            modificar(); // Llama al método modificar solo si se ha seleccionado un alumno
            limpiarcampos();
            //Deshabilito botones luego de ejecutar acccion!
            desHabilitarBotones();
            cargarCombo();
        } else {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un alumno antes de guardar.");
        }

    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this, "Estás seguro que quieres salir?", "Cerrar Ventana", JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {

            this.dispose();//cierro la ventana
        }
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jrbEstadoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jrbEstadoStateChanged
        if (jrbEstado.isSelected() == true) {
            jlEstDescrip.setText("Activo");
        } else {
            jlEstDescrip.setText("Inactivo");
        }

    }//GEN-LAST:event_jrbEstadoStateChanged

    private void jtApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtApellidoKeyReleased
        if (!jtDocumento.getText().isEmpty() && !jtApellido.getText().isEmpty() && !jtNombre.getText().isEmpty()) {
            habilitarBotones();
        } else {
            desHabilitarBotones();
        }
    }//GEN-LAST:event_jtApellidoKeyReleased

    private void jtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyReleased
        if (!jtDocumento.getText().isEmpty() && !jtApellido.getText().isEmpty() && !jtNombre.getText().isEmpty()) {
            habilitarBotones();
        } else {
            desHabilitarBotones();
        }
    }//GEN-LAST:event_jtNombreKeyReleased

    private void jtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtApellidoKeyTyped
        //Solo dejo introducir letras
        char key = evt.getKeyChar();

        boolean esLetra = Character.isLetter(key) || key == ' ';

        if (!esLetra) {
            evt.consume();
        }
    }//GEN-LAST:event_jtApellidoKeyTyped

    private void jtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyTyped
        //Solo dejo introducir letras
        char key = evt.getKeyChar();

        boolean esLetra = Character.isLetter(key) || key == ' ';

        if (!esLetra) {
            evt.consume();
        }
    }//GEN-LAST:event_jtNombreKeyTyped

    private void jtDocumentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDocumentoKeyReleased
        if (!jtDocumento.getText().isEmpty() && !jtApellido.getText().isEmpty() && !jtNombre.getText().isEmpty()) {
            habilitarBotones();
        } else {
            desHabilitarBotones();
        }
    }//GEN-LAST:event_jtDocumentoKeyReleased

    private void jtDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDocumentoKeyTyped
     //Solo dejo introducir numeros 
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57;
        if (!numero) {
            evt.consume();
        }
    }//GEN-LAST:event_jtDocumentoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Alumno> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JLabel jlAp;
    private javax.swing.JLabel jlDoc;
    private javax.swing.JLabel jlDoc1;
    private javax.swing.JLabel jlEst;
    private javax.swing.JLabel jlEstDescrip;
    private javax.swing.JLabel jlFecha;
    private javax.swing.JLabel jlNom;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDocumento;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables

    public void guardar() {
        try {
           if (!jtDocumento.getText().isEmpty() && !jtApellido.getText().isEmpty() && !jtNombre.getText().isEmpty() && jdFecha.getDate() != null && jrbEstado.isSelected() == true) {
                // habilitarBotones();
                //int dni = Integer.parseInt(jtDocumento.getText());
                Alumno alumnoSelecionado = (Alumno) jComboBox1.getSelectedItem();
                int dni = Integer.parseInt(jtDocumento.getText());
                String ap = jtApellido.getText();
                String nom = jtNombre.getText();
                LocalDate fechaNacimiento = jdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                boolean est = jrbEstado.isSelected();
                Alumno nuevo = new Alumno(dni, ap, nom, fechaNacimiento, est);
                ad.guardarAlumno(nuevo);
                limpiarcampos();
                desHabilitarBotones();
                cargarCombo();
            } else {
                JOptionPane.showMessageDialog(this, "No debe dejar campos vacios");
            }

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No debe dejar campos vacios");
        }
    }

    public void modificar() {
        try {
            Alumno alumnoSelecionado = (Alumno) jComboBox1.getSelectedItem();
            int dni = Integer.parseInt(jtDocumento.getText());
            String ap = jtApellido.getText();
            String nom = jtNombre.getText();
            LocalDate fechaNacimiento = jdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            boolean est = jrbEstado.isSelected();            
            Alumno nuevom = new Alumno(alumnoSelecionado.getIdAlumno(),alumnoSelecionado.getDni(), ap, nom, fechaNacimiento, est);
            ad.modificarAlumno(nuevom);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Error al modificar" + e.getMessage());
        }
    }
    public void limpiarcampos(){
        //Cintia: Agrego limpieza de campos
            jtDocumento.setText("");
            jtApellido.setText("");
            jtNombre.setText("");
            jdFecha.setDate(null);
            jrbEstado.setSelected(true);
    
    
    }
    public void habilitarBotones() {

        // jbEliminar.setEnabled(true);
        //jbModificar.setEnabled(true);
        jbNuevo.setEnabled(true);
    }

    public void habilitarBusquedaBotones() {

        jbEliminar.setEnabled(true);
        jbModificar.setEnabled(true);
        jbNuevo.setEnabled(false);
    }

    public void desHabilitarBotones() {
        jbEliminar.setEnabled(false);
        jbModificar.setEnabled(false);
        jbNuevo.setEnabled(false);
    }

    private void cargarCombo() {
        jComboBox1.removeAllItems();
        alumnoData ad = new alumnoData();
        List<Alumno> alumnos = ad.listarAlumnos();

        jComboBox1.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

                if (value instanceof Alumno) {
                    Alumno alumno = (Alumno) value;

                    if (alumno.isActivo() == false) {
                        setForeground(Color.RED); // Cambia el color del texto a rojo si el estado es 0
                    } else {
                        setForeground(Color.BLACK); // Restablece el color del texto a negro
                    }
                }

                return this;
            }
        });

        for (Alumno alumno : alumnos) {

            jComboBox1.addItem(alumno);
        }
    }

    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/images/fondochico.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }

    }

}