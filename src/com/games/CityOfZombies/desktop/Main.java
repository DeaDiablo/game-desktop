package com.games.CityOfZombies.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.games.CityOfZombies.CityOfZombies;

public class Main
{
  public static void main(String[] args)
  {
    LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
    config.title = "City of zombies";
    config.useGL30 = false;
    config.width = 800;
    config.height = 480;
    config.fullscreen = false;
    config.vSyncEnabled = false;
    config.foregroundFPS = 0;
    new LwjglApplication(new CityOfZombies(), config);
  }
}
