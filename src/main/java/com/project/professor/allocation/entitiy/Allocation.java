package com.project.professor.allocation.entitiy;
import javax.persistence.*;
import java.time.DayOfWeek;
import java.util.Date;
@Entity
public class Allocation {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DayOfWeek getDay() {
        return day;
    }

    public void setDay(DayOfWeek day) {
        this.day = day;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Long getProfessorId() {
        return professorId;
    }

    public void setProfessorId(Long professorId) {
        this.professorId = professorId;
    }
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DayOfWeek day;
    @Column(nullable = false)
    @Temporal(TemporalType.TIME)
    private Date start;
    @Temporal(TemporalType.TIME)
    @Column(nullable = false)
    private Date end;
    private Long courseId;
    private Long professorId;

}
