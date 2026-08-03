package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplClass extends com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl {
    static final com.alibaba.fastjson2.writer.ObjectWriterImplClass INSTANCE = null;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterImplClass r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplClass
            r0.<init>()
            com.alibaba.fastjson2.writer.ObjectWriterImplClass.INSTANCE = r0
            return
    }

    public ObjectWriterImplClass() {
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
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.String r2 = r2.getName()
            r1.writeString(r2)
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            if (r2 != 0) goto L6
            r1.writeNull()
            return
        L6:
            boolean r3 = r1.isWriteTypeInfo(r2, r4, r5)
            if (r3 == 0) goto L11
            java.lang.String r3 = "java.lang.Class"
            r1.writeTypeName(r3)
        L11:
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.String r2 = r2.getName()
            r1.writeString(r2)
            return
    }
}
