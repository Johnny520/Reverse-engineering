package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.codec.DateTimeCodec;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Map;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderImplInstant extends DateTimeCodec implements ObjectReader {
    public static final ObjectReaderImplInstant INSTANCE = new ObjectReaderImplInstant(null, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderImplInstant(String str, Locale locale) {
        super(str, locale);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: of */
    public static ObjectReaderImplInstant m1713of(String str, Locale locale) {
        return str == null ? INSTANCE : new ObjectReaderImplInstant(str, locale);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Map map, long j3) {
        Number number = (Number) map.get("nano");
        Number number2 = (Number) map.get("epochSecond");
        if (number != null && number2 != null) {
            return Instant.ofEpochSecond(number2.longValue(), number.longValue());
        }
        if (number2 != null) {
            return Instant.ofEpochSecond(number2.longValue());
        }
        Number number3 = (Number) map.get("epochMilli");
        if (number3 != null) {
            return Instant.ofEpochMilli(number3.longValue());
        }
        C0086a.m464w("can not create instant.");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Class getObjectClass() {
        return Instant.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        return jSONReader.readInstant();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        JSONReader.Context context = jSONReader.getContext();
        if (jSONReader.isInt() && context.getDateFormat() == null) {
            long int64Value = jSONReader.readInt64Value();
            if (this.formatUnixTime) {
                int64Value *= 1000;
            }
            return Instant.ofEpochMilli(int64Value);
        }
        if (jSONReader.readIfNull()) {
            return null;
        }
        if (this.format == null || this.yyyyMMddhhmmss19 || this.formatISO8601 || jSONReader.isObject()) {
            return jSONReader.readInstant();
        }
        String string = jSONReader.readString();
        if (string.isEmpty()) {
            return null;
        }
        if (!this.formatMillis && !this.formatUnixTime) {
            DateTimeFormatter dateFormatter = getDateFormatter(jSONReader.getLocale());
            return !this.formatHasHour ? ZonedDateTime.of(LocalDate.parse(string, dateFormatter), LocalTime.MIN, context.getZoneId()).toInstant() : !this.formatHasDay ? ZonedDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.parse(string, dateFormatter), context.getZoneId()).toInstant() : ZonedDateTime.of(LocalDateTime.parse(string, dateFormatter), context.getZoneId()).toInstant();
        }
        long j4 = Long.parseLong(string);
        if (this.formatUnixTime) {
            j4 *= 1000;
        }
        return Instant.ofEpochMilli(j4);
    }
}
