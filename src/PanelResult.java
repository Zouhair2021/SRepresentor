import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;


public class PanelResult extends JPanel
{
    private final int margin = 5;
    private String[] couleurBlocs;
    private int un, dec, cent;

    public PanelResult(JFrame frame)
    {
        couleurBlocs = SRepresentor.couleurBlocs;
        setPreferredSize(new Dimension(frame.getWidth()-30, frame.getHeight()/3-SRepresentor.HAUT_PAN_CORRECTION));
        System.out.println(frame.getWidth());
        setOpaque(true);
        setBackground(Color.WHITE);


    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        int startY = 20;
        int startX = 20;

        // Calculer la largeur nécessaire pour les centaines
        int largeurCentaines = 0;
        if (cent > 0 && SRepresentor.imageCentScaled != null) {
            int lignesCentaines = (cent - 1) / SRepresentor.BLOCS_PAR_LIGNE + 1;
            int blocsLigneCentaines = Math.min(cent, SRepresentor.BLOCS_PAR_LIGNE);
            largeurCentaines = blocsLigneCentaines * SRepresentor.imageCentScaled.getWidth(this) + (blocsLigneCentaines - 1) * SRepresentor.ESPACEMENT;
        }

        // Calculer la largeur nécessaire pour les dizaines
        int largeurDizaines = 0;
        if (dec > 0 && SRepresentor.imageDizScaled != null) {
            int lignesDizaines = (dec - 1) / SRepresentor.BLOCS_PAR_LIGNE + 1;
            int blocsLigneDizaines = Math.min(dec, SRepresentor.BLOCS_PAR_LIGNE);
            largeurDizaines = blocsLigneDizaines * SRepresentor.imageDizScaled.getWidth(this) + (blocsLigneDizaines - 1) * SRepresentor.ESPACEMENT;
        }

        // Dessiner les centaines à gauche
        if (cent > 0) {
            dessinerImages(g2d, cent, startX, startY, SRepresentor.imageCentScaled);
        }

        // Dessiner les dizaines au milieu (après les centaines)
        int xDizaines = startX + largeurCentaines + (largeurCentaines > 0 ? 30 : 0); // 30 pixels d'espacement entre centaines et dizaines
        if (dec > 0) {
            dessinerImages(g2d, dec, xDizaines, startY, SRepresentor.imageDizScaled);
        }

        // Dessiner les unités à droite (après les dizaines)
        int xUnites = xDizaines + largeurDizaines + (largeurDizaines > 0 ? 30 : 0); // 30 pixels d'espacement entre dizaines et unités
        dessinerImages(g2d, un, xUnites, startY, SRepresentor.imageUnScaled);
    }

    private void dessinerImages(Graphics2D g2d, int nombreImages, int startX, int startY, Image image) {
        if (image == null) return;

        int largeurImage = image.getWidth(this);
        int hauteurImage = image.getHeight(this);

        int x = startX;
        int y = startY;

        for (int i = 0; i < nombreImages; i++) {
            // Nouvelle ligne après 5 images
            if (i > 0 && i % SRepresentor.BLOCS_PAR_LIGNE == 0) {
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

}
