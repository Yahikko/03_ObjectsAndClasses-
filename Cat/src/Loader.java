
public class Loader
{
    public static void main(String[] args)
    {
        Cat pushok = new Cat();

        System.out.println("Pushok weight: " + pushok.getWeight());

        System.out.println("\nLet's feed Pushok");
        pushok.feed(150.0);
        pushok.drink(100.0);

        System.out.println("Pushok weight: " + pushok.getWeight() + "\n");

        for (int i = 0; i < 5; i++){
            pushok.pee();
        }

        System.out.println("\nPushok weight: " + pushok.getWeight());

        System.out.println("\nPushok ate " + pushok.getFodder() + " g. of fodder");
    }
}
