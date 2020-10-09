public abstract class Pizza { //abstract class for pizza
    String description = "pizza to be determined";
    
    public String getDescription() {
        return description;
    }
    public abstract long pizzaCost(); //this method takes its implementation from the subclasses
}