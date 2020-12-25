public class Heart extends Organ{
    private int rate;
    private String name;

    public Heart(String name, String medicalCondition, int rate ) {
        super(name, medicalCondition);
        this.rate = rate;
    }


    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
