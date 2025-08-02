import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class SRepresentor extends JFrame implements ActionListener
{
    PanelDess1 panelDess1;
    PanelDess2 panelDess2;
    PanelResult panelResult;
    protected static String[] couleurBlocs;
    int number1, number2, number3;
    int step = 1;
    private String[] noirs = {"Thousand_Block_black.png", "Hundred_Block_black.png", "Ten_Block_black.png", "One_Block_black.png"};
    private String[] bleus = {"Thousand_Block_blue.png", "Hundred_Block_blue.png", "Ten_Block_blue.png", "One_Block_blue.png"};
    private String[] verts = {"Thousand_Block_green.png", "Hundred_Block_green.png", "Ten_Block_green.png", "One_Block_green.png"};
    private String[] oranges = {"Thousand_Block_orange.png", "Hundred_Block_orange.png", "Ten_Block_orange.png", "One_Block_orange.png"};
    private String[] roses = {"Thousand_Block_pink.png", "Hundred_Block_pink.png", "Ten_Block_pink.png", "One_Block_pink.png"};
    private String[] pourpres = {"Thousand_Block_purple.png", "Hundred_Block_purple.png", "Ten_Block_purple.png", "One_Block_purple.png"};
    private String[] rouges = {"Thousand_Block_red.png", "Hundred_Block_red.png", "Ten_Block_red.png", "One_Block_red.png"};
    private String[] blancs = {"Thousand_Block_white.png", "Hundred_Block_white.png", "Ten_Block_white.png", "One_Block_white.png"};
    private String[] jaunes = {"Thousand_Block_yellow.png", "Hundred_Block_yellow.png", "Ten_Block_yellow.png", "One_Block_yellow.png"};
    JLabel lblNumber1, lblNumber2;
    JTextField txtNumber1, txtNumber2;
    JButton btnNext, btnPrevious, btnNew;
    private int unites1, dizaines1, centaines1, unites2, dizaines2, centaines2,
            unites3, dizaines3, centaines3;
    private BufferedImage imageMill, imageCent, imageDiz, imageUn;
    protected static Image imageMillScaled, imageCentScaled, imageDizScaled, imageUnScaled;
    protected static final int ESPACEMENT = 5;
    protected static final int BLOCS_PAR_LIGNE = 5;
    protected static final int HAUT_PAN_CORRECTION = 45;

    public SRepresentor()
    {
        setTitle("Représentateur de soustraction");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        URL iconUrl = getClass().getResource("icons/calculate.png");
        Image icon = Toolkit.getDefaultToolkit().getImage(iconUrl);
        setIconImage(icon);
        setVisible(true);

        couleurBlocs = bleus;
        panelDess1 = new PanelDess1(this);
        panelDess2 = new PanelDess2(this);
        // panelResult = new PanelResult(this);
        JPanel borderPanel1 = new JPanel(new BorderLayout());
        borderPanel1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        borderPanel1.add(panelDess1);
        JPanel borderPanel2 = new JPanel(new BorderLayout());
        borderPanel2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        borderPanel2.add(panelDess2);
        JPanel borderPanel3 = new JPanel(new BorderLayout());
       /* borderPanel3.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        borderPanel3.add(panelResult);*/
        JPanel panelSupp = new JPanel();
        panelSupp.add(borderPanel1);
        panelSupp.add(borderPanel2);
        // panelSupp.add(borderPanel3);
        add(panelSupp);

        Box panelControl = Box.createHorizontalBox();
        panelControl.setPreferredSize(new Dimension(0, 40)); // largeur flexible, hauteur 50
        panelControl.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        panelControl.add(Box.createHorizontalStrut(5));
        lblNumber1 = new JLabel("number1");
        lblNumber1.setAlignmentY(Component.CENTER_ALIGNMENT);
        panelControl.add(lblNumber1);
        panelControl.add(Box.createHorizontalStrut(5));
        txtNumber1 = new JTextField();
        txtNumber1.setAlignmentY(Component.CENTER_ALIGNMENT);
        txtNumber1.setMaximumSize(new Dimension(50, 30));
        txtNumber1.addActionListener(this);
        panelControl.add(txtNumber1);
        panelControl.add(Box.createHorizontalStrut(10));
        lblNumber2 = new JLabel("Number 2");
        lblNumber2.setAlignmentY(Component.CENTER_ALIGNMENT);

        panelControl.add(lblNumber2);
        panelControl.add(Box.createHorizontalStrut(5));
        txtNumber2 = new JTextField();
        txtNumber2.setAlignmentY(Component.CENTER_ALIGNMENT);
        txtNumber2.setMaximumSize(new Dimension(50, 30));
        txtNumber2.addActionListener(this);
        txtNumber2.setEnabled(false);
        panelControl.add(txtNumber2);
        panelControl.add(Box.createHorizontalStrut(20));
        btnNext = new JButton("Suivant");
        btnNext.setAlignmentY(Component.CENTER_ALIGNMENT);
        btnNext.addActionListener(this);
        panelControl.add(btnNext);
        btnPrevious = new JButton("Précédent");
        btnPrevious.setAlignmentY(Component.CENTER_ALIGNMENT);
        btnPrevious.addActionListener(this);
        panelControl.add(btnPrevious);
        add(panelControl, "South");
        btnNext.setEnabled(false);
        btnPrevious.setEnabled(false);
        btnNew = new JButton("Nouveau");
        btnNew.setAlignmentY(Component.CENTER_ALIGNMENT);
        btnNew.addActionListener(this);
        panelControl.add(btnNew);
        chargerImages(bleus);
        revalidate();
        repaint();

    }

    protected void chargerImages(String[] blocColors)
    {
        int d = 25;
        try
        {
            imageMill = ImageIO.read(getClass().getResource("/blocs/" + blocColors[0]));

            imageMillScaled = imageMill.getScaledInstance(132 + d, 132 + d, Image.SCALE_SMOOTH);
            imageCent = ImageIO.read(getClass().getResource("/blocs/" + blocColors[1]));
            imageCentScaled = imageCent.getScaledInstance(103 + d, 103 + d, Image.SCALE_SMOOTH);
            imageDiz = ImageIO.read(getClass().getResource("/blocs/" + blocColors[2]));
            imageDizScaled = imageDiz.getScaledInstance(28, 105 + d, Image.SCALE_SMOOTH);
            imageUn = ImageIO.read(getClass().getResource("/blocs/" + blocColors[3]));
            imageUnScaled = imageUn.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
            panelDess1.repaint(); panelDess2.repaint();
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }


    public void actionPerformed(ActionEvent e)
    {

        Object source = e.getSource();
        try
        {
            if (source == txtNumber1)
            {

                txtNumber2.setEnabled(true);
                txtNumber2.requestFocus();
            }
            if (source == txtNumber2)
            {

                extractionChiffres();
                // panelResult.setDec(0); panelResult.setUn(0); panelResult.repaint();
                btnNext.setEnabled(true);

            }
        } catch (NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(this, "Veuillez entrer un nombre valide",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        if (source == btnNext)
        {
            nextStep();
            btnPrevious.setEnabled(true);
            btnPrevious.setEnabled(true);
            txtNumber1.setEnabled(false);
            txtNumber2.setEnabled(false);
        }
        if (source == btnPrevious)
        {
            extractionChiffres();
            if(step == 3)
            {
                if (dizaines1 < dizaines2) calculFirstStep();
                step = 2;

            }
            else if(step == 2)
            {
                step = 1;
                btnPrevious.setEnabled(false);

            }
            btnNext.setEnabled(true);
         /*   panelResult.setUn(0);
            panelResult.setDec(0);
            panelResult.repaint();*/
        }
        if (source == btnNew)
        {
            panelDess1.setUn(0);
            panelDess1.setDec(0);
            panelDess1.setCent(0);
            panelDess1.repaint();
            panelDess2.setUn(0);
            panelDess2.setDec(0);
            panelDess2.setCent(0);
            panelDess2.repaint();
            //  panelResult.setUn(0); panelResult.setDec(0); panelResult.repaint();
            txtNumber1.setEnabled(true);
            btnNext.setEnabled(false);
            btnPrevious.setEnabled(false);
            txtNumber1.setText("");
            txtNumber2.setText("");
            step = 1;
        }


    }

    private void extractionChiffres()
    {
        number1 = Integer.parseInt(txtNumber1.getText());
        number2 = Integer.parseInt(txtNumber2.getText());
        if (number2 > number1)
        {
            JOptionPane.showMessageDialog(this, "Le nombre 1 doit être supérieur" +
                    "au nombre 2", "Erreur", JOptionPane.ERROR_MESSAGE);
            return;
        }
        number3 = number1 - number2;

        // Extraction pour number1
        unites1 = number1 % 10;
        dizaines1 = (number1 / 10) % 10;
        centaines1 = (number1 / 100) % 10;

        // Extraction pour number2
        unites2 = number2 % 10;
        dizaines2 = (number2 / 10) % 10;
        centaines2 = (number2 / 100) % 10;

        // Extraction pour number3
        unites3 = number3 % 10;
        dizaines3 = (number3 / 10) % 10;
        centaines3 = (number3 / 100) % 10;

        // Configuration des panneaux de dessin
        panelDess1.setUn(unites1);
        panelDess1.setDec(dizaines1);
        panelDess1.setCent(centaines1);

        panelDess2.setUn(unites2);
        panelDess2.setDec(dizaines2);
        panelDess2.setCent(centaines2);

        panelDess1.repaint();
        panelDess2.repaint();
    }

    private void nextStep()
    {
        System.out.println("step = " + step);
        if (step == 1)
        {
            if (unites1 < unites2)
            {
                calculFirstStep();
               /* panelResult.setUn(unites1 + 10 - unites2);
                panelResult.setDec(dizaines1 - 1 - dizaines2);
                panelResult.repaint();*/

            }
            step = 2;
        }
        else if (step == 2)
        {

            if (dizaines1 < dizaines2)
            {
                panelDess1.setCent(centaines1 - 1);
                panelDess1.setDec(dizaines1 + 10);
                panelDess1.repaint();
                step = 3;
               /* panelResult.setUn(unites1 + 10 - unites2);
                panelResult.setDec(dizaines1 - 1 - dizaines2);
                panelResult.repaint();*/

            }
            btnNext.setEnabled(false);
        }


    }
    public void calculFirstStep()
    {
        panelDess1.setDec(dizaines1 - 1);
        panelDess1.setUn(unites1 + 10);
        panelDess1.repaint();
    }

    public static void main(String[] args)
    {
        SRepresentor sRepresentor = new SRepresentor();
        // sRepresentor.setVisible(true);
    }

}

