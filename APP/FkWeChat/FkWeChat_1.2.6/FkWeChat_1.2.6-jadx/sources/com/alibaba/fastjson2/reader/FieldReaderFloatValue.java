package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.function.ObjFloatConsumer;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderFloatValue<T> extends FieldReader<T> {
    /* JADX WARN: Illegal instructions before constructor call */
    public FieldReaderFloatValue(String str, int i10, long j10, String str2, Locale locale, Float f10, JSONSchema jSONSchema, Method method, Field field, ObjFloatConsumer<T> objFloatConsumer, String str3, Parameter parameter) {
        Class cls = Float.TYPE;
        super(str, cls, cls, i10, j10, str2, locale, f10, jSONSchema, method, field, objFloatConsumer, str3, parameter);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t10, float f10) {
        this.propertyAccessor.setFloatValue(t10, f10);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t10) {
        this.propertyAccessor.setFloatValue(t10, jSONReader.readFloatValue());
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t10, Object obj) {
        this.propertyAccessor.setObject(t10, obj);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public Object readFieldValue(JSONReader jSONReader) {
        return Float.valueOf(jSONReader.readFloatValue());
    }
}
