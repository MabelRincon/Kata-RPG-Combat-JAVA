package dev.mabelrb.kata;

public class Character {
    private int health = 1000;
    private int level = 1;
    private boolean alive = true;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health <= 0) {
            this.health = 0;
            this.alive = false;
        } else if (health > 1000) {
            this.health = 1000;
        } else {
            this.health = health;
        }
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level < 1) {
            this.level = 1;
        } else if (level > 30) {
            this.level = 30;
        } else {
            this.level = level;
        }
    }

    public boolean isAlive() {
        return alive;
    }

    public void dealDamage(Character target, int damage) {
        if (this != target && this.alive && target.isAlive()) {
            target.receiveDamage(damage);
        }
    }

    private void receiveDamage(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            this.health = 0;
            this.alive = false;
        }
    }

    public void heal(Character target,int healAmount) {
        if (target.alive) {
            this.health = Math.min(1000, target.health + healAmount);
        }
    }

}
