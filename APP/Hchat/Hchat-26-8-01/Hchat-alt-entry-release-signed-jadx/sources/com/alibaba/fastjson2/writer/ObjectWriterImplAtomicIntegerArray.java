package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ObjectWriterImplAtomicIntegerArray extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplAtomicIntegerArray INSTANCE = new ObjectWriterImplAtomicIntegerArray();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (obj == null) {
            jSONWriter.writeArrayNull();
            return;
        }
        AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
        jSONWriter.startArray();
        for (int i9 = 0; i9 < atomicIntegerArray.length(); i9++) {
            if (i9 != 0) {
                jSONWriter.writeComma();
            }
            jSONWriter.writeInt32(atomicIntegerArray.get(i9));
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
        AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
        jSONWriter.startArray(atomicIntegerArray.length());
        for (int i9 = 0; i9 < atomicIntegerArray.length(); i9++) {
            jSONWriter.writeInt32(atomicIntegerArray.get(i9));
        }
    }
}
