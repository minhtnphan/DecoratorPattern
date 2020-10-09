public class CheeseDecorator extends ToppingsDecorator {
    Pizza pizza;
    public CheeseDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
    public String getDescription() {
        return pizza.getDescription() + " Cheese";
    }
    public long pizzaCost() {
        return 5 + pizza.pizzaCost();
    }
    
}
