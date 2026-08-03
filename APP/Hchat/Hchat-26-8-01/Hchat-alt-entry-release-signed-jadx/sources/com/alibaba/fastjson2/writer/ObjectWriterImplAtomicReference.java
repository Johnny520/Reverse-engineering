package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplAtomicReference extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplAtomicReference INSTANCE = new ObjectWriterImplAtomicReference(null);
    final Class defineClass;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriterImplAtomicReference(Class cls) {
        this.defineClass = cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        Object obj3 = ((AtomicReference) obj).get();
        if (obj3 == null) {
            jSONWriter.writeNull();
        }
        jSONWriter.writeAny(obj3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        Object obj3 = ((AtomicReference) obj).get();
        if (obj3 == null) {
            jSONWriter.writeNull();
        }
        jSONWriter.writeAny(obj3);
    }
}
