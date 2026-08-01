package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplBigInteger extends ObjectReaderPrimitive<BigInteger> {
    static final ObjectReaderImplBigInteger INSTANCE = new ObjectReaderImplBigInteger();

    public ObjectReaderImplBigInteger() {
        super(BigInteger.class);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public BigInteger readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        return jSONReader.readBigInteger();
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public BigInteger readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        return jSONReader.readBigInteger();
    }
}
