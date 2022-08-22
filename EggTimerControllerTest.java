package egg_timer;

public class EggTimerControllerTest {
    public static void main( String[] args ) {
        EggTimerModel eggTimerModel = new EggTimerModel( 100 );
        EggTimerController eggTimerController = new EggTimerController( eggTimerModel );
        
        /*EggTimerModel eggTimerModel2 = new EggTimerModel( 10 );
        EggTimerController eggTimerController2 = new EggTimerController( eggTimerModel2 );
        
        EggTimerModel eggTimerModel3 = new EggTimerModel( 5 );
        EggTimerController eggTimerController3 = new EggTimerController( eggTimerModel3 );*/
    }
}
