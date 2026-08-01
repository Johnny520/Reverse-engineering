package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class MethodPartFactory {
    private final org.simpleframework.xml.core.AnnotationFactory factory;

    public MethodPartFactory(org.simpleframework.xml.core.Detail r2, org.simpleframework.xml.core.Support r3) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.core.AnnotationFactory r0 = new org.simpleframework.xml.core.AnnotationFactory
            r0.<init>(r2, r3)
            r1.factory = r0
            return
    }

    private java.lang.annotation.Annotation getAnnotation(java.lang.reflect.Method r2) {
            r1 = this;
            java.lang.Class[] r0 = r1.getDependents(r2)
            java.lang.Class r2 = r1.getType(r2)
            if (r2 == 0) goto L11
            org.simpleframework.xml.core.AnnotationFactory r1 = r1.factory
            java.lang.annotation.Annotation r1 = r1.getInstance(r2, r0)
            return r1
        L11:
            r1 = 0
            return r1
    }

    private java.lang.Class[] getDependents(java.lang.reflect.Method r2) {
            r1 = this;
            org.simpleframework.xml.core.MethodType r1 = r1.getMethodType(r2)
            org.simpleframework.xml.core.MethodType r0 = org.simpleframework.xml.core.MethodType.SET
            if (r1 != r0) goto Le
            r1 = 0
            java.lang.Class[] r1 = org.simpleframework.xml.core.Reflector.getParameterDependents(r2, r1)
            return r1
        Le:
            org.simpleframework.xml.core.MethodType r0 = org.simpleframework.xml.core.MethodType.GET
            if (r1 != r0) goto L17
            java.lang.Class[] r1 = org.simpleframework.xml.core.Reflector.getReturnDependents(r2)
            return r1
        L17:
            org.simpleframework.xml.core.MethodType r0 = org.simpleframework.xml.core.MethodType.IS
            if (r1 != r0) goto L20
            java.lang.Class[] r1 = org.simpleframework.xml.core.Reflector.getReturnDependents(r2)
            return r1
        L20:
            r1 = 0
            return r1
    }

    private org.simpleframework.xml.core.MethodType getMethodType(java.lang.reflect.Method r1) {
            r0 = this;
            java.lang.String r0 = r1.getName()
            java.lang.String r1 = "get"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto Lf
            org.simpleframework.xml.core.MethodType r0 = org.simpleframework.xml.core.MethodType.GET
            return r0
        Lf:
            java.lang.String r1 = "is"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L1a
            org.simpleframework.xml.core.MethodType r0 = org.simpleframework.xml.core.MethodType.IS
            return r0
        L1a:
            java.lang.String r1 = "set"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L25
            org.simpleframework.xml.core.MethodType r0 = org.simpleframework.xml.core.MethodType.SET
            return r0
        L25:
            org.simpleframework.xml.core.MethodType r0 = org.simpleframework.xml.core.MethodType.NONE
            return r0
    }

    private org.simpleframework.xml.core.MethodName getName(java.lang.reflect.Method r3, java.lang.annotation.Annotation r4) {
            r2 = this;
            org.simpleframework.xml.core.MethodType r0 = r2.getMethodType(r3)
            org.simpleframework.xml.core.MethodType r1 = org.simpleframework.xml.core.MethodType.GET
            if (r0 != r1) goto Ld
            org.simpleframework.xml.core.MethodName r2 = r2.getRead(r3, r0)
            return r2
        Ld:
            org.simpleframework.xml.core.MethodType r1 = org.simpleframework.xml.core.MethodType.IS
            if (r0 != r1) goto L16
            org.simpleframework.xml.core.MethodName r2 = r2.getRead(r3, r0)
            return r2
        L16:
            org.simpleframework.xml.core.MethodType r1 = org.simpleframework.xml.core.MethodType.SET
            if (r0 != r1) goto L1f
            org.simpleframework.xml.core.MethodName r2 = r2.getWrite(r3, r0)
            return r2
        L1f:
            org.simpleframework.xml.core.MethodException r2 = new org.simpleframework.xml.core.MethodException
            java.lang.String r3 = "Annotation %s must mark a set or get method"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r2.<init>(r3, r4)
            throw r2
    }

    private java.lang.Class getParameterType(java.lang.reflect.Method r2) {
            r1 = this;
            java.lang.Class[] r1 = r2.getParameterTypes()
            int r1 = r1.length
            r0 = 1
            if (r1 != r0) goto L10
            java.lang.Class[] r1 = r2.getParameterTypes()
            r2 = 0
            r1 = r1[r2]
            return r1
        L10:
            r1 = 0
            return r1
    }

    private org.simpleframework.xml.core.MethodName getRead(java.lang.reflect.Method r3, org.simpleframework.xml.core.MethodType r4) {
            r2 = this;
            java.lang.Class[] r0 = r3.getParameterTypes()
            java.lang.String r1 = r3.getName()
            int r0 = r0.length
            if (r0 != 0) goto L23
            java.lang.String r2 = r2.getTypeName(r1, r4)
            if (r2 == 0) goto L17
            org.simpleframework.xml.core.MethodName r0 = new org.simpleframework.xml.core.MethodName
            r0.<init>(r3, r4, r2)
            return r0
        L17:
            org.simpleframework.xml.core.MethodException r2 = new org.simpleframework.xml.core.MethodException
            java.lang.String r4 = "Could not get name for %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r2.<init>(r4, r3)
            throw r2
        L23:
            org.simpleframework.xml.core.MethodException r2 = new org.simpleframework.xml.core.MethodException
            java.lang.String r4 = "Get method %s is not a valid property"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r2.<init>(r4, r3)
            throw r2
    }

    private java.lang.Class getReturnType(java.lang.reflect.Method r1) {
            r0 = this;
            java.lang.Class[] r0 = r1.getParameterTypes()
            int r0 = r0.length
            if (r0 != 0) goto Lc
            java.lang.Class r0 = r1.getReturnType()
            return r0
        Lc:
            r0 = 0
            return r0
    }

    private java.lang.String getTypeName(java.lang.String r1, org.simpleframework.xml.core.MethodType r2) {
            r0 = this;
            int r0 = r2.getPrefix()
            int r2 = r1.length()
            if (r2 <= r0) goto Le
            java.lang.String r1 = r1.substring(r0, r2)
        Le:
            java.lang.String r0 = org.simpleframework.xml.core.Reflector.getName(r1)
            return r0
    }

    private org.simpleframework.xml.core.MethodName getWrite(java.lang.reflect.Method r4, org.simpleframework.xml.core.MethodType r5) {
            r3 = this;
            java.lang.Class[] r0 = r4.getParameterTypes()
            java.lang.String r1 = r4.getName()
            int r0 = r0.length
            r2 = 1
            if (r0 != r2) goto L24
            java.lang.String r3 = r3.getTypeName(r1, r5)
            if (r3 == 0) goto L18
            org.simpleframework.xml.core.MethodName r0 = new org.simpleframework.xml.core.MethodName
            r0.<init>(r4, r5, r3)
            return r0
        L18:
            org.simpleframework.xml.core.MethodException r3 = new org.simpleframework.xml.core.MethodException
            java.lang.String r5 = "Could not get name for %s"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r3.<init>(r5, r4)
            throw r3
        L24:
            org.simpleframework.xml.core.MethodException r3 = new org.simpleframework.xml.core.MethodException
            java.lang.String r5 = "Set method %s is not a valid property"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r3.<init>(r5, r4)
            throw r3
    }

    public org.simpleframework.xml.core.MethodPart getInstance(java.lang.reflect.Method r2, java.lang.annotation.Annotation r3, java.lang.annotation.Annotation[] r4) {
            r1 = this;
            org.simpleframework.xml.core.MethodName r1 = r1.getName(r2, r3)
            org.simpleframework.xml.core.MethodType r2 = r1.getType()
            org.simpleframework.xml.core.MethodType r0 = org.simpleframework.xml.core.MethodType.SET
            if (r2 != r0) goto L12
            org.simpleframework.xml.core.SetPart r2 = new org.simpleframework.xml.core.SetPart
            r2.<init>(r1, r3, r4)
            return r2
        L12:
            org.simpleframework.xml.core.GetPart r2 = new org.simpleframework.xml.core.GetPart
            r2.<init>(r1, r3, r4)
            return r2
    }

    public org.simpleframework.xml.core.MethodPart getInstance(java.lang.reflect.Method r2, java.lang.annotation.Annotation[] r3) {
            r1 = this;
            java.lang.annotation.Annotation r0 = r1.getAnnotation(r2)
            if (r0 == 0) goto Lb
            org.simpleframework.xml.core.MethodPart r1 = r1.getInstance(r2, r0, r3)
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public java.lang.Class getType(java.lang.reflect.Method r3) {
            r2 = this;
            org.simpleframework.xml.core.MethodType r0 = r2.getMethodType(r3)
            org.simpleframework.xml.core.MethodType r1 = org.simpleframework.xml.core.MethodType.SET
            if (r0 != r1) goto Ld
            java.lang.Class r2 = r2.getParameterType(r3)
            return r2
        Ld:
            org.simpleframework.xml.core.MethodType r1 = org.simpleframework.xml.core.MethodType.GET
            if (r0 != r1) goto L16
            java.lang.Class r2 = r2.getReturnType(r3)
            return r2
        L16:
            org.simpleframework.xml.core.MethodType r1 = org.simpleframework.xml.core.MethodType.IS
            if (r0 != r1) goto L1f
            java.lang.Class r2 = r2.getReturnType(r3)
            return r2
        L1f:
            r2 = 0
            return r2
    }
}
