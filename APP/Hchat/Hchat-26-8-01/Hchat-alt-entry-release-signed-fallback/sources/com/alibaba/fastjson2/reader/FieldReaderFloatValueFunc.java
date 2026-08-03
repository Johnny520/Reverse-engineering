package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderFloatValueFunc<T> extends com.alibaba.fastjson2.reader.FieldReader<T> {
    final com.alibaba.fastjson2.function.ObjFloatConsumer<T> function;

    public FieldReaderFloatValueFunc(java.lang.String r13, int r14, java.lang.Float r15, java.lang.reflect.Method r16, com.alibaba.fastjson2.function.ObjFloatConsumer<T> r17) {
            r12 = this;
            r8 = 0
            r11 = 0
            java.lang.Class r2 = java.lang.Float.TYPE
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
    public void accept(T r2, float r3) {
            r1 = this;
            com.alibaba.fastjson2.function.ObjFloatConsumer<T> r0 = r1.function
            r0.accept(r2, r3)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r2, java.lang.Object r3) {
            r1 = this;
            float r3 = com.alibaba.fastjson2.util.TypeUtils.toFloatValue(r3)
            com.alibaba.fastjson2.function.ObjFloatConsumer<T> r0 = r1.function
            r0.accept(r2, r3)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public java.lang.Object readFieldValue(com.alibaba.fastjson2.JSONReader r1) {
            r0 = this;
            float r1 = r1.readFloatValue()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(com.alibaba.fastjson2.JSONReader r2, T r3) {
            r1 = this;
            float r2 = r2.readFloatValue()
            com.alibaba.fastjson2.function.ObjFloatConsumer<T> r0 = r1.function
            r0.accept(r3, r2)
            return
    }
}
