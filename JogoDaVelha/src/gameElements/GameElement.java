package gameElements;
import pt.iscte.poo.gui.ImageTile;
import pt.iscte.poo.utils.Point2D;

public abstract class GameElement implements ImageTile {

	private Point2D Point2D;
	private int layer;
	private String imageName;

	// Construtor da classe GameElement
	public GameElement(Point2D point2d, int layer, String imageName) {
		this.Point2D = point2d;
		this.layer = layer;
		this.imageName = imageName;
	}

	// Método para obter a posição do elemento
	@Override
	public Point2D getPosition() {
		return Point2D;
	}

	// Método para obter a camada do elemento
	@Override
	public int getLayer() {
		return layer;
	}
	
	// Método para obter o nome da imagem associada ao elemento
	@Override
	public String getName() {
		return imageName;
	}
}
