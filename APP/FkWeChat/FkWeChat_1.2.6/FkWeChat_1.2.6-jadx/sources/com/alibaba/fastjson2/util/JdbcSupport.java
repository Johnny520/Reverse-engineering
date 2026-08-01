package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.C1565a;
import com.alibaba.fastjson2.C1569c;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.codec.DateTimeCodec;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.reader.ObjectReaderImplDate;
import com.alibaba.fastjson2.writer.ObjectWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.sql.Clob;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Struct;
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

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class JdbcSupport {
    static Class CLASS_CLOB;
    static volatile boolean CLASS_CLOB_ERROR;
    static Class CLASS_STRUCT;
    static volatile boolean CLASS_STRUCT_ERROR;
    static Constructor CONSTRUCTOR_DATE;
    static volatile boolean CONSTRUCTOR_DATE_ERROR;
    static Constructor CONSTRUCTOR_TIME;
    static Constructor CONSTRUCTOR_TIMESTAMP;
    static volatile boolean CONSTRUCTOR_TIMESTAMP_ERROR;
    static volatile boolean CONSTRUCTOR_TIME_ERROR;

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class ClobWriter implements ObjectWriter {
        final Class objectClass;

        public ClobWriter(Class cls) {
            if (JdbcSupport.CLASS_CLOB == null && !JdbcSupport.CLASS_CLOB_ERROR) {
                try {
                    JdbcSupport.CLASS_CLOB = Clob.class;
                } catch (Throwable unused) {
                    JdbcSupport.CLASS_CLOB_ERROR = true;
                }
            }
            if (JdbcSupport.CLASS_CLOB != null) {
                this.objectClass = cls;
            } else {
                C1569c.m6258a("class java.sql.Clob not found");
                throw null;
            }
        }

        @Override // com.alibaba.fastjson2.writer.ObjectWriter
        public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
            try {
                jSONWriter.writeString(((Clob) obj).getCharacterStream());
            } catch (SQLException e10) {
                C1565a.m6255a("Clob.getCharacterStream error", e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class DateReader extends ObjectReaderImplDate {
        public DateReader(String str, Locale locale) {
            super(str, locale);
        }

        @Override // com.alibaba.fastjson2.reader.ObjectReaderImplDate, com.alibaba.fastjson2.reader.ObjectReader
        public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
            return readObject(jSONReader, type, obj, j10);
        }

        @Override // com.alibaba.fastjson2.reader.ObjectReaderImplDate, com.alibaba.fastjson2.reader.ObjectReader
        public Object readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
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

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class TimeReader extends ObjectReaderImplDate {
        public TimeReader(String str, Locale locale) {
            super(str, locale);
        }

        @Override // com.alibaba.fastjson2.reader.ObjectReaderImplDate, com.alibaba.fastjson2.reader.ObjectReader
        public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
            return readObject(jSONReader, type, obj, j10);
        }

        @Override // com.alibaba.fastjson2.reader.ObjectReaderImplDate, com.alibaba.fastjson2.reader.ObjectReader
        public Object readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
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

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class TimeWriter extends DateTimeCodec implements ObjectWriter {
        public static final TimeWriter INSTANCE = new TimeWriter(null);

        public TimeWriter(String str) {
            super(str);
        }

        @Override // com.alibaba.fastjson2.writer.ObjectWriter
        public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
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

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class TimestampReader extends ObjectReaderImplDate {
        public TimestampReader(String str, Locale locale) {
            super(str, locale);
        }

        public Object createTimestamp(long j10, int i10) {
            Timestamp timestamp = new Timestamp(j10);
            if (i10 != 0) {
                timestamp.setNanos(i10);
            }
            return timestamp;
        }

        @Override // com.alibaba.fastjson2.reader.ObjectReaderImplDate, com.alibaba.fastjson2.reader.ObjectReader
        public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
            if (jSONReader.isInt()) {
                long int64Value = jSONReader.readInt64Value();
                if (this.formatUnixTime) {
                    int64Value *= 1000;
                }
                return createTimestamp(int64Value, 0);
            }
            if (jSONReader.readIfNull()) {
                return null;
            }
            if (jSONReader.getType() != -88) {
                return readObject(jSONReader, type, obj, j10);
            }
            Instant instant = jSONReader.readLocalDateTime().atZone(jSONReader.getContext().getZoneId()).toInstant();
            return createTimestamp(instant.toEpochMilli(), instant.getNano());
        }

        @Override // com.alibaba.fastjson2.reader.ObjectReaderImplDate, com.alibaba.fastjson2.reader.ObjectReader
        public Object readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
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

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class TimestampWriter extends DateTimeCodec implements ObjectWriter {
        public TimestampWriter(String str) {
            super(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v8, types: [java.time.LocalDateTime] */
        @Override // com.alibaba.fastjson2.writer.ObjectWriter
        public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
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

        @Override // com.alibaba.fastjson2.writer.ObjectWriter
        public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
            if (obj == null) {
                jSONWriter.writeNull();
                return;
            }
            Timestamp timestamp = (Timestamp) obj;
            if (this.format != null) {
                write(jSONWriter, obj, obj2, type, j10);
            } else {
                jSONWriter.writeLocalDateTime(timestamp.toLocalDateTime());
            }
        }
    }

    public static ObjectWriter createClobWriter(Class cls) {
        return new ClobWriter(cls);
    }

    public static Object createDate(long j10) {
        if (CONSTRUCTOR_DATE == null && !CONSTRUCTOR_DATE_ERROR) {
            try {
                CONSTRUCTOR_DATE = Class.forName("java.sql.Date").getConstructor(Long.TYPE);
            } catch (Throwable unused) {
                CONSTRUCTOR_DATE_ERROR = true;
            }
        }
        Constructor constructor = CONSTRUCTOR_DATE;
        if (constructor == null) {
            C1569c.m6258a("class java.sql.Date not found");
            return null;
        }
        try {
            return constructor.newInstance(Long.valueOf(j10));
        } catch (Exception e10) {
            C1565a.m6255a("create java.sql.Date error", e10);
            return null;
        }
    }

    public static ObjectReader createDateReader(Class cls, String str, Locale locale) {
        return new DateReader(str, locale);
    }

    public static Object createTime(long j10) {
        if (CONSTRUCTOR_TIME == null && !CONSTRUCTOR_TIME_ERROR) {
            try {
                CONSTRUCTOR_TIME = Class.forName("java.sql.Time").getConstructor(Long.TYPE);
            } catch (Throwable unused) {
                CONSTRUCTOR_TIME_ERROR = true;
            }
        }
        Constructor constructor = CONSTRUCTOR_TIME;
        if (constructor == null) {
            C1569c.m6258a("class java.sql.Time not found");
            return null;
        }
        try {
            return constructor.newInstance(Long.valueOf(j10));
        } catch (Exception e10) {
            C1565a.m6255a("create java.sql.Time error", e10);
            return null;
        }
    }

    public static ObjectReader createTimeReader(Class cls, String str, Locale locale) {
        return new TimeReader(str, locale);
    }

    public static ObjectWriter createTimeWriter(String str) {
        return str == null ? TimeWriter.INSTANCE : new TimeWriter(str);
    }

    public static Object createTimestamp(long j10) {
        if (CONSTRUCTOR_TIMESTAMP == null && !CONSTRUCTOR_TIMESTAMP_ERROR) {
            try {
                CONSTRUCTOR_TIMESTAMP = Class.forName("java.sql.Timestamp").getConstructor(Long.TYPE);
            } catch (Throwable unused) {
                CONSTRUCTOR_TIMESTAMP_ERROR = true;
            }
        }
        Constructor constructor = CONSTRUCTOR_TIMESTAMP;
        if (constructor == null) {
            C1569c.m6258a("class java.sql.Timestamp not found");
            return null;
        }
        try {
            return constructor.newInstance(Long.valueOf(j10));
        } catch (Exception e10) {
            C1565a.m6255a("create java.sql.Timestamp error", e10);
            return null;
        }
    }

    public static ObjectReader createTimestampReader(Class cls, String str, Locale locale) {
        return new TimestampReader(str, locale);
    }

    public static ObjectWriter createTimestampWriter(Class cls, String str) {
        return new TimestampWriter(str);
    }

    public static boolean isClob(Class cls) {
        if (CLASS_CLOB == null && !CLASS_CLOB_ERROR) {
            try {
                CLASS_CLOB = Clob.class;
            } catch (Throwable unused) {
                CLASS_CLOB_ERROR = true;
            }
        }
        Class cls2 = CLASS_CLOB;
        return cls2 != null && cls2.isAssignableFrom(cls);
    }

    public static boolean isStruct(Class cls) {
        if (CLASS_STRUCT == null && !CLASS_STRUCT_ERROR) {
            try {
                CLASS_STRUCT = Struct.class;
            } catch (Throwable unused) {
                CLASS_STRUCT_ERROR = true;
            }
        }
        Class cls2 = CLASS_STRUCT;
        return cls2 != null && cls2.isAssignableFrom(cls);
    }
}
