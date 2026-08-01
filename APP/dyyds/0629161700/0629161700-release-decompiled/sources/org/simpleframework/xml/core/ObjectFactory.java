package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class ObjectFactory extends org.simpleframework.xml.core.PrimitiveFactory {
    public ObjectFactory(org.simpleframework.xml.core.Context r1, org.simpleframework.xml.strategy.Type r2, java.lang.Class r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // org.simpleframework.xml.core.PrimitiveFactory
    public org.simpleframework.xml.core.Instance getInstance(org.simpleframework.xml.stream.InputNode r2) {
            r1 = this;
            org.simpleframework.xml.strategy.Value r2 = r1.getOverride(r2)
            java.lang.Class r0 = r1.getType()
            if (r2 != 0) goto L25
            boolean r2 = org.simpleframework.xml.core.Factory.isInstantiable(r0)
            if (r2 == 0) goto L17
            org.simpleframework.xml.core.Context r1 = r1.context
            org.simpleframework.xml.core.Instance r1 = r1.getInstance(r0)
            return r1
        L17:
            org.simpleframework.xml.core.InstantiationException r2 = new org.simpleframework.xml.core.InstantiationException
            org.simpleframework.xml.strategy.Type r1 = r1.type
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r1}
            java.lang.String r0 = "Cannot instantiate %s for %s"
            r2.<init>(r0, r1)
            throw r2
        L25:
            org.simpleframework.xml.core.ObjectInstance r0 = new org.simpleframework.xml.core.ObjectInstance
            org.simpleframework.xml.core.Context r1 = r1.context
            r0.<init>(r1, r2)
            return r0
    }
}
