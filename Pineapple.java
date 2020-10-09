public class Pineapple extends ToppingsDecorator{
    Pizza pizza; //variable keeping the pizza that will be decorated
    public Pineapple(Pizza pizza) { //set the variable to the pizza we decorate
        this.pizza = pizza;
    }
    public String getDescription() {
        return pizza.getDescription() + " Pineapple";
    }
    public long pizzaCost() {
        return 7 + pizza.pizzaCost();
    }
}
