package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
abstract class FieldWriterInt8<T> extends com.alibaba.fastjson2.writer.FieldWriter<T> {
    final boolean writeNonStringValueAsString;

    public FieldWriterInt8(java.lang.String r12, int r13, long r14, java.lang.String r16, java.lang.String r17, java.lang.Class r18, java.lang.reflect.Field r19, java.lang.reflect.Method r20) {
            r11 = this;
            r8 = r18
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r5 = r16
            r6 = r17
            r7 = r18
            r9 = r19
            r10 = r20
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            com.alibaba.fastjson2.JSONWriter$Feature r12 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r12 = r12.mask
            long r12 = r12 & r14
            r14 = 0
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L20
            r12 = 1
            goto L21
        L20:
            r12 = 0
        L21:
            r11.writeNonStringValueAsString = r12
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(com.alibaba.fastjson2.JSONWriter r1, T r2) {
            r0 = this;
            java.lang.Object r2 = r0.getFieldValue(r2)     // Catch: java.lang.RuntimeException -> L16
            java.lang.Byte r2 = (java.lang.Byte) r2     // Catch: java.lang.RuntimeException -> L16
            if (r2 != 0) goto Ld
            boolean r1 = r0.writeIntNull(r1)
            return r1
        Ld:
            byte r2 = r2.byteValue()
            r0.writeInt8(r1, r2)
            r1 = 1
            return r1
        L16:
            r2 = move-exception
            boolean r1 = r1.isIgnoreErrorGetter()
            if (r1 == 0) goto L1f
            r1 = 0
            return r1
        L1f:
            throw r2
    }

    public final void writeInt8(com.alibaba.fastjson2.JSONWriter r2, byte r3) {
            r1 = this;
            r1.writeFieldName(r2)
            boolean r0 = r1.writeNonStringValueAsString
            if (r0 == 0) goto Lb
            r2.writeString(r3)
            return
        Lb:
            r2.writeInt8(r3)
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(com.alibaba.fastjson2.JSONWriter r1, T r2) {
            r0 = this;
            java.lang.Object r2 = r0.getFieldValue(r2)
            java.lang.Byte r2 = (java.lang.Byte) r2
            if (r2 != 0) goto Lc
            r1.writeNumberNull()
            return
        Lc:
            byte r2 = r2.byteValue()
            r1.writeInt32(r2)
            return
    }
}
