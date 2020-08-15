package calculadora;

/**
 *
 * @authors Ramon Perez
 */
public class Calculadora extends javax.swing.JFrame {
    
    public static double valor1;
    public static double valor2;
    public static double Cos, Sin, Tan, aCos, aSin, aTan;
    public static int operacion, funciones;

    /**
     * 1 Suma 
     * 2 Resta 
     * 3 Multiplicacion 
     * 4 Division 
     * 5 X elevado a n numero 
     * 6 Porcentaje
     */
    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Uno = new javax.swing.JButton();
        Dos = new javax.swing.JButton();
        Tres = new javax.swing.JButton();
        Cuatro = new javax.swing.JButton();
        Cinco = new javax.swing.JButton();
        Seis = new javax.swing.JButton();
        Siete = new javax.swing.JButton();
        Ocho = new javax.swing.JButton();
        Nueve = new javax.swing.JButton();
        Cero = new javax.swing.JButton();
        MasMenos = new javax.swing.JButton();
        Coma = new javax.swing.JButton();
        Multiplicacion = new javax.swing.JButton();
        Igual = new javax.swing.JButton();
        Suma = new javax.swing.JButton();
        Resta = new javax.swing.JButton();
        Raiz = new javax.swing.JButton();
        Cuadrado = new javax.swing.JButton();
        UnoEntreX = new javax.swing.JButton();
        Division = new javax.swing.JButton();
        BorrarTodo = new javax.swing.JButton();
        Porcentaje = new javax.swing.JButton();
        BorrarCaracter = new javax.swing.JButton();
        BorrarActual = new javax.swing.JButton();
        PanelTexto = new javax.swing.JLabel();
        cos = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        tan = new javax.swing.JButton();
        cos_negativo = new javax.swing.JButton();
        sin_negativo = new javax.swing.JButton();
        tan_negativo = new javax.swing.JButton();
        Pi = new javax.swing.JButton();
        Cubo = new javax.swing.JButton();
        Potencia = new javax.swing.JButton();
        abrir_parentesis = new javax.swing.JButton();
        cerrar_parentesis = new javax.swing.JButton();
        PanelTextoPrevio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setBackground(new java.awt.Color(0, 0, 0));

