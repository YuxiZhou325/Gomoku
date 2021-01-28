

public class Chessman {
    private int color; // color = 1 white; color = 0 black
    private boolean place = false;
    int counter = 1;

    public Chessman(int color, boolean place)
    {
        this.color = color;
        this.place = place;
    }

    public boolean isPlace() {
        return place;
    }

    public void setPlace(boolean place) {
        this.place = place;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
