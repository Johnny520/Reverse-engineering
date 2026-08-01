package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class Qualifier implements org.simpleframework.xml.core.Decorator {
    private org.simpleframework.xml.core.NamespaceDecorator decorator;

    public Qualifier(org.simpleframework.xml.core.Contact r2) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.core.NamespaceDecorator r0 = new org.simpleframework.xml.core.NamespaceDecorator
            r0.<init>()
            r1.decorator = r0
            r1.scan(r2)
            return
    }

    private void namespace(org.simpleframework.xml.core.Contact r2) {
            r1 = this;
            java.lang.Class<org.simpleframework.xml.Namespace> r0 = org.simpleframework.xml.Namespace.class
            java.lang.annotation.Annotation r2 = r2.getAnnotation(r0)
            org.simpleframework.xml.Namespace r2 = (org.simpleframework.xml.Namespace) r2
            if (r2 == 0) goto L14
            org.simpleframework.xml.core.NamespaceDecorator r0 = r1.decorator
            r0.set(r2)
            org.simpleframework.xml.core.NamespaceDecorator r1 = r1.decorator
            r1.add(r2)
        L14:
            return
    }

    private void scan(org.simpleframework.xml.core.Contact r1) {
            r0 = this;
            r0.namespace(r1)
            r0.scope(r1)
            return
    }

    private void scope(org.simpleframework.xml.core.Contact r5) {
            r4 = this;
            java.lang.Class<org.simpleframework.xml.NamespaceList> r0 = org.simpleframework.xml.NamespaceList.class
            java.lang.annotation.Annotation r5 = r5.getAnnotation(r0)
            org.simpleframework.xml.NamespaceList r5 = (org.simpleframework.xml.NamespaceList) r5
            if (r5 == 0) goto L1c
            org.simpleframework.xml.Namespace[] r5 = r5.value()
            int r0 = r5.length
            r1 = 0
        L10:
            if (r1 >= r0) goto L1c
            r2 = r5[r1]
            org.simpleframework.xml.core.NamespaceDecorator r3 = r4.decorator
            r3.add(r2)
            int r1 = r1 + 1
            goto L10
        L1c:
            return
    }

    @Override // org.simpleframework.xml.core.Decorator
    public void decorate(org.simpleframework.xml.stream.OutputNode r1) {
            r0 = this;
            org.simpleframework.xml.core.NamespaceDecorator r0 = r0.decorator
            r0.decorate(r1)
            return
    }

    @Override // org.simpleframework.xml.core.Decorator
    public void decorate(org.simpleframework.xml.stream.OutputNode r1, org.simpleframework.xml.core.Decorator r2) {
            r0 = this;
            org.simpleframework.xml.core.NamespaceDecorator r0 = r0.decorator
            r0.decorate(r1, r2)
            return
    }
}
