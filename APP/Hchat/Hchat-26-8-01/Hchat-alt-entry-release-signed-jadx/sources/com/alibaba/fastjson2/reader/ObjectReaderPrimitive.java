package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
abstract class ObjectReaderPrimitive<T> implements ObjectReader<T> {
    protected final Class objectClass;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderPrimitive(Class cls) {
        this.objectClass = cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Class getObjectClass() {
        return this.objectClass;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public abstract T readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3);
}
