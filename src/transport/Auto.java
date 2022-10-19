package transport;

public class Auto {
    public static class Key {
        private String distEngine;
        private String unKey;

        public Key(String distEngine, String unKey) {
            if (distEngine != null && !distEngine.isEmpty()) {
                this.distEngine = distEngine;
            } else {
                this.distEngine = "Incorrect";
            }
            if (unKey != null && !unKey.isEmpty()) {
                this.unKey = unKey;
            } else {
                this.unKey = "incorrect";
            }

        }
    }

    public static class Insurance {
        private int validityPeriod;
        private int insCount;
        private int insNumber;

        public Insurance(int validityPeriod, int insCount, int insNumber) {
            if (validityPeriod == 0) {
                System.out.println("incorrect");
            } else {
                this.validityPeriod = validityPeriod;
            }
            if (insCount == 0) {
                System.out.println("incorrect");
            } else {
                this.insCount = insCount;
            }
            if (insNumber == 0) {
                System.out.println("Incorrect");
            } else {
                this.insNumber = insNumber;
            }
        }

    }
    private String mark;
    private String model;
    double volume;
    String colour;
    private int year;
    private String country;
    String kpp;
    private String bodyType;
    String regNumber;
    private int sitCount;
    boolean summerTires;

    public Auto(String mark, String model, double volume, String colour, int year, String country,
         String kpp, String bodyType, String regNumber, int sitCount, boolean summerTires) {
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
        if (country == null) {
            this.country = "Incorrect";
        } else {
            this.country = country;
        }
        if (kpp == null) {
            this.kpp = "incorrect";
        } else {
            this.kpp = kpp;
        }
        if (bodyType == null) {
            this.bodyType = "incorrect";
        } else {
            this.bodyType = bodyType;
        }
        if (regNumber == null || regNumber.length() != 9) {
            this.regNumber = "x000xx000";
        } else {
            this.regNumber = regNumber;
        }
        if (sitCount == 0) {
            System.out.println("Incorrect");
        } else {
            this.sitCount = sitCount;
        }
        this.summerTires = summerTires;
    }

    public void printAuto() {
        System.out.println(getMark()
                + " " + getModel() + ", " + getYear()
                + " года выпуска, сборка: " + getCountry() + ", цвет: "
                + getColour() + ", объем двигателя:  " + getVolume());
    }
    public void changeTires() {
        summerTires = !summerTires;
    }

    public boolean isCorrectRegNumber() {
        if (regNumber.length() != 9) {
            return false;
        }
        char[] chars = regNumber.toCharArray();
        if (Character.isAlphabetic(chars[0]) || Character.isAlphabetic(chars[4]) || Character.isAlphabetic(chars[5])) {
            return false;
        }
        return Character.isDigit(chars[1]) && Character.isDigit(chars[2]) && Character.isDigit(chars[3]) && Character.isDigit(chars[6])
                && Character.isDigit(chars[7]) && Character.isDigit(chars[8]);
    }

    public String getMark() {
        return mark;
    }
    public void setMark(String mark) {
        this.mark = mark;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public double getVolume() {
        return volume;
    }
    public String getColour() {
        return colour;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getBodyType() {
        return bodyType;
    }
    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }
    public int getSitCount() {
        return sitCount;
    }
    public void setSitCount(int sitCount) {
        this.sitCount = sitCount;
    }



}
