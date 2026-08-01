package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.function.BiFunction;
import java.util.function.ToIntFunction;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
class ObjectWriterImplBoolValueArrayLambda extends ObjectWriterPrimitiveImpl {
    private final BiFunction<Object, Integer, Boolean> functionGet;
    private final ToIntFunction functionSize;

    public ObjectWriterImplBoolValueArrayLambda(ToIntFunction toIntFunction, BiFunction<Object, Integer, Boolean> biFunction) {
        this.functionSize = toIntFunction;
        this.functionGet = biFunction;
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        if (obj == null) {
            jSONWriter.writeArrayNull();
            return;
        }
        int iApplyAsInt = this.functionSize.applyAsInt(obj);
        jSONWriter.startArray();
        for (int i10 = 0; i10 < iApplyAsInt; i10++) {
            boolean zBooleanValue = this.functionGet.apply(obj, Integer.valueOf(i10)).booleanValue();
            if (i10 != 0) {
                jSONWriter.writeComma();
            }
            jSONWriter.writeBool(zBooleanValue);
        }
        jSONWriter.endArray();
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        if (obj == null) {
            jSONWriter.writeArrayNull();
            return;
        }
        if (jSONWriter.isWriteTypeInfo(obj, type, j10)) {
            jSONWriter.writeTypeName(ObjectWriterImplBoolValueArray.JSONB_TYPE_NAME_BYTES, ObjectWriterImplBoolValueArray.JSONB_TYPE_HASH);
        }
        int iApplyAsInt = this.functionSize.applyAsInt(obj);
        jSONWriter.startArray(iApplyAsInt);
        for (int i10 = 0; i10 < iApplyAsInt; i10++) {
            jSONWriter.writeBool(this.functionGet.apply(obj, Integer.valueOf(i10)).booleanValue());
        }
    }
}
