package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class ArrayFactory extends org.simpleframework.xml.core.Factory {
    public ArrayFactory(org.simpleframework.xml.core.Context r1, org.simpleframework.xml.strategy.Type r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private java.lang.Class getComponentType() {
            r2 = this;
            java.lang.Class r0 = r2.getType()
            boolean r1 = r0.isArray()
            if (r1 == 0) goto Lf
            java.lang.Class r2 = r0.getComponentType()
            return r2
        Lf:
            org.simpleframework.xml.core.InstantiationException r1 = new org.simpleframework.xml.core.InstantiationException
            org.simpleframework.xml.strategy.Type r2 = r2.type
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r2}
            java.lang.String r0 = "The %s not an array for %s"
            r1.<init>(r0, r2)
            throw r1
    }

    private org.simpleframework.xml.core.Instance getInstance(org.simpleframework.xml.strategy.Value r3, java.lang.Class r4) {
            r2 = this;
            java.lang.Class r0 = r2.getComponentType()
            boolean r1 = r0.isAssignableFrom(r4)
            if (r1 == 0) goto L10
            org.simpleframework.xml.core.ArrayInstance r2 = new org.simpleframework.xml.core.ArrayInstance
            r2.<init>(r3)
            return r2
        L10:
            org.simpleframework.xml.core.InstantiationException r3 = new org.simpleframework.xml.core.InstantiationException
            org.simpleframework.xml.strategy.Type r2 = r2.type
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r4, r2}
            java.lang.String r4 = "Array of type %s cannot hold %s for %s"
            r3.<init>(r4, r2)
            throw r3
    }

    @Override // org.simpleframework.xml.core.Factory
    public java.lang.Object getInstance() {
            r1 = this;
            java.lang.Class r1 = r1.getComponentType()
            if (r1 == 0) goto Lc
            r0 = 0
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r0)
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public org.simpleframework.xml.core.Instance getInstance(org.simpleframework.xml.stream.InputNode r2) {
            r1 = this;
            org.simpleframework.xml.stream.Position r0 = r2.getPosition()
            org.simpleframework.xml.strategy.Value r2 = r1.getOverride(r2)
            if (r2 == 0) goto L13
            java.lang.Class r0 = r2.getType()
            org.simpleframework.xml.core.Instance r1 = r1.getInstance(r2, r0)
            return r1
        L13:
            org.simpleframework.xml.core.ElementException r2 = new org.simpleframework.xml.core.ElementException
            org.simpleframework.xml.strategy.Type r1 = r1.type
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "Array length required for %s at %s"
            r2.<init>(r0, r1)
            throw r2
    }
}
