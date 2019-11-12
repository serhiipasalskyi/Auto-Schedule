package sample;

import java.util.List;

public class DataForTable {

    private String subject;
    private String teacher;
    private List<String> auditoriums;
    private String group;
    private String pairsPerWeek;

    public DataForTable(String subject, String teacher, List<String> auditoriums, String group) {
        this.subject = subject;
        this.teacher = teacher;
        this.auditoriums = auditoriums;
        this.group = group;
        this.pairsPerWeek = "0";
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

    public List<String> getAuditoriums() {
        return auditoriums;
    }

    public void setAuditoriums(List<String> auditoriums) {
        this.auditoriums = auditoriums;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getPairsPerWeek() {
        return pairsPerWeek;
    }

    public void setPairsPerWeek(String pairsPerWeek) {
        this.pairsPerWeek = pairsPerWeek;
    }
}
