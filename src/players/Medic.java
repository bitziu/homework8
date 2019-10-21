package players;

public class Medic extends Hero {
    public Medic(int health, int damage) {
        super(health, damage, Ability.HEAL);
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
            if (!heroes[i].getAbility().equals(Ability.HEAL) &&
                    heroes[i].getHealth() > 0) {
                heroes[i].setHealth(heroes[i].getHealth() + 20);
            }
        }
    }
}
