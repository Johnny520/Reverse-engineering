package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.C1569c;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderImplBitSet extends ObjectReaderPrimitive<BitSet> {
    static final ObjectReaderImplBitSet INSTANCE = new ObjectReaderImplBitSet();
    public static final long HASH_TYPE = Fnv.hashCode64("BitSet");

    public ObjectReaderImplBitSet() {
        super(BitSet.class);
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
    public BitSet readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.nextIfNull()) {
            return null;
        }
        if (!jSONReader.nextIfMatch(JSONB.Constants.BC_TYPED_ANY) || jSONReader.readTypeHashCode() == HASH_TYPE) {
            return BitSet.valueOf(jSONReader.readBinary());
        }
        C1569c.m6258a(jSONReader.info(jSONReader.getString()));
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public BitSet readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.nextIfNull()) {
            return null;
        }
        return BitSet.valueOf(jSONReader.readBinary());
    }
}
