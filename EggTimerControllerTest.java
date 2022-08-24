package egg_timer;

public class EggTimerControllerTest {
    public static void main( String[] args ) {
        EggTimerModel eggTimerModel = new EggTimerModel( 100 );
        EggTimerController eggTimerController = new EggTimerController( eggTimerModel );
    }
}
