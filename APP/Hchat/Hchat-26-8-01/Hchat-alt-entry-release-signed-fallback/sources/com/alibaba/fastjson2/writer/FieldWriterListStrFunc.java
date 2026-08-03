package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterListStrFunc<T> extends com.alibaba.fastjson2.writer.FieldWriter<T> {
    final java.util.function.Function<T, java.util.List> function;

    public FieldWriterListStrFunc(java.lang.String r12, int r13, long r14, java.lang.String r16, java.lang.String r17, java.lang.reflect.Method r18, java.util.function.Function<T, java.util.List> r19, java.lang.reflect.Type r20, java.lang.Class r21) {
            r11 = this;
            r9 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r5 = r16
            r6 = r17
            r10 = r18
            r7 = r20
            r8 = r21
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            r12 = r19
            r11.function = r12
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
            java.util.function.Function<T, java.util.List> r1 = r10.function     // Catch: java.lang.RuntimeException -> L89
            java.lang.Object r12 = r1.apply(r12)     // Catch: java.lang.RuntimeException -> L89
            java.util.List r12 = com.alibaba.fastjson2.util.TypeUtils.toList(r12)     // Catch: java.lang.RuntimeException -> L89
            long r1 = r10.features
            long r3 = r11.getFeatures()
            long r1 = r1 | r3
            r3 = 0
            r5 = 1
            if (r12 != 0) goto L32
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
            if (r12 == 0) goto L31
            r10.writeFieldName(r11)
            r11.writeArrayNull(r1)
            return r5
        L31:
            return r0
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
            r10.writeFieldName(r11)
            boolean r1 = r11.jsonb
            if (r1 == 0) goto L65
            int r1 = r12.size()
            r11.startArray(r1)
        L50:
            if (r0 >= r1) goto L64
            java.lang.Object r2 = r12.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L5e
            r11.writeNull()
            goto L61
        L5e:
            r11.writeString(r2)
        L61:
            int r0 = r0 + 1
            goto L50
        L64:
            return r5
        L65:
            r11.startArray()
        L68:
            int r1 = r12.size()
            if (r0 >= r1) goto L85
            if (r0 == 0) goto L73
            r11.writeComma()
        L73:
            java.lang.Object r1 = r12.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L7f
            r11.writeNull()
            goto L82
        L7f:
            r11.writeString(r1)
        L82:
            int r0 = r0 + 1
            goto L68
        L85:
            r11.endArray()
            return r5
        L89:
            r12 = move-exception
            boolean r11 = r11.isIgnoreErrorGetter()
            if (r11 == 0) goto L91
            return r0
        L91:
            throw r12
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(com.alibaba.fastjson2.JSONWriter r4, T r5) {
            r3 = this;
            java.util.function.Function<T, java.util.List> r0 = r3.function
            java.lang.Object r5 = r0.apply(r5)
            java.util.List r5 = com.alibaba.fastjson2.util.TypeUtils.toList(r5)
            if (r5 != 0) goto L10
            r4.writeNull()
            return
        L10:
            boolean r0 = r4.jsonb
            r1 = 0
            if (r0 == 0) goto L31
            int r0 = r5.size()
            r4.startArray(r0)
        L1c:
            if (r1 >= r0) goto L30
            java.lang.Object r2 = r5.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L2a
            r4.writeNull()
            goto L2d
        L2a:
            r4.writeString(r2)
        L2d:
            int r1 = r1 + 1
            goto L1c
        L30:
            return
        L31:
            r4.startArray()
        L34:
            int r0 = r5.size()
            if (r1 >= r0) goto L51
            if (r1 == 0) goto L3f
            r4.writeComma()
        L3f:
            java.lang.Object r0 = r5.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L4b
            r4.writeNull()
            goto L4e
        L4b:
            r4.writeString(r0)
        L4e:
            int r1 = r1 + 1
            goto L34
        L51:
            r4.endArray()
            return
    }
}
