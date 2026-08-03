package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderImplValueInt<T> implements com.alibaba.fastjson2.reader.ObjectReader<T> {
    final long features;
    final java.util.function.IntFunction<T> function;

    public ObjectReaderImplValueInt(java.lang.Class<T> r1, long r2, java.util.function.IntFunction<T> r4) {
            r0 = this;
            r0.<init>()
            r0.features = r2
            r0.function = r4
            return
    }

    public static <T> com.alibaba.fastjson2.reader.ObjectReaderImplValueInt<T> of(java.lang.Class<T> r1, long r2, java.util.function.IntFunction<T> r4) {
            com.alibaba.fastjson2.reader.ObjectReaderImplValueInt r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplValueInt
            r0.<init>(r1, r2, r4)
            return r0
    }

    public static <T> com.alibaba.fastjson2.reader.ObjectReaderImplValueInt<T> of(java.lang.Class<T> r3, java.util.function.IntFunction<T> r4) {
            com.alibaba.fastjson2.reader.ObjectReaderImplValueInt r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplValueInt
            r1 = 0
            r0.<init>(r3, r1, r4)
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T readJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.lang.Object r1 = r0.readObject(r1, r2, r3, r4)
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T readObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            boolean r2 = r1.nextIfNullOrEmptyString()
            if (r2 == 0) goto L8
            r1 = 0
            return r1
        L8:
            int r2 = r1.readInt32Value()
            java.util.function.IntFunction<T> r3 = r0.function     // Catch: java.lang.Exception -> L13
            java.lang.Object r1 = r3.apply(r2)     // Catch: java.lang.Exception -> L13
            return r1
        L13:
            r2 = move-exception
            java.lang.String r3 = "create object error"
            java.lang.String r1 = r1.info(r3)
            ah.a.x(r1, r2)
            r1 = 0
            return r1
    }
}
