package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.C1569c;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongFunction;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderImplFromLong<T> extends ObjectReaderPrimitive<T> {
    final LongFunction<T> creator;

    public ObjectReaderImplFromLong(Class<T> cls, LongFunction longFunction) {
        super(cls);
        this.creator = longFunction;
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
        if (this.objectClass != AtomicLong.class || !jSONReader.nextIfMatch(JSONB.Constants.BC_TYPED_ANY) || jSONReader.readTypeHashCode() == -1591858996898070466L) {
            return this.creator.apply(jSONReader.readInt64Value());
        }
        C1569c.m6258a(jSONReader.info(jSONReader.getString()));
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.nextIfNull()) {
            return null;
        }
        return this.creator.apply(jSONReader.readInt64Value());
    }
}
