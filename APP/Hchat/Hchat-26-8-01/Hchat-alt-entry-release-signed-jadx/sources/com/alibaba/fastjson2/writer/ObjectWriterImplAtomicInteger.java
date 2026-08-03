package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplAtomicInteger extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplAtomicInteger INSTANCE = new ObjectWriterImplAtomicInteger(null);
    static final byte[] JSONB_TYPE_NAME_BYTES = JSONB.toBytes("AtomicInteger");
    final Class defineClass;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriterImplAtomicInteger(Class cls) {
        this.defineClass = cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (obj == null) {
            jSONWriter.writeNumberNull();
        } else {
            jSONWriter.writeInt32(((AtomicInteger) obj).intValue());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (obj == null) {
            jSONWriter.writeNumberNull();
            return;
        }
        AtomicInteger atomicInteger = (AtomicInteger) obj;
        if (jSONWriter.isWriteTypeInfo(atomicInteger, type)) {
            jSONWriter.writeTypeName(JSONB_TYPE_NAME_BYTES, 7576651708426282938L);
        }
        jSONWriter.writeInt32(atomicInteger.intValue());
    }
}
