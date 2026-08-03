package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplCurrency extends com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl {
    static final com.alibaba.fastjson2.writer.ObjectWriterImplCurrency INSTANCE = null;
    static final com.alibaba.fastjson2.writer.ObjectWriterImplCurrency INSTANCE_FOR_FIELD = null;
    static final long JSONB_TYPE_HASH = 0;
    static final byte[] JSONB_TYPE_NAME_BYTES = null;
    final java.lang.Class defineClass;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterImplCurrency r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplCurrency
            r1 = 0
            r0.<init>(r1)
            com.alibaba.fastjson2.writer.ObjectWriterImplCurrency.INSTANCE = r0
            com.alibaba.fastjson2.writer.ObjectWriterImplCurrency r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplCurrency
            r0.<init>(r1)
            com.alibaba.fastjson2.writer.ObjectWriterImplCurrency.INSTANCE_FOR_FIELD = r0
            java.lang.Class<java.util.Currency> r0 = java.util.Currency.class
            java.lang.String r1 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r0)
            byte[] r1 = com.alibaba.fastjson2.JSONB.toBytes(r1)
            com.alibaba.fastjson2.writer.ObjectWriterImplCurrency.JSONB_TYPE_NAME_BYTES = r1
            java.lang.String r0 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r0)
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.writer.ObjectWriterImplCurrency.JSONB_TYPE_HASH = r0
            return
    }

    public ObjectWriterImplCurrency(java.lang.Class r1) {
            r0 = this;
            r0.<init>()
            r0.defineClass = r1
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r2, java.lang.Object r3, java.lang.Object r4, java.lang.reflect.Type r5, long r6) {
            r1 = this;
            boolean r0 = r2.jsonb
            if (r0 == 0) goto L8
            r1.writeJSONB(r2, r3, r4, r5, r6)
            return
        L8:
            if (r3 != 0) goto Le
            r2.writeNull()
            return
        Le:
            java.util.Currency r3 = (java.util.Currency) r3
            java.lang.String r3 = r3.getCurrencyCode()
            r2.writeString(r3)
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            if (r2 != 0) goto L6
            r1.writeNull()
            return
        L6:
            java.util.Currency r2 = (java.util.Currency) r2
            boolean r3 = r1.isWriteTypeInfo(r2)
            if (r3 == 0) goto L19
            java.lang.Class r3 = r0.defineClass
            if (r3 != 0) goto L19
            byte[] r3 = com.alibaba.fastjson2.writer.ObjectWriterImplCurrency.JSONB_TYPE_NAME_BYTES
            long r4 = com.alibaba.fastjson2.writer.ObjectWriterImplCurrency.JSONB_TYPE_HASH
            r1.writeTypeName(r3, r4)
        L19:
            java.lang.String r2 = r2.getCurrencyCode()
            r1.writeString(r2)
            return
    }
}
