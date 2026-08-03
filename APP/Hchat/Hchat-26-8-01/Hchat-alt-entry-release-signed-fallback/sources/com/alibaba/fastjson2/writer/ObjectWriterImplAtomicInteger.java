package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplAtomicInteger extends com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl {
    static final com.alibaba.fastjson2.writer.ObjectWriterImplAtomicInteger INSTANCE = null;
    static final byte[] JSONB_TYPE_NAME_BYTES = null;
    final java.lang.Class defineClass;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterImplAtomicInteger r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplAtomicInteger
            r1 = 0
            r0.<init>(r1)
            com.alibaba.fastjson2.writer.ObjectWriterImplAtomicInteger.INSTANCE = r0
            java.lang.String r0 = "AtomicInteger"
            byte[] r0 = com.alibaba.fastjson2.JSONB.toBytes(r0)
            com.alibaba.fastjson2.writer.ObjectWriterImplAtomicInteger.JSONB_TYPE_NAME_BYTES = r0
            return
    }

    public ObjectWriterImplAtomicInteger(java.lang.Class r1) {
            r0 = this;
            r0.<init>()
            r0.defineClass = r1
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            if (r2 != 0) goto L6
            r1.writeNumberNull()
            return
        L6:
            java.util.concurrent.atomic.AtomicInteger r2 = (java.util.concurrent.atomic.AtomicInteger) r2
            int r2 = r2.intValue()
            r1.writeInt32(r2)
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            if (r2 != 0) goto L6
            r1.writeNumberNull()
            return
        L6:
            java.util.concurrent.atomic.AtomicInteger r2 = (java.util.concurrent.atomic.AtomicInteger) r2
            boolean r3 = r1.isWriteTypeInfo(r2, r4)
            if (r3 == 0) goto L18
            byte[] r3 = com.alibaba.fastjson2.writer.ObjectWriterImplAtomicInteger.JSONB_TYPE_NAME_BYTES
            r4 = 7576651708426282938(0x6925ac96039ae7ba, double:3.24033204513211E198)
            r1.writeTypeName(r3, r4)
        L18:
            int r2 = r2.intValue()
            r1.writeInt32(r2)
            return
    }
}
