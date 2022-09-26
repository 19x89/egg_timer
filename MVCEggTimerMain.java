package egg_timer;

import java.awt.*;
import java.awt.event.*;

/*
Die Hauptklasse ist zum Starten des Programms sowie das Erzeugen des Programmfensters.
*/

public class MVCEggTimerMain {
    protected EggTimerModel eggTimerModel;
    protected EggTimerCanvas eggTimerCanvas;
    protected Frame frame;
    protected Panel buttonPanel;
    protected static Button startButton;
    
    public MVCEggTimerMain() {
        eggTimerModel = new EggTimerModel( 10 );
        eggTimerCanvas = new EggTimerCanvas( eggTimerModel );
        frame = new Frame( "Kurzzeitwecker" );
        frame.add( eggTimerCanvas, BorderLayout.CENTER );
        
        startButton = new Button( "Start" );
        buttonPanel = new Panel();
        buttonPanel.add( startButton );
        frame.add( buttonPanel, BorderLayout.SOUTH );
        
        EggTimerController eggTimerController = new EggTimerController( eggTimerModel, eggTimerCanvas );
        
        startButton.addActionListener( eggTimerController );
        
        frame.addWindowListener( new WindowAdapter() {
            @Override
            public void windowClosing( WindowEvent e ) {
                System.exit( 0 );
            }
        });
        
        frame.pack();
        frame.setLocationRelativeTo( null );
        frame.setVisible( true );
    }
    
    public static void main( String[] args ) {
        new MVCEggTimerMain();
    }
}
