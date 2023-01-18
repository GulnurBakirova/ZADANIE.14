public class Singer extends Person {
    private String bandName;




    public Singer(String name, String designation, String bandName){
        super(name,designation);
        this.bandName=bandName;

        super.lean();
        super.walk();
        super.eat();
    }
    public void singing(){
        System.out.println(getName() + " sings Opera");
    }
    public void playGuitar(){
        System.out.println(getName() + " sings Opera and plays guitar!");
    }
    public String getBandName() {
        return bandName;
    }
    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
    @Override
    public String toString(){
        return "Name: " + getName() + "\nDesignation: " + getDesignation() + " \nBandName:" + getBandName();
    }
}
