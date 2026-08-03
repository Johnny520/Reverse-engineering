package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class NamespaceDecorator implements org.simpleframework.xml.core.Decorator {
    private org.simpleframework.xml.Namespace primary;
    private java.util.List<org.simpleframework.xml.Namespace> scope;

    public NamespaceDecorator() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.scope = r0
            return
    }

    private void namespace(org.simpleframework.xml.stream.OutputNode r2) {
            r1 = this;
            org.simpleframework.xml.Namespace r0 = r1.primary
            if (r0 == 0) goto Lb
            java.lang.String r0 = r0.reference()
            r2.setReference(r0)
        Lb:
            return
    }

    private void scope(org.simpleframework.xml.stream.OutputNode r4) {
            r3 = this;
            org.simpleframework.xml.stream.NamespaceMap r4 = r4.getNamespaces()
            java.util.List<org.simpleframework.xml.Namespace> r0 = r3.scope
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            org.simpleframework.xml.Namespace r1 = (org.simpleframework.xml.Namespace) r1
            java.lang.String r2 = r1.reference()
            java.lang.String r1 = r1.prefix()
            r4.setReference(r2, r1)
            goto La
        L22:
            return
    }

    public void add(org.simpleframework.xml.Namespace r2) {
            r1 = this;
            java.util.List<org.simpleframework.xml.Namespace> r0 = r1.scope
            r0.add(r2)
            return
    }

    @Override // org.simpleframework.xml.core.Decorator
    public void decorate(org.simpleframework.xml.stream.OutputNode r2) {
            r1 = this;
            r0 = 0
            r1.decorate(r2, r0)
            return
    }

    @Override // org.simpleframework.xml.core.Decorator
    public void decorate(org.simpleframework.xml.stream.OutputNode r1, org.simpleframework.xml.core.Decorator r2) {
            r0 = this;
            if (r2 == 0) goto L5
            r2.decorate(r1)
        L5:
            r0.scope(r1)
            r0.namespace(r1)
            return
    }

    public void set(org.simpleframework.xml.Namespace r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r0.add(r1)
        L5:
            r0.primary = r1
            return
    }
}
