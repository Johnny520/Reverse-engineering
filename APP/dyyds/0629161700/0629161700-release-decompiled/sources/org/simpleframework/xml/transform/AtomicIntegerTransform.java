package org.simpleframework.xml.transform;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class AtomicIntegerTransform implements org.simpleframework.xml.transform.Transform<java.util.concurrent.atomic.AtomicInteger> {
    public AtomicIntegerTransform() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.util.concurrent.atomic.AtomicInteger read(java.lang.String r1) {
            r0 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r0.read2(r1)
            return r0
    }

    @Override // org.simpleframework.xml.transform.Transform
    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
    public java.util.concurrent.atomic.AtomicInteger read2(java.lang.String r1) {
            r0 = this;
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            int r0 = r0.intValue()
            r1.<init>(r0)
            return r1
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.lang.String write(java.util.concurrent.atomic.AtomicInteger r1) {
            r0 = this;
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1
            java.lang.String r0 = r0.write2(r1)
            return r0
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    public java.lang.String write2(java.util.concurrent.atomic.AtomicInteger r1) {
            r0 = this;
            java.lang.String r0 = r1.toString()
            return r0
    }
}