        Uno.setBackground(new java.awt.Color(79, 136, 240));
        Uno.setText("1");
        Uno.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Uno.setBorderPainted(false);
        Uno.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Uno.setPreferredSize(new java.awt.Dimension(39, 30));
        Uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnoActionPerformed(evt);
            }
        });

        Dos.setBackground(new java.awt.Color(79, 136, 240));
        Dos.setText("2");
        Dos.setToolTipText("");
        Dos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Dos.setBorderPainted(false);
        Dos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Dos.setPreferredSize(new java.awt.Dimension(39, 30));
        Dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DosActionPerformed(evt);
            }
        });

        Tres.setBackground(new java.awt.Color(79, 136, 240));
        Tres.setText("3");
        Tres.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Tres.setBorderPainted(false);
        Tres.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Tres.setPreferredSize(new java.awt.Dimension(39, 30));
        Tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TresActionPerformed(evt);
            }
        });

        Cuatro.setBackground(new java.awt.Color(79, 136, 240));
        Cuatro.setText("4");
        Cuatro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Cuatro.setBorderPainted(false);
        Cuatro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Cuatro.setPreferredSize(new java.awt.Dimension(39, 30));
        Cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuatroActionPerformed(evt);
            }
        });

        Cinco.setBackground(new java.awt.Color(79, 136, 240));
        Cinco.setText("5");
        Cinco.setToolTipText("");
        Cinco.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Cinco.setBorderPainted(false);
        Cinco.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Cinco.setPreferredSize(new java.awt.Dimension(39, 30));
        Cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CincoActionPerformed(evt);
            }
        });

        Seis.setBackground(new java.awt.Color(79, 136, 240));
        Seis.setText("6");
        Seis.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Seis.setBorderPainted(false);
        Seis.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Seis.setPreferredSize(new java.awt.Dimension(39, 30));
        Seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeisActionPerformed(evt);
            }
        });

        Siete.setBackground(new java.awt.Color(79, 136, 240));
        Siete.setText("7");
        Siete.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Siete.setBorderPainted(false);
        Siete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Siete.setPreferredSize(new java.awt.Dimension(39, 30));
        Siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SieteActionPerformed(evt);
            }
        });

        Ocho.setBackground(new java.awt.Color(79, 136, 240));
        Ocho.setText("8");
        Ocho.setToolTipText("");
        Ocho.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Ocho.setBorderPainted(false);
        Ocho.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Ocho.setPreferredSize(new java.awt.Dimension(39, 30));
        Ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OchoActionPerformed(evt);
            }
        });

        Nueve.setBackground(new java.awt.Color(79, 136, 240));
        Nueve.setText("9");
        Nueve.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Nueve.setBorderPainted(false);
        Nueve.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Nueve.setPreferredSize(new java.awt.Dimension(39, 30));
        Nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NueveActionPerformed(evt);
            }
        });

        Cero.setBackground(new java.awt.Color(79, 136, 240));
        Cero.setText("0");
        Cero.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Cero.setBorderPainted(false);
        Cero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Cero.setPreferredSize(new java.awt.Dimension(39, 30));
        Cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CeroActionPerformed(evt);
            }
        });

        MasMenos.setBackground(new java.awt.Color(10, 28, 64));
        MasMenos.setForeground(new java.awt.Color(255, 255, 255));
        MasMenos.setText("+/-");
        MasMenos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MasMenos.setBorderPainted(false);
        MasMenos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MasMenos.setPreferredSize(new java.awt.Dimension(39, 30));
        MasMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasMenosActionPerformed(evt);
            }
        });

        Coma.setBackground(new java.awt.Color(10, 28, 64));
        Coma.setForeground(new java.awt.Color(255, 255, 255));
        Coma.setText(".");
        Coma.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Coma.setBorderPainted(false);
        Coma.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Coma.setPreferredSize(new java.awt.Dimension(39, 30));
        Coma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComaActionPerformed(evt);
            }
        });

        Multiplicacion.setBackground(new java.awt.Color(10, 28, 64));
        Multiplicacion.setForeground(new java.awt.Color(255, 255, 255));
        Multiplicacion.setText("x");
        Multiplicacion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Multiplicacion.setBorderPainted(false);
        Multiplicacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Multiplicacion.setPreferredSize(new java.awt.Dimension(39, 30));
        Multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplicacionActionPerformed(evt);
            }
        });

        Igual.setBackground(new java.awt.Color(10, 28, 64));
        Igual.setForeground(new java.awt.Color(255, 255, 255));
        Igual.setText("=");
        Igual.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Igual.setBorderPainted(false);
        Igual.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Igual.setPreferredSize(new java.awt.Dimension(39, 30));
        Igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IgualActionPerformed(evt);
            }
        });

        Suma.setBackground(new java.awt.Color(10, 28, 64));
        Suma.setForeground(new java.awt.Color(255, 255, 255));
        Suma.setText("+");
        Suma.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Suma.setBorderPainted(false);
        Suma.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Suma.setPreferredSize(new java.awt.Dimension(39, 30));
        Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumaActionPerformed(evt);
            }
        });

        Resta.setBackground(new java.awt.Color(10, 28, 64));
        Resta.setForeground(new java.awt.Color(255, 255, 255));
        Resta.setText("-");
        Resta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Resta.setBorderPainted(false);
        Resta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Resta.setMaximumSize(new java.awt.Dimension(39, 23));
        Resta.setMinimumSize(new java.awt.Dimension(39, 23));
        Resta.setPreferredSize(new java.awt.Dimension(39, 30));
        Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestaActionPerformed(evt);
            }
        });

        Raiz.setBackground(new java.awt.Color(10, 28, 64));
        Raiz.setForeground(new java.awt.Color(255, 255, 255));
        Raiz.setText("√x");
        Raiz.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Raiz.setBorderPainted(false);
        Raiz.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Raiz.setPreferredSize(new java.awt.Dimension(39, 30));
        Raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RaizActionPerformed(evt);
            }
        });

        Cuadrado.setBackground(new java.awt.Color(10, 28, 64));
        Cuadrado.setForeground(new java.awt.Color(255, 255, 255));
        Cuadrado.setText("X²");
        Cuadrado.setToolTipText("");
        Cuadrado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Cuadrado.setBorderPainted(false);
        Cuadrado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Cuadrado.setPreferredSize(new java.awt.Dimension(39, 30));
        Cuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuadradoActionPerformed(evt);
            }
        });

        UnoEntreX.setBackground(new java.awt.Color(10, 28, 64));
        UnoEntreX.setForeground(new java.awt.Color(255, 255, 255));
        UnoEntreX.setText("1/x");
        UnoEntreX.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        UnoEntreX.setBorderPainted(false);
        UnoEntreX.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        UnoEntreX.setPreferredSize(new java.awt.Dimension(39, 30));
        UnoEntreX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnoEntreXActionPerformed(evt);
            }
        });

        Division.setBackground(new java.awt.Color(10, 28, 64));
        Division.setForeground(new java.awt.Color(255, 255, 255));
        Division.setText("÷");
        Division.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Division.setBorderPainted(false);
        Division.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Division.setPreferredSize(new java.awt.Dimension(39, 30));
        Division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivisionActionPerformed(evt);
            }
        });

        BorrarTodo.setBackground(new java.awt.Color(79, 136, 240));
        BorrarTodo.setText("C");
        BorrarTodo.setToolTipText("");
        BorrarTodo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BorrarTodo.setBorderPainted(false);
        BorrarTodo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BorrarTodo.setPreferredSize(new java.awt.Dimension(39, 30));
        BorrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarTodoActionPerformed(evt);
            }
        });

        Porcentaje.setBackground(new java.awt.Color(10, 28, 64));
        Porcentaje.setForeground(new java.awt.Color(255, 255, 255));
        Porcentaje.setText("%");
        Porcentaje.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Porcentaje.setBorderPainted(false);
        Porcentaje.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Porcentaje.setPreferredSize(new java.awt.Dimension(39, 30));
        Porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PorcentajeActionPerformed(evt);
            }
        });

        BorrarCaracter.setBackground(new java.awt.Color(79, 136, 240));
        BorrarCaracter.setText("<--");
        BorrarCaracter.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BorrarCaracter.setBorderPainted(false);
        BorrarCaracter.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BorrarCaracter.setPreferredSize(new java.awt.Dimension(39, 30));
        BorrarCaracter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarCaracterActionPerformed(evt);
            }
        });

        BorrarActual.setBackground(new java.awt.Color(79, 136, 240));
        BorrarActual.setText("Ce");
        BorrarActual.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BorrarActual.setBorderPainted(false);
        BorrarActual.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BorrarActual.setPreferredSize(new java.awt.Dimension(39, 30));
        BorrarActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActualActionPerformed(evt);
            }
        });

        PanelTexto.setBackground(new java.awt.Color(0, 51, 255));
        PanelTexto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PanelTexto.setForeground(new java.awt.Color(0, 0, 102));
        PanelTexto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PanelTexto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cos.setBackground(new java.awt.Color(10, 28, 64));
        cos.setForeground(new java.awt.Color(255, 255, 255));
        cos.setText("cos");
        cos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cos.setBorderPainted(false);
        cos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cos.setPreferredSize(new java.awt.Dimension(39, 30));
        cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosActionPerformed(evt);
            }
        });

        sin.setBackground(new java.awt.Color(10, 28, 64));
        sin.setForeground(new java.awt.Color(255, 255, 255));
        sin.setText("sin");
        sin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sin.setBorderPainted(false);
        sin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sin.setPreferredSize(new java.awt.Dimension(39, 30));
        sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinActionPerformed(evt);
            }
        });

        tan.setBackground(new java.awt.Color(10, 28, 64));
        tan.setForeground(new java.awt.Color(255, 255, 255));
        tan.setText("tan");
        tan.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tan.setBorderPainted(false);
        tan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tan.setPreferredSize(new java.awt.Dimension(39, 30));
        tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanActionPerformed(evt);
            }
        });

        cos_negativo.setBackground(new java.awt.Color(10, 28, 64));
        cos_negativo.setForeground(new java.awt.Color(255, 255, 255));
        cos_negativo.setText("cos-1");
        cos_negativo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cos_negativo.setBorderPainted(false);
        cos_negativo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cos_negativo.setPreferredSize(new java.awt.Dimension(39, 30));
        cos_negativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cos_negativoActionPerformed(evt);
            }
        });

        sin_negativo.setBackground(new java.awt.Color(10, 28, 64));
        sin_negativo.setForeground(new java.awt.Color(255, 255, 255));
        sin_negativo.setText("sin-1");
        sin_negativo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sin_negativo.setBorderPainted(false);
        sin_negativo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sin_negativo.setPreferredSize(new java.awt.Dimension(39, 30));
        sin_negativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sin_negativoActionPerformed(evt);
            }
        });

        tan_negativo.setBackground(new java.awt.Color(10, 28, 64));
        tan_negativo.setForeground(new java.awt.Color(255, 255, 255));
        tan_negativo.setText("tan-1");
        tan_negativo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tan_negativo.setBorderPainted(false);
        tan_negativo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tan_negativo.setPreferredSize(new java.awt.Dimension(39, 30));
        tan_negativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tan_negativoActionPerformed(evt);
            }
        });

        Pi.setBackground(new java.awt.Color(10, 28, 64));
        Pi.setForeground(new java.awt.Color(255, 255, 255));
        Pi.setText("π");
        Pi.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Pi.setBorderPainted(false);
        Pi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Pi.setPreferredSize(new java.awt.Dimension(39, 30));
        Pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PiActionPerformed(evt);
            }
        });

        Cubo.setBackground(new java.awt.Color(10, 28, 64));
        Cubo.setForeground(new java.awt.Color(255, 255, 255));
        Cubo.setText("X³");
        Cubo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Cubo.setBorderPainted(false);
        Cubo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Cubo.setPreferredSize(new java.awt.Dimension(39, 30));
        Cubo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuboActionPerformed(evt);
            }
        });

        Potencia.setBackground(new java.awt.Color(10, 28, 64));
        Potencia.setForeground(new java.awt.Color(255, 255, 255));
        Potencia.setText("Xⁿ");
        Potencia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Potencia.setBorderPainted(false);
        Potencia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Potencia.setPreferredSize(new java.awt.Dimension(39, 30));
        Potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PotenciaActionPerformed(evt);
            }
        });

        abrir_parentesis.setBackground(new java.awt.Color(10, 28, 64));
        abrir_parentesis.setForeground(new java.awt.Color(255, 255, 255));
        abrir_parentesis.setText("(");
        abrir_parentesis.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        abrir_parentesis.setBorderPainted(false);
        abrir_parentesis.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        abrir_parentesis.setPreferredSize(new java.awt.Dimension(39, 30));
        abrir_parentesis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrir_parentesisActionPerformed(evt);
            }
        });

        cerrar_parentesis.setBackground(new java.awt.Color(10, 28, 64));
        cerrar_parentesis.setForeground(new java.awt.Color(255, 255, 255));
        cerrar_parentesis.setText(")");
        cerrar_parentesis.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cerrar_parentesis.setBorderPainted(false);
        cerrar_parentesis.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cerrar_parentesis.setPreferredSize(new java.awt.Dimension(39, 30));

        PanelTextoPrevio.setBackground(new java.awt.Color(0, 0, 102));
        PanelTextoPrevio.setForeground(new java.awt.Color(0, 0, 102));
        PanelTextoPrevio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PanelTextoPrevio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cos_negativo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sin_negativo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tan_negativo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Pi, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cubo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(Potencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(abrir_parentesis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cerrar_parentesis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(MasMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Raiz, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                                    .addComponent(Porcentaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BorrarActual, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cuadrado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(UnoEntreX, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Division, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(BorrarCaracter, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BorrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Cuatro, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                                            .addComponent(Siete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Uno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(Cinco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(Dos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Seis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Tres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Cero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Coma, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Resta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Suma, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Igual, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(PanelTextoPrevio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelTextoPrevio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cos_negativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(abrir_parentesis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cerrar_parentesis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sin_negativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tan_negativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MasMenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BorrarActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BorrarCaracter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BorrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Raiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Cuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(UnoEntreX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Cubo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Division, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Siete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Ocho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Potencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Uno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Dos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Cero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Coma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Igual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Nueve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Resta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Seis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Suma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Tres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void UnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnoActionPerformed
        PanelTexto.setText(PanelTexto.getText() + "1");
    }//GEN-LAST:event_UnoActionPerformed

    private void TresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TresActionPerformed
        PanelTexto.setText(PanelTexto.getText() + "3");
    }//GEN-LAST:event_TresActionPerformed

    private void CuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuatroActionPerformed
        PanelTexto.setText(PanelTexto.getText() + "4");
    }//GEN-LAST:event_CuatroActionPerformed

    private void SeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeisActionPerformed
        PanelTexto.setText(PanelTexto.getText() + "6");
    }//GEN-LAST:event_SeisActionPerformed

    private void SieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SieteActionPerformed
        PanelTexto.setText(PanelTexto.getText() + "7");
    }//GEN-LAST:event_SieteActionPerformed

    private void NueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NueveActionPerformed
        PanelTexto.setText(PanelTexto.getText() + "9");
    }//GEN-LAST:event_NueveActionPerformed

    private void ComaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComaActionPerformed
        PanelTexto.setText(PanelTexto.getText() + ".");
    }//GEN-LAST:event_ComaActionPerformed

    private void MultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplicacionActionPerformed
        valor1 = Float.parseFloat(PanelTexto.getText().replace(",", "."));
        operacion = 3;
        PanelTexto.setText("");
        PanelTextoPrevio.setText("" + valor1);
    }//GEN-LAST:event_MultiplicacionActionPerformed

    private void IgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IgualActionPerformed
        valor2 = Float.parseFloat(PanelTexto.getText().replace(",", "."));
        switch (operacion) {
            case 1:
                PanelTexto.setText(valor1 + valor2 + "");
                PanelTextoPrevio.setText(valor1 + " + " + valor2 + "");
                break;
            case 2:
                PanelTexto.setText(valor1 - valor2 + "");
                PanelTextoPrevio.setText(valor1 + " - " + valor2 + "");
                break;
            case 3:
                PanelTexto.setText(valor1 * valor2 + "");
                PanelTextoPrevio.setText(valor1 + " * " + valor2 + "");
                break;
            case 4:
                if (valor2 > 0) {
                    PanelTexto.setText(valor1 / valor2 + "");
                    PanelTextoPrevio.setText(valor1 + " / " + valor2 + "");
                } else {
                    PanelTexto.setText("No se puede divider entre cero");
                    valor1 = 0;
                    valor2 = 0;
                }
                break;
            case 5:
                PanelTexto.setText(Math.pow(valor1, valor2) + "");
                PanelTextoPrevio.setText(valor1 + "^" + valor2);
                break;
            case 6:
                PanelTextoPrevio.setText(valor1 + " % " + valor2);
                PanelTexto.setText((valor1 * valor2) / 100 + "");
                break;
            default:
                break;
        }
    }//GEN-LAST:event_IgualActionPerformed

    private void SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumaActionPerformed
        valor1 = Float.parseFloat(PanelTexto.getText().replace(",", "."));
        operacion = 1;
        PanelTexto.setText("");
        PanelTextoPrevio.setText("" + valor1);
    }//GEN-LAST:event_SumaActionPerformed

    private void RestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestaActionPerformed
        valor1 = Float.parseFloat(PanelTexto.getText().replace(",", "."));
        operacion = 2;
        PanelTexto.setText("");
        PanelTextoPrevio.setText("" + valor1);
    }//GEN-LAST:event_RestaActionPerformed

    private void DosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DosActionPerformed
        PanelTexto.setText(PanelTexto.getText() + "2");
    }//GEN-LAST:event_DosActionPerformed

    private void CincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CincoActionPerformed
        PanelTexto.setText(PanelTexto.getText() + "5");
    }//GEN-LAST:event_CincoActionPerformed

    private void OchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OchoActionPerformed
        PanelTexto.setText(PanelTexto.getText() + "8");
    }//GEN-LAST:event_OchoActionPerformed

    private void CeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CeroActionPerformed
        PanelTexto.setText(PanelTexto.getText() + "0");
    }//GEN-LAST:event_CeroActionPerformed

    private void RaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RaizActionPerformed
        valor1 = Float.parseFloat(PanelTexto.getText().replace(",", "."));
        PanelTexto.setText(Math.sqrt(Float.parseFloat(PanelTexto.getText())) + "");
        PanelTextoPrevio.setText("√" + valor1 + "");
    }//GEN-LAST:event_RaizActionPerformed

    private void CuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuadradoActionPerformed
        valor1 = Float.parseFloat(PanelTexto.getText().replace(",", "."));
        PanelTexto.setText(Math.pow(Float.parseFloat(PanelTexto.getText()), 2) + "");
        PanelTextoPrevio.setText(valor1 + "^2");
    }//GEN-LAST:event_CuadradoActionPerformed

    private void UnoEntreXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnoEntreXActionPerformed
        if (Float.parseFloat(PanelTexto.getText()) == 0) {
            PanelTexto.setText("No se puede dividir entre cero");
        } else {
            PanelTexto.setText(1 / Float.parseFloat(PanelTexto.getText()) + "");
        }
    }//GEN-LAST:event_UnoEntreXActionPerformed

    private void DivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivisionActionPerformed
        valor1 = Float.parseFloat(PanelTexto.getText().replace(",", "."));
        operacion = 4;
        PanelTexto.setText("");
        PanelTextoPrevio.setText("" + valor1);
    }//GEN-LAST:event_DivisionActionPerformed

    private void MasMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasMenosActionPerformed
        if (Integer.parseInt(PanelTexto.getText()) > 0) {
            PanelTexto.setText("-" + PanelTexto.getText());
        } else {
            PanelTexto.setText(Integer.parseInt(PanelTexto.getText()) * -1 + "");
        }
    }//GEN-LAST:event_MasMenosActionPerformed

    private void BorrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarTodoActionPerformed
        valor1 = 0;
        valor2 = 0;
        PanelTexto.setText("");
        PanelTextoPrevio.setText("");
    }//GEN-LAST:event_BorrarTodoActionPerformed

    private void PorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PorcentajeActionPerformed
        valor1 = Float.parseFloat(PanelTexto.getText().replace(",", "."));
        PanelTextoPrevio.setText(valor1 + "");
        PanelTexto.setText("");
        operacion = 6;
    }//GEN-LAST:event_PorcentajeActionPerformed

    private void BorrarCaracterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarCaracterActionPerformed
        if (PanelTexto.getText().length() > 0) {
            PanelTexto.setText(PanelTexto.getText().substring(0, PanelTexto.getText().length() - 1));
        }
        if (PanelTextoPrevio.getText().length() > 0) {
            PanelTextoPrevio.setText(PanelTextoPrevio.getText().substring(0, PanelTextoPrevio.getText().length() - 1));
        }
    }//GEN-LAST:event_BorrarCaracterActionPerformed
