package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplInt32 extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplInt32 INSTANCE = new ObjectWriterImplInt32();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (obj == null) {
            jSONWriter.writeNumberNull();
            return;
        }
        int iIntValue = ((Integer) obj).intValue();
        if ((JSONWriter.Feature.WriteNonStringValueAsString.mask & j3) != 0) {
            jSONWriter.writeString(iIntValue);
        } else {
            jSONWriter.writeInt32(iIntValue);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (obj == null) {
            jSONWriter.writeNumberNull();
            return;
        }
        int iIntValue = ((Integer) obj).intValue();
        if ((JSONWriter.Feature.WriteNonStringValueAsString.mask & j3) != 0) {
            jSONWriter.writeString(iIntValue);
        } else {
            jSONWriter.writeInt32(iIntValue);
        }
    }
}
