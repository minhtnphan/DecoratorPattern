public class BaconPizza extends Pizza { //extend because it is a pizza
    public BaconPizza() {
        description = "Bacon Pizza"; //description is inherited from pizza
    }
    public long pizzaCost() {
        return 20;
    }
    
}
