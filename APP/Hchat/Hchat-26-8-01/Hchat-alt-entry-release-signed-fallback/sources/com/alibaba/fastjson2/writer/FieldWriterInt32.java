package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
abstract class FieldWriterInt32<T> extends com.alibaba.fastjson2.writer.FieldWriter<T> {
    final boolean toString;

    public FieldWriterInt32(java.lang.String r1, int r2, long r3, java.lang.String r5, java.lang.String r6, java.lang.reflect.Type r7, java.lang.Class r8, java.lang.reflect.Field r9, java.lang.reflect.Method r10) {
            r0 = this;
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            r1 = r0
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r6 = r2.mask
            long r2 = r3 & r6
            r6 = 0
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L1b
            java.lang.String r2 = "string"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L19
            goto L1b
        L19:
            r2 = 0
            goto L1c
        L1b:
            r2 = 1
        L1c:
            r1.toString = r2
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public com.alibaba.fastjson2.writer.ObjectWriter getObjectWriter(com.alibaba.fastjson2.JSONWriter r2, java.lang.Class r3) {
            r1 = this;
            java.lang.Class r0 = r1.fieldClass
            if (r3 != r0) goto L7
            com.alibaba.fastjson2.writer.ObjectWriterImplInt32 r2 = com.alibaba.fastjson2.writer.ObjectWriterImplInt32.INSTANCE
            return r2
        L7:
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r2.getObjectWriter(r3)
            return r2
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(com.alibaba.fastjson2.JSONWriter r1, T r2) {
            r0 = this;
            java.lang.Object r2 = r0.getFieldValue(r2)     // Catch: java.lang.RuntimeException -> L16
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.RuntimeException -> L16
            if (r2 != 0) goto Ld
            boolean r1 = r0.writeIntNull(r1)
            return r1
        Ld:
            int r2 = r2.intValue()
            r0.writeInt32(r1, r2)
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

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void writeInt32(com.alibaba.fastjson2.JSONWriter r2, int r3) {
            r1 = this;
            boolean r0 = r1.toString
            if (r0 == 0) goto Lf
            r1.writeFieldName(r2)
            java.lang.String r3 = java.lang.Integer.toString(r3)
            r2.writeString(r3)
            return
        Lf:
            r1.writeFieldName(r2)
            java.lang.String r0 = r1.format
            if (r0 == 0) goto L1a
            r2.writeInt32(r3, r0)
            return
        L1a:
            r2.writeInt32(r3)
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(com.alibaba.fastjson2.JSONWriter r1, T r2) {
            r0 = this;
            java.lang.Object r2 = r0.getFieldValue(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto Lc
            r1.writeNumberNull()
            return
        Lc:
            r1.writeInt32(r2)
            return
    }
}
