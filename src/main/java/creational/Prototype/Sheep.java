package creational.Prototype;

public class Sheep implements Cloneable{
    protected String name;
    protected String category;

    public Sheep(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public Sheep(String name){
        this.name = name;
        this.category = "Mountain Sheep";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public Sheep clone() throws CloneNotSupportedException {
        return (Sheep) super.clone();
    }
}
