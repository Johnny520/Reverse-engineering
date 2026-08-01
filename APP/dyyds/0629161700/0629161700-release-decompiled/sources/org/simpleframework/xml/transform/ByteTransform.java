package org.simpleframework.xml.transform;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class ByteTransform implements org.simpleframework.xml.transform.Transform<java.lang.Byte> {
    public ByteTransform() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.simpleframework.xml.transform.Transform
    public java.lang.Byte read(java.lang.String r1) {
            r0 = this;
            java.lang.Byte r0 = java.lang.Byte.valueOf(r1)
            return r0
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.lang.Byte read(java.lang.String r1) {
            r0 = this;
            java.lang.Byte r0 = r0.read(r1)
            return r0
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    public java.lang.String write2(java.lang.Byte r1) {
            r0 = this;
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.lang.String write(java.lang.Byte r1) {
            r0 = this;
            java.lang.Byte r1 = (java.lang.Byte) r1
            java.lang.String r0 = r0.write2(r1)
            return r0
    }
}
