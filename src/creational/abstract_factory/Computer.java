package creational.abstract_factory;

public abstract class Computer {

    private String ram;
    private String hdd;
    private String cpu;

    @Override
    public String toString() {
        return "Computer{" +
                "ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }

    public String getRam() {
        return ram;
    }

    public String getHdd() {
        return hdd;
    }

    public String getCpu() {
        return cpu;
    }

}
