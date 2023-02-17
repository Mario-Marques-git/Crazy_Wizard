package org.academiadecodigo.wizards.objects;

import org.academiadecodigo.wizards.position.Direction;

public class Spell extends Character {
    private Direction direction;
    private boolean collision;

    public Spell(int x, int y, Direction dir) {
        super(x, y, 5, 10);


        if (dir == Direction.DOWN || dir == Direction.UP) {
            this.grow(0, 15);

        } else {
            this.grow(15, 0);
        }
        this.direction = dir;
        this.fill();
        move(dir);
    }

    public void setCollision() {
        collision = true;
        this.delete();
    }

    public Direction getDirection() {
        return direction;
    }
}