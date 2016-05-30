/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import model.Dificultad;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javazoom.jlgui.basicplayer.BasicController;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerEvent;
import javazoom.jlgui.basicplayer.BasicPlayerException;
import javazoom.jlgui.basicplayer.BasicPlayerListener;
import model.Juego;
import model.K;
import model.personajes.Flaco;
import model.personajes.Malulo;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author pperezp
 */
public class App extends javax.swing.JFrame implements BasicPlayerListener{
    
    private Thread frasesColores;
    private Thread hRisa;
    private Thread flacoChico;
    private Thread hMalulo;
    private BasicPlayer player;
    private BasicController control;
   
    
    
    public App() {
        try {
            initComponents();
            Juego.init();
            
            setTitle(Juego.TITULO+" "+Juego.VERSION);
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
            this.setLocationRelativeTo(null);
            
            
            
            /*SONIDO*/
            
            
            player = new BasicPlayer();
            control = (BasicController) player;
            
            player.addBasicPlayerListener(this);
            
            control.open(new File(new File("music.mp3").getAbsolutePath()));
            control.play();
            
            /*SONIDO*/
        } catch (BasicPlayerException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblMensaje = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        pnl2 = new javax.swing.JPanel();
        lblPuntaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(1, 1, 1));

        jPanel1.setBackground(new java.awt.Color(1, 1, 1));

        lblMensaje.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje.setText("Pincha mi cara");
        lblMensaje.setOpaque(true);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/flaco.png"))); // NOI18N
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(1, 1, 1));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(254, 254, 254));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Frases malas");

        jRadioButton2.setBackground(new java.awt.Color(1, 1, 1));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(254, 254, 254));
        jRadioButton2.setText("Frases buenas");

        pnl2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPuntaje.setBackground(new java.awt.Color(254, 254, 254));
        lblPuntaje.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblPuntaje.setForeground(new java.awt.Color(254, 254, 254));
        lblPuntaje.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPuntaje.setText("[Puntaje]");
        lblPuntaje.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPuntaje, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnl2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(4, 4, 4)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jRadioButton1)
                        .addGap(6, 6, 6)
                        .addComponent(jRadioButton2)
                        .addGap(5, 5, 5)
                        .addComponent(pnl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPuntaje)
                        .addGap(40, 40, 40))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        comenzar();
    }//GEN-LAST:event_jLabel2MouseReleased

    public void pararHilos(boolean gano) {
        frasesColores.interrupt();
        hRisa.interrupt();
        flacoChico.interrupt();
        hMalulo.interrupt();
        
        if(gano){
            JOptionPane.showMessageDialog(this, "GANASTE SACO E WEA!");
            Dificultad.velocidadFlacoChico += 10;
            Dificultad.velocidadEnemigo -= 10;
        }else{
            JOptionPane.showMessageDialog(this, "CAGASTE!");
        }
        
        pnl2.removeAll();
        pnl2.updateUI();
        
        
        
        comenzar();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblPuntaje;
    private javax.swing.JPanel pnl2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void opened(Object o, Map map) {
    }

    @Override
    public void progress(int i, long l, byte[] bytes, Map map) {
    }

    @Override
    public void stateUpdated(BasicPlayerEvent bpe) {
        try {
            
            control.play();
        } catch (BasicPlayerException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void setController(BasicController bc) {
    }

    private void comenzar() {
        Juego.flacosChicos = new ArrayList<>();
        Juego.malulos = new ArrayList<>();
        Juego.kills = 0;
        
        frasesColores = new Thread(new Runnable() {

            @Override
            public void run() {
                Random r;
                int i;
                int red, g, b;
                try {
                    while (true) {

                        r = new Random();

                        if (jRadioButton1.isSelected()) {
                            i = r.nextInt(Juego.frasesMalas.size());
                            lblMensaje.setText(Juego.frasesMalas.get(i));
                        } else {
                            i = r.nextInt(Juego.frasesBuenas.size());
                            lblMensaje.setText(Juego.frasesBuenas.get(i));
                        }

                        red = r.nextInt(255);
                        g = r.nextInt(255);
                        b = r.nextInt(255);

                        lblMensaje.setBackground(new Color(red, g, b));
                        red = r.nextInt(255);
                        g = r.nextInt(255);
                        b = r.nextInt(255);

                        jLabel2.setBackground(new Color(red, g, b));

                        red = r.nextInt(255);
                        g = r.nextInt(255);
                        b = r.nextInt(255);
                        jPanel1.setBackground(new Color(red, g, b));

                        jRadioButton1.setBackground(new Color(red, g, b));

                        red = r.nextInt(255);
                        g = r.nextInt(255);
                        b = r.nextInt(255);
                        jRadioButton2.setBackground(new Color(red, g, b));

                        red = r.nextInt(255);
                        g = r.nextInt(255);
                        b = r.nextInt(255);
                        pnl2.setBackground(new Color(red, g, b));
                        Thread.sleep(600);

                    }
                } catch (InterruptedException ex) {
//                    Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        frasesColores.start();

        hRisa = new Thread(new Runnable() {

            @Override
            public void run() {
                int c = 0;
                try {
                    while (true) {

                        c++;

                        if (c % 2 == 0) {
                            jLabel2.setIcon(K.Recurso.IC_FLACO);
                        } else {
                            jLabel2.setIcon(K.Recurso.IC_FLACO_BOCA_ABIERTA);
                        }
                        Thread.sleep(300);

                    }
                } catch (InterruptedException ex) {
//                    Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        hRisa.start();

        
        
        
        /*Hilo para generar los flacos chicos*/
        flacoChico = new Thread(new Runnable() {

            @Override
            public void run() {
                
                Flaco flaco;
                Point posicion;
                int c = 0;
                
                try {
                    while (true) {
                        posicion = new Point();
                        posicion.setLocation(
                                new Random().nextInt(pnl2.getWidth() - 150), 
                                new Random().nextInt(pnl2.getHeight() - 170)
                        );
                        
                        
                        flaco = new Flaco(
                                c, 
                                posicion,
                                K.Recurso.IC_FLACO_CHICO, 
                                K.Size.flacoChico
                        );
                        
                        c++;

                        Juego.flacosChicos.add(flaco);
                        System.out.println("se añadio un flaco ("+Juego.flacosChicos.size()+")");
                        
                        flaco.addMouseListener(new MouseListener() {

                            @Override
                            public void mouseClicked(MouseEvent e) {
                            }

                            @Override
                            public void mousePressed(MouseEvent e) {
                                int i = Integer.parseInt(e.getComponent().getName());

                                Juego.flacosChicos.get(i).setIcon(K.Recurso.IC_FLACO_BOCA_ABIERTA);
                            }

                            @Override
                            public void mouseReleased(MouseEvent e) {
                                
                            }

                            @Override
                            public void mouseEntered(MouseEvent e) {
                                int i = Integer.parseInt(e.getComponent().getName());

                                Juego.flacosChicos.get(i).setVisible(false);
                                Juego.kills++;
//                                App.puntaje += 1;
                                lblPuntaje.setText("[Flaco kills: " + Juego.kills + "]");

                                int flacoSize = Juego.flacosChicos.size();

                                System.out.println("-------------------------------");
                                System.out.println("Comparacion");
                                System.out.println("FlacoSize: "+flacoSize);
                                System.out.println("KILLS: "+Juego.kills);
                                
                                
                                if (flacoSize == Juego.kills) {
                                    pararHilos(true);

                                }
                            }

                            @Override
                            public void mouseExited(MouseEvent e) {
                            }
                        });

//                    System.out.println("WI: "+pnl2.getWidth());
//                    System.out.println("HE: "+pnl2.getHeight());
                        pnl2.add(
                                flaco, 
                                new AbsoluteConstraints(
                                        flaco.getPosition(), 
                                        flaco.getDimension()
                                )
                        );
                        
                        pnl2.updateUI();

                        Thread.sleep(Dificultad.velocidadFlacoChico);

                    }
                } catch (InterruptedException ex) {
//                    Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                    Juego.flacosChicos.clear();
                    System.out.println("flacosChicos clear");
                }
            }
        });

        flacoChico.start();
        
        hMalulo = new Thread(new Runnable() {

            @Override
            public void run() {
                pnl2.removeAll();
                pnl2.updateUI();
                
                int c = 0;
                
                Malulo malulo;
                Point posicion;
                
                try {
                    while (true) {
                        Thread.sleep(Dificultad.velocidadEnemigo);
                        
                        posicion = new Point();
                        posicion.setLocation(
                                new Random().nextInt(pnl2.getWidth() - 150), 
                                new Random().nextInt(pnl2.getHeight() - 170)
                        );
                        
                        malulo = new Malulo(c, posicion, K.Recurso.IC_MALULO, K.Size.malulo);
                        c++;

                        Juego.malulos.add(malulo);
                        malulo.addMouseListener(new MouseListener() {

                            @Override
                            public void mouseClicked(MouseEvent e) {
                            }

                            @Override
                            public void mousePressed(MouseEvent e) {
                            }

                            @Override
                            public void mouseReleased(MouseEvent e) {
//                                int i = Integer.parseInt(e.getComponent().getName());
//
//                                lblMalulos.get(i).setVisible(false);
//                                kills++;
//                                App.puntaje += 1;
////                                jLabel1.setText("[Flaco kills: " + App.puntaje + "]");
//
//                                int flacoSize = lblMalulos.size();
//
//                                if (flacoSize == kills) {
//                                    pararHilos();
//
//                                }
//                            lbls.remove(i);
                                
                            }

                            @Override
                            public void mouseEntered(MouseEvent e) {
                                pararHilos(false);
                            }

                            @Override
                            public void mouseExited(MouseEvent e) {
                            }
                        });

//                    System.out.println("WI: "+pnl2.getWidth());
//                    System.out.println("HE: "+pnl2.getHeight());
                        pnl2.add(
                                malulo, 
                                new AbsoluteConstraints(
                                        malulo.getPosition(), 
                                        malulo.getDimension()
                                )
                        );
                        pnl2.updateUI();

                        

                    }
                } catch (InterruptedException ex) {
                    Juego.malulos.clear();
                    System.out.println("Clear malulos");
                }
            }
        });

        hMalulo.start();
    }
}
