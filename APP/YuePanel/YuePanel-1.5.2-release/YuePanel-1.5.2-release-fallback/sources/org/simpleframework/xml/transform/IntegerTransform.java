package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes2.dex */
class IntegerTransform implements org.simpleframework.xml.transform.Transform<java.lang.Integer> {
    public IntegerTransform() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.simpleframework.xml.transform.Transform
    public java.lang.Integer read(java.lang.String r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.lang.Integer read(java.lang.String r1) throws java.lang.Exception {
            r0 = this;
            java.lang.Integer r1 = r0.read(r1)
            return r1
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    public java.lang.String write2(java.lang.Integer r1) {
            r0 = this;
            java.lang.String r1 = r1.toString()
            return r1
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.lang.String write(java.lang.Integer r1) throws java.lang.Exception {
            r0 = this;
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.String r1 = r0.write2(r1)
            return r1
    }
}
