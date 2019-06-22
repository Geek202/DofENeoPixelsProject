package me.geek.tom.NeoPixelApi.util;

public class PixelColour {

    private int red;
    private int green;

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    private int blue;

    public PixelColour(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
}
