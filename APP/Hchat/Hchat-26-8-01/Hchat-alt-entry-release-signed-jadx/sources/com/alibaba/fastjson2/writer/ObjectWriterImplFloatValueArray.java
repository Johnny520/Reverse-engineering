package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplFloatValueArray extends ObjectWriterPrimitiveImpl {
    private final DecimalFormat format;
    private final Function<Object, float[]> function;
    static final ObjectWriterImplFloatValueArray INSTANCE = new ObjectWriterImplFloatValueArray(null, null);
    static final byte[] JSONB_TYPE_NAME_BYTES = JSONB.toBytes("[F");
    static final long JSONB_TYPE_HASH = Fnv.hashCode64("[F");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriterImplFloatValueArray(DecimalFormat decimalFormat) {
        this.format = decimalFormat;
        this.function = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        Function<Object, float[]> function = this.function;
        float[] fArrApply = (function == null || obj == null) ? (float[]) obj : function.apply(obj);
        DecimalFormat decimalFormat = this.format;
        if (decimalFormat != null) {
            jSONWriter.writeFloat(fArrApply, decimalFormat);
        } else if ((JSONWriter.Feature.WriteNonStringValueAsString.mask & j3) != 0) {
            jSONWriter.writeString(fArrApply);
        } else {
            jSONWriter.writeFloat(fArrApply);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (jSONWriter.isWriteTypeInfo(obj, type)) {
            jSONWriter.writeTypeName(JSONB_TYPE_NAME_BYTES, JSONB_TYPE_HASH);
        }
        Function<Object, float[]> function = this.function;
        float[] fArrApply = (function == null || obj == null) ? (float[]) obj : function.apply(obj);
        if ((JSONWriter.Feature.WriteNonStringValueAsString.mask & j3) != 0) {
            jSONWriter.writeString(fArrApply);
        } else {
            jSONWriter.writeFloat(fArrApply);
        }
    }

    public ObjectWriterImplFloatValueArray(Function<Object, float[]> function, DecimalFormat decimalFormat) {
        this.function = function;
        this.format = decimalFormat;
    }
}
