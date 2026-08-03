package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplDoubleValueArray extends ObjectWriterPrimitiveImpl {
    final DecimalFormat format;
    private final Function<Object, double[]> function;
    static final ObjectWriterImplDoubleValueArray INSTANCE = new ObjectWriterImplDoubleValueArray(null);
    static final byte[] JSONB_TYPE_NAME_BYTES = JSONB.toBytes("[D");
    static final long JSONB_TYPE_HASH = Fnv.hashCode64("[D");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriterImplDoubleValueArray(DecimalFormat decimalFormat) {
        this.format = decimalFormat;
        this.function = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        Function<Object, double[]> function = this.function;
        double[] dArrApply = (function == null || obj == null) ? (double[]) obj : function.apply(obj);
        DecimalFormat decimalFormat = this.format;
        if (decimalFormat != null) {
            jSONWriter.writeDouble(dArrApply, decimalFormat);
        } else if ((JSONWriter.Feature.WriteNonStringValueAsString.mask & j3) != 0) {
            jSONWriter.writeString(dArrApply);
        } else {
            jSONWriter.writeDouble(dArrApply);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (jSONWriter.isWriteTypeInfo(obj, type)) {
            jSONWriter.writeTypeName(JSONB_TYPE_NAME_BYTES, JSONB_TYPE_HASH);
        }
        Function<Object, double[]> function = this.function;
        double[] dArrApply = (function == null || obj == null) ? (double[]) obj : function.apply(obj);
        if ((JSONWriter.Feature.WriteNonStringValueAsString.mask & j3) != 0) {
            jSONWriter.writeString(dArrApply);
        } else {
            jSONWriter.writeDouble(dArrApply);
        }
    }

    public ObjectWriterImplDoubleValueArray(Function<Object, double[]> function, DecimalFormat decimalFormat) {
        this.function = function;
        this.format = decimalFormat;
    }
}
