package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderStringFunc<T, V> extends com.alibaba.fastjson2.reader.FieldReader<T> {
    final java.lang.String format;
    final java.util.function.BiConsumer<T, V> function;
    final boolean trim;
    final boolean upper;

    public FieldReaderStringFunc(java.lang.String r13, java.lang.Class<V> r14, int r15, long r16, java.lang.String r18, java.util.Locale r19, java.lang.Object r20, java.lang.reflect.Method r21, java.util.function.BiConsumer<T, V> r22) {
            r12 = this;
            r11 = 0
            r3 = r14
            r0 = r12
            r1 = r13
            r2 = r14
            r4 = r15
            r5 = r16
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11)
            r13 = r22
            r12.function = r13
            r12.format = r7
            java.lang.String r13 = "trim"
            boolean r13 = r13.equals(r7)
            if (r13 != 0) goto L30
            com.alibaba.fastjson2.JSONReader$Feature r13 = com.alibaba.fastjson2.JSONReader.Feature.TrimString
            long r13 = r13.mask
            long r13 = r16 & r13
            r1 = 0
            int r13 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r13 == 0) goto L2e
            goto L30
        L2e:
            r13 = 0
            goto L31
        L30:
            r13 = 1
        L31:
            r12.trim = r13
            java.lang.String r13 = "upper"
            boolean r13 = r13.equals(r7)
            r12.upper = r13
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r1, int r2) {
            r0 = this;
            java.lang.String r2 = java.lang.Integer.toString(r2)
            r0.accept(r1, r2)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r1, long r2) {
            r0 = this;
            java.lang.String r2 = java.lang.Long.toString(r2)
            r0.accept(r1, r2)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r3, java.lang.Object r4) {
            r2 = this;
            boolean r0 = r4 instanceof java.lang.String
            if (r0 != 0) goto Lc
            if (r4 != 0) goto L7
            goto Lc
        L7:
            java.lang.String r4 = r4.toString()
            goto Le
        Lc:
            java.lang.String r4 = (java.lang.String) r4
        Le:
            if (r4 == 0) goto L20
            boolean r0 = r2.trim
            if (r0 == 0) goto L18
            java.lang.String r4 = r4.trim()
        L18:
            boolean r0 = r2.upper
            if (r0 == 0) goto L20
            java.lang.String r4 = r4.toUpperCase()
        L20:
            java.util.function.BiConsumer<T, V> r0 = r2.function     // Catch: java.lang.Exception -> L26
            r0.accept(r3, r4)     // Catch: java.lang.Exception -> L26
            return
        L26:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "set "
            r4.<init>(r0)
            java.lang.String r0 = super.toString()
            java.lang.String r1 = " error"
            java.lang.String r4 = eh.a.r(r4, r0, r1)
            ah.a.x(r4, r3)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public java.lang.Object readFieldValue(com.alibaba.fastjson2.JSONReader r1) {
            r0 = this;
            java.lang.String r1 = r1.readString()
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(com.alibaba.fastjson2.JSONReader r2, T r3) {
            r1 = this;
            java.lang.String r2 = r2.readString()
            if (r2 == 0) goto L16
            boolean r0 = r1.trim
            if (r0 == 0) goto Le
            java.lang.String r2 = r2.trim()
        Le:
            boolean r0 = r1.upper
            if (r0 == 0) goto L16
            java.lang.String r2 = r2.toUpperCase()
        L16:
            java.util.function.BiConsumer<T, V> r0 = r1.function
            r0.accept(r3, r2)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public boolean supportAcceptType(java.lang.Class r1) {
            r0 = this;
            r1 = 1
            return r1
    }
}
