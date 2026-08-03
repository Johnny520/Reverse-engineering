package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplAtomicLongArray extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplAtomicLongArray INSTANCE = new ObjectWriterImplAtomicLongArray();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (obj == null) {
            jSONWriter.writeArrayNull();
            return;
        }
        AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
        jSONWriter.startArray();
        for (int i9 = 0; i9 < atomicLongArray.length(); i9++) {
            if (i9 != 0) {
                jSONWriter.writeComma();
            }
            jSONWriter.writeInt64(atomicLongArray.get(i9));
        }
        jSONWriter.endArray();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (obj == null) {
            jSONWriter.writeArrayNull();
            return;
        }
        AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
        jSONWriter.startArray(atomicLongArray.length());
        for (int i9 = 0; i9 < atomicLongArray.length(); i9++) {
            jSONWriter.writeInt64(atomicLongArray.get(i9));
        }
    }
}
