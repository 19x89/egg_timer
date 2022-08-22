package egg_timer;

public class EggTimerModel {
    // vorgesehene Laufzeit in Sekunden
    private int totalTimeInSeconds;
    
    // verstrichene Zeit in Sekunden
    private int elapsedTimeInSeconds = 0;
    
    // erzeugt eine neue Instanz dieser Klasse fuer die angegebene Laufzeit
    public EggTimerModel( int totalTimeInSeconds ) {
        this.totalTimeInSeconds = totalTimeInSeconds;
    }
    
    // liefert den Zeitanteil, der bereits verstrichen ist
    public double getElapsedPart() {
        return (double) elapsedTimeInSeconds / totalTimeInSeconds;
    }
    
    // erhoeht die verstrichene Zeit um eine Sekunde
    public void increaseElapsedTime() {
        elapsedTimeInSeconds++;
    }
}
