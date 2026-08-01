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
class FieldWriterFloat<T> extends FieldWriter<T> {
    public FieldWriterFloat(String str, int i10, long j10, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, Object obj) {
        super(str, i10, j10, str2, locale, str3, type, cls, field, method, obj);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(T t10) {
        return this.propertyAccessor.getObject(t10);
    }

    public float getFieldValueFloat(T t10) {
        if (t10 != null) {
            return this.propertyAccessor.getFloatValue(t10);
        }
        C1607k.m6296a("field.get error, ", this.fieldName);
        return 0.0f;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t10) {
        long features = this.features | jSONWriter.getFeatures();
        try {
            Float f10 = (Float) this.propertyAccessor.getObject(t10);
            if (f10 == null) {
                return writeFloatNull(jSONWriter);
            }
            writeFloatValue(jSONWriter, f10, features);
            return true;
        } catch (RuntimeException e10) {
            if ((features & JSONWriter.MASK_IGNORE_ERROR_GETTER) != 0) {
                return false;
            }
            throw e10;
        }
    }

    public final void writeFloatValue(JSONWriter jSONWriter, Float f10, long j10) {
        float fFloatValue = f10.floatValue();
        if (fFloatValue == 0.0f && (JSONWriter.Feature.NotWriteDefaultValue.mask & j10) != 0 && this.defaultValue == null) {
            return;
        }
        writeFieldName(jSONWriter);
        DecimalFormat decimalFormat = this.decimalFormat;
        if (decimalFormat != null) {
            jSONWriter.writeFloat(fFloatValue, decimalFormat);
        } else if ((j10 & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
            jSONWriter.writeString(Float.toString(fFloatValue));
        } else {
            jSONWriter.writeFloat(fFloatValue);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t10) {
        Float f10 = (Float) this.propertyAccessor.getObject(t10);
        if (f10 == null) {
            jSONWriter.writeNumberNull();
            return;
        }
        float fFloatValue = f10.floatValue();
        DecimalFormat decimalFormat = this.decimalFormat;
        if (decimalFormat != null) {
            jSONWriter.writeFloat(fFloatValue, decimalFormat);
        } else {
            jSONWriter.writeFloat(fFloatValue);
        }
    }
}
