package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterMillis<T> extends FieldWriterDate<T> {
    public FieldWriterMillis(String str, int i10, long j10, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, Object obj) {
        super(str, i10, j10, str2, locale, str3, type, cls, field, method, obj);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterDate, com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(T t10) {
        return Long.valueOf(this.propertyAccessor.getLongValue(t10));
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterDate, com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t10) {
        long longValue = this.propertyAccessor.getLongValue(t10);
        if (longValue == 0 && (this.features & JSONWriter.MASK_NOT_WRITE_DEFAULT_VALUE) != 0) {
            return false;
        }
        writeDate(jSONWriter, longValue);
        return true;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterDate, com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t10) {
        writeDate(jSONWriter, false, this.propertyAccessor.getLongValue(t10));
    }
}
