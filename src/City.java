public class City {
    private String theName;
    private int population;
    private String climate;

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getClimate() {
        return climate;
    }

    public String getTheName() {
        return theName;
    }

    public void setTheName(String theName) {
        this.theName = theName;
    }

    public void setClimate(String climate) {
        this.climate = climate;

    }

    public City(String theName, int population, String climate) {
        this.theName = theName;
        this.population = population;
        this.climate = climate;
    }

    @Override
    public String toString() {
        return "City{" +
                "theName='" + theName + '\'' +
                ", population=" + population +
                ", climate='" + climate + '\'' +
                '}';
    }
}

