package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class ObjectFactory extends org.simpleframework.xml.core.PrimitiveFactory {
    public ObjectFactory(org.simpleframework.xml.core.Context r1, org.simpleframework.xml.strategy.Type r2, java.lang.Class r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // org.simpleframework.xml.core.PrimitiveFactory
    public org.simpleframework.xml.core.Instance getInstance(org.simpleframework.xml.stream.InputNode r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.strategy.Value r3 = r2.getOverride(r3)
            java.lang.Class r0 = r2.getType()
            if (r3 != 0) goto L25
            boolean r3 = org.simpleframework.xml.core.Factory.isInstantiable(r0)
            if (r3 == 0) goto L17
            org.simpleframework.xml.core.Context r3 = r2.context
            org.simpleframework.xml.core.Instance r3 = r3.getInstance(r0)
            return r3
        L17:
            org.simpleframework.xml.core.InstantiationException r3 = new org.simpleframework.xml.core.InstantiationException
            org.simpleframework.xml.strategy.Type r1 = r2.type
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "Cannot instantiate %s for %s"
            r3.<init>(r1, r0)
            throw r3
        L25:
            org.simpleframework.xml.core.ObjectInstance r0 = new org.simpleframework.xml.core.ObjectInstance
            org.simpleframework.xml.core.Context r1 = r2.context
            r0.<init>(r1, r3)
            return r0
    }
}
