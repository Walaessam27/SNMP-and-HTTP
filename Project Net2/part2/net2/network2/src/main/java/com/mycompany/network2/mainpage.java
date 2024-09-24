package com.mycompany.network2;
import java.awt.Color;
import java.awt.Dimension;
import java.io.BufferedOutputStream;
import javax.swing.JViewport;
import javax.swing.table.JTableHeader;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.json.JSONArray;

public class mainpage extends javax.swing.JFrame {
private DefaultTableCellRenderer centerRenderer;
private  boolean enterServ=false;
private  boolean enterJSP=false;
  
    public mainpage() {
        initComponents();
        initializeTableModel1();
        initializeTableModel2();
        initializeTableModel3();
         datapanel.setVisible(true);
    piclabel.setVisible(true);
    tcppanel.setVisible(false);
    arpanel.setVisible(false);
    stapanel.setVisible(false);
    syspanel.setVisible(false);
        centerRenderer = new DefaultTableCellRenderer();

    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        datapanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        passlabel = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        statelabel = new javax.swing.JLabel();
        stateserv = new javax.swing.JTextField();
        arp = new javax.swing.JButton();
        tcp = new javax.swing.JButton();
        sta = new javax.swing.JButton();
        System = new javax.swing.JButton();
        Log = new javax.swing.JButton();
        Log1 = new javax.swing.JButton();
        passlabel1 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        statejsp = new javax.swing.JTextField();
        URL = new javax.swing.JTextField();
        statelabel1 = new javax.swing.JLabel();
        statelabel2 = new javax.swing.JLabel();
        piclabel = new javax.swing.JLabel();
        tcppanel = new javax.swing.JPanel();
        tcptable = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        home = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pictcp = new javax.swing.JLabel();
        stapanel = new javax.swing.JPanel();
        statable = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        home2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        stapic = new javax.swing.JLabel();
        arpanel = new javax.swing.JPanel();
        arptable = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        home3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        arppic = new javax.swing.JLabel();
        syspanel = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        home4 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        syspic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        datapanel.setBackground(new java.awt.Color(204, 204, 204));
        datapanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameLabel.setBackground(new java.awt.Color(255, 204, 255));
        nameLabel.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(102, 102, 102));
        nameLabel.setText("Name");
        datapanel.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));

        passlabel.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        passlabel.setForeground(new java.awt.Color(102, 102, 102));
        passlabel.setText("Password");
        datapanel.add(passlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 70, 30));

        Name.setBackground(new java.awt.Color(153, 153, 153));
        Name.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        Name.setForeground(new java.awt.Color(0, 0, 0));
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        datapanel.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 100, 30));

        pass.setBackground(new java.awt.Color(153, 153, 153));
        pass.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        pass.setForeground(new java.awt.Color(0, 0, 0));
        datapanel.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 100, 30));

        statelabel.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        statelabel.setForeground(new java.awt.Color(102, 102, 102));
        statelabel.setText("URL");
        datapanel.add(statelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 40, 30));

        stateserv.setEditable(false);
        stateserv.setBackground(new java.awt.Color(153, 153, 153));
        stateserv.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        stateserv.setForeground(new java.awt.Color(0, 0, 0));
        datapanel.add(stateserv, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 180, 30));

        arp.setBackground(new java.awt.Color(153, 153, 153));
        arp.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        arp.setForeground(new java.awt.Color(0, 0, 0));
        arp.setText("ARP");
        arp.setFocusable(false);
        arp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arpMouseClicked(evt);
            }
        });
        arp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arpActionPerformed(evt);
            }
        });
        datapanel.add(arp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 140, -1));

        tcp.setBackground(new java.awt.Color(153, 153, 153));
        tcp.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        tcp.setForeground(new java.awt.Color(0, 0, 0));
        tcp.setText("TCP");
        tcp.setToolTipText("");
        tcp.setFocusable(false);
        tcp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tcpMouseClicked(evt);
            }
        });
        tcp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcpActionPerformed(evt);
            }
        });
        datapanel.add(tcp, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 140, -1));

        sta.setBackground(new java.awt.Color(153, 153, 153));
        sta.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        sta.setForeground(new java.awt.Color(0, 0, 0));
        sta.setText("Statistics");
        sta.setFocusable(false);
        sta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staMouseClicked(evt);
            }
        });
        sta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staActionPerformed(evt);
            }
        });
        datapanel.add(sta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 140, -1));

        System.setBackground(new java.awt.Color(153, 153, 153));
        System.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        System.setForeground(new java.awt.Color(0, 0, 0));
        System.setText("System");
        System.setFocusable(false);
        System.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SystemMouseClicked(evt);
            }
        });
        System.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemActionPerformed(evt);
            }
        });
        datapanel.add(System, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 140, -1));

        Log.setBackground(new java.awt.Color(153, 153, 153));
        Log.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        Log.setForeground(new java.awt.Color(0, 0, 0));
        Log.setText("Verfiy In Servlet");
        Log.setFocusable(false);
        Log.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogMouseClicked(evt);
            }
        });
        Log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogActionPerformed(evt);
            }
        });
        datapanel.add(Log, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 160, 30));

        Log1.setBackground(new java.awt.Color(153, 153, 153));
        Log1.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        Log1.setForeground(new java.awt.Color(0, 0, 0));
        Log1.setText("Verfiy In  JSP");
        Log1.setFocusable(false);
        Log1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Log1MouseClicked(evt);
            }
        });
        Log1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Log1ActionPerformed(evt);
            }
        });
        datapanel.add(Log1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 160, 30));

        passlabel1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        passlabel1.setForeground(new java.awt.Color(102, 102, 102));
        passlabel1.setText("ID");
        datapanel.add(passlabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 30, 30));

        ID.setBackground(new java.awt.Color(153, 153, 153));
        ID.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        ID.setForeground(new java.awt.Color(0, 0, 0));
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        datapanel.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 100, 30));

        statejsp.setEditable(false);
        statejsp.setBackground(new java.awt.Color(153, 153, 153));
        statejsp.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        statejsp.setForeground(new java.awt.Color(0, 0, 0));
        datapanel.add(statejsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 180, 30));

        URL.setEditable(false);
        URL.setBackground(new java.awt.Color(153, 153, 153));
        URL.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        URL.setForeground(new java.awt.Color(0, 0, 0));
        datapanel.add(URL, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 320, 30));

        statelabel1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        statelabel1.setForeground(new java.awt.Color(102, 102, 102));
        statelabel1.setText("StateJSP");
        datapanel.add(statelabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 90, 30));

        statelabel2.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        statelabel2.setForeground(new java.awt.Color(102, 102, 102));
        statelabel2.setText("StateServlet");
        datapanel.add(statelabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 100, 30));

        getContentPane().add(datapanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 380, 430));
        getContentPane().add(piclabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 790));

        tcppanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tcptable.setForeground(new java.awt.Color(204, 204, 204));

        jTable2.setBackground(new java.awt.Color(204, 204, 204));
        jTable2.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Index", "TCP Connection State", "TCP Connection LocalAdd", "TCP ConnLocal Port", "TCP ConnRem Add", "TCP ConnRem Port "
            }
        ));
        jTable2.setRowHeight(44);
        tcptable.setViewportView(jTable2);

        tcppanel.add(tcptable, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 1060, 580));

        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        tcppanel.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 10, 50, 50));

        jLabel2.setFont(new java.awt.Font("Sitka Text", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("TCP Table");
        tcppanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 130, 40));
        tcppanel.add(pictcp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 790));

        getContentPane().add(tcppanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 790));

        stapanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(102, 102, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setRowHeight(44);
        jTable1.setSelectionForeground(new java.awt.Color(204, 102, 255));
        jTable1.setShowGrid(true);
        statable.setViewportView(jTable1);

        stapanel.add(statable, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 1070, 590));

        home2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home2MouseClicked(evt);
            }
        });
        stapanel.add(home2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 20, 50, 50));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("SNMP Statistics ");
        stapanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 250, 40));
        stapanel.add(stapic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 790));

        getContentPane().add(stapanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 790));

        arpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setBackground(new java.awt.Color(204, 204, 204));
        jTable3.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jTable3.setForeground(new java.awt.Color(102, 102, 102));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable3.setRowHeight(44);
        arptable.setViewportView(jTable3);

        arpanel.add(arptable, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 1080, 590));

        home3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home3MouseClicked(evt);
            }
        });
        arpanel.add(home3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 20, -1, 60));

        jLabel3.setFont(new java.awt.Font("Sitka Text", 2, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("ARB Table");
        arpanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 130, 40));
        arpanel.add(arppic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 790));

        getContentPane().add(arpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 790));

        syspanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(185, 159, 211));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        syspanel.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 330, 160, 30));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        syspanel.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 160, 30));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(185, 159, 211));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        syspanel.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 160, 30));

        jTextField4.setBackground(new java.awt.Color(185, 159, 211));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        syspanel.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 570, 120, 30));

        jTextField5.setBackground(new java.awt.Color(185, 159, 211));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        syspanel.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 640, 150, 30));

        jTextField6.setBackground(new java.awt.Color(185, 159, 211));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        syspanel.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 570, 120, 30));

        jButton3.setBackground(new java.awt.Color(51, 0, 51));
        jButton3.setForeground(new java.awt.Color(185, 159, 211));
        jButton3.setText("save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        syspanel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 640, 70, 30));

        jButton5.setBackground(new java.awt.Color(51, 0, 51));
        jButton5.setForeground(new java.awt.Color(185, 159, 211));
        jButton5.setText("save");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        syspanel.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 570, 70, 30));

        jButton6.setBackground(new java.awt.Color(51, 0, 51));
        jButton6.setForeground(new java.awt.Color(185, 159, 211));
        jButton6.setText("save");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        syspanel.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 570, 70, 30));

        home4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home4MouseClicked(evt);
            }
        });
        syspanel.add(home4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 40, 50, 50));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 2, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("System Group");
        syspanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 170, 40));
        syspanel.add(syspic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 790));

        getContentPane().add(syspanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 790));

        setSize(new java.awt.Dimension(1334, 799));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
    
    }//GEN-LAST:event_NameActionPerformed

    private void tcpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcpActionPerformed
             if(enterServ==false||enterJSP==false)
        JOptionPane.showMessageDialog(null, "Log in first");
     else sendData_POST("tcp");
    }//GEN-LAST:event_tcpActionPerformed

    private void tcpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tcpMouseClicked
    datapanel.setVisible(false);
    piclabel.setVisible(false);
    tcppanel.setVisible(true);
    arpanel.setVisible(false);
    stapanel.setVisible(false);
    syspanel.setVisible(false);

        
    }//GEN-LAST:event_tcpMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        tcppanel.setVisible(false);
    stapanel.setVisible(false);
            arpanel.setVisible(false);
        syspanel.setVisible(false);

    datapanel.setVisible(true);
    piclabel.setVisible(true);
        
    }//GEN-LAST:event_homeMouseClicked

    private void staMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staMouseClicked
    datapanel.setVisible(false);
    piclabel.setVisible(false);
    tcppanel.setVisible(false);
    stapanel.setVisible(true);
    syspanel.setVisible(false);

      arpanel.setVisible(false);

    }//GEN-LAST:event_staMouseClicked

    private void home2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home2MouseClicked
    tcppanel.setVisible(false);
    stapanel.setVisible(false);
    datapanel.setVisible(true);
    piclabel.setVisible(true);
    arpanel.setVisible(false);
    syspanel.setVisible(false);



    }//GEN-LAST:event_home2MouseClicked

    private void arpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arpMouseClicked
    datapanel.setVisible(false);
    piclabel.setVisible(false);
    tcppanel.setVisible(false);
    stapanel.setVisible(false);
    arpanel.setVisible(true);
    syspanel.setVisible(false);

    }//GEN-LAST:event_arpMouseClicked

    private void home3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home3MouseClicked
    tcppanel.setVisible(false);
    stapanel.setVisible(false);
    datapanel.setVisible(true);
    piclabel.setVisible(true);
    arpanel.setVisible(false);
    syspanel.setVisible(false);

        
    }//GEN-LAST:event_home3MouseClicked

    private void SystemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SystemMouseClicked
    datapanel.setVisible(false);
    piclabel.setVisible(false);
    tcppanel.setVisible(false);
    stapanel.setVisible(false);
    arpanel.setVisible(false);
    syspanel.setVisible(true);        
    }//GEN-LAST:event_SystemMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void home4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home4MouseClicked
    tcppanel.setVisible(false);
    stapanel.setVisible(false);
    datapanel.setVisible(true);
    piclabel.setVisible(true);
    arpanel.setVisible(false);
    syspanel.setVisible(false);
        
    }//GEN-LAST:event_home4MouseClicked

    private void LogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LogMouseClicked

    private void SystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemActionPerformed
      if(enterServ==false||enterJSP==false)
        JOptionPane.showMessageDialog(null, "Log in first");
     else sendData_POST("system");
    }//GEN-LAST:event_SystemActionPerformed

    private void LogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogActionPerformed
             sendData_POST("cheackServlet");
    }//GEN-LAST:event_LogActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         send_POST("loc");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        send_POST("name");
       
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         send_POST("cont");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void staActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staActionPerformed
            if(enterServ==false||enterJSP==false)
        JOptionPane.showMessageDialog(null, "Log in first");
     else sendData_POST("sta");
    }//GEN-LAST:event_staActionPerformed

    private void arpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arpActionPerformed
              if(enterServ==false||enterJSP==false)
        JOptionPane.showMessageDialog(null, "Log in first");
     else sendData_POST("arp");
    }//GEN-LAST:event_arpActionPerformed

    private void Log1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Log1MouseClicked
    }//GEN-LAST:event_Log1MouseClicked

    private void Log1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Log1ActionPerformed
        sendData_POST("cheackJSP");
    }//GEN-LAST:event_Log1ActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
    }//GEN-LAST:event_IDActionPerformed

  
    private JTable dynamicTable;  
    private DefaultTableModel tcpTableModel;
    private DefaultTableModel staTableModel;
    private DefaultTableModel arpTableModel;
 

    private void initializeTableModel1() {
    int columnCount = 5;
    tcpTableModel = new DefaultTableModel();
    String[] columnNames = { "TCP Connection State", "TCP Connection LocalAdd", "TCP ConnLocal Port", "TCP ConnRem Add", "TCP ConnRem Port"};
    for (int i = 0; i < columnCount; i++) {
        tcpTableModel.addColumn(columnNames[i]);
    }
    jTable2.setModel(tcpTableModel);

    // Example data for demonstration
    for (int j = 1; j <= 13; j++) {
        Object[] rowData = {"Data 1", "Data 2", "Data 3", "Data 4", "Data 5", "Data 6"};
        addDataToTable(tcpTableModel, rowData);
    }

    int rowCount = tcpTableModel.getRowCount();
    int rowHeight = jTable2.getRowHeight();
    int preferredHeight = rowCount * rowHeight;
    tcptable.setPreferredSize(new Dimension(tcptable.getWidth(), preferredHeight));

    dynamicTable = (JTable) ((JViewport) tcptable.getViewport()).getView();
    dynamicTable.setForeground(new Color(128, 0, 128));

    setHeaderRowColor(dynamicTable, Color.lightGray);
dynamicTable.setShowGrid(true);
    tcptable.revalidate();
    tcptable.repaint();
}

