package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterDoubleValue<T> extends FieldWriterDouble<T> {
    public FieldWriterDoubleValue(String str, int i10, long j10, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, Object obj) {
        super(str, i10, j10, str2, locale, str3, type, cls, field, method, obj);
    }

    private void writeDoubleValue(JSONWriter jSONWriter, double d10, long j10) {
        if (d10 == 0.0d && (JSONWriter.Feature.NotWriteDefaultValue.mask & j10) != 0 && this.defaultValue == null) {
            return;
        }
        writeFieldName(jSONWriter);
        DecimalFormat decimalFormat = this.decimalFormat;
        if (decimalFormat != null) {
            jSONWriter.writeDouble(d10, decimalFormat);
        } else if ((j10 & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
            jSONWriter.writeString(Double.toString(d10));
        } else {
            jSONWriter.writeDouble(d10);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterDouble, com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t10) {
        long features = this.features | jSONWriter.getFeatures();
        try {
            double doubleValue = this.propertyAccessor.getDoubleValue(t10);
            if (doubleValue == 0.0d && this.defaultValue == null && (JSONWriter.MASK_NOT_WRITE_DEFAULT_VALUE & features) != 0) {
                return false;
            }
            writeDoubleValue(jSONWriter, doubleValue, features);
            return true;
        } catch (RuntimeException e10) {
            if ((JSONWriter.MASK_IGNORE_ERROR_GETTER & features) != 0) {
                return false;
            }
            throw e10;
        }
    }
}
