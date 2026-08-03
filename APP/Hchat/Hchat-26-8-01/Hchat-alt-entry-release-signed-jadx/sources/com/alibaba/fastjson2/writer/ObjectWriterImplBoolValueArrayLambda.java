package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.function.BiFunction;
import java.util.function.ToIntFunction;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ObjectWriterImplBoolValueArrayLambda extends ObjectWriterPrimitiveImpl {
    private final BiFunction<Object, Integer, Boolean> functionGet;
    private final ToIntFunction functionSize;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriterImplBoolValueArrayLambda(ToIntFunction toIntFunction, BiFunction<Object, Integer, Boolean> biFunction) {
        this.functionSize = toIntFunction;
        this.functionGet = biFunction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (obj == null) {
            jSONWriter.writeArrayNull();
            return;
        }
        int iApplyAsInt = this.functionSize.applyAsInt(obj);
        jSONWriter.startArray();
        for (int i9 = 0; i9 < iApplyAsInt; i9++) {
            boolean zBooleanValue = this.functionGet.apply(obj, Integer.valueOf(i9)).booleanValue();
            if (i9 != 0) {
                jSONWriter.writeComma();
            }
            jSONWriter.writeBool(zBooleanValue);
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
        if (jSONWriter.isWriteTypeInfo(obj, type, j3)) {
            jSONWriter.writeTypeName(ObjectWriterImplBoolValueArray.JSONB_TYPE_NAME_BYTES, ObjectWriterImplBoolValueArray.JSONB_TYPE_HASH);
        }
        int iApplyAsInt = this.functionSize.applyAsInt(obj);
        jSONWriter.startArray(iApplyAsInt);
        for (int i9 = 0; i9 < iApplyAsInt; i9++) {
            jSONWriter.writeBool(this.functionGet.apply(obj, Integer.valueOf(i9)).booleanValue());
        }
    }
}
