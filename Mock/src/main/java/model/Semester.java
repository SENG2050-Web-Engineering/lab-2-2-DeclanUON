package model;

public class Semester {
    private String semesterId;
    private String semesterName;

    public Semester() {
    }

    public Semester(String semesterId, String semesterName) {
        this.semesterId = semesterId;
        this.semesterName = semesterName;
    }

    public String getSemesterId() {
        return semesterId;
    }

    public String getSemesterName() {
        return semesterName;
    }
}
