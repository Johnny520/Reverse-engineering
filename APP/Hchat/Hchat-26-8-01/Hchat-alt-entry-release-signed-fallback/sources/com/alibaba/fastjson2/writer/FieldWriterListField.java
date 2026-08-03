package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterListField<T> extends com.alibaba.fastjson2.writer.FieldWriterList<T> {
    public FieldWriterListField(java.lang.String r14, java.lang.reflect.Type r15, int r16, long r17, java.lang.String r19, java.lang.String r20, java.lang.reflect.Type r21, java.lang.Class r22, java.lang.reflect.Field r23, java.lang.Class<?> r24) {
            r13 = this;
            r11 = 0
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r12 = r24
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11, r12)
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(com.alibaba.fastjson2.JSONWriter r9, T r10) {
            r8 = this;
            java.lang.Object r10 = r8.getFieldValue(r10)
            java.util.List r10 = (java.util.List) r10
            com.alibaba.fastjson2.JSONWriter$Context r0 = r9.context
            r1 = 1
            if (r10 != 0) goto L30
            long r2 = r8.features
            long r4 = r0.getFeatures()
            long r2 = r2 | r4
            com.alibaba.fastjson2.JSONWriter$Feature r10 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNulls
            long r4 = r10.mask
            com.alibaba.fastjson2.JSONWriter$Feature r10 = com.alibaba.fastjson2.JSONWriter.Feature.NullAsDefaultValue
            long r6 = r10.mask
            long r4 = r4 | r6
            com.alibaba.fastjson2.JSONWriter$Feature r10 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullListAsEmpty
            long r6 = r10.mask
            long r4 = r4 | r6
            long r4 = r4 & r2
            r6 = 0
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 == 0) goto L2e
            r8.writeFieldName(r9)
            r9.writeArrayNull(r2)
            return r1
        L2e:
            r9 = 0
            return r9
        L30:
            java.lang.String r0 = r9.setPath(r8, r10)
            if (r0 == 0) goto L40
            r8.writeFieldName(r9)
            r9.writeReference(r0)
            r9.popPath(r10)
            return r1
        L40:
            java.lang.reflect.Type r0 = r8.itemType
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r0 != r2) goto L4a
            r8.writeListStr(r9, r1, r10)
            goto L4d
        L4a:
            r8.writeList(r9, r1, r10)
        L4d:
            r9.popPath(r10)
            return r1
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(com.alibaba.fastjson2.JSONWriter r3, T r4) {
            r2 = this;
            java.lang.Object r4 = r2.getFieldValue(r4)
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto Lc
            r3.writeNull()
            return
        Lc:
            boolean r0 = r3.isRefDetect()
            if (r0 == 0) goto L21
            java.lang.String r1 = r2.fieldName
            java.lang.String r1 = r3.setPath(r1, r4)
            if (r1 == 0) goto L21
            r3.writeReference(r1)
            r3.popPath(r4)
            return
        L21:
            r1 = 0
            r2.writeList(r3, r1, r4)
            if (r0 == 0) goto L2a
            r3.popPath(r4)
        L2a:
            return
    }
}
