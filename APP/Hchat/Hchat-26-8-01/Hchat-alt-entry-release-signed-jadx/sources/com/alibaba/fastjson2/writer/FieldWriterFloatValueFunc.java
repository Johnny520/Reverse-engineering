package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.function.ToFloatFunction;
import java.lang.reflect.Method;
import java.text.DecimalFormat;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterFloatValueFunc extends FieldWriter {
    final ToFloatFunction function;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public FieldWriterFloatValueFunc(String str, int i9, long j3, String str2, String str3, Method method, ToFloatFunction toFloatFunction) {
        Class cls = Float.TYPE;
        super(str, i9, j3, str2, str3, cls, cls, null, method);
        this.function = toFloatFunction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(Object obj) {
        return Float.valueOf(this.function.applyAsFloat(obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, Object obj) {
        try {
            float fApplyAsFloat = this.function.applyAsFloat(obj);
            writeFieldName(jSONWriter);
            DecimalFormat decimalFormat = this.decimalFormat;
            if (decimalFormat != null) {
                jSONWriter.writeFloat(fApplyAsFloat, decimalFormat);
                return true;
            }
            jSONWriter.writeFloat(fApplyAsFloat);
            return true;
        } catch (RuntimeException e6) {
            if (jSONWriter.isIgnoreErrorGetter()) {
                return false;
            }
            throw e6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, Object obj) {
        float fApplyAsFloat = this.function.applyAsFloat(obj);
        DecimalFormat decimalFormat = this.decimalFormat;
        if (decimalFormat != null) {
            jSONWriter.writeDouble(fApplyAsFloat, decimalFormat);
        } else {
            jSONWriter.writeDouble(fApplyAsFloat);
        }
    }
}
