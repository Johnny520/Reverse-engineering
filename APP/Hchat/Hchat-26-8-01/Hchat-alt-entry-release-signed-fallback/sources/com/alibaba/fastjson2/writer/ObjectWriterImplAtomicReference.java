package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplAtomicReference extends com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl {
    static final com.alibaba.fastjson2.writer.ObjectWriterImplAtomicReference INSTANCE = null;
    final java.lang.Class defineClass;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterImplAtomicReference r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplAtomicReference
            r1 = 0
            r0.<init>(r1)
            com.alibaba.fastjson2.writer.ObjectWriterImplAtomicReference.INSTANCE = r0
            return
    }

    public ObjectWriterImplAtomicReference(java.lang.Class r1) {
            r0 = this;
            r0.<init>()
            r0.defineClass = r1
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            if (r2 != 0) goto L6
            r1.writeNull()
            return
        L6:
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L11
            r1.writeNull()
        L11:
            r1.writeAny(r2)
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            if (r2 != 0) goto L6
            r1.writeNull()
            return
        L6:
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L11
            r1.writeNull()
        L11:
            r1.writeAny(r2)
            return
    }
}
