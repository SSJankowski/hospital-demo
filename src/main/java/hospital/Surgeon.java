package hospital;

public class Surgeon extends Doctor {


    private boolean asOperating;

    public Surgeon(String employeeNumber, String name, String specialty, boolean isOperating) {
        super(employeeNumber, name, specialty);
    }

    @Override
    public int calculatePay() {
        return 100000;
    }
}
