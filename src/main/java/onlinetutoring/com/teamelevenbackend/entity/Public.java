/*
 * This file is generated by jOOQ.
 */
package onlinetutoring.com.teamelevenbackend.entity;


import java.util.Arrays;
import java.util.List;

import onlinetutoring.com.teamelevenbackend.entity.tables.Appointments;
import onlinetutoring.com.teamelevenbackend.entity.tables.AvailableHours;
import onlinetutoring.com.teamelevenbackend.entity.tables.Students;
import onlinetutoring.com.teamelevenbackend.entity.tables.Tutors;
import onlinetutoring.com.teamelevenbackend.entity.tables.Users;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.appointments</code>.
     */
    public final Appointments APPOINTMENTS = Appointments.APPOINTMENTS;

    /**
     * The table <code>public.available_hours</code>.
     */
    public final AvailableHours AVAILABLE_HOURS = AvailableHours.AVAILABLE_HOURS;

    /**
     * The table <code>public.students</code>.
     */
    public final Students STUDENTS = Students.STUDENTS;

    /**
     * The table <code>public.tutors</code>.
     */
    public final Tutors TUTORS = Tutors.TUTORS;

    /**
     * The table <code>public.users</code>.
     */
    public final Users USERS = Users.USERS;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        return Arrays.asList(
            Sequences.INTERNAL_ID,
            Sequences.U_ID
        );
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Appointments.APPOINTMENTS,
            AvailableHours.AVAILABLE_HOURS,
            Students.STUDENTS,
            Tutors.TUTORS,
            Users.USERS
        );
    }
}
