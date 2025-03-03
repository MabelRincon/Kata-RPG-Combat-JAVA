package dev.mabelrb.kata;

public class Character {
    private int health = 1000;
    private int level = 1;
    private boolean alive = true;
    private int attackRange = 2;

    public int getAttackRange() {
        return attackRange;
    }

    public void setAttackRange(int attackRange) {
        this.attackRange = attackRange;
    }

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
        dealDamage(target, damage,this.attackRange);
    }

    public void dealDamage(Character target, int damage, int distance) {
        if (this != target && this.alive && target.isAlive() && distance <= this.attackRange) {
            if (this.level - target.getLevel() >= 5) {
                damage *= 1.5;
            } else if (target.getLevel()- this.level >= 5) {
                damage *= 0.5;
            }
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
        if (target == this && this.alive) {
            this.health = Math.min(1000, target.health + healAmount);
        }
    }

}