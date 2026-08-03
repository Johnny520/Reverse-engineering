package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class AnnotationHandler implements java.lang.reflect.InvocationHandler {
    private static final java.lang.String ATTRIBUTE = "attribute";
    private static final java.lang.String CLASS = "annotationType";
    private static final java.lang.String EQUAL = "equals";
    private static final java.lang.String REQUIRED = "required";
    private static final java.lang.String STRING = "toString";
    private final boolean attribute;
    private final org.simpleframework.xml.core.Comparer comparer;
    private final boolean required;
    private final java.lang.Class type;

    public AnnotationHandler(java.lang.Class r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    public AnnotationHandler(java.lang.Class r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public AnnotationHandler(java.lang.Class r2, boolean r3, boolean r4) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.core.Comparer r0 = new org.simpleframework.xml.core.Comparer
            r0.<init>()
            r1.comparer = r0
            r1.attribute = r4
            r1.required = r3
            r1.type = r2
            return
    }

    private void attributes(java.lang.StringBuilder r6) {
            r5 = this;
            java.lang.Class r0 = r5.type
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            r1 = 0
        L7:
            int r2 = r0.length
            if (r1 >= r2) goto L30
            r2 = r0[r1]
            java.lang.String r2 = r2.getName()
            r3 = r0[r1]
            java.lang.Object r3 = r5.value(r3)
            if (r1 <= 0) goto L22
            r4 = 44
            r6.append(r4)
            r4 = 32
            r6.append(r4)
        L22:
            r6.append(r2)
            r2 = 61
            r6.append(r2)
            r6.append(r3)
            int r1 = r1 + 1
            goto L7
        L30:
            r0 = 41
            r6.append(r0)
            return
    }

    private boolean equals(java.lang.Object r3, java.lang.Object[] r4) throws java.lang.Throwable {
            r2 = this;
            java.lang.annotation.Annotation r3 = (java.lang.annotation.Annotation) r3
            r0 = 0
            r4 = r4[r0]
            java.lang.annotation.Annotation r4 = (java.lang.annotation.Annotation) r4
            java.lang.Class r0 = r3.annotationType()
            java.lang.Class r1 = r4.annotationType()
            if (r0 != r1) goto L18
            org.simpleframework.xml.core.Comparer r0 = r2.comparer
            boolean r3 = r0.equals(r3, r4)
            return r3
        L18:
            org.simpleframework.xml.core.PersistenceException r0 = new org.simpleframework.xml.core.PersistenceException
            java.lang.String r1 = "Annotation %s is not the same as %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}
            r0.<init>(r1, r3)
            throw r0
    }

    private void name(java.lang.StringBuilder r3) {
            r2 = this;
            java.lang.Class r0 = r2.type
            java.lang.String r0 = r0.getName()
            r1 = 64
            r3.append(r1)
            r3.append(r0)
            r0 = 40
            r3.append(r0)
            return
    }

    private java.lang.Object value(java.lang.reflect.Method r3) {
            r2 = this;
            java.lang.String r0 = r3.getName()
            java.lang.String r1 = "required"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L13
            boolean r3 = r2.required
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        L13:
            java.lang.String r1 = "attribute"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L22
            boolean r3 = r2.attribute
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        L22:
            java.lang.Object r3 = r3.getDefaultValue()
            return r3
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object r3, java.lang.reflect.Method r4, java.lang.Object[] r5) throws java.lang.Throwable {
            r2 = this;
            java.lang.String r0 = r4.getName()
            java.lang.String r1 = "toString"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L11
            java.lang.String r3 = r2.toString()
            return r3
        L11:
            java.lang.String r1 = "equals"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L22
            boolean r3 = r2.equals(r3, r5)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        L22:
            java.lang.String r3 = "annotationType"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L2d
            java.lang.Class r3 = r2.type
            return r3
        L2d:
            java.lang.String r3 = "required"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L3c
            boolean r3 = r2.required
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        L3c:
            java.lang.String r3 = "attribute"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L4b
            boolean r3 = r2.attribute
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        L4b:
            java.lang.Object r3 = r4.getDefaultValue()
            return r3
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.type
            if (r1 == 0) goto Lf
            r2.name(r0)
            r2.attributes(r0)
        Lf:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
