package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.codec.DateTimeCodec;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplLocalDate extends DateTimeCodec implements ObjectWriter {
    static final ObjectWriterImplLocalDate INSTANCE = new ObjectWriterImplLocalDate(null, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private ObjectWriterImplLocalDate(String str, Locale locale) {
        super(str, locale);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: of */
    public static ObjectWriterImplLocalDate m1781of(String str, Locale locale) {
        return str == null ? INSTANCE : new ObjectWriterImplLocalDate(str, locale);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        JSONWriter.Context context = jSONWriter.context;
        LocalDate localDate = (LocalDate) obj;
        if (this.formatUnixTime || (this.format == null && context.isDateFormatUnixTime())) {
            jSONWriter.writeInt64(LocalDateTime.of(localDate, LocalTime.MIN).atZone(context.getZoneId()).toInstant().toEpochMilli() / 1000);
            return;
        }
        if (this.formatMillis || (this.format == null && context.isDateFormatMillis())) {
            jSONWriter.writeInt64(LocalDateTime.of(localDate, LocalTime.MIN).atZone(context.getZoneId()).toInstant().toEpochMilli());
            return;
        }
        if (this.yyyyMMdd8) {
            jSONWriter.writeDateYYYMMDD8(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
            return;
        }
        if (this.yyyyMMdd10) {
            jSONWriter.writeDateYYYMMDD10(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
            return;
        }
        if (this.yyyyMMddhhmmss19) {
            jSONWriter.writeDateTime19(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), 0, 0, 0);
            return;
        }
        DateTimeFormatter dateFormatter = getDateFormatter();
        if (dateFormatter == null) {
            dateFormatter = context.getDateFormatter();
        }
        if (dateFormatter == null) {
            jSONWriter.writeDateYYYMMDD10(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        } else {
            jSONWriter.writeString((this.formatHasHour || context.isDateFormatHasHour()) ? dateFormatter.format(LocalDateTime.of(localDate, LocalTime.MIN)) : dateFormatter.format(localDate));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        jSONWriter.writeLocalDate((LocalDate) obj);
    }
}
