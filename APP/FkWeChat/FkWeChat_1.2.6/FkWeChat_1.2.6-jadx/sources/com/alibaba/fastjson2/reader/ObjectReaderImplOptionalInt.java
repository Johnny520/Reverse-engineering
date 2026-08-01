package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.OptionalInt;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplOptionalInt extends ObjectReaderPrimitive {
    static final ObjectReaderImplOptionalInt INSTANCE = new ObjectReaderImplOptionalInt();

    public ObjectReaderImplOptionalInt() {
        super(OptionalInt.class);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        Integer int32 = jSONReader.readInt32();
        return int32 == null ? OptionalInt.empty() : OptionalInt.of(int32.intValue());
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        Integer int32 = jSONReader.readInt32();
        return int32 == null ? OptionalInt.empty() : OptionalInt.of(int32.intValue());
    }
}
