package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplAtomicReference extends ObjectReaderPrimitive {
    static final ObjectReaderImplAtomicReference INSTANCE = new ObjectReaderImplAtomicReference(Object.class);
    final Type referenceType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderImplAtomicReference(Type type) {
        super(AtomicReference.class);
        this.referenceType = type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (jSONReader.nextIfNull()) {
            return null;
        }
        return new AtomicReference(jSONReader.read(this.referenceType));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (jSONReader.nextIfNull()) {
            return null;
        }
        return new AtomicReference(jSONReader.read(this.referenceType));
    }
}
