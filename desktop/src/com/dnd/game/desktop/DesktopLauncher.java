package com.dnd.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.dnd.game.DND;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = DND.WIDTH;

		config.height = DND.HEIGHT;
		config.title = DND.TITLE;
		new LwjglApplication(new DND(), config);
	}
}
