package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.function.BiConsumer;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderNumber<T, V> extends FieldReader<T> {
    public FieldReaderNumber(String str, Class<V> cls, int i10, long j10, String str2, Locale locale, Number number, JSONSchema jSONSchema, Method method, Field field, BiConsumer<T, V> biConsumer) {
        super(str, cls, cls, i10, j10, str2, locale, number, jSONSchema, method, field, biConsumer, null, null);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t10, Object obj) {
        this.propertyAccessor.setObject(t10, obj);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t10) throws Exception {
        Number number;
        try {
            number = jSONReader.readNumber();
        } catch (Exception e10) {
            if ((jSONReader.features(this.features) & JSONReader.Feature.NullOnError.mask) == 0) {
                throw e10;
            }
            number = null;
        }
        this.propertyAccessor.setObject(t10, number);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t10, int i10) {
        this.propertyAccessor.setIntValue(t10, i10);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t10, long j10) {
        this.propertyAccessor.setLongValue(t10, j10);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public Object readFieldValue(JSONReader jSONReader) {
        return jSONReader.readNumber();
    }
}
