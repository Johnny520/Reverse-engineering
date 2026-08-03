package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes2.dex */
class FileTransform implements org.simpleframework.xml.transform.Transform<java.io.File> {
    public FileTransform() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.simpleframework.xml.transform.Transform
    public java.io.File read(java.lang.String r2) {
            r1 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            return r0
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.io.File read(java.lang.String r1) throws java.lang.Exception {
            r0 = this;
            java.io.File r1 = r0.read(r1)
            return r1
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    public java.lang.String write2(java.io.File r1) {
            r0 = this;
            java.lang.String r1 = r1.getPath()
            return r1
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.lang.String write(java.io.File r1) throws java.lang.Exception {
            r0 = this;
            java.io.File r1 = (java.io.File) r1
            java.lang.String r1 = r0.write2(r1)
            return r1
    }
}
