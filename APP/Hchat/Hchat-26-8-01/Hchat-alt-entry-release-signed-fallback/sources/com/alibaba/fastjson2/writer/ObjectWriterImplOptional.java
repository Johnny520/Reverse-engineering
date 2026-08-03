package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplOptional extends com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl {
    static final com.alibaba.fastjson2.writer.ObjectWriterImplOptional INSTANCE = null;
    long features;
    final java.lang.String format;
    final java.util.Locale locale;
    java.lang.reflect.Type valueType;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterImplOptional r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplOptional
            r1 = 0
            r0.<init>(r1, r1)
            com.alibaba.fastjson2.writer.ObjectWriterImplOptional.INSTANCE = r0
            return
    }

    public ObjectWriterImplOptional(java.lang.String r1, java.util.Locale r2) {
            r0 = this;
            r0.<init>()
            r0.format = r1
            r0.locale = r2
            return
    }

    public ObjectWriterImplOptional(java.lang.reflect.Type r1, java.lang.String r2, java.util.Locale r3) {
            r0 = this;
            r0.<init>()
            r0.valueType = r1
            r0.format = r2
            r0.locale = r3
            return
    }

    public static com.alibaba.fastjson2.writer.ObjectWriterImplOptional of(java.lang.String r1, java.util.Locale r2) {
            if (r1 != 0) goto L5
            com.alibaba.fastjson2.writer.ObjectWriterImplOptional r1 = com.alibaba.fastjson2.writer.ObjectWriterImplOptional.INSTANCE
            return r1
        L5:
            com.alibaba.fastjson2.writer.ObjectWriterImplOptional r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplOptional
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r8, java.lang.Object r9, java.lang.Object r10, java.lang.reflect.Type r11, long r12) {
            r7 = this;
            if (r9 != 0) goto L6
            r8.writeNull()
            return
        L6:
            java.util.Optional r9 = (java.util.Optional) r9
            boolean r11 = r9.isPresent()
            if (r11 != 0) goto L12
            r8.writeNull()
            return
        L12:
            java.lang.Object r2 = r9.get()
            java.lang.Class r9 = r2.getClass()
            java.lang.String r11 = r7.format
            r12 = 0
            if (r11 == 0) goto L25
            java.util.Locale r13 = r7.locale
            com.alibaba.fastjson2.writer.ObjectWriter r12 = com.alibaba.fastjson2.writer.FieldWriter.getObjectWriter(r12, r12, r11, r13, r9)
        L25:
            if (r12 != 0) goto L2b
            com.alibaba.fastjson2.writer.ObjectWriter r12 = r8.getObjectWriter(r9)
        L2b:
            r0 = r12
            java.lang.reflect.Type r4 = r7.valueType
            long r5 = r7.features
            r1 = r8
            r3 = r10
            r0.write(r1, r2, r3, r4, r5)
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r8, java.lang.Object r9, java.lang.Object r10, java.lang.reflect.Type r11, long r12) {
            r7 = this;
            if (r9 != 0) goto L6
            r8.writeNull()
            return
        L6:
            java.util.Optional r9 = (java.util.Optional) r9
            boolean r11 = r9.isPresent()
            if (r11 != 0) goto L12
            r8.writeNull()
            return
        L12:
            java.lang.Object r2 = r9.get()
            java.lang.Class r9 = r2.getClass()
            com.alibaba.fastjson2.writer.ObjectWriter r0 = r8.getObjectWriter(r9)
            r4 = 0
            r1 = r8
            r3 = r10
            r5 = r12
            r0.writeJSONB(r1, r2, r3, r4, r5)
            return
    }
}
