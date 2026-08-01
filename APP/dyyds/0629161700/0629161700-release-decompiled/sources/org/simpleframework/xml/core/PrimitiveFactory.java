package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class PrimitiveFactory extends org.simpleframework.xml.core.Factory {
    public PrimitiveFactory(org.simpleframework.xml.core.Context r1, org.simpleframework.xml.strategy.Type r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public PrimitiveFactory(org.simpleframework.xml.core.Context r1, org.simpleframework.xml.strategy.Type r2, java.lang.Class r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public java.lang.Object getInstance(java.lang.String r1, java.lang.Class r2) {
            r0 = this;
            org.simpleframework.xml.core.Support r0 = r0.support
            java.lang.Object r0 = r0.read(r1, r2)
            return r0
    }

    public org.simpleframework.xml.core.Instance getInstance(org.simpleframework.xml.stream.InputNode r2) {
            r1 = this;
            org.simpleframework.xml.strategy.Value r2 = r1.getOverride(r2)
            java.lang.Class r0 = r1.getType()
            org.simpleframework.xml.core.Context r1 = r1.context
            if (r2 != 0) goto L11
            org.simpleframework.xml.core.Instance r1 = r1.getInstance(r0)
            return r1
        L11:
            org.simpleframework.xml.core.ObjectInstance r0 = new org.simpleframework.xml.core.ObjectInstance
            r0.<init>(r1, r2)
            return r0
    }

    public java.lang.String getText(java.lang.Object r3) {
            r2 = this;
            java.lang.Class r0 = r3.getClass()
            boolean r1 = r0.isEnum()
            org.simpleframework.xml.core.Support r2 = r2.support
            if (r1 == 0) goto L11
            java.lang.String r2 = r2.write(r3, r0)
            return r2
        L11:
            java.lang.String r2 = r2.write(r3, r0)
            return r2
    }
}
