public class Organ {
    private String medicalCondition;
    private String name;

    public Organ(String name, String medicalCondition) {
        this.medicalCondition = medicalCondition;
        this.name = name;
    }

   public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}