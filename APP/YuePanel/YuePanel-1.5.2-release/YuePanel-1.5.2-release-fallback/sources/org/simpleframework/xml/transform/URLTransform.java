package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes2.dex */
class URLTransform implements org.simpleframework.xml.transform.Transform<java.net.URL> {
    public URLTransform() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.net.URL read(java.lang.String r1) throws java.lang.Exception {
            r0 = this;
            java.net.URL r1 = r0.read2(r1)
            return r1
    }

    @Override // org.simpleframework.xml.transform.Transform
    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
    public java.net.URL read2(java.lang.String r2) throws java.lang.Exception {
            r1 = this;
            java.net.URL r0 = new java.net.URL
            r0.<init>(r2)
            return r0
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.lang.String write(java.net.URL r1) throws java.lang.Exception {
            r0 = this;
            java.net.URL r1 = (java.net.URL) r1
            java.lang.String r1 = r0.write2(r1)
            return r1
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    public java.lang.String write2(java.net.URL r1) throws java.lang.Exception {
            r0 = this;
            java.lang.String r1 = r1.toString()
            return r1
    }
}
