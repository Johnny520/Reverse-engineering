package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterCharMethod<T> extends com.alibaba.fastjson2.writer.FieldWriter<T> {
    public FieldWriterCharMethod(java.lang.String r12, int r13, long r14, java.lang.String r16, java.lang.String r17, java.lang.reflect.Field r18, java.lang.reflect.Method r19, java.lang.Class r20) {
            r11 = this;
            r8 = r20
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r5 = r16
            r6 = r17
            r9 = r18
            r10 = r19
            r7 = r20
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public java.lang.Object getFieldValue(T r3) {
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
            java.lang.Object r11 = r9.getFieldValue(r11)
            java.lang.Character r11 = (java.lang.Character) r11
            r0 = 1
            if (r11 != 0) goto L36
            com.alibaba.fastjson2.JSONWriter$Context r11 = r10.context
            long r1 = r11.getFeatures()
            long r3 = r9.features
            long r1 = r1 | r3
            com.alibaba.fastjson2.JSONWriter$Feature r11 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNulls
            long r3 = r11.mask
            com.alibaba.fastjson2.JSONWriter$Feature r11 = com.alibaba.fastjson2.JSONWriter.Feature.NullAsDefaultValue
            long r5 = r11.mask
            long r3 = r3 | r5
            long r3 = r3 & r1
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r4 = 0
            if (r3 == 0) goto L35
            r9.writeFieldName(r10)
            long r7 = r11.mask
            long r1 = r1 & r7
            int r11 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r11 == 0) goto L31
            r10.writeChar(r4)
            goto L34
        L31:
            r10.writeNull()
        L34:
            return r0
        L35:
            return r4
        L36:
            r9.writeFieldName(r10)
            char r11 = r11.charValue()
            r10.writeChar(r11)
            return r0
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(com.alibaba.fastjson2.JSONWriter r1, T r2) {
            r0 = this;
            java.lang.Object r2 = r0.getFieldValue(r2)
            java.lang.Character r2 = (java.lang.Character) r2
            if (r2 != 0) goto Lc
            r1.writeNull()
            return
        Lc:
            char r2 = r2.charValue()
            r1.writeChar(r2)
            return
    }
}
