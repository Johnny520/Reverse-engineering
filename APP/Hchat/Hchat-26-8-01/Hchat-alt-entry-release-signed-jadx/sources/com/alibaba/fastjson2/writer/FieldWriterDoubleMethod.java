package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.text.DecimalFormat;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class FieldWriterDoubleMethod<T> extends FieldWriter<T> {
    final boolean writeNonStringValueAsString;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldWriterDoubleMethod(String str, int i9, long j3, String str2, String str3, Type type, Class cls, Field field, Method method) {
        super(str, i9, j3, str2, str3, type, cls, field, method);
        this.writeNonStringValueAsString = (j3 & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(Object obj) {
        try {
            return this.method.invoke(obj, null);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e6) {
            C0086a.m456o("invoke getter method error, ", this.fieldName, e6);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t9) {
        try {
            Double d10 = (Double) getFieldValue(t9);
            if (d10 == null) {
                return writeFloatNull(jSONWriter);
            }
            writeFieldName(jSONWriter);
            double dDoubleValue = d10.doubleValue();
            DecimalFormat decimalFormat = this.decimalFormat;
            if (decimalFormat != null) {
                jSONWriter.writeDouble(dDoubleValue, decimalFormat);
                return true;
            }
            if (this.writeNonStringValueAsString) {
                jSONWriter.writeString(dDoubleValue);
                return true;
            }
            jSONWriter.writeDouble(dDoubleValue);
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
        Double d10 = (Double) getFieldValue(t9);
        if (d10 == null) {
            jSONWriter.writeNumberNull();
            return;
        }
        double dDoubleValue = d10.doubleValue();
        DecimalFormat decimalFormat = this.decimalFormat;
        if (decimalFormat != null) {
            jSONWriter.writeDouble(dDoubleValue, decimalFormat);
        } else {
            jSONWriter.writeDouble(dDoubleValue);
        }
    }
}
