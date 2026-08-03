package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class FieldReaderListFuncImpl<T, V> extends com.alibaba.fastjson2.reader.FieldReaderList<T, V> {
    final com.alibaba.fastjson2.reader.ObjectReader<V> itemObjectReader;
    final java.util.function.Supplier<java.util.List<V>> listCreator;

    public FieldReaderListFuncImpl(java.util.function.Supplier<java.util.List<V>> r16, com.alibaba.fastjson2.reader.ObjectReader<V> r17, java.util.function.BiConsumer<T, java.util.List<V>> r18, java.lang.reflect.Type r19, java.lang.String r20) {
            r15 = this;
            java.lang.Class r5 = com.alibaba.fastjson2.util.TypeUtils.getClass(r19)
            r12 = 0
            r13 = 0
            java.lang.Class<java.util.List> r2 = java.util.List.class
            java.lang.Class<java.util.List> r3 = java.util.List.class
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r0 = r15
            r14 = r18
            r4 = r19
            r1 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11, r12, r13, r14)
            r1 = r16
            r15.listCreator = r1
            r1 = r17
            r15.itemObjectReader = r1
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r2, java.lang.Object r3) {
            r1 = this;
            java.util.function.BiConsumer r0 = r1.function
            r0.accept(r2, r3)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderList
    public java.util.Collection<V> createList(com.alibaba.fastjson2.JSONReader.Context r1) {
            r0 = this;
            java.util.function.Supplier<java.util.List<V>> r1 = r0.listCreator
            java.lang.Object r1 = r1.get()
            java.util.Collection r1 = (java.util.Collection) r1
            return r1
    }
}