private void initializeTableModel2() {
    // Create a DefaultTableModel with 3 columns for UDP table
    int columnCount = 2;
    staTableModel = new DefaultTableModel();
    String[] columnNames = {"Ip Address", "Port Number"};
    for (int i = 0; i < columnCount; i++) {
        staTableModel.addColumn(columnNames[i]);
    }
    jTable1.setModel(staTableModel); // Use jTable1 for UDP table

    // Example data for demonstration
    for (int j = 1; j <= 13; j++) {
        Object[] rowData = {"Data 1", "Data 2", "Data 3"};
        addDataToTable(staTableModel, rowData);
    }

    // Set the preferred size of the JScrollPane
    int rowCount = staTableModel.getRowCount();
    int rowHeight = jTable1.getRowHeight();
    int preferredHeight = rowCount * rowHeight;
    statable.setPreferredSize(new Dimension(statable.getWidth(), preferredHeight));

    dynamicTable = (JTable) ((JViewport) statable.getViewport()).getView(); // Use udptable for UDP table
    dynamicTable.setForeground(new Color(128, 0, 128));

    setHeaderRowColor(dynamicTable, Color.lightGray);
dynamicTable.setShowGrid(true);
    statable.revalidate();
    statable.repaint();
}

private void initializeTableModel3() {

    int columnCount = 4;
    arpTableModel = new DefaultTableModel();
    String[] columnNames = {"Interface index", "Mac Address","IP Address","State"};
    for (int i = 0; i < columnCount; i++) {
        arpTableModel.addColumn(columnNames[i]);
    }
    jTable3.setModel(arpTableModel); 

    for (int j = 1; j <= 13; j++) {
        Object[] rowData = {"Data 1", "Data 2", "Data 3","hh","jj"};
        addDataToTable(arpTableModel, rowData);
    }

   
    int rowCount = arpTableModel.getRowCount();
    int rowHeight = jTable3.getRowHeight();
    int preferredHeight = rowCount * rowHeight;
    arptable.setPreferredSize(new Dimension(arptable.getWidth(), preferredHeight));

    dynamicTable = (JTable) ((JViewport) arptable.getViewport()).getView(); 
    dynamicTable.setForeground(new Color(128, 0, 128));

    setHeaderRowColor(dynamicTable, Color.lightGray);
dynamicTable.setShowGrid(true);
    arptable.revalidate();
    arptable.repaint();
    
}
private void addDataToTable(DefaultTableModel model, Object[] rowData) {
    model.addRow(rowData);
}
    
    
    
    public void setHeaderRowColor(JTable table, Color color) {
   JTableHeader header = table.getTableHeader();

    header.setBackground(color);

    centerRenderer = new DefaultTableCellRenderer();
    centerRenderer.setHorizontalAlignment(JLabel.CENTER);

    for (int i = 0; i < table.getColumnCount(); i++) {
        table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        header.getColumnModel().getColumn(i).setHeaderRenderer(centerRenderer);
    }
        table.setShowGrid(true);
table.setShowVerticalLines(true);
    table.setShowHorizontalLines(true);
     table.setGridColor(Color.gray);
    header.repaint();
   
    }
 
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainpage().setVisible(true);
                
            }
        });
    }
     String dataStr = "";
     String contentStr = "application/x-www-form-urlencoded";
     public void addParameter(String ps, String vs) {
        if (ps == null || vs == null || ps.length() == 0 || vs.length() == 0) {
            return;
        }
        if (dataStr.length() > 0) {
            dataStr += "&";               
        }
        try {
            dataStr += ps + "=" + URLEncoder.encode(vs,"UTF-8"); 
        } catch (Exception e) {
            
        }
    }
     
          String[] columnTCP = {
    "TCP Connection State",
    "TCP Connection LocalAdd",
    "TCP ConnLocal Port",
    "TCP ConnRem Add",
    "TCP ConnRem Port"
};
  String[] columnUDP = {
      "Ip Address", "Port Number"
};
    String[] columnARP = {"Interface index", "Mac Address","IP Address","State"};
     void sendData_POST(String type) {
       
        dataStr = "";
        OutputStream os;
        InputStream is;
        String url;
        if(type.equals("cheackServlet")){
            dataStr = "";
            url="http://localhost:8085/Authentication/MyServlet";
        String password = pass.getText();
        String username = Name.getText();
        addParameter("password", password);
        addParameter("name", username);
        }
        else if(type.equals("cheackJSP")){
            dataStr = "";
            url="http://localhost:8085/Authentication/main.jsp";
            
        String id = ID.getText();
        String password = pass.getText();
        addParameter("id", id);
        addParameter("password", password);
        }
        else{
            url="http://127.0.0.1:80/server.php";
            addParameter("type", type);
        }
        URL.setText(url);
        try {
            URL myURL = new URL(url);
            HttpURLConnection myConn = (HttpURLConnection)myURL.openConnection();
            myConn.setDoOutput(true);//implicily makes it Post
            myConn.setDoInput(true);
            myConn.setRequestProperty("Content-Type", contentStr);
            myConn.setUseCaches(false);
            myConn.setRequestMethod("POST");
            BufferedOutputStream out = new BufferedOutputStream(myConn.getOutputStream());
            out.write(dataStr.getBytes());
            out.close();
            if(type.equals("cheackServlet")){
            String SS = "";
            int b = -1;

            String t = "";
            is = myConn.getInputStream();
            while ((b = is.read()) != -1) {
                    SS = SS + (char) b;
            }
             this.stateserv.setText(SS.trim());
            if(SS.trim().equals("ok"))
                enterServ=true;
            }
            else if(type.equals("cheackJSP")){
            String SS = "";
            int b = -1;

            String t = "";
            is = myConn.getInputStream();
            while ((b = is.read()) != -1) {
                    SS = SS + (char) b;
            }
            this.statejsp.setText(SS.trim());
            if(SS.trim().equals("ok"))
                enterJSP=true;
            }
            else{
              int responseCode = myConn.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                
                try (BufferedReader in = new BufferedReader(new InputStreamReader(myConn.getInputStream()))) {
                    StringBuilder response = new StringBuilder();
                      
                    String inputLine;
                    while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);
                    }

                    JSONArray jsonArray = new JSONArray(response.toString());

                    if (type.equals("system")) {
                        this.jTextField2.setText("tion");
                       updateSystem(jsonArray);
                   
                    } else {
                        if(type.equals("arp"))
                          updateTable(jsonArray,columnARP , (DefaultTableModel) jTable3.getModel());
                        else if(type.equals("tcp"))
                           updateTable(jsonArray,columnTCP , (DefaultTableModel) jTable2.getModel());                  
                    }
                }
            }  
            
            }
        } catch (Exception e) {
            this.jTextField1.setText(e.toString());
        }

    }
   void send_POST(String type) {
        dataStr = "";
        OutputStream os;
        InputStream is;
        String url;
        
        url="http://127.0.0.1:80/server.php";
        addParameter("type", type);
        addParameter("name", jTextField4.getText().trim());
        addParameter("location",jTextField5.getText().trim());
        addParameter("contact",jTextField6.getText().trim());
        try {
            URL myURL = new URL(url);
            HttpURLConnection myConn = (HttpURLConnection)myURL.openConnection();
            myConn.setDoOutput(true);
            myConn.setDoInput(true);
            myConn.setRequestProperty("Content-Type", contentStr);
            myConn.setUseCaches(false);
            myConn.setRequestMethod("POST");
            BufferedOutputStream out = new BufferedOutputStream(myConn.getOutputStream());
            out.write(dataStr.getBytes());
           out.flush();
            out.close();
              String SS = "";
            int b = -1;

            String t = "";
            is = myConn.getInputStream();
            while ((b = is.read()) != -1) {
                    SS = SS + (char) b;
            }

        } catch (Exception e) {
            this.jTextField1.setText(e.toString());
        }

    }
   
       
