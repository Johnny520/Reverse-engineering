package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterUUIDFunc<T> extends com.alibaba.fastjson2.writer.FieldWriterObjectFinal<T> {
    final java.util.function.Function function;

    public FieldWriterUUIDFunc(java.lang.String r12, int r13, long r14, java.lang.String r16, java.lang.String r17, java.lang.reflect.Type r18, java.lang.Class r19, java.lang.reflect.Method r20, java.util.function.Function r21) {
            r11 = this;
            r9 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r10 = r20
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            r12 = r21
            r11.function = r12
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public java.lang.Object getFieldValue(java.lang.Object r2) {
            r1 = this;
            java.util.function.Function r0 = r1.function
            java.lang.Object r2 = r0.apply(r2)
            return r2
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterObjectFinal, com.alibaba.fastjson2.writer.FieldWriterObject, com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(com.alibaba.fastjson2.JSONWriter r8, T r9) {
            r7 = this;
            java.util.function.Function r0 = r7.function
            java.lang.Object r9 = r0.apply(r9)
            r2 = r9
            java.util.UUID r2 = (java.util.UUID) r2
            r9 = 1
            if (r2 != 0) goto L27
            long r0 = r7.features
            long r2 = r8.getFeatures()
            long r0 = r0 | r2
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNulls
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L25
            r7.writeFieldName(r8)
            r8.writeNull()
            return r9
        L25:
            r8 = 0
            return r8
        L27:
            r7.writeFieldName(r8)
            com.alibaba.fastjson2.writer.ObjectWriter r0 = r7.objectWriter
            if (r0 != 0) goto L36
            java.lang.Class<java.util.UUID> r0 = java.util.UUID.class
            com.alibaba.fastjson2.writer.ObjectWriter r0 = r7.getObjectWriter(r8, r0)
            r7.objectWriter = r0
        L36:
            com.alibaba.fastjson2.writer.ObjectWriter r0 = r7.objectWriter
            com.alibaba.fastjson2.writer.ObjectWriterImplUUID r1 = com.alibaba.fastjson2.writer.ObjectWriterImplUUID.INSTANCE
            if (r0 == r1) goto L49
            com.alibaba.fastjson2.writer.ObjectWriter r0 = r7.objectWriter
            java.lang.String r3 = r7.fieldName
            java.lang.Class r4 = r7.fieldClass
            long r5 = r7.features
            r1 = r8
            r0.write(r1, r2, r3, r4, r5)
            goto L4d
        L49:
            r1 = r8
            r1.writeUUID(r2)
        L4d:
            return r9
    }
}
