package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterStringMethod<T> extends com.alibaba.fastjson2.writer.FieldWriter<T> {
    public FieldWriterStringMethod(java.lang.String r12, int r13, java.lang.String r14, java.lang.String r15, long r16, java.lang.reflect.Field r18, java.lang.reflect.Method r19) {
            r11 = this;
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r0 = r11
            r1 = r12
            r2 = r13
            r5 = r14
            r6 = r15
            r3 = r16
            r9 = r18
            r10 = r19
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public java.lang.Object getFieldValue(java.lang.Object r3) {
            r2 = this;
            java.lang.reflect.Method r0 = r2.method     // Catch: java.lang.reflect.InvocationTargetException -> L8 java.lang.IllegalAccessException -> La java.lang.IllegalArgumentException -> Lc
            r1 = 0
            java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L8 java.lang.IllegalAccessException -> La java.lang.IllegalArgumentException -> Lc
            return r3
        L8:
            r3 = move-exception
            goto Ld
        La:
            r3 = move-exception
            goto Ld
        Lc:
            r3 = move-exception
        Ld:
            java.lang.String r0 = "invoke getter method error, "
            java.lang.String r1 = r2.fieldName
            ah.a.o(r0, r1, r3)
            r3 = 0
            return r3
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(com.alibaba.fastjson2.JSONWriter r10, T r11) {
            r9 = this;
            r0 = 0
            r1 = 0
            java.lang.Object r11 = r9.getFieldValue(r11)     // Catch: com.alibaba.fastjson2.JSONException -> L45
            java.lang.String r11 = (java.lang.String) r11     // Catch: com.alibaba.fastjson2.JSONException -> L45
            long r3 = r9.features
            long r5 = r10.getFeatures()
            long r3 = r3 | r5
            if (r11 != 0) goto L26
            com.alibaba.fastjson2.JSONWriter$Feature r5 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNulls
            long r5 = r5.mask
            com.alibaba.fastjson2.JSONWriter$Feature r7 = com.alibaba.fastjson2.JSONWriter.Feature.NullAsDefaultValue
            long r7 = r7.mask
            long r5 = r5 | r7
            com.alibaba.fastjson2.JSONWriter$Feature r7 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullStringAsEmpty
            long r7 = r7.mask
            long r5 = r5 | r7
            long r5 = r5 & r3
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2e
            return r0
        L26:
            boolean r5 = r9.trim
            if (r5 == 0) goto L2e
            java.lang.String r11 = r11.trim()
        L2e:
            if (r11 == 0) goto L40
            boolean r5 = r11.isEmpty()
            if (r5 == 0) goto L40
            com.alibaba.fastjson2.JSONWriter$Feature r5 = com.alibaba.fastjson2.JSONWriter.Feature.IgnoreEmpty
            long r5 = r5.mask
            long r3 = r3 & r5
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 == 0) goto L40
            return r0
        L40:
            r9.writeString(r10, r11)
            r10 = 1
            return r10
        L45:
            r11 = move-exception
            long r3 = r9.features
            long r3 = r10.getFeatures(r3)
            com.alibaba.fastjson2.JSONWriter$Feature r10 = com.alibaba.fastjson2.JSONWriter.Feature.IgnoreNonFieldGetter
            long r5 = r10.mask
            long r3 = r3 | r5
            int r10 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r10 == 0) goto L56
            return r0
        L56:
            throw r11
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(com.alibaba.fastjson2.JSONWriter r2, T r3) {
            r1 = this;
            java.lang.Object r3 = r1.getFieldValue(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = r1.trim
            if (r0 == 0) goto L10
            if (r3 == 0) goto L10
            java.lang.String r3 = r3.trim()
        L10:
            boolean r0 = r1.symbol
            if (r0 == 0) goto L1c
            boolean r0 = r2.jsonb
            if (r0 == 0) goto L1c
            r2.writeSymbol(r3)
            return
        L1c:
            boolean r0 = r1.raw
            if (r0 == 0) goto L24
            r2.writeRaw(r3)
            return
        L24:
            r2.writeString(r3)
            return
    }
}
