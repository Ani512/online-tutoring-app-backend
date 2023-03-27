/*
 * This file is generated by jOOQ.
 */
package onlinetutoring.com.teamelevenbackend.entity.tables;


import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import onlinetutoring.com.teamelevenbackend.entity.Keys;
import onlinetutoring.com.teamelevenbackend.entity.Public;
import onlinetutoring.com.teamelevenbackend.entity.tables.records.AppointmentsRecord;

import org.jooq.Check;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function5;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Appointments extends TableImpl<AppointmentsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.appointments</code>
     */
    public static final Appointments APPOINTMENTS = new Appointments();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AppointmentsRecord> getRecordType() {
        return AppointmentsRecord.class;
    }

    /**
     * The column <code>public.appointments.tutor_id</code>.
     */
    public final TableField<AppointmentsRecord, Integer> TUTOR_ID = createField(DSL.name("tutor_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.appointments.student_id</code>.
     */
    public final TableField<AppointmentsRecord, Integer> STUDENT_ID = createField(DSL.name("student_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.appointments.start_time</code>.
     */
    public final TableField<AppointmentsRecord, OffsetDateTime> START_TIME = createField(DSL.name("start_time"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false), this, "");

    /**
     * The column <code>public.appointments.end_time</code>.
     */
    public final TableField<AppointmentsRecord, OffsetDateTime> END_TIME = createField(DSL.name("end_time"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false), this, "");

    /**
     * The column <code>public.appointments.subject</code>.
     */
    public final TableField<AppointmentsRecord, String> SUBJECT = createField(DSL.name("subject"), SQLDataType.VARCHAR(100), this, "");

    private Appointments(Name alias, Table<AppointmentsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Appointments(Name alias, Table<AppointmentsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.appointments</code> table reference
     */
    public Appointments(String alias) {
        this(DSL.name(alias), APPOINTMENTS);
    }

    /**
     * Create an aliased <code>public.appointments</code> table reference
     */
    public Appointments(Name alias) {
        this(alias, APPOINTMENTS);
    }

    /**
     * Create a <code>public.appointments</code> table reference
     */
    public Appointments() {
        this(DSL.name("appointments"), null);
    }

    public <O extends Record> Appointments(Table<O> child, ForeignKey<O, AppointmentsRecord> key) {
        super(child, key, APPOINTMENTS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<ForeignKey<AppointmentsRecord, ?>> getReferences() {
        return Arrays.asList(Keys.APPOINTMENTS__APPOINTMENTS_TUTOR_ID_FKEY, Keys.APPOINTMENTS__APPOINTMENTS_STUDENT_ID_FKEY);
    }

    private transient Tutors _tutors;
    private transient Students _students;

    /**
     * Get the implicit join path to the <code>public.tutors</code> table.
     */
    public Tutors tutors() {
        if (_tutors == null)
            _tutors = new Tutors(this, Keys.APPOINTMENTS__APPOINTMENTS_TUTOR_ID_FKEY);

        return _tutors;
    }

    /**
     * Get the implicit join path to the <code>public.students</code> table.
     */
    public Students students() {
        if (_students == null)
            _students = new Students(this, Keys.APPOINTMENTS__APPOINTMENTS_STUDENT_ID_FKEY);

        return _students;
    }

    @Override
    public List<Check<AppointmentsRecord>> getChecks() {
        return Arrays.asList(
            Internal.createCheck(this, DSL.name("time_validator"), "((end_time > start_time))", true)
        );
    }

    @Override
    public Appointments as(String alias) {
        return new Appointments(DSL.name(alias), this);
    }

    @Override
    public Appointments as(Name alias) {
        return new Appointments(alias, this);
    }

    @Override
    public Appointments as(Table<?> alias) {
        return new Appointments(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Appointments rename(String name) {
        return new Appointments(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Appointments rename(Name name) {
        return new Appointments(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Appointments rename(Table<?> name) {
        return new Appointments(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Integer, OffsetDateTime, OffsetDateTime, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super Integer, ? super Integer, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super Integer, ? super Integer, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
