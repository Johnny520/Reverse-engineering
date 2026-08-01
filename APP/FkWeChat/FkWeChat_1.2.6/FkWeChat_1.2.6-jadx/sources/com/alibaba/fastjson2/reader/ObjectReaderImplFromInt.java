package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.C1569c;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderImplFromInt<T> extends ObjectReaderPrimitive<T> {
    final IntFunction<T> creator;

    public ObjectReaderImplFromInt(Class<T> cls, IntFunction intFunction) {
        super(cls);
        this.creator = intFunction;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ Object createInstance(long j10) {
        return super.createInstance(j10);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ Class getObjectClass() {
        return super.getObjectClass();
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public T readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.nextIfNull()) {
            return null;
        }
        if (this.objectClass != AtomicInteger.class || !jSONReader.nextIfMatch(JSONB.Constants.BC_TYPED_ANY) || jSONReader.readTypeHashCode() == 7576651708426282938L) {
            return this.creator.apply(jSONReader.readInt32Value());
        }
        C1569c.m6258a(jSONReader.info(jSONReader.getString()));
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.nextIfNull()) {
            return null;
        }
        return this.creator.apply(jSONReader.readInt32Value());
    }
}
