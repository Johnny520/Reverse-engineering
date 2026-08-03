package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class FieldScanner extends org.simpleframework.xml.core.ContactList {
    private final org.simpleframework.xml.core.ContactMap done;
    private final org.simpleframework.xml.core.AnnotationFactory factory;
    private final org.simpleframework.xml.core.Support support;

    public static class FieldKey {
        private final java.lang.String name;
        private final java.lang.Class type;

        public FieldKey(java.lang.reflect.Field r2) {
                r1 = this;
                r1.<init>()
                java.lang.Class r0 = r2.getDeclaringClass()
                r1.type = r0
                java.lang.String r2 = r2.getName()
                r1.name = r2
                return
        }

        private boolean equals(org.simpleframework.xml.core.FieldScanner.FieldKey r3) {
                r2 = this;
                java.lang.Class r0 = r3.type
                java.lang.Class r1 = r2.type
                if (r0 == r1) goto L8
                r3 = 0
                return r3
            L8:
                java.lang.String r3 = r3.name
                java.lang.String r0 = r2.name
                boolean r3 = r3.equals(r0)
                return r3
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof org.simpleframework.xml.core.FieldScanner.FieldKey
                if (r0 == 0) goto Lb
                org.simpleframework.xml.core.FieldScanner$FieldKey r2 = (org.simpleframework.xml.core.FieldScanner.FieldKey) r2
                boolean r2 = r1.equals(r2)
                return r2
            Lb:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r1 = this;
                java.lang.String r0 = r1.name
                int r0 = r0.hashCode()
                return r0
        }
    }

    public FieldScanner(org.simpleframework.xml.core.Detail r2, org.simpleframework.xml.core.Support r3) throws java.lang.Exception {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.core.AnnotationFactory r0 = new org.simpleframework.xml.core.AnnotationFactory
            r0.<init>(r2, r3)
            r1.factory = r0
            org.simpleframework.xml.core.ContactMap r0 = new org.simpleframework.xml.core.ContactMap
            r0.<init>()
            r1.done = r0
            r1.support = r3
            r1.scan(r2)
            return
    }

    private void build() {
            r2 = this;
            org.simpleframework.xml.core.ContactMap r0 = r2.done
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            org.simpleframework.xml.core.Contact r1 = (org.simpleframework.xml.core.Contact) r1
            r2.add(r1)
            goto L6
        L16:
            return
    }

    private void extend(java.lang.Class r2, org.simpleframework.xml.DefaultType r3) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Support r0 = r1.support
            org.simpleframework.xml.core.ContactList r2 = r0.getFields(r2, r3)
            if (r2 == 0) goto Lb
            r1.addAll(r2)
        Lb:
            return
    }

    private void extract(org.simpleframework.xml.core.Detail r6) {
            r5 = this;
            java.util.List r6 = r6.getFields()
            java.util.Iterator r6 = r6.iterator()
        L8:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r0 = r6.next()
            org.simpleframework.xml.core.FieldDetail r0 = (org.simpleframework.xml.core.FieldDetail) r0
            java.lang.annotation.Annotation[] r1 = r0.getAnnotations()
            java.lang.reflect.Field r0 = r0.getField()
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

    private void extract(org.simpleframework.xml.core.Detail r4, org.simpleframework.xml.DefaultType r5) throws java.lang.Exception {
            r3 = this;
            java.util.List r4 = r4.getFields()
            org.simpleframework.xml.DefaultType r0 = org.simpleframework.xml.DefaultType.FIELD
            if (r5 != r0) goto L34
            java.util.Iterator r4 = r4.iterator()
        Lc:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L34
            java.lang.Object r5 = r4.next()
            org.simpleframework.xml.core.FieldDetail r5 = (org.simpleframework.xml.core.FieldDetail) r5
            java.lang.annotation.Annotation[] r0 = r5.getAnnotations()
            java.lang.reflect.Field r5 = r5.getField()
            java.lang.Class r1 = r5.getType()
            boolean r2 = r3.isStatic(r5)
            if (r2 != 0) goto Lc
            boolean r2 = r3.isTransient(r5)
            if (r2 != 0) goto Lc
            r3.process(r5, r1, r0)
            goto Lc
        L34:
            return
    }

    private void insert(java.lang.Object r3, org.simpleframework.xml.core.Contact r4) {
            r2 = this;
            org.simpleframework.xml.core.ContactMap r0 = r2.done
            java.lang.Object r0 = r0.remove(r3)
            org.simpleframework.xml.core.Contact r0 = (org.simpleframework.xml.core.Contact) r0
            if (r0 == 0) goto L11
            boolean r1 = r2.isText(r4)
            if (r1 == 0) goto L11
            r4 = r0
        L11:
            org.simpleframework.xml.core.ContactMap r0 = r2.done
            r0.put(r3, r4)
            return
    }

    private boolean isStatic(java.lang.reflect.Field r1) {
            r0 = this;
            int r1 = r1.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 == 0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    private boolean isText(org.simpleframework.xml.core.Contact r1) {
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

    private boolean isTransient(java.lang.reflect.Field r1) {
            r0 = this;
            int r1 = r1.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isTransient(r1)
            if (r1 == 0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    private void process(java.lang.reflect.Field r3, java.lang.Class r4, java.lang.annotation.Annotation[] r5) throws java.lang.Exception {
            r2 = this;
            java.lang.Class[] r0 = org.simpleframework.xml.core.Reflector.getDependents(r3)
            org.simpleframework.xml.core.AnnotationFactory r1 = r2.factory
            java.lang.annotation.Annotation r4 = r1.getInstance(r4, r0)
            if (r4 == 0) goto Lf
            r2.process(r3, r4, r5)
        Lf:
            return
    }

    private void process(java.lang.reflect.Field r2, java.lang.annotation.Annotation r3, java.lang.annotation.Annotation[] r4) {
            r1 = this;
            org.simpleframework.xml.core.FieldContact r0 = new org.simpleframework.xml.core.FieldContact
            r0.<init>(r2, r3, r4)
            org.simpleframework.xml.core.FieldScanner$FieldKey r3 = new org.simpleframework.xml.core.FieldScanner$FieldKey
            r3.<init>(r2)
            boolean r4 = r2.isAccessible()
            if (r4 != 0) goto L14
            r4 = 1
            r2.setAccessible(r4)
        L14:
            r1.insert(r3, r0)
            return
    }

    private void remove(java.lang.reflect.Field r2, java.lang.annotation.Annotation r3) {
            r1 = this;
            org.simpleframework.xml.core.ContactMap r3 = r1.done
            org.simpleframework.xml.core.FieldScanner$FieldKey r0 = new org.simpleframework.xml.core.FieldScanner$FieldKey
            r0.<init>(r2)
            r3.remove(r0)
            return
    }

    private void scan(java.lang.reflect.Field r2, java.lang.annotation.Annotation r3, java.lang.annotation.Annotation[] r4) {
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
            boolean r4 = r3 instanceof org.simpleframework.xml.Transient
            if (r4 == 0) goto L4d
            r1.remove(r2, r3)
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
            return
    }
}
