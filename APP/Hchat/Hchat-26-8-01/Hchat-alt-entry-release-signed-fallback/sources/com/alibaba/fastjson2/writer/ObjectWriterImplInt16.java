package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplInt16 extends com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl {
    static final com.alibaba.fastjson2.writer.ObjectWriterImplInt16 INSTANCE = null;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterImplInt16 r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplInt16
            r0.<init>()
            com.alibaba.fastjson2.writer.ObjectWriterImplInt16.INSTANCE = r0
            return
    }

    public ObjectWriterImplInt16() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r5, java.lang.Object r6, java.lang.Object r7, java.lang.reflect.Type r8, long r9) {
            r4 = this;
            if (r6 != 0) goto L6
            r5.writeNumberNull()
            return
        L6:
            java.lang.Short r6 = (java.lang.Short) r6
            short r6 = r6.shortValue()
            com.alibaba.fastjson2.JSONWriter$Feature r7 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r0 = r7.mask
            long r0 = r0 & r9
            r2 = 0
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 == 0) goto L1b
            r5.writeString(r6)
            return
        L1b:
            r5.writeInt16(r6)
            long r6 = r5.getFeatures()
            long r6 = r6 | r9
            com.alibaba.fastjson2.JSONWriter$Feature r9 = com.alibaba.fastjson2.JSONWriter.Feature.WriteClassName
            long r9 = r9.mask
            long r6 = r6 & r9
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 == 0) goto L39
            java.lang.Class<java.lang.Short> r6 = java.lang.Short.class
            if (r8 == r6) goto L39
            java.lang.Class r6 = java.lang.Short.TYPE
            if (r8 == r6) goto L39
            r6 = 83
            r5.writeRaw(r6)
        L39:
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            if (r2 != 0) goto L6
            r1.writeNumberNull()
            return
        L6:
            java.lang.Short r2 = (java.lang.Short) r2
            short r2 = r2.shortValue()
            com.alibaba.fastjson2.JSONWriter$Feature r3 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r3 = r3.mask
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L1b
            r1.writeString(r2)
            return
        L1b:
            r1.writeInt16(r2)
            return
    }
}
