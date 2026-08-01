package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.text.DecimalFormat;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplFloat extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplFloat INSTANCE = new ObjectWriterImplFloat(null);
    private final DecimalFormat format;

    public ObjectWriterImplFloat(DecimalFormat decimalFormat) {
        this.format = decimalFormat;
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
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
        if ((JSONWriter.Feature.WriteNonStringValueAsString.mask & j10) != 0) {
            jSONWriter.writeString(fFloatValue);
            return;
        }
        jSONWriter.writeFloat(fFloatValue);
        long features = jSONWriter.getFeatures(j10);
        if ((JSONWriter.Feature.WriteClassName.mask & features) == 0 || (JSONWriter.Feature.WriteNonStringKeyAsString.mask & features) != 0 || (features & JSONWriter.Feature.NotWriteNumberClassName.mask) != 0 || type == Float.class || type == Float.TYPE) {
            return;
        }
        jSONWriter.writeRaw('F');
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        float fFloatValue = ((Float) obj).floatValue();
        if ((JSONWriter.Feature.WriteNonStringValueAsString.mask & j10) != 0) {
            jSONWriter.writeString(fFloatValue);
        } else {
            jSONWriter.writeFloat(fFloatValue);
        }
    }
}
