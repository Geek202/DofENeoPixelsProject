package me.geek.tom.NeoPixelApi;


import me.geek.tom.NeoPixelApi.managers.SystemManager;

public class NeoPixelApi {

    public static SystemManager systemManager;

    public static void main(String[] args) {
        systemManager = new SystemManager();
        systemManager.start();
    }
}
