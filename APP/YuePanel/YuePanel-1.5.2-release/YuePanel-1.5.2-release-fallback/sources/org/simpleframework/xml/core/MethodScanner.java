package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class MethodScanner extends org.simpleframework.xml.core.ContactList {
    private final org.simpleframework.xml.core.Detail detail;
    private final org.simpleframework.xml.core.MethodPartFactory factory;
    private final org.simpleframework.xml.core.MethodScanner.PartMap read;
    private final org.simpleframework.xml.core.Support support;
    private final org.simpleframework.xml.core.MethodScanner.PartMap write;

    /* JADX INFO: renamed from: org.simpleframework.xml.core.MethodScanner$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class PartMap extends java.util.LinkedHashMap<java.lang.String, org.simpleframework.xml.core.MethodPart> implements java.lang.Iterable<java.lang.String> {
        private PartMap() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ PartMap(org.simpleframework.xml.core.MethodScanner.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<java.lang.String> iterator() {
                r1 = this;
                java.util.Set r0 = r1.keySet()
                java.util.Iterator r0 = r0.iterator()
                return r0
        }

        public org.simpleframework.xml.core.MethodPart take(java.lang.String r1) {
                r0 = this;
                java.lang.Object r1 = r0.remove(r1)
                org.simpleframework.xml.core.MethodPart r1 = (org.simpleframework.xml.core.MethodPart) r1
                return r1
        }
    }

    public MethodScanner(org.simpleframework.xml.core.Detail r3, org.simpleframework.xml.core.Support r4) throws java.lang.Exception {
            r2 = this;
            r2.<init>()
            org.simpleframework.xml.core.MethodPartFactory r0 = new org.simpleframework.xml.core.MethodPartFactory
            r0.<init>(r3, r4)
            r2.factory = r0
            org.simpleframework.xml.core.MethodScanner$PartMap r0 = new org.simpleframework.xml.core.MethodScanner$PartMap
            r1 = 0
            r0.<init>(r1)
            r2.write = r0
            org.simpleframework.xml.core.MethodScanner$PartMap r0 = new org.simpleframework.xml.core.MethodScanner$PartMap
            r0.<init>(r1)
            r2.read = r0
            r2.support = r4
            r2.detail = r3
            r2.scan(r3)
            return
    }

    private void build() throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.core.MethodScanner$PartMap r0 = r3.read
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            org.simpleframework.xml.core.MethodScanner$PartMap r2 = r3.read
            java.lang.Object r2 = r2.get(r1)
            org.simpleframework.xml.core.MethodPart r2 = (org.simpleframework.xml.core.MethodPart) r2
            if (r2 == 0) goto L6
            r3.build(r2, r1)
            goto L6
        L20:
            return
    }

    private void build(org.simpleframework.xml.core.MethodPart r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.MethodContact r0 = new org.simpleframework.xml.core.MethodContact
            r0.<init>(r2)
            r1.add(r0)
            return
    }

    private void build(org.simpleframework.xml.core.MethodPart r2, java.lang.String r3) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.MethodScanner$PartMap r0 = r1.write
            org.simpleframework.xml.core.MethodPart r3 = r0.take(r3)
            if (r3 == 0) goto Lc
            r1.build(r2, r3)
            goto Lf
        Lc:
            r1.build(r2)
        Lf:
            return
    }

    private void build(org.simpleframework.xml.core.MethodPart r4, org.simpleframework.xml.core.MethodPart r5) throws java.lang.Exception {
            r3 = this;
            java.lang.annotation.Annotation r0 = r4.getAnnotation()
            java.lang.String r1 = r4.getName()
            java.lang.annotation.Annotation r2 = r5.getAnnotation()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L31
            java.lang.Class r0 = r4.getType()
            java.lang.Class r2 = r5.getType()
            if (r0 != r2) goto L25
            org.simpleframework.xml.core.MethodContact r0 = new org.simpleframework.xml.core.MethodContact
            r0.<init>(r4, r5)
            r3.add(r0)
            return
        L25:
            org.simpleframework.xml.core.MethodException r4 = new org.simpleframework.xml.core.MethodException
            java.lang.String r5 = "Method types do not match for %s in %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            r4.<init>(r5, r0)
            throw r4
        L31:
            org.simpleframework.xml.core.MethodException r4 = new org.simpleframework.xml.core.MethodException
            org.simpleframework.xml.core.Detail r5 = r3.detail
            java.lang.Object[] r5 = new java.lang.Object[]{r1, r5}
            java.lang.String r0 = "Annotations do not match for '%s' in %s"
            r4.<init>(r0, r5)
            throw r4
    }

    private void extend(java.lang.Class r2, org.simpleframework.xml.DefaultType r3) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Support r0 = r1.support
            org.simpleframework.xml.core.ContactList r2 = r0.getMethods(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        La:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1c
            java.lang.Object r3 = r2.next()
            org.simpleframework.xml.core.Contact r3 = (org.simpleframework.xml.core.Contact) r3
            org.simpleframework.xml.core.MethodContact r3 = (org.simpleframework.xml.core.MethodContact) r3
            r1.process(r3)
            goto La
        L1c:
            return
    }

    private void extract(org.simpleframework.xml.core.Detail r6) throws java.lang.Exception {
            r5 = this;
            java.util.List r6 = r6.getMethods()
            java.util.Iterator r6 = r6.iterator()
        L8:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r0 = r6.next()
            org.simpleframework.xml.core.MethodDetail r0 = (org.simpleframework.xml.core.MethodDetail) r0
            java.lang.annotation.Annotation[] r1 = r0.getAnnotations()
            java.lang.reflect.Method r0 = r0.getMethod()
            int r2 = r1.length
            r3 = 0
        L1e:
            if (r3 >= r2) goto L8
            r4 = r1[r3]
            r5.scan(r0, r4, r1)
            int r3 = r3 + 1
            goto L1e
        L28:
            return
    }

    private void extract(org.simpleframework.xml.core.Detail r3, org.simpleframework.xml.DefaultType r4) throws java.lang.Exception {
            r2 = this;
            java.util.List r3 = r3.getMethods()
            org.simpleframework.xml.DefaultType r0 = org.simpleframework.xml.DefaultType.PROPERTY
            if (r4 != r0) goto L2c
            java.util.Iterator r3 = r3.iterator()
        Lc:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2c
            java.lang.Object r4 = r3.next()
            org.simpleframework.xml.core.MethodDetail r4 = (org.simpleframework.xml.core.MethodDetail) r4
            java.lang.annotation.Annotation[] r0 = r4.getAnnotations()
            java.lang.reflect.Method r4 = r4.getMethod()
            org.simpleframework.xml.core.MethodPartFactory r1 = r2.factory
            java.lang.Class r1 = r1.getType(r4)
            if (r1 == 0) goto Lc
            r2.process(r4, r0)
            goto Lc
        L2c:
            return
    }

    private void insert(org.simpleframework.xml.core.MethodPart r4, org.simpleframework.xml.core.MethodScanner.PartMap r5) {
            r3 = this;
            java.lang.String r0 = r4.getName()
            java.lang.Object r1 = r5.remove(r0)
            org.simpleframework.xml.core.MethodPart r1 = (org.simpleframework.xml.core.MethodPart) r1
            if (r1 == 0) goto L13
            boolean r2 = r3.isText(r4)
            if (r2 == 0) goto L13
            r4 = r1
        L13:
            r5.put(r0, r4)
            return
    }

    private boolean isText(org.simpleframework.xml.core.MethodPart r1) {
            r0 = this;
            java.lang.annotation.Annotation r1 = r1.getAnnotation()
            boolean r1 = r1 instanceof org.simpleframework.xml.Text
            if (r1 == 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    private void process(java.lang.reflect.Method r2, java.lang.annotation.Annotation r3, java.lang.annotation.Annotation[] r4) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.MethodPartFactory r0 = r1.factory
            org.simpleframework.xml.core.MethodPart r2 = r0.getInstance(r2, r3, r4)
            org.simpleframework.xml.core.MethodType r3 = r2.getMethodType()
            org.simpleframework.xml.core.MethodType r4 = org.simpleframework.xml.core.MethodType.GET
            if (r3 != r4) goto L13
            org.simpleframework.xml.core.MethodScanner$PartMap r4 = r1.read
            r1.process(r2, r4)
        L13:
            org.simpleframework.xml.core.MethodType r4 = org.simpleframework.xml.core.MethodType.IS
            if (r3 != r4) goto L1c
            org.simpleframework.xml.core.MethodScanner$PartMap r4 = r1.read
            r1.process(r2, r4)
        L1c:
            org.simpleframework.xml.core.MethodType r4 = org.simpleframework.xml.core.MethodType.SET
            if (r3 != r4) goto L25
            org.simpleframework.xml.core.MethodScanner$PartMap r3 = r1.write
            r1.process(r2, r3)
        L25:
            return
    }

    private void process(java.lang.reflect.Method r2, java.lang.annotation.Annotation[] r3) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.MethodPartFactory r0 = r1.factory
            org.simpleframework.xml.core.MethodPart r2 = r0.getInstance(r2, r3)
            org.simpleframework.xml.core.MethodType r3 = r2.getMethodType()
            org.simpleframework.xml.core.MethodType r0 = org.simpleframework.xml.core.MethodType.GET
            if (r3 != r0) goto L13
            org.simpleframework.xml.core.MethodScanner$PartMap r0 = r1.read
            r1.process(r2, r0)
        L13:
            org.simpleframework.xml.core.MethodType r0 = org.simpleframework.xml.core.MethodType.IS
            if (r3 != r0) goto L1c
            org.simpleframework.xml.core.MethodScanner$PartMap r0 = r1.read
            r1.process(r2, r0)
        L1c:
            org.simpleframework.xml.core.MethodType r0 = org.simpleframework.xml.core.MethodType.SET
            if (r3 != r0) goto L25
            org.simpleframework.xml.core.MethodScanner$PartMap r3 = r1.write
            r1.process(r2, r3)
        L25:
            return
    }

    private void process(org.simpleframework.xml.core.MethodContact r3) {
            r2 = this;
            org.simpleframework.xml.core.MethodPart r0 = r3.getRead()
            org.simpleframework.xml.core.MethodPart r3 = r3.getWrite()
            if (r3 == 0) goto Lf
            org.simpleframework.xml.core.MethodScanner$PartMap r1 = r2.write
            r2.insert(r3, r1)
        Lf:
            org.simpleframework.xml.core.MethodScanner$PartMap r3 = r2.read
            r2.insert(r0, r3)
            return
    }

    private void process(org.simpleframework.xml.core.MethodPart r2, org.simpleframework.xml.core.MethodScanner.PartMap r3) {
            r1 = this;
            java.lang.String r0 = r2.getName()
            if (r0 == 0) goto L9
            r3.put(r0, r2)
        L9:
            return
    }

    private void remove(java.lang.reflect.Method r2, java.lang.annotation.Annotation r3, java.lang.annotation.Annotation[] r4) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.MethodPartFactory r0 = r1.factory
            org.simpleframework.xml.core.MethodPart r2 = r0.getInstance(r2, r3, r4)
            org.simpleframework.xml.core.MethodType r3 = r2.getMethodType()
            org.simpleframework.xml.core.MethodType r4 = org.simpleframework.xml.core.MethodType.GET
            if (r3 != r4) goto L13
            org.simpleframework.xml.core.MethodScanner$PartMap r4 = r1.read
            r1.remove(r2, r4)
        L13:
            org.simpleframework.xml.core.MethodType r4 = org.simpleframework.xml.core.MethodType.IS
            if (r3 != r4) goto L1c
            org.simpleframework.xml.core.MethodScanner$PartMap r4 = r1.read
            r1.remove(r2, r4)
        L1c:
            org.simpleframework.xml.core.MethodType r4 = org.simpleframework.xml.core.MethodType.SET
            if (r3 != r4) goto L25
            org.simpleframework.xml.core.MethodScanner$PartMap r3 = r1.write
            r1.remove(r2, r3)
        L25:
            return
    }

    private void remove(org.simpleframework.xml.core.MethodPart r1, org.simpleframework.xml.core.MethodScanner.PartMap r2) throws java.lang.Exception {
            r0 = this;
            java.lang.String r1 = r1.getName()
            if (r1 == 0) goto L9
            r2.remove(r1)
        L9:
            return
    }

    private void scan(java.lang.reflect.Method r2, java.lang.annotation.Annotation r3, java.lang.annotation.Annotation[] r4) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r3 instanceof org.simpleframework.xml.Attribute
            if (r0 == 0) goto L7
            r1.process(r2, r3, r4)
        L7:
            boolean r0 = r3 instanceof org.simpleframework.xml.ElementUnion
            if (r0 == 0) goto Le
            r1.process(r2, r3, r4)
        Le:
            boolean r0 = r3 instanceof org.simpleframework.xml.ElementListUnion
            if (r0 == 0) goto L15
            r1.process(r2, r3, r4)
        L15:
            boolean r0 = r3 instanceof org.simpleframework.xml.ElementMapUnion
            if (r0 == 0) goto L1c
            r1.process(r2, r3, r4)
        L1c:
            boolean r0 = r3 instanceof org.simpleframework.xml.ElementList
            if (r0 == 0) goto L23
            r1.process(r2, r3, r4)
        L23:
            boolean r0 = r3 instanceof org.simpleframework.xml.ElementArray
            if (r0 == 0) goto L2a
            r1.process(r2, r3, r4)
        L2a:
            boolean r0 = r3 instanceof org.simpleframework.xml.ElementMap
            if (r0 == 0) goto L31
            r1.process(r2, r3, r4)
        L31:
            boolean r0 = r3 instanceof org.simpleframework.xml.Element
            if (r0 == 0) goto L38
            r1.process(r2, r3, r4)
        L38:
            boolean r0 = r3 instanceof org.simpleframework.xml.Version
            if (r0 == 0) goto L3f
            r1.process(r2, r3, r4)
        L3f:
            boolean r0 = r3 instanceof org.simpleframework.xml.Text
            if (r0 == 0) goto L46
            r1.process(r2, r3, r4)
        L46:
            boolean r0 = r3 instanceof org.simpleframework.xml.Transient
            if (r0 == 0) goto L4d
            r1.remove(r2, r3, r4)
        L4d:
            return
    }

    private void scan(org.simpleframework.xml.core.Detail r4) throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.DefaultType r0 = r4.getOverride()
            org.simpleframework.xml.DefaultType r1 = r4.getAccess()
            java.lang.Class r2 = r4.getSuper()
            if (r2 == 0) goto L11
            r3.extend(r2, r0)
        L11:
            r3.extract(r4, r1)
            r3.extract(r4)
            r3.build()
            r3.validate()
            return
    }

    private void validate() throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.core.MethodScanner$PartMap r0 = r3.write
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            org.simpleframework.xml.core.MethodScanner$PartMap r2 = r3.write
            java.lang.Object r2 = r2.get(r1)
            org.simpleframework.xml.core.MethodPart r2 = (org.simpleframework.xml.core.MethodPart) r2
            if (r2 == 0) goto L6
            r3.validate(r2, r1)
            goto L6
        L20:
            return
    }

    private void validate(org.simpleframework.xml.core.MethodPart r2, java.lang.String r3) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.MethodScanner$PartMap r0 = r1.read
            org.simpleframework.xml.core.MethodPart r3 = r0.take(r3)
            java.lang.reflect.Method r2 = r2.getMethod()
            if (r3 == 0) goto Ld
            return
        Ld:
            org.simpleframework.xml.core.MethodException r3 = new org.simpleframework.xml.core.MethodException
            org.simpleframework.xml.core.Detail r0 = r1.detail
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r0}
            java.lang.String r0 = "No matching get method for %s in %s"
            r3.<init>(r0, r2)
            throw r3
    }
}
