package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.text.DecimalFormat;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplDouble extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplDouble INSTANCE = new ObjectWriterImplDouble(null);
    private final DecimalFormat format;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriterImplDouble(DecimalFormat decimalFormat) {
        this.format = decimalFormat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        DecimalFormat decimalFormat = this.format;
        if (decimalFormat != null) {
            jSONWriter.writeRaw(decimalFormat.format(obj));
            return;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        if ((JSONWriter.Feature.WriteNonStringValueAsString.mask & j3) != 0) {
            jSONWriter.writeString(dDoubleValue);
            return;
        }
        jSONWriter.writeDouble(dDoubleValue);
        if (((jSONWriter.getFeatures() | j3) & JSONWriter.Feature.WriteClassName.mask) == 0 || type == Double.class || type == Double.TYPE) {
            return;
        }
        jSONWriter.writeRaw('D');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        if ((j3 & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
            jSONWriter.writeString(dDoubleValue);
        } else {
            jSONWriter.writeDouble(dDoubleValue);
        }
    }
}
