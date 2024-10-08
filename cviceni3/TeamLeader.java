package cviceni3;

public class TeamLeader extends Employee {
    int numOfTeamMembers;
    Employee[] teamMembers;

    public TeamLeader(String name, String surname,
                      int maxNumOfTeamMembers) {
        super(name, surname, "já to tady řídím");
        teamMembers = new Employee[maxNumOfTeamMembers];
        this.numOfTeamMembers = 0;
    }

    static TeamLeader getNewTeamLeader(String name,
                                       String surname,
                                       String maxNumOfTeamMembersStr) {
        int number = Integer.parseInt(maxNumOfTeamMembersStr);
        return new TeamLeader(name, surname, number);
    }

    public boolean addTeamMember(Employee e) {
        if (numOfTeamMembers < teamMembers.length) {
            teamMembers[numOfTeamMembers++] = e;
            return true;
        }
        return false;
    }

    @Override
    public String getJobDescription() {
        StringBuffer sb = new StringBuffer();
        sb.append(super.getJobDescription() + "\n") ;
        sb.append("Vedu tyto lidi:\n");
        for (int i = 0; i < numOfTeamMembers; i++) {
            sb.append(teamMembers[i].toString() + "\n");
        }
        return sb.toString();
    }
}
