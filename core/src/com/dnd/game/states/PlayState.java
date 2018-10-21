package com.dnd.game.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.dnd.game.DND;
import sprite.Man;
import sprite.Zombie;

import java.util.ArrayList;

/**
 * Created by DaiZhong on 10/20/18.
 */
public class PlayState extends State {
    private ArrayList<Zombie> zombies;
    private Man man;

    public PlayState(GameStateManager gsm) {
        super(gsm);
        man = new Man(DND.WIDTH / 2, DND.HEIGHT / 2);
        zombies = new ArrayList<Zombie>();
      //  cam.setToOrtho(false, DND.WIDTH / 2, DND.HEIGHT / 2);
    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {
        handleInput();
        zombies.get(0).update(dt);
        man.update(dt);

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(man.getTexture(), man.getPosition().x, man.getPosition().y, 25, 25);
        Zombie zombie = new Zombie(man.getPosition());
        zombies.add(zombie);
        sb.draw(zombies.get(0).getTexture(), zombies.get(0).getPosition().x, zombies.get(0).getPosition().y, 25, 25);
        sb.end();
    }

    @Override
    public void dispose() {

    }
}
