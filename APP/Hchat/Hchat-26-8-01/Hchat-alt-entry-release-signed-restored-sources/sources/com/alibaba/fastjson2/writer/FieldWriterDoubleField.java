package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.JDKUtils;
import java.lang.reflect.Field;
import java.text.DecimalFormat;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class FieldWriterDoubleField<T> extends FieldWriter<T> {
    final boolean writeNonStringValueAsString;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldWriterDoubleField(String str, int i9, long j3, String str2, String str3, Field field) {
        super(str, i9, j3, str2, str3, Double.class, Double.class, field, null);
        this.writeNonStringValueAsString = (JSONWriter.Feature.WriteNonStringValueAsString.mask & j3) != 0;
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
