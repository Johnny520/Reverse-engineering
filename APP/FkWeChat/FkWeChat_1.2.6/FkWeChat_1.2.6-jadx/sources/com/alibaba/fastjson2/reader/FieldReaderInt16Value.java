package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.function.ObjShortConsumer;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderInt16Value<T> extends FieldReader<T> {
    /* JADX WARN: Illegal instructions before constructor call */
    public FieldReaderInt16Value(String str, int i10, long j10, String str2, Locale locale, Short sh, JSONSchema jSONSchema, Method method, Field field, ObjShortConsumer<T> objShortConsumer, String str3, Parameter parameter) {
        Class cls = Short.TYPE;
        super(str, cls, cls, i10, j10, str2, locale, sh, jSONSchema, method, field, objShortConsumer, str3, parameter);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t10, short s10) {
        this.propertyAccessor.setShortValue(t10, s10);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t10) {
        this.propertyAccessor.setShortValue(t10, (short) jSONReader.readInt32Value());
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t10, Object obj) {
        this.propertyAccessor.setObject(t10, obj);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public Object readFieldValue(JSONReader jSONReader) {
        return Short.valueOf((short) jSONReader.readInt32Value());
    }
}
