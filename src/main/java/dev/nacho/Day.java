package dev.nacho;

public enum Day {
    Monday("Monday"),
    Tuesday("Tuesday"),
    Wednesday("Wednesday"),
    Thursday("Thursday"),
    Friday("Friday"),
    Saturday("Saturday"),
    Sunday("Sunday");

    private Day(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

}
