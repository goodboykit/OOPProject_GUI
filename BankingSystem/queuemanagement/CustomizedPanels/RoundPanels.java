package queuemanagement.CustomizedPanels;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class RoundPanels extends JPanel {
    private int arcRadius;

    public RoundPanels(int arcRadius) {
        this.arcRadius = arcRadius;
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();

        RoundRectangle2D roundedRectangle = new RoundRectangle2D.Double(0, 0, width - 1, height - 1, arcRadius, arcRadius);
        graphics.setColor(getBackground());
        graphics.fill(roundedRectangle);

        graphics.dispose();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(430, 385);
    }
}
