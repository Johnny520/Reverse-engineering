package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.codec.DateTimeCodec;
import java.lang.reflect.Type;
import java.time.OffsetTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplOffsetTime extends DateTimeCodec implements ObjectWriter {
    static final ObjectWriterImplOffsetTime INSTANCE = new ObjectWriterImplOffsetTime(null, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriterImplOffsetTime(String str, Locale locale) {
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
        OffsetTime offsetTime = (OffsetTime) obj;
        DateTimeFormatter dateFormatter = getDateFormatter();
        if (dateFormatter == null) {
            dateFormatter = context.getDateFormatter();
        }
        if (dateFormatter == null) {
            jSONWriter.writeOffsetTime(offsetTime);
        } else {
            jSONWriter.writeString(dateFormatter.format(offsetTime));
        }
    }
}
