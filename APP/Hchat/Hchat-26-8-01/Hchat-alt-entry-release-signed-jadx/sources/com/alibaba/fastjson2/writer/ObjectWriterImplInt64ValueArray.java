package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplInt64ValueArray extends ObjectWriterPrimitiveImpl {
    private final Function<Object, long[]> function;
    static final ObjectWriterImplInt64ValueArray INSTANCE = new ObjectWriterImplInt64ValueArray(null);
    static final byte[] JSONB_TYPE_NAME_BYTES = JSONB.toBytes("[J");
    static final long JSONB_TYPE_HASH = Fnv.hashCode64("[J");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriterImplInt64ValueArray(Function<Object, long[]> function) {
        this.function = function;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        ObjectWriter objectWriter = (jSONWriter.context.provider.userDefineMask & 4) != 0 ? jSONWriter.context.getObjectWriter(Long.class) : null;
        Function<Object, long[]> function = this.function;
        long[] jArrApply = function != null ? function.apply(obj) : (long[]) obj;
        if (objectWriter == null || objectWriter == ObjectWriterImplInt32.INSTANCE) {
            if ((JSONWriter.Feature.WriteNonStringValueAsString.mask & j3) != 0) {
                jSONWriter.writeString(jArrApply);
                return;
            } else {
                jSONWriter.writeInt64(jArrApply);
                return;
            }
        }
        if ((JSONWriter.Feature.WriteNonStringValueAsString.mask & j3) != 0) {
            jSONWriter.writeString(jArrApply);
        } else {
            jSONWriter.writeInt64(jArrApply);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        if (jSONWriter.isWriteTypeInfo(obj, type)) {
            jSONWriter.writeTypeName(JSONB_TYPE_NAME_BYTES, JSONB_TYPE_HASH);
        }
        Function<Object, long[]> function = this.function;
        long[] jArrApply = function != null ? function.apply(obj) : (long[]) obj;
        if ((JSONWriter.Feature.WriteNonStringValueAsString.mask & j3) != 0) {
            jSONWriter.writeString(jArrApply);
        } else {
            jSONWriter.writeInt64(jArrApply);
        }
    }
}
