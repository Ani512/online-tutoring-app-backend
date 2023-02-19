/*
 * This file is generated by jOOQ.
 */
package onlinetutoring.com.teamelevenbackend.entity.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import onlinetutoring.com.teamelevenbackend.entity.Keys;
import onlinetutoring.com.teamelevenbackend.entity.Public;
import onlinetutoring.com.teamelevenbackend.entity.tables.records.TutorsRecord;

import org.jooq.Check;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function2;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tutors extends TableImpl<TutorsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.tutors</code>
     */
    public static final Tutors TUTORS = new Tutors();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TutorsRecord> getRecordType() {
        return TutorsRecord.class;
    }

    /**
     * The column <code>public.tutors.id</code>.
     */
    public final TableField<TutorsRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.tutors.subjects</code>.
     */
    public final TableField<TutorsRecord, String[]> SUBJECTS = createField(DSL.name("subjects"), SQLDataType.VARCHAR(100).getArrayDataType(), this, "");

    private Tutors(Name alias, Table<TutorsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tutors(Name alias, Table<TutorsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.tutors</code> table reference
     */
    public Tutors(String alias) {
        this(DSL.name(alias), TUTORS);
    }

    /**
     * Create an aliased <code>public.tutors</code> table reference
     */
    public Tutors(Name alias) {
        this(alias, TUTORS);
    }

    /**
     * Create a <code>public.tutors</code> table reference
     */
    public Tutors() {
        this(DSL.name("tutors"), null);
    }

    public <O extends Record> Tutors(Table<O> child, ForeignKey<O, TutorsRecord> key) {
        super(child, key, TUTORS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<TutorsRecord> getPrimaryKey() {
        return Keys.TUTORS_PKEY;
    }

    @Override
    public List<ForeignKey<TutorsRecord, ?>> getReferences() {
        return Arrays.asList(Keys.TUTORS__TUTORS_ID_FKEY);
    }

    private transient Users _users;

    /**
     * Get the implicit join path to the <code>public.users</code> table.
     */
    public Users users() {
        if (_users == null)
            _users = new Users(this, Keys.TUTORS__TUTORS_ID_FKEY);

        return _users;
    }

    @Override
    public List<Check<TutorsRecord>> getChecks() {
        return Arrays.asList(
            Internal.createCheck(this, DSL.name("not_student"), "((checkifnotstudent(id) IS TRUE))", true)
        );
    }

    @Override
    public Tutors as(String alias) {
        return new Tutors(DSL.name(alias), this);
    }

    @Override
    public Tutors as(Name alias) {
        return new Tutors(alias, this);
    }

    @Override
    public Tutors as(Table<?> alias) {
        return new Tutors(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Tutors rename(String name) {
        return new Tutors(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tutors rename(Name name) {
        return new Tutors(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tutors rename(Table<?> name) {
        return new Tutors(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String[]> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function2<? super Integer, ? super String[], ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function2<? super Integer, ? super String[], ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
