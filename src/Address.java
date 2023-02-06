public class Address {
    private String adressJob;
    private String adressHome;

    public String getAdressJob() {
        return adressJob;
    }

    public void setAdressJob(String adressJob) {
        this.adressJob = adressJob;
    }

    public String getAdressHome() {
        return adressHome;
    }

    public void setAdressHome(String adressHome) {
        this.adressHome = adressHome;
    }

    public String getAdressHobby() {
        return adressHobby;
    }

    public void setAdressHobby(String adressHobby) {
        this.adressHobby = adressHobby;
    }

    private String adressHobby;

    public Address(String adressJob, String adressHome, String adressHobby) {
        this.adressJob = adressJob;
        this.adressHome = adressHome;
        this.adressHobby = adressHobby;
    }

    @Override
    public String toString() {
        return "Address{" +
                "adressJob='" + adressJob + '\'' +
                ", adressHome='" + adressHome + '\'' +
                ", adressHobby='" + adressHobby + '\'' +
                '}';
    }
}

