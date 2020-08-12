package calculadora;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.border.Border;

class RoundedBorder implements Border {

    private int radius;

    RoundedBorder(int radius) {
        this.radius = radius;
    }

    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
    }

    public boolean isBorderOpaque() {
        return true;
    }

    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawRoundRect(x, y, width-1, height-1, radius, radius);
    }
}
public class Calculadora extends javax.swing.JFrame {

    public static float valor1;
    public static float valor2;
    public static int operacion;
    public static boolean bandComa = false;

    /**
     * 1 Suma 2 Resta 3 Multiplicacion 4 Division
     */
    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        PanelGeneral = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        PanelEstandar2 = new javax.swing.JPanel();
        MasMenos = new javax.swing.JButton();
        Cero = new javax.swing.JButton();
        Coma = new javax.swing.JButton();
        Igual = new javax.swing.JButton();
        Suma = new javax.swing.JButton();
        Resta = new javax.swing.JButton();
        Multiplicacion = new javax.swing.JButton();
        Division = new javax.swing.JButton();
        Tres = new javax.swing.JButton();
        Dos = new javax.swing.JButton();
        Uno = new javax.swing.JButton();
        Cuatro = new javax.swing.JButton();
        Cinco = new javax.swing.JButton();
        Raiz = new javax.swing.JButton();
        Cuadrado = new javax.swing.JButton();
        UnoEntreX = new javax.swing.JButton();
        Nueve = new javax.swing.JButton();
        Ocho = new javax.swing.JButton();
        Siete = new javax.swing.JButton();
        BorrarActual = new javax.swing.JButton();
        Porcentaje = new javax.swing.JButton();
        Seis = new javax.swing.JButton();
        BorrarCaracter = new javax.swing.JButton();
        BorrarTodo = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        PanelEstandar1 = new javax.swing.JPanel();
        txtPanelEstandar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PanelTexto = new javax.swing.JTextPane();
        PanelCientifica = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        txtPanelCientifica = new javax.swing.JLabel();
        btn_0 = new javax.swing.JButton();
        btn_tangente = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_decimal = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        Suma1 = new javax.swing.JButton();
        Resta1 = new javax.swing.JButton();
        Multiplicacion1 = new javax.swing.JButton();
        Division1 = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelEstandar2.setBackground(new java.awt.Color(0, 0, 0));
        PanelEstandar2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MasMenos.setFont(new java.awt.Font("Meiryo", 1, 15)); // NOI18N
        MasMenos.setForeground(new java.awt.Color(255, 255, 255));
        MasMenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        MasMenos.setText("+/-");
        MasMenos.setBorder(null);
        MasMenos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MasMenos.setFocusable(false);
        MasMenos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MasMenos.setMaximumSize(new java.awt.Dimension(47, 33));
        MasMenos.setMinimumSize(new java.awt.Dimension(47, 33));
        MasMenos.setPreferredSize(new java.awt.Dimension(50, 50));
        MasMenos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        MasMenos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r2.png"))); // NOI18N
        MasMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasMenosActionPerformed(evt);
            }
        });
        PanelEstandar2.add(MasMenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 60, -1));

        Cero.setFont(new java.awt.Font("Meiryo", 1, 15)); // NOI18N
        Cero.setForeground(new java.awt.Color(255, 255, 255));
        Cero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn0.png"))); // NOI18N
        Cero.setText("0");
        Cero.setBorder(null);
        Cero.setFocusable(false);
        Cero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Cero.setMaximumSize(new java.awt.Dimension(47, 33));
        Cero.setMinimumSize(new java.awt.Dimension(47, 33));
        Cero.setPreferredSize(new java.awt.Dimension(50, 50));
        Cero.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn0.png"))); // NOI18N
        Cero.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn0_r.png"))); // NOI18N
        Cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CeroActionPerformed(evt);
            }
        });
        PanelEstandar2.add(Cero, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 110, -1));

        Coma.setFont(new java.awt.Font("Meiryo", 1, 15)); // NOI18N
        Coma.setForeground(new java.awt.Color(255, 255, 255));
        Coma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        Coma.setText(",");
        Coma.setBorder(null);
        Coma.setFocusable(false);
        Coma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Coma.setMaximumSize(new java.awt.Dimension(47, 33));
        Coma.setPreferredSize(new java.awt.Dimension(50, 50));
        Coma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        Coma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r.png"))); // NOI18N
        Coma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComaActionPerformed(evt);
            }
        });
        PanelEstandar2.add(Coma, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 50, -1));

        Igual.setFont(new java.awt.Font("Meiryo", 1, 15)); // NOI18N
        Igual.setForeground(new java.awt.Color(255, 255, 255));
        Igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_igual.png"))); // NOI18N
        Igual.setText("=");
        Igual.setBorder(null);
        Igual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Igual.setFocusable(false);
        Igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Igual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_igual.png"))); // NOI18N
        Igual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r.png"))); // NOI18N
        Igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IgualActionPerformed(evt);
            }
        });
        PanelEstandar2.add(Igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 49, -1));

        Suma.setFont(new java.awt.Font("Meiryo", 1, 15)); // NOI18N
        Suma.setForeground(new java.awt.Color(255, 255, 255));
        Suma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        Suma.setText("+");
        Suma.setBorder(null);
        Suma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Suma.setFocusable(false);
        Suma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Suma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        Suma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r.png"))); // NOI18N
        Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumaActionPerformed(evt);
            }
        });
        PanelEstandar2.add(Suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 49, -1));

        Resta.setFont(new java.awt.Font("Meiryo", 1, 15)); // NOI18N
        Resta.setForeground(new java.awt.Color(255, 255, 255));
        Resta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        Resta.setText("-");
        Resta.setBorder(null);
        Resta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Resta.setFocusable(false);
        Resta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Resta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        Resta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r.png"))); // NOI18N
        Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestaActionPerformed(evt);
            }
        });
        PanelEstandar2.add(Resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 49, -1));

        Multiplicacion.setFont(new java.awt.Font("Meiryo", 1, 15)); // NOI18N
        Multiplicacion.setForeground(new java.awt.Color(255, 255, 255));
        Multiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        Multiplicacion.setText("x");
        Multiplicacion.setBorder(null);
        Multiplicacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Multiplicacion.setFocusable(false);
        Multiplicacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Multiplicacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        Multiplicacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r.png"))); // NOI18N
        Multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplicacionActionPerformed(evt);
            }
        });
        PanelEstandar2.add(Multiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 49, -1));

        Division.setFont(new java.awt.Font("Meiryo", 1, 15)); // NOI18N
        Division.setForeground(new java.awt.Color(255, 255, 255));
        Division.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        Division.setText("÷");
        Division.setBorder(null);
        Division.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Division.setFocusable(false);
        Division.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Division.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        Division.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r.png"))); // NOI18N
        Division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivisionActionPerformed(evt);
            }
        });
        PanelEstandar2.add(Division, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 49, -1));

        Tres.setFont(new java.awt.Font("Meiryo", 1, 15)); // NOI18N
        Tres.setForeground(new java.awt.Color(255, 255, 255));
        Tres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        Tres.setText("3");
        Tres.setBorder(null);
        Tres.setFocusable(false);
        Tres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Tres.setMaximumSize(new java.awt.Dimension(47, 33));
        Tres.setMinimumSize(new java.awt.Dimension(47, 33));
        Tres.setPreferredSize(new java.awt.Dimension(50, 50));
        Tres.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        Tres.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r.png"))); // NOI18N
        Tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TresActionPerformed(evt);
            }
        });
        PanelEstandar2.add(Tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 50, 50));

        Dos.setFont(new java.awt.Font("Meiryo", 1, 15)); // NOI18N
        Dos.setForeground(new java.awt.Color(255, 255, 255));
        Dos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        Dos.setText("2");
        Dos.setToolTipText("");
        Dos.setBorder(null);
        Dos.setFocusable(false);
        Dos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Dos.setMaximumSize(new java.awt.Dimension(47, 33));
        Dos.setMinimumSize(new java.awt.Dimension(47, 33));
        Dos.setPreferredSize(new java.awt.Dimension(50, 50));
        Dos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        Dos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r.png"))); // NOI18N
        Dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DosActionPerformed(evt);
            }
        });
        PanelEstandar2.add(Dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 49, -1));

        Uno.setFont(new java.awt.Font("Meiryo", 1, 15)); // NOI18N
        Uno.setForeground(new java.awt.Color(255, 255, 255));
        Uno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        Uno.setText("1");
        Uno.setBorder(null);
        Uno.setFocusable(false);
        Uno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Uno.setMaximumSize(new java.awt.Dimension(47, 33));
        Uno.setMinimumSize(new java.awt.Dimension(47, 33));
        Uno.setPreferredSize(new java.awt.Dimension(50, 50));
        Uno.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        Uno.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r.png"))); // NOI18N
        Uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnoActionPerformed(evt);
            }
        });
        PanelEstandar2.add(Uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 50, -1));

        Cuatro.setFont(new java.awt.Font("Meiryo", 1, 15)); // NOI18N
        Cuatro.setForeground(new java.awt.Color(255, 255, 255));
        Cuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        Cuatro.setText("4");
        Cuatro.setBorder(null);
        Cuatro.setFocusable(false);
        Cuatro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Cuatro.setMaximumSize(new java.awt.Dimension(47, 33));
        Cuatro.setMinimumSize(new java.awt.Dimension(47, 33));
        Cuatro.setPreferredSize(new java.awt.Dimension(50, 50));
        Cuatro.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        Cuatro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r.png"))); // NOI18N
        Cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuatroActionPerformed(evt);
            }
        });
        PanelEstandar2.add(Cuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 50, -1));

        Cinco.setFont(new java.awt.Font("Meiryo", 1, 15)); // NOI18N
        Cinco.setForeground(new java.awt.Color(255, 255, 255));
        Cinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        Cinco.setText("5");
        Cinco.setToolTipText("");
        Cinco.setBorder(null);
        Cinco.setFocusable(false);
        Cinco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Cinco.setMaximumSize(new java.awt.Dimension(47, 33));
        Cinco.setMinimumSize(new java.awt.Dimension(47, 33));
        Cinco.setPreferredSize(new java.awt.Dimension(50, 50));
        Cinco.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        Cinco.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r.png"))); // NOI18N
        Cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CincoActionPerformed(evt);
            }
        });
        PanelEstandar2.add(Cinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 49, -1));

        Raiz.setFont(new java.awt.Font("Meiryo", 1, 15)); // NOI18N
        Raiz.setForeground(new java.awt.Color(255, 255, 255));
        Raiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        Raiz.setText("√x");
        Raiz.setBorder(null);
        Raiz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Raiz.setFocusable(false);
        Raiz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Raiz.setMaximumSize(new java.awt.Dimension(47, 33));
        Raiz.setMinimumSize(new java.awt.Dimension(47, 33));
        Raiz.setPreferredSize(new java.awt.Dimension(50, 50));
        Raiz.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        Raiz.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r2.png"))); // NOI18N
        Raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RaizActionPerformed(evt);
            }
        });
        PanelEstandar2.add(Raiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 61, -1));

        Cuadrado.setFont(new java.awt.Font("Meiryo", 1, 15)); // NOI18N
        Cuadrado.setForeground(new java.awt.Color(255, 255, 255));
        Cuadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        Cuadrado.setText("X²");
        Cuadrado.setToolTipText("");
        Cuadrado.setBorder(null);
        Cuadrado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cuadrado.setFocusable(false);
        Cuadrado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Cuadrado.setMaximumSize(new java.awt.Dimension(47, 33));
        Cuadrado.setMinimumSize(new java.awt.Dimension(47, 33));
        Cuadrado.setPreferredSize(new java.awt.Dimension(50, 50));
        Cuadrado.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        Cuadrado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r2.png"))); // NOI18N
        Cuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuadradoActionPerformed(evt);
            }
        });
        PanelEstandar2.add(Cuadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 60, -1));

        UnoEntreX.setFont(new java.awt.Font("Meiryo", 1, 15)); // NOI18N
        UnoEntreX.setForeground(new java.awt.Color(255, 255, 255));
        UnoEntreX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        UnoEntreX.setText("1/x");
        UnoEntreX.setBorder(null);
        UnoEntreX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UnoEntreX.setFocusable(false);
        UnoEntreX.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        UnoEntreX.setMaximumSize(new java.awt.Dimension(47, 33));
        UnoEntreX.setMinimumSize(new java.awt.Dimension(47, 33));
        UnoEntreX.setPreferredSize(new java.awt.Dimension(50, 50));
        UnoEntreX.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        UnoEntreX.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r2.png"))); // NOI18N
        UnoEntreX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnoEntreXActionPerformed(evt);
            }
        });
        PanelEstandar2.add(UnoEntreX, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 60, 50));

        Nueve.setFont(new java.awt.Font("Meiryo", 1, 15)); // NOI18N
        Nueve.setForeground(new java.awt.Color(255, 255, 255));
        Nueve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        Nueve.setText("9");
        Nueve.setFocusable(false);
        Nueve.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Nueve.setMaximumSize(new java.awt.Dimension(47, 33));
        Nueve.setMinimumSize(new java.awt.Dimension(47, 33));
        Nueve.setPreferredSize(new java.awt.Dimension(50, 50));
        Nueve.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        Nueve.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r.png"))); // NOI18N
        Nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NueveActionPerformed(evt);
            }
        });
        PanelEstandar2.add(Nueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 50, -1));

        Ocho.setFont(new java.awt.Font("Meiryo", 1, 15)); // NOI18N
        Ocho.setForeground(new java.awt.Color(255, 255, 255));
        Ocho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        Ocho.setToolTipText("");
        Ocho.setActionCommand("8");
        Ocho.setBorder(null);
        Ocho.setFocusable(false);
        Ocho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Ocho.setLabel("8");
        Ocho.setMaximumSize(new java.awt.Dimension(47, 33));
        Ocho.setMinimumSize(new java.awt.Dimension(47, 33));
        Ocho.setPreferredSize(new java.awt.Dimension(50, 50));
        Ocho.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        Ocho.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r.png"))); // NOI18N
        Ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OchoActionPerformed(evt);
            }
        });
        PanelEstandar2.add(Ocho, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 49, -1));

        Siete.setFont(new java.awt.Font("Meiryo", 1, 15)); // NOI18N
        Siete.setForeground(new java.awt.Color(255, 255, 255));
        Siete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        Siete.setText("7");
        Siete.setBorder(null);
        Siete.setFocusable(false);
        Siete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Siete.setMaximumSize(new java.awt.Dimension(47, 33));
        Siete.setMinimumSize(new java.awt.Dimension(47, 33));
        Siete.setPreferredSize(new java.awt.Dimension(50, 50));
        Siete.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        Siete.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r.png"))); // NOI18N
        Siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SieteActionPerformed(evt);
            }
        });
        PanelEstandar2.add(Siete, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 50, -1));

        BorrarActual.setFont(new java.awt.Font("Meiryo", 1, 15)); // NOI18N
        BorrarActual.setForeground(new java.awt.Color(255, 255, 255));
        BorrarActual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        BorrarActual.setText("CE");
        BorrarActual.setBorder(null);
        BorrarActual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BorrarActual.setFocusable(false);
        BorrarActual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BorrarActual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        BorrarActual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r.png"))); // NOI18N
        BorrarActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActualActionPerformed(evt);
            }
        });
        PanelEstandar2.add(BorrarActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 50, -1));

        Porcentaje.setFont(new java.awt.Font("Meiryo", 1, 15)); // NOI18N
        Porcentaje.setForeground(new java.awt.Color(255, 255, 255));
        Porcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        Porcentaje.setText("%");
        Porcentaje.setBorder(null);
        Porcentaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Porcentaje.setFocusable(false);
        Porcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Porcentaje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        Porcentaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r.png"))); // NOI18N
        Porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PorcentajeActionPerformed(evt);
            }
        });
        PanelEstandar2.add(Porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 50, -1));

        Seis.setFont(new java.awt.Font("Meiryo", 1, 15)); // NOI18N
        Seis.setForeground(new java.awt.Color(255, 255, 255));
        Seis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        Seis.setText("6");
        Seis.setBorder(null);
        Seis.setFocusable(false);
        Seis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Seis.setMaximumSize(new java.awt.Dimension(47, 33));
        Seis.setMinimumSize(new java.awt.Dimension(47, 33));
        Seis.setPreferredSize(new java.awt.Dimension(50, 50));
        Seis.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        Seis.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r.png"))); // NOI18N
        Seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeisActionPerformed(evt);
            }
        });
        PanelEstandar2.add(Seis, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        BorrarCaracter.setFont(new java.awt.Font("Meiryo", 1, 15)); // NOI18N
        BorrarCaracter.setForeground(new java.awt.Color(255, 255, 255));
        BorrarCaracter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        BorrarCaracter.setText("<--");
        BorrarCaracter.setBorder(null);
        BorrarCaracter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BorrarCaracter.setFocusable(false);
        BorrarCaracter.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BorrarCaracter.setMaximumSize(new java.awt.Dimension(47, 33));
        BorrarCaracter.setMinimumSize(new java.awt.Dimension(47, 33));
        BorrarCaracter.setPreferredSize(new java.awt.Dimension(50, 50));
        BorrarCaracter.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        BorrarCaracter.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r2.png"))); // NOI18N
        BorrarCaracter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarCaracterActionPerformed(evt);
            }
        });
        PanelEstandar2.add(BorrarCaracter, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 60, -1));

        BorrarTodo.setFont(new java.awt.Font("Meiryo", 1, 15)); // NOI18N
        BorrarTodo.setForeground(new java.awt.Color(255, 255, 255));
        BorrarTodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        BorrarTodo.setText("C");
        BorrarTodo.setToolTipText("");
        BorrarTodo.setBorder(null);
        BorrarTodo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BorrarTodo.setFocusable(false);
        BorrarTodo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BorrarTodo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        BorrarTodo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r.png"))); // NOI18N
        BorrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarTodoActionPerformed(evt);
            }
        });
        PanelEstandar2.add(BorrarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        PanelEstandar2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 560, -1));

        jButton2.setText("jButton2");
        PanelEstandar2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jButton3.setText("jButton3");
        PanelEstandar2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jButton4.setText("jButton4");
        PanelEstandar2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jPanel3.add(PanelEstandar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 560, 310));

        PanelEstandar1.setBackground(new java.awt.Color(0, 0, 0));
        PanelEstandar1.setForeground(new java.awt.Color(51, 51, 51));
        PanelEstandar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPanelEstandar.setBackground(new java.awt.Color(51, 51, 51));
        txtPanelEstandar.setFont(new java.awt.Font("Meiryo", 1, 48)); // NOI18N
        txtPanelEstandar.setForeground(new java.awt.Color(255, 255, 255));
        txtPanelEstandar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtPanelEstandar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelEstandar1.add(txtPanelEstandar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, 20));

        PanelTexto.setEditable(false);
        jScrollPane1.setViewportView(PanelTexto);

        PanelEstandar1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        jPanel3.add(PanelEstandar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 100));

        PanelGeneral.addTab("Estándar", jPanel3);

        PanelCientifica.setBackground(new java.awt.Color(0, 0, 0));
        PanelCientifica.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        PanelCientifica.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 430, 10));

        txtPanelCientifica.setFont(new java.awt.Font("Meiryo", 1, 48)); // NOI18N
        txtPanelCientifica.setForeground(new java.awt.Color(255, 255, 255));
        txtPanelCientifica.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PanelCientifica.add(txtPanelCientifica, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 420, 60));

        btn_0.setFont(new java.awt.Font("Meiryo", 1, 14)); // NOI18N
        btn_0.setForeground(new java.awt.Color(255, 255, 255));
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        btn_0.setText("0");
        btn_0.setBorder(null);
        btn_0.setFocusable(false);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r.png"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        PanelCientifica.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 40, 30));

        btn_tangente.setFont(new java.awt.Font("Meiryo", 1, 14)); // NOI18N
        btn_tangente.setForeground(new java.awt.Color(255, 255, 255));
        btn_tangente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_tangente.setText("tan");
        btn_tangente.setBorder(null);
        btn_tangente.setFocusable(false);
        btn_tangente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_tangente.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_tangente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r.png"))); // NOI18N
        btn_tangente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tangenteActionPerformed(evt);
            }
        });
        PanelCientifica.add(btn_tangente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 50, 50));

        btn_9.setFont(new java.awt.Font("Meiryo", 1, 14)); // NOI18N
        btn_9.setForeground(new java.awt.Color(255, 255, 255));
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        btn_9.setText("9");
        btn_9.setBorder(null);
        btn_9.setFocusable(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r.png"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        PanelCientifica.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 40, 30));

        btn_1.setFont(new java.awt.Font("Meiryo", 1, 14)); // NOI18N
        btn_1.setForeground(new java.awt.Color(255, 255, 255));
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        btn_1.setText("1");
        btn_1.setBorder(null);
        btn_1.setFocusable(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        PanelCientifica.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 40, 30));

        btn_2.setFont(new java.awt.Font("Meiryo", 1, 14)); // NOI18N
        btn_2.setForeground(new java.awt.Color(255, 255, 255));
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        btn_2.setText("2");
        btn_2.setBorder(null);
        btn_2.setFocusable(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r.png"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        PanelCientifica.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 40, 30));

        btn_decimal.setFont(new java.awt.Font("Meiryo", 1, 14)); // NOI18N
        btn_decimal.setForeground(new java.awt.Color(255, 255, 255));
        btn_decimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        btn_decimal.setText(",");
        btn_decimal.setBorder(null);
        btn_decimal.setFocusable(false);
        btn_decimal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_decimal.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_decimal.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r.png"))); // NOI18N
        btn_decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_decimalActionPerformed(evt);
            }
        });
        PanelCientifica.add(btn_decimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 40, 30));

        btn_6.setFont(new java.awt.Font("Meiryo", 1, 14)); // NOI18N
        btn_6.setForeground(new java.awt.Color(255, 255, 255));
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        btn_6.setText("6");
        btn_6.setBorder(null);
        btn_6.setFocusable(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r.png"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        PanelCientifica.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 40, 30));

        btn_5.setFont(new java.awt.Font("Meiryo", 1, 14)); // NOI18N
        btn_5.setForeground(new java.awt.Color(255, 255, 255));
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        btn_5.setText("5");
        btn_5.setBorder(null);
        btn_5.setFocusable(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r.png"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        PanelCientifica.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 40, 30));

        btn_4.setFont(new java.awt.Font("Meiryo", 1, 14)); // NOI18N
        btn_4.setForeground(new java.awt.Color(255, 255, 255));
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        btn_4.setText("4");
        btn_4.setBorder(null);
        btn_4.setFocusable(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r.png"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        PanelCientifica.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 40, 30));

        btn_7.setFont(new java.awt.Font("Meiryo", 1, 14)); // NOI18N
        btn_7.setForeground(new java.awt.Color(255, 255, 255));
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        btn_7.setText("7");
        btn_7.setBorder(null);
        btn_7.setFocusable(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r.png"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        PanelCientifica.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 40, 30));

        btn_8.setFont(new java.awt.Font("Meiryo", 1, 14)); // NOI18N
        btn_8.setForeground(new java.awt.Color(255, 255, 255));
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        btn_8.setText("8");
        btn_8.setBorder(null);
        btn_8.setFocusable(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        PanelCientifica.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 40, 30));

        btn_3.setFont(new java.awt.Font("Meiryo", 1, 14)); // NOI18N
        btn_3.setForeground(new java.awt.Color(255, 255, 255));
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        btn_3.setText("3");
        btn_3.setBorder(null);
        btn_3.setFocusable(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r.png"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        PanelCientifica.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 40, 30));

        btn_igual.setFont(new java.awt.Font("Meiryo", 1, 15)); // NOI18N
        btn_igual.setForeground(new java.awt.Color(255, 255, 255));
        btn_igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_igual.png"))); // NOI18N
        btn_igual.setText("=");
        btn_igual.setBorder(null);
        btn_igual.setFocusable(false);
        btn_igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_igual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_igual.png"))); // NOI18N
        btn_igual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r.png"))); // NOI18N
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });
        PanelCientifica.add(btn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 49, -1));

        Suma1.setFont(new java.awt.Font("Meiryo", 1, 15)); // NOI18N
        Suma1.setForeground(new java.awt.Color(255, 255, 255));
        Suma1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        Suma1.setText("+");
        Suma1.setBorder(null);
        Suma1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Suma1.setFocusable(false);
        Suma1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Suma1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        Suma1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r.png"))); // NOI18N
        Suma1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Suma1ActionPerformed(evt);
            }
        });
        PanelCientifica.add(Suma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 49, -1));

        Resta1.setFont(new java.awt.Font("Meiryo", 1, 15)); // NOI18N
        Resta1.setForeground(new java.awt.Color(255, 255, 255));
        Resta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        Resta1.setText("-");
        Resta1.setBorder(null);
        Resta1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Resta1.setFocusable(false);
        Resta1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Resta1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        Resta1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r.png"))); // NOI18N
        Resta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Resta1ActionPerformed(evt);
            }
        });
        PanelCientifica.add(Resta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 49, -1));

        Multiplicacion1.setFont(new java.awt.Font("Meiryo", 1, 15)); // NOI18N
        Multiplicacion1.setForeground(new java.awt.Color(255, 255, 255));
        Multiplicacion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        Multiplicacion1.setText("x");
        Multiplicacion1.setBorder(null);
        Multiplicacion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Multiplicacion1.setFocusable(false);
        Multiplicacion1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Multiplicacion1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        Multiplicacion1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r.png"))); // NOI18N
        Multiplicacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Multiplicacion1ActionPerformed(evt);
            }
        });
        PanelCientifica.add(Multiplicacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 49, -1));

        Division1.setFont(new java.awt.Font("Meiryo", 1, 15)); // NOI18N
        Division1.setForeground(new java.awt.Color(255, 255, 255));
        Division1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        Division1.setText("÷");
        Division1.setBorder(null);
        Division1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Division1.setFocusable(false);
        Division1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Division1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        Division1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_r.png"))); // NOI18N
        Division1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Division1ActionPerformed(evt);
            }
        });
        PanelCientifica.add(Division1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 49, -1));

        PanelGeneral.addTab("Científica", PanelCientifica);

        getContentPane().add(PanelGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed

    }//GEN-LAST:event_btn_igualActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        addNumber2("3");
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        addNumber2("8");
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        addNumber2("7");
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        addNumber2("4");
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        addNumber2("5");
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        addNumber2("6");
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_decimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_decimalActionPerformed
        addNumber2(",");
    }//GEN-LAST:event_btn_decimalActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        addNumber2("2");
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        addNumber2("1");
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        addNumber2("9");
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_tangenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tangenteActionPerformed

    }//GEN-LAST:event_btn_tangenteActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        addNumber2("0");
    }//GEN-LAST:event_btn_0ActionPerformed

    private void BorrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarTodoActionPerformed
        valor1 = 0;
        valor2 = 0;
        txtPanelEstandar.setText("");
    }//GEN-LAST:event_BorrarTodoActionPerformed

    private void BorrarCaracterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarCaracterActionPerformed
        if (txtPanelEstandar.getText().length() > 0) {
            txtPanelEstandar.setText(txtPanelEstandar.getText().substring(0, txtPanelEstandar.getText().length() - 1));
        }
    }//GEN-LAST:event_BorrarCaracterActionPerformed

    private void SeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeisActionPerformed
        addNumber("6");
    }//GEN-LAST:event_SeisActionPerformed

    private void PorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PorcentajeActionPerformed
        valor1 = Float.parseFloat(txtPanelEstandar.getText().replace(",", "."));
        operacion = 5;
        txtPanelEstandar.setText("");
    }//GEN-LAST:event_PorcentajeActionPerformed

    private void BorrarActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActualActionPerformed
        if (valor1 != 0) {
            valor2 = 0;
        } else {
            valor1 = 0;
        }
        txtPanelEstandar.setText("");
    }//GEN-LAST:event_BorrarActualActionPerformed

    private void SieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SieteActionPerformed
        addNumber("7");
    }//GEN-LAST:event_SieteActionPerformed

    private void OchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OchoActionPerformed
        addNumber("8");
    }//GEN-LAST:event_OchoActionPerformed

    private void NueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NueveActionPerformed
        addNumber("9");
    }//GEN-LAST:event_NueveActionPerformed

    private void UnoEntreXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnoEntreXActionPerformed
        if (Float.parseFloat(txtPanelEstandar.getText()) == 0) {
            txtPanelEstandar.setText("ERROR");
        } else {
            txtPanelEstandar.setText(1 / Float.parseFloat(txtPanelEstandar.getText()) + "");
        }
    }//GEN-LAST:event_UnoEntreXActionPerformed

    private void CuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuadradoActionPerformed
        txtPanelEstandar.setText(Math.pow(Float.parseFloat(txtPanelEstandar.getText()), 2) + "");
    }//GEN-LAST:event_CuadradoActionPerformed

    private void RaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RaizActionPerformed
        txtPanelEstandar.setText(Math.sqrt(Float.parseFloat(txtPanelEstandar.getText())) + "");
    }//GEN-LAST:event_RaizActionPerformed

    private void CincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CincoActionPerformed
        addNumber("5");
    }//GEN-LAST:event_CincoActionPerformed

    private void CuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuatroActionPerformed
        addNumber("4");
    }//GEN-LAST:event_CuatroActionPerformed

    private void UnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnoActionPerformed
        addNumber("1");
    }//GEN-LAST:event_UnoActionPerformed

    private void DosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DosActionPerformed
        addNumber("2");
    }//GEN-LAST:event_DosActionPerformed

    private void TresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TresActionPerformed
        addNumber("3");
    }//GEN-LAST:event_TresActionPerformed

    private void DivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivisionActionPerformed
        valor1 = Float.parseFloat(txtPanelEstandar.getText().replace(",", "."));
        operacion = 4;
        txtPanelEstandar.setText("");
    }//GEN-LAST:event_DivisionActionPerformed

    private void MultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplicacionActionPerformed
        valor1 = Float.parseFloat(txtPanelEstandar.getText().replace(",", "."));
        operacion = 3;
        txtPanelEstandar.setText("");
    }//GEN-LAST:event_MultiplicacionActionPerformed

    private void RestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestaActionPerformed
        valor1 = Float.parseFloat(txtPanelEstandar.getText().replace(",", "."));
        operacion = 2;
        txtPanelEstandar.setText("");
    }//GEN-LAST:event_RestaActionPerformed

    private void SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumaActionPerformed
        valor1 = Float.parseFloat(txtPanelEstandar.getText().replace(",", "."));
        operacion = 1;
        txtPanelEstandar.setText("");
    }//GEN-LAST:event_SumaActionPerformed

    private void IgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IgualActionPerformed
        valor2 = Float.parseFloat(txtPanelEstandar.getText().replace(",", "."));
        switch (operacion) {
            case 1:
            txtPanelEstandar.setText(valor1 + valor2 + "");
            break;
            case 2:
            txtPanelEstandar.setText(valor1 - valor2 + "");
            break;
            case 3:
            txtPanelEstandar.setText(valor1 * valor2 + "");
            break;
            case 4:
            if (valor2 > 0) {
                txtPanelEstandar.setText(valor1 / valor2 + "");
            } else {
                txtPanelEstandar.setText("ERROR!");
                valor1 = 0;
                valor2 = 0;
            }
            break;
            case 5:
            txtPanelEstandar.setText((valor1 * valor2) / 100 + "");
            break;
            default:
            break;
        }
    }//GEN-LAST:event_IgualActionPerformed

    private void ComaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComaActionPerformed
        addNumber(",");
        bandComa = true;
    }//GEN-LAST:event_ComaActionPerformed

    private void CeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CeroActionPerformed
        addNumber("0");
    }//GEN-LAST:event_CeroActionPerformed

    private void MasMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasMenosActionPerformed
        if (Integer.parseInt(txtPanelEstandar.getText()) > 0) {
            txtPanelEstandar.setText("-" + txtPanelEstandar.getText());
        } else {
            txtPanelEstandar.setText(Integer.parseInt(txtPanelEstandar.getText()) * -1 + "");
        }
    }//GEN-LAST:event_MasMenosActionPerformed

    private void Suma1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Suma1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Suma1ActionPerformed

    private void Resta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Resta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Resta1ActionPerformed

    private void Multiplicacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Multiplicacion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Multiplicacion1ActionPerformed

    private void Division1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Division1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Division1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
    public void addNumber(String digito){
        txtPanelEstandar.setText(txtPanelEstandar.getText() + digito);
    }
    public void addNumber2(String digito){
        txtPanelCientifica.setText(txtPanelCientifica.getText() + digito);
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BorrarActual;
    private javax.swing.JButton BorrarCaracter;
    private javax.swing.JButton BorrarTodo;
    private javax.swing.JButton Cero;
    private javax.swing.JButton Cinco;
    private javax.swing.JButton Coma;
    private javax.swing.JButton Cuadrado;
    private javax.swing.JButton Cuatro;
    private javax.swing.JButton Division;
    private javax.swing.JButton Division1;
    private javax.swing.JButton Dos;
    private javax.swing.JButton Igual;
    private javax.swing.JButton MasMenos;
    private javax.swing.JButton Multiplicacion;
    private javax.swing.JButton Multiplicacion1;
    private javax.swing.JButton Nueve;
    private javax.swing.JButton Ocho;
    private javax.swing.JPanel PanelCientifica;
    private javax.swing.JPanel PanelEstandar1;
    private javax.swing.JPanel PanelEstandar2;
    private javax.swing.JTabbedPane PanelGeneral;
    private javax.swing.JTextPane PanelTexto;
    private javax.swing.JButton Porcentaje;
    private javax.swing.JButton Raiz;
    private javax.swing.JButton Resta;
    private javax.swing.JButton Resta1;
    private javax.swing.JButton Seis;
    private javax.swing.JButton Siete;
    private javax.swing.JButton Suma;
    private javax.swing.JButton Suma1;
    private javax.swing.JButton Tres;
    private javax.swing.JButton Uno;
    private javax.swing.JButton UnoEntreX;
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_decimal;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_tangente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel txtPanelCientifica;
    private javax.swing.JLabel txtPanelEstandar;
    // End of variables declaration//GEN-END:variables
}
