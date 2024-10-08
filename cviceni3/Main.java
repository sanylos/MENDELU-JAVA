package cviceni3;
public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Jára",
                "Cimrman",
                "vynálezce");
        Employee e2 = new Employee("Eva",
                "Pilná",
                "účetní");
        TeamLeader tl = new TeamLeader("Karel",
                "Důležitý", 20);
        tl.addTeamMember(e1);
        tl.addTeamMember(e2);
        System.out.println(tl);
    }
}