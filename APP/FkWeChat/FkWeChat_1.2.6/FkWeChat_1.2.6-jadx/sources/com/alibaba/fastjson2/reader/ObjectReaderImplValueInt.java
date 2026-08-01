package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.C1565a;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Type;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderImplValueInt<T> implements ObjectReader<T> {
    final long features;
    final IntFunction<T> function;
    final JSONSchema schema;

    public ObjectReaderImplValueInt(Class<T> cls, long j10, JSONSchema jSONSchema, IntFunction<T> intFunction) {
        this.features = j10;
        this.schema = jSONSchema;
        this.function = intFunction;
    }

    /* JADX INFO: renamed from: of */
    public static <T> ObjectReaderImplValueInt<T> m6396of(Class<T> cls, IntFunction<T> intFunction) {
        return new ObjectReaderImplValueInt<>(cls, 0L, null, intFunction);
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
        int int32Value = jSONReader.readInt32Value();
        JSONSchema jSONSchema = this.schema;
        if (jSONSchema != null) {
            jSONSchema.validate(int32Value);
        }
        try {
            return this.function.apply(int32Value);
        } catch (Exception e10) {
            C1565a.m6255a(jSONReader.info("create object error"), e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: of */
    public static <T> ObjectReaderImplValueInt<T> m6395of(Class<T> cls, long j10, JSONSchema jSONSchema, IntFunction<T> intFunction) {
        return new ObjectReaderImplValueInt<>(cls, j10, jSONSchema, intFunction);
    }
}
