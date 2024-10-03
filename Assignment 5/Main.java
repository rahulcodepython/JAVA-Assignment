public class Main {
    public static void main(String[] args) {
        // Creating instances of each class
        Teacher teacher = new Teacher(1, "John Doe", "Mathematics", "Advanced Algebra");
        Officer officer = new Officer(2, "Jane Smith", "A");
        RegularTypist regularTypist = new RegularTypist(3, "Emily Brown", 80, 35000);
        CasualTypist casualTypist = new CasualTypist(4, "Michael Johnson", 75, 500);

        // Displaying details
        System.out.println("Teacher Details:");
        System.out.println("Code: " + teacher.getCode() + ", Name: " + teacher.getName() +
                ", Subject: " + teacher.getSubject() + ", Publication: " + teacher.getPublication());

        System.out.println("\nOfficer Details:");
        System.out.println("Code: " + officer.getCode() + ", Name: " + officer.getName() +
                ", Grade: " + officer.getGrade());

        System.out.println("\nRegular Typist Details:");
        System.out.println("Code: " + regularTypist.getCode() + ", Name: " + regularTypist.getName() +
                ", Speed: " + regularTypist.getSpeed() + " wpm, Remuneration: " + regularTypist.getRemuneration());

        System.out.println("\nCasual Typist Details:");
        System.out.println("Code: " + casualTypist.getCode() + ", Name: " + casualTypist.getName() +
                ", Speed: " + casualTypist.getSpeed() + " wpm, Daily Wages: " + casualTypist.getDailyWages());
    }
}

class Staff {
    private int code;
    private String name;

    public Staff(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}

// Derived class for Teacher
class Teacher extends Staff {
    private String subject;
    private String publication;

    public Teacher(int code, String name, String subject, String publication) {
        super(code, name);
        this.subject = subject;
        this.publication = publication;
    }

    public String getSubject() {
        return subject;
    }

    public String getPublication() {
        return publication;
    }
}

// Derived class for Officer
class Officer extends Staff {
    private String grade;

    public Officer(int code, String name, String grade) {
        super(code, name);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }
}

// Base class for Typist
class Typist extends Staff {
    private int speed;

    public Typist(int code, String name, int speed) {
        super(code, name);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}

// Derived class for RegularTypist
class RegularTypist extends Typist {
    private double remuneration;

    public RegularTypist(int code, String name, int speed, double remuneration) {
        super(code, name, speed);
        this.remuneration = remuneration;
    }

    public double getRemuneration() {
        return remuneration;
    }
}

// Derived class for CasualTypist
class CasualTypist extends Typist {
    private double dailyWages;

    public CasualTypist(int code, String name, int speed, double dailyWages) {
        super(code, name, speed);
        this.dailyWages = dailyWages;
    }

    public double getDailyWages() {
        return dailyWages;
    }
}
