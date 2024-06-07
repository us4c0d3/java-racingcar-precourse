import controller.GameController;
import service.GameService;
import view.GameView;

public class Application {

    public static void main(String[] args) {
        GameService service = new GameService();
        GameView view = new GameView();
        GameController controller = new GameController(view, service);

        controller.startGame();
    }

}
