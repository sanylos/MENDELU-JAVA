package cviceni3;

public class Employee {
    String name, surname, jobDescription;
    public Employee(String name, String surname, String jobDescription) {
        this.name = name;
        this.surname = surname;
        this.jobDescription = jobDescription;
    }

    @Override
    public String toString() {
        return "Jsem " + getName() + " " + getSurname()
                + ", " + getJobDescription() + ".";
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getJobDescription() {
        return jobDescription;
    }

}
