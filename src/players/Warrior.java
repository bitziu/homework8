package players;

public class Warrior extends Hero {
    public Warrior(int health, int damage) {
        super(health, damage, Ability.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
        setHealth(getHealth() - boss.getDamage());
        boss.setHealth(boss.getHealth() - (getDamage()+ boss.getDamage()) );


    }
}
