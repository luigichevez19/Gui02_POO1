/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.froms;

import com.sv.udb.clases.Ejercicio5;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class FrmEjercicio5 extends javax.swing.JFrame {

    /**
     * Creates new form FrmEjercicio5
     */
    
    Ejercicio5 obj = new Ejercicio5();
    int indicador;
    String indi;
    int operador;
    public FrmEjercicio5() {
        initComponents();
        this.setLocationRelativeTo(null);
       txtDisplay.setEnabled(false);
       indicador = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblUno = new javax.swing.JLabel();
        lblDos = new javax.swing.JLabel();
        lblTres = new javax.swing.JLabel();
        lblCuatro = new javax.swing.JLabel();
        lblCinco = new javax.swing.JLabel();
        lblSeis = new javax.swing.JLabel();
        lblSiete = new javax.swing.JLabel();
        lblOcho = new javax.swing.JLabel();
        lblNueve = new javax.swing.JLabel();
        lblCero = new javax.swing.JLabel();
        txtDisplay = new javax.swing.JTextField();
        lblDot = new javax.swing.JLabel();
        lblEquals = new javax.swing.JLabel();
        lblPlus = new javax.swing.JLabel();
        lblLess = new javax.swing.JLabel();
        lblDivisions = new javax.swing.JLabel();
        lblMultiply = new javax.swing.JLabel();
        lblErarse = new javax.swing.JLabel();
        lblClear = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ejercicio 5");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cakculadora Basica"));

        lblUno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/udb/icon/1486250404_number-one.png"))); // NOI18N
        lblUno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUnoMouseClicked(evt);
            }
        });

        lblDos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/udb/icon/1486250641_number-two.png"))); // NOI18N
        lblDos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDosMouseClicked(evt);
            }
        });

        lblTres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/udb/icon/1486250657_number-three.png"))); // NOI18N
        lblTres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTresMouseClicked(evt);
            }
        });

        lblCuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/udb/icon/1486250666_number-four.png"))); // NOI18N
        lblCuatro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCuatroMouseClicked(evt);
            }
        });

        lblCinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/udb/icon/1486250677_number-five.png"))); // NOI18N
        lblCinco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCincoMouseClicked(evt);
            }
        });

        lblSeis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/udb/icon/1486250685_number-six.png"))); // NOI18N
        lblSeis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSeisMouseClicked(evt);
            }
        });

        lblSiete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/udb/icon/1486250697_number-seven.png"))); // NOI18N
        lblSiete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSieteMouseClicked(evt);
            }
        });

        lblOcho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/udb/icon/1486250709_number-eight.png"))); // NOI18N
        lblOcho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOchoMouseClicked(evt);
            }
        });

        lblNueve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/udb/icon/1486250726_number-nine.png"))); // NOI18N
        lblNueve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNueveMouseClicked(evt);
            }
        });

        lblCero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/udb/icon/1486250743_number-ten.png"))); // NOI18N
        lblCero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCeroMouseClicked(evt);
            }
        });

        txtDisplay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDisplayKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDisplayKeyTyped(evt);
            }
        });

        lblDot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/udb/icon/1486269631_primitive-dot.png"))); // NOI18N
        lblDot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDotMouseClicked(evt);
            }
        });

        lblEquals.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/udb/icon/1486269789_equals-outline.png"))); // NOI18N
        lblEquals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEqualsMouseClicked(evt);
            }
        });

        lblPlus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/udb/icon/1486271256_add.png"))); // NOI18N
        lblPlus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPlusMouseClicked(evt);
            }
        });

        lblLess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/udb/icon/1486271380_Less.png"))); // NOI18N
        lblLess.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLessMouseClicked(evt);
            }
        });

        lblDivisions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/udb/icon/1486271474_division.png"))); // NOI18N
        lblDivisions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDivisionsMouseClicked(evt);
            }
        });

        lblMultiply.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/udb/icon/1486271642_multiplication.png"))); // NOI18N
        lblMultiply.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMultiplyMouseClicked(evt);
            }
        });

        lblErarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/udb/icon/1486273994_locationbar_erase.png"))); // NOI18N
        lblErarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblErarseMouseClicked(evt);
            }
        });

        lblClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/udb/icon/1486274203_letter_C_red.png"))); // NOI18N
        lblClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblCuatro)
                                .addComponent(lblUno)
                                .addComponent(lblSiete, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblDot, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDos)
                            .addComponent(lblCinco)
                            .addComponent(lblOcho)
                            .addComponent(lblCero))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSeis)
                                    .addComponent(lblTres)
                                    .addComponent(lblNueve, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblPlus)
                                        .addComponent(lblLess))
                                    .addComponent(lblDivisions)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblEquals)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMultiply)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblErarse)
                            .addComponent(lblClear)))
                    .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblTres)
                        .addComponent(lblUno)
                        .addComponent(lblDos)
                        .addComponent(lblPlus))
                    .addComponent(lblErarse))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLess)
                            .addComponent(lblCinco)
                            .addComponent(lblSeis)
                            .addComponent(lblCuatro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblClear)
                        .addGap(20, 20, 20)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNueve)
                    .addComponent(lblOcho)
                    .addComponent(lblSiete)
                    .addComponent(lblDivisions))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDot, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEquals)
                            .addComponent(lblMultiply)
                            .addComponent(lblCero))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblUnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUnoMouseClicked
    if(indicador == 0)
    {
    if (obj.getNum() != null)
    {
    indi = (obj.getNum())+ "1";
    obj.setNum(indi);
    txtDisplay.setText(obj.getNum());
    }
    else
    {
     obj.setNum("1");
    txtDisplay.setText(obj.getNum());
    }
    }
    else if(indicador == 1)
    {
    if (obj.getNum2()!= null)
    {
    indi = (obj.getNum2())+ "1";
    obj.setNum2(indi);
    txtDisplay.setText(obj.getNum2());
    }
    else
    {
     obj.setNum2("1");
    txtDisplay.setText(obj.getNum2());
    }
    }
    }//GEN-LAST:event_lblUnoMouseClicked

    private void txtDisplayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDisplayKeyTyped
    if (txtDisplay.getText().contains("."))
    {
        char c=evt.getKeyChar();
        if(c == '.')
        {
        evt.consume();
        }
       
    }
    }//GEN-LAST:event_txtDisplayKeyTyped

    private void lblDosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDosMouseClicked
    if(indicador == 0)
    {
    if (obj.getNum() != null)
    {
    indi = (obj.getNum())+ "2";
    obj.setNum(indi);
    txtDisplay.setText(obj.getNum());
    }
    else
    {
     obj.setNum("2");
    txtDisplay.setText(obj.getNum());
    }
    }
    else if(indicador == 1)
    {
    if (obj.getNum2()!= null)
    {
    indi = (obj.getNum2())+ "2";
    obj.setNum2(indi);
    txtDisplay.setText(obj.getNum2());
    }
    else
    {
     obj.setNum2("2");
    txtDisplay.setText(obj.getNum2());
    }
    }
    }//GEN-LAST:event_lblDosMouseClicked

    private void lblTresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTresMouseClicked
    if(indicador == 0)
    {
    if (obj.getNum() != null)
    {
    indi = (obj.getNum())+ "3";
    obj.setNum(indi);
    txtDisplay.setText(obj.getNum());
    }
    else
    {
     obj.setNum("3");
    txtDisplay.setText(obj.getNum());
    }
    }
    else if(indicador == 1)
    {
    if (obj.getNum2()!= null)
    {
    indi = (obj.getNum2())+ "3";
    obj.setNum2(indi);
    txtDisplay.setText(obj.getNum2());
    }
    else
    {
     obj.setNum2("3");
    txtDisplay.setText(obj.getNum2());
    }
    }
    }//GEN-LAST:event_lblTresMouseClicked

    private void lblCuatroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCuatroMouseClicked
    if(indicador == 0)
    {
    if (obj.getNum() != null)
    {
    indi = (obj.getNum())+ "4";
    obj.setNum(indi);
    txtDisplay.setText(obj.getNum());
    }
    else
    {
     obj.setNum("4");
    txtDisplay.setText(obj.getNum());
    }
    }
    else if(indicador == 1)
    {
    if (obj.getNum2()!= null)
    {
    indi = (obj.getNum2())+ "4";
    obj.setNum2(indi);
    txtDisplay.setText(obj.getNum2());
    }
    else
    {
     obj.setNum2("4");
    txtDisplay.setText(obj.getNum2());
    }
    }
    }//GEN-LAST:event_lblCuatroMouseClicked

    private void lblCincoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCincoMouseClicked
    if(indicador == 0)
    {
    if (obj.getNum() != null)
    {
    indi = (obj.getNum())+ "5";
    obj.setNum(indi);
    txtDisplay.setText(obj.getNum());
    }
    else
    {
     obj.setNum("5");
    txtDisplay.setText(obj.getNum());
    }
    }
    else if(indicador == 1)
    {
    if (obj.getNum2()!= null)
    {
    indi = (obj.getNum2())+ "5";
    obj.setNum2(indi);
    txtDisplay.setText(obj.getNum2());
    }
    else
    {
     obj.setNum2("5");
    txtDisplay.setText(obj.getNum2());
    }
    }
    }//GEN-LAST:event_lblCincoMouseClicked

    private void lblSeisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSeisMouseClicked
    if(indicador == 0)
    {
    if (obj.getNum() != null)
    {
    indi = (obj.getNum())+ "6";
    obj.setNum(indi);
    txtDisplay.setText(obj.getNum());
    }
    else
    {
     obj.setNum("6");
    txtDisplay.setText(obj.getNum());
    }
    }
    else if(indicador == 1)
    {
    if (obj.getNum2()!= null)
    {
    indi = (obj.getNum2())+ "6";
    obj.setNum2(indi);
    txtDisplay.setText(obj.getNum2());
    }
    else
    {
     obj.setNum2("6");
    txtDisplay.setText(obj.getNum2());
    }
    }
    }//GEN-LAST:event_lblSeisMouseClicked

    private void lblSieteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSieteMouseClicked
    if(indicador == 0)
    {
    if (obj.getNum() != null)
    {
    indi = (obj.getNum())+ "7";
    obj.setNum(indi);
    txtDisplay.setText(obj.getNum());
    }
    else
    {
     obj.setNum("7");
    txtDisplay.setText(obj.getNum());
    }
    }
    else if(indicador == 1)
    {
    if (obj.getNum2()!= null)
    {
    indi = (obj.getNum2())+ "7";
    obj.setNum2(indi);
    txtDisplay.setText(obj.getNum2());
    }
    else
    {
     obj.setNum2("7");
    txtDisplay.setText(obj.getNum2());
    }
    }
    }//GEN-LAST:event_lblSieteMouseClicked

    private void lblOchoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOchoMouseClicked
    if(indicador == 0)
    {
    if (obj.getNum() != null)
    {
    indi = (obj.getNum())+ "8";
    obj.setNum(indi);
    txtDisplay.setText(obj.getNum());
    }
    else
    {
     obj.setNum("8");
    txtDisplay.setText(obj.getNum());
    }
    }
    else if(indicador == 1)
    {
    if (obj.getNum2()!= null)
    {
    indi = (obj.getNum2())+ "8";
    obj.setNum2(indi);
    txtDisplay.setText(obj.getNum2());
    }
    else
    {
     obj.setNum2("8");
    txtDisplay.setText(obj.getNum2());
    }
    }
    }//GEN-LAST:event_lblOchoMouseClicked

    private void lblNueveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNueveMouseClicked
    if(indicador == 0)
    {
    if (obj.getNum() != null)
    {
    indi = (obj.getNum())+ "9";
    obj.setNum(indi);
    txtDisplay.setText(obj.getNum());
    }
    else
    {
     obj.setNum("9");
    txtDisplay.setText(obj.getNum());
    }
    }
    else if(indicador == 1)
    {
     
    if (obj.getNum2()!= null)
    {
        JOptionPane.showMessageDialog(this, "Hello world");
    indi = (obj.getNum2())+ "9";
    obj.setNum2(indi);
    txtDisplay.setText(obj.getNum2());
    }
    else
    {
        
     obj.setNum2("9");
    txtDisplay.setText(obj.getNum2());
    }
    }
    }//GEN-LAST:event_lblNueveMouseClicked

    private void lblCeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCeroMouseClicked
    if(indicador == 0)
    {
    if (obj.getNum() != null)
    {
    indi = (obj.getNum())+ "0";
    obj.setNum(indi);
    txtDisplay.setText(obj.getNum());
    }
    else
    {
     obj.setNum("0");
    txtDisplay.setText(obj.getNum());
    }
    }
    else if(indicador == 1)
    {
    if (obj.getNum2()!= null)
    {
    indi = (obj.getNum2())+ "0";
    obj.setNum2(indi);
    txtDisplay.setText(obj.getNum2());
    }
    else
    {
     obj.setNum2("0");
    txtDisplay.setText(obj.getNum2());
    }
    }
    }//GEN-LAST:event_lblCeroMouseClicked

    private void lblEqualsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEqualsMouseClicked
   
    switch(this.operador)
    {
        case 1:
            obj.Suma(obj.getNume(), obj.getNume2());
            break;
            case 2:
             obj.Resta(obj.getNume(), obj.getNume2());
            break;
                case 3:
             obj.Divicion(obj.getNume(), obj.getNume2());
            break;
                    case 4:
             obj.Multiplicacion(obj.getNume(), obj.getNume2());
            break;
    }
    
    txtDisplay.setText(obj.getResultado().toString());
    obj.setNum(obj.getResultado().toString());
        try {
            obj.setNum2(null);
        } catch (Exception e) {
        }
    
    }//GEN-LAST:event_lblEqualsMouseClicked

    private void lblDotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDotMouseClicked
    
    if (!(txtDisplay.getText().contains(".")))
    {
     if(indicador == 0)
    {
    if (obj.getNum() != null)
    {
    indi = (obj.getNum())+ ".";
    obj.setNum(indi);
    txtDisplay.setText(obj.getNum());
    }
    else
    {
     obj.setNum(".");
    txtDisplay.setText(obj.getNum());
    }
    }
    else if(indicador == 1)
    {
    if (obj.getNum2()!= null)
    {
    indi = (obj.getNum2())+ ".";
    obj.setNum2(indi);
    txtDisplay.setText(obj.getNum2());
    }
    else
    {
     obj.setNum2(".");
    txtDisplay.setText(obj.getNum2());
    }
    }
    }
    }//GEN-LAST:event_lblDotMouseClicked

    private void txtDisplayKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDisplayKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDisplayKeyReleased

    private void lblPlusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlusMouseClicked
    indicador = 1;
    operador=1;
    }//GEN-LAST:event_lblPlusMouseClicked

    private void lblErarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblErarseMouseClicked
    if(indicador==0)
    {
    txtDisplay.setText( obj.getNum().substring(0,obj.getNum().length()-1));
    obj.setNum(txtDisplay.getText());
    }
   
    }//GEN-LAST:event_lblErarseMouseClicked

    private void lblLessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLessMouseClicked
    txtDisplay.setText("");
        indicador = 1;
    operador=2;
    }//GEN-LAST:event_lblLessMouseClicked

    private void lblDivisionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDivisionsMouseClicked
   txtDisplay.setText("");
        indicador = 1;
    operador=3;
    }//GEN-LAST:event_lblDivisionsMouseClicked

    private void lblMultiplyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMultiplyMouseClicked
     txtDisplay.setText("");
        indicador = 1;
    operador=4;
    }//GEN-LAST:event_lblMultiplyMouseClicked

    private void lblClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClearMouseClicked
     
        try {
     
    txtDisplay.setText("");
     indicador = 0; 
    obj.setNum(null);
    obj.setNum2(null);
   
    
        } catch (Exception e) {
        }
      
    }//GEN-LAST:event_lblClearMouseClicked

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
            java.util.logging.Logger.getLogger(FrmEjercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEjercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEjercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEjercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEjercicio5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCero;
    private javax.swing.JLabel lblCinco;
    private javax.swing.JLabel lblClear;
    private javax.swing.JLabel lblCuatro;
    private javax.swing.JLabel lblDivisions;
    private javax.swing.JLabel lblDos;
    private javax.swing.JLabel lblDot;
    private javax.swing.JLabel lblEquals;
    private javax.swing.JLabel lblErarse;
    private javax.swing.JLabel lblLess;
    private javax.swing.JLabel lblMultiply;
    private javax.swing.JLabel lblNueve;
    private javax.swing.JLabel lblOcho;
    private javax.swing.JLabel lblPlus;
    private javax.swing.JLabel lblSeis;
    private javax.swing.JLabel lblSiete;
    private javax.swing.JLabel lblTres;
    private javax.swing.JLabel lblUno;
    private javax.swing.JTextField txtDisplay;
    // End of variables declaration//GEN-END:variables
}
