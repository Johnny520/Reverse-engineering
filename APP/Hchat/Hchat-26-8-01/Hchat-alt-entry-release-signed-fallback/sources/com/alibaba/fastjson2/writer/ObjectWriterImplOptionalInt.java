package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplOptionalInt extends com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl {
    static final com.alibaba.fastjson2.writer.ObjectWriterImplOptionalInt INSTANCE = null;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterImplOptionalInt r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplOptionalInt
            r0.<init>()
            com.alibaba.fastjson2.writer.ObjectWriterImplOptionalInt.INSTANCE = r0
            return
    }

    public ObjectWriterImplOptionalInt() {
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
            java.util.OptionalInt r2 = (java.util.OptionalInt) r2
            boolean r3 = r2.isPresent()
            if (r3 != 0) goto L12
            r1.writeNull()
            return
        L12:
            int r2 = r2.getAsInt()
            r1.writeInt32(r2)
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            if (r2 != 0) goto L6
            r1.writeNull()
            return
        L6:
            java.util.OptionalInt r2 = (java.util.OptionalInt) r2
            boolean r3 = r2.isPresent()
            if (r3 != 0) goto L12
            r1.writeNull()
            return
        L12:
            int r2 = r2.getAsInt()
            r1.writeInt32(r2)
            return
    }
}
