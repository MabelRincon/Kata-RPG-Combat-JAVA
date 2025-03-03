package dev.mabelrb.kata;
public class Target {
    private int health;

    public Target(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void receiveDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
    }

    public boolean isDestroyed() {
        return health == 0;
    }
}
