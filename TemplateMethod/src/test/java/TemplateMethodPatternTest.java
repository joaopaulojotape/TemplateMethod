import org.junit.Test;

public class TemplateMethodPatternTest {

    @Test
    public void test(){
        Game game = new Dama(new GameInformacao());
        game.Jogar();

    }

    @Test
    public void testdois() {
        Game game = new Xadrez(new GameInformacao());
        game.Jogar();

    }


}