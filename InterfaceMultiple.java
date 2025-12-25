// First interface
interface XYZ {
    public void functionX();
}

// Second interface
interface MSP {
    public void functionM();
}

// Third interface extending multiple interfaces
interface PQR extends XYZ, MSP {
    public void functionP();
}

// Class implementing the interface
class ABC implements PQR {

    public void functionX() {
        System.out.println("void function X()");
    }

    public void functionM() {
        System.out.println("void function M()");
    }

    public void functionP() {
        System.out.println("void function P()");
    }
}

// Main class
public class InterfaceMultiple {

    public static void main(String[] args) {

        ABC obj = new ABC();

        obj.functionX();
        obj.functionM();
        obj.functionP();
    }
}
