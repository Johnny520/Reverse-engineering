package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplOptionalLong extends com.alibaba.fastjson2.reader.ObjectReaderPrimitive {
    static final com.alibaba.fastjson2.reader.ObjectReaderImplOptionalLong INSTANCE = null;

    static {
            com.alibaba.fastjson2.reader.ObjectReaderImplOptionalLong r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplOptionalLong
            r0.<init>()
            com.alibaba.fastjson2.reader.ObjectReaderImplOptionalLong.INSTANCE = r0
            return
    }

    public ObjectReaderImplOptionalLong() {
            r1 = this;
            java.lang.Class<java.util.OptionalLong> r0 = java.util.OptionalLong.class
            r1.<init>(r0)
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.lang.Long r1 = r1.readInt64()
            if (r1 != 0) goto Lb
            java.util.OptionalLong r1 = java.util.OptionalLong.empty()
            return r1
        Lb:
            long r1 = r1.longValue()
            java.util.OptionalLong r1 = java.util.OptionalLong.of(r1)
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.lang.Long r1 = r1.readInt64()
            if (r1 != 0) goto Lb
            java.util.OptionalLong r1 = java.util.OptionalLong.empty()
            return r1
        Lb:
            long r1 = r1.longValue()
            java.util.OptionalLong r1 = java.util.OptionalLong.of(r1)
            return r1
    }
}
