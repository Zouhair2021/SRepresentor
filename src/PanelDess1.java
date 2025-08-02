import javax.swing.*;
import java.awt.*;


public class PanelDess1 extends JPanel
{

    protected String[] couleurBlocs;

    private int un, dec, cent;

    public PanelDess1(JFrame frame)
    {
        couleurBlocs = SRepresentor.couleurBlocs;
        setPreferredSize(new Dimension(frame.getWidth()-30, frame.getHeight()/2-SRepresentor.HAUT_PAN_CORRECTION));
        System.out.println(frame.getWidth());
        setOpaque(true);
        setBackground(Color.WHITE);


    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int startX;
        int startY;
        if(cent != 0)
        {
             startY = 20;
             startX = 20;
        }
        else
        {
            startY = 20;
            startX = this.getWidth()/3;
        }



        // Calculer la largeur nécessaire pour les centaines (5 par ligne)
        int largeurCentaines = 0;
        if (cent > 0 && SRepresentor.imageCentScaled != null) {
            int blocsParLigneCentaines = 5;
            int blocsLigneCentaines = Math.min(cent, blocsParLigneCentaines);
            largeurCentaines = blocsLigneCentaines * SRepresentor.imageCentScaled.getWidth(this) + (blocsLigneCentaines - 1) * SRepresentor.ESPACEMENT;
        }

        // Calculer la largeur nécessaire pour les dizaines (10 par ligne)
        int largeurDizaines = 0;
        if (dec > 0 && SRepresentor.imageDizScaled != null) {
            int blocsParLigneDizaines = 10;
            int blocsLigneDizaines = Math.min(dec, blocsParLigneDizaines);
            largeurDizaines = blocsLigneDizaines * SRepresentor.imageDizScaled.getWidth(this) + (blocsLigneDizaines - 1) * SRepresentor.ESPACEMENT;
        }

        // Dessiner les centaines à gauche (5 par ligne)
        if (cent > 0) {
            dessinerImages(g2d, cent, startX, startY, SRepresentor.imageCentScaled, 5);
        }

        // Dessiner les dizaines au milieu (10 par ligne)
        int xDizaines = startX + largeurCentaines + (largeurCentaines > 0 ? 30 : 0);
        if (dec > 0) {
            dessinerImages(g2d, dec, xDizaines, startY, SRepresentor.imageDizScaled, 10);
        }

        // Dessiner les unités à droite (5 par ligne)
        int xUnites = xDizaines + largeurDizaines + (largeurDizaines > 0 ? 30 : 0);
        dessinerImages(g2d, un, xUnites, startY, SRepresentor.imageUnScaled, 5);
    }

    private void dessinerImages(Graphics2D g2d, int nombreImages, int startX, int startY, Image image, int blocsParLigne) {
        if (image == null) return;

        int largeurImage = image.getWidth(this);
        int hauteurImage = image.getHeight(this);

        int x = startX;
        int y = startY;

        for (int i = 0; i < nombreImages; i++) {
            // Nouvelle ligne après le nombre spécifié de blocs
            if (i > 0 && i % blocsParLigne == 0) {
                y += hauteurImage + SRepresentor.ESPACEMENT;
                x = startX;
            }

            // Dessiner l'image
            g2d.drawImage(image, x, y, null);

            // Position suivante
            x += largeurImage + SRepresentor.ESPACEMENT;
        }
    }
    protected void setUn(int number)
    {
        un = number;
    }
    protected void setDec(int number)
    {
        dec = number;
    }
    protected void setCent(int number) {cent = number;}
    protected int getCent(){return cent;}

}
