package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplCharValueArray extends ObjectWriterPrimitiveImpl {
    private final Function<Object, char[]> function;
    static final ObjectWriterImplCharValueArray INSTANCE = new ObjectWriterImplCharValueArray(null);
    static final byte[] JSONB_TYPE_NAME_BYTES = JSONB.toBytes("[C");
    static final long JSONB_TYPE_HASH = Fnv.hashCode64("[C");

    public ObjectWriterImplCharValueArray(Function<Object, char[]> function) {
        this.function = function;
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        Function<Object, char[]> function = this.function;
        char[] cArrApply = (function == null || obj == null) ? (char[]) obj : function.apply(obj);
        if (jSONWriter.utf16) {
            jSONWriter.writeString(cArrApply, 0, cArrApply.length);
        } else {
            jSONWriter.writeString(new String(cArrApply));
        }
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        if (jSONWriter.isWriteTypeInfo(obj, type, j10)) {
            jSONWriter.writeTypeName(JSONB_TYPE_NAME_BYTES, JSONB_TYPE_HASH);
        }
        Function<Object, char[]> function = this.function;
        char[] cArrApply = (function == null || obj == null) ? (char[]) obj : function.apply(obj);
        jSONWriter.writeString(cArrApply, 0, cArrApply.length);
    }
}
