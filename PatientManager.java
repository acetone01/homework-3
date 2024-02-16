public class PatientManager
{
    private Patient[] patients;

    public PatientManager()
    {
        patients = new Patient[10];
    }

    public int addPatient(Patient patient)
    {
        for (int i = 0; i < patients.length; i++)
        {
            if (patients[i] == null)
            {
                patients[i] = patient;
                return i;
            }
        }
        return -1; //full
    }

    public Patient removePatient(int index)
    {
        if (index >= 0 && index < patients.length)
        {
            Patient removedPatient = patients[index];
            patients[index] = null;
            return removedPatient;
        }
        return null;
    }

    public void caffeineAbsorption()
    {
        for (int i = 0; i < patients.length; i++)
        {
            if (patients[i] != null)
            {
                patients[i].setCaffeineLevel(patients[i].getCaffeineLevel() - 130);
                if (patients[i].getCaffeineLevel() <= 0)
                {
                    patients[i] = null;
                }
            }
        }
    }

    public void printPatients()
    {
        if (isEmpty())
        {
            System.out.println("Empty");
            return;
        }

        for (int i = 0; i < patients.length; i++)
        {
            if (patients[i] != null)
            {
                System.out.println(patients[i].getId() + " " + patients[i].getCaffeineLevel());
            }
        }
    }

    private boolean isEmpty()
    {
        for (Patient patient : patients)
        {
            if (patient != null)
            {
                return false;
            }
        }
        return true;
    }
}
