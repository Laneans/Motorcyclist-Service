package bike;

import static bike.Program.*;

public interface Equipmentable {
    static double countPrice() {
        double commonPrice = 0;
        for (EquipmentBase e : headEquipment) {
            commonPrice += e.getPrice();
        }
        for (EquipmentBase e : bodyEquipment) {
            commonPrice += e.getPrice();
        }
        for (EquipmentBase e : legsEquipment) {
            commonPrice += e.getPrice();
        }
        return commonPrice;
    }

    void findByRangeOfPrice(double consoleMinPrice, double consoleMaxPrice);

    void sortByWeight();
}
