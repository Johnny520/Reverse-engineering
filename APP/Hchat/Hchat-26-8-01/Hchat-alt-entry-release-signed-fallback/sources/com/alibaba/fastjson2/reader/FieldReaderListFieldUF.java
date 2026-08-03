package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderListFieldUF<T> extends com.alibaba.fastjson2.reader.FieldReaderList<T, java.lang.Object> {
    final long fieldOffset;

    public FieldReaderListFieldUF(java.lang.String r16, java.lang.reflect.Type r17, java.lang.Class r18, java.lang.reflect.Type r19, java.lang.Class r20, int r21, long r22, java.lang.String r24, java.util.Locale r25, java.util.Collection r26, java.lang.reflect.Field r27) {
            r15 = this;
            r12 = 0
            r14 = 0
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r9 = r24
            r10 = r25
            r11 = r26
            r13 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11, r12, r13, r14)
            sun.misc.Unsafe r1 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r1 = r1.objectFieldOffset(r13)
            r15.fieldOffset = r1
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            sun.misc.Unsafe r0 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r1 = r3.fieldOffset
            r0.putObject(r4, r1, r5)
            return
    }
}
