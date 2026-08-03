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
final class ObjectWriterImplLocalTime extends DateTimeCodec implements ObjectWriter {
    static final ObjectWriterImplLocalTime INSTANCE = new ObjectWriterImplLocalTime(null, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriterImplLocalTime(String str, Locale locale) {
        super(str, locale);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        JSONWriter.Context context = jSONWriter.context;
        LocalTime localTime = (LocalTime) obj;
        if (this.formatMillis || (this.format == null && context.isDateFormatMillis())) {
            jSONWriter.writeInt64(LocalDateTime.of(LocalDate.of(1970, 1, 1), localTime).atZone(context.getZoneId()).toInstant().toEpochMilli());
            return;
        }
        if (this.formatUnixTime || (this.format == null && context.isDateFormatUnixTime())) {
            jSONWriter.writeInt32((int) (LocalDateTime.of(LocalDate.of(1970, 1, 1), localTime).atZone(context.getZoneId()).toInstant().toEpochMilli() / 1000));
            return;
        }
        DateTimeFormatter dateFormatter = getDateFormatter();
        if (dateFormatter == null) {
            dateFormatter = context.getDateFormatter();
        }
        if (dateFormatter != null) {
            jSONWriter.writeString((this.formatHasDay || context.isDateFormatHasDay()) ? dateFormatter.format(LocalDateTime.of(LocalDate.of(1970, 1, 1), localTime)) : dateFormatter.format(localTime));
            return;
        }
        int hour = localTime.getHour();
        int minute = localTime.getMinute();
        int second = localTime.getSecond();
        if (localTime.getNano() == 0) {
            jSONWriter.writeTimeHHMMSS8(hour, minute, second);
        } else {
            jSONWriter.writeLocalTime(localTime);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        jSONWriter.writeLocalTime((LocalTime) obj);
    }
}
