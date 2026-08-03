package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderImplFromBoolean<T> extends com.alibaba.fastjson2.reader.ObjectReaderPrimitive<T> {
    final java.util.function.Function<java.lang.Boolean, T> creator;

    public ObjectReaderImplFromBoolean(java.lang.Class<T> r1, java.util.function.Function<java.lang.Boolean, T> r2) {
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
            java.util.function.Function<java.lang.Boolean, T> r2 = r0.creator
            boolean r1 = r1.readBoolValue()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
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
            java.util.function.Function<java.lang.Boolean, T> r2 = r0.creator
            boolean r1 = r1.readBoolValue()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r1 = r2.apply(r1)
            return r1
    }
}
