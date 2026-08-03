package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterInt16ValField<T> extends com.alibaba.fastjson2.writer.FieldWriterInt16<T> {
    public FieldWriterInt16ValField(java.lang.String r11, int r12, long r13, java.lang.String r15, java.lang.String r16, java.lang.reflect.Field r17) {
            r10 = this;
            java.lang.Class r7 = java.lang.Short.TYPE
            r9 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r5 = r15
            r6 = r16
            r8 = r17
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9)
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public java.lang.Object getFieldValue(T r1) {
            r0 = this;
            short r1 = r0.getFieldValueShort(r1)
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
            return r1
    }

    public short getFieldValueShort(T r6) {
            r5 = this;
            java.lang.String r0 = "field.get error, "
            if (r6 == 0) goto L25
            long r1 = r5.fieldOffset     // Catch: java.lang.IllegalAccessException -> L13 java.lang.IllegalArgumentException -> L15
            r3 = -1
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L17
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE     // Catch: java.lang.IllegalAccessException -> L13 java.lang.IllegalArgumentException -> L15
            short r6 = r3.getShort(r6, r1)     // Catch: java.lang.IllegalAccessException -> L13 java.lang.IllegalArgumentException -> L15
            return r6
        L13:
            r6 = move-exception
            goto L1e
        L15:
            r6 = move-exception
            goto L1e
        L17:
            java.lang.reflect.Field r1 = r5.field     // Catch: java.lang.IllegalAccessException -> L13 java.lang.IllegalArgumentException -> L15
            short r6 = r1.getShort(r6)     // Catch: java.lang.IllegalAccessException -> L13 java.lang.IllegalArgumentException -> L15
            return r6
        L1e:
            java.lang.String r1 = r5.fieldName
            ah.a.o(r0, r1, r6)
        L23:
            r6 = 0
            return r6
        L25:
            java.lang.String r6 = r5.fieldName
            ah.a.i(r6, r0)
            goto L23
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterInt16, com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(com.alibaba.fastjson2.JSONWriter r1, T r2) {
            r0 = this;
            short r2 = r0.getFieldValueShort(r2)
            r0.writeInt16(r1, r2)
            r1 = 1
            return r1
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterInt16, com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(com.alibaba.fastjson2.JSONWriter r1, T r2) {
            r0 = this;
            short r2 = r0.getFieldValueShort(r2)
            r1.writeInt32(r2)
            return
    }
}
