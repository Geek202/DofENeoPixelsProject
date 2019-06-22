package me.geek.tom.NeoPixelApi.managers;

import java.util.Timer;
import java.util.TimerTask;

public class SystemManager implements IManager {

    private EmitterManager emitterManager;
    private ParticleManager particleManager;

    public EmitterManager getEmitterManager() {
        return emitterManager;
    }

    public ParticleManager getParticleManager() {
        return particleManager;
    }

    public StripManager getStripManager() {
        return stripManager;
    }

    private StripManager stripManager;
    private Timer timer;
    private final int FPS = 20;

    public SystemManager() {
        emitterManager = new EmitterManager();
        particleManager = new ParticleManager();
        stripManager = new StripManager();
        timer = new Timer();
    }

    public void start() {
        timer.scheduleAtFixedRate(new Task(this), 0, 1000 / FPS);
    }

    private class Task extends TimerTask {

        private SystemManager manager;

        public Task(SystemManager manager) {
            super();
            this.manager = manager;
        }

        public void run() {
            manager.updateAll();
        }
    }
    public void updateAll() {
        System.out.println("system:updateall");
        emitterManager.updateAll();
        particleManager.updateAll();
    }
}
