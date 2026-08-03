package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplAtomicLongArray extends com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl {
    static final com.alibaba.fastjson2.writer.ObjectWriterImplAtomicLongArray INSTANCE = null;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterImplAtomicLongArray r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplAtomicLongArray
            r0.<init>()
            com.alibaba.fastjson2.writer.ObjectWriterImplAtomicLongArray.INSTANCE = r0
            return
    }

    public ObjectWriterImplAtomicLongArray() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            if (r2 != 0) goto L6
            r1.writeArrayNull()
            return
        L6:
            java.util.concurrent.atomic.AtomicLongArray r2 = (java.util.concurrent.atomic.AtomicLongArray) r2
            r1.startArray()
            r3 = 0
        Lc:
            int r4 = r2.length()
            if (r3 >= r4) goto L21
            if (r3 == 0) goto L17
            r1.writeComma()
        L17:
            long r4 = r2.get(r3)
            r1.writeInt64(r4)
            int r3 = r3 + 1
            goto Lc
        L21:
            r1.endArray()
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            if (r2 != 0) goto L6
            r1.writeArrayNull()
            return
        L6:
            java.util.concurrent.atomic.AtomicLongArray r2 = (java.util.concurrent.atomic.AtomicLongArray) r2
            int r3 = r2.length()
            r1.startArray(r3)
            r3 = 0
        L10:
            int r4 = r2.length()
            if (r3 >= r4) goto L20
            long r4 = r2.get(r3)
            r1.writeInt64(r4)
            int r3 = r3 + 1
            goto L10
        L20:
            return
    }
}
