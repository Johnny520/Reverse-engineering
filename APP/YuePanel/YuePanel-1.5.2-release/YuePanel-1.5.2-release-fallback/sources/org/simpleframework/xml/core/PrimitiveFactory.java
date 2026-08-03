package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
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

    public java.lang.Object getInstance(java.lang.String r2, java.lang.Class r3) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Support r0 = r1.support
            java.lang.Object r2 = r0.read(r2, r3)
            return r2
    }

    public org.simpleframework.xml.core.Instance getInstance(org.simpleframework.xml.stream.InputNode r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.strategy.Value r3 = r2.getOverride(r3)
            java.lang.Class r0 = r2.getType()
            if (r3 != 0) goto L11
            org.simpleframework.xml.core.Context r3 = r2.context
            org.simpleframework.xml.core.Instance r3 = r3.getInstance(r0)
            return r3
        L11:
            org.simpleframework.xml.core.ObjectInstance r0 = new org.simpleframework.xml.core.ObjectInstance
            org.simpleframework.xml.core.Context r1 = r2.context
            r0.<init>(r1, r3)
            return r0
    }

    public java.lang.String getText(java.lang.Object r3) throws java.lang.Exception {
            r2 = this;
            java.lang.Class r0 = r3.getClass()
            boolean r1 = r0.isEnum()
            if (r1 == 0) goto L11
            org.simpleframework.xml.core.Support r1 = r2.support
            java.lang.String r3 = r1.write(r3, r0)
            return r3
        L11:
            org.simpleframework.xml.core.Support r1 = r2.support
            java.lang.String r3 = r1.write(r3, r0)
            return r3
    }
}
