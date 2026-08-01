package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
class ObjectWriterImplBoolValueArray extends ObjectWriterPrimitiveImpl {
    private final Function<Object, boolean[]> function;
    static final ObjectWriterImplBoolValueArray INSTANCE = new ObjectWriterImplBoolValueArray(null);
    static final byte[] JSONB_TYPE_NAME_BYTES = JSONB.toBytes("[Z");
    static final long JSONB_TYPE_HASH = Fnv.hashCode64("[Z");

    public ObjectWriterImplBoolValueArray(Function<Object, boolean[]> function) {
        this.function = function;
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        Function<Object, boolean[]> function = this.function;
        boolean[] zArrApply = (function == null || obj == null) ? (boolean[]) obj : function.apply(obj);
        if ((JSONWriter.Feature.WriteNonStringValueAsString.mask & j10) != 0) {
            jSONWriter.writeString(zArrApply);
        } else {
            jSONWriter.writeBool(zArrApply);
        }
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        if (jSONWriter.isWriteTypeInfo(obj, type, j10)) {
            jSONWriter.writeTypeName(JSONB_TYPE_NAME_BYTES, JSONB_TYPE_HASH);
        }
        Function<Object, boolean[]> function = this.function;
        boolean[] zArrApply = (function == null || obj == null) ? (boolean[]) obj : function.apply(obj);
        if ((JSONWriter.Feature.WriteNonStringValueAsString.mask & j10) != 0) {
            jSONWriter.writeString(zArrApply);
        } else {
            jSONWriter.writeBool(zArrApply);
        }
    }
}
