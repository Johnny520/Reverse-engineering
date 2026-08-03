package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class CollectionFactory extends org.simpleframework.xml.core.Factory {
    public CollectionFactory(org.simpleframework.xml.core.Context r1, org.simpleframework.xml.strategy.Type r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private boolean isCollection(java.lang.Class r2) {
            r1 = this;
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            boolean r2 = r0.isAssignableFrom(r2)
            return r2
    }

    public java.lang.Class getConversion(java.lang.Class r3) throws java.lang.Exception {
            r2 = this;
            java.lang.Class<java.util.ArrayList> r0 = java.util.ArrayList.class
            boolean r1 = r3.isAssignableFrom(r0)
            if (r1 == 0) goto L9
            return r0
        L9:
            java.lang.Class<java.util.HashSet> r0 = java.util.HashSet.class
            boolean r1 = r3.isAssignableFrom(r0)
            if (r1 == 0) goto L12
            return r0
        L12:
            java.lang.Class<java.util.TreeSet> r0 = java.util.TreeSet.class
            boolean r1 = r3.isAssignableFrom(r0)
            if (r1 == 0) goto L1b
            return r0
        L1b:
            org.simpleframework.xml.core.InstantiationException r0 = new org.simpleframework.xml.core.InstantiationException
            org.simpleframework.xml.strategy.Type r1 = r2.type
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r1}
            java.lang.String r1 = "Cannot instantiate %s for %s"
            r0.<init>(r1, r3)
            throw r0
    }

    @Override // org.simpleframework.xml.core.Factory
    public java.lang.Object getInstance() throws java.lang.Exception {
            r3 = this;
            java.lang.Class r0 = r3.getType()
            boolean r1 = org.simpleframework.xml.core.Factory.isInstantiable(r0)
            if (r1 != 0) goto Lf
            java.lang.Class r1 = r3.getConversion(r0)
            goto L10
        Lf:
            r1 = r0
        L10:
            boolean r2 = r3.isCollection(r1)
            if (r2 == 0) goto L1b
            java.lang.Object r0 = r1.newInstance()
            return r0
        L1b:
            org.simpleframework.xml.core.InstantiationException r1 = new org.simpleframework.xml.core.InstantiationException
            org.simpleframework.xml.strategy.Type r2 = r3.type
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}
            java.lang.String r2 = "Invalid collection %s for %s"
            r1.<init>(r2, r0)
            throw r1
    }

    public org.simpleframework.xml.core.Instance getInstance(org.simpleframework.xml.strategy.Value r4) throws java.lang.Exception {
            r3 = this;
            java.lang.Class r0 = r4.getType()
            boolean r1 = org.simpleframework.xml.core.Factory.isInstantiable(r0)
            if (r1 != 0) goto Le
            java.lang.Class r0 = r3.getConversion(r0)
        Le:
            boolean r1 = r3.isCollection(r0)
            if (r1 == 0) goto L1c
            org.simpleframework.xml.core.ConversionInstance r1 = new org.simpleframework.xml.core.ConversionInstance
            org.simpleframework.xml.core.Context r2 = r3.context
            r1.<init>(r2, r4, r0)
            return r1
        L1c:
            org.simpleframework.xml.core.InstantiationException r4 = new org.simpleframework.xml.core.InstantiationException
            org.simpleframework.xml.strategy.Type r1 = r3.type
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "Invalid collection %s for %s"
            r4.<init>(r1, r0)
            throw r4
    }

    public org.simpleframework.xml.core.Instance getInstance(org.simpleframework.xml.stream.InputNode r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.strategy.Value r3 = r2.getOverride(r3)
            java.lang.Class r0 = r2.getType()
            if (r3 == 0) goto Lf
            org.simpleframework.xml.core.Instance r3 = r2.getInstance(r3)
            return r3
        Lf:
            boolean r3 = org.simpleframework.xml.core.Factory.isInstantiable(r0)
            if (r3 != 0) goto L19
            java.lang.Class r0 = r2.getConversion(r0)
        L19:
            boolean r3 = r2.isCollection(r0)
            if (r3 == 0) goto L26
            org.simpleframework.xml.core.Context r3 = r2.context
            org.simpleframework.xml.core.Instance r3 = r3.getInstance(r0)
            return r3
        L26:
            org.simpleframework.xml.core.InstantiationException r3 = new org.simpleframework.xml.core.InstantiationException
            org.simpleframework.xml.strategy.Type r1 = r2.type
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "Invalid collection %s for %s"
            r3.<init>(r1, r0)
            throw r3
    }
}
