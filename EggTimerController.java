package egg_timer;

public class EggTimerController implements TickListener {
    private EggTimerModel model;
    private EventBasedTimer timer = new EventBasedTimer();
    
    public EggTimerController( EggTimerModel model ) {
        this.model = model;
        timer.addTicketListener( this );
        timer.start();
    }

    @Override
    public void tickPerformed() {
        model.increaseElapsedTime();
        System.out.println( model.getElapsedPart() );
        if( model.getElapsedPart() == 1 ) {
            timer.stop();
        }
    }
}
