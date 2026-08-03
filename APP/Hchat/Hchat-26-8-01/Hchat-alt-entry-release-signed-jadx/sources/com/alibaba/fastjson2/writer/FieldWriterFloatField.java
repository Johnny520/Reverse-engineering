package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.JDKUtils;
import java.lang.reflect.Field;
import java.text.DecimalFormat;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class FieldWriterFloatField<T> extends FieldWriter<T> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldWriterFloatField(String str, int i9, long j3, String str2, String str3, Field field) {
        super(str, i9, j3, str2, str3, Float.class, Float.class, field, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(Object obj) {
        if (obj == null) {
            C0086a.m450i(this.fieldName, "field.get error, ");
            return null;
        }
        try {
            return (this.fieldOffset == -1 || this.fieldClass.isPrimitive()) ? this.field.get(obj) : JDKUtils.UNSAFE.getObject(obj, this.fieldOffset);
        } catch (IllegalAccessException e6) {
            e = e6;
            C0086a.m456o("field.get error, ", this.fieldName, e);
            return null;
        } catch (IllegalArgumentException e7) {
            e = e7;
            C0086a.m456o("field.get error, ", this.fieldName, e);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t9) {
        Float f3 = (Float) getFieldValue(t9);
        if (f3 == null) {
            return writeFloatNull(jSONWriter);
        }
        writeFieldName(jSONWriter);
        float fFloatValue = f3.floatValue();
        DecimalFormat decimalFormat = this.decimalFormat;
        if (decimalFormat != null) {
            jSONWriter.writeFloat(fFloatValue, decimalFormat);
            return true;
        }
        jSONWriter.writeFloat(fFloatValue);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t9) {
        Float f3 = (Float) getFieldValue(t9);
        if (f3 == null) {
            jSONWriter.writeNumberNull();
            return;
        }
        float fFloatValue = f3.floatValue();
        DecimalFormat decimalFormat = this.decimalFormat;
        if (decimalFormat != null) {
            jSONWriter.writeFloat(fFloatValue, decimalFormat);
        } else {
            jSONWriter.writeFloat(fFloatValue);
        }
    }
}
