public class Stopwatch extends javax.swing.JFrame {

   
    static int milisecond=0;
    static int second=0;
    static int hour=0;
    static int minute=0;
    static boolean state=true;
    static long sand=0;
 
    public Stopwatch() {
        initComponents();
    }

     
    @SuppressWarnings("unchecked")
 
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ms = new javax.swing.JLabel();
        h = new javax.swing.JLabel();
        m = new javax.swing.JLabel();
        s = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        msspin = new javax.swing.JSpinner();
        hspin = new javax.swing.JSpinner();
        mspin = new javax.swing.JSpinner();
        sspin = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("StopWatch & Timer");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(137,207,240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ms.setFont(new java.awt.Font("Segoe UI", 1, 40)); 
        ms.setText(": 00");
        jPanel1.add(ms, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 130, 70));

        h.setFont(new java.awt.Font("Segoe UI", 1, 48)); 
        h.setText("00");
        jPanel1.add(h, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 90, 70));

        m.setFont(new java.awt.Font("Segoe UI", 1, 48)); 
        m.setText(": 00");
        jPanel1.add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 100, 70));

        s.setFont(new java.awt.Font("Segoe UI", 1, 48)); 
        s.setText(": 00");
        jPanel1.add(s, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 110, 70));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 100, 40));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        jButton2.setText("Start");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 90, 40));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        jButton3.setText("Stop");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 90, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36));  
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Stop Watch");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 230, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 240));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 24));
        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 100, 40));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 24));
        jButton5.setText("Start");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 90, 40));

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        jButton6.setText("Stop");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 90, 40));

        msspin.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                msspinStateChanged(evt);
            }
        });
        jPanel2.add(msspin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 80, -1));

        hspin.setVerifyInputWhenFocusTarget(false);
        hspin.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                hspinStateChanged(evt);
            }
        });
        jPanel2.add(hspin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 80, -1));

        mspin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mspin.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                mspinStateChanged(evt);
            }
        });
        jPanel2.add(mspin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 80, -1));

        sspin.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sspinStateChanged(evt);
            }
        });
        jPanel2.add(sspin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 80, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36));  
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Timer");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 140, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 500, 220));

        pack();
        setLocationRelativeTo(null);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        state =true;
        Thread t=new Thread()
        {
            public void run()
            {
                while(true)
                {
                   if(state==true)
                   {
                      try{
                          sleep(1);
                          if(milisecond>1000)
                          {
                              milisecond=0;
                              second++;
                          }
                          if(second>60)
                          {
                              second=0;
                              milisecond=0;
                              minute++;
                          }
                          if(minute>60)
                          {
                              second=0;
                              milisecond=0;
                              hour++;
                              minute++;
                          }
                          ms.setText(" : "+milisecond);
                         milisecond++;
                         m.setText(" : "+minute);
                         h.setText("  "+hour);
                         s.setText(" : "+second);
                      } 
                      catch(Exception e){
                          
                      }
                   }
                   else
                       break;
                }
            }
        };
        t.start();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        state =false;
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        state = false;
        milisecond=0;
        second=0;
        minute=0;
        hour=0;
        m.setText("00");
        h.setText("00");
        s.setText("00");
        ms.setText("00");
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        hour=0;
        sand=0;
        minute=0;
        milisecond=0;
        h.setText("00");
        m.setText("00");
        s.setText("00");
        ms.setText("00");
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        milisecond=Integer.parseInt(""+msspin.getValue());
        second=Integer.parseInt(""+sspin.getValue());
        minute=Integer.parseInt(""+mspin.getValue());
        hour=Integer.parseInt(""+hspin.getValue());
        sand=(hour*60*60*1000)+(minute*60*1000)+(second*1000);
        state =true;
        Thread t=new Thread()
        {
            public void run()
            {
                while(sand>=0)
                {
                    if(state==true)
                    {
                        try{
                            sleep(1);
                            sand-=2;
                            ms.setText(" : "+sand%1000);
                            m.setText(" : "+(sand/(60*1000))%60);
                            h.setText("  "+(sand/(60*60*1000))%60);
                            s.setText(" : "+(sand/1000)%60);
                        }
                        catch(Exception e){
                        }
                    }
                    else
                    break;
                }
                if(sand<=0);
                
            }
        };
        t.start();

    } 

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        state=false;
    } 

    private void msspinStateChanged(javax.swing.event.ChangeEvent evt) {
        ms.setText(": "+msspin.getValue());

    } 

    private void hspinStateChanged(javax.swing.event.ChangeEvent evt) {
        h.setText(""+hspin.getValue());
    } 

    private void mspinStateChanged(javax.swing.event.ChangeEvent evt) {
        m.setText(": "+mspin.getValue());
    }

    private void sspinStateChanged(javax.swing.event.ChangeEvent evt) {
        s.setText(": "+sspin.getValue());
    }

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stopwatch().setVisible(true);
            }
        });
    }
 
    private javax.swing.JLabel h;
    private javax.swing.JSpinner hspin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel m;
    private javax.swing.JLabel ms;
    private javax.swing.JSpinner mspin;
    private javax.swing.JSpinner msspin;
    private javax.swing.JLabel s;
    private javax.swing.JSpinner sspin;
     
}
