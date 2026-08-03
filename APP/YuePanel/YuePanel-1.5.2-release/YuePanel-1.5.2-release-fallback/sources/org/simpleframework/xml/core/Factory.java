package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
abstract class Factory {
    protected org.simpleframework.xml.core.Context context;
    protected java.lang.Class override;
    protected org.simpleframework.xml.core.Support support;
    protected org.simpleframework.xml.strategy.Type type;

    public Factory(org.simpleframework.xml.core.Context r2, org.simpleframework.xml.strategy.Type r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public Factory(org.simpleframework.xml.core.Context r2, org.simpleframework.xml.strategy.Type r3, java.lang.Class r4) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.core.Support r0 = r2.getSupport()
            r1.support = r0
            r1.override = r4
            r1.context = r2
            r1.type = r3
            return
    }

    private org.simpleframework.xml.strategy.Type getPrimitive(org.simpleframework.xml.strategy.Type r2, java.lang.Class r3) throws java.lang.Exception {
            r1 = this;
            java.lang.Class r0 = org.simpleframework.xml.core.Support.getPrimitive(r3)
            if (r0 == r3) goto Lc
            org.simpleframework.xml.core.OverrideType r3 = new org.simpleframework.xml.core.OverrideType
            r3.<init>(r2, r0)
            return r3
        Lc:
            return r2
    }

    public static boolean isCompatible(java.lang.Class r1, java.lang.Class r2) {
            boolean r0 = r1.isArray()
            if (r0 == 0) goto La
            java.lang.Class r1 = r1.getComponentType()
        La:
            boolean r1 = r1.isAssignableFrom(r2)
            return r1
    }

    public static boolean isInstantiable(java.lang.Class r1) {
            int r1 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r1)
            if (r0 == 0) goto Lc
            r1 = 0
            return r1
        Lc:
            boolean r1 = java.lang.reflect.Modifier.isInterface(r1)
            r1 = r1 ^ 1
            return r1
    }

    public org.simpleframework.xml.strategy.Value getConversion(org.simpleframework.xml.stream.InputNode r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.Context r0 = r2.context
            org.simpleframework.xml.strategy.Type r1 = r2.type
            org.simpleframework.xml.strategy.Value r3 = r0.getOverride(r1, r3)
            if (r3 == 0) goto L22
            java.lang.Class r0 = r2.override
            if (r0 == 0) goto L22
            java.lang.Class r0 = r3.getType()
            java.lang.Class r1 = r2.override
            boolean r0 = isCompatible(r1, r0)
            if (r0 != 0) goto L22
            org.simpleframework.xml.core.OverrideValue r0 = new org.simpleframework.xml.core.OverrideValue
            java.lang.Class r1 = r2.override
            r0.<init>(r3, r1)
            return r0
        L22:
            return r3
    }

    public java.lang.Object getInstance() throws java.lang.Exception {
            r3 = this;
            java.lang.Class r0 = r3.getType()
            boolean r1 = isInstantiable(r0)
            if (r1 == 0) goto Lf
            java.lang.Object r0 = r0.newInstance()
            return r0
        Lf:
            org.simpleframework.xml.core.InstantiationException r1 = new org.simpleframework.xml.core.InstantiationException
            java.lang.String r2 = "Type %s can not be instantiated"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r1.<init>(r2, r0)
            throw r1
    }

    public org.simpleframework.xml.strategy.Value getOverride(org.simpleframework.xml.stream.InputNode r4) throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.strategy.Value r0 = r3.getConversion(r4)
            if (r0 == 0) goto L27
            org.simpleframework.xml.stream.Position r4 = r4.getPosition()
            java.lang.Class r1 = r0.getType()
            java.lang.Class r2 = r3.getType()
            boolean r2 = isCompatible(r2, r1)
            if (r2 == 0) goto L19
            goto L27
        L19:
            org.simpleframework.xml.core.InstantiationException r0 = new org.simpleframework.xml.core.InstantiationException
            org.simpleframework.xml.strategy.Type r2 = r3.type
            java.lang.Object[] r4 = new java.lang.Object[]{r1, r2, r4}
            java.lang.String r1 = "Incompatible %s for %s at %s"
            r0.<init>(r1, r4)
            throw r0
        L27:
            return r0
    }

    public java.lang.Class getType() {
            r1 = this;
            java.lang.Class r0 = r1.override
            if (r0 == 0) goto L5
            return r0
        L5:
            org.simpleframework.xml.strategy.Type r0 = r1.type
            java.lang.Class r0 = r0.getType()
            return r0
    }

    public boolean setOverride(org.simpleframework.xml.strategy.Type r3, java.lang.Object r4, org.simpleframework.xml.stream.OutputNode r5) throws java.lang.Exception {
            r2 = this;
            java.lang.Class r0 = r3.getType()
            boolean r1 = r0.isPrimitive()
            if (r1 == 0) goto Le
            org.simpleframework.xml.strategy.Type r3 = r2.getPrimitive(r3, r0)
        Le:
            org.simpleframework.xml.core.Context r0 = r2.context
            boolean r3 = r0.setOverride(r3, r4, r5)
            return r3
    }
}
