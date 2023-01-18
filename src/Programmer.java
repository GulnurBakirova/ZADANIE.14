public class Programmer extends Person {
    String companyName;


    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
        super.lean();
        super.walk();
        super.eat();
}
    public void coding(){
        System.out.println(getName() + " writes down the encoding!");
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    @Override
    public String toString(){
        return "Name: " + getName() + "\nDesignation: " + getDesignation() + " \nCompanyName: " + getCompanyName();
    }

}
