package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SurgeonTest {

    Surgeon underTest = new Surgeon("1", "name", "specialty", true);
    Patient sickPatient = new Patient();

    @Test
    public void shouldIncreaseHealthFrom10To20WhenCaringForPatient(){
        underTest.careForPatient(sickPatient);
        int healthLevel = sickPatient.getHealthLevel();
        assertEquals(20, healthLevel);
    }

    @Test

    public void shouldDecreaseBloodLevelOfPatientFrom20To15WhenDrawingBlood(){
        underTest.drawBlood(sickPatient);
        int patientBloodLevel = sickPatient.getBloodLevel();
        assertEquals(15, patientBloodLevel);

    }

    @Test

    public void shouldExpectSalaryOf90k(){
        int salary = underTest.calculatePay();
        assertEquals(100000, salary);

    }

}
