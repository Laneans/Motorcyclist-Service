package bike;

import java.util.ArrayList;
import java.util.Comparator;

import static bike.Program.headEquipment;
import static bike.Program.legsEquipment;

public class LegsEquipment extends EquipmentBase implements Equipmentable {

    public LegsEquipment(String _name, double _price, double _weight) {
        super(_name, _price, _weight);
    }


    //from abstract class
    @Override
    public void seeEquipment() {
        int numeric = 1;
        for (EquipmentBase e : legsEquipment) {
            System.out.print(" " + numeric + ") " + e.getName() + " " + e.getPrice() + " $. (" + e.getWeight() + " g)\n");
            numeric++;
        }
    }

    //from interface
    public void findByRangeOfPrice(double consoleMinPrice, double consoleMaxPrice) {
        ArrayList<EquipmentBase> newWithNeedPriceLegs = new ArrayList<>();
        for (EquipmentBase e : headEquipment) {
            if (e.getPrice() >= consoleMinPrice &&  e.getPrice() <= consoleMaxPrice) {
                newWithNeedPriceLegs.add(e);
            }
        }
        for (EquipmentBase eqNew : newWithNeedPriceLegs) {
            System.out.println(eqNew.getName() + " " + eqNew.getPrice() + "\n");
        }
    }

    @Override
    public void sortByWeight() {
        legsEquipment.sort(Comparator.comparingDouble(EquipmentBase::getWeight));
    }
}
