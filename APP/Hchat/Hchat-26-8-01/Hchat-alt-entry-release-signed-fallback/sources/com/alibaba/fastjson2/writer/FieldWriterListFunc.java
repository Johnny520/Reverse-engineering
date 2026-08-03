package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterListFunc<T> extends com.alibaba.fastjson2.writer.FieldWriterList<T> {
    final java.util.function.Function<T, java.util.List> function;

    public FieldWriterListFunc(java.lang.String r14, int r15, long r16, java.lang.String r18, java.lang.String r19, java.lang.reflect.Type r20, java.lang.reflect.Method r21, java.util.function.Function<T, java.util.List> r22, java.lang.reflect.Type r23, java.lang.Class r24, java.lang.Class<?> r25) {
            r13 = this;
            r10 = 0
            r0 = r13
            r1 = r14
            r3 = r15
            r4 = r16
            r6 = r18
            r7 = r19
            r2 = r20
            r11 = r21
            r8 = r23
            r9 = r24
            r12 = r25
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11, r12)
            r14 = r22
            r13.function = r14
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public java.lang.Object getFieldValue(T r2) {
            r1 = this;
            java.util.function.Function<T, java.util.List> r0 = r1.function
            java.lang.Object r2 = r0.apply(r2)
            return r2
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(com.alibaba.fastjson2.JSONWriter r11, T r12) {
            r10 = this;
            r0 = 0
            java.util.function.Function<T, java.util.List> r1 = r10.function     // Catch: java.lang.RuntimeException -> L63
            java.lang.Object r12 = r1.apply(r12)     // Catch: java.lang.RuntimeException -> L63
            java.util.List r12 = com.alibaba.fastjson2.util.TypeUtils.toList(r12)     // Catch: java.lang.RuntimeException -> L63
            long r1 = r10.features
            r3 = 0
            r5 = 1
            if (r12 != 0) goto L32
            long r6 = r11.getFeatures()
            long r1 = r1 | r6
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
            if (r12 != 0) goto L2b
            return r0
        L2b:
            r10.writeFieldName(r11)
            r11.writeArrayNull(r1)
            return r5
        L32:
            com.alibaba.fastjson2.JSONWriter$Feature r6 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteEmptyArray
            long r6 = r6.mask
            long r1 = r1 & r6
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L42
            boolean r1 = r12.isEmpty()
            if (r1 == 0) goto L42
            return r0
        L42:
            java.lang.String r0 = r11.setPath(r10, r12)
            if (r0 == 0) goto L52
            r10.writeFieldName(r11)
            r11.writeReference(r0)
            r11.popPath(r12)
            return r5
        L52:
            java.lang.reflect.Type r0 = r10.itemType
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            if (r0 != r1) goto L5c
            r10.writeListStr(r11, r5, r12)
            goto L5f
        L5c:
            r10.writeList(r11, r5, r12)
        L5f:
            r11.popPath(r12)
            return r5
        L63:
            r12 = move-exception
            boolean r11 = r11.isIgnoreErrorGetter()
            if (r11 == 0) goto L6b
            return r0
        L6b:
            throw r12
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(com.alibaba.fastjson2.JSONWriter r7, T r8) {
            r6 = this;
            java.util.function.Function<T, java.util.List> r0 = r6.function
            java.lang.Object r8 = r0.apply(r8)
            java.util.List r8 = com.alibaba.fastjson2.util.TypeUtils.toList(r8)
            if (r8 != 0) goto L10
            r7.writeNull()
            return
        L10:
            boolean r0 = r7.jsonb
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L3d
            int r0 = r8.size()
            r7.startArray(r0)
            r3 = r2
        L1e:
            if (r1 >= r0) goto L3c
            java.lang.Object r4 = r8.get(r1)
            if (r4 != 0) goto L2a
            r7.writeNull()
            goto L39
        L2a:
            java.lang.Class r5 = r4.getClass()
            if (r5 != r2) goto L31
            goto L36
        L31:
            com.alibaba.fastjson2.writer.ObjectWriter r3 = r6.getItemWriter(r7, r5)
            r2 = r5
        L36:
            r3.write(r7, r4)
        L39:
            int r1 = r1 + 1
            goto L1e
        L3c:
            return
        L3d:
            r7.startArray()
            r0 = r2
        L41:
            int r3 = r8.size()
            if (r1 >= r3) goto L68
            if (r1 == 0) goto L4c
            r7.writeComma()
        L4c:
            java.lang.Object r3 = r8.get(r1)
            if (r3 != 0) goto L56
            r7.writeNull()
            goto L65
        L56:
            java.lang.Class r4 = r3.getClass()
            if (r4 != r2) goto L5d
            goto L62
        L5d:
            com.alibaba.fastjson2.writer.ObjectWriter r0 = r6.getItemWriter(r7, r4)
            r2 = r4
        L62:
            r0.write(r7, r3)
        L65:
            int r1 = r1 + 1
            goto L41
        L68:
            r7.endArray()
            return
    }
}
