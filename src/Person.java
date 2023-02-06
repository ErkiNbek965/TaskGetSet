public class Person {
    private String president;
    private String spiker;
    private String glavaGKNB;

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public String getSpiker() {
        return spiker;
    }

    public void setSpiker(String spiker) {
        this.spiker = spiker;
    }

    public String getGlavaGKNB() {
        return glavaGKNB;
    }

    public void setGlavaGKNB(String glavaGKNB) {
        this.glavaGKNB = glavaGKNB;
    }

    public Person(String president, String spiker, String glavaGKNB) {
        this.president = president;
        this.spiker = spiker;
        this.glavaGKNB = glavaGKNB;
    }

    @Override
    public String toString() {
        return "Person{" +
                "president='" + president + '\'' +
                ", spiker='" + spiker + '\'' +
                ", glavaGKNB='" + glavaGKNB + '\'' +
                '}';
    }
}
