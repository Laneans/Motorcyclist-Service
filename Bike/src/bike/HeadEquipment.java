package bike;

import java.util.ArrayList;
import java.util.Comparator;

import static bike.Program.headEquipment;

public class HeadEquipment extends EquipmentBase implements Equipmentable {

    public HeadEquipment(String _name, double _price, double _weight) {
        super(_name, _price, _weight);
    }


    //from abstract class
    @Override
    public void seeEquipment() {
        int numeric = 1;
            for (EquipmentBase e : headEquipment) {
                System.out.print(" " + numeric + ") " + e.getName() + " " + e.getPrice() + " $. (" + e.getWeight() + " g)\n");
                numeric++;
            }
    }

    //from interface
    @Override
    public void findByRangeOfPrice(double consoleMinPrice, double consoleMaxPrice) {
        ArrayList<EquipmentBase> newWithNeedPriceHead = new ArrayList<>();
        for (EquipmentBase e : headEquipment) {
            if (e.getPrice() >= consoleMinPrice && e.getPrice() <= consoleMaxPrice) {
                newWithNeedPriceHead.add(e);
            }
        }
        for (EquipmentBase eqNew : newWithNeedPriceHead) {
            System.out.println(eqNew.getName() + " " + eqNew.getPrice() + "\n");
        }
    }

    @Override
    public void sortByWeight() {
        headEquipment.sort(Comparator.comparingDouble(EquipmentBase::getWeight));
    }
}
