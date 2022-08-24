package egg_timer;

import java.awt.event.*;

public class EggTimerController implements TickListener, ActionListener {
    private EggTimerModel model;
    private EventBasedTimer timer = new EventBasedTimer();
    private EggTimerCanvas view;
    
    public EggTimerController( EggTimerModel model, EggTimerCanvas view ) {
        this.model = model;
        this.view = view;
        timer.addTicketListener( this );
    }

    @Override
    public void tickPerformed() {
        model.increaseElapsedTime();
        view.repaint();
        if( model.getElapsedPart() == 1 ) {
            timer.stop();
        }
    }
    
    @Override
    public void actionPerformed( ActionEvent e ) {
        try {
            Thread.sleep( 1000 );
        } catch( InterruptedException exc ) {
            exc.printStackTrace();
        }
        timer.start();
        MVCEggTimerMain.startButton.setEnabled( false );
    }
}
