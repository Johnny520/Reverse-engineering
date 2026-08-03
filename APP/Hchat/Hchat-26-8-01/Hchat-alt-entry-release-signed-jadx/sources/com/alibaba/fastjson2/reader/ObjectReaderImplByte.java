package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderImplByte extends ObjectReaderPrimitive<Byte> {
    static final ObjectReaderImplByte INSTANCE = new ObjectReaderImplByte();
    public static final long HASH_TYPE = Fnv.hashCode64("B");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderImplByte() {
        super(Byte.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ Class getObjectClass() {
        return super.getObjectClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object; */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Byte readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        Integer int32 = jSONReader.readInt32();
        if (int32 == null) {
            return null;
        }
        return Byte.valueOf(int32.byteValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object; */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Byte readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        Integer int32 = jSONReader.readInt32();
        if (int32 == null) {
            return null;
        }
        return Byte.valueOf(int32.byteValue());
    }
}
