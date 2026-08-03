package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderImplStringArray extends com.alibaba.fastjson2.reader.ObjectReaderPrimitive {
    public static final long HASH_TYPE = 0;
    static final com.alibaba.fastjson2.reader.ObjectReaderImplStringArray INSTANCE = null;

    static {
            com.alibaba.fastjson2.reader.ObjectReaderImplStringArray r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplStringArray
            r0.<init>()
            com.alibaba.fastjson2.reader.ObjectReaderImplStringArray.INSTANCE = r0
            java.lang.String r0 = "[String"
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.reader.ObjectReaderImplStringArray.HASH_TYPE = r0
            return
    }

    public ObjectReaderImplStringArray() {
            r1 = this;
            java.lang.Class<java.lang.Long[]> r0 = java.lang.Long[].class
            r1.<init>(r0)
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object createInstance(java.util.Collection r3, long r4) {
            r2 = this;
            int r4 = r3.size()
            java.lang.String[] r4 = new java.lang.String[r4]
            java.util.Iterator r3 = r3.iterator()
            r5 = 0
        Lb:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r3.next()
            if (r0 != 0) goto L19
            r0 = 0
            goto L24
        L19:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L20
            java.lang.String r0 = (java.lang.String) r0
            goto L24
        L20:
            java.lang.String r0 = r0.toString()
        L24:
            int r1 = r5 + 1
            r4[r5] = r0
            r5 = r1
            goto Lb
        L2a:
            return r4
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ java.lang.Class getObjectClass() {
            r1 = this;
            java.lang.Class r0 = super.getObjectClass()
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.lang.String[] r1 = r1.readStringArray()
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.lang.String[] r1 = r1.readStringArray()
            return r1
    }
}
