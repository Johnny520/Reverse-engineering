package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes2.dex */
class StringTransform implements org.simpleframework.xml.transform.Transform<java.lang.String> {
    public StringTransform() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.lang.String read(java.lang.String r1) throws java.lang.Exception {
            r0 = this;
            java.lang.String r1 = r0.read2(r1)
            return r1
    }

    @Override // org.simpleframework.xml.transform.Transform
    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
    public java.lang.String read2(java.lang.String r1) {
            r0 = this;
            return r1
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.lang.String write(java.lang.String r1) throws java.lang.Exception {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r0.write2(r1)
            return r1
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    public java.lang.String write2(java.lang.String r1) {
            r0 = this;
            return r1
    }
}
