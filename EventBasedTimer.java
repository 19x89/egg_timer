package egg_timer;

import java.util.*;

public class EventBasedTimer {
    private Timer internalTimer = new Timer();
    private List<TickListener> listeners = new ArrayList<TickListener>();
    
    // Meldet einen TickListener beim Timer an.
    public void addTicketListener( TickListener listener ) {
        listeners.add( listener );
    }
    
    // Startet diesen Timer.
    public void start() {
        internalTimer.scheduleAtFixedRate( new TimerTask() {
            @Override
            public void run() {
                for( TickListener tickListener : listeners ) {
                    tickListener.tickPerformed();
                }
            }
        }, 1000, 1000 );
    }
    
    // Stoppt diesen Timer.
    public void stop() {
        internalTimer.cancel();
    }
}
