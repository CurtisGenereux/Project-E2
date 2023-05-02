import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public enum BlockType {
	Air(null),
	Grass(null);
	
	Image texture;
	
	private BlockType(String textureName) {
		try {
			this.texture = ImageIO.read(new File(textureName));
		} catch (IOException e) {
			System.out.println();
		}
	}
}
