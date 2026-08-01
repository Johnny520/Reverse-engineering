package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterFloatValue<T> extends FieldWriterFloat<T> {
    public FieldWriterFloatValue(String str, int i10, long j10, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, Object obj) {
        super(str, i10, j10, str2, locale, str3, type, cls, field, method, obj);
    }

    private void writeFloatValue(JSONWriter jSONWriter, float f10, long j10) {
        if (f10 == 0.0f && (JSONWriter.Feature.NotWriteDefaultValue.mask & j10) != 0 && this.defaultValue == null) {
            return;
        }
        writeFieldName(jSONWriter);
        DecimalFormat decimalFormat = this.decimalFormat;
        if (decimalFormat != null) {
            jSONWriter.writeFloat(f10, decimalFormat);
        } else if ((j10 & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
            jSONWriter.writeString(Float.toString(f10));
        } else {
            jSONWriter.writeFloat(f10);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterFloat, com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t10) {
        long features = this.features | jSONWriter.getFeatures();
        try {
            float floatValue = this.propertyAccessor.getFloatValue(t10);
            if (floatValue == 0.0f && this.defaultValue == null && (JSONWriter.MASK_NOT_WRITE_DEFAULT_VALUE & features) != 0) {
                return false;
            }
            writeFloatValue(jSONWriter, floatValue, features);
            return true;
        } catch (RuntimeException e10) {
            if ((features & JSONWriter.MASK_IGNORE_ERROR_GETTER) != 0) {
                return false;
            }
            throw e10;
        }
    }
}
