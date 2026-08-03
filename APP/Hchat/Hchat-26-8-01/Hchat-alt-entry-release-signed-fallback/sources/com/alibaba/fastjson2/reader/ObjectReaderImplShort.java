package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderImplShort extends com.alibaba.fastjson2.reader.ObjectReaderPrimitive {
    public static final long HASH_TYPE = 0;
    static final com.alibaba.fastjson2.reader.ObjectReaderImplShort INSTANCE = null;

    static {
            com.alibaba.fastjson2.reader.ObjectReaderImplShort r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplShort
            r0.<init>()
            com.alibaba.fastjson2.reader.ObjectReaderImplShort.INSTANCE = r0
            java.lang.String r0 = "S"
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.reader.ObjectReaderImplShort.HASH_TYPE = r0
            return
    }

    public ObjectReaderImplShort() {
            r1 = this;
            java.lang.Class<java.lang.Short> r0 = java.lang.Short.class
            r1.<init>(r0)
            return
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
            java.lang.Integer r1 = r1.readInt32()
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            short r1 = r1.shortValue()
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.lang.Integer r1 = r1.readInt32()
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            short r1 = r1.shortValue()
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
            return r1
    }
}
