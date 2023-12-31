package universidadejemplo.Vistas;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import universidadejemplo.conexionBaseDatos.alumnoData;
import universidadejemplo.conexionBaseDatos.inscripcionData;
import universidadejemplo.entidades.Alumno;
import universidadejemplo.entidades.Inscripcion;
import universidadejemplo.entidades.Materia;

public class Inscripciones extends javax.swing.JInternalFrame {

    FondoPanel fondo = new FondoPanel();
    DefaultTableModel model = new DefaultTableModel() {
        //dejo editable solo la columna 2
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public Inscripciones() {
        this.setContentPane(fondo);
        initComponents();        
        armarCabecera();//armo cabeceras de la Jtable        
        cargarCombo();//Cargo el combobox con los alumnos
        desHabilitarBotones(); // deshabilito botones , solo dejo salir
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanel();
        jlTitulo = new javax.swing.JLabel();
        jlDoc = new javax.swing.JLabel();
        jlNom = new javax.swing.JLabel();
        jlFecha = new javax.swing.JLabel();
        jlEst = new javax.swing.JLabel();
        jrbInscriptas = new javax.swing.JRadioButton();
        jbInscribir = new javax.swing.JButton();
        jbAnularInsc = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jrbNOinscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();

        setClosable(true);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setName(""); // NOI18N

        jlTitulo.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jlTitulo.setText("Formulario de Inscripción");

        jlDoc.setBackground(new java.awt.Color(255, 255, 255));
        jlDoc.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jlDoc.setText("Seleccione un alumno");

        jlNom.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jlNom.setText("Listado de Materias");

        jlFecha.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jlFecha.setText("Materias no inscriptas");

        jlEst.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jlEst.setText("Materia inscriptas");

        jrbInscriptas.setOpaque(false);
        jrbInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbInscriptasActionPerformed(evt);
            }
        });

        jbInscribir.setText("Inscribir");
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jbAnularInsc.setText("Anular inscripción");
        jbAnularInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnularInscActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jrbNOinscriptas.setOpaque(false);
        jrbNOinscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNOinscriptasActionPerformed(evt);
            }
        });

        jTabla.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTabla);

        jComboBox1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jrbInscriptas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlEst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrbNOinscriptas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlFecha)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jbInscribir)
                        .addGap(31, 31, 31)
                        .addComponent(jbAnularInsc, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jlDoc)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(36, 36, 36))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jlNom))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlTitulo)
                .addGap(111, 111, 111))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jlTitulo)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDoc)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jlNom)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlEst)
                    .addComponent(jrbInscriptas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlFecha)
                        .addComponent(jrbNOinscriptas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbInscribir)
                    .addComponent(jbSalir)
                    .addComponent(jbAnularInsc))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInscriptasActionPerformed
        cargarMateriasInscriptas(); //llamo al metodo cargar materias inscripta

    }//GEN-LAST:event_jrbInscriptasActionPerformed

    private void jrbNOinscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNOinscriptasActionPerformed

        cargarMateriasNoInscriptas();//llamo al metodo cargar materias NO inscripta
    }//GEN-LAST:event_jrbNOinscriptasActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        //codigo para salir del formulario actual
        int respuesta = JOptionPane.showConfirmDialog(this, "Estás seguro que quieres salir?", "Cerrar Ventana", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            this.dispose();//cierro la ventana
        }
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        borrarFilas();
        //deshabilito los radion button
        jrbInscriptas.setSelected(false);
        jrbNOinscriptas.setSelected(false);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        // este modelo es para pasar inscripciones seleccionadas por listas 
        try {
            int[] filasSeleccionadas = jTabla.getSelectedRows();//Armo un array de filas seleccionadas
            inscripcionData insd = new inscripcionData();
            double nota = 0;

            List<Inscripcion> inscripciones = new ArrayList<>(); // armo una listad e inscripciones

            for (int fs : filasSeleccionadas) {
                Materia mat = new Materia((int) model.getValueAt(fs, 0), (String) model.getValueAt(fs, 1), (int) model.getValueAt(fs, 2), true);
                Inscripcion ins = new Inscripcion((Alumno) jComboBox1.getSelectedItem(), mat, nota);//genero la inscripcion
                inscripciones.add(ins);//guardo la inscripcion a la lista
            }
            
            insd.guardarInscripciones(inscripciones);//llamo a inscripciondata y paso la lista de inscripciones
            cargarMateriasNoInscriptas();// vulvo a cargar la tabla
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "No hay nada seleccionado");
        }
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jbAnularInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnularInscActionPerformed
        try {
            int[] filasSeleccionadas = jTabla.getSelectedRows(); // genero un array de filas selccionadas
            inscripcionData insd = new inscripcionData();
            Alumno alu = (Alumno) jComboBox1.getSelectedItem();

            for (int fs : filasSeleccionadas) {
                Materia mat = new Materia((int) model.getValueAt(fs, 0), (String) model.getValueAt(fs, 1), (int) model.getValueAt(fs, 2), true);
                insd.borrarInscripcionMateriaAlumno(alu.getIdAlumno(), mat.getIdMateria());
            }

            JOptionPane.showMessageDialog(this, "Inscripciones anuladas exitosamente");
            cargarMateriasInscriptas();// vuelvo a cargar la tabla
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "No hay nada seleccionado");
        }

    }//GEN-LAST:event_jbAnularInscActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Alumno> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    private javax.swing.JButton jbAnularInsc;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlDoc;
    private javax.swing.JLabel jlEst;
    private javax.swing.JLabel jlFecha;
    private javax.swing.JLabel jlNom;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JRadioButton jrbInscriptas;
    private javax.swing.JRadioButton jrbNOinscriptas;
    // End of variables declaration//GEN-END:variables
 
    /****** Metodos Propios ******/
    

    //metodo de armado y caracterisicas de la tabla
    public void armarCabecera() {
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Año");
        jTabla.setModel(model);
        //Habilito la posibilidad de seleccionar varias filas
        jTabla.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    }

    public void borrarFilas() {
        int f = model.getRowCount() - 1;
        for (; f >= 0; f--) {
            model.removeRow(f);
        }
    }

    public void cargarCombo() {
        jComboBox1.removeAllItems();
        alumnoData ad = new alumnoData();
        ArrayList<Alumno> alumnos = new ArrayList<>();

        for (Alumno alu : ad.listarAlumnosActivos()) {
            alumnos.add(alu);
            jComboBox1.addItem(alu);
        }
    }

    public void cargarTabla() {
        borrarFilas();
        inscripcionData a1 = new inscripcionData();
        if (jrbInscriptas.isSelected() == true) {
            for (Materia m : a1.obtenerMateriasCursadas(jComboBox1.getSelectedIndex())) {
                model.addRow(new Object[]{
                    m.getIdMateria(),
                    m.getNombre(),
                    m.getAnioMateria()
                });
            }
        }
    }

    public void habilitarInscripcion() {

        jbAnularInsc.setEnabled(false);
        jbInscribir.setEnabled(true);

    }

    public void anularInscripcion() {

        jbAnularInsc.setEnabled(true);
        jbInscribir.setEnabled(false);

    }

    public void desHabilitarBotones() {
        jbAnularInsc.setEnabled(false);
        jbInscribir.setEnabled(false);

    }

    private void cargarMateriasInscriptas() {
        jrbNOinscriptas.setSelected(false);
        borrarFilas();
        inscripcionData a1 = new inscripcionData();
        Alumno as = (Alumno) jComboBox1.getSelectedItem();
        if (jrbInscriptas.isSelected()) {
            for (Materia m : a1.obtenerMateriasCursadas(as.getIdAlumno())) {
                model.addRow(new Object[]{
                    m.getIdMateria(),
                    m.getNombre(),
                    m.getAnioMateria()
                });
            }
        }
        anularInscripcion();
    }

    private void cargarMateriasNoInscriptas() {
        jrbInscriptas.setSelected(false);
        borrarFilas();
        inscripcionData a1 = new inscripcionData();
        Alumno alu = (Alumno) jComboBox1.getSelectedItem();
        ArrayList<Materia> mat = (ArrayList) a1.obtenerMateriasNOCursadas(alu.getIdAlumno());
        if (jrbNOinscriptas.isSelected() == true) {
            for (Materia m : mat) {
                model.addRow(new Object[]{
                    m.getIdMateria(),
                    m.getNombre(),
                    m.getAnioMateria()
                });
            }
        }
        habilitarInscripcion();

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
