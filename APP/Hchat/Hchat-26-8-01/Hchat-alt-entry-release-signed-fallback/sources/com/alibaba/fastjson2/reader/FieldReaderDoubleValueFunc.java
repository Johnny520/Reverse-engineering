package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderDoubleValueFunc<T> extends com.alibaba.fastjson2.reader.FieldReader<T> {
    final java.util.function.ObjDoubleConsumer<T> function;

    public FieldReaderDoubleValueFunc(java.lang.String r13, int r14, java.lang.Double r15, java.lang.reflect.Method r16, java.util.function.ObjDoubleConsumer<T> r17) {
            r12 = this;
            r8 = 0
            r11 = 0
            java.lang.Class r2 = java.lang.Double.TYPE
            r5 = 0
            r7 = 0
            r3 = r2
            r0 = r12
            r1 = r13
            r4 = r14
            r9 = r15
            r10 = r16
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11)
            r13 = r17
            r12.function = r13
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r2, double r3) {
            r1 = this;
            java.util.function.ObjDoubleConsumer<T> r0 = r1.function
            r0.accept(r2, r3)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r3, java.lang.Object r4) {
            r2 = this;
            double r0 = com.alibaba.fastjson2.util.TypeUtils.toDoubleValue(r4)
            java.util.function.ObjDoubleConsumer<T> r4 = r2.function
            r4.accept(r3, r0)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public java.lang.Object readFieldValue(com.alibaba.fastjson2.JSONReader r3) {
            r2 = this;
            double r0 = r3.readDoubleValue()
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            return r3
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(com.alibaba.fastjson2.JSONReader r3, T r4) {
            r2 = this;
            double r0 = r3.readDoubleValue()
            java.util.function.ObjDoubleConsumer<T> r3 = r2.function
            r3.accept(r4, r0)
            return
    }
}
