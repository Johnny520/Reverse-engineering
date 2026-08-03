package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.codec.DateTimeCodec;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplLocalDate extends DateTimeCodec implements ObjectReader {
    static final ObjectReaderImplLocalDate INSTANCE = new ObjectReaderImplLocalDate(null, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderImplLocalDate(String str, Locale locale) {
        super(str, locale);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: of */
    public static ObjectReaderImplLocalDate m1729of(String str, Locale locale) {
        return str == null ? INSTANCE : new ObjectReaderImplLocalDate(str, locale);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Class getObjectClass() {
        return LocalDate.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        return jSONReader.readLocalDate();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (jSONReader.jsonb) {
            return readJSONBObject(jSONReader, type, obj, j3);
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
        long j4 = Long.parseLong(string);
        if (this.formatUnixTime) {
            j4 *= 1000;
        }
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(j4), context.getZoneId()).toLocalDate();
    }
}
