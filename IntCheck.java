public class IntCheck {
    private int num;
    private Type type;

    public enum Type {
        ODD, EVEN
    };

    public IntCheck(int num) {
        this.num = num;
    }

    public Boolean checkOdd() {
        if (this.num % 2 == 0) {
            this.type = Type.EVEN;
            return false;
        } else {
            this.type = Type.ODD;
            return true;
        }
    }

    public String toString() {
        return this.num + " is " + this.type + ". ";
    }

    public String getType() {
        return this.type.toString();
    }
}