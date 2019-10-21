package players;

import java.util.Random;

public class Hunter extends Hero {
    public Hunter(int health, int damage) {
        super(health, damage, Ability.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
        Random n = new Random(2);
        int random= n.nextInt(4);
        setDamage(getDamage()* random);

    }
}
