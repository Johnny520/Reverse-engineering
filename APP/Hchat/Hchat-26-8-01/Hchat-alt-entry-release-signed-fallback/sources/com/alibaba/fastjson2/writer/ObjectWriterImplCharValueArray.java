package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplCharValueArray extends com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl {
    static final com.alibaba.fastjson2.writer.ObjectWriterImplCharValueArray INSTANCE = null;
    static final long JSONB_TYPE_HASH = 0;
    static final byte[] JSONB_TYPE_NAME_BYTES = null;
    private final java.util.function.Function<java.lang.Object, char[]> function;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterImplCharValueArray r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplCharValueArray
            r1 = 0
            r0.<init>(r1)
            com.alibaba.fastjson2.writer.ObjectWriterImplCharValueArray.INSTANCE = r0
            java.lang.String r0 = "[C"
            byte[] r1 = com.alibaba.fastjson2.JSONB.toBytes(r0)
            com.alibaba.fastjson2.writer.ObjectWriterImplCharValueArray.JSONB_TYPE_NAME_BYTES = r1
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.writer.ObjectWriterImplCharValueArray.JSONB_TYPE_HASH = r0
            return
    }

    public ObjectWriterImplCharValueArray(java.util.function.Function<java.lang.Object, char[]> r1) {
            r0 = this;
            r0.<init>()
            r0.function = r1
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            java.util.function.Function<java.lang.Object, char[]> r3 = r0.function
            if (r3 == 0) goto Ld
            if (r2 == 0) goto Ld
            java.lang.Object r2 = r3.apply(r2)
            char[] r2 = (char[]) r2
            goto Lf
        Ld:
            char[] r2 = (char[]) r2
        Lf:
            boolean r3 = r1.utf16
            if (r3 == 0) goto L19
            r3 = 0
            int r4 = r2.length
            r1.writeString(r2, r3, r4)
            return
        L19:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r2)
            r1.writeString(r3)
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            boolean r3 = r1.isWriteTypeInfo(r2, r4, r5)
            if (r3 == 0) goto Ld
            byte[] r3 = com.alibaba.fastjson2.writer.ObjectWriterImplCharValueArray.JSONB_TYPE_NAME_BYTES
            long r4 = com.alibaba.fastjson2.writer.ObjectWriterImplCharValueArray.JSONB_TYPE_HASH
            r1.writeTypeName(r3, r4)
        Ld:
            java.util.function.Function<java.lang.Object, char[]> r3 = r0.function
            if (r3 == 0) goto L1a
            if (r2 == 0) goto L1a
            java.lang.Object r2 = r3.apply(r2)
            char[] r2 = (char[]) r2
            goto L1c
        L1a:
            char[] r2 = (char[]) r2
        L1c:
            r3 = 0
            int r4 = r2.length
            r1.writeString(r2, r3, r4)
            return
    }
}
