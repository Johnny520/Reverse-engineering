package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Locale;
import java.util.function.ObjLongConsumer;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderInt64Value<T> extends FieldReader<T> {
    /* JADX WARN: Illegal instructions before constructor call */
    public FieldReaderInt64Value(String str, int i10, long j10, String str2, Locale locale, Long l10, JSONSchema jSONSchema, Method method, Field field, ObjLongConsumer<T> objLongConsumer, String str3, Parameter parameter) {
        Class cls = Long.TYPE;
        super(str, cls, cls, i10, j10, str2, locale, l10, jSONSchema, method, field, objLongConsumer, str3, parameter);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t10, long j10) {
        this.propertyAccessor.setLongValue(t10, j10);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t10) {
        this.propertyAccessor.setLongValue(t10, jSONReader.readInt64Value());
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t10, Object obj) {
        this.propertyAccessor.setObject(t10, obj);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public Object readFieldValue(JSONReader jSONReader) {
        return Long.valueOf(jSONReader.readInt64Value());
    }
}
