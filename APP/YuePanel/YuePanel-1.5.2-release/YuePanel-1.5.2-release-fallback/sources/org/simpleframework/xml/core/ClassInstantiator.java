package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class ClassInstantiator implements org.simpleframework.xml.core.Instantiator {
    private final java.util.List<org.simpleframework.xml.core.Creator> creators;
    private final org.simpleframework.xml.core.Detail detail;
    private final org.simpleframework.xml.core.Creator primary;
    private final org.simpleframework.xml.core.ParameterMap registry;

    public ClassInstantiator(java.util.List<org.simpleframework.xml.core.Creator> r1, org.simpleframework.xml.core.Creator r2, org.simpleframework.xml.core.ParameterMap r3, org.simpleframework.xml.core.Detail r4) {
            r0 = this;
            r0.<init>()
            r0.creators = r1
            r0.registry = r3
            r0.primary = r2
            r0.detail = r4
            return
    }

    private org.simpleframework.xml.core.Creator getCreator(org.simpleframework.xml.core.Criteria r9) throws java.lang.Exception {
            r8 = this;
            org.simpleframework.xml.core.Creator r0 = r8.primary
            java.util.List<org.simpleframework.xml.core.Creator> r1 = r8.creators
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        La:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L21
            java.lang.Object r4 = r1.next()
            org.simpleframework.xml.core.Creator r4 = (org.simpleframework.xml.core.Creator) r4
            double r5 = r4.getScore(r9)
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 <= 0) goto La
            r0 = r4
            r2 = r5
            goto La
        L21:
            return r0
    }

    @Override // org.simpleframework.xml.core.Instantiator
    public java.util.List<org.simpleframework.xml.core.Creator> getCreators() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<org.simpleframework.xml.core.Creator> r1 = r2.creators
            r0.<init>(r1)
            return r0
    }

    @Override // org.simpleframework.xml.core.Instantiator
    public java.lang.Object getInstance() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Creator r0 = r1.primary
            java.lang.Object r0 = r0.getInstance()
            return r0
    }

    @Override // org.simpleframework.xml.core.Instantiator
    public java.lang.Object getInstance(org.simpleframework.xml.core.Criteria r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.Creator r0 = r2.getCreator(r3)
            if (r0 == 0) goto Lb
            java.lang.Object r3 = r0.getInstance(r3)
            return r3
        Lb:
            org.simpleframework.xml.core.PersistenceException r3 = new org.simpleframework.xml.core.PersistenceException
            org.simpleframework.xml.core.Detail r0 = r2.detail
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "Constructor not matched for %s"
            r3.<init>(r1, r0)
            throw r3
    }

    @Override // org.simpleframework.xml.core.Instantiator
    public org.simpleframework.xml.core.Parameter getParameter(java.lang.String r2) {
            r1 = this;
            org.simpleframework.xml.core.ParameterMap r0 = r1.registry
            java.lang.Object r2 = r0.get(r2)
            org.simpleframework.xml.core.Parameter r2 = (org.simpleframework.xml.core.Parameter) r2
            return r2
    }

    @Override // org.simpleframework.xml.core.Instantiator
    public java.util.List<org.simpleframework.xml.core.Parameter> getParameters() {
            r1 = this;
            org.simpleframework.xml.core.ParameterMap r0 = r1.registry
            java.util.List r0 = r0.getAll()
            return r0
    }

    @Override // org.simpleframework.xml.core.Instantiator
    public boolean isDefault() {
            r3 = this;
            java.util.List<org.simpleframework.xml.core.Creator> r0 = r3.creators
            int r0 = r0.size()
            r1 = 0
            r2 = 1
            if (r0 > r2) goto Lf
            org.simpleframework.xml.core.Creator r0 = r3.primary
            if (r0 == 0) goto Lf
            r1 = r2
        Lf:
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            org.simpleframework.xml.core.Detail r0 = r2.detail
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "creator for %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }
}