private void updateTable(JSONArray data,String [] columnNames,DefaultTableModel model) {
 
    model.setRowCount(0);
    if (data.length() > 0) {
        model.setColumnCount(0);
        int columnCount = data.length();
        for (int i = 0; i < columnCount; i++) {
            JSONArray columnData = data.getJSONArray(i);
            if (columnData.length() > 0) {
                Vector<Object> columnVector = new Vector<>();
                for (int j = 0; j < columnData.length(); j++) {
                    columnVector.add(columnData.getString(j));
                }
                model.addColumn(columnNames[i], columnVector);
                              
            }
        }
    }
}

public  void updateSystem(JSONArray data) {
        String[] s = new String[6];
        for (int i = 0; i < 6 ; i++) {
           if(i==1)
              s[i]= extractOID(data.get(i).toString()); 
           else if(i==2)
                 s[i]= extractTimeticks(data.get(i).toString()); 
           else   s[i]= extractString(data.get(i).toString()); 
        }
        jTextField1.setText(s[2]);
        jTextField2.setText(s[1]);
        jTextField3.setText(s[0]);
        jTextField4.setText(s[4]);
        jTextField5.setText(s[5]);
        jTextField6.setText(s[3]);  
   
}
   public static String extractOID(String input) {
        Pattern pattern = Pattern.compile("\\[\"OID: (.*?)\"]");
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    public static String extractTimeticks(String input) {
        Pattern pattern = Pattern.compile("\\[\"Timeticks: \\((\\d+)\\) (\\d+:\\d+:\\d+\\.\\d+)\"\\]");
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            return "Timeticks: (" + matcher.group(1) + ") " + matcher.group(2);
        }
        return null;
    }

    public static String extractString(String input) {
        Pattern pattern = Pattern.compile("\\[\"STRING: \\\\\\\"(.*?)\\\\\\\"\"]");
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JButton Log;
    private javax.swing.JButton Log1;
    private javax.swing.JTextField Name;
    private javax.swing.JButton System;
    private javax.swing.JTextField URL;
    private javax.swing.JButton arp;
    private javax.swing.JPanel arpanel;
    private javax.swing.JLabel arppic;
    private javax.swing.JScrollPane arptable;
    private javax.swing.JPanel datapanel;
    private javax.swing.JLabel home;
    private javax.swing.JLabel home2;
    private javax.swing.JLabel home3;
    private javax.swing.JLabel home4;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel passlabel;
    private javax.swing.JLabel passlabel1;
    private javax.swing.JLabel piclabel;
    private javax.swing.JLabel pictcp;
    private javax.swing.JButton sta;
    private javax.swing.JPanel stapanel;
    private javax.swing.JLabel stapic;
    private javax.swing.JScrollPane statable;
    private javax.swing.JTextField statejsp;
    private javax.swing.JLabel statelabel;
    private javax.swing.JLabel statelabel1;
    private javax.swing.JLabel statelabel2;
    private javax.swing.JTextField stateserv;
    private javax.swing.JPanel syspanel;
    private javax.swing.JLabel syspic;
    private javax.swing.JButton tcp;
    private javax.swing.JPanel tcppanel;
    private javax.swing.JScrollPane tcptable;
    // End of variables declaration//GEN-END:variables
}
