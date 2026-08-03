package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.codec.DateTimeCodec;
import com.alibaba.fastjson2.reader.ObjectReaderImplDate;
import com.alibaba.fastjson2.writer.ObjectWriter;
import java.lang.reflect.Type;
import java.sql.Clob;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class JdbcSupport {

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class ClobWriter implements ObjectWriter {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.alibaba.fastjson2.writer.ObjectWriter
        public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
            try {
                jSONWriter.writeString(((Clob) obj).getCharacterStream());
            } catch (SQLException e6) {
                C0086a.m465x("get getCharacterStream error", e6);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class DateReader extends ObjectReaderImplDate {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public DateReader(String str, Locale locale) {
            super(str, locale);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.alibaba.fastjson2.reader.ObjectReaderImplDate, com.alibaba.fastjson2.reader.ObjectReader
        public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
            return readObject(jSONReader, type, obj, j3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.alibaba.fastjson2.reader.ObjectReaderImplDate, com.alibaba.fastjson2.reader.ObjectReader
        public Object readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
            if (jSONReader.isInt()) {
                long int64Value = jSONReader.readInt64Value();
                if (this.formatUnixTime) {
                    int64Value *= 1000;
                }
                return new Date(int64Value);
            }
            if (jSONReader.readIfNull()) {
                return null;
            }
            if (this.formatUnixTime && jSONReader.isString()) {
                return new Date(Long.parseLong(jSONReader.readString()) * 1000);
            }
            if (this.format != null && !this.formatISO8601 && !this.formatMillis) {
                String string = jSONReader.readString();
                if (string.isEmpty()) {
                    return null;
                }
                DateTimeFormatter dateFormatter = getDateFormatter();
                return new Date((!this.formatHasHour ? LocalDateTime.of(LocalDate.parse(string, dateFormatter), LocalTime.MIN).atZone(jSONReader.getContext().getZoneId()).toInstant() : LocalDateTime.parse(string, dateFormatter).atZone(jSONReader.getContext().getZoneId()).toInstant()).toEpochMilli());
            }
            LocalDateTime localDateTime = jSONReader.readLocalDateTime();
            if (localDateTime != null) {
                return Date.valueOf(localDateTime.toLocalDate());
            }
            if (jSONReader.wasNull()) {
                return null;
            }
            long millisFromString = jSONReader.readMillisFromString();
            if (millisFromString == 0 && jSONReader.wasNull()) {
                return null;
            }
            return new Date(millisFromString);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class TimeReader extends ObjectReaderImplDate {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public TimeReader(String str, Locale locale) {
            super(str, locale);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.alibaba.fastjson2.reader.ObjectReaderImplDate, com.alibaba.fastjson2.reader.ObjectReader
        public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
            return readObject(jSONReader, type, obj, j3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.alibaba.fastjson2.reader.ObjectReaderImplDate, com.alibaba.fastjson2.reader.ObjectReader
        public Object readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
            long epochMilli;
            ChronoZonedDateTime<LocalDate> zonedDateTime;
            if (jSONReader.isInt()) {
                long int64Value = jSONReader.readInt64Value();
                if (this.formatUnixTime) {
                    int64Value *= 1000;
                }
                return new Time(int64Value);
            }
            if (jSONReader.readIfNull()) {
                return null;
            }
            if (this.formatISO8601 || this.formatMillis) {
                return new Time(jSONReader.readMillisFromString());
            }
            if (this.formatUnixTime) {
                return new Time(jSONReader.readInt64().longValue() * 1000);
            }
            if (this.format != null) {
                DateTimeFormatter dateFormatter = getDateFormatter(jSONReader.getLocale());
                if (dateFormatter != null) {
                    String string = jSONReader.readString();
                    if (string.isEmpty()) {
                        return null;
                    }
                    zonedDateTime = (!this.formatHasHour ? LocalDateTime.of(LocalDate.parse(string, dateFormatter), LocalTime.MIN) : !this.formatHasDay ? LocalDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.parse(string, dateFormatter)) : LocalDateTime.parse(string, dateFormatter)).atZone(jSONReader.getContext().getZoneId());
                } else {
                    zonedDateTime = jSONReader.readZonedDateTime();
                }
                epochMilli = zonedDateTime.toInstant().toEpochMilli();
            } else {
                String string2 = jSONReader.readString();
                if ("0000-00-00".equals(string2) || "0000-00-00 00:00:00".equals(string2)) {
                    epochMilli = 0;
                } else {
                    if (string2.length() != 9 || string2.charAt(8) != 'Z') {
                        if (string2.isEmpty() || "null".equals(string2)) {
                            return null;
                        }
                        return Time.valueOf(string2);
                    }
                    epochMilli = LocalDateTime.of(DateUtils.LOCAL_DATE_19700101, DateUtils.parseLocalTime(string2.charAt(0), string2.charAt(1), string2.charAt(2), string2.charAt(3), string2.charAt(4), string2.charAt(5), string2.charAt(6), string2.charAt(7))).atZone(DateUtils.DEFAULT_ZONE_ID).toInstant().toEpochMilli();
                }
            }
            return new Time(epochMilli);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class TimeWriter extends DateTimeCodec implements ObjectWriter {
        public static final TimeWriter INSTANCE = new TimeWriter(null);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public TimeWriter(String str) {
            super(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: of */
        public static TimeWriter m1773of(String str) {
            return str == null ? INSTANCE : new TimeWriter(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.alibaba.fastjson2.writer.ObjectWriter
        public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
            String dateFormat;
            if (obj == null) {
                jSONWriter.writeNull();
                return;
            }
            JSONWriter.Context context = jSONWriter.context;
            if (this.formatUnixTime || context.isDateFormatUnixTime()) {
                jSONWriter.writeInt64(((java.util.Date) obj).getTime() / 1000);
                return;
            }
            if (this.formatMillis || context.isDateFormatMillis()) {
                jSONWriter.writeInt64(((java.util.Date) obj).getTime());
                return;
            }
            if (this.formatISO8601 || context.isDateFormatISO8601()) {
                ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant(Instant.ofEpochMilli(((java.util.Date) obj).getTime()), context.getZoneId());
                jSONWriter.writeDateTimeISO8601(zonedDateTimeOfInstant.getYear(), zonedDateTimeOfInstant.getMonthValue(), zonedDateTimeOfInstant.getDayOfMonth(), zonedDateTimeOfInstant.getHour(), zonedDateTimeOfInstant.getMinute(), zonedDateTimeOfInstant.getSecond(), 0, zonedDateTimeOfInstant.getOffset().getTotalSeconds(), true);
                return;
            }
            String str = this.format;
            DateTimeFormatter dateFormatter = (str == null || str.contains("dd")) ? null : getDateFormatter();
            if (dateFormatter == null && (dateFormat = context.getDateFormat()) != null && !dateFormat.contains("dd")) {
                dateFormatter = context.getDateFormatter();
            }
            if (dateFormatter == null) {
                jSONWriter.writeString(obj.toString());
            } else {
                jSONWriter.writeString(dateFormatter.format(ZonedDateTime.ofInstant(Instant.ofEpochMilli(((java.util.Date) obj).getTime()), context.getZoneId())));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class TimestampReader extends ObjectReaderImplDate {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public TimestampReader(String str, Locale locale) {
            super(str, locale);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Object createTimestamp(long j3, int i9) {
            Timestamp timestamp = new Timestamp(j3);
            if (i9 != 0) {
                timestamp.setNanos(i9);
            }
            return timestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.alibaba.fastjson2.reader.ObjectReaderImplDate, com.alibaba.fastjson2.reader.ObjectReader
        public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
            if (!jSONReader.isInt()) {
                if (jSONReader.readIfNull()) {
                    return null;
                }
                return readObject(jSONReader, type, obj, j3);
            }
            long int64Value = jSONReader.readInt64Value();
            if (this.formatUnixTime) {
                int64Value *= 1000;
            }
            return createTimestamp(int64Value, 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.alibaba.fastjson2.reader.ObjectReaderImplDate, com.alibaba.fastjson2.reader.ObjectReader
        public Object readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
            if (jSONReader.isInt()) {
                long int64Value = jSONReader.readInt64Value();
                if (this.formatUnixTime) {
                    int64Value *= 1000;
                }
                return createTimestamp(int64Value, 0);
            }
            if (jSONReader.nextIfNullOrEmptyString()) {
                return null;
            }
            if (this.format != null && !this.formatISO8601 && !this.formatMillis) {
                String string = jSONReader.readString();
                if (string.isEmpty()) {
                    return null;
                }
                DateTimeFormatter dateFormatter = getDateFormatter();
                Instant instant = !this.formatHasHour ? LocalDateTime.of(LocalDate.parse(string, dateFormatter), LocalTime.MIN).atZone(jSONReader.getContext().getZoneId()).toInstant() : LocalDateTime.parse(string, dateFormatter).atZone(jSONReader.getContext().getZoneId()).toInstant();
                return createTimestamp(instant.toEpochMilli(), instant.getNano());
            }
            LocalDateTime localDateTime = jSONReader.readLocalDateTime();
            if (localDateTime != null) {
                return Timestamp.valueOf(localDateTime);
            }
            if (jSONReader.wasNull()) {
                return null;
            }
            long millisFromString = jSONReader.readMillisFromString();
            if (millisFromString == 0 && jSONReader.wasNull()) {
                return null;
            }
            return new Timestamp(millisFromString);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class TimestampWriter extends DateTimeCodec implements ObjectWriter {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public TimestampWriter(String str) {
            super(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: com.alibaba.fastjson2.JSONWriter */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v8, types: [java.time.LocalDateTime] */
        @Override // com.alibaba.fastjson2.writer.ObjectWriter
        public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
            if (obj == null) {
                jSONWriter.writeNull();
                return;
            }
            JSONWriter.Context context = jSONWriter.context;
            Timestamp timestamp = (Timestamp) obj;
            if (this.formatUnixTime || context.isDateFormatUnixTime()) {
                jSONWriter.writeInt64(timestamp.getTime() / 1000);
                return;
            }
            ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant(timestamp.toInstant(), context.getZoneId());
            int totalSeconds = zonedDateTimeOfInstant.getOffset().getTotalSeconds();
            if ((this.formatISO8601 || context.isDateFormatISO8601()) && zonedDateTimeOfInstant.getNano() % 1000000 == 0) {
                jSONWriter.writeDateTimeISO8601(zonedDateTimeOfInstant.getYear(), zonedDateTimeOfInstant.getMonthValue(), zonedDateTimeOfInstant.getDayOfMonth(), zonedDateTimeOfInstant.getHour(), zonedDateTimeOfInstant.getMinute(), zonedDateTimeOfInstant.getSecond(), zonedDateTimeOfInstant.getNano() / 1000000, totalSeconds, true);
                return;
            }
            DateTimeFormatter dateFormatter = getDateFormatter();
            if (dateFormatter == null) {
                dateFormatter = context.getDateFormatter();
            }
            if (dateFormatter != null) {
                jSONWriter.writeString(dateFormatter.format(zonedDateTimeOfInstant));
                return;
            }
            if (this.formatMillis || context.isDateFormatMillis()) {
                jSONWriter.writeInt64(timestamp.getTime());
                return;
            }
            int nanos = timestamp.getNanos();
            int year = zonedDateTimeOfInstant.getYear();
            int monthValue = zonedDateTimeOfInstant.getMonthValue();
            int dayOfMonth = zonedDateTimeOfInstant.getDayOfMonth();
            int hour = zonedDateTimeOfInstant.getHour();
            int minute = zonedDateTimeOfInstant.getMinute();
            int second = zonedDateTimeOfInstant.getSecond();
            if (nanos % 1000000 == 0) {
                jSONWriter.writeDateTimeISO8601(year, monthValue, dayOfMonth, hour, minute, second, nanos / 1000000, totalSeconds, false);
            } else {
                jSONWriter.writeLocalDateTime(zonedDateTimeOfInstant.toLocalDateTime());
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.alibaba.fastjson2.writer.ObjectWriter
        public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
            if (obj == null) {
                jSONWriter.writeNull();
                return;
            }
            if (this.format != null) {
                write(jSONWriter, obj, obj2, type, j3);
                return;
            }
            Timestamp timestamp = (Timestamp) obj;
            long time = timestamp.getTime();
            int nanos = timestamp.getNanos();
            timestamp.toLocalDateTime();
            jSONWriter.writeInstant(time / 1000, nanos);
        }
    }
}
