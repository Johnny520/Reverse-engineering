package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplInt16 extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplInt16 INSTANCE = new ObjectWriterImplInt16();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (obj == null) {
            jSONWriter.writeNumberNull();
            return;
        }
        short sShortValue = ((Short) obj).shortValue();
        if ((JSONWriter.Feature.WriteNonStringValueAsString.mask & j3) != 0) {
            jSONWriter.writeString(sShortValue);
            return;
        }
        jSONWriter.writeInt16(sShortValue);
        if (((jSONWriter.getFeatures() | j3) & JSONWriter.Feature.WriteClassName.mask) == 0 || type == Short.class || type == Short.TYPE) {
            return;
        }
        jSONWriter.writeRaw('S');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (obj == null) {
            jSONWriter.writeNumberNull();
            return;
        }
        short sShortValue = ((Short) obj).shortValue();
        if ((JSONWriter.Feature.WriteNonStringValueAsString.mask & j3) != 0) {
            jSONWriter.writeString(sShortValue);
        } else {
            jSONWriter.writeInt16(sShortValue);
        }
    }
}
