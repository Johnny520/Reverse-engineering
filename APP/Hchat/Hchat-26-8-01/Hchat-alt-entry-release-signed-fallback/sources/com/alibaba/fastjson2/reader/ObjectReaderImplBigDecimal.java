package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplBigDecimal extends com.alibaba.fastjson2.reader.ObjectReaderPrimitive {
    static final com.alibaba.fastjson2.reader.ObjectReaderImplBigDecimal INSTANCE = null;
    private java.util.function.Function converter;
    final java.util.function.Function<java.math.BigDecimal, java.lang.Object> function;

    static {
            com.alibaba.fastjson2.reader.ObjectReaderImplBigDecimal r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplBigDecimal
            r1 = 0
            r0.<init>(r1)
            com.alibaba.fastjson2.reader.ObjectReaderImplBigDecimal.INSTANCE = r0
            return
    }

    public ObjectReaderImplBigDecimal(java.util.function.Function<java.math.BigDecimal, java.lang.Object> r3) {
            r2 = this;
            java.lang.Class<java.math.BigDecimal> r0 = java.math.BigDecimal.class
            r2.<init>(r0)
            com.alibaba.fastjson2.function.impl.ToAny r1 = new com.alibaba.fastjson2.function.impl.ToAny
            r1.<init>(r0)
            r2.converter = r1
            r2.function = r3
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object createInstance(java.util.Map r1, long r2) {
            r0 = this;
            java.lang.String r2 = "value"
            java.lang.Object r2 = r1.get(r2)
            if (r2 != 0) goto Le
            java.lang.String r2 = "$numberDecimal"
            java.lang.Object r2 = r1.get(r2)
        Le:
            boolean r1 = r2 instanceof java.math.BigDecimal
            if (r1 != 0) goto L18
            java.util.function.Function r1 = r0.converter
            java.lang.Object r2 = r1.apply(r2)
        L18:
            java.math.BigDecimal r2 = (java.math.BigDecimal) r2
            java.util.function.Function<java.math.BigDecimal, java.lang.Object> r1 = r0.function
            if (r1 == 0) goto L23
            java.lang.Object r1 = r1.apply(r2)
            return r1
        L23:
            return r2
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.math.BigDecimal r1 = r1.readBigDecimal()
            java.util.function.Function<java.math.BigDecimal, java.lang.Object> r2 = r0.function
            if (r2 == 0) goto Lc
            java.lang.Object r1 = r2.apply(r1)
        Lc:
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.math.BigDecimal r1 = r1.readBigDecimal()
            java.util.function.Function<java.math.BigDecimal, java.lang.Object> r2 = r0.function
            if (r2 == 0) goto Lc
            java.lang.Object r1 = r2.apply(r1)
        Lc:
            return r1
    }
}
