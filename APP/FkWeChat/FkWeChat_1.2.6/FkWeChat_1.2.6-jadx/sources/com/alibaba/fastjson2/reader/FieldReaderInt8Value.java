package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.function.ObjByteConsumer;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderInt8Value<T> extends FieldReader<T> {
    /* JADX WARN: Illegal instructions before constructor call */
    public FieldReaderInt8Value(String str, int i10, long j10, String str2, Locale locale, Byte b10, JSONSchema jSONSchema, Method method, Field field, ObjByteConsumer<T> objByteConsumer, String str3, Parameter parameter) {
        Class cls = Byte.TYPE;
        super(str, cls, cls, i10, j10, str2, locale, b10, jSONSchema, method, field, objByteConsumer, str3, parameter);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t10, byte b10) {
        this.propertyAccessor.setByteValue(t10, b10);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t10) {
        this.propertyAccessor.setByteValue(t10, (byte) jSONReader.readInt32Value());
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t10, Object obj) {
        this.propertyAccessor.setObject(t10, obj);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public Object readFieldValue(JSONReader jSONReader) {
        return Byte.valueOf((byte) jSONReader.readInt32Value());
    }
}
