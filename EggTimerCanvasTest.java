package egg_timer;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.*;

public class EggTimerCanvasTest {
    //public static int arcAngle = 0;

    public static void main( String[] args ) {
        //int arcAngle = 0;
        // Erzeugen eines EggTimerModel für eine Laufzeit von 60 Sekunden
        EggTimerModel eggTimerModel = new EggTimerModel( 60 );
        
        // Erzeugen eines EggTimerCanvas, das das oben erzeugte Model verwendet
        EggTimerCanvas eggTimerCanvas = new EggTimerCanvas( eggTimerModel );
        
        // Erzeugen eines Hauptfensters mit dem Titel "Kurzzeitwecker"
        Frame frame = new Frame( "Kurzzeitwecker" );
        
        // Anmelden eines "anonymen" Listeners, der beim Schließen des
        // Hauptfensters die Anwendung beendet
        frame.addWindowListener( new WindowAdapter() {
            @Override
            public void windowClosing( WindowEvent e ) {
                System.exit( 0 );
            }
        });
        
        // Einfügen des EggTimerCanvas im Zentralbereich des Hauptfensters
        frame.add( eggTimerCanvas, BorderLayout.CENTER );
        
        // Dieser Aufruf sorgt dafür, dass dass der LayoutManager des Hauptfensters
        // dessen Größe gemäß der Wunschgrößen der auf diesem angeordneten
        // Komponenten berechnet. Hier müssen Sie nichts einfügen
        frame.pack();
        
        // Positionieren des Fensters in der Bildschirmmitte
        // (siehe Ad-hoc-Aufgabe 4 der KE5)
        frame.setLocationRelativeTo( null );
        
        // Sichtbarmachen des Fensters
        frame.setVisible( true );
        
        for( int i = 0; i < 4; i++ ) {
            // Eine Sekunde Pause (wird in KE6 näher erläutert).
            // Hier müssen Sie nichts einfügen
            try {
                Thread.sleep( 1000 );
            } catch( InterruptedException e ) {
                e.printStackTrace();
            }
            
            // "Hochzählen" des Models um eins
            // Anstoßen eines Neuzeichens des EggTimerCanvas
            eggTimerModel.increaseElapsedTime();
            eggTimerCanvas.repaint();
        }
    }
}
