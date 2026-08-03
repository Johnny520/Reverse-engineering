package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.function.ToDoubleFunction;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterDoubleValueFunc extends FieldWriter {
    final ToDoubleFunction function;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public FieldWriterDoubleValueFunc(String str, int i9, long j3, String str2, String str3, Method method, ToDoubleFunction toDoubleFunction) {
        Class cls = Double.TYPE;
        super(str, i9, j3, str2, str3, cls, cls, null, method);
        this.function = toDoubleFunction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(Object obj) {
        return Double.valueOf(this.function.applyAsDouble(obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, Object obj) {
        try {
            double dApplyAsDouble = this.function.applyAsDouble(obj);
            writeFieldName(jSONWriter);
            DecimalFormat decimalFormat = this.decimalFormat;
            if (decimalFormat != null) {
                jSONWriter.writeDouble(dApplyAsDouble, decimalFormat);
                return true;
            }
            jSONWriter.writeDouble(dApplyAsDouble);
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
        double dApplyAsDouble = this.function.applyAsDouble(obj);
        DecimalFormat decimalFormat = this.decimalFormat;
        if (decimalFormat != null) {
            jSONWriter.writeDouble(dApplyAsDouble, decimalFormat);
        } else {
            jSONWriter.writeDouble(dApplyAsDouble);
        }
    }
}
