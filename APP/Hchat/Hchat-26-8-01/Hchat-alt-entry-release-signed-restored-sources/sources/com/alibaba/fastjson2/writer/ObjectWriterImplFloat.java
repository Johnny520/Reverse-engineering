package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.text.DecimalFormat;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplFloat extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplFloat INSTANCE = new ObjectWriterImplFloat(null);
    private final DecimalFormat format;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriterImplFloat(DecimalFormat decimalFormat) {
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
        float fFloatValue = ((Float) obj).floatValue();
        if ((JSONWriter.Feature.WriteNonStringValueAsString.mask & j3) != 0) {
            jSONWriter.writeString(fFloatValue);
            return;
        }
        jSONWriter.writeFloat(fFloatValue);
        if (((jSONWriter.getFeatures() | j3) & JSONWriter.Feature.WriteClassName.mask) == 0 || type == Float.class || type == Float.TYPE) {
            return;
        }
        jSONWriter.writeRaw('F');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        float fFloatValue = ((Float) obj).floatValue();
        if ((JSONWriter.Feature.WriteNonStringValueAsString.mask & j3) != 0) {
            jSONWriter.writeString(fFloatValue);
        } else {
            jSONWriter.writeFloat(fFloatValue);
        }
    }
}
