package org.example;

public class Monster {
    private String name;
    private Integer attackPower;
    private Integer health;

    public Monster(String name, Integer attackPower, Integer health){
        this.name = name;
        this.attackPower = attackPower;
        this.health = health;
    }

    public String toString(){
        return String.format("%s Attack:%d Health:%d",name, attackPower, health);
    }

    public String getName(){
        return name;
    }

    public Integer getAttackPower(){
        return attackPower;
    }
    public Integer getHealth(){
        return health;
    }
}
