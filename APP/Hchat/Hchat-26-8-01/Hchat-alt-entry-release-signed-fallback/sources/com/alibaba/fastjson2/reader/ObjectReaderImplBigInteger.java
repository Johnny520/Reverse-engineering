package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplBigInteger extends com.alibaba.fastjson2.reader.ObjectReaderPrimitive<java.math.BigInteger> {
    static final com.alibaba.fastjson2.reader.ObjectReaderImplBigInteger INSTANCE = null;

    static {
            com.alibaba.fastjson2.reader.ObjectReaderImplBigInteger r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplBigInteger
            r0.<init>()
            com.alibaba.fastjson2.reader.ObjectReaderImplBigInteger.INSTANCE = r0
            return
    }

    public ObjectReaderImplBigInteger() {
            r1 = this;
            java.lang.Class<java.math.BigInteger> r0 = java.math.BigInteger.class
            r1.<init>(r0)
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.math.BigInteger r1 = r0.readJSONBObject(r1, r2, r3, r4)
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public java.math.BigInteger readJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.math.BigInteger r1 = r1.readBigInteger()
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.math.BigInteger r1 = r0.readObject(r1, r2, r3, r4)
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.math.BigInteger readObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.math.BigInteger r1 = r1.readBigInteger()
            return r1
    }
}
