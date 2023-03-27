/*
 * This file is generated by jOOQ.
 */
package onlinetutoring.com.teamelevenbackend.entity.tables.pojos;


import java.io.Serializable;
import java.time.OffsetDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Appointments implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer tutorId;
    private Integer studentId;
    private OffsetDateTime startTime;
    private OffsetDateTime endTime;
    private String subject;

    public Appointments() {}

    public Appointments(Appointments value) {
        this.tutorId = value.tutorId;
        this.studentId = value.studentId;
        this.startTime = value.startTime;
        this.endTime = value.endTime;
        this.subject = value.subject;
    }

    public Appointments(
        Integer tutorId,
        Integer studentId,
        OffsetDateTime startTime,
        OffsetDateTime endTime,
        String subject
    ) {
        this.tutorId = tutorId;
        this.studentId = studentId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.subject = subject;
    }

    /**
     * Getter for <code>public.appointments.tutor_id</code>.
     */
    public Integer getTutorId() {
        return this.tutorId;
    }

    /**
     * Setter for <code>public.appointments.tutor_id</code>.
     */
    public Appointments setTutorId(Integer tutorId) {
        this.tutorId = tutorId;
        return this;
    }

    /**
     * Getter for <code>public.appointments.student_id</code>.
     */
    public Integer getStudentId() {
        return this.studentId;
    }

    /**
     * Setter for <code>public.appointments.student_id</code>.
     */
    public Appointments setStudentId(Integer studentId) {
        this.studentId = studentId;
        return this;
    }

    /**
     * Getter for <code>public.appointments.start_time</code>.
     */
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Setter for <code>public.appointments.start_time</code>.
     */
    public Appointments setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Getter for <code>public.appointments.end_time</code>.
     */
    public OffsetDateTime getEndTime() {
        return this.endTime;
    }

    /**
     * Setter for <code>public.appointments.end_time</code>.
     */
    public Appointments setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Getter for <code>public.appointments.subject</code>.
     */
    public String getSubject() {
        return this.subject;
    }

    /**
     * Setter for <code>public.appointments.subject</code>.
     */
    public Appointments setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Appointments other = (Appointments) obj;
        if (this.tutorId == null) {
            if (other.tutorId != null)
                return false;
        }
        else if (!this.tutorId.equals(other.tutorId))
            return false;
        if (this.studentId == null) {
            if (other.studentId != null)
                return false;
        }
        else if (!this.studentId.equals(other.studentId))
            return false;
        if (this.startTime == null) {
            if (other.startTime != null)
                return false;
        }
        else if (!this.startTime.equals(other.startTime))
            return false;
        if (this.endTime == null) {
            if (other.endTime != null)
                return false;
        }
        else if (!this.endTime.equals(other.endTime))
            return false;
        if (this.subject == null) {
            if (other.subject != null)
                return false;
        }
        else if (!this.subject.equals(other.subject))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.tutorId == null) ? 0 : this.tutorId.hashCode());
        result = prime * result + ((this.studentId == null) ? 0 : this.studentId.hashCode());
        result = prime * result + ((this.startTime == null) ? 0 : this.startTime.hashCode());
        result = prime * result + ((this.endTime == null) ? 0 : this.endTime.hashCode());
        result = prime * result + ((this.subject == null) ? 0 : this.subject.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Appointments (");

        sb.append(tutorId);
        sb.append(", ").append(studentId);
        sb.append(", ").append(startTime);
        sb.append(", ").append(endTime);
        sb.append(", ").append(subject);

        sb.append(")");
        return sb.toString();
    }
}
