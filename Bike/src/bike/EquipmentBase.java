package bike;

public abstract class EquipmentBase
{
    private String name;
    private double price;
    private double weight;

    //---------constructors
    public EquipmentBase(String _name, double _price, double _weight){
        this.name = _name;
        this.price = _price;
        this.weight = _weight;
    }

    //---------getters & setters
    public String getName(){
        return name;
    }
    public void setName(String _name){
        this.name = _name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double _price){
        this.price = _price;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double _weight){
        this.weight = _weight;
    }


    //---------method
    public abstract void seeEquipment();


    //---------inner class with enum
    public enum StrValues {
        A("The list of full equipment is empty!"),
        B("Recheck the entered choice"),
        C("1) For head"),
        D("2) For body"),
        E("3) For legs");
        private final String textRepresentation;

        StrValues(String textRepresentation) {
            this.textRepresentation = textRepresentation;
        }

        @Override public String toString() {
            return textRepresentation;
        }
    }
}
