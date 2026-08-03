package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderImplInt64ValueArray extends com.alibaba.fastjson2.reader.ObjectReaderPrimitive {
    public static final long HASH_TYPE = 0;
    static final com.alibaba.fastjson2.reader.ObjectReaderImplInt64ValueArray INSTANCE = null;
    final java.util.function.Function<long[], java.lang.Object> builder;

    static {
            com.alibaba.fastjson2.reader.ObjectReaderImplInt64ValueArray r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplInt64ValueArray
            java.lang.Class<long[]> r1 = long[].class
            r2 = 0
            r0.<init>(r1, r2)
            com.alibaba.fastjson2.reader.ObjectReaderImplInt64ValueArray.INSTANCE = r0
            java.lang.String r0 = "[J"
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.reader.ObjectReaderImplInt64ValueArray.HASH_TYPE = r0
            return
    }

    public ObjectReaderImplInt64ValueArray(java.lang.Class r1, java.util.function.Function<long[], java.lang.Object> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.builder = r2
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object createInstance(java.util.Collection r5, long r6) {
            r4 = this;
            int r6 = r5.size()
            long[] r6 = new long[r6]
            java.util.Iterator r5 = r5.iterator()
            r7 = 0
        Lb:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r5.next()
            if (r0 != 0) goto L1a
            r0 = 0
            goto L3d
        L1a:
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L25
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            goto L3d
        L25:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            java.lang.Class r2 = r0.getClass()
            java.lang.Class r3 = java.lang.Long.TYPE
            java.util.function.Function r1 = r1.getTypeConvert(r2, r3)
            if (r1 == 0) goto L43
            java.lang.Object r0 = r1.apply(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
        L3d:
            int r2 = r7 + 1
            r6[r7] = r0
            r7 = r2
            goto Lb
        L43:
            java.lang.String r5 = "can not cast to long "
            java.lang.Class r6 = r0.getClass()
            ah.a.i(r6, r5)
            r5 = 0
            return r5
        L4e:
            java.util.function.Function<long[], java.lang.Object> r5 = r4.builder
            if (r5 == 0) goto L57
            java.lang.Object r5 = r5.apply(r6)
            return r5
        L57:
            return r6
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ java.lang.Class getObjectClass() {
            r1 = this;
            java.lang.Class r0 = super.getObjectClass()
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            long[] r1 = r1.readInt64ValueArray()
            if (r1 == 0) goto Le
            java.util.function.Function<long[], java.lang.Object> r2 = r0.builder
            if (r2 == 0) goto Le
            java.lang.Object r1 = r2.apply(r1)
        Le:
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            long[] r1 = r1.readInt64ValueArray()
            if (r1 == 0) goto Le
            java.util.function.Function<long[], java.lang.Object> r2 = r0.builder
            if (r2 == 0) goto Le
            java.lang.Object r1 = r2.apply(r1)
        Le:
            return r1
    }
}
