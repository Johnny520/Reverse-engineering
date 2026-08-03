package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplBigInteger extends ObjectReaderPrimitive<BigInteger> {
    static final ObjectReaderImplBigInteger INSTANCE = new ObjectReaderImplBigInteger();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderImplBigInteger() {
        super(BigInteger.class);
    }

    /* JADX DEBUG: Method merged with bridge method: readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object; */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public BigInteger readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        return jSONReader.readBigInteger();
    }

    /* JADX DEBUG: Method merged with bridge method: readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object; */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public BigInteger readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        return jSONReader.readBigInteger();
    }
}
