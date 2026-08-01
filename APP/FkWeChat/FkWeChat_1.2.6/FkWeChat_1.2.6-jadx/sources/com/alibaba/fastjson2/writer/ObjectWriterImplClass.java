package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplClass extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplClass INSTANCE = new ObjectWriterImplClass();

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        if (obj == null) {
            jSONWriter.writeNull();
        } else {
            jSONWriter.writeString(((Class) obj).getName());
        }
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        if (jSONWriter.isWriteTypeInfo(obj, type, j10)) {
            jSONWriter.writeTypeName("java.lang.Class");
        }
        jSONWriter.writeString(((Class) obj).getName());
    }
}
