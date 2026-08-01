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
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplZonedDateTime extends DateTimeCodec implements ObjectReader {
    static final ObjectReaderImplZonedDateTime INSTANCE = new ObjectReaderImplZonedDateTime(null, null);
    private Function builder;

    public ObjectReaderImplZonedDateTime(Function function) {
        super(null, null);
        this.builder = function;
    }

    /* JADX INFO: renamed from: of */
    public static ObjectReaderImplZonedDateTime m6399of(String str, Locale locale) {
        return str == null ? INSTANCE : new ObjectReaderImplZonedDateTime(str, locale);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Class getObjectClass() {
        return ZonedDateTime.class;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        ZonedDateTime zonedDateTime = jSONReader.readZonedDateTime();
        Function function = this.builder;
        return (function == null || zonedDateTime == null) ? zonedDateTime : function.apply(zonedDateTime);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        ZonedDateTime zonedDateTime;
        JSONReader.Context context = jSONReader.getContext();
        if (jSONReader.isInt()) {
            long int64Value = jSONReader.readInt64Value();
            if (this.formatUnixTime) {
                int64Value *= 1000;
            }
            zonedDateTime = ZonedDateTime.ofInstant(Instant.ofEpochMilli(int64Value), context.getZoneId());
        } else if (jSONReader.readIfNull()) {
            zonedDateTime = null;
        } else if (this.format == null || this.yyyyMMddhhmmss19 || this.formatISO8601) {
            zonedDateTime = jSONReader.readZonedDateTime();
        } else {
            String string = jSONReader.readString();
            if (this.formatMillis || this.formatUnixTime) {
                long j11 = Long.parseLong(string);
                if (this.formatUnixTime) {
                    j11 *= 1000;
                }
                zonedDateTime = ZonedDateTime.ofInstant(Instant.ofEpochMilli(j11), context.getZoneId());
            } else {
                DateTimeFormatter dateFormatter = getDateFormatter(jSONReader.getLocale());
                zonedDateTime = !this.formatHasHour ? ZonedDateTime.of(LocalDate.parse(string, dateFormatter), LocalTime.MIN, context.getZoneId()) : !this.formatHasDay ? ZonedDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.parse(string, dateFormatter), context.getZoneId()) : ZonedDateTime.of(LocalDateTime.parse(string, dateFormatter), context.getZoneId());
            }
        }
        Function function = this.builder;
        return (function == null || zonedDateTime == null) ? zonedDateTime : function.apply(zonedDateTime);
    }

    public ObjectReaderImplZonedDateTime(String str, Locale locale) {
        super(str, locale);
    }
}
