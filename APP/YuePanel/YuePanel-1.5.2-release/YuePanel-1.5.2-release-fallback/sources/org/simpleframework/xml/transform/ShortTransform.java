package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes2.dex */
class ShortTransform implements org.simpleframework.xml.transform.Transform<java.lang.Short> {
    public ShortTransform() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.lang.Short read(java.lang.String r1) throws java.lang.Exception {
            r0 = this;
            java.lang.Short r1 = r0.read2(r1)
            return r1
    }

    @Override // org.simpleframework.xml.transform.Transform
    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
    public java.lang.Short read2(java.lang.String r1) {
            r0 = this;
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
            return r1
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.lang.String write(java.lang.Short r1) throws java.lang.Exception {
            r0 = this;
            java.lang.Short r1 = (java.lang.Short) r1
            java.lang.String r1 = r0.write2(r1)
            return r1
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    public java.lang.String write2(java.lang.Short r1) {
            r0 = this;
            java.lang.String r1 = r1.toString()
            return r1
    }
}
