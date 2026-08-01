package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplInt16 extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplInt16 INSTANCE = new ObjectWriterImplInt16();

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        if (obj == null) {
            jSONWriter.writeNumberNull();
            return;
        }
        short sShortValue = ((Short) obj).shortValue();
        if ((JSONWriter.Feature.WriteNonStringValueAsString.mask & j10) != 0) {
            jSONWriter.writeString(sShortValue);
            return;
        }
        jSONWriter.writeInt32(sShortValue);
        long features = jSONWriter.getFeatures(j10);
        if ((JSONWriter.Feature.WriteClassName.mask & features) == 0 || (JSONWriter.Feature.WriteNonStringKeyAsString.mask & features) != 0 || (features & JSONWriter.Feature.NotWriteNumberClassName.mask) != 0 || type == Short.class || type == Short.TYPE) {
            return;
        }
        jSONWriter.writeRaw('S');
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        if (obj == null) {
            jSONWriter.writeNumberNull();
            return;
        }
        short sShortValue = ((Short) obj).shortValue();
        if ((JSONWriter.Feature.WriteNonStringValueAsString.mask & j10) != 0) {
            jSONWriter.writeString(sShortValue);
        } else {
            jSONWriter.writeInt16(sShortValue);
        }
    }
}
