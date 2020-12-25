public class Eye extends Organ {
    private String color;
    private String name;
    private boolean isOpen;

    public Eye(String name, String medicalCondition, String color, boolean isOpen) {
        super(name, medicalCondition);
        this.color = color;
        this.isOpen = isOpen;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}