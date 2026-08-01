package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class InstantiatorBuilder {
    private org.simpleframework.xml.core.LabelMap attributes;
    private org.simpleframework.xml.core.Comparer comparer;
    private org.simpleframework.xml.core.Detail detail;
    private org.simpleframework.xml.core.LabelMap elements;
    private org.simpleframework.xml.core.Instantiator factory;
    private java.util.List<org.simpleframework.xml.core.Creator> options;
    private org.simpleframework.xml.core.Scanner scanner;
    private org.simpleframework.xml.core.LabelMap texts;

    public InstantiatorBuilder(org.simpleframework.xml.core.Scanner r2, org.simpleframework.xml.core.Detail r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.options = r0
            org.simpleframework.xml.core.Comparer r0 = new org.simpleframework.xml.core.Comparer
            r0.<init>()
            r1.comparer = r0
            org.simpleframework.xml.core.LabelMap r0 = new org.simpleframework.xml.core.LabelMap
            r0.<init>()
            r1.attributes = r0
            org.simpleframework.xml.core.LabelMap r0 = new org.simpleframework.xml.core.LabelMap
            r0.<init>()
            r1.elements = r0
            org.simpleframework.xml.core.LabelMap r0 = new org.simpleframework.xml.core.LabelMap
            r0.<init>()
            r1.texts = r0
            r1.scanner = r2
            r1.detail = r3
            return
    }

    private org.simpleframework.xml.core.Instantiator build(org.simpleframework.xml.core.Detail r2) {
            r1 = this;
            org.simpleframework.xml.core.Instantiator r0 = r1.factory
            if (r0 != 0) goto Lb
            org.simpleframework.xml.core.Instantiator r2 = r1.create(r2)
            r1.factory = r2
            return r2
        Lb:
            return r0
    }

    private boolean contains(java.lang.String[] r5, java.lang.String r6) {
            r4 = this;
            int r4 = r5.length
            r0 = 0
            r1 = r0
        L3:
            if (r1 >= r4) goto L15
            r2 = r5[r1]
            r3 = 1
            if (r2 != r6) goto Lb
            return r3
        Lb:
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L12
            return r3
        L12:
            int r1 = r1 + 1
            goto L3
        L15:
            return r0
    }

    private org.simpleframework.xml.core.Creator create(org.simpleframework.xml.core.Signature r2) {
            r1 = this;
            org.simpleframework.xml.core.SignatureCreator r0 = new org.simpleframework.xml.core.SignatureCreator
            r0.<init>(r2)
            if (r2 == 0) goto Lc
            java.util.List<org.simpleframework.xml.core.Creator> r1 = r1.options
            r1.add(r0)
        Lc:
            return r0
    }

    private org.simpleframework.xml.core.Instantiator create(org.simpleframework.xml.core.Detail r4) {
            r3 = this;
            org.simpleframework.xml.core.Scanner r0 = r3.scanner
            org.simpleframework.xml.core.Signature r0 = r0.getSignature()
            org.simpleframework.xml.core.Scanner r1 = r3.scanner
            org.simpleframework.xml.core.ParameterMap r1 = r1.getParameters()
            if (r0 == 0) goto L14
            org.simpleframework.xml.core.SignatureCreator r2 = new org.simpleframework.xml.core.SignatureCreator
            r2.<init>(r0)
            goto L15
        L14:
            r2 = 0
        L15:
            org.simpleframework.xml.core.ClassInstantiator r0 = new org.simpleframework.xml.core.ClassInstantiator
            java.util.List<org.simpleframework.xml.core.Creator> r3 = r3.options
            r0.<init>(r3, r2, r1, r4)
            return r0
    }

    private org.simpleframework.xml.core.Parameter create(org.simpleframework.xml.core.Parameter r2) {
            r1 = this;
            org.simpleframework.xml.core.Label r1 = r1.resolve(r2)
            if (r1 == 0) goto Lc
            org.simpleframework.xml.core.CacheParameter r0 = new org.simpleframework.xml.core.CacheParameter
            r0.<init>(r2, r1)
            return r0
        Lc:
            r1 = 0
            return r1
    }

    private void populate(org.simpleframework.xml.core.Detail r2) {
            r1 = this;
            org.simpleframework.xml.core.Scanner r2 = r1.scanner
            java.util.List r2 = r2.getSignatures()
            java.util.Iterator r2 = r2.iterator()
        La:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r2.next()
            org.simpleframework.xml.core.Signature r0 = (org.simpleframework.xml.core.Signature) r0
            r1.populate(r0)
            goto La
        L1a:
            return
    }

    private void populate(org.simpleframework.xml.core.Signature r3) {
            r2 = this;
            org.simpleframework.xml.core.Signature r0 = new org.simpleframework.xml.core.Signature
            r0.<init>(r3)
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r3.next()
            org.simpleframework.xml.core.Parameter r1 = (org.simpleframework.xml.core.Parameter) r1
            org.simpleframework.xml.core.Parameter r1 = r2.create(r1)
            if (r1 == 0) goto L9
            r0.add(r1)
            goto L9
        L1f:
            r2.create(r0)
            return
    }

    private void register(org.simpleframework.xml.core.Label r3, org.simpleframework.xml.core.LabelMap r4) {
            r2 = this;
            java.lang.String r2 = r3.getName()
            java.lang.String r0 = r3.getPath()
            boolean r1 = r4.containsKey(r2)
            if (r1 == 0) goto L22
            java.lang.Object r1 = r4.get(r2)
            org.simpleframework.xml.core.Label r1 = (org.simpleframework.xml.core.Label) r1
            java.lang.String r1 = r1.getPath()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L25
            r4.remove(r2)
            goto L25
        L22:
            r4.put(r2, r3)
        L25:
            r4.put(r0, r3)
            return
    }

    private org.simpleframework.xml.core.Label resolve(org.simpleframework.xml.core.Parameter r2) {
            r1 = this;
            boolean r0 = r2.isAttribute()
            if (r0 == 0) goto Ld
            org.simpleframework.xml.core.LabelMap r0 = r1.attributes
            org.simpleframework.xml.core.Label r1 = r1.resolve(r2, r0)
            return r1
        Ld:
            boolean r0 = r2.isText()
            if (r0 == 0) goto L1a
            org.simpleframework.xml.core.LabelMap r0 = r1.texts
            org.simpleframework.xml.core.Label r1 = r1.resolve(r2, r0)
            return r1
        L1a:
            org.simpleframework.xml.core.LabelMap r0 = r1.elements
            org.simpleframework.xml.core.Label r1 = r1.resolve(r2, r0)
            return r1
    }

    private org.simpleframework.xml.core.Label resolve(org.simpleframework.xml.core.Parameter r1, org.simpleframework.xml.core.LabelMap r2) {
            r0 = this;
            java.lang.String r0 = r1.getName()
            java.lang.String r1 = r1.getPath()
            java.lang.Object r1 = r2.get(r1)
            org.simpleframework.xml.core.Label r1 = (org.simpleframework.xml.core.Label) r1
            if (r1 != 0) goto L17
            java.lang.Object r0 = r2.get(r0)
            org.simpleframework.xml.core.Label r0 = (org.simpleframework.xml.core.Label) r0
            return r0
        L17:
            return r1
    }

    private void validate(org.simpleframework.xml.core.Detail r5) {
            r4 = this;
            org.simpleframework.xml.core.Scanner r0 = r4.scanner
            org.simpleframework.xml.core.ParameterMap r0 = r0.getParameters()
            java.util.List r0 = r0.getAll()
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            org.simpleframework.xml.core.Parameter r1 = (org.simpleframework.xml.core.Parameter) r1
            org.simpleframework.xml.core.Label r2 = r4.resolve(r1)
            java.lang.String r3 = r1.getPath()
            if (r2 == 0) goto L28
            r4.validateParameter(r2, r1)
            goto Le
        L28:
            org.simpleframework.xml.core.ConstructorException r4 = new org.simpleframework.xml.core.ConstructorException
            java.lang.String r0 = "Parameter '%s' does not have a match in %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r3, r5}
            r4.<init>(r0, r5)
            throw r4
        L34:
            r4.validateConstructors()
            return
    }

    private void validateAnnotations(org.simpleframework.xml.core.Label r4, org.simpleframework.xml.core.Parameter r5) {
            r3 = this;
            java.lang.annotation.Annotation r4 = r4.getAnnotation()
            java.lang.annotation.Annotation r0 = r5.getAnnotation()
            java.lang.String r1 = r5.getName()
            org.simpleframework.xml.core.Comparer r3 = r3.comparer
            boolean r3 = r3.equals(r4, r0)
            if (r3 != 0) goto L2f
            java.lang.Class r3 = r4.annotationType()
            java.lang.Class r4 = r0.annotationType()
            boolean r0 = r3.equals(r4)
            if (r0 == 0) goto L23
            goto L2f
        L23:
            org.simpleframework.xml.core.ConstructorException r0 = new org.simpleframework.xml.core.ConstructorException
            java.lang.String r2 = "Annotation %s does not match %s for '%s' in %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r4, r3, r1, r5}
            r0.<init>(r2, r3)
            throw r0
        L2f:
            return
    }

    private void validateConstructor(org.simpleframework.xml.core.Label r3, java.util.List<org.simpleframework.xml.core.Creator> r4) {
            r2 = this;
            java.util.Iterator r2 = r4.iterator()
        L4:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L2c
            java.lang.Object r4 = r2.next()
            org.simpleframework.xml.core.Creator r4 = (org.simpleframework.xml.core.Creator) r4
            org.simpleframework.xml.core.Signature r4 = r4.getSignature()
            org.simpleframework.xml.core.Contact r0 = r3.getContact()
            java.lang.Object r1 = r3.getKey()
            boolean r0 = r0.isReadOnly()
            if (r0 == 0) goto L4
            org.simpleframework.xml.core.Parameter r4 = r4.get(r1)
            if (r4 != 0) goto L4
            r2.remove()
            goto L4
        L2c:
            return
    }

    private void validateConstructors() {
            r2 = this;
            org.simpleframework.xml.core.Instantiator r0 = r2.factory
            java.util.List r0 = r0.getCreators()
            org.simpleframework.xml.core.Instantiator r1 = r2.factory
            boolean r1 = r1.isDefault()
            if (r1 == 0) goto L18
            org.simpleframework.xml.core.LabelMap r1 = r2.elements
            r2.validateConstructors(r1)
            org.simpleframework.xml.core.LabelMap r1 = r2.attributes
            r2.validateConstructors(r1)
        L18:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L28
            org.simpleframework.xml.core.LabelMap r1 = r2.elements
            r2.validateConstructors(r1, r0)
            org.simpleframework.xml.core.LabelMap r1 = r2.attributes
            r2.validateConstructors(r1, r0)
        L28:
            return
    }

    private void validateConstructors(org.simpleframework.xml.core.LabelMap r3) {
            r2 = this;
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r3.next()
            org.simpleframework.xml.core.Label r0 = (org.simpleframework.xml.core.Label) r0
            if (r0 == 0) goto L4
            org.simpleframework.xml.core.Contact r1 = r0.getContact()
            boolean r1 = r1.isReadOnly()
            if (r1 != 0) goto L1d
            goto L4
        L1d:
            org.simpleframework.xml.core.ConstructorException r3 = new org.simpleframework.xml.core.ConstructorException
            org.simpleframework.xml.core.Detail r2 = r2.detail
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r2}
            java.lang.String r0 = "Default constructor can not accept read only %s in %s"
            r3.<init>(r0, r2)
            throw r3
        L2b:
            return
    }

    private void validateConstructors(org.simpleframework.xml.core.LabelMap r2, java.util.List<org.simpleframework.xml.core.Creator> r3) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r2.next()
            org.simpleframework.xml.core.Label r0 = (org.simpleframework.xml.core.Label) r0
            if (r0 == 0) goto L4
            r1.validateConstructor(r0, r3)
            goto L4
        L16:
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L1d
            return
        L1d:
            org.simpleframework.xml.core.ConstructorException r2 = new org.simpleframework.xml.core.ConstructorException
            org.simpleframework.xml.core.Detail r1 = r1.detail
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r3 = "No constructor accepts all read only values in %s"
            r2.<init>(r3, r1)
            throw r2
    }

    private void validateNames(org.simpleframework.xml.core.Label r3, org.simpleframework.xml.core.Parameter r4) {
            r2 = this;
            java.lang.String[] r0 = r3.getNames()
            java.lang.String r1 = r4.getName()
            boolean r2 = r2.contains(r0, r1)
            if (r2 != 0) goto L35
            java.lang.String r2 = r3.getName()
            if (r1 == r2) goto L35
            java.lang.String r0 = "Annotation does not match %s for '%s' in %s"
            if (r1 == 0) goto L2b
            if (r2 == 0) goto L2b
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L21
            goto L35
        L21:
            org.simpleframework.xml.core.ConstructorException r2 = new org.simpleframework.xml.core.ConstructorException
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r1, r4}
            r2.<init>(r0, r3)
            throw r2
        L2b:
            org.simpleframework.xml.core.ConstructorException r2 = new org.simpleframework.xml.core.ConstructorException
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r1, r4}
            r2.<init>(r0, r3)
            throw r2
        L35:
            return
    }

    private void validateParameter(org.simpleframework.xml.core.Label r4, org.simpleframework.xml.core.Parameter r5) {
            r3 = this;
            org.simpleframework.xml.core.Contact r0 = r4.getContact()
            java.lang.String r1 = r5.getName()
            java.lang.Class r2 = r5.getType()
            java.lang.Class r0 = r0.getType()
            boolean r0 = org.simpleframework.xml.core.Support.isAssignable(r2, r0)
            if (r0 == 0) goto L1d
            r3.validateNames(r4, r5)
            r3.validateAnnotations(r4, r5)
            return
        L1d:
            org.simpleframework.xml.core.ConstructorException r3 = new org.simpleframework.xml.core.ConstructorException
            java.lang.String r0 = "Type is not compatible with %s for '%s' in %s"
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r1, r5}
            r3.<init>(r0, r4)
            throw r3
    }

    public org.simpleframework.xml.core.Instantiator build() {
            r1 = this;
            org.simpleframework.xml.core.Instantiator r0 = r1.factory
            if (r0 != 0) goto L13
            org.simpleframework.xml.core.Detail r0 = r1.detail
            r1.populate(r0)
            org.simpleframework.xml.core.Detail r0 = r1.detail
            r1.build(r0)
            org.simpleframework.xml.core.Detail r0 = r1.detail
            r1.validate(r0)
        L13:
            org.simpleframework.xml.core.Instantiator r1 = r1.factory
            return r1
    }

    public void register(org.simpleframework.xml.core.Label r2) {
            r1 = this;
            boolean r0 = r2.isAttribute()
            if (r0 == 0) goto Lc
            org.simpleframework.xml.core.LabelMap r0 = r1.attributes
            r1.register(r2, r0)
            return
        Lc:
            boolean r0 = r2.isText()
            if (r0 == 0) goto L18
            org.simpleframework.xml.core.LabelMap r0 = r1.texts
            r1.register(r2, r0)
            return
        L18:
            org.simpleframework.xml.core.LabelMap r0 = r1.elements
            r1.register(r2, r0)
            return
    }
}
