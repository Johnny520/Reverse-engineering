package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes2.dex */
class BigDecimalTransform implements org.simpleframework.xml.transform.Transform<java.math.BigDecimal> {
    public BigDecimalTransform() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.math.BigDecimal read(java.lang.String r1) throws java.lang.Exception {
            r0 = this;
            java.math.BigDecimal r1 = r0.read2(r1)
            return r1
    }

    @Override // org.simpleframework.xml.transform.Transform
    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
    public java.math.BigDecimal read2(java.lang.String r2) {
            r1 = this;
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r2)
            return r0
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.lang.String write(java.math.BigDecimal r1) throws java.lang.Exception {
            r0 = this;
            java.math.BigDecimal r1 = (java.math.BigDecimal) r1
            java.lang.String r1 = r0.write2(r1)
            return r1
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    public java.lang.String write2(java.math.BigDecimal r1) {
            r0 = this;
            java.lang.String r1 = r1.toString()
            return r1
    }
}
