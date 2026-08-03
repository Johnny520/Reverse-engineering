package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplAtomicReference extends com.alibaba.fastjson2.reader.ObjectReaderPrimitive {
    static final com.alibaba.fastjson2.reader.ObjectReaderImplAtomicReference INSTANCE = null;
    final java.lang.reflect.Type referenceType;

    static {
            com.alibaba.fastjson2.reader.ObjectReaderImplAtomicReference r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplAtomicReference
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r0.<init>(r1)
            com.alibaba.fastjson2.reader.ObjectReaderImplAtomicReference.INSTANCE = r0
            return
    }

    public ObjectReaderImplAtomicReference(java.lang.reflect.Type r2) {
            r1 = this;
            java.lang.Class<java.util.concurrent.atomic.AtomicReference> r0 = java.util.concurrent.atomic.AtomicReference.class
            r1.<init>(r0)
            r1.referenceType = r2
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            boolean r2 = r1.nextIfNull()
            if (r2 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.reflect.Type r2 = r0.referenceType
            java.lang.Object r1 = r1.read(r2)
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>(r1)
            return r2
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            boolean r2 = r1.nextIfNull()
            if (r2 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.reflect.Type r2 = r0.referenceType
            java.lang.Object r1 = r1.read(r2)
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>(r1)
            return r2
    }
}
