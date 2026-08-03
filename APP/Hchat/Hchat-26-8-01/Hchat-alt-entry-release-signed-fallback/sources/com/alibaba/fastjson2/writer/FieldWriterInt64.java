package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
abstract class FieldWriterInt64<T> extends com.alibaba.fastjson2.writer.FieldWriter<T> {
    final boolean browserCompatible;

    public FieldWriterInt64(java.lang.String r12, int r13, long r14, java.lang.String r16, java.lang.String r17, java.lang.Class r18, java.lang.reflect.Field r19, java.lang.reflect.Method r20) {
            r11 = this;
            r8 = r18
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r5 = r16
            r6 = r17
            r7 = r18
            r9 = r19
            r10 = r20
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            com.alibaba.fastjson2.JSONWriter$Feature r12 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserCompatible
            long r12 = r12.mask
            long r12 = r12 & r14
            r14 = 0
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L20
            r12 = 1
            goto L21
        L20:
            r12 = 0
        L21:
            r11.browserCompatible = r12
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(com.alibaba.fastjson2.JSONWriter r12, T r13) {
            r11 = this;
            r0 = 0
            java.lang.Object r13 = r11.getFieldValue(r13)     // Catch: java.lang.RuntimeException -> L44
            java.lang.Long r13 = (java.lang.Long) r13     // Catch: java.lang.RuntimeException -> L44
            r1 = 1
            if (r13 != 0) goto L3c
            long r2 = r11.features
            long r4 = r12.getFeatures()
            long r2 = r2 | r4
            com.alibaba.fastjson2.JSONWriter$Feature r13 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNulls
            long r4 = r13.mask
            com.alibaba.fastjson2.JSONWriter$Feature r13 = com.alibaba.fastjson2.JSONWriter.Feature.NullAsDefaultValue
            long r6 = r13.mask
            long r4 = r4 | r6
            com.alibaba.fastjson2.JSONWriter$Feature r6 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullNumberAsZero
            long r7 = r6.mask
            long r4 = r4 | r7
            long r4 = r4 & r2
            r7 = 0
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 != 0) goto L27
            return r0
        L27:
            r11.writeFieldName(r12)
            long r4 = r13.mask
            long r9 = r6.mask
            long r4 = r4 | r9
            long r2 = r2 & r4
            int r13 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r13 == 0) goto L38
            r12.writeInt64(r7)
            goto L3b
        L38:
            r12.writeNull()
        L3b:
            return r1
        L3c:
            long r2 = r13.longValue()
            r11.writeInt64(r12, r2)
            return r1
        L44:
            r13 = move-exception
            boolean r12 = r12.isIgnoreErrorGetter()
            if (r12 == 0) goto L4c
            return r0
        L4c:
            throw r13
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void writeInt64(com.alibaba.fastjson2.JSONWriter r7, long r8) {
            r6 = this;
            long r0 = r7.getFeatures()
            long r2 = r6.features
            long r0 = r0 | r2
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r2 = r2.mask
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.WriteLongAsString
            long r4 = r4.mask
            long r2 = r2 | r4
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1b
            r0 = r2
            goto L1c
        L1b:
            r0 = r1
        L1c:
            r6.writeFieldName(r7)
            if (r0 != 0) goto L3d
            boolean r0 = r6.browserCompatible
            if (r0 == 0) goto L3c
            boolean r0 = r7.jsonb
            if (r0 != 0) goto L3c
            r3 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 > 0) goto L3b
            r3 = -9007199254740991(0xffe0000000000001, double:-8.988465674311582E307)
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 >= 0) goto L3c
        L3b:
            r1 = r2
        L3c:
            r0 = r1
        L3d:
            if (r0 == 0) goto L47
            java.lang.String r8 = java.lang.Long.toString(r8)
            r7.writeString(r8)
            return
        L47:
            r7.writeInt64(r8)
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(com.alibaba.fastjson2.JSONWriter r1, T r2) {
            r0 = this;
            java.lang.Object r2 = r0.getFieldValue(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 != 0) goto Lc
            r1.writeNull()
            return
        Lc:
            r1.writeInt64(r2)
            return
    }
}
