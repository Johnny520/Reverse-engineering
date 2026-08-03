package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplBigDecimal extends com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl {
    static final com.alibaba.fastjson2.writer.ObjectWriterImplBigDecimal INSTANCE = null;
    private final java.text.DecimalFormat format;
    final java.util.function.Function<java.lang.Object, java.math.BigDecimal> function;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterImplBigDecimal r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplBigDecimal
            r1 = 0
            r0.<init>(r1, r1)
            com.alibaba.fastjson2.writer.ObjectWriterImplBigDecimal.INSTANCE = r0
            return
    }

    public ObjectWriterImplBigDecimal(java.text.DecimalFormat r1, java.util.function.Function<java.lang.Object, java.math.BigDecimal> r2) {
            r0 = this;
            r0.<init>()
            r0.format = r1
            r0.function = r2
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl
    public java.util.function.Function getFunction() {
            r1 = this;
            java.util.function.Function<java.lang.Object, java.math.BigDecimal> r0 = r1.function
            return r0
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            java.util.function.Function<java.lang.Object, java.math.BigDecimal> r3 = r0.function
            if (r3 == 0) goto Ld
            if (r2 == 0) goto Ld
            java.lang.Object r2 = r3.apply(r2)
            java.math.BigDecimal r2 = (java.math.BigDecimal) r2
            goto Lf
        Ld:
            java.math.BigDecimal r2 = (java.math.BigDecimal) r2
        Lf:
            java.text.DecimalFormat r3 = r0.format
            r1.writeDecimal(r2, r5, r3)
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            java.util.function.Function<java.lang.Object, java.math.BigDecimal> r3 = r0.function
            if (r3 == 0) goto Ld
            if (r2 == 0) goto Ld
            java.lang.Object r2 = r3.apply(r2)
            java.math.BigDecimal r2 = (java.math.BigDecimal) r2
            goto Lf
        Ld:
            java.math.BigDecimal r2 = (java.math.BigDecimal) r2
        Lf:
            java.text.DecimalFormat r3 = r0.format
            r1.writeDecimal(r2, r5, r3)
            return
    }
}
