
import java.util.Random;

public class World {
	
	Block[][] map = null;
	int worldHeight;
	int worldWidth;
	double seed;
	NoiseGenerator generator;
	
	public World(int worldHeight, int worldWidth) {
		this(new Random().nextGaussian() * 255, worldHeight, worldWidth);
	}
	
	public World(double seed, int worldHeight, int worldWidth) {
		this.worldHeight = worldHeight;
		this.worldWidth = worldWidth;
		this.seed = seed;
		this.generator = new NoiseGenerator(seed);
		
		this.map = new Block[worldWidth][worldHeight];
		
		for (int x = 0; x < worldWidth; x++) {
			for (int y = 0; y < worldHeight; y++) {
				
			}
		}
	}
	
}
