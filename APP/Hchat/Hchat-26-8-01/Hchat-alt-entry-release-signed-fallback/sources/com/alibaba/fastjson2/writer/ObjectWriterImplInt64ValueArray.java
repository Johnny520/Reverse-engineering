package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplInt64ValueArray extends com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl {
    static final com.alibaba.fastjson2.writer.ObjectWriterImplInt64ValueArray INSTANCE = null;
    static final long JSONB_TYPE_HASH = 0;
    static final byte[] JSONB_TYPE_NAME_BYTES = null;
    private final java.util.function.Function<java.lang.Object, long[]> function;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterImplInt64ValueArray r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplInt64ValueArray
            r1 = 0
            r0.<init>(r1)
            com.alibaba.fastjson2.writer.ObjectWriterImplInt64ValueArray.INSTANCE = r0
            java.lang.String r0 = "[J"
            byte[] r1 = com.alibaba.fastjson2.JSONB.toBytes(r0)
            com.alibaba.fastjson2.writer.ObjectWriterImplInt64ValueArray.JSONB_TYPE_NAME_BYTES = r1
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.writer.ObjectWriterImplInt64ValueArray.JSONB_TYPE_HASH = r0
            return
    }

    public ObjectWriterImplInt64ValueArray(java.util.function.Function<java.lang.Object, long[]> r1) {
            r0 = this;
            r0.<init>()
            r0.function = r1
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r3, java.lang.Object r4, java.lang.Object r5, java.lang.reflect.Type r6, long r7) {
            r2 = this;
            if (r4 != 0) goto L6
            r3.writeNull()
            return
        L6:
            com.alibaba.fastjson2.JSONWriter$Context r5 = r3.context
            com.alibaba.fastjson2.writer.ObjectWriterProvider r5 = r5.provider
            long r5 = r5.userDefineMask
            r0 = 4
            long r5 = r5 & r0
            r0 = 0
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L1e
            com.alibaba.fastjson2.JSONWriter$Context r5 = r3.context
            java.lang.Class<java.lang.Long> r6 = java.lang.Long.class
            com.alibaba.fastjson2.writer.ObjectWriter r5 = r5.getObjectWriter(r6)
            goto L1f
        L1e:
            r5 = 0
        L1f:
            java.util.function.Function<java.lang.Object, long[]> r6 = r2.function
            if (r6 == 0) goto L2a
            java.lang.Object r4 = r6.apply(r4)
            long[] r4 = (long[]) r4
            goto L2c
        L2a:
            long[] r4 = (long[]) r4
        L2c:
            if (r5 == 0) goto L44
            com.alibaba.fastjson2.writer.ObjectWriterImplInt32 r6 = com.alibaba.fastjson2.writer.ObjectWriterImplInt32.INSTANCE
            if (r5 != r6) goto L33
            goto L44
        L33:
            com.alibaba.fastjson2.JSONWriter$Feature r5 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r5 = r5.mask
            long r5 = r5 & r7
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L40
            r3.writeString(r4)
            return
        L40:
            r3.writeInt64(r4)
            return
        L44:
            com.alibaba.fastjson2.JSONWriter$Feature r5 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r5 = r5.mask
            long r5 = r5 & r7
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L51
            r3.writeString(r4)
            return
        L51:
            r3.writeInt64(r4)
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r3, java.lang.Object r4, java.lang.Object r5, java.lang.reflect.Type r6, long r7) {
            r2 = this;
            if (r4 != 0) goto L6
            r3.writeNull()
            return
        L6:
            boolean r5 = r3.isWriteTypeInfo(r4, r6)
            if (r5 == 0) goto L13
            byte[] r5 = com.alibaba.fastjson2.writer.ObjectWriterImplInt64ValueArray.JSONB_TYPE_NAME_BYTES
            long r0 = com.alibaba.fastjson2.writer.ObjectWriterImplInt64ValueArray.JSONB_TYPE_HASH
            r3.writeTypeName(r5, r0)
        L13:
            java.util.function.Function<java.lang.Object, long[]> r5 = r2.function
            if (r5 == 0) goto L1e
            java.lang.Object r4 = r5.apply(r4)
            long[] r4 = (long[]) r4
            goto L20
        L1e:
            long[] r4 = (long[]) r4
        L20:
            com.alibaba.fastjson2.JSONWriter$Feature r5 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r5 = r5.mask
            long r5 = r5 & r7
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L2f
            r3.writeString(r4)
            return
        L2f:
            r3.writeInt64(r4)
            return
    }
}
