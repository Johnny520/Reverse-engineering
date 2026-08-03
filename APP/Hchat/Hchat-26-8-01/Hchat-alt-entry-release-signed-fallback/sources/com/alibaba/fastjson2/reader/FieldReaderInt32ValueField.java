package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class FieldReaderInt32ValueField<T> extends com.alibaba.fastjson2.reader.FieldReader<T> {
    final long fieldOffset;

    public FieldReaderInt32ValueField(java.lang.String r13, java.lang.Class r14, int r15, java.lang.String r16, java.lang.Integer r17, java.lang.reflect.Field r18) {
            r12 = this;
            r8 = 0
            r10 = 0
            r5 = 0
            r3 = r14
            r0 = r12
            r1 = r13
            r2 = r14
            r4 = r15
            r7 = r16
            r9 = r17
            r11 = r18
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11)
            sun.misc.Unsafe r13 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r13 = r13.objectFieldOffset(r11)
            r12.fieldOffset = r13
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r1, double r2) {
            r0 = this;
            int r2 = (int) r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.accept(r1, r2)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r1, float r2) {
            r0 = this;
            int r2 = (int) r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.accept(r1, r2)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r3, long r4) {
            r2 = this;
            int r4 = (int) r4
            sun.misc.Unsafe r5 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r0 = r2.fieldOffset
            r5.putInt(r3, r0, r4)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r4, java.lang.Object r5) {
            r3 = this;
            int r5 = com.alibaba.fastjson2.util.TypeUtils.toIntValue(r5)
            sun.misc.Unsafe r0 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r1 = r3.fieldOffset
            r0.putInt(r4, r1, r5)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public java.lang.Object readFieldValue(com.alibaba.fastjson2.JSONReader r1) {
            r0 = this;
            int r1 = r1.readInt32Value()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(com.alibaba.fastjson2.JSONReader r4, T r5) {
            r3 = this;
            int r4 = r4.readInt32Value()
            sun.misc.Unsafe r0 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r1 = r3.fieldOffset
            r0.putInt(r5, r1, r4)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValueJSONB(com.alibaba.fastjson2.JSONReader r1, T r2) {
            r0 = this;
            int r1 = r1.readInt32Value()
            r0.accept(r2, r1)
            return
    }
}
