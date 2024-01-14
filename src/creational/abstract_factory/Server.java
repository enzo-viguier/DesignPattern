package creational.abstract_factory;

public class Server extends Computer {

    private String ram;
    private String hdd;
    private String cpu;

    public Server(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    @Override
    public String toString() {
        return "Server : RAM = " + this.ram + ", HDD = " + this.hdd + ", CPU = " + this.cpu + ".";
    }


}
