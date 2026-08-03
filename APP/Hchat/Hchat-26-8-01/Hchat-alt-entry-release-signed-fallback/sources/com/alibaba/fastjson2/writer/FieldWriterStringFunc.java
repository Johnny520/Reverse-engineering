package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterStringFunc<T> extends com.alibaba.fastjson2.writer.FieldWriter<T> {
    final java.util.function.Function<T, java.lang.String> function;
    final boolean raw;
    final boolean symbol;
    final boolean trim;

    public FieldWriterStringFunc(java.lang.String r12, int r13, long r14, java.lang.String r16, java.lang.String r17, java.lang.reflect.Method r18, java.util.function.Function<T, java.lang.String> r19) {
            r11 = this;
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r9 = 0
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r5 = r16
            r6 = r17
            r10 = r18
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            r12 = r19
            r11.function = r12
            java.lang.String r12 = "symbol"
            boolean r12 = r12.equals(r5)
            r11.symbol = r12
            java.lang.String r12 = "trim"
            boolean r12 = r12.equals(r5)
            r11.trim = r12
            r12 = 1125899906842624(0x4000000000000, double:5.562684646268003E-309)
            long r12 = r12 & r14
            r14 = 0
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L31
            r12 = 1
            goto L32
        L31:
            r12 = 0
        L32:
            r11.raw = r12
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public java.lang.Object getFieldValue(T r2) {
            r1 = this;
            java.util.function.Function<T, java.lang.String> r0 = r1.function
            java.lang.Object r2 = r0.apply(r2)
            return r2
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(com.alibaba.fastjson2.JSONWriter r11, T r12) {
            r10 = this;
            r0 = 0
            r1 = 0
            java.util.function.Function<T, java.lang.String> r3 = r10.function     // Catch: java.lang.RuntimeException -> L74
            java.lang.Object r12 = r3.apply(r12)     // Catch: java.lang.RuntimeException -> L74
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.RuntimeException -> L74
            long r3 = r10.features
            long r5 = r11.getFeatures()
            long r3 = r3 | r5
            if (r12 != 0) goto L28
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
            if (r5 != 0) goto L28
            return r0
        L28:
            r10.writeFieldName(r11)
            r5 = 1
            if (r12 != 0) goto L42
            com.alibaba.fastjson2.JSONWriter$Feature r6 = com.alibaba.fastjson2.JSONWriter.Feature.NullAsDefaultValue
            long r6 = r6.mask
            com.alibaba.fastjson2.JSONWriter$Feature r8 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullStringAsEmpty
            long r8 = r8.mask
            long r6 = r6 | r8
            long r6 = r6 & r3
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 == 0) goto L42
            java.lang.String r12 = ""
            r11.writeString(r12)
            return r5
        L42:
            boolean r6 = r10.trim
            if (r6 == 0) goto L4a
            java.lang.String r12 = r12.trim()
        L4a:
            if (r12 == 0) goto L5c
            boolean r6 = r12.isEmpty()
            if (r6 == 0) goto L5c
            com.alibaba.fastjson2.JSONWriter$Feature r6 = com.alibaba.fastjson2.JSONWriter.Feature.IgnoreEmpty
            long r6 = r6.mask
            long r3 = r3 & r6
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 == 0) goto L5c
            return r0
        L5c:
            boolean r0 = r10.symbol
            if (r0 == 0) goto L68
            boolean r0 = r11.jsonb
            if (r0 == 0) goto L68
            r11.writeSymbol(r12)
            goto L73
        L68:
            boolean r0 = r10.raw
            if (r0 == 0) goto L70
            r11.writeRaw(r12)
            goto L73
        L70:
            r11.writeString(r12)
        L73:
            return r5
        L74:
            r12 = move-exception
            long r3 = r10.features
            long r3 = r11.getFeatures(r3)
            com.alibaba.fastjson2.JSONWriter$Feature r11 = com.alibaba.fastjson2.JSONWriter.Feature.IgnoreNonFieldGetter
            long r5 = r11.mask
            long r3 = r3 | r5
            int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r11 == 0) goto L85
            return r0
        L85:
            throw r12
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(com.alibaba.fastjson2.JSONWriter r2, T r3) {
            r1 = this;
            java.util.function.Function<T, java.lang.String> r0 = r1.function
            java.lang.Object r3 = r0.apply(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = r1.trim
            if (r0 == 0) goto L12
            if (r3 == 0) goto L12
            java.lang.String r3 = r3.trim()
        L12:
            boolean r0 = r1.symbol
            if (r0 == 0) goto L1e
            boolean r0 = r2.jsonb
            if (r0 == 0) goto L1e
            r2.writeSymbol(r3)
            return
        L1e:
            boolean r0 = r1.raw
            if (r0 == 0) goto L26
            r2.writeRaw(r3)
            return
        L26:
            r2.writeString(r3)
            return
    }
}
