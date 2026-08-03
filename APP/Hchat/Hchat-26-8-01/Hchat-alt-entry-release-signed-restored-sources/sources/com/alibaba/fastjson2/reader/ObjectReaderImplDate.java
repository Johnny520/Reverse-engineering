package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.codec.DateTimeCodec;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.Locale;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderImplDate extends DateTimeCodec implements ObjectReader {
    public static final ObjectReaderImplDate INSTANCE = new ObjectReaderImplDate(null, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderImplDate(String str, Locale locale) {
        super(str, locale);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: of */
    public static ObjectReaderImplDate m1711of(String str, Locale locale) {
        return str == null ? INSTANCE : new ObjectReaderImplDate(str, locale);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r14v20, resolved type: java.time.ZonedDateTime */
    /* JADX DEBUG: Multi-variable search result rejected for r14v32, resolved type: java.time.ZonedDateTime */
    /* JADX DEBUG: Multi-variable search result rejected for r14v33, resolved type: java.time.ZonedDateTime */
    /* JADX DEBUG: Multi-variable search result rejected for r14v34, resolved type: java.time.ZonedDateTime */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Object readDate(JSONReader jSONReader) {
        long int64Value;
        JSONReader jSONReader2;
        long millisFromString;
        LocalDateTime localDateTimeOf;
        ZonedDateTime zonedDateTime;
        long j3;
        int i9;
        if (jSONReader.isInt()) {
            long int64Value2 = jSONReader.readInt64Value();
            if (this.formatUnixTime) {
                int64Value2 *= 1000;
            }
            return new Date(int64Value2);
        }
        if (jSONReader.readIfNull() || jSONReader.nextIfNullOrEmptyString()) {
            return null;
        }
        if (jSONReader.current() == 'n') {
            return jSONReader.readNullOrNewDate();
        }
        if (this.useSimpleFormatter || this.locale != null) {
            String string = jSONReader.readString();
            try {
                return (this.locale != null ? new SimpleDateFormat(this.format, this.locale) : new SimpleDateFormat(this.format)).parse(string);
            } catch (ParseException e6) {
                C0086a.m465x(jSONReader.info("parse error : " + string), e6);
                return null;
            }
        }
        if ((this.formatUnixTime || this.formatMillis) && jSONReader.isString()) {
            int64Value = jSONReader.readInt64Value();
            if (this.formatUnixTime) {
                int64Value *= 1000;
            }
        } else if (this.format != null) {
            if (this.yyyyMMddhhmmss19) {
                long millisFromString2 = jSONReader.isSupportSmartMatch() ? jSONReader.readMillisFromString() : jSONReader.readMillis19();
                if (millisFromString2 != 0 || !jSONReader.wasNull()) {
                    return new Date(millisFromString2);
                }
                zonedDateTime = jSONReader.readZonedDateTime();
            } else {
                DateTimeFormatter dateFormatter = getDateFormatter(jSONReader.getLocale());
                if (dateFormatter != null) {
                    String string2 = jSONReader.readString();
                    if (string2.isEmpty() || "null".equals(string2)) {
                        return null;
                    }
                    if (this.format.indexOf(45) != -1 && string2.indexOf(45) == -1 && TypeUtils.isInteger(string2)) {
                        return new Date(Long.parseLong(string2));
                    }
                    if (this.formatHasHour) {
                        if (string2.length() == 19 && (this.yyyyMMddhhmm16 || jSONReader.isEnabled(JSONReader.Feature.SupportSmartMatch) || "yyyy-MM-dd hh:mm:ss".equals(this.format))) {
                            localDateTimeOf = DateUtils.parseLocalDateTime(string2, 0, this.yyyyMMddhhmm16 ? 16 : 19);
                        } else {
                            localDateTimeOf = this.formatHasDay ? LocalDateTime.parse(string2, dateFormatter) : LocalDateTime.of(LocalDate.MIN, LocalTime.parse(string2, dateFormatter));
                        }
                    } else if (!this.formatHasDay) {
                        TemporalAccessor temporalAccessor = dateFormatter.parse(string2);
                        localDateTimeOf = LocalDateTime.of(LocalDate.of(temporalAccessor.get(ChronoField.YEAR), temporalAccessor.get(ChronoField.MONTH_OF_YEAR), 1), LocalTime.MIN);
                    } else if (string2.length() == 19 && jSONReader.isEnabled(JSONReader.Feature.SupportSmartMatch)) {
                        localDateTimeOf = DateUtils.parseLocalDateTime(string2, 0, string2.length());
                    } else {
                        localDateTimeOf = LocalDateTime.of((!this.yyyyMMdd10 || string2.length() <= 10) ? LocalDate.parse(string2, dateFormatter) : LocalDate.parse(string2.substring(0, 10), dateFormatter), LocalTime.MIN);
                    }
                    zonedDateTime = localDateTimeOf.atZone(jSONReader.getContext().getZoneId());
                } else {
                    zonedDateTime = jSONReader.readZonedDateTime();
                }
            }
            if (zonedDateTime == 0) {
                return null;
            }
            long epochSecond = zonedDateTime.toEpochSecond();
            int nano = zonedDateTime.toLocalTime().getNano();
            if (epochSecond >= 0 || nano <= 0) {
                j3 = epochSecond * 1000;
                i9 = nano / 1000000;
            } else {
                j3 = (epochSecond + 1) * 1000;
                i9 = (nano / 1000000) - 1000;
            }
            int64Value = j3 + ((long) i9);
        } else {
            if (jSONReader.isDate()) {
                return jSONReader.readDate();
            }
            if (jSONReader.isTypeRedirect()) {
                jSONReader2 = jSONReader;
                if (jSONReader2.nextIfMatchIdent('\"', 'v', 'a', 'l', '\"')) {
                    jSONReader2.nextIfMatch(':');
                    millisFromString = jSONReader2.readInt64Value();
                    jSONReader2.nextIfObjectEnd();
                    jSONReader2.setTypeRedirect(false);
                }
                if (millisFromString != 0 && jSONReader2.wasNull()) {
                    return null;
                }
                int64Value = !this.formatUnixTime ? millisFromString * 1000 : millisFromString;
            } else {
                jSONReader2 = jSONReader;
            }
            millisFromString = jSONReader2.readMillisFromString();
            if (millisFromString != 0) {
            }
            if (!this.formatUnixTime) {
            }
        }
        return new Date(int64Value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Class getObjectClass() {
        return Date.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        return readDate(jSONReader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        return readDate(jSONReader);
    }
}
