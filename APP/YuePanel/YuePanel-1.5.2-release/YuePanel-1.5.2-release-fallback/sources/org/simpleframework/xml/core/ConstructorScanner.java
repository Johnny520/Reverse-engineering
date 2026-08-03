package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class ConstructorScanner {
    private org.simpleframework.xml.core.Signature primary;
    private org.simpleframework.xml.core.ParameterMap registry;
    private java.util.List<org.simpleframework.xml.core.Signature> signatures;
    private org.simpleframework.xml.core.Support support;

    public ConstructorScanner(org.simpleframework.xml.core.Detail r2, org.simpleframework.xml.core.Support r3) throws java.lang.Exception {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.signatures = r0
            org.simpleframework.xml.core.ParameterMap r0 = new org.simpleframework.xml.core.ParameterMap
            r0.<init>()
            r1.registry = r0
            r1.support = r3
            r1.scan(r2)
            return
    }

    private void scan(java.lang.reflect.Constructor r4) throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.core.SignatureScanner r0 = new org.simpleframework.xml.core.SignatureScanner
            org.simpleframework.xml.core.ParameterMap r1 = r3.registry
            org.simpleframework.xml.core.Support r2 = r3.support
            r0.<init>(r4, r1, r2)
            boolean r4 = r0.isValid()
            if (r4 == 0) goto L31
            java.util.List r4 = r0.getSignatures()
            java.util.Iterator r4 = r4.iterator()
        L17:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L31
            java.lang.Object r0 = r4.next()
            org.simpleframework.xml.core.Signature r0 = (org.simpleframework.xml.core.Signature) r0
            int r1 = r0.size()
            if (r1 != 0) goto L2b
            r3.primary = r0
        L2b:
            java.util.List<org.simpleframework.xml.core.Signature> r1 = r3.signatures
            r1.add(r0)
            goto L17
        L31:
            return
    }

    private void scan(org.simpleframework.xml.core.Detail r6) throws java.lang.Exception {
            r5 = this;
            java.lang.reflect.Constructor[] r0 = r6.getConstructors()
            boolean r1 = r6.isInstantiable()
            if (r1 == 0) goto L1d
            int r1 = r0.length
            r2 = 0
        Lc:
            if (r2 >= r1) goto L1c
            r3 = r0[r2]
            boolean r4 = r6.isPrimitive()
            if (r4 != 0) goto L19
            r5.scan(r3)
        L19:
            int r2 = r2 + 1
            goto Lc
        L1c:
            return
        L1d:
            org.simpleframework.xml.core.ConstructorException r0 = new org.simpleframework.xml.core.ConstructorException
            java.lang.String r1 = "Can not construct inner %s"
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            r0.<init>(r1, r6)
            throw r0
    }

    public org.simpleframework.xml.core.ParameterMap getParameters() {
            r1 = this;
            org.simpleframework.xml.core.ParameterMap r0 = r1.registry
            return r0
    }

    public org.simpleframework.xml.core.Signature getSignature() {
            r1 = this;
            org.simpleframework.xml.core.Signature r0 = r1.primary
            return r0
    }

    public java.util.List<org.simpleframework.xml.core.Signature> getSignatures() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<org.simpleframework.xml.core.Signature> r1 = r2.signatures
            r0.<init>(r1)
            return r0
    }
}
