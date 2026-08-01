package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.C1607k;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
class FieldWriterDouble<T> extends FieldWriter<T> {
    public FieldWriterDouble(String str, int i10, long j10, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, Object obj) {
        super(str, i10, j10, str2, locale, str3, type, cls, field, method, obj);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(T t10) {
        return this.propertyAccessor.getObject(t10);
    }

    public double getFieldValueDouble(T t10) {
        if (t10 != null) {
            return this.propertyAccessor.getDoubleValue(t10);
        }
        C1607k.m6296a("field.get error, ", this.fieldName);
        return 0.0d;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t10) {
        long features = this.features | jSONWriter.getFeatures();
        try {
            Double d10 = (Double) this.propertyAccessor.getObject(t10);
            if (d10 == null) {
                return writeFloatNull(jSONWriter);
            }
            writeDoubleValue(jSONWriter, d10, features);
            return true;
        } catch (RuntimeException e10) {
            if ((features & JSONWriter.MASK_IGNORE_ERROR_GETTER) != 0) {
                return false;
            }
            throw e10;
        }
    }

    public final void writeDoubleValue(JSONWriter jSONWriter, Double d10, long j10) {
        double dDoubleValue = d10.doubleValue();
        if (dDoubleValue == 0.0d && (JSONWriter.Feature.NotWriteDefaultValue.mask & j10) != 0 && this.defaultValue == null) {
            return;
        }
        writeFieldName(jSONWriter);
        DecimalFormat decimalFormat = this.decimalFormat;
        if (decimalFormat != null) {
            jSONWriter.writeDouble(dDoubleValue, decimalFormat);
        } else if ((j10 & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
            jSONWriter.writeString(Double.toString(dDoubleValue));
        } else {
            jSONWriter.writeDouble(dDoubleValue);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t10) {
        Double d10 = (Double) this.propertyAccessor.getObject(t10);
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
