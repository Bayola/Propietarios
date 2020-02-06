package prop;

import com.teamdev.jxmaps.LatLng;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Vista_Ruta extends javax.swing.JFrame {

    final map.Ruta example = new map.Ruta("PoliDriver");
    Double distancia =0.0;
    String tiempo = "";
    String ganancia = "";
    String gananciaPolidriver = "";

    //AbrirSite site = new AbrirSite();
    public Vista_Ruta() {
        initComponents();
        //   site.abrirPanel("C:\\Users\\brant\\Desktop\\compartida\\programa\\Propietarios\\src\\prop\\Mapa.java", jPanel4);

        jPanel2.add(example, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 550));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 173, 199));
        jPanel1.setName("POLIDRIVER"); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 30));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("CIUDAD DE ORIGEN:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("DISTANCIA:");
        jLabel3.setPreferredSize(new java.awt.Dimension(110, 29));
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 100, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar:", "Ibarra", "Guayaquil", "Latacunga", "Loja", "Quito", "Santo Domingo", " " }));
        jComboBox2.setToolTipText("");
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 130, -1));

        jButton2.setText("CALCULAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        jTextField1.setEnabled(false);
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 110, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("GANANCIA POLIDRIVER:");
        jLabel4.setPreferredSize(new java.awt.Dimension(110, 29));
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 270, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("CIUDAD DE DESTINO:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("TIEMPO ESTIMADO:");
        jLabel7.setPreferredSize(new java.awt.Dimension(110, 29));
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 240, -1));

        jTextField3.setEnabled(false);
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 110, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("COSTO ESTIMADO:");
        jLabel8.setPreferredSize(new java.awt.Dimension(110, 29));
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 210, -1));

        jTextField4.setEnabled(false);
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 110, -1));

        jTextField2.setEnabled(false);
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 110, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar:", "Ibarra", "Guayaquil", "Latacunga", "Loja", "Quito", "Santo Domingo" }));
        jPanel3.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 130, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 750, 550));

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 1140, 590));

        setSize(new java.awt.Dimension(1188, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        LatLng a = new LatLng(-0.209867, -78.488214);  // QUITO-POLI
        LatLng b = new LatLng(-0.512975, -78.578170);	//MACHACHI
        LatLng c = new LatLng(-0.937311, -78.642562);	//LATACUNGA
        LatLng d = new LatLng(-1.283683, -78.630819);  // AMBATO
        LatLng e = new LatLng(-1.647616, -78.677793);	//RIOBAMBA
        LatLng f = new LatLng(-2.203406, -78.856019);	//ALAUSI
        LatLng g = new LatLng(-2.555270, -78.935676);	//CAÑAR
        LatLng h = new LatLng(-2.745823, -78.835056);	//AZOGUES
        LatLng i = new LatLng(-2.913318, -79.034199);	//CUENCA
        LatLng j = new LatLng(-4.009726, -79.208187);	//LOJA
        LatLng v = new LatLng(-0.406815, -78.546796);	//TAMBILLO
        LatLng q = new LatLng(-0.228708, -79.193860);	//SANTO DOMINGO
        LatLng r = new LatLng(-1.028300, -79.459089);  // QUEVEDO
        LatLng s = new LatLng(-1.786774, -79.527816);	//BABHOYO
        LatLng t = new LatLng(-2.143634, -79.853354);	//GUAYAQUIL
        LatLng u = new LatLng(0.345097, -78.130115);	//IBARRA
        if (jComboBox2.getSelectedItem() == "Quito") {
            if (jComboBox3.getSelectedItem() == "Loja") {

                example.generarRuta(a, b, false);
                example.generarRuta(b, c, false);
                example.generarRuta(c, d, false);
                example.generarRuta(d, e, false);
                example.generarRuta(e, f, false);
                example.generarRuta(f, g, false);
                example.generarRuta(g, h, false);
                example.generarRuta(h, i, false);
                example.generarRuta(i, j, false);

                example.generateMarker(a);
                example.generateMarker(j);

                distancia= example.calcularDistancia(a, j);
                tiempo = "11h23m";
                ganancia = "$45.19";
                gananciaPolidriver = "$9.09";

//example.generateSimplePath(Quito, Loja, true);
            } else if (jComboBox3.getSelectedItem() == "Santo Domingo") {

                example.generarRuta(a, v, false);
                example.generarRuta(v, q, false);

                example.generateMarker(a);
                example.generateMarker(q);

                //distancia = "151km";
                tiempo = "2h57m";
                ganancia = "$9.43";
                gananciaPolidriver = "$1.89";

                //example.generateSimplePath(Quito, Guayaquil, true);
            } else if (jComboBox3.getSelectedItem() == "Guayaquil") {

                example.generarRuta(a, b, false);
                example.generarRuta(b, q, false);
                example.generarRuta(q, r, false);
                example.generarRuta(r, s, false);
                example.generarRuta(s, t, false);

                example.generateMarker(a);
                example.generateMarker(t);

                //distancia = "437km";
                tiempo = "7h44m";
                ganancia = "$26.31";
                gananciaPolidriver = "$5.26";
                //example.generateSimplePath(Quito, Guayaquil, true);
            } else if (jComboBox3.getSelectedItem() == "Latacunga") {

                example.generarRuta(a, b, false);
                example.generarRuta(b, c, false);

                example.generateMarker(a);
                example.generateMarker(c);

               // distancia = "110km";
                tiempo = "1h50m";
                ganancia = "$6.52";
                gananciaPolidriver = "$1.30";
                //example.generateSimplePath(Quito, Latacunga, true);
            } else if (jComboBox3.getSelectedItem() == "Ibarra") {
            
                example.generarRuta(a, u, false);

                example.generateMarker(a);
                example.generateMarker(u);

               // distancia = "113km";
                tiempo = "2h15m";
                ganancia = "$6.72";
                gananciaPolidriver = "$1.34";

            }
        } else if (jComboBox2.getSelectedItem() == "Loja") {
            if (jComboBox3.getSelectedItem() == "Quito") {
                
                example.generarRuta(j, i, false);
                example.generarRuta(i, h, false);
                example.generarRuta(h, g, false);
                example.generarRuta(g, f, false);
                example.generarRuta(f, e, false);
                example.generarRuta(e, d, false);
                example.generarRuta(d, c, false);
                example.generarRuta(c, b, false);
                example.generarRuta(b, a, false);

                example.generateMarker(j);
                example.generateMarker(a);

               // distancia = "723km";
                tiempo = "11h23m";
                ganancia = "$45.19";
                gananciaPolidriver = "$9.09";

            } else if (jComboBox3.getSelectedItem() == "Guayaquil") {
               

                example.generarRuta(j, i, false);
                example.generarRuta(i, h, false);
                example.generarRuta(h, t, false);

                example.generateMarker(j);
                example.generateMarker(t);

                //distancia = "403km";
                tiempo = "6h45m";
                ganancia = "$25.19";
                gananciaPolidriver = "$5.04";

            } else if (jComboBox3.getSelectedItem() == "Santo Domingo") {
                
                example.generarRuta(j, i, false);
                example.generarRuta(i, h, false);
                example.generarRuta(h, t, false);
                example.generarRuta(t, s, false);
                example.generarRuta(s, r, false);
                example.generarRuta(r, q, false);

                example.generateMarker(j);
                example.generateMarker(q);

                //distancia = "638km";
                tiempo = "10h37m";
                ganancia = "$39.87";
                gananciaPolidriver = "$7.97";

            } else if (jComboBox3.getSelectedItem() == "Latacunga") {
               
                example.generarRuta(j, i, false);
                example.generarRuta(i, h, false);
                example.generarRuta(h, e, false);
                example.generarRuta(e, d, false);
                example.generarRuta(d, c, false);

                example.generateMarker(j);
                example.generateMarker(c);

                //distancia = "561km";
                tiempo = "9h40m";
                ganancia = "$35.06";
                gananciaPolidriver = "$7.01";

            } else if (jComboBox3.getSelectedItem() == "Ibarra") {
               

                example.generarRuta(j, i, false);
                example.generarRuta(i, h, false);
                example.generarRuta(h, e, false);
                example.generarRuta(e, d, false);
                example.generarRuta(d, c, false);
                example.generarRuta(c, a, false);
                example.generarRuta(a, u, false);

                example.generateMarker(j);
                example.generateMarker(u);

               // distancia = "776km";
                tiempo = "12h44m";
                ganancia = "$48.50";
                gananciaPolidriver = "$9.70";
            }

        } else if (jComboBox2.getSelectedItem() == "Guayaquil") {
            if (jComboBox3.getSelectedItem() == "Quito") {
                

                example.generarRuta(t, s, false);
                example.generarRuta(s, r, false);
                example.generarRuta(r, q, false);
                example.generarRuta(q, b, false);
                example.generarRuta(b, a, false);

                example.generateMarker(t);
                example.generateMarker(a);

                //distancia = "437km";
                tiempo = "7h44m";
                ganancia = "$26.31";
                gananciaPolidriver = "$5.26";

            } else if (jComboBox3.getSelectedItem() == "Santo Domingo") {
               
                example.generarRuta(t, s, false);
                example.generarRuta(s, r, false);
                example.generarRuta(r, q, false);

                example.generateMarker(t);
                example.generateMarker(q);

                //distancia = "282km";
                tiempo = "4h55m";
                ganancia = "$17.62";
                gananciaPolidriver = "$3.52";

            } else if (jComboBox3.getSelectedItem() == "Loja") {
                example.generarRuta(t, h, false);
                example.generarRuta(h, i, false);
                example.generarRuta(i, j, false);

                example.generateMarker(t);
                example.generateMarker(j);

                //distancia = "403km";
                tiempo = "6h45m";
                ganancia = "$25.19";
                gananciaPolidriver = "$5.04";

            } else if (jComboBox3.getSelectedItem() == "Latacunga") {
         
                example.generarRuta(t, s, false);
                example.generarRuta(s, r, false);
                example.generarRuta(r, c, false);

                example.generateMarker(t);
                example.generateMarker(c);

               // distancia = "316km";
                tiempo = "5h43m";
                ganancia = "$19.72";
                gananciaPolidriver = "$3.94";

            } else if (jComboBox3.getSelectedItem() == "Ibarra") {
                

                example.generarRuta(t, s, false);
                example.generarRuta(s, r, false);
                example.generarRuta(r, c, false);
                example.generarRuta(c, b, false);
                example.generarRuta(b, a, false);
                example.generarRuta(a, u, false);

                example.generateMarker(t);
                example.generateMarker(u);

               // distancia = "542km";
                tiempo = "9h35";
                ganancia = "$33.07";
                gananciaPolidriver = "$6.61";

            }
        } else if (jComboBox2.getSelectedItem() == "Ibarra") {
            if (jComboBox3.getSelectedItem() == "Quito") {
             
                example.generarRuta(u, a, false);

                example.generateMarker(u);
                example.generateMarker(a);

               // distancia = "113km";
                tiempo = "2h15m";
                ganancia = "$6.72";
                gananciaPolidriver = "$1.34";
            } else if (jComboBox3.getSelectedItem() == "Guayaquil") {
              

                example.generarRuta(u, a, false);
                example.generarRuta(a, b, false);
                example.generarRuta(b, q, false);
                example.generarRuta(q, r, false);
                example.generarRuta(r, s, false);
                example.generarRuta(s, t, false);

                //distancia = "542km";
                tiempo = "9h35";
                ganancia = "$33.07";
                gananciaPolidriver = "$6.61";

                example.generateMarker(u);
                example.generateMarker(t);

                //example.generateSimplePath(Quito, Guayaquil, true);
            } else if (jComboBox3.getSelectedItem() == "Latacunga") {
                

                example.generarRuta(u, a, false);
                example.generarRuta(a, b, false);
                example.generarRuta(b, c, false);

                example.generateMarker(u);
                example.generateMarker(c);

               // distancia = "212km";
                tiempo = "3h2m";
                ganancia = "$13.28";
                gananciaPolidriver = "$2.66";
                //example.generateSimplePath(Quito, Latacunga, true);
            } else if (jComboBox3.getSelectedItem() == "Loja") {
                

                example.generarRuta(u, a, false);
                example.generarRuta(a, b, false);
                example.generarRuta(b, c, false);
                example.generarRuta(c, d, false);
                example.generarRuta(d, e, false);
                example.generarRuta(e, f, false);
                example.generarRuta(f, g, false);
                example.generarRuta(g, h, false);
                example.generarRuta(h, i, false);
                example.generarRuta(i, j, false);

                example.generateMarker(u);
                example.generateMarker(j);

                //distancia = "776km";
                tiempo = "12h44m";
                ganancia = "$48.50";
                gananciaPolidriver = "$9.70";

            } else if (jComboBox3.getSelectedItem() == "Santo Domingo") {
                

                example.generarRuta(u, a, false);
                example.generarRuta(a, v, false);
                example.generarRuta(v, q, false);

                example.generateMarker(u);
                example.generateMarker(q);

              //  distancia = "266km";
                tiempo = "4h48m";
                ganancia = "$16.62";
                gananciaPolidriver = "$3.32";

                //example.generateSimplePath(Quito, Guayaquil, true);
            }
        } else if (jComboBox2.getSelectedItem() == "Santo Domingo") {
            if (jComboBox3.getSelectedItem() == "Ibarra") {

            

                example.generarRuta(q, v, false);
                example.generarRuta(v, a, false);
                example.generarRuta(a, u, false);

                example.generateMarker(a);
                example.generateMarker(u);

                //distancia = "266km";
                tiempo = "4h48m";
                ganancia = "$16.62";
                gananciaPolidriver = "$3.32";
                //example.generateSimplePath(Quito, Guayaquil, true);
            } else if (jComboBox3.getSelectedItem() == "Guayaquil") {
               

                example.generarRuta(q, r, false);
                example.generarRuta(r, s, false);
                example.generarRuta(s, t, false);

                example.generateMarker(q);
                example.generateMarker(t);

                //distancia = "282km";
                tiempo = "4h55m";
                ganancia = "$17.62";
                gananciaPolidriver = "$3.52";

            } else if (jComboBox3.getSelectedItem() == "Latacunga") {
               

                example.generarRuta(q, b, false);
                example.generarRuta(b, c, false);

                example.generateMarker(q);
                example.generateMarker(c);

               // distancia = "161km";
                tiempo = "3h01m";
                ganancia = "$10.06";
                gananciaPolidriver = "$2.01";

            } else if (jComboBox3.getSelectedItem() == "Loja") {
                

                example.generarRuta(q, r, false);
                example.generarRuta(r, s, false);
                example.generarRuta(s, t, false);
                example.generarRuta(t, h, false);
                example.generarRuta(h, i, false);
                example.generarRuta(i, j, false);

                example.generateMarker(q);
                example.generateMarker(j);

               // distancia = "638km";
                tiempo = "10h37m";
                ganancia = "$39.87";
                gananciaPolidriver = "$7.97";

            } else if (jComboBox3.getSelectedItem() == "Quito") {
              
                example.generarRuta(q, v, false);
                example.generarRuta(v, a, false);

                example.generateMarker(q);
                example.generateMarker(a);

                //distancia = "151km";
                tiempo = "2h57m";
                ganancia = "$9.43";
                gananciaPolidriver = "$1.89";
                //example.generateSimplePath(Quito, Guayaquil, true);
            }
        } else if (jComboBox2.getSelectedItem() == "Latacunga") {
            if (jComboBox3.getSelectedItem() == "Ibarra") {
               

                example.generarRuta(c, b, false);
                example.generarRuta(b, a, false);
                example.generarRuta(a, u, false);

                example.generateMarker(c);
                example.generateMarker(u);

               // distancia = "212km";
                tiempo = "3h2m";
                ganancia = "$13.28";
                gananciaPolidriver = "$2.66";

            } else if (jComboBox3.getSelectedItem() == "Guayaquil") {
                

                example.generarRuta(c, r, false);
                example.generarRuta(r, s, false);
                example.generarRuta(s, t, false);

                example.generateMarker(c);
                example.generateMarker(t);

                //distancia = "316km";
                tiempo = "5h43m";
                ganancia = "$19.72";
                gananciaPolidriver = "$3.94";
            } else if (jComboBox3.getSelectedItem() == "Loja") {
               

                example.generarRuta(c, d, false);
                example.generarRuta(d, e, false);
                example.generarRuta(e, h, false);
                example.generarRuta(h, i, false);
                example.generarRuta(i, j, false);

                example.generateMarker(c);
                example.generateMarker(j);

                //distancia = "561km";
                tiempo = "9h40m";
                ganancia = "$35.06";
                gananciaPolidriver = "$7.01";
                //example.generateSimplePath(Quito, Latacunga, true);
            } else if (jComboBox3.getSelectedItem() == "Quito") {
                

                example.generarRuta(c, b, false);
                example.generarRuta(b, a, false);

                example.generateMarker(c);
                example.generateMarker(a);

              //  distancia = "110km";
                tiempo = "1h50m";
                ganancia = "$6.52";
                gananciaPolidriver = "$1.30";
                //example.generateSimplePath(Quito, Latacunga, true);
            } else if (jComboBox3.getSelectedItem() == "Santo Domingo") {
                
                example.generarRuta(c, b, false);
                example.generarRuta(b, q, false);

                example.generateMarker(c);
                example.generateMarker(q);

                //distancia = "161km";
                tiempo = "3h01m";
                ganancia = "$10.06";
                gananciaPolidriver = "$2.01";

            }

        }

        jTextField3.setText(String.valueOf(distancia));
        jTextField4.setText(tiempo);
        jTextField2.setText(ganancia);
        jTextField1.setText(gananciaPolidriver);
        jComboBox2.enable(false);
        jComboBox3.enable(false);


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed
public void activarElementos(){
jComboBox2.enable();
jComboBox3.enable();
jButton1.enable();
}
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista_Ruta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Ruta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Ruta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Ruta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Ruta().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

}
