package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Locale;
import java.util.function.ObjIntConsumer;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderInt32Value<T> extends FieldReader<T> {
    /* JADX WARN: Illegal instructions before constructor call */
    public FieldReaderInt32Value(String str, int i10, long j10, String str2, Locale locale, Integer num, JSONSchema jSONSchema, Method method, Field field, ObjIntConsumer<T> objIntConsumer, String str3, Parameter parameter) {
        Class cls = Integer.TYPE;
        super(str, cls, cls, i10, j10, str2, locale, num, jSONSchema, method, field, objIntConsumer, str3, parameter);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t10, int i10) {
        this.propertyAccessor.setIntValue(t10, i10);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t10) {
        this.propertyAccessor.setIntValue(t10, jSONReader.readInt32Value());
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t10, Object obj) {
        this.propertyAccessor.setObject(t10, obj);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public Object readFieldValue(JSONReader jSONReader) {
        return Integer.valueOf(jSONReader.readInt32Value());
    }
}
