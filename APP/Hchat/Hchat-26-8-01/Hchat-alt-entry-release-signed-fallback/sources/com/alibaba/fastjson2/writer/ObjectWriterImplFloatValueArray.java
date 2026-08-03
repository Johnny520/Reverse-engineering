package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplFloatValueArray extends com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl {
    static final com.alibaba.fastjson2.writer.ObjectWriterImplFloatValueArray INSTANCE = null;
    static final long JSONB_TYPE_HASH = 0;
    static final byte[] JSONB_TYPE_NAME_BYTES = null;
    private final java.text.DecimalFormat format;
    private final java.util.function.Function<java.lang.Object, float[]> function;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterImplFloatValueArray r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplFloatValueArray
            r1 = 0
            r0.<init>(r1, r1)
            com.alibaba.fastjson2.writer.ObjectWriterImplFloatValueArray.INSTANCE = r0
            java.lang.String r0 = "[F"
            byte[] r1 = com.alibaba.fastjson2.JSONB.toBytes(r0)
            com.alibaba.fastjson2.writer.ObjectWriterImplFloatValueArray.JSONB_TYPE_NAME_BYTES = r1
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.writer.ObjectWriterImplFloatValueArray.JSONB_TYPE_HASH = r0
            return
    }

    public ObjectWriterImplFloatValueArray(java.text.DecimalFormat r1) {
            r0 = this;
            r0.<init>()
            r0.format = r1
            r1 = 0
            r0.function = r1
            return
    }

    public ObjectWriterImplFloatValueArray(java.util.function.Function<java.lang.Object, float[]> r1, java.text.DecimalFormat r2) {
            r0 = this;
            r0.<init>()
            r0.function = r1
            r0.format = r2
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            java.util.function.Function<java.lang.Object, float[]> r3 = r0.function
            if (r3 == 0) goto Ld
            if (r2 == 0) goto Ld
            java.lang.Object r2 = r3.apply(r2)
            float[] r2 = (float[]) r2
            goto Lf
        Ld:
            float[] r2 = (float[]) r2
        Lf:
            java.text.DecimalFormat r3 = r0.format
            if (r3 != 0) goto L26
            com.alibaba.fastjson2.JSONWriter$Feature r3 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r3 = r3.mask
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L22
            r1.writeString(r2)
            return
        L22:
            r1.writeFloat(r2)
            return
        L26:
            r1.writeFloat(r2, r3)
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r3, java.lang.Object r4, java.lang.Object r5, java.lang.reflect.Type r6, long r7) {
            r2 = this;
            boolean r5 = r3.isWriteTypeInfo(r4, r6)
            if (r5 == 0) goto Ld
            byte[] r5 = com.alibaba.fastjson2.writer.ObjectWriterImplFloatValueArray.JSONB_TYPE_NAME_BYTES
            long r0 = com.alibaba.fastjson2.writer.ObjectWriterImplFloatValueArray.JSONB_TYPE_HASH
            r3.writeTypeName(r5, r0)
        Ld:
            java.util.function.Function<java.lang.Object, float[]> r5 = r2.function
            if (r5 == 0) goto L1a
            if (r4 == 0) goto L1a
            java.lang.Object r4 = r5.apply(r4)
            float[] r4 = (float[]) r4
            goto L1c
        L1a:
            float[] r4 = (float[]) r4
        L1c:
            com.alibaba.fastjson2.JSONWriter$Feature r5 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r5 = r5.mask
            long r5 = r5 & r7
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L2b
            r3.writeString(r4)
            return
        L2b:
            r3.writeFloat(r4)
            return
    }
}
