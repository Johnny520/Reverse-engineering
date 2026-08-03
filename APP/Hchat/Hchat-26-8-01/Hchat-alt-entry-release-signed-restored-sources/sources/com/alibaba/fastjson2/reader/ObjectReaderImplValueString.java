package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.function.Function;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderImplValueString<T> implements ObjectReader<T> {
    final long features;
    final Function<String, T> function;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderImplValueString(Class<T> cls, long j3, Function<String, T> function) {
        this.features = j3;
        this.function = function;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: of */
    public static <T> ObjectReaderImplValueString<T> m1741of(Class<T> cls, Function<String, T> function) {
        return new ObjectReaderImplValueString<>(cls, 0L, function);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        return readObject(jSONReader, type, obj, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (jSONReader.nextIfNullOrEmptyString()) {
            return null;
        }
        try {
            return this.function.apply(jSONReader.readString());
        } catch (Exception e6) {
            C0086a.m465x(jSONReader.info("create object error"), e6);
            return null;
        }
    }

    /* JADX INFO: renamed from: of */
    public static <T> ObjectReaderImplValueString<T> m1740of(Class<T> cls, long j3, Function<String, T> function) {
        return new ObjectReaderImplValueString<>(cls, j3, function);
    }
}
