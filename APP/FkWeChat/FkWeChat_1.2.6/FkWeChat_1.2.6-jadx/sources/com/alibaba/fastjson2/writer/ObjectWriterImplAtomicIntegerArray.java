package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
class ObjectWriterImplAtomicIntegerArray extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplAtomicIntegerArray INSTANCE = new ObjectWriterImplAtomicIntegerArray();

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        if (obj == null) {
            jSONWriter.writeArrayNull();
            return;
        }
        AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
        jSONWriter.startArray();
        for (int i10 = 0; i10 < atomicIntegerArray.length(); i10++) {
            if (i10 != 0) {
                jSONWriter.writeComma();
            }
            jSONWriter.writeInt32(atomicIntegerArray.get(i10));
        }
        jSONWriter.endArray();
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        if (obj == null) {
            jSONWriter.writeArrayNull();
            return;
        }
        AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
        jSONWriter.startArray(atomicIntegerArray.length());
        for (int i10 = 0; i10 < atomicIntegerArray.length(); i10++) {
            jSONWriter.writeInt32(atomicIntegerArray.get(i10));
        }
    }
}
