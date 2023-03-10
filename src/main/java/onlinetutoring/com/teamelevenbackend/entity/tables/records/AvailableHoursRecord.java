/*
 * This file is generated by jOOQ.
 */
package onlinetutoring.com.teamelevenbackend.entity.tables.records;


import java.time.LocalTime;

import onlinetutoring.com.teamelevenbackend.entity.tables.AvailableHours;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AvailableHoursRecord extends UpdatableRecordImpl<AvailableHoursRecord> implements Record4<Integer, LocalTime, LocalTime, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.available_hours.tutor_id</code>.
     */
    public AvailableHoursRecord setTutorId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.available_hours.tutor_id</code>.
     */
    public Integer getTutorId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.available_hours.start_time</code>.
     */
    public AvailableHoursRecord setStartTime(LocalTime value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.available_hours.start_time</code>.
     */
    public LocalTime getStartTime() {
        return (LocalTime) get(1);
    }

    /**
     * Setter for <code>public.available_hours.end_time</code>.
     */
    public AvailableHoursRecord setEndTime(LocalTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.available_hours.end_time</code>.
     */
    public LocalTime getEndTime() {
        return (LocalTime) get(2);
    }

    /**
     * Setter for <code>public.available_hours.day_of_week</code>.
     */
    public AvailableHoursRecord setDayOfWeek(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.available_hours.day_of_week</code>.
     */
    public String getDayOfWeek() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Integer, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, LocalTime, LocalTime, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, LocalTime, LocalTime, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return AvailableHours.AVAILABLE_HOURS.TUTOR_ID;
    }

    @Override
    public Field<LocalTime> field2() {
        return AvailableHours.AVAILABLE_HOURS.START_TIME;
    }

    @Override
    public Field<LocalTime> field3() {
        return AvailableHours.AVAILABLE_HOURS.END_TIME;
    }

    @Override
    public Field<String> field4() {
        return AvailableHours.AVAILABLE_HOURS.DAY_OF_WEEK;
    }

    @Override
    public Integer component1() {
        return getTutorId();
    }

    @Override
    public LocalTime component2() {
        return getStartTime();
    }

    @Override
    public LocalTime component3() {
        return getEndTime();
    }

    @Override
    public String component4() {
        return getDayOfWeek();
    }

    @Override
    public Integer value1() {
        return getTutorId();
    }

    @Override
    public LocalTime value2() {
        return getStartTime();
    }

    @Override
    public LocalTime value3() {
        return getEndTime();
    }

    @Override
    public String value4() {
        return getDayOfWeek();
    }

    @Override
    public AvailableHoursRecord value1(Integer value) {
        setTutorId(value);
        return this;
    }

    @Override
    public AvailableHoursRecord value2(LocalTime value) {
        setStartTime(value);
        return this;
    }

    @Override
    public AvailableHoursRecord value3(LocalTime value) {
        setEndTime(value);
        return this;
    }

    @Override
    public AvailableHoursRecord value4(String value) {
        setDayOfWeek(value);
        return this;
    }

    @Override
    public AvailableHoursRecord values(Integer value1, LocalTime value2, LocalTime value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AvailableHoursRecord
     */
    public AvailableHoursRecord() {
        super(AvailableHours.AVAILABLE_HOURS);
    }

    /**
     * Create a detached, initialised AvailableHoursRecord
     */
    public AvailableHoursRecord(Integer tutorId, LocalTime startTime, LocalTime endTime, String dayOfWeek) {
        super(AvailableHours.AVAILABLE_HOURS);

        setTutorId(tutorId);
        setStartTime(startTime);
        setEndTime(endTime);
        setDayOfWeek(dayOfWeek);
    }

    /**
     * Create a detached, initialised AvailableHoursRecord
     */
    public AvailableHoursRecord(onlinetutoring.com.teamelevenbackend.entity.tables.pojos.AvailableHours value) {
        super(AvailableHours.AVAILABLE_HOURS);

        if (value != null) {
            setTutorId(value.getTutorId());
            setStartTime(value.getStartTime());
            setEndTime(value.getEndTime());
            setDayOfWeek(value.getDayOfWeek());
        }
    }
}
