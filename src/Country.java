public class Country {
    private String name;
    private String accesToTheOcean;
    private int square;
    private String nuclearWeapon;

    public String getAccesToTheOcean() {
        return accesToTheOcean;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccesToTheOcean(String accesToTheOcean) {
        this.accesToTheOcean = accesToTheOcean;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public String getNuclearWeapon() {
        return nuclearWeapon;
    }

    public void setNuclearWeapon(String nuclearWeapon) {
        this.nuclearWeapon = nuclearWeapon;
    }

    public Country(String name, String accesToTheOcean, int square, String nuclearWeapon) {
        this.name = name;
        this.accesToTheOcean = accesToTheOcean;
        this.square = square;
        this.nuclearWeapon = nuclearWeapon;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", accesToTheOcean='" + accesToTheOcean + '\'' +
                ", square=" + square +
                ", nuclearWeapon='" + nuclearWeapon + '\'' +
                '}';
    }
}