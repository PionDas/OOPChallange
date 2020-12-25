public class Patient {
    private String name;
    private int age;

    private Eye leftEye;
    private Eye rightEye;
    private Skin skin;
    private Heart heart;
    private Stomach stomach;

    public Patient(String name, int age, Eye leftEye, Eye rightEye, Skin skin, Heart heart, Stomach stomach) {
        this.name = name;
        this.age = age;
        this.leftEye = leftEye;
        this.rightEye = rightEye;
        this.skin = skin;
        this.heart = heart;
        this.stomach = stomach;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Eye getLeftEye() {
        return leftEye;
    }

    public void setLeftEye(Eye leftEye) {
        this.leftEye = leftEye;
    }

    public Eye getRightEye() {
        return rightEye;
    }

    public void setRightEye(Eye rightEye) {
        this.rightEye = rightEye;
    }

    public Skin getSkin() {
        return skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }

    public Heart getHeart() {
        return heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public Stomach getStomach() {
        return stomach;
    }

    public void setStomach(Stomach stomach) {
        this.stomach = stomach;
    }
}