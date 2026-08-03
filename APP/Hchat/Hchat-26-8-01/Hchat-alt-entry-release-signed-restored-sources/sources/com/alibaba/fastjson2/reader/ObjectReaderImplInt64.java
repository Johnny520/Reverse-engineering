package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplInt64 extends ObjectReaderPrimitive<Long> {
    static final ObjectReaderImplInt64 INSTANCE = new ObjectReaderImplInt64();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderImplInt64() {
        super(Long.class);
    }

    /* JADX DEBUG: Method merged with bridge method: readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object; */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Long readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        return jSONReader.readInt64();
    }

    /* JADX DEBUG: Method merged with bridge method: readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object; */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Long readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        return jSONReader.readInt64();
    }
}
