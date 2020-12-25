public class Stomach extends  Organ{
    private int digest;

    public Stomach(String name, String medicalCondition, int digest) {
        super(name, medicalCondition);
        this.digest = digest;
    }

    public int getDigest() {
        System.out.println();
        return digest;
    }

    public void setDigest(int digest) {
        this.digest = digest;
    }
}
