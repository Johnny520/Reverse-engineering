package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterListMethod<T> extends com.alibaba.fastjson2.writer.FieldWriterList<T> {
    public FieldWriterListMethod(java.lang.String r14, java.lang.reflect.Type r15, int r16, long r17, java.lang.String r19, java.lang.String r20, java.lang.reflect.Field r21, java.lang.reflect.Method r22, java.lang.reflect.Type r23, java.lang.Class r24, java.lang.Class<?> r25) {
            r13 = this;
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r6 = r19
            r7 = r20
            r10 = r21
            r11 = r22
            r8 = r23
            r9 = r24
            r12 = r25
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11, r12)
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
    public boolean write(com.alibaba.fastjson2.JSONWriter r11, T r12) {
            r10 = this;
            r0 = 0
            java.lang.Object r12 = r10.getFieldValue(r12)     // Catch: com.alibaba.fastjson2.JSONException -> L6b
            java.util.List r12 = com.alibaba.fastjson2.util.TypeUtils.toList(r12)     // Catch: com.alibaba.fastjson2.JSONException -> L6b
            long r1 = r10.features
            long r3 = r11.getFeatures()
            long r1 = r1 | r3
            r3 = 0
            r5 = 1
            if (r12 != 0) goto L30
            com.alibaba.fastjson2.JSONWriter$Feature r12 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNulls
            long r6 = r12.mask
            com.alibaba.fastjson2.JSONWriter$Feature r12 = com.alibaba.fastjson2.JSONWriter.Feature.NullAsDefaultValue
            long r8 = r12.mask
            long r6 = r6 | r8
            com.alibaba.fastjson2.JSONWriter$Feature r12 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullListAsEmpty
            long r8 = r12.mask
            long r6 = r6 | r8
            long r6 = r6 & r1
            int r12 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r12 == 0) goto L2f
            r10.writeFieldName(r11)
            r11.writeArrayNull(r1)
            return r5
        L2f:
            return r0
        L30:
            com.alibaba.fastjson2.JSONWriter$Feature r6 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteEmptyArray
            long r6 = r6.mask
            long r6 = r6 & r1
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 == 0) goto L40
            boolean r6 = r12.isEmpty()
            if (r6 == 0) goto L40
            return r0
        L40:
            java.lang.String r0 = r11.setPath(r10, r12)
            if (r0 == 0) goto L50
            r10.writeFieldName(r11)
            r11.writeReference(r0)
            r11.popPath(r12)
            return r5
        L50:
            java.lang.reflect.Type r0 = r10.itemType
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            if (r0 != r6) goto L5a
            r10.writeListStr(r11, r5, r12)
            goto L5d
        L5a:
            r10.writeList(r11, r5, r12)
        L5d:
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.ReferenceDetection
            long r6 = r0.mask
            long r0 = r1 & r6
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L6a
            r11.popPath(r12)
        L6a:
            return r5
        L6b:
            r12 = move-exception
            boolean r11 = r11.isIgnoreErrorGetter()
            if (r11 == 0) goto L73
            return r0
        L73:
            throw r12
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(com.alibaba.fastjson2.JSONWriter r2, T r3) {
            r1 = this;
            java.lang.Object r3 = r1.getFieldValue(r3)
            java.util.List r3 = com.alibaba.fastjson2.util.TypeUtils.toList(r3)
            if (r3 != 0) goto Le
            r2.writeNull()
            return
        Le:
            r0 = 0
            r1.writeList(r2, r0, r3)
            return
    }
}
