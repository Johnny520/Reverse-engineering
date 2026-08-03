package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class FieldReaderInt64ValueField<T> extends com.alibaba.fastjson2.reader.FieldReader<T> {
    final long fieldOffset;

    public FieldReaderInt64ValueField(java.lang.String r13, java.lang.Class r14, int r15, long r16, java.lang.String r18, java.lang.Long r19, java.lang.reflect.Field r20) {
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
            sun.misc.Unsafe r13 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r13 = r13.objectFieldOffset(r11)
            r12.fieldOffset = r13
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r1, double r2) {
            r0 = this;
            long r2 = (long) r2
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.accept(r1, r2)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r3, float r4) {
            r2 = this;
            long r0 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            r2.accept(r3, r4)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r7, java.lang.Object r8) {
            r6 = this;
            long r4 = com.alibaba.fastjson2.util.TypeUtils.toLongValue(r8)
            sun.misc.Unsafe r0 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r2 = r6.fieldOffset
            r1 = r7
            r0.putLong(r1, r2, r4)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public java.lang.Object readFieldValue(com.alibaba.fastjson2.JSONReader r3) {
            r2 = this;
            long r0 = r3.readInt64Value()
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            return r3
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(com.alibaba.fastjson2.JSONReader r7, T r8) {
            r6 = this;
            long r4 = r7.readInt64Value()
            sun.misc.Unsafe r0 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r2 = r6.fieldOffset
            r1 = r8
            r0.putLong(r1, r2, r4)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValueJSONB(com.alibaba.fastjson2.JSONReader r1, T r2) {
            r0 = this;
            r0.readFieldValue(r1, r2)
            return
    }
}
