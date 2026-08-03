package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderInt8Param<T> extends com.alibaba.fastjson2.reader.FieldReaderObjectParam<T> {
    public FieldReaderInt8Param(java.lang.String r12, java.lang.Class r13, java.lang.String r14, int r15, long r16, java.lang.String r18, java.util.Locale r19, java.lang.Object r20) {
            r11 = this;
            r3 = r13
            r0 = r11
            r1 = r12
            r2 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r8 = r18
            r9 = r19
            r10 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9, r10)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public java.lang.Object readFieldValue(com.alibaba.fastjson2.JSONReader r1) {
            r0 = this;
            java.lang.Integer r1 = r1.readInt32()
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            byte r1 = r1.byteValue()
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            return r1
    }
}
