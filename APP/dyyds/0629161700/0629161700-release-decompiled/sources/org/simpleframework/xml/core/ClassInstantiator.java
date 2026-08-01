package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
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

    private org.simpleframework.xml.core.Creator getCreator(org.simpleframework.xml.core.Criteria r8) {
            r7 = this;
            org.simpleframework.xml.core.Creator r0 = r7.primary
            java.util.List<org.simpleframework.xml.core.Creator> r7 = r7.creators
            java.util.Iterator r7 = r7.iterator()
            r1 = 0
        La:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L21
            java.lang.Object r3 = r7.next()
            org.simpleframework.xml.core.Creator r3 = (org.simpleframework.xml.core.Creator) r3
            double r4 = r3.getScore(r8)
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 <= 0) goto La
            r0 = r3
            r1 = r4
            goto La
        L21:
            return r0
    }

    @Override // org.simpleframework.xml.core.Instantiator
    public java.util.List<org.simpleframework.xml.core.Creator> getCreators() {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<org.simpleframework.xml.core.Creator> r1 = r1.creators
            r0.<init>(r1)
            return r0
    }

    @Override // org.simpleframework.xml.core.Instantiator
    public java.lang.Object getInstance() {
            r0 = this;
            org.simpleframework.xml.core.Creator r0 = r0.primary
            java.lang.Object r0 = r0.getInstance()
            return r0
    }

    @Override // org.simpleframework.xml.core.Instantiator
    public java.lang.Object getInstance(org.simpleframework.xml.core.Criteria r2) {
            r1 = this;
            org.simpleframework.xml.core.Creator r0 = r1.getCreator(r2)
            if (r0 == 0) goto Lb
            java.lang.Object r1 = r0.getInstance(r2)
            return r1
        Lb:
            org.simpleframework.xml.core.PersistenceException r2 = new org.simpleframework.xml.core.PersistenceException
            org.simpleframework.xml.core.Detail r1 = r1.detail
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r0 = "Constructor not matched for %s"
            r2.<init>(r0, r1)
            throw r2
    }

    @Override // org.simpleframework.xml.core.Instantiator
    public org.simpleframework.xml.core.Parameter getParameter(java.lang.String r1) {
            r0 = this;
            org.simpleframework.xml.core.ParameterMap r0 = r0.registry
            java.lang.Object r0 = r0.get(r1)
            org.simpleframework.xml.core.Parameter r0 = (org.simpleframework.xml.core.Parameter) r0
            return r0
    }

    @Override // org.simpleframework.xml.core.Instantiator
    public java.util.List<org.simpleframework.xml.core.Parameter> getParameters() {
            r0 = this;
            org.simpleframework.xml.core.ParameterMap r0 = r0.registry
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
            org.simpleframework.xml.core.Creator r3 = r3.primary
            if (r3 == 0) goto Lf
            return r2
        Lf:
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            org.simpleframework.xml.core.Detail r1 = r1.detail
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r0 = "creator for %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            return r1
    }
}
