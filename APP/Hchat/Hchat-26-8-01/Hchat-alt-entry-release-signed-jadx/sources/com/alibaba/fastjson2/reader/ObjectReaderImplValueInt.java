package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.function.IntFunction;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderImplValueInt<T> implements ObjectReader<T> {
    final long features;
    final IntFunction<T> function;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderImplValueInt(Class<T> cls, long j3, IntFunction<T> intFunction) {
        this.features = j3;
        this.function = intFunction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: of */
    public static <T> ObjectReaderImplValueInt<T> m1739of(Class<T> cls, IntFunction<T> intFunction) {
        return new ObjectReaderImplValueInt<>(cls, 0L, intFunction);
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
            return this.function.apply(jSONReader.readInt32Value());
        } catch (Exception e6) {
            C0086a.m465x(jSONReader.info("create object error"), e6);
            return null;
        }
    }

    /* JADX INFO: renamed from: of */
    public static <T> ObjectReaderImplValueInt<T> m1738of(Class<T> cls, long j3, IntFunction<T> intFunction) {
        return new ObjectReaderImplValueInt<>(cls, j3, intFunction);
    }
}
