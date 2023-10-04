package queuemanagement.CustomizedPanels;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class ImgRoundedPanel extends JPanel {

    private ImageIcon backgroundImage;
    private int arcRadius = 90;

    public ImgRoundedPanel(ImageIcon icon) {
        setOpaque(false);
        this.backgroundImage = icon;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        RoundRectangle2D roundedRectangle = new RoundRectangle2D.Double(0, 0, getWidth() - 1, getHeight() - 1, arcRadius, arcRadius);

        Shape oldClip = graphics.getClip();
        graphics.clip(roundedRectangle);

        Image image = backgroundImage.getImage();
        graphics.drawImage(image, 0, 0, getWidth(), getHeight(), this);

        graphics.setClip(oldClip);
        graphics.dispose();
    }
}
