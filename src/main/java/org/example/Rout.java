package org.example;

public class Rout {
    private String start;
    private String finish;
    private int distance;

    public Rout(String start, String finish, int distance) {
        this.start = start;
        this.finish = finish;
        this.distance = distance;
    }

    public String getStart() {
        return start;
    }

    public String getFinish() {
        return finish;
    }

    public int getDistance() {
        return distance;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Rout{" +
                "start='" + start + '\'' +
                ", finish='" + finish + '\'' +
                ", distance=" + distance +
                '}';
    }


}
