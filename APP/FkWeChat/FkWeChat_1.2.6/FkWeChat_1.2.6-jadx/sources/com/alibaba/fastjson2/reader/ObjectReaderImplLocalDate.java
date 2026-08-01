package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.codec.DateTimeCodec;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplLocalDate extends DateTimeCodec implements ObjectReader {
    static final ObjectReaderImplLocalDate INSTANCE = new ObjectReaderImplLocalDate(null, null);

    public ObjectReaderImplLocalDate(String str, Locale locale) {
        super(str, locale);
    }

    /* JADX INFO: renamed from: of */
    public static ObjectReaderImplLocalDate m6386of(String str, Locale locale) {
        return str == null ? INSTANCE : new ObjectReaderImplLocalDate(str, locale);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Class getObjectClass() {
        return LocalDate.class;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        return jSONReader.readLocalDate();
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.jsonb) {
            return readJSONBObject(jSONReader, type, obj, j10);
        }
        JSONReader.Context context = jSONReader.getContext();
        if (jSONReader.readIfNull()) {
            return null;
        }
        if (this.format == null || this.yyyyMMddhhmmss19 || this.formatISO8601 || jSONReader.isNumber()) {
            return jSONReader.readLocalDate();
        }
        String string = jSONReader.readString();
        if (string.isEmpty() || "null".equals(string)) {
            return null;
        }
        if (!this.formatMillis && !this.formatUnixTime) {
            DateTimeFormatter dateFormatter = getDateFormatter(context.getLocale());
            return !this.formatHasHour ? LocalDate.parse(string, dateFormatter) : !this.formatHasDay ? LocalDate.of(1970, 1, 1) : LocalDateTime.parse(string, dateFormatter).toLocalDate();
        }
        long j11 = Long.parseLong(string);
        if (this.formatUnixTime) {
            j11 *= 1000;
        }
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(j11), context.getZoneId()).toLocalDate();
    }
}
