package org.launchcode.enumerableplanets.data;

public enum Planets {

    MERCURY("mercury", 88, 0),
    VENUS("venus", 225, 0),
    EARTH("earth", 365, 1),
    MARS("mars", 687, 2),
    JUPITER("jupiter", 4333, 79),
    SATURN("saturn", 10759, 82),
    URANUS("uranus", 30687, 27),
    NEPTUNE("neptune", 60200, 14);

    private final String name;
    private final int yearLength;
    private final int numOfMoons;

    Planets(String name, int yearLength, int numOfMoons) {
        this.name = name;
        this.yearLength = yearLength;
        this.numOfMoons = numOfMoons;
    }

    public String getName() {
        return name;
    }

    public int getYearLength() {
        return yearLength;
    }

    public int getNumOfMoons() {
        return numOfMoons;
    }
}

