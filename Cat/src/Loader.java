
public class Loader
{
    public static void main(String[] args)
    {
        Cat murzik = new Cat();
        Cat barsik = new Cat();
        Cat marsik = new Cat();
        Cat pushok = new Cat();
        Cat snejok = new Cat();
        Cat sosiska = new Cat();

        System.out.println("Murzik weight: " + murzik.getWeight());
        System.out.println("Marsik weight: " + marsik.getWeight());
        System.out.println("Snejok weight: " + snejok.getWeight());
        System.out.println("Sosiska weight: " + sosiska.getWeight());
        System.out.println("Barsik weight: " + barsik.getWeight());
        System.out.println("Pushok weight: " + pushok.getWeight() + "\n");

        System.out.println("Let's feed Barsik and Pushok...");
        barsik.feed(23.0);
        pushok.drink(3.0);

        System.out.println("Barsik weight: " + barsik.getWeight());
        System.out.println("Pushok weight: " + pushok.getWeight() + "\n");

        System.out.println("Sosiska state: " + sosiska.getStatus() + "\n" + "Start feeding Sosiska...");
        while (sosiska.getStatus() != "Exploded")
            sosiska.feed(1.0);
        System.out.println("Sosiska state: " + sosiska.getStatus() + "\n");

        System.out.println("Snejok state: " + snejok.getStatus());
        while (snejok.getStatus() != "Dead")
            snejok.meow();
        System.out.println("Snejok state: " + snejok.getStatus());
    }
}