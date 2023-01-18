public class Main {
    public static void main(String[] args) {

        Person person = new Person("Gulnur","Student");
        System.out.println(person);
        person.lean();
        person.walk();
        person.eat();
        System.out.println("--------------------------------------------------------------------------");

        Programmer program = new Programmer("Timur","Programmer","PikSoft");
        System.out.println(program);
        program.coding();
        System.out.println("--------------------------------------------------------------------------");


        Dancer danc = new Dancer("Aidana","The Dancer","StepUp");
        System.out.println(danc);
        danc.dansing();
        System.out.println("-------------------------------------------------------------------------");


        Singer singer = new Singer("Mairambek Osmonov","Singer","Besh tapan");
        singer.singing();
        singer.playGuitar();
        System.out.println(singer);


    }
}