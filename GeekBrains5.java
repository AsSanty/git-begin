/* Александр Крайко Урок 5
Сделал только стандартное задание.
  */



public class GeekBrains5 {
    public static void main(String[] args) {
        Animal dog = new Dog(29,3,1);
        System.out.println("Dog");
        System.out.println(dog.run());
        System.out.println(dog.swim());
        System.out.println(dog.jump());

        Animal cat = new Cat(33,2,2);
        System.out.println("Cat");
        System.out.println(cat.run());
        System.out.println(cat.swim());
        System.out.println(cat.jump());

        Animal horse = new Horse(60,3,3);
        System.out.println("Horse");
        System.out.println(horse.run());
        System.out.println(horse.swim());
        System.out.println(horse.jump());
    }
}

interface Animal {
    String run();
    String swim();
    String jump();
}

abstract class AbstractAnimal implements Animal{
    private int vrun;
    private int vswim;
    private int hjump;

    public AbstractAnimal(int vrun, int vswim, int hjump) {
        this.vrun = vrun;
        this.vswim = vswim;
        this.hjump = hjump;
    }

    public int getVrun() {
        return vrun;
    }

    public int getVswim() {

        return vswim;
    }

    public int getHjump() {
        return hjump;
    }

}
class Dog extends AbstractAnimal {

    private static int MAX_RUN_SPEED = 30;
    private static int MAX_SWIM_SPEED = 4;
    private static int MAX_JUMP_HEIGHT = 2;

    public Dog(int vrun, int vswim, int hjump) {
        super(vrun, vswim, hjump);
    }

    @Override
    public String jump() {
        if (getHjump()<= MAX_JUMP_HEIGHT) {
            return "I have jumped successfully on height "+ getHjump();
        }
        return "I cant jump this " + getHjump();
    }

    @Override
    public String run() {
        if (getVrun()<= MAX_RUN_SPEED) {
            return "I can run on this speed "+ getVrun();
        }
        return "I cant run  " + getVrun();
    }

    @Override
    public String swim() {
        if (getVswim()<= MAX_SWIM_SPEED) {
            return "I can swim on this speed "+ getVswim();
        }
        return "I cant swim  " + getVswim();
    }
}

class Cat extends AbstractAnimal {

    private static int MAX_RUN_SPEED = 25;
    private static int MAX_SWIM_SPEED = 0;
    private static int MAX_JUMP_HEIGHT = 3;

    public Cat(int vrun, int vswim, int hjump) {
        super(vrun, vswim, hjump);
    }

    @Override
    public String jump() {
        if (getHjump()<= MAX_JUMP_HEIGHT) {
            return "I have jumped successfully on height "+ getHjump();
        }
        return "I cant jump this " + getHjump();
    }

    @Override
    public String run() {
        if (getVrun()<= MAX_RUN_SPEED) {
            return "I can run on this speed "+ getVrun();
        }
        return "I cant run  " + getVrun();
    }

    @Override
    public String swim() {
        if (getVswim()<= MAX_SWIM_SPEED) {
            return "I can swim on this speed "+ getVswim();
        }
        return "I cant swim  " + getVswim();
    }
}

class Horse extends AbstractAnimal {

    private static int MAX_RUN_SPEED = 70;
    private static int MAX_SWIM_SPEED = 6;
    private static int MAX_JUMP_HEIGHT = 3;

    public Horse(int vrun, int vswim, int hjump) {
        super(vrun, vswim, hjump);
    }

    @Override
    public String jump() {
        if (getHjump()<= MAX_JUMP_HEIGHT) {
            return "I have jumped successfully on height "+ getHjump();
        }
        return "I cant jump this " + getHjump();
    }

    @Override
    public String run() {
        if (getVrun()<= MAX_RUN_SPEED) {
            return "I can run on this speed "+ getVrun();
        }
        return "I cant run  " + getVrun();
    }

    @Override
    public String swim() {
        if (getVswim()<= MAX_SWIM_SPEED) {
            return "I can swim on this speed "+ getVswim();
        }
        return "I cant swim  " + getVswim();
    }
}




