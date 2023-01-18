public class Dancer extends Person{
    private String groupName;





    public Dancer(String name, String designation, String groupName){
        super(name,designation);
        this.groupName=groupName;

        super.lean();
        super.walk();
        super.eat();
    }
    public void dansing(){
        System.out.println(getName() + " can Tango");
    }

    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    @Override
    public String toString(){
        return "Name: " + getName() + "\nDesignation: " + getDesignation() + " \nGroupName: " + groupName;
    }
}
