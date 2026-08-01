package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.OptionalDouble;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplOptionalDouble extends ObjectReaderPrimitive {
    static final ObjectReaderImplOptionalDouble INSTANCE = new ObjectReaderImplOptionalDouble();

    public ObjectReaderImplOptionalDouble() {
        super(OptionalDouble.class);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        Double d10 = jSONReader.readDouble();
        return d10 == null ? OptionalDouble.empty() : OptionalDouble.of(d10.doubleValue());
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        Double d10 = jSONReader.readDouble();
        return d10 == null ? OptionalDouble.empty() : OptionalDouble.of(d10.doubleValue());
    }
}
