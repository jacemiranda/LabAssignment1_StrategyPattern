class SwingSword implements AttackStrategy {
    public void attack() { System.out.println("Knight attacks with a sword!"); }
}

class CastSpell implements AttackStrategy {
    public void attack() { System.out.println("Wizard casts a spell!"); }
}

class ShootArrow implements AttackStrategy {
    public void attack() { System.out.println("Archer shoots an arrow!"); }
}

class Shield implements DefenseStrategy {
    public void defend() { System.out.println("Using a shield to defend!"); }
}

class Dodge implements DefenseStrategy {
    public void defend() { System.out.println("Dodging to avoid attack!"); }
}

class CreateMagic implements DefenseStrategy {
    public void defend() { System.out.println("Creating a magic barrier for defense!"); }
}