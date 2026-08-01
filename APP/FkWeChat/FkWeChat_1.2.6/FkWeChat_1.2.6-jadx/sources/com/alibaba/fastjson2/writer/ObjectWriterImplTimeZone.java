package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplTimeZone extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplTimeZone INSTANCE = new ObjectWriterImplTimeZone();

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        if (obj == null) {
            jSONWriter.writeNull();
        } else {
            jSONWriter.writeString(((TimeZone) obj).getID());
        }
    }
}
