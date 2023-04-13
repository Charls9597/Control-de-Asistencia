package Formularios;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class FormMenu extends javax.swing.JFrame {

    private JMenuBar mMenu;
    private JMenu Home, mniGestionar, mniRegistrar, mniReportes, mniAjustes;
    private JMenuItem Inicio, Salir;
    private JMenuItem mniGestionar2, mniGestionar3, mniGestionar4, mniGestionar5;
    private JMenuItem mniRegistrar1, mniRegistrar2, mniRegistrar3;
    private JMenuItem mniReportes1, mniReportes2;
    private JMenuItem mniAjustes1;
    private String iconCurso = "/Imagenes/Iconos/home_icon.png",
            iconMateria = "/Imagenes/Iconos/materia_icon.png",
            iconEstudiante = "/Imagenes/Iconos/estudiante_icon.png",
            iconPeriodo = "/Imagenes/Iconos/periodo_icon.png",
            iconTarea = "/Imagenes/Iconos/tarea_icon.png",
            iconAsistencia = "/Imagenes/Iconos/asistencia_icon.png",
            iconSello = "/Imagenes/Iconos/sello_icon.png",
            iconUsuario = "/Imagenes/Iconos/usuario_icon.png",
            iconExit = "/Imagenes/Iconos/exit_icon.png";

    Font miFont = new Font("Leelawadee UI", Font.BOLD, 14);
    Color color = new Color(255, 255, 255);

    public FormMenu() {
        initComponents();
        mMenu = new JMenuBar();
        setJMenuBar(mMenu);

        Home = new JMenu("HOGAR");
        mMenu.add(Home);
        Home.setForeground(color);
        Home.setFont(miFont);
        Inicio = new JMenuItem("INICIO", getIcon(iconCurso));
        Home.add(Inicio);
        Inicio.setForeground(color);
        Inicio.setFont(miFont);
        Salir = new JMenuItem("SALIR", getIcon(iconExit));
        Home.add(Salir);
        Salir.setForeground(color);
        Salir.setFont(miFont);

        mniGestionar = new JMenu("GESTIONAR");
        mMenu.add(mniGestionar);
        mniGestionar.setForeground(color);
        mniGestionar.setFont(miFont);
        mniGestionar3 = new JMenuItem("ESTUDIANTES", getIcon(iconEstudiante));
        mniGestionar.add(mniGestionar3);
        mniGestionar3.setForeground(color);
        mniGestionar3.setFont(miFont);
        mniGestionar2 = new JMenuItem("MATERIA", getIcon(iconMateria));
        mniGestionar.add(mniGestionar2);
        mniGestionar2.setForeground(color);
        mniGestionar2.setFont(miFont);
        mniGestionar4 = new JMenuItem("PERIODO", getIcon(iconPeriodo));
        mniGestionar.add(mniGestionar4);
        mniGestionar4.setForeground(color);
        mniGestionar4.setFont(miFont);
        mniGestionar5 = new JMenuItem("TAREA", getIcon(iconTarea));
        mniGestionar.add(mniGestionar5);
        mniGestionar5.setForeground(color);
        mniGestionar5.setFont(miFont);

        mniRegistrar = new JMenu("REGISTRAR");
        mMenu.add(mniRegistrar);
        mniRegistrar.setForeground(color);
        mniRegistrar.setFont(miFont);
        mniRegistrar1 = new JMenuItem("ASISTENCIA", getIcon(iconAsistencia));
        mniRegistrar.add(mniRegistrar1);
        mniRegistrar1.setForeground(color);
        mniRegistrar1.setFont(miFont);
        mniRegistrar2 = new JMenuItem("TAREAS", getIcon(iconTarea));
        mniRegistrar.add(mniRegistrar2);
        mniRegistrar2.setForeground(color);
        mniRegistrar2.setFont(miFont);
        mniRegistrar3 = new JMenuItem("SELLOS", getIcon(iconSello));
        mniRegistrar.add(mniRegistrar3);
        mniRegistrar3.setForeground(color);
        mniRegistrar3.setFont(miFont);

        mniReportes = new JMenu("REPORTES");
        mMenu.add(mniReportes);
        mniReportes.setForeground(color);
        mniReportes.setFont(miFont);
        mniReportes1 = new JMenuItem("ASISTENCIA", getIcon(iconAsistencia));
        mniReportes.add(mniReportes1);
        mniReportes1.setForeground(color);
        mniReportes1.setFont(miFont);
        mniReportes2 = new JMenuItem("TAREAS", getIcon(iconTarea));
        mniReportes.add(mniReportes2);
        mniReportes2.setForeground(color);
        mniReportes2.setFont(miFont);

        mniAjustes = new JMenu("AJUSTES");
        mMenu.add(mniAjustes);
        mniAjustes.setForeground(color);
        mniAjustes.setFont(miFont);
        mniAjustes1 = new JMenuItem("USUARIO", getIcon(iconUsuario));
        mniAjustes.add(mniAjustes1);
        mniAjustes1.setForeground(color);
        mniAjustes1.setFont(miFont);

        Inicio.addActionListener((ActionEvent e) -> {
            CambiarVista(FMInicio);
        });

        Salir.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });

        mniGestionar2.addActionListener((ActionEvent e) -> {
            CambiarVista(GesMateria);
        });
        mniGestionar3.addActionListener((ActionEvent e) -> {
            CambiarVista(GesEstudiante);
        });
        mniGestionar4.addActionListener((ActionEvent e) -> {
            CambiarVista(GesPeriodo);
        });
        mniGestionar5.addActionListener((ActionEvent e) -> {
            CambiarVista(GesTarea);
        });

        mniRegistrar1.addActionListener((ActionEvent e) -> {
            CambiarVista(RegAsistencia);
        });
        mniRegistrar2.addActionListener((ActionEvent e) -> {
            CambiarVista(RegTareas);
        });
        mniRegistrar3.addActionListener((ActionEvent e) -> {
            CambiarVista(RegSellos);
        });

        mniReportes1.addActionListener((ActionEvent e) -> {
            CambiarVista(RepAsistencia);
        });
        mniReportes2.addActionListener((ActionEvent e) -> {
            CambiarVista(RepTareas);
        });

        mniAjustes1.addActionListener((ActionEvent e) -> {
            CambiarVista(ConfiUsuario);
        });
    }

    private void CambiarVista(JPanel jpanel) {
        JPrincipal.removeAll();
        JPrincipal.add(jpanel);
        JPrincipal.repaint();

        ActivarVista(jpanel);
    }

    private void ActivarVista(JPanel jpanel) {
        FMInicio.setEnabled(false);
        FMInicio.setVisible(false);

        GesEstudiante.setEnabled(false);
        GesEstudiante.setVisible(false);
        GesMateria.setEnabled(false);
        GesMateria.setVisible(false);
        GesPeriodo.setEnabled(false);
        GesPeriodo.setVisible(false);
        GesTarea.setEnabled(false);
        GesTarea.setVisible(false);

        RegAsistencia.setEnabled(false);
        RegAsistencia.setVisible(false);
        RegSellos.setEnabled(false);
        RegSellos.setVisible(false);
        RegTareas.setEnabled(false);
        RegTareas.setVisible(false);

        RepAsistencia.setEnabled(false);
        RepAsistencia.setVisible(false);
        RepTareas.setEnabled(false);
        RepTareas.setVisible(false);

        ConfiUsuario.setEnabled(false);
        ConfiUsuario.setVisible(false);

        jpanel.setEnabled(true);
        jpanel.setVisible(true);
    }

    private Icon getIcon(String ruta) {
        return new ImageIcon(new ImageIcon(getClass().getResource(ruta))
                .getImage().getScaledInstance(30, 30, 0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        JPrincipal = new javax.swing.JPanel();
        FMInicio = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        TEXTO = new javax.swing.JLabel();
        LOGO = new javax.swing.JLabel();
        GesMateria = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jToggleButton4 = new javax.swing.JToggleButton();
        PRegistrar6 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 25), new java.awt.Dimension(0, 25), new java.awt.Dimension(32767, 30));
        GesEstudiante = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jToggleButton3 = new javax.swing.JToggleButton();
        PRegistrar2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 25), new java.awt.Dimension(0, 25), new java.awt.Dimension(32767, 30));
        GesPeriodo = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jToggleButton5 = new javax.swing.JToggleButton();
        PRegistrar7 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 25), new java.awt.Dimension(0, 25), new java.awt.Dimension(32767, 30));
        GesTarea = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jToggleButton6 = new javax.swing.JToggleButton();
        PRegistrar8 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 25), new java.awt.Dimension(0, 25), new java.awt.Dimension(32767, 30));
        RegAsistencia = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        RegTareas = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        RegSellos = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        RepAsistencia = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        RepTareas = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        ConfiUsuario = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 0));
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setResizable(false);

        JPrincipal.setMaximumSize(new java.awt.Dimension(1000, 600));
        JPrincipal.setMinimumSize(new java.awt.Dimension(1000, 600));
        JPrincipal.setPreferredSize(new java.awt.Dimension(1000, 600));
        JPrincipal.setLayout(new java.awt.CardLayout());

        FMInicio.setBackground(new java.awt.Color(255, 255, 255));
        FMInicio.setMaximumSize(new java.awt.Dimension(1000, 600));
        FMInicio.setMinimumSize(new java.awt.Dimension(1000, 600));
        FMInicio.setPreferredSize(new java.awt.Dimension(1000, 600));
        FMInicio.setLayout(new javax.swing.BoxLayout(FMInicio, javax.swing.BoxLayout.Y_AXIS));

        jPanel10.setBackground(new java.awt.Color(153, 0, 0));
        jPanel10.setMaximumSize(new java.awt.Dimension(1000, 35));
        jPanel10.setMinimumSize(new java.awt.Dimension(1000, 35));
        jPanel10.setPreferredSize(new java.awt.Dimension(1000, 35));

        jLabel16.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("INICIO");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(951, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        FMInicio.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setMaximumSize(new java.awt.Dimension(1000, 565));
        jPanel11.setMinimumSize(new java.awt.Dimension(1000, 565));
        jPanel11.setPreferredSize(new java.awt.Dimension(1000, 565));
        jPanel11.setLayout(null);

        TEXTO.setFont(new java.awt.Font("Leelawadee UI", 1, 48)); // NOI18N
        TEXTO.setForeground(new java.awt.Color(153, 0, 0));
        TEXTO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TEXTO.setText("BIENVENIDO");
        TEXTO.setPreferredSize(new java.awt.Dimension(1000, 300));
        jPanel11.add(TEXTO);
        TEXTO.setBounds(6, 56, 988, 64);

        LOGO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/books_education_learning_knowledge_icon.png"))); // NOI18N
        LOGO.setMaximumSize(new java.awt.Dimension(1000, 35));
        LOGO.setMinimumSize(new java.awt.Dimension(1000, 35));
        LOGO.setPreferredSize(new java.awt.Dimension(1000, 35));
        jPanel11.add(LOGO);
        LOGO.setBounds(6, 6, 988, 550);

        FMInicio.add(jPanel11);

        JPrincipal.add(FMInicio, "card2");

        GesMateria.setBackground(new java.awt.Color(255, 255, 255));
        GesMateria.setMaximumSize(new java.awt.Dimension(1000, 600));
        GesMateria.setMinimumSize(new java.awt.Dimension(1000, 600));
        GesMateria.setPreferredSize(new java.awt.Dimension(1000, 600));
        GesMateria.setLayout(new javax.swing.BoxLayout(GesMateria, javax.swing.BoxLayout.Y_AXIS));

        jPanel4.setBackground(new java.awt.Color(153, 0, 0));
        jPanel4.setMaximumSize(new java.awt.Dimension(1000, 35));
        jPanel4.setMinimumSize(new java.awt.Dimension(1000, 35));
        jPanel4.setPreferredSize(new java.awt.Dimension(1000, 35));

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("AGREGAR MATERIA");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        GesMateria.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setMaximumSize(new java.awt.Dimension(1000, 565));
        jPanel5.setMinimumSize(new java.awt.Dimension(1000, 565));
        jPanel5.setLayout(null);

        jToggleButton4.setBackground(new java.awt.Color(153, 0, 0));
        jToggleButton4.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jToggleButton4.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/nuevoS.png"))); // NOI18N
        jToggleButton4.setText("NUEVO");
        jPanel5.add(jToggleButton4);
        jToggleButton4.setBounds(6, 6, 106, 31);

        PRegistrar6.setBackground(new java.awt.Color(204, 204, 204));
        PRegistrar6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "LISTA DATOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI", 1, 14), new java.awt.Color(153, 0, 0))); // NOI18N

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MATERIA"
            }
        ));
        jScrollPane7.setViewportView(jTable7);

        javax.swing.GroupLayout PRegistrar6Layout = new javax.swing.GroupLayout(PRegistrar6);
        PRegistrar6.setLayout(PRegistrar6Layout);
        PRegistrar6Layout.setHorizontalGroup(
            PRegistrar6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
        );
        PRegistrar6Layout.setVerticalGroup(
            PRegistrar6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PRegistrar6Layout.createSequentialGroup()
                .addGap(0, 77, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.add(PRegistrar6);
        PRegistrar6.setBounds(0, 43, 1000, 490);
        jPanel5.add(filler7);
        filler7.setBounds(140, 535, 706, 25);

        GesMateria.add(jPanel5);

        JPrincipal.add(GesMateria, "card4");

        GesEstudiante.setBackground(new java.awt.Color(255, 255, 255));
        GesEstudiante.setMaximumSize(new java.awt.Dimension(1000, 600));
        GesEstudiante.setMinimumSize(new java.awt.Dimension(1000, 600));
        GesEstudiante.setPreferredSize(new java.awt.Dimension(1000, 600));
        GesEstudiante.setLayout(new javax.swing.BoxLayout(GesEstudiante, javax.swing.BoxLayout.Y_AXIS));

        jPanel6.setBackground(new java.awt.Color(153, 0, 0));
        jPanel6.setMaximumSize(new java.awt.Dimension(1000, 35));
        jPanel6.setMinimumSize(new java.awt.Dimension(1000, 35));
        jPanel6.setPreferredSize(new java.awt.Dimension(1000, 35));

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("AGREGAR ESTUDIANTES");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        GesEstudiante.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setMaximumSize(new java.awt.Dimension(1000, 565));
        jPanel7.setMinimumSize(new java.awt.Dimension(1000, 565));
        jPanel7.setLayout(null);

        jToggleButton3.setBackground(new java.awt.Color(153, 0, 0));
        jToggleButton3.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jToggleButton3.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/nuevoS.png"))); // NOI18N
        jToggleButton3.setText("NUEVO");
        jPanel7.add(jToggleButton3);
        jToggleButton3.setBounds(6, 6, 106, 31);

        PRegistrar2.setBackground(new java.awt.Color(204, 204, 204));
        PRegistrar2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "LISTA DATOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI", 1, 14), new java.awt.Color(153, 0, 0))); // NOI18N

        jTable3.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jTable3.setForeground(new java.awt.Color(153, 0, 0));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CI", "NOMBRES", "APELLIDO PATERNO", "APELLIDO MATERNO", "TELEFONO", "DIRECCION"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout PRegistrar2Layout = new javax.swing.GroupLayout(PRegistrar2);
        PRegistrar2.setLayout(PRegistrar2Layout);
        PRegistrar2Layout.setHorizontalGroup(
            PRegistrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
        );
        PRegistrar2Layout.setVerticalGroup(
            PRegistrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PRegistrar2Layout.createSequentialGroup()
                .addGap(0, 77, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel7.add(PRegistrar2);
        PRegistrar2.setBounds(0, 43, 1000, 490);
        jPanel7.add(filler3);
        filler3.setBounds(140, 535, 706, 25);

        GesEstudiante.add(jPanel7);

        JPrincipal.add(GesEstudiante, "card5");

        GesPeriodo.setBackground(new java.awt.Color(255, 255, 255));
        GesPeriodo.setMaximumSize(new java.awt.Dimension(1000, 600));
        GesPeriodo.setMinimumSize(new java.awt.Dimension(1000, 600));
        GesPeriodo.setPreferredSize(new java.awt.Dimension(1000, 600));
        GesPeriodo.setLayout(new javax.swing.BoxLayout(GesPeriodo, javax.swing.BoxLayout.Y_AXIS));

        jPanel8.setBackground(new java.awt.Color(153, 0, 0));
        jPanel8.setMaximumSize(new java.awt.Dimension(1000, 35));
        jPanel8.setMinimumSize(new java.awt.Dimension(1000, 35));
        jPanel8.setPreferredSize(new java.awt.Dimension(1000, 35));

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("AGREGAR PERIODO");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        GesPeriodo.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setMaximumSize(new java.awt.Dimension(1000, 565));
        jPanel9.setMinimumSize(new java.awt.Dimension(1000, 565));
        jPanel9.setLayout(null);

        jToggleButton5.setBackground(new java.awt.Color(153, 0, 0));
        jToggleButton5.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jToggleButton5.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/nuevoS.png"))); // NOI18N
        jToggleButton5.setText("NUEVO");
        jPanel9.add(jToggleButton5);
        jToggleButton5.setBounds(6, 6, 106, 31);

        PRegistrar7.setBackground(new java.awt.Color(204, 204, 204));
        PRegistrar7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "LISTA DATOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI", 1, 14), new java.awt.Color(153, 0, 0))); // NOI18N

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PERIODO"
            }
        ));
        jScrollPane8.setViewportView(jTable8);

        javax.swing.GroupLayout PRegistrar7Layout = new javax.swing.GroupLayout(PRegistrar7);
        PRegistrar7.setLayout(PRegistrar7Layout);
        PRegistrar7Layout.setHorizontalGroup(
            PRegistrar7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
        );
        PRegistrar7Layout.setVerticalGroup(
            PRegistrar7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PRegistrar7Layout.createSequentialGroup()
                .addGap(0, 77, Short.MAX_VALUE)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel9.add(PRegistrar7);
        PRegistrar7.setBounds(0, 43, 1000, 490);
        jPanel9.add(filler8);
        filler8.setBounds(140, 535, 706, 25);

        GesPeriodo.add(jPanel9);

        JPrincipal.add(GesPeriodo, "card6");

        GesTarea.setBackground(new java.awt.Color(255, 255, 255));
        GesTarea.setMaximumSize(new java.awt.Dimension(1000, 600));
        GesTarea.setMinimumSize(new java.awt.Dimension(1000, 600));
        GesTarea.setPreferredSize(new java.awt.Dimension(1000, 600));
        GesTarea.setLayout(new javax.swing.BoxLayout(GesTarea, javax.swing.BoxLayout.Y_AXIS));

        jPanel12.setBackground(new java.awt.Color(153, 0, 0));
        jPanel12.setMaximumSize(new java.awt.Dimension(1000, 35));
        jPanel12.setMinimumSize(new java.awt.Dimension(1000, 35));
        jPanel12.setPreferredSize(new java.awt.Dimension(1000, 35));

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("AGREGAR TEREA");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        GesTarea.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setMaximumSize(new java.awt.Dimension(1000, 565));
        jPanel13.setMinimumSize(new java.awt.Dimension(1000, 565));
        jPanel13.setLayout(null);

        jToggleButton6.setBackground(new java.awt.Color(153, 0, 0));
        jToggleButton6.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jToggleButton6.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/nuevoS.png"))); // NOI18N
        jToggleButton6.setText("NUEVO");
        jPanel13.add(jToggleButton6);
        jToggleButton6.setBounds(6, 6, 106, 31);

        PRegistrar8.setBackground(new java.awt.Color(204, 204, 204));
        PRegistrar8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "LISTA DATOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI", 1, 14), new java.awt.Color(153, 0, 0))); // NOI18N

        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TAREAS", "FECHA"
            }
        ));
        jScrollPane9.setViewportView(jTable9);

        javax.swing.GroupLayout PRegistrar8Layout = new javax.swing.GroupLayout(PRegistrar8);
        PRegistrar8.setLayout(PRegistrar8Layout);
        PRegistrar8Layout.setHorizontalGroup(
            PRegistrar8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
        );
        PRegistrar8Layout.setVerticalGroup(
            PRegistrar8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PRegistrar8Layout.createSequentialGroup()
                .addGap(0, 77, Short.MAX_VALUE)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel13.add(PRegistrar8);
        PRegistrar8.setBounds(0, 43, 1000, 490);
        jPanel13.add(filler9);
        filler9.setBounds(140, 535, 706, 25);

        GesTarea.add(jPanel13);

        JPrincipal.add(GesTarea, "card7");

        RegAsistencia.setBackground(new java.awt.Color(255, 255, 255));
        RegAsistencia.setMaximumSize(new java.awt.Dimension(1000, 600));
        RegAsistencia.setMinimumSize(new java.awt.Dimension(1000, 600));
        RegAsistencia.setPreferredSize(new java.awt.Dimension(1000, 600));
        RegAsistencia.setLayout(new javax.swing.BoxLayout(RegAsistencia, javax.swing.BoxLayout.Y_AXIS));

        jPanel16.setBackground(new java.awt.Color(153, 0, 0));
        jPanel16.setMaximumSize(new java.awt.Dimension(1000, 35));
        jPanel16.setMinimumSize(new java.awt.Dimension(1000, 35));
        jPanel16.setPreferredSize(new java.awt.Dimension(1000, 35));

        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("REGISTRAR ASISTENCIA");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        RegAsistencia.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setMaximumSize(new java.awt.Dimension(1000, 565));
        jPanel17.setMinimumSize(new java.awt.Dimension(1000, 565));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );

        RegAsistencia.add(jPanel17);

        JPrincipal.add(RegAsistencia, "card9");

        RegTareas.setBackground(new java.awt.Color(255, 255, 255));
        RegTareas.setMaximumSize(new java.awt.Dimension(1000, 600));
        RegTareas.setMinimumSize(new java.awt.Dimension(1000, 600));
        RegTareas.setPreferredSize(new java.awt.Dimension(1000, 600));
        RegTareas.setLayout(new javax.swing.BoxLayout(RegTareas, javax.swing.BoxLayout.Y_AXIS));

        jPanel18.setBackground(new java.awt.Color(153, 0, 0));
        jPanel18.setMaximumSize(new java.awt.Dimension(1000, 35));
        jPanel18.setMinimumSize(new java.awt.Dimension(1000, 35));
        jPanel18.setPreferredSize(new java.awt.Dimension(1000, 35));

        jLabel8.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("REGISTRAR TEREAS");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        RegTareas.add(jPanel18);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setMaximumSize(new java.awt.Dimension(1000, 565));
        jPanel19.setMinimumSize(new java.awt.Dimension(1000, 565));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );

        RegTareas.add(jPanel19);

        JPrincipal.add(RegTareas, "card10");

        RegSellos.setBackground(new java.awt.Color(255, 255, 255));
        RegSellos.setMaximumSize(new java.awt.Dimension(1000, 600));
        RegSellos.setMinimumSize(new java.awt.Dimension(1000, 600));
        RegSellos.setPreferredSize(new java.awt.Dimension(1000, 600));
        RegSellos.setLayout(new javax.swing.BoxLayout(RegSellos, javax.swing.BoxLayout.Y_AXIS));

        jPanel20.setBackground(new java.awt.Color(153, 0, 0));
        jPanel20.setMaximumSize(new java.awt.Dimension(1000, 35));
        jPanel20.setMinimumSize(new java.awt.Dimension(1000, 35));
        jPanel20.setPreferredSize(new java.awt.Dimension(1000, 35));

        jLabel9.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("REGISTRAR SELLOS");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        RegSellos.add(jPanel20);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setMaximumSize(new java.awt.Dimension(1000, 565));
        jPanel21.setMinimumSize(new java.awt.Dimension(1000, 565));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );

        RegSellos.add(jPanel21);

        JPrincipal.add(RegSellos, "card11");

        RepAsistencia.setBackground(new java.awt.Color(255, 255, 255));
        RepAsistencia.setMaximumSize(new java.awt.Dimension(1000, 600));
        RepAsistencia.setMinimumSize(new java.awt.Dimension(1000, 600));
        RepAsistencia.setPreferredSize(new java.awt.Dimension(1000, 600));
        RepAsistencia.setLayout(new javax.swing.BoxLayout(RepAsistencia, javax.swing.BoxLayout.Y_AXIS));

        jPanel26.setBackground(new java.awt.Color(153, 0, 0));
        jPanel26.setMaximumSize(new java.awt.Dimension(1000, 35));
        jPanel26.setMinimumSize(new java.awt.Dimension(1000, 35));
        jPanel26.setPreferredSize(new java.awt.Dimension(1000, 35));

        jLabel11.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("REPORTE ASISTENCIA");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        RepAsistencia.add(jPanel26);

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setMaximumSize(new java.awt.Dimension(1000, 565));
        jPanel27.setMinimumSize(new java.awt.Dimension(1000, 565));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );

        RepAsistencia.add(jPanel27);

        JPrincipal.add(RepAsistencia, "card13");

        RepTareas.setBackground(new java.awt.Color(255, 255, 255));
        RepTareas.setMaximumSize(new java.awt.Dimension(1000, 600));
        RepTareas.setMinimumSize(new java.awt.Dimension(1000, 600));
        RepTareas.setPreferredSize(new java.awt.Dimension(1000, 600));
        RepTareas.setLayout(new javax.swing.BoxLayout(RepTareas, javax.swing.BoxLayout.Y_AXIS));

        jPanel24.setBackground(new java.awt.Color(153, 0, 0));
        jPanel24.setMaximumSize(new java.awt.Dimension(1000, 35));
        jPanel24.setMinimumSize(new java.awt.Dimension(1000, 35));
        jPanel24.setPreferredSize(new java.awt.Dimension(1000, 35));

        jLabel12.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("REPORTE TEREAS");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel24Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel24Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel12)
                    .addContainerGap(9, Short.MAX_VALUE)))
        );

        RepTareas.add(jPanel24);

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setMaximumSize(new java.awt.Dimension(1000, 565));
        jPanel25.setMinimumSize(new java.awt.Dimension(1000, 565));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );

        RepTareas.add(jPanel25);

        JPrincipal.add(RepTareas, "card14");

        ConfiUsuario.setBackground(new java.awt.Color(255, 255, 255));
        ConfiUsuario.setMaximumSize(new java.awt.Dimension(1000, 600));
        ConfiUsuario.setMinimumSize(new java.awt.Dimension(1000, 600));
        ConfiUsuario.setPreferredSize(new java.awt.Dimension(1000, 600));
        ConfiUsuario.setLayout(new javax.swing.BoxLayout(ConfiUsuario, javax.swing.BoxLayout.Y_AXIS));

        jPanel32.setBackground(new java.awt.Color(153, 0, 0));
        jPanel32.setMaximumSize(new java.awt.Dimension(1000, 35));
        jPanel32.setMinimumSize(new java.awt.Dimension(1000, 35));
        jPanel32.setPreferredSize(new java.awt.Dimension(1000, 35));

        jLabel15.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("CONFIGURACION USUSARIO");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        ConfiUsuario.add(jPanel32);

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.setMaximumSize(new java.awt.Dimension(1000, 565));
        jPanel33.setMinimumSize(new java.awt.Dimension(1000, 565));
        jPanel33.setLayout(new javax.swing.BoxLayout(jPanel33, javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI", 1, 14), new java.awt.Color(153, 0, 0))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 538, Short.MAX_VALUE)
        );

        jPanel33.add(jPanel1);

        ConfiUsuario.add(jPanel33);

        JPrincipal.add(ConfiUsuario, "card16");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Color color = new Color(153, 0, 0);
        Color colorTF = new Color(170, 0, 0);
        UIManager.put("nimbusBase", color);
        UIManager.put("text", color.WHITE);
        UIManager.put("TextField.background", colorTF);

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
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ConfiUsuario;
    private javax.swing.JPanel FMInicio;
    private javax.swing.JPanel GesEstudiante;
    private javax.swing.JPanel GesMateria;
    private javax.swing.JPanel GesPeriodo;
    private javax.swing.JPanel GesTarea;
    private javax.swing.JPanel JPrincipal;
    private javax.swing.JLabel LOGO;
    private javax.swing.JPanel PRegistrar2;
    private javax.swing.JPanel PRegistrar6;
    private javax.swing.JPanel PRegistrar7;
    private javax.swing.JPanel PRegistrar8;
    private javax.swing.JPanel RegAsistencia;
    private javax.swing.JPanel RegSellos;
    private javax.swing.JPanel RegTareas;
    private javax.swing.JPanel RepAsistencia;
    private javax.swing.JPanel RepTareas;
    private javax.swing.JLabel TEXTO;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    // End of variables declaration//GEN-END:variables
}
