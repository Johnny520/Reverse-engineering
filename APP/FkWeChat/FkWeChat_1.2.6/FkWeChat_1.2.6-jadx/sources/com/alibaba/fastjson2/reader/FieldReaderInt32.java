package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Locale;
import java.util.function.BiConsumer;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderInt32<T, V> extends FieldReader<T> {
    public FieldReaderInt32(String str, Class<V> cls, int i10, long j10, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, Field field, BiConsumer<T, V> biConsumer, String str3, Parameter parameter) {
        super(str, cls, cls, i10, j10, str2, locale, obj, jSONSchema, method, field, biConsumer, str3, parameter);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t10, Object obj) {
        this.propertyAccessor.setObject(t10, obj);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t10) throws Exception {
        Integer int32;
        try {
            int32 = jSONReader.readInt32();
        } catch (Exception e10) {
            if ((jSONReader.features(this.features) & JSONReader.Feature.NullOnError.mask) == 0) {
                throw e10;
            }
            int32 = null;
        }
        this.propertyAccessor.setObject(t10, int32);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public Object readFieldValue(JSONReader jSONReader) {
        return jSONReader.readInt32();
    }
}
