package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplAtomicLong extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplAtomicLong INSTANCE = new ObjectWriterImplAtomicLong(null);
    static final byte[] JSONB_TYPE_NAME_BYTES = JSONB.toBytes("AtomicLong");
    final Class defineClass;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriterImplAtomicLong(Class cls) {
        this.defineClass = cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (obj == null) {
            jSONWriter.writeNumberNull();
        } else {
            jSONWriter.writeInt64(((Number) obj).longValue());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (obj == null) {
            jSONWriter.writeNumberNull();
            return;
        }
        AtomicLong atomicLong = (AtomicLong) obj;
        if (jSONWriter.isWriteTypeInfo(atomicLong, type)) {
            jSONWriter.writeTypeName(JSONB_TYPE_NAME_BYTES, -1591858996898070466L);
        }
        jSONWriter.writeInt64(atomicLong.longValue());
    }
}
