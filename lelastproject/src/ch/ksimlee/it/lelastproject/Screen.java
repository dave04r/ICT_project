package ch.ksimlee.it.lelastproject;

public class Screen {
	
	private int width, height;
	public int[] pixels;
	
	int xtime = 100, ytime = 100;
	int counter = 0;
	
	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
		pixels = new int[width * height]; // 50,400 (0 - 50,399)
	}
	
	public void clear() {
		for (int i = 0; i < pixels.length; i++) {
			pixels[i] = 0;
		}
	}
	
	public void render() {
		counter++;
		if (counter % 50 == 0) xtime--;
		if (counter % 50 == 0) ytime--;
		
		for (int y = 0; y < height; y++) {
			if (ytime < 0 ||ytime >= height) break;
			for (int x = 0; x < width; x++) {
				if (xtime < 0 || xtime >= width) break;
				pixels[xtime + ytime * width] = 0xff00ff;
			}
		}
	}

}
