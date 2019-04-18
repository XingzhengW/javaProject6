package com.xzwang.javaWeb;

/**
 * @Auther: Xingzheng Wang
 * @Date: 4/18/2019 1:29 PM
 * @Description: com.xzwang.javaWeb
 * @Version: 1.0
 */
public class Student {
    private Integer flow_id;
    private int type;
    private String idCard;
    private String examcard;
    private String studentName;
    private String location;
    private int grade;

    public void setFlow_id(Integer flow_id) {
        this.flow_id = flow_id;
    }

    public String getExamcard() {
        return examcard;
    }

    public void setExamcard(String examcard) {
        this.examcard = examcard;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Integer getFlow_id() {
        return flow_id;
    }

    public int getType() {
        return type;
    }

    public String getIdCard() {
        return idCard;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getLocation() {
        return location;
    }

    public int getGrade() {
        return grade;
    }

    public Student(int flowId, int type, String idCard, String examCard, String studentName, String location, int grade) {
        this.flow_id = flow_id;
        this.type = this.type;
        this.idCard = this.idCard;
        this.studentName = this.studentName;
        this.location = this.location;
        this.grade = this.grade;
    }

    public Student() {
    }
}
