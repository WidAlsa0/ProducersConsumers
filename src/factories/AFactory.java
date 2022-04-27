package factories;

import controls.AConsoleSceneView;
import controls.APainter;
import controls.ConsoleSceneView;
import controls.Painter;
import graphics.AProducerConsumerScene;
import graphics.ProducerConsumerScene;

public class AFactory {
	static ProducerConsumerScene scene;
	static ConsoleSceneView console;
	static Painter painter;
	
	public static ProducerConsumerScene arrayBasedSceneFactoryMethod() {
		if (scene == null) {
			scene = new AProducerConsumerScene();
		}
		return scene;
	}
	
	public static ConsoleSceneView ConsoleSceneViewFactoryMethod(int chefs, int patrons) {
		if (console == null) {
			console = new AConsoleSceneView(chefs, patrons);
		}
		return console;
	}
	
	public static Painter PainterFactoryMethod(int chefs, int patrons) {
		if (painter == null) {
			painter = new APainter(chefs, patrons);
		}
		return painter;
	}
}
