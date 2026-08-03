package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterInt8ValFunc extends com.alibaba.fastjson2.writer.FieldWriterInt8 {
    final com.alibaba.fastjson2.function.ToByteFunction function;

    public FieldWriterInt8ValFunc(java.lang.String r11, int r12, long r13, java.lang.String r15, java.lang.String r16, java.lang.reflect.Method r17, com.alibaba.fastjson2.function.ToByteFunction r18) {
            r10 = this;
            java.lang.Class r7 = java.lang.Byte.TYPE
            r8 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r5 = r15
            r6 = r16
            r9 = r17
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9)
            r11 = r18
            r10.function = r11
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public java.lang.Object getFieldValue(java.lang.Object r2) {
            r1 = this;
            com.alibaba.fastjson2.function.ToByteFunction r0 = r1.function
            byte r2 = r0.applyAsByte(r2)
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            return r2
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterInt8, com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(com.alibaba.fastjson2.JSONWriter r2, java.lang.Object r3) {
            r1 = this;
            com.alibaba.fastjson2.function.ToByteFunction r0 = r1.function     // Catch: java.lang.RuntimeException -> Lb
            byte r3 = r0.applyAsByte(r3)     // Catch: java.lang.RuntimeException -> Lb
            r1.writeInt8(r2, r3)
            r2 = 1
            return r2
        Lb:
            r3 = move-exception
            boolean r2 = r2.isIgnoreErrorGetter()
            if (r2 == 0) goto L14
            r2 = 0
            return r2
        L14:
            throw r3
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterInt8, com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(com.alibaba.fastjson2.JSONWriter r2, java.lang.Object r3) {
            r1 = this;
            com.alibaba.fastjson2.function.ToByteFunction r0 = r1.function
            byte r3 = r0.applyAsByte(r3)
            r2.writeInt32(r3)
            return
    }
}
