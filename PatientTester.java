public class PatientTester
{
    public static void main(String[] args)
    {
        PatientManager patientManager = new PatientManager();
        
        patientManager.printPatients();

        patientManager.addPatient(new Patient(1, 200));
        patientManager.addPatient(new Patient(2, 400));
        patientManager.addPatient(new Patient(3, 600));
        patientManager.addPatient(new Patient(4, 800));

        patientManager.printPatients();

        patientManager.caffeineAbsorption();
        patientManager.caffeineAbsorption();

        patientManager.printPatients();
        patientManager.printPatients();
    }
}
