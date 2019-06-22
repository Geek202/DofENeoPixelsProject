package me.geek.tom.NeoPixelApi.strip;

import me.geek.tom.NeoPixelApi.error.PixelPositionError;
import me.geek.tom.NeoPixelApi.util.PixelColour;

public interface IStrip {
    void draw();
    void setPixel(PixelColour colour, int pos) throws PixelPositionError;
    PixelColour mergeColour(PixelColour colour1, PixelColour colour2);
    void clearStrip();
}
