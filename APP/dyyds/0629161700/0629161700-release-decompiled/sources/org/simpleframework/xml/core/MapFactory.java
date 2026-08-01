package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class MapFactory extends org.simpleframework.xml.core.Factory {
    public MapFactory(org.simpleframework.xml.core.Context r1, org.simpleframework.xml.strategy.Type r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private boolean isMap(java.lang.Class r1) {
            r0 = this;
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r0 = r0.isAssignableFrom(r1)
            return r0
    }

    public java.lang.Class getConversion(java.lang.Class r3) {
            r2 = this;
            java.lang.Class<java.util.HashMap> r0 = java.util.HashMap.class
            boolean r1 = r3.isAssignableFrom(r0)
            if (r1 == 0) goto L9
            return r0
        L9:
            java.lang.Class<java.util.TreeMap> r0 = java.util.TreeMap.class
            boolean r1 = r3.isAssignableFrom(r0)
            if (r1 == 0) goto L12
            return r0
        L12:
            org.simpleframework.xml.core.InstantiationException r0 = new org.simpleframework.xml.core.InstantiationException
            org.simpleframework.xml.strategy.Type r2 = r2.type
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r2}
            java.lang.String r3 = "Cannot instantiate %s for %s"
            r0.<init>(r3, r2)
            throw r0
    }

    @Override // org.simpleframework.xml.core.Factory
    public java.lang.Object getInstance() {
            r3 = this;
            java.lang.Class r0 = r3.getType()
            boolean r1 = org.simpleframework.xml.core.Factory.isInstantiable(r0)
            if (r1 != 0) goto Lf
            java.lang.Class r1 = r3.getConversion(r0)
            goto L10
        Lf:
            r1 = r0
        L10:
            boolean r2 = r3.isMap(r1)
            if (r2 == 0) goto L1b
            java.lang.Object r3 = r1.newInstance()
            return r3
        L1b:
            org.simpleframework.xml.core.InstantiationException r1 = new org.simpleframework.xml.core.InstantiationException
            org.simpleframework.xml.strategy.Type r3 = r3.type
            java.lang.Object[] r3 = new java.lang.Object[]{r0, r3}
            java.lang.String r0 = "Invalid map %s for %s"
            r1.<init>(r0, r3)
            throw r1
    }

    public org.simpleframework.xml.core.Instance getInstance(org.simpleframework.xml.strategy.Value r3) {
            r2 = this;
            java.lang.Class r0 = r3.getType()
            boolean r1 = org.simpleframework.xml.core.Factory.isInstantiable(r0)
            if (r1 != 0) goto Le
            java.lang.Class r0 = r2.getConversion(r0)
        Le:
            boolean r1 = r2.isMap(r0)
            if (r1 == 0) goto L1c
            org.simpleframework.xml.core.ConversionInstance r1 = new org.simpleframework.xml.core.ConversionInstance
            org.simpleframework.xml.core.Context r2 = r2.context
            r1.<init>(r2, r3, r0)
            return r1
        L1c:
            org.simpleframework.xml.core.InstantiationException r3 = new org.simpleframework.xml.core.InstantiationException
            org.simpleframework.xml.strategy.Type r2 = r2.type
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r2}
            java.lang.String r0 = "Invalid map %s for %s"
            r3.<init>(r0, r2)
            throw r3
    }

    public org.simpleframework.xml.core.Instance getInstance(org.simpleframework.xml.stream.InputNode r2) {
            r1 = this;
            org.simpleframework.xml.strategy.Value r2 = r1.getOverride(r2)
            java.lang.Class r0 = r1.getType()
            if (r2 == 0) goto Lf
            org.simpleframework.xml.core.Instance r1 = r1.getInstance(r2)
            return r1
        Lf:
            boolean r2 = org.simpleframework.xml.core.Factory.isInstantiable(r0)
            if (r2 != 0) goto L19
            java.lang.Class r0 = r1.getConversion(r0)
        L19:
            boolean r2 = r1.isMap(r0)
            if (r2 == 0) goto L26
            org.simpleframework.xml.core.Context r1 = r1.context
            org.simpleframework.xml.core.Instance r1 = r1.getInstance(r0)
            return r1
        L26:
            org.simpleframework.xml.core.InstantiationException r2 = new org.simpleframework.xml.core.InstantiationException
            org.simpleframework.xml.strategy.Type r1 = r1.type
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r1}
            java.lang.String r0 = "Invalid map %s for %s"
            r2.<init>(r0, r1)
            throw r2
    }
}
