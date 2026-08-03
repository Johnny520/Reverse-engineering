package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
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

    private org.simpleframework.xml.core.Instantiator build(org.simpleframework.xml.core.Detail r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Instantiator r0 = r1.factory
            if (r0 != 0) goto La
            org.simpleframework.xml.core.Instantiator r2 = r1.create(r2)
            r1.factory = r2
        La:
            org.simpleframework.xml.core.Instantiator r2 = r1.factory
            return r2
    }

    private boolean contains(java.lang.String[] r6, java.lang.String r7) throws java.lang.Exception {
            r5 = this;
            int r0 = r6.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto L15
            r3 = r6[r2]
            r4 = 1
            if (r3 != r7) goto Lb
            return r4
        Lb:
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L12
            return r4
        L12:
            int r2 = r2 + 1
            goto L3
        L15:
            return r1
    }

    private org.simpleframework.xml.core.Creator create(org.simpleframework.xml.core.Signature r2) {
            r1 = this;
            org.simpleframework.xml.core.SignatureCreator r0 = new org.simpleframework.xml.core.SignatureCreator
            r0.<init>(r2)
            if (r2 == 0) goto Lc
            java.util.List<org.simpleframework.xml.core.Creator> r2 = r1.options
            r2.add(r0)
        Lc:
            return r0
    }

    private org.simpleframework.xml.core.Instantiator create(org.simpleframework.xml.core.Detail r5) throws java.lang.Exception {
            r4 = this;
            org.simpleframework.xml.core.Scanner r0 = r4.scanner
            org.simpleframework.xml.core.Signature r0 = r0.getSignature()
            org.simpleframework.xml.core.Scanner r1 = r4.scanner
            org.simpleframework.xml.core.ParameterMap r1 = r1.getParameters()
            if (r0 == 0) goto L14
            org.simpleframework.xml.core.SignatureCreator r2 = new org.simpleframework.xml.core.SignatureCreator
            r2.<init>(r0)
            goto L15
        L14:
            r2 = 0
        L15:
            org.simpleframework.xml.core.ClassInstantiator r0 = new org.simpleframework.xml.core.ClassInstantiator
            java.util.List<org.simpleframework.xml.core.Creator> r3 = r4.options
            r0.<init>(r3, r2, r1, r5)
            return r0
    }

    private org.simpleframework.xml.core.Parameter create(org.simpleframework.xml.core.Parameter r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.Label r0 = r2.resolve(r3)
            if (r0 == 0) goto Lc
            org.simpleframework.xml.core.CacheParameter r1 = new org.simpleframework.xml.core.CacheParameter
            r1.<init>(r3, r0)
            return r1
        Lc:
            r3 = 0
            return r3
    }

    private void populate(org.simpleframework.xml.core.Detail r2) throws java.lang.Exception {
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

    private void populate(org.simpleframework.xml.core.Signature r3) throws java.lang.Exception {
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

    private void register(org.simpleframework.xml.core.Label r4, org.simpleframework.xml.core.LabelMap r5) throws java.lang.Exception {
            r3 = this;
            java.lang.String r0 = r4.getName()
            java.lang.String r1 = r4.getPath()
            boolean r2 = r5.containsKey(r0)
            if (r2 == 0) goto L22
            java.lang.Object r2 = r5.get(r0)
            org.simpleframework.xml.core.Label r2 = (org.simpleframework.xml.core.Label) r2
            java.lang.String r2 = r2.getPath()
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L25
            r5.remove(r0)
            goto L25
        L22:
            r5.put(r0, r4)
        L25:
            r5.put(r1, r4)
            return
    }

    private org.simpleframework.xml.core.Label resolve(org.simpleframework.xml.core.Parameter r2) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r2.isAttribute()
            if (r0 == 0) goto Ld
            org.simpleframework.xml.core.LabelMap r0 = r1.attributes
            org.simpleframework.xml.core.Label r2 = r1.resolve(r2, r0)
            return r2
        Ld:
            boolean r0 = r2.isText()
            if (r0 == 0) goto L1a
            org.simpleframework.xml.core.LabelMap r0 = r1.texts
            org.simpleframework.xml.core.Label r2 = r1.resolve(r2, r0)
            return r2
        L1a:
            org.simpleframework.xml.core.LabelMap r0 = r1.elements
            org.simpleframework.xml.core.Label r2 = r1.resolve(r2, r0)
            return r2
    }

    private org.simpleframework.xml.core.Label resolve(org.simpleframework.xml.core.Parameter r2, org.simpleframework.xml.core.LabelMap r3) throws java.lang.Exception {
            r1 = this;
            java.lang.String r0 = r2.getName()
            java.lang.String r2 = r2.getPath()
            java.lang.Object r2 = r3.get(r2)
            org.simpleframework.xml.core.Label r2 = (org.simpleframework.xml.core.Label) r2
            if (r2 != 0) goto L16
            java.lang.Object r2 = r3.get(r0)
            org.simpleframework.xml.core.Label r2 = (org.simpleframework.xml.core.Label) r2
        L16:
            return r2
    }

    private void validate(org.simpleframework.xml.core.Detail r5) throws java.lang.Exception {
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
            org.simpleframework.xml.core.ConstructorException r0 = new org.simpleframework.xml.core.ConstructorException
            java.lang.String r1 = "Parameter '%s' does not have a match in %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r3, r5}
            r0.<init>(r1, r5)
            throw r0
        L34:
            r4.validateConstructors()
            return
    }

    private void validateAnnotations(org.simpleframework.xml.core.Label r5, org.simpleframework.xml.core.Parameter r6) throws java.lang.Exception {
            r4 = this;
            java.lang.annotation.Annotation r5 = r5.getAnnotation()
            java.lang.annotation.Annotation r0 = r6.getAnnotation()
            java.lang.String r1 = r6.getName()
            org.simpleframework.xml.core.Comparer r2 = r4.comparer
            boolean r2 = r2.equals(r5, r0)
            if (r2 != 0) goto L2f
            java.lang.Class r5 = r5.annotationType()
            java.lang.Class r0 = r0.annotationType()
            boolean r2 = r5.equals(r0)
            if (r2 == 0) goto L23
            goto L2f
        L23:
            org.simpleframework.xml.core.ConstructorException r2 = new org.simpleframework.xml.core.ConstructorException
            java.lang.String r3 = "Annotation %s does not match %s for '%s' in %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r0, r5, r1, r6}
            r2.<init>(r3, r5)
            throw r2
        L2f:
            return
    }

    private void validateConstructor(org.simpleframework.xml.core.Label r4, java.util.List<org.simpleframework.xml.core.Creator> r5) throws java.lang.Exception {
            r3 = this;
            java.util.Iterator r5 = r5.iterator()
        L4:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r5.next()
            org.simpleframework.xml.core.Creator r0 = (org.simpleframework.xml.core.Creator) r0
            org.simpleframework.xml.core.Signature r0 = r0.getSignature()
            org.simpleframework.xml.core.Contact r1 = r4.getContact()
            java.lang.Object r2 = r4.getKey()
            boolean r1 = r1.isReadOnly()
            if (r1 == 0) goto L4
            org.simpleframework.xml.core.Parameter r0 = r0.get(r2)
            if (r0 != 0) goto L4
            r5.remove()
            goto L4
        L2c:
            return
    }

    private void validateConstructors() throws java.lang.Exception {
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

    private void validateConstructors(org.simpleframework.xml.core.LabelMap r3) throws java.lang.Exception {
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
            org.simpleframework.xml.core.Detail r1 = r2.detail
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "Default constructor can not accept read only %s in %s"
            r3.<init>(r1, r0)
            throw r3
        L2b:
            return
    }

    private void validateConstructors(org.simpleframework.xml.core.LabelMap r2, java.util.List<org.simpleframework.xml.core.Creator> r3) throws java.lang.Exception {
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
            org.simpleframework.xml.core.Detail r3 = r1.detail
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r0 = "No constructor accepts all read only values in %s"
            r2.<init>(r0, r3)
            throw r2
    }

    private void validateNames(org.simpleframework.xml.core.Label r4, org.simpleframework.xml.core.Parameter r5) throws java.lang.Exception {
            r3 = this;
            java.lang.String[] r0 = r4.getNames()
            java.lang.String r1 = r5.getName()
            boolean r0 = r3.contains(r0, r1)
            if (r0 != 0) goto L35
            java.lang.String r0 = r4.getName()
            if (r1 == r0) goto L35
            java.lang.String r2 = "Annotation does not match %s for '%s' in %s"
            if (r1 == 0) goto L2b
            if (r0 == 0) goto L2b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L21
            goto L35
        L21:
            org.simpleframework.xml.core.ConstructorException r0 = new org.simpleframework.xml.core.ConstructorException
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r1, r5}
            r0.<init>(r2, r4)
            throw r0
        L2b:
            org.simpleframework.xml.core.ConstructorException r0 = new org.simpleframework.xml.core.ConstructorException
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r1, r5}
            r0.<init>(r2, r4)
            throw r0
        L35:
            return
    }

    private void validateParameter(org.simpleframework.xml.core.Label r4, org.simpleframework.xml.core.Parameter r5) throws java.lang.Exception {
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
            org.simpleframework.xml.core.ConstructorException r0 = new org.simpleframework.xml.core.ConstructorException
            java.lang.String r2 = "Type is not compatible with %s for '%s' in %s"
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r1, r5}
            r0.<init>(r2, r4)
            throw r0
    }

    public org.simpleframework.xml.core.Instantiator build() throws java.lang.Exception {
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
            org.simpleframework.xml.core.Instantiator r0 = r1.factory
            return r0
    }

    public void register(org.simpleframework.xml.core.Label r2) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r2.isAttribute()
            if (r0 == 0) goto Lc
            org.simpleframework.xml.core.LabelMap r0 = r1.attributes
            r1.register(r2, r0)
            goto L1d
        Lc:
            boolean r0 = r2.isText()
            if (r0 == 0) goto L18
            org.simpleframework.xml.core.LabelMap r0 = r1.texts
            r1.register(r2, r0)
            goto L1d
        L18:
            org.simpleframework.xml.core.LabelMap r0 = r1.elements
            r1.register(r2, r0)
        L1d:
            return
    }
}
