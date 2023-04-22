/*
 * This file is generated by jOOQ.
 */
package onlinetutoring.com.teamelevenbackend.entity.tables.daos;


import java.time.LocalTime;
import java.util.List;

import onlinetutoring.com.teamelevenbackend.entity.tables.AvailableHours;
import onlinetutoring.com.teamelevenbackend.entity.tables.records.AvailableHoursRecord;

import org.jooq.Configuration;
import org.jooq.Record3;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AvailableHoursDao extends DAOImpl<AvailableHoursRecord, onlinetutoring.com.teamelevenbackend.entity.tables.pojos.AvailableHours, Record3<Integer, LocalTime, String>> {

    /**
     * Create a new AvailableHoursDao without any configuration
     */
    public AvailableHoursDao() {
        super(AvailableHours.AVAILABLE_HOURS, onlinetutoring.com.teamelevenbackend.entity.tables.pojos.AvailableHours.class);
    }

    /**
     * Create a new AvailableHoursDao with an attached configuration
     */
    public AvailableHoursDao(Configuration configuration) {
        super(AvailableHours.AVAILABLE_HOURS, onlinetutoring.com.teamelevenbackend.entity.tables.pojos.AvailableHours.class, configuration);
    }

    @Override
    public Record3<Integer, LocalTime, String> getId(onlinetutoring.com.teamelevenbackend.entity.tables.pojos.AvailableHours object) {
        return compositeKeyRecord(object.getTutorId(), object.getStartTime(), object.getDayOfWeek());
    }

    /**
     * Fetch records that have <code>tutor_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<onlinetutoring.com.teamelevenbackend.entity.tables.pojos.AvailableHours> fetchRangeOfTutorId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(AvailableHours.AVAILABLE_HOURS.TUTOR_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tutor_id IN (values)</code>
     */
    public List<onlinetutoring.com.teamelevenbackend.entity.tables.pojos.AvailableHours> fetchByTutorId(Integer... values) {
        return fetch(AvailableHours.AVAILABLE_HOURS.TUTOR_ID, values);
    }

    /**
     * Fetch records that have <code>start_time BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<onlinetutoring.com.teamelevenbackend.entity.tables.pojos.AvailableHours> fetchRangeOfStartTime(LocalTime lowerInclusive, LocalTime upperInclusive) {
        return fetchRange(AvailableHours.AVAILABLE_HOURS.START_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>start_time IN (values)</code>
     */
    public List<onlinetutoring.com.teamelevenbackend.entity.tables.pojos.AvailableHours> fetchByStartTime(LocalTime... values) {
        return fetch(AvailableHours.AVAILABLE_HOURS.START_TIME, values);
    }

    /**
     * Fetch records that have <code>end_time BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<onlinetutoring.com.teamelevenbackend.entity.tables.pojos.AvailableHours> fetchRangeOfEndTime(LocalTime lowerInclusive, LocalTime upperInclusive) {
        return fetchRange(AvailableHours.AVAILABLE_HOURS.END_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>end_time IN (values)</code>
     */
    public List<onlinetutoring.com.teamelevenbackend.entity.tables.pojos.AvailableHours> fetchByEndTime(LocalTime... values) {
        return fetch(AvailableHours.AVAILABLE_HOURS.END_TIME, values);
    }

    /**
     * Fetch records that have <code>day_of_week BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<onlinetutoring.com.teamelevenbackend.entity.tables.pojos.AvailableHours> fetchRangeOfDayOfWeek(String lowerInclusive, String upperInclusive) {
        return fetchRange(AvailableHours.AVAILABLE_HOURS.DAY_OF_WEEK, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>day_of_week IN (values)</code>
     */
    public List<onlinetutoring.com.teamelevenbackend.entity.tables.pojos.AvailableHours> fetchByDayOfWeek(String... values) {
        return fetch(AvailableHours.AVAILABLE_HOURS.DAY_OF_WEEK, values);
    }
}
