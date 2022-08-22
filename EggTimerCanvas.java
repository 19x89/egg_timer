package egg_timer;

import java.awt.*;

public class EggTimerCanvas extends Canvas {
    private EggTimerModel model;
    private Graphics graphics = getGraphics();
    private Dimension dimension = new Dimension( 320, 320 );
    private Color totalTimeColor = new Color( 255, 0, 0 );
    private Color passedTimeColor = new Color( 0, 255, 0 );
    private Color backgroundColor = new Color( 0, 0, 0 );
    
    EggTimerCanvas( EggTimerModel model ) {
        this.model = model;
        setPreferredSize( dimension );
        setBackground( backgroundColor );
    }
    
    @Override
    public void paint( Graphics g ) {
        g.setColor( totalTimeColor );
        g.fillOval( 10, 10, 300, 300 );
        g.setColor( passedTimeColor );
        int arcAngle = ( (int) Math.round( model.getElapsedPart() * -360 ) );
        g.fillArc( 10, 10, 300, 300, 90, arcAngle );  // vier erste Parameter sollen gleich wie beim fillOval sein
    }
}
