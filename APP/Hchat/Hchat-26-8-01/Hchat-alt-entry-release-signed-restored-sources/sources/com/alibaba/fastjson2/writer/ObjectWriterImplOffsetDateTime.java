package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.codec.DateTimeCodec;
import java.lang.reflect.Type;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplOffsetDateTime extends DateTimeCodec implements ObjectWriter {
    static final ObjectWriterImplOffsetDateTime INSTANCE = new ObjectWriterImplOffsetDateTime(null, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private ObjectWriterImplOffsetDateTime(String str, Locale locale) {
        super(str, locale);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: of */
    public static ObjectWriterImplOffsetDateTime m1787of(String str, Locale locale) {
        return str == null ? INSTANCE : new ObjectWriterImplOffsetDateTime(str, locale);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        JSONWriter.Context context = jSONWriter.context;
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        if (this.formatUnixTime || (this.format == null && context.isDateFormatUnixTime())) {
            jSONWriter.writeInt64(offsetDateTime.toInstant().toEpochMilli() / 1000);
            return;
        }
        if (this.formatMillis || (this.format == null && context.isDateFormatMillis())) {
            jSONWriter.writeInt64(offsetDateTime.toInstant().toEpochMilli());
            return;
        }
        int year = offsetDateTime.getYear();
        if (year >= 0 && year <= 9999) {
            if (this.formatISO8601 || context.isDateFormatISO8601()) {
                jSONWriter.writeDateTimeISO8601(year, offsetDateTime.getMonthValue(), offsetDateTime.getDayOfMonth(), offsetDateTime.getHour(), offsetDateTime.getMinute(), offsetDateTime.getSecond(), offsetDateTime.getNano() / 1000000, offsetDateTime.getOffset().getTotalSeconds(), true);
                return;
            } else if (this.yyyyMMddhhmmss19) {
                jSONWriter.writeDateTime19(year, offsetDateTime.getMonthValue(), offsetDateTime.getDayOfMonth(), offsetDateTime.getHour(), offsetDateTime.getMinute(), offsetDateTime.getSecond());
                return;
            } else if (this.yyyyMMddhhmmss14) {
                jSONWriter.writeDateTime14(year, offsetDateTime.getMonthValue(), offsetDateTime.getDayOfMonth(), offsetDateTime.getHour(), offsetDateTime.getMinute(), offsetDateTime.getSecond());
                return;
            }
        }
        DateTimeFormatter dateFormatter = getDateFormatter();
        if (dateFormatter == null) {
            dateFormatter = context.getDateFormatter();
        }
        if (dateFormatter == null) {
            jSONWriter.writeOffsetDateTime(offsetDateTime);
        } else {
            jSONWriter.writeString(dateFormatter.format(offsetDateTime));
        }
    }
}
