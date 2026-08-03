package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.codec.DateTimeCodec;
import java.lang.reflect.Type;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplZonedDateTime extends DateTimeCodec implements ObjectWriter {
    static final ObjectWriterImplZonedDateTime INSTANCE = new ObjectWriterImplZonedDateTime(null, null);
    private final Function function;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriterImplZonedDateTime(String str, Locale locale, Function function) {
        super(str, locale);
        this.function = function;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        Function function = this.function;
        ZonedDateTime zonedDateTime = function != null ? (ZonedDateTime) function.apply(obj) : (ZonedDateTime) obj;
        JSONWriter.Context context = jSONWriter.context;
        if (this.formatUnixTime || (this.format == null && context.isDateFormatUnixTime())) {
            jSONWriter.writeInt64(zonedDateTime.toInstant().toEpochMilli() / 1000);
            return;
        }
        if (this.formatMillis || (this.format == null && context.isDateFormatMillis())) {
            jSONWriter.writeInt64(zonedDateTime.toInstant().toEpochMilli());
            return;
        }
        int year = zonedDateTime.getYear();
        if (year >= 0 && year <= 9999) {
            if (this.formatISO8601 || context.isDateFormatISO8601()) {
                jSONWriter.writeDateTimeISO8601(year, zonedDateTime.getMonthValue(), zonedDateTime.getDayOfMonth(), zonedDateTime.getHour(), zonedDateTime.getMinute(), zonedDateTime.getSecond(), zonedDateTime.getNano() / 1000000, zonedDateTime.getOffset().getTotalSeconds(), true);
                return;
            } else if (this.yyyyMMddhhmmss19) {
                jSONWriter.writeDateTime19(year, zonedDateTime.getMonthValue(), zonedDateTime.getDayOfMonth(), zonedDateTime.getHour(), zonedDateTime.getMinute(), zonedDateTime.getSecond());
                return;
            } else if (this.yyyyMMddhhmmss14) {
                jSONWriter.writeDateTime14(year, zonedDateTime.getMonthValue(), zonedDateTime.getDayOfMonth(), zonedDateTime.getHour(), zonedDateTime.getMinute(), zonedDateTime.getSecond());
                return;
            }
        }
        DateTimeFormatter dateFormatter = getDateFormatter();
        if (dateFormatter == null) {
            dateFormatter = context.getDateFormatter();
        }
        if (dateFormatter == null) {
            jSONWriter.writeZonedDateTime(zonedDateTime);
        } else {
            jSONWriter.writeString(dateFormatter.format(zonedDateTime));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        jSONWriter.writeZonedDateTime((ZonedDateTime) obj);
    }

    public ObjectWriterImplZonedDateTime(String str, Locale locale) {
        this(str, locale, null);
    }
}
