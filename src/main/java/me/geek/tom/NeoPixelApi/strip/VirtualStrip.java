package me.geek.tom.NeoPixelApi.strip;

import com.google.common.collect.Lists;
import me.geek.tom.NeoPixelApi.error.PixelPositionError;
import me.geek.tom.NeoPixelApi.util.PixelColour;

import java.util.List;

public class VirtualStrip implements IStrip {

    private List<PixelColour> pixels;

    public int getLength() {
        return length;
    }

    private int length;

    public VirtualStrip(int length) {
        this.length = length;
        clearStrip();
    }

    public void draw() {

    }

    public void setPixel(PixelColour colour, int pos) throws PixelPositionError {
        if (pos >= length || pos < 0) {
            throw new PixelPositionError("Position outside strip!");
        }

        PixelColour c = mergeColour(colour, pixels.get(pos));

        pixels.set(pos, c);
    }

    public PixelColour mergeColour(PixelColour colour1, PixelColour colour2) {
        int r = Math.min(colour1.getRed() + colour2.getRed(), 255);
        int g = Math.min(colour1.getGreen() + colour2.getGreen(), 255);
        int b = Math.min(colour1.getBlue() + colour2.getBlue(), 255);

        return new PixelColour(r, g, b);
    }

    public void clearStrip() {
        pixels = Lists.newArrayList();
        for (int i  = 0; i < length; i++) {
            pixels.add(new PixelColour(0, 0, 0));
        }
    }
}
