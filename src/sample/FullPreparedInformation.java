package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FullPreparedInformation{

    private String group;
    private int pairsPerWeek;
    private String subject;
    private String teacher;
    private List<String> auditoriums = new ArrayList<>();

    public FullPreparedInformation(String subject, String teacher, List<String> auditoriums, String group, int pairsPerWeek) {
        this.auditoriums = auditoriums;
        this.subject = subject;
        this.teacher = teacher;
        this.group = group;
        this.pairsPerWeek = pairsPerWeek;
    }

    public FullPreparedInformation(String subject, String teacher, String auditorium) {
        this.subject = subject;
        this.teacher = teacher;
        auditoriums.add(auditorium);
    }

    public FullPreparedInformation(String subject, String teacher, List<String> auditorium) {
        this.subject = subject;
        this.teacher = teacher;
        auditoriums.addAll(auditorium);
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getPairsPerWeek() {
        return pairsPerWeek;
    }

    public void setPairsPerWeek(int pairsPerWeek) {
        this.pairsPerWeek = pairsPerWeek;
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

    public void addAuditorium(String auditorium){
        this.auditoriums.add(auditorium);
    }

    public void addAuditoriums(List<String> auditoriums){
        for (String e : auditoriums)
            if (!e.equals(""))
                this.auditoriums.add(e);
    }

}
