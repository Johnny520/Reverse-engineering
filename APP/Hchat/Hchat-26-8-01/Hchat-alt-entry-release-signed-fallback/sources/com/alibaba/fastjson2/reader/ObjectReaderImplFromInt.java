package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderImplFromInt<T> extends com.alibaba.fastjson2.reader.ObjectReaderPrimitive<T> {
    final java.util.function.IntFunction<T> creator;

    public ObjectReaderImplFromInt(java.lang.Class<T> r1, java.util.function.IntFunction r2) {
            r0 = this;
            r0.<init>(r1)
            r0.creator = r2
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ java.lang.Class getObjectClass() {
            r1 = this;
            java.lang.Class r0 = super.getObjectClass()
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public T readJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            boolean r2 = r1.nextIfNull()
            if (r2 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.Class r2 = r0.objectClass
            java.lang.Class<java.util.concurrent.atomic.AtomicInteger> r3 = java.util.concurrent.atomic.AtomicInteger.class
            if (r2 != r3) goto L31
            r2 = -110(0xffffffffffffff92, float:NaN)
            boolean r2 = r1.nextIfMatch(r2)
            if (r2 == 0) goto L31
            long r2 = r1.readTypeHashCode()
            r4 = 7576651708426282938(0x6925ac96039ae7ba, double:3.24033204513211E198)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L24
            goto L31
        L24:
            java.lang.String r2 = r1.getString()
            java.lang.String r1 = r1.info(r2)
            ah.a.w(r1)
            r1 = 0
            return r1
        L31:
            java.util.function.IntFunction<T> r2 = r0.creator
            int r1 = r1.readInt32Value()
            java.lang.Object r1 = r2.apply(r1)
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T readObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            boolean r2 = r1.nextIfNull()
            if (r2 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.util.function.IntFunction<T> r2 = r0.creator
            int r1 = r1.readInt32Value()
            java.lang.Object r1 = r2.apply(r1)
            return r1
    }
}
