package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.C1565a;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Type;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderImplValueString<T> implements ObjectReader<T> {
    final long features;
    final Function<String, T> function;
    final JSONSchema schema;

    public ObjectReaderImplValueString(Class<T> cls, long j10, JSONSchema jSONSchema, Function<String, T> function) {
        this.features = j10;
        this.schema = jSONSchema;
        this.function = function;
    }

    /* JADX INFO: renamed from: of */
    public static <T> ObjectReaderImplValueString<T> m6398of(Class<T> cls, Function<String, T> function) {
        return new ObjectReaderImplValueString<>(cls, 0L, null, function);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        return readObject(jSONReader, type, obj, j10);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.nextIfNullOrEmptyString()) {
            return null;
        }
        String string = jSONReader.readString();
        JSONSchema jSONSchema = this.schema;
        if (jSONSchema != null) {
            jSONSchema.validate(string);
        }
        try {
            return this.function.apply(string);
        } catch (Exception e10) {
            C1565a.m6255a(jSONReader.info("create object error"), e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: of */
    public static <T> ObjectReaderImplValueString<T> m6397of(Class<T> cls, long j10, JSONSchema jSONSchema, Function<String, T> function) {
        return new ObjectReaderImplValueString<>(cls, j10, jSONSchema, function);
    }
}
