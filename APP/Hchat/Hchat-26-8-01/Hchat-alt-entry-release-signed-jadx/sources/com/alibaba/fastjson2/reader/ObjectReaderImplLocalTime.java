package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.codec.DateTimeCodec;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplLocalTime extends DateTimeCodec implements ObjectReader {
    static final ObjectReaderImplLocalTime INSTANCE = new ObjectReaderImplLocalTime(null, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderImplLocalTime(String str, Locale locale) {
        super(str, locale);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Class getObjectClass() {
        return LocalTime.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        return jSONReader.readLocalTime();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        JSONReader.Context context = jSONReader.getContext();
        if (jSONReader.readIfNull()) {
            return null;
        }
        if (jSONReader.isInt()) {
            long int64Value = jSONReader.readInt64Value();
            if (this.formatUnixTime) {
                int64Value *= 1000;
            }
            return LocalDateTime.ofInstant(Instant.ofEpochMilli(int64Value), context.getZoneId()).toLocalTime();
        }
        if (this.format == null || jSONReader.isNumber()) {
            return jSONReader.readLocalTime();
        }
        if (this.yyyyMMddhhmmss19 || this.formatISO8601) {
            return jSONReader.readLocalDateTime().toLocalTime();
        }
        String string = jSONReader.readString();
        if (string.isEmpty()) {
            return null;
        }
        if (!this.formatMillis && !this.formatUnixTime) {
            DateTimeFormatter dateFormatter = getDateFormatter(context.getLocale());
            return this.formatHasDay ? LocalDateTime.parse(string, dateFormatter).toLocalTime() : LocalTime.parse(string, dateFormatter);
        }
        long j4 = Long.parseLong(string);
        if (this.formatUnixTime) {
            j4 *= 1000;
        }
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(j4), context.getZoneId()).toLocalTime();
    }
}
