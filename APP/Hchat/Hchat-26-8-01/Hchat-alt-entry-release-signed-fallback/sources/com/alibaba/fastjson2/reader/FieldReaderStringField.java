package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class FieldReaderStringField<T> extends com.alibaba.fastjson2.reader.FieldReader<T> {
    final boolean emptyToNull;
    final long fieldOffset;
    final boolean trim;
    final boolean upper;

    public FieldReaderStringField(java.lang.String r13, java.lang.Class r14, int r15, long r16, java.lang.String r18, java.lang.String r19, java.lang.reflect.Field r20) {
            r12 = this;
            r8 = 0
            r10 = 0
            r3 = r14
            r0 = r12
            r1 = r13
            r2 = r14
            r4 = r15
            r5 = r16
            r7 = r18
            r9 = r19
            r11 = r20
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11)
            java.lang.String r13 = "trim"
            boolean r13 = r13.equals(r7)
            r14 = 1
            r15 = 0
            r1 = 0
            if (r13 != 0) goto L2b
            com.alibaba.fastjson2.JSONReader$Feature r13 = com.alibaba.fastjson2.JSONReader.Feature.TrimString
            long r3 = r13.mask
            long r3 = r16 & r3
            int r13 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r13 == 0) goto L29
            goto L2b
        L29:
            r13 = r15
            goto L2c
        L2b:
            r13 = r14
        L2c:
            r12.trim = r13
            java.lang.String r13 = "upper"
            boolean r13 = r13.equals(r7)
            r12.upper = r13
            sun.misc.Unsafe r13 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            r11 = r20
            long r3 = r13.objectFieldOffset(r11)
            r12.fieldOffset = r3
            com.alibaba.fastjson2.JSONReader$Feature r13 = com.alibaba.fastjson2.JSONReader.Feature.EmptyStringAsNull
            long r3 = r13.mask
            long r3 = r16 & r3
            int r13 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r13 == 0) goto L4b
            goto L4c
        L4b:
            r14 = r15
        L4c:
            r12.emptyToNull = r14
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r4, java.lang.Object r5) {
            r3 = this;
            if (r5 == 0) goto Lb
            boolean r0 = r5 instanceof java.lang.String
            if (r0 != 0) goto Lb
            java.lang.String r5 = r5.toString()
            goto Ld
        Lb:
            java.lang.String r5 = (java.lang.String) r5
        Ld:
            if (r5 == 0) goto L2a
            boolean r0 = r3.trim
            if (r0 == 0) goto L17
            java.lang.String r5 = r5.trim()
        L17:
            boolean r0 = r3.upper
            if (r0 == 0) goto L1f
            java.lang.String r5 = r5.toUpperCase()
        L1f:
            boolean r0 = r3.emptyToNull
            if (r0 == 0) goto L2a
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L2a
            r5 = 0
        L2a:
            sun.misc.Unsafe r0 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r1 = r3.fieldOffset
            r0.putObject(r4, r1, r5)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public /* bridge */ /* synthetic */ java.lang.Object readFieldValue(com.alibaba.fastjson2.JSONReader r1) {
            r0 = this;
            java.lang.String r1 = r0.readFieldValue(r1)
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public java.lang.String readFieldValue(com.alibaba.fastjson2.JSONReader r2) {
            r1 = this;
            java.lang.String r2 = r2.readString()
            boolean r0 = r1.trim
            if (r0 == 0) goto Le
            if (r2 == 0) goto Le
            java.lang.String r2 = r2.trim()
        Le:
            boolean r0 = r1.emptyToNull
            if (r0 == 0) goto L1b
            if (r2 == 0) goto L1b
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L1b
            r2 = 0
        L1b:
            return r2
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(com.alibaba.fastjson2.JSONReader r4, T r5) {
            r3 = this;
            java.lang.String r4 = r4.readString()
            if (r4 == 0) goto L21
            boolean r0 = r3.trim
            if (r0 == 0) goto Le
            java.lang.String r4 = r4.trim()
        Le:
            boolean r0 = r3.upper
            if (r0 == 0) goto L16
            java.lang.String r4 = r4.toUpperCase()
        L16:
            boolean r0 = r3.emptyToNull
            if (r0 == 0) goto L21
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L21
            r4 = 0
        L21:
            sun.misc.Unsafe r0 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r1 = r3.fieldOffset
            r0.putObject(r5, r1, r4)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValueJSONB(com.alibaba.fastjson2.JSONReader r3, T r4) {
            r2 = this;
            java.lang.String r3 = r3.readString()
            r0 = 0
            if (r3 == 0) goto L22
            boolean r1 = r2.trim
            if (r1 == 0) goto Lf
            java.lang.String r3 = r3.trim()
        Lf:
            boolean r1 = r2.upper
            if (r1 == 0) goto L17
            java.lang.String r3 = r3.toUpperCase()
        L17:
            boolean r1 = r2.emptyToNull
            if (r1 == 0) goto L22
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L22
            r3 = r0
        L22:
            boolean r1 = r2.emptyToNull
            if (r1 == 0) goto L2f
            if (r3 == 0) goto L2f
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L2f
            goto L30
        L2f:
            r0 = r3
        L30:
            r2.accept(r4, r0)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public boolean supportAcceptType(java.lang.Class r1) {
            r0 = this;
            r1 = 1
            return r1
    }
}
