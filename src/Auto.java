public class Auto {
    String mark;
    String model;
    double volume;
    String colour;
    int year;
    String country;

    Auto(String mark, String model, double volume, String colour, int year, String country) {
        if (mark == null) {
            this.mark = "default";
        } else {
            this.mark = mark;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (Double.compare(volume,0) == 0) {
            this.volume = 1.5;
        } else {
            this.volume = volume;
        }
        if (colour == null) {
            this.colour = "white";
        } else {
            this.colour = colour;
        }
        if (year == 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        this.year = year;
    }

    String getMark() {
        return mark;
    }
    String getModel() {
        return model;
    }
    double getVolume() {
        return volume;
    }
    String getColour() {
        return colour;
    }
    int getYear() {
        return year;
    }
    String getCountry() {
        return country;
    }

    void printAuto() {
        System.out.println(getMark()
                + " " + getModel() + ", " + getYear()
                + " года выпуска, сборка: " + getCountry() + ", цвет: "
                + getColour() + ", объем двигателя:  " + getVolume());
    }
}
