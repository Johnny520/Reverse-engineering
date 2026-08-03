package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderInt16ValueFunc<T> extends com.alibaba.fastjson2.reader.FieldReader<T> {
    final com.alibaba.fastjson2.function.ObjShortConsumer<T> function;

    public FieldReaderInt16ValueFunc(java.lang.String r13, int r14, long r15, java.lang.String r17, java.util.Locale r18, java.lang.Short r19, java.lang.reflect.Method r20, com.alibaba.fastjson2.function.ObjShortConsumer<T> r21) {
            r12 = this;
            java.lang.Class r2 = java.lang.Short.TYPE
            r11 = 0
            r3 = r2
            r0 = r12
            r1 = r13
            r4 = r14
            r5 = r15
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11)
            r13 = r21
            r12.function = r13
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r2, java.lang.Object r3) {
            r1 = this;
            short r3 = com.alibaba.fastjson2.util.TypeUtils.toShortValue(r3)
            com.alibaba.fastjson2.function.ObjShortConsumer<T> r0 = r1.function
            r0.accept(r2, r3)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r2, short r3) {
            r1 = this;
            com.alibaba.fastjson2.function.ObjShortConsumer<T> r0 = r1.function
            r0.accept(r2, r3)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public java.lang.Object readFieldValue(com.alibaba.fastjson2.JSONReader r1) {
            r0 = this;
            int r1 = r1.readInt32Value()
            short r1 = (short) r1
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(com.alibaba.fastjson2.JSONReader r2, T r3) {
            r1 = this;
            int r2 = r2.readInt32Value()
            short r2 = (short) r2
            com.alibaba.fastjson2.function.ObjShortConsumer<T> r0 = r1.function
            r0.accept(r3, r2)
            return
    }
}
