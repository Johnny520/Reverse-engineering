package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class ArrayFactory extends org.simpleframework.xml.core.Factory {
    public ArrayFactory(org.simpleframework.xml.core.Context r1, org.simpleframework.xml.strategy.Type r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private java.lang.Class getComponentType() throws java.lang.Exception {
            r3 = this;
            java.lang.Class r0 = r3.getType()
            boolean r1 = r0.isArray()
            if (r1 == 0) goto Lf
            java.lang.Class r0 = r0.getComponentType()
            return r0
        Lf:
            org.simpleframework.xml.core.InstantiationException r1 = new org.simpleframework.xml.core.InstantiationException
            org.simpleframework.xml.strategy.Type r2 = r3.type
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}
            java.lang.String r2 = "The %s not an array for %s"
            r1.<init>(r2, r0)
            throw r1
    }

    private org.simpleframework.xml.core.Instance getInstance(org.simpleframework.xml.strategy.Value r3, java.lang.Class r4) throws java.lang.Exception {
            r2 = this;
            java.lang.Class r0 = r2.getComponentType()
            boolean r1 = r0.isAssignableFrom(r4)
            if (r1 == 0) goto L10
            org.simpleframework.xml.core.ArrayInstance r4 = new org.simpleframework.xml.core.ArrayInstance
            r4.<init>(r3)
            return r4
        L10:
            org.simpleframework.xml.core.InstantiationException r3 = new org.simpleframework.xml.core.InstantiationException
            org.simpleframework.xml.strategy.Type r1 = r2.type
            java.lang.Object[] r4 = new java.lang.Object[]{r0, r4, r1}
            java.lang.String r0 = "Array of type %s cannot hold %s for %s"
            r3.<init>(r0, r4)
            throw r3
    }

    @Override // org.simpleframework.xml.core.Factory
    public java.lang.Object getInstance() throws java.lang.Exception {
            r2 = this;
            java.lang.Class r0 = r2.getComponentType()
            if (r0 == 0) goto Lc
            r1 = 0
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public org.simpleframework.xml.core.Instance getInstance(org.simpleframework.xml.stream.InputNode r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.stream.Position r0 = r3.getPosition()
            org.simpleframework.xml.strategy.Value r3 = r2.getOverride(r3)
            if (r3 == 0) goto L13
            java.lang.Class r0 = r3.getType()
            org.simpleframework.xml.core.Instance r3 = r2.getInstance(r3, r0)
            return r3
        L13:
            org.simpleframework.xml.core.ElementException r3 = new org.simpleframework.xml.core.ElementException
            org.simpleframework.xml.strategy.Type r1 = r2.type
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            java.lang.String r1 = "Array length required for %s at %s"
            r3.<init>(r1, r0)
            throw r3
    }
}
