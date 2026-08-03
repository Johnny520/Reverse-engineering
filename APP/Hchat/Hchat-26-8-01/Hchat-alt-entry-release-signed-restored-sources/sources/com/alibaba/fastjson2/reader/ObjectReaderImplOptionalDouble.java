package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.OptionalDouble;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplOptionalDouble extends ObjectReaderPrimitive {
    static final ObjectReaderImplOptionalDouble INSTANCE = new ObjectReaderImplOptionalDouble();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderImplOptionalDouble() {
        super(OptionalDouble.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        Double d10 = jSONReader.readDouble();
        return d10 == null ? OptionalDouble.empty() : OptionalDouble.of(d10.doubleValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        Double d10 = jSONReader.readDouble();
        return d10 == null ? OptionalDouble.empty() : OptionalDouble.of(d10.doubleValue());
    }
}
