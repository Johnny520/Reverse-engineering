package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
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

    private void namespace(org.simpleframework.xml.stream.OutputNode r1) {
            r0 = this;
            org.simpleframework.xml.Namespace r0 = r0.primary
            if (r0 == 0) goto Lb
            java.lang.String r0 = r0.reference()
            r1.setReference(r0)
        Lb:
            return
    }

    private void scope(org.simpleframework.xml.stream.OutputNode r3) {
            r2 = this;
            org.simpleframework.xml.stream.NamespaceMap r3 = r3.getNamespaces()
            java.util.List<org.simpleframework.xml.Namespace> r2 = r2.scope
            java.util.Iterator r2 = r2.iterator()
        La:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r2.next()
            org.simpleframework.xml.Namespace r0 = (org.simpleframework.xml.Namespace) r0
            java.lang.String r1 = r0.reference()
            java.lang.String r0 = r0.prefix()
            r3.setReference(r1, r0)
            goto La
        L22:
            return
    }

    public void add(org.simpleframework.xml.Namespace r1) {
            r0 = this;
            java.util.List<org.simpleframework.xml.Namespace> r0 = r0.scope
            r0.add(r1)
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
