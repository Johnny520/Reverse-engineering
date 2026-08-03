package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderImplByte extends com.alibaba.fastjson2.reader.ObjectReaderPrimitive<java.lang.Byte> {
    public static final long HASH_TYPE = 0;
    static final com.alibaba.fastjson2.reader.ObjectReaderImplByte INSTANCE = null;

    static {
            com.alibaba.fastjson2.reader.ObjectReaderImplByte r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplByte
            r0.<init>()
            com.alibaba.fastjson2.reader.ObjectReaderImplByte.INSTANCE = r0
            java.lang.String r0 = "B"
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.reader.ObjectReaderImplByte.HASH_TYPE = r0
            return
    }

    public ObjectReaderImplByte() {
            r1 = this;
            java.lang.Class<java.lang.Byte> r0 = java.lang.Byte.class
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
    public java.lang.Byte readJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.lang.Integer r1 = r1.readInt32()
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            byte r1 = r1.byteValue()
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.lang.Byte r1 = r0.readJSONBObject(r1, r2, r3, r4)
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Byte readObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.lang.Integer r1 = r1.readInt32()
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            byte r1 = r1.byteValue()
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.lang.Byte r1 = r0.readObject(r1, r2, r3, r4)
            return r1
    }
}
