package Week5_3.Task1;

public class Pen {
    private Color color;
    private boolean cap = true;


    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;

        Color(String color) {
            this.color = color;
        }

        ;

        @Override
        public String toString() {
            return color;
        }
    }

    public Pen() {
        color = Color.RED;
        boolean cap = true;
    }

    public Pen(Color givenColor) {
        color = givenColor;
        cap = true;
    }

    public void capOff() {
        cap = false;
    }

    public void capOn() {
        cap = true;
    }

    public String draw() {
        if (!this.cap)
            return "Drawing " + this.color;
        else
            return "";
    }
    public void changeColor(Color newColor){
        if (this.cap)
            this.color = newColor;
    }
}
