package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Locale;
import java.util.function.ObjDoubleConsumer;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderDoubleValue<T> extends FieldReader<T> {
    /* JADX WARN: Illegal instructions before constructor call */
    public FieldReaderDoubleValue(String str, int i10, long j10, String str2, Locale locale, Double d10, JSONSchema jSONSchema, Method method, Field field, ObjDoubleConsumer<T> objDoubleConsumer, String str3, Parameter parameter) {
        Class cls = Double.TYPE;
        super(str, cls, cls, i10, j10, str2, locale, d10, jSONSchema, method, field, objDoubleConsumer, str3, parameter);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t10, double d10) {
        this.propertyAccessor.setDoubleValue(t10, d10);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t10) {
        this.propertyAccessor.setDoubleValue(t10, jSONReader.readDoubleValue());
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t10, Object obj) {
        this.propertyAccessor.setObject(t10, obj);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public Object readFieldValue(JSONReader jSONReader) {
        return Double.valueOf(jSONReader.readDoubleValue());
    }
}
