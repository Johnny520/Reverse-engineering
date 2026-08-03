package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplUUID extends com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl {
    static final com.alibaba.fastjson2.writer.ObjectWriterImplUUID INSTANCE = null;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterImplUUID r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplUUID
            r0.<init>()
            com.alibaba.fastjson2.writer.ObjectWriterImplUUID.INSTANCE = r0
            return
    }

    public ObjectWriterImplUUID() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            if (r2 != 0) goto L6
            r1.writeNull()
            return
        L6:
            java.util.UUID r2 = (java.util.UUID) r2
            r1.writeUUID(r2)
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            if (r2 != 0) goto L6
            r1.writeNull()
            return
        L6:
            java.util.UUID r2 = (java.util.UUID) r2
            r1.writeUUID(r2)
            return
    }
}
