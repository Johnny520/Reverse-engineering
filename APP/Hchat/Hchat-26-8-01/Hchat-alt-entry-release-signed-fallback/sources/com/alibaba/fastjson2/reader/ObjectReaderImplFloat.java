package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplFloat extends com.alibaba.fastjson2.reader.ObjectReaderPrimitive {
    static final com.alibaba.fastjson2.reader.ObjectReaderImplFloat INSTANCE = null;

    static {
            com.alibaba.fastjson2.reader.ObjectReaderImplFloat r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplFloat
            r0.<init>()
            com.alibaba.fastjson2.reader.ObjectReaderImplFloat.INSTANCE = r0
            return
    }

    public ObjectReaderImplFloat() {
            r1 = this;
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            r1.<init>(r0)
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.lang.Float r1 = r1.readFloat()
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.lang.Float r1 = r1.readFloat()
            return r1
    }
}
