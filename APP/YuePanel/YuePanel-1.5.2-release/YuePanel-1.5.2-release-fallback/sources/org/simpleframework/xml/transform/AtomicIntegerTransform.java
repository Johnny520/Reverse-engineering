package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes2.dex */
class AtomicIntegerTransform implements org.simpleframework.xml.transform.Transform<java.util.concurrent.atomic.AtomicInteger> {
    public AtomicIntegerTransform() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.util.concurrent.atomic.AtomicInteger read(java.lang.String r1) throws java.lang.Exception {
            r0 = this;
            java.util.concurrent.atomic.AtomicInteger r1 = r0.read2(r1)
            return r1
    }

    @Override // org.simpleframework.xml.transform.Transform
    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
    public java.util.concurrent.atomic.AtomicInteger read2(java.lang.String r2) {
            r1 = this;
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            int r2 = r2.intValue()
            r0.<init>(r2)
            return r0
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.lang.String write(java.util.concurrent.atomic.AtomicInteger r1) throws java.lang.Exception {
            r0 = this;
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1
            java.lang.String r1 = r0.write2(r1)
            return r1
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    public java.lang.String write2(java.util.concurrent.atomic.AtomicInteger r1) {
            r0 = this;
            java.lang.String r1 = r1.toString()
            return r1
    }
}
