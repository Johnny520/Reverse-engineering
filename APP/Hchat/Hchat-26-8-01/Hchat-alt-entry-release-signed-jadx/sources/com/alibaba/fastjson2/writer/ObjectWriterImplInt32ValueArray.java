package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplInt32ValueArray extends ObjectWriterPrimitiveImpl {
    private final Function<Object, int[]> function;
    static final ObjectWriterImplInt32ValueArray INSTANCE = new ObjectWriterImplInt32ValueArray(null);
    static final byte[] JSONB_TYPE_NAME_BYTES = JSONB.toBytes("[I");
    static final long JSONB_TYPE_HASH = Fnv.hashCode64("[I");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriterImplInt32ValueArray(Function<Object, int[]> function) {
        this.function = function;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        Function<Object, int[]> function = this.function;
        int[] iArrApply = function != null ? function.apply(obj) : (int[]) obj;
        if ((JSONWriter.Feature.WriteNonStringValueAsString.mask & j3) != 0) {
            jSONWriter.writeString(iArrApply);
        } else {
            jSONWriter.writeInt32(iArrApply);
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
        Function<Object, int[]> function = this.function;
        int[] iArrApply = function != null ? function.apply(obj) : (int[]) obj;
        if ((JSONWriter.Feature.WriteNonStringValueAsString.mask & j3) != 0) {
            jSONWriter.writeString(iArrApply);
        } else {
            jSONWriter.writeInt32(iArrApply);
        }
    }
}
