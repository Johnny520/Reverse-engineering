package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplInt64 extends com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl {
    static final com.alibaba.fastjson2.writer.ObjectWriterImplInt64 INSTANCE = null;
    final java.lang.Class defineClass;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterImplInt64 r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplInt64
            r1 = 0
            r0.<init>(r1)
            com.alibaba.fastjson2.writer.ObjectWriterImplInt64.INSTANCE = r0
            return
    }

    public ObjectWriterImplInt64(java.lang.Class r1) {
            r0 = this;
            r0.<init>()
            r0.defineClass = r1
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r5, java.lang.Object r6, java.lang.Object r7, java.lang.reflect.Type r8, long r9) {
            r4 = this;
            if (r6 != 0) goto L6
            r5.writeNumberNull()
            return
        L6:
            java.lang.Number r6 = (java.lang.Number) r6
            long r6 = r6.longValue()
            com.alibaba.fastjson2.JSONWriter$Feature r8 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r0 = r8.mask
            long r0 = r0 & r9
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1b
            r5.writeString(r6)
            return
        L1b:
            r5.writeInt64(r6)
            r0 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L52
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 > 0) goto L52
            com.alibaba.fastjson2.JSONWriter$Feature r6 = com.alibaba.fastjson2.JSONWriter.Feature.WriteClassName
            long r0 = r6.mask
            long r9 = r9 & r0
            int r7 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r7 == 0) goto L52
            long r9 = r5.getFeatures()
            long r6 = r6.mask
            long r6 = r6 & r9
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 != 0) goto L52
            long r6 = r8.mask
            com.alibaba.fastjson2.JSONWriter$Feature r8 = com.alibaba.fastjson2.JSONWriter.Feature.WriteLongAsString
            long r0 = r8.mask
            long r6 = r6 | r0
            long r6 = r6 & r9
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 == 0) goto L4d
            return
        L4d:
            r6 = 76
            r5.writeRaw(r6)
        L52:
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r3, java.lang.Object r4, java.lang.Object r5, java.lang.reflect.Type r6, long r7) {
            r2 = this;
            if (r4 != 0) goto L6
            r3.writeNumberNull()
            return
        L6:
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            com.alibaba.fastjson2.JSONWriter$Feature r6 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r0 = r6.mask
            long r6 = r7 & r0
            r0 = 0
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L1c
            r3.writeString(r4)
            return
        L1c:
            r3.writeInt64(r4)
            return
    }
}
