package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplInt64 extends com.alibaba.fastjson2.reader.ObjectReaderPrimitive<java.lang.Long> {
    static final com.alibaba.fastjson2.reader.ObjectReaderImplInt64 INSTANCE = null;

    static {
            com.alibaba.fastjson2.reader.ObjectReaderImplInt64 r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplInt64
            r0.<init>()
            com.alibaba.fastjson2.reader.ObjectReaderImplInt64.INSTANCE = r0
            return
    }

    public ObjectReaderImplInt64() {
            r1 = this;
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            r1.<init>(r0)
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Long readJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.lang.Long r1 = r1.readInt64()
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.lang.Long r1 = r0.readJSONBObject(r1, r2, r3, r4)
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Long readObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.lang.Long r1 = r1.readInt64()
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.lang.Long r1 = r0.readObject(r1, r2, r3, r4)
            return r1
    }
}
