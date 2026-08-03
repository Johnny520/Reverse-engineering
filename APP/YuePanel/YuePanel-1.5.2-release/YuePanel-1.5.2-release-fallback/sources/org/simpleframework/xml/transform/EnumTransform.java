package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes2.dex */
class EnumTransform implements org.simpleframework.xml.transform.Transform<java.lang.Enum> {
    private final java.lang.Class type;

    public EnumTransform(java.lang.Class r1) {
            r0 = this;
            r0.<init>()
            r0.type = r1
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.simpleframework.xml.transform.Transform
    public java.lang.Enum read(java.lang.String r2) throws java.lang.Exception {
            r1 = this;
            java.lang.Class r0 = r1.type
            java.lang.Enum r2 = java.lang.Enum.valueOf(r0, r2)
            return r2
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.lang.Enum read(java.lang.String r1) throws java.lang.Exception {
            r0 = this;
            java.lang.Enum r1 = r0.read(r1)
            return r1
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    public java.lang.String write2(java.lang.Enum r1) throws java.lang.Exception {
            r0 = this;
            java.lang.String r1 = r1.name()
            return r1
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.lang.String write(java.lang.Enum r1) throws java.lang.Exception {
            r0 = this;
            java.lang.Enum r1 = (java.lang.Enum) r1
            java.lang.String r1 = r0.write2(r1)
            return r1
    }
}
