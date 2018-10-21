package com.dnd.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.dnd.game.DND;

/**
 * Created by DaiZhong on 10/20/18.
 */
public class MenuState extends State{
    private Texture playBtn;
    public MenuState(GameStateManager gsm) {
        super(gsm);
        playBtn = new Texture("playBtn.png");
    }

    @Override
    public void handleInput() {
        if (Gdx.input.justTouched()) {
            System.out.println(gsm);
            gsm.set(new PlayState(gsm));
            dispose();
        }
    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();

        sb.draw(playBtn, DND.WIDTH / 2 - playBtn.getWidth() / 2, DND.HEIGHT / 2);
        sb.end();
    }

    @Override
    public void dispose() {
        playBtn.dispose();
    }


}

