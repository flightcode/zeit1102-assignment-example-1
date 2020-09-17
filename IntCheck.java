public class IntCheck {
    private int num;
    private Type type;

    public enum Type {
        ODD, EVEN
    };

    public IntCheck(int num) {
        this.num = num;
    }

    public Boolean checkOdd() { // Check if num is odd, and assign appropriate type enum to object
        if (this.num % 2 == 0) {
            this.type = Type.EVEN;
            return false;
        } else {
            this.type = Type.ODD;
            return true;
        }
    }

    public String toString() { // Convert object to string
        return this.num + " is " + this.type + ". ";
    }

    public String getType() {
        return this.type.toString();
    }
}