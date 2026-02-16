public class GameApp {
    public static void main(String[] args) {
        
        Character knight = new Character("Knight", new SwingSword());
        knight.addDefenseStrategy(new Shield());
        knight.addDefenseStrategy(new Dodge());
        knight.addDefenseStrategy(new CreateMagic());

        Character wizard = new Character("Wizard", new CastSpell());
        wizard.addDefenseStrategy(new CreateMagic());

        Character archer = new Character("Archer", new ShootArrow());
        archer.addDefenseStrategy(new Dodge());

        knight.attack();
        knight.defend();
    }
}