package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NurseTest {

    Nurse underTest = new Nurse("1", "name", 5);
    Patient sickPatient = new Patient();

    @Test

    public void shouldIncreaseHealthLevelOfPatientFrom10To15WhenProvidingCare(){
        underTest.careForPatient(sickPatient);
        int patientHealthLevel = sickPatient.getHealthLevel();
        assertEquals(15, patientHealthLevel);
    }

    @Test

    public void shouldDecreaseBloodLevelOfPatientFrom20To15WhenDrawingBlood(){
        underTest.drawBlood(sickPatient);
        int patientBloodLevel = sickPatient.getBloodLevel();
        assertEquals(15, patientBloodLevel);
    }

    @Test

    public void shouldExpectSalaryof50k(){
        int salary = underTest.calculatePay();
        assertEquals(80000,salary);
    }

}
