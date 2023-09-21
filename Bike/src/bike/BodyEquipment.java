package bike;

import java.util.ArrayList;
import java.util.Comparator;

import static bike.Program.bodyEquipment;
import static bike.Program.headEquipment;

public class BodyEquipment  extends EquipmentBase implements Equipmentable {

    public BodyEquipment(String _name, double _price, double _weight) {
        super(_name, _price, _weight);
    }


    //from abstract class
    @Override
    public void seeEquipment() {
        int numeric = 1;
        for (EquipmentBase e : bodyEquipment) {
            System.out.print(" " + numeric + ") " + e.getName() + " " + e.getPrice() + " $. (" + e.getWeight() + " g)\n");
            numeric++;
        }
    }

    //from interface
    public void findByRangeOfPrice(double consoleMinPrice, double consoleMaxPrice) {
        ArrayList<EquipmentBase> newWithNeedPriceBody = new ArrayList<>();
        for (EquipmentBase e : headEquipment) {
            if (e.getPrice() >= consoleMinPrice &&  e.getPrice() <= consoleMaxPrice) {
                newWithNeedPriceBody.add(e);
            }
        }
        for (EquipmentBase eqNew : newWithNeedPriceBody) {
            System.out.println(eqNew.getName() + " " + eqNew.getPrice() + "\n");
        }
    }

    @Override
    public void sortByWeight() {
        bodyEquipment.sort(Comparator.comparingDouble(EquipmentBase::getWeight));
    }
}
