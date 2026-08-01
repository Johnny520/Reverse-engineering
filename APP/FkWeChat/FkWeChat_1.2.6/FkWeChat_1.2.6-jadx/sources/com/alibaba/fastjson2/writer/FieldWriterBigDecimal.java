package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterBigDecimal<T> extends FieldWriter<T> {
    public FieldWriterBigDecimal(String str, int i10, long j10, String str2, Locale locale, String str3, Field field, Method method, Function<T, BigDecimal> function) {
        super(str, i10, j10, str2, locale, str3, BigDecimal.class, BigDecimal.class, field, method, function);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(T t10) {
        return this.propertyAccessor.getObject(t10);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t10) {
        long features = this.features | jSONWriter.getFeatures();
        try {
            BigDecimal bigDecimal = (BigDecimal) this.propertyAccessor.getObject(t10);
            if (bigDecimal == null) {
                return writeFloatNull(jSONWriter);
            }
            writeFieldName(jSONWriter);
            jSONWriter.writeDecimal(bigDecimal, features, this.decimalFormat);
            return true;
        } catch (RuntimeException e10) {
            if ((features & JSONWriter.MASK_IGNORE_ERROR_GETTER) != 0) {
                return false;
            }
            throw e10;
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t10) {
        jSONWriter.writeDecimal((BigDecimal) this.propertyAccessor.getObject(t10), this.features, this.decimalFormat);
    }
}
