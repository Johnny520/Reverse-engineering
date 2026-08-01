package org.simpleframework.xml.transform;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class ShortTransform implements org.simpleframework.xml.transform.Transform<java.lang.Short> {
    public ShortTransform() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.lang.Short read(java.lang.String r1) {
            r0 = this;
            java.lang.Short r0 = r0.read2(r1)
            return r0
    }

    @Override // org.simpleframework.xml.transform.Transform
    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
    public java.lang.Short read2(java.lang.String r1) {
            r0 = this;
            java.lang.Short r0 = java.lang.Short.valueOf(r1)
            return r0
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.lang.String write(java.lang.Short r1) {
            r0 = this;
            java.lang.Short r1 = (java.lang.Short) r1
            java.lang.String r0 = r0.write2(r1)
            return r0
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    public java.lang.String write2(java.lang.Short r1) {
            r0 = this;
            java.lang.String r0 = r1.toString()
            return r0
    }
}