//Metodo Trigonometria

    public void Trigonometria() {
        
        switch (funciones) {
            //seno
            case 11:
                valor1 = Double.parseDouble(PanelTexto.getText());
                PanelTextoPrevio.setText(" sin(" + valor1 + ")");
                Sin = Math.sin(valor1);
                PanelTexto.setText("" + Sin);
                break;
            //seno inverso 
            case 12:
                valor1 = Double.parseDouble(PanelTexto.getText());
                PanelTextoPrevio.setText(" sin-1(" + valor1 + ")");
                aSin = Math.asin(valor1);
                PanelTexto.setText("" + aSin);
                break;
            //cos
            case 13:
                valor1 = Double.parseDouble(PanelTexto.getText());
                PanelTextoPrevio.setText(" cos(" + valor1 + ")");
                Cos = Math.cos(valor1);
                PanelTexto.setText(Cos + "");
                break;
            //coseno inverso
            case 14:
                valor1 = Double.parseDouble(PanelTexto.getText());
                PanelTextoPrevio.setText(" cos-1(" + valor1 + ")");
                aCos = Math.acos(valor1);
                PanelTexto.setText(aCos + "");
                break;
            //tangente
            case 15:
                valor1 = Double.parseDouble(PanelTexto.getText());
                PanelTextoPrevio.setText(" tan(" + valor1 + ")");
                Tan = Math.tan(valor1);
                PanelTexto.setText("" + Tan);
                break;
            //tangente inverso
            case 16:
                valor1 = Double.parseDouble(PanelTexto.getText());
                PanelTextoPrevio.setText(" tan-1(" + valor1 + ")");
                aTan = Math.atan(valor1);
                PanelTexto.setText(aTan + "");
                break;
        }
    }
    private void cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosActionPerformed
        funciones = 13;
        Trigonometria();
    }//GEN-LAST:event_cosActionPerformed

    private void sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinActionPerformed
        funciones = 11;
        Trigonometria();
    }//GEN-LAST:event_sinActionPerformed

    private void tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanActionPerformed
        funciones = 15;
        Trigonometria();
    }//GEN-LAST:event_tanActionPerformed

    private void cos_negativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cos_negativoActionPerformed
        funciones = 14;
        Trigonometria();
    }//GEN-LAST:event_cos_negativoActionPerformed

    private void sin_negativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sin_negativoActionPerformed
        funciones = 12;
        Trigonometria();
    }//GEN-LAST:event_sin_negativoActionPerformed

    private void tan_negativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tan_negativoActionPerformed
        funciones = 16;
        Trigonometria();
    }//GEN-LAST:event_tan_negativoActionPerformed

    private void PiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PiActionPerformed
        PanelTexto.setText(PanelTexto.getText() + "3.14159265359");
    }//GEN-LAST:event_PiActionPerformed

    private void CuboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuboActionPerformed
        valor1 = Float.parseFloat(PanelTexto.getText().replace(",", "."));
        PanelTexto.setText(Math.pow(Float.parseFloat(PanelTexto.getText()), 3) + "");
        PanelTextoPrevio.setText(valor1 + "" + "^3");
    }//GEN-LAST:event_CuboActionPerformed

    private void BorrarActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActualActionPerformed
        if (valor1 != 0) {
            valor2 = 0;
        } else {
            valor1 = 0;
        }
        PanelTexto.setText("");
        PanelTextoPrevio.setText("");
    }//GEN-LAST:event_BorrarActualActionPerformed

    private void PotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PotenciaActionPerformed
        valor1 = Float.parseFloat(PanelTexto.getText().replace(",", "."));
        operacion = 5;
        PanelTexto.setText("");
        PanelTextoPrevio.setText(valor1 + "" + "^");
    }//GEN-LAST:event_PotenciaActionPerformed

    private void abrir_parentesisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrir_parentesisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_abrir_parentesisActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BorrarActual;
    private javax.swing.JButton BorrarCaracter;
    private javax.swing.JButton BorrarTodo;
    private javax.swing.JButton Cero;
    private javax.swing.JButton Cinco;
    private javax.swing.JButton Coma;
    private javax.swing.JButton Cuadrado;
    private javax.swing.JButton Cuatro;
    private javax.swing.JButton Cubo;
    private javax.swing.JButton Division;
    private javax.swing.JButton Dos;
    private javax.swing.JButton Igual;
    private javax.swing.JButton MasMenos;
    private javax.swing.JButton Multiplicacion;
    private javax.swing.JButton Nueve;
    private javax.swing.JButton Ocho;
    private javax.swing.JLabel PanelTexto;
    private javax.swing.JLabel PanelTextoPrevio;
    private javax.swing.JButton Pi;
    private javax.swing.JButton Porcentaje;
    private javax.swing.JButton Potencia;
    private javax.swing.JButton Raiz;
    private javax.swing.JButton Resta;
    private javax.swing.JButton Seis;
    private javax.swing.JButton Siete;
    private javax.swing.JButton Suma;
    private javax.swing.JButton Tres;
    private javax.swing.JButton Uno;
    private javax.swing.JButton UnoEntreX;
    private javax.swing.JButton abrir_parentesis;
    private javax.swing.JButton cerrar_parentesis;
    private javax.swing.JButton cos;
    private javax.swing.JButton cos_negativo;
    private javax.swing.JButton sin;
    private javax.swing.JButton sin_negativo;
    private javax.swing.JButton tan;
    private javax.swing.JButton tan_negativo;
    // End of variables declaration//GEN-END:variables
}
