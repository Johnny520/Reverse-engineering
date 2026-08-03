package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes2.dex */
class AtomicLongTransform implements org.simpleframework.xml.transform.Transform<java.util.concurrent.atomic.AtomicLong> {
    public AtomicLongTransform() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.util.concurrent.atomic.AtomicLong read(java.lang.String r1) throws java.lang.Exception {
            r0 = this;
            java.util.concurrent.atomic.AtomicLong r1 = r0.read2(r1)
            return r1
    }

    @Override // org.simpleframework.xml.transform.Transform
    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
    public java.util.concurrent.atomic.AtomicLong read2(java.lang.String r4) {
            r3 = this;
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            long r1 = r4.longValue()
            r0.<init>(r1)
            return r0
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.lang.String write(java.util.concurrent.atomic.AtomicLong r1) throws java.lang.Exception {
            r0 = this;
            java.util.concurrent.atomic.AtomicLong r1 = (java.util.concurrent.atomic.AtomicLong) r1
            java.lang.String r1 = r0.write2(r1)
            return r1
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    public java.lang.String write2(java.util.concurrent.atomic.AtomicLong r1) {
            r0 = this;
            java.lang.String r1 = r1.toString()
            return r1
    }
}
