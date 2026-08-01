package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderImplByte extends ObjectReaderPrimitive<Byte> {
    static final ObjectReaderImplByte INSTANCE = new ObjectReaderImplByte();
    public static final long HASH_TYPE = Fnv.hashCode64("B");

    public ObjectReaderImplByte() {
        super(Byte.class);
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
    public Byte readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        Integer int32 = jSONReader.readInt32();
        if (int32 == null) {
            return null;
        }
        return Byte.valueOf(int32.byteValue());
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Byte readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        Integer int32 = jSONReader.readInt32();
        if (int32 == null) {
            return null;
        }
        return Byte.valueOf(int32.byteValue());
    }
}
