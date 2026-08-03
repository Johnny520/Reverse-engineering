package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterStringField<T> extends com.alibaba.fastjson2.writer.FieldWriter<T> {
    public FieldWriterStringField(java.lang.String r12, int r13, long r14, java.lang.String r16, java.lang.String r17, java.lang.reflect.Field r18) {
            r11 = this;
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r10 = 0
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r5 = r16
            r6 = r17
            r9 = r18
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(com.alibaba.fastjson2.JSONWriter r13, T r14) {
            r12 = this;
            java.lang.Object r14 = r12.getFieldValue(r14)
            java.lang.String r14 = (java.lang.String) r14
            long r0 = r12.features
            long r2 = r13.getFeatures()
            long r0 = r0 | r2
            r2 = 0
            r3 = 1
            r4 = 0
            if (r14 != 0) goto L41
            com.alibaba.fastjson2.JSONWriter$Feature r6 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNulls
            long r6 = r6.mask
            com.alibaba.fastjson2.JSONWriter$Feature r8 = com.alibaba.fastjson2.JSONWriter.Feature.NullAsDefaultValue
            long r8 = r8.mask
            long r6 = r6 | r8
            com.alibaba.fastjson2.JSONWriter$Feature r10 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullStringAsEmpty
            long r10 = r10.mask
            long r6 = r6 | r10
            long r6 = r6 & r0
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 == 0) goto L40
            com.alibaba.fastjson2.JSONWriter$Feature r6 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteDefaultValue
            long r6 = r6.mask
            long r6 = r6 & r0
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 == 0) goto L30
            goto L40
        L30:
            long r6 = r8 | r10
            long r6 = r6 & r0
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 == 0) goto L49
            r12.writeFieldName(r13)
            java.lang.String r14 = ""
            r13.writeString(r14)
            return r3
        L40:
            return r2
        L41:
            boolean r6 = r12.trim
            if (r6 == 0) goto L49
            java.lang.String r14 = r14.trim()
        L49:
            if (r14 == 0) goto L5b
            boolean r6 = r14.isEmpty()
            if (r6 == 0) goto L5b
            com.alibaba.fastjson2.JSONWriter$Feature r6 = com.alibaba.fastjson2.JSONWriter.Feature.IgnoreEmpty
            long r6 = r6.mask
            long r0 = r0 & r6
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L5b
            return r2
        L5b:
            r12.writeFieldName(r13)
            boolean r0 = r12.symbol
            if (r0 == 0) goto L6a
            boolean r0 = r13.jsonb
            if (r0 == 0) goto L6a
            r13.writeSymbol(r14)
            goto L75
        L6a:
            boolean r0 = r12.raw
            if (r0 == 0) goto L72
            r13.writeRaw(r14)
            goto L75
        L72:
            r13.writeString(r14)
        L75:
            return r3
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(com.alibaba.fastjson2.JSONWriter r2, T r3) {
            r1 = this;
            java.lang.Object r3 = r1.getFieldValue(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto Lc
            r2.writeNull()
            return
        Lc:
            boolean r0 = r1.trim
            if (r0 == 0) goto L14
            java.lang.String r3 = r3.trim()
        L14:
            boolean r0 = r1.raw
            if (r0 == 0) goto L1c
            r2.writeRaw(r3)
            return
        L1c:
            r2.writeString(r3)
            return
    }
}
