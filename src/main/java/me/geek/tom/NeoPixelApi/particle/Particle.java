package me.geek.tom.NeoPixelApi.particle;

import me.geek.tom.NeoPixelApi.strip.IStrip;

public class Particle {

    private int pos;
    private ParticleType type;

    public Particle(ParticleType type) {
        this(type, 0);
    }
    public Particle(ParticleType type, int pos) {
        this.pos = pos;
        this.type = type;
    }

    public void update() {

    };
    public void draw(IStrip strip) {

    };
}
