import java.util.Random;

public class Color {
    Random rand = new Random();
    int r = rand.nextInt(256);
    int g = rand.nextInt(256);
    int b = rand.nextInt(256);
    public Color() {
        r = rand.nextInt(256);
        g = rand.nextInt(256);
        b = rand.nextInt(256);
    }
    public Color(int r,int g,int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }
    public void randomize() {
        r = rand.nextInt(256);
        g = rand.nextInt(256);
        b = rand.nextInt(256);
    }
    public void brighten(double percent) {
        r *= (1 + ((double)percent / 100));
		g *= (1 + ((double)percent / 100));
        b *= (1 + ((double)percent / 100));
        clamp();
    }
    public void darken(double percent) {
        r *= (1 - ((double)percent / 100));
		g *= (1 - ((double)percent / 100));
        b *= (1 - ((double)percent / 100));
        clamp();
    }

    public void setBlue(int b) {
        clamp();
        this.b = b;
    }

    public void setRed(int r) {
        clamp();
        this.r = r;
    }

    public void setGreen(int g) {
        clamp();
        this.g = g;
    }

    public int getBlue() {
        return this.b;
    }

    public int getRed() {
        return this.r;
    }

    public int getGreen() {
        return this.g;
    }

    public void clamp() {
        if (r>255) {
            r = 255;
        } else if (r<0) {
            r = 0;
        }
        if (g>255) {
            g = 255;
        } else if (g<0) {
            g = 0;
        }
        if (b>255) {
            b = 255;
        } else if (r<0) {
            b = 0;
        }
    }
    public void summary() {
        System.out.println("[" + r + "," + g + "," + b + "]");
    }
}