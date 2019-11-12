package sample;

public class Class {

    private String subject;
    private String teacher;
    private String auditorium;

    public Class(String subject, String teacher, String auditorium) {
        this.subject = subject;
        this.teacher = teacher;
        this.auditorium = auditorium;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(String auditorium) {
        this.auditorium = auditorium;
    }

    public void setParameters(String subject, String teacher, String auditorium){
        this.subject = subject;
        this.teacher = teacher;
        this.auditorium = auditorium;
    }

    @Override
    public String toString() {
        try {
            return subject + "\n" + teacher + "\n" + auditorium;
        }catch (NullPointerException e){
            return "";
        }
    }
}
