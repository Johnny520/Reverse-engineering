package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterFloatFunc<T> extends FieldWriter<T> {
    final Function<T, Float> function;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldWriterFloatFunc(String str, int i9, long j3, String str2, String str3, Method method, Function<T, Float> function) {
        super(str, i9, j3, str2, str3, Float.class, Float.class, null, method);
        this.function = function;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(T t9) {
        return this.function.apply(t9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t9) {
        try {
            Float fApply = this.function.apply(t9);
            if (fApply == null) {
                return writeFloatNull(jSONWriter);
            }
            writeFieldName(jSONWriter);
            float fFloatValue = fApply.floatValue();
            DecimalFormat decimalFormat = this.decimalFormat;
            if (decimalFormat != null) {
                jSONWriter.writeFloat(fFloatValue, decimalFormat);
                return true;
            }
            jSONWriter.writeFloat(fFloatValue);
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
    public void writeValue(JSONWriter jSONWriter, T t9) {
        Float fApply = this.function.apply(t9);
        if (fApply == null) {
            jSONWriter.writeNumberNull();
            return;
        }
        float fFloatValue = fApply.floatValue();
        DecimalFormat decimalFormat = this.decimalFormat;
        if (decimalFormat != null) {
            jSONWriter.writeFloat(fFloatValue, decimalFormat);
        } else {
            jSONWriter.writeFloat(fFloatValue);
        }
    }
}
