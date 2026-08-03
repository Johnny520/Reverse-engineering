package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
abstract class ObjectReaderPrimitive<T> implements com.alibaba.fastjson2.reader.ObjectReader<T> {
    protected final java.lang.Class objectClass;

    public ObjectReaderPrimitive(java.lang.Class r1) {
            r0 = this;
            r0.<init>()
            r0.objectClass = r1
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Class getObjectClass() {
            r1 = this;
            java.lang.Class r0 = r1.objectClass
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public abstract T readJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4);
}
