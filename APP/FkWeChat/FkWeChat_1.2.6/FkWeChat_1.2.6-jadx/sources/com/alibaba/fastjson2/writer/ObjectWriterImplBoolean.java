package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplBoolean extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplBoolean INSTANCE = new ObjectWriterImplBoolean();

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        if (obj == null) {
            jSONWriter.writeBooleanNull();
            return;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if ((jSONWriter.getFeatures(j10) & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
            jSONWriter.writeString(zBooleanValue);
        } else {
            jSONWriter.writeBool(zBooleanValue);
        }
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        write(jSONWriter, obj, obj2, type, j10);
    }
}
