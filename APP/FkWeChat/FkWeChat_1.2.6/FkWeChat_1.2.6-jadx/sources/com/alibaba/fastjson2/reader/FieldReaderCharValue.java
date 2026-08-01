package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.function.ObjCharConsumer;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderCharValue<T> extends FieldReader<T> {
    /* JADX WARN: Illegal instructions before constructor call */
    public FieldReaderCharValue(String str, int i10, long j10, String str2, Locale locale, Character ch, JSONSchema jSONSchema, Method method, Field field, ObjCharConsumer<T> objCharConsumer, String str3, Parameter parameter) {
        Class cls = Character.TYPE;
        super(str, cls, cls, i10, j10, str2, locale, ch, jSONSchema, method, field, objCharConsumer, str3, parameter);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t10, char c10) {
        this.propertyAccessor.setCharValue(t10, c10);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public Object readFieldValue(JSONReader jSONReader) {
        String string = jSONReader.readString();
        char cCharAt = 0;
        if (string != null && !string.isEmpty()) {
            cCharAt = string.charAt(0);
        }
        return Character.valueOf(cCharAt);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t10, Object obj) {
        this.propertyAccessor.setObject(t10, obj);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t10) {
        char charValue = jSONReader.readCharValue();
        if (charValue == 0 && jSONReader.wasNull()) {
            return;
        }
        this.propertyAccessor.setCharValue(t10, charValue);
    }
}
