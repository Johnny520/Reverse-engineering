package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
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

    private java.lang.annotation.Annotation getAnnotation(java.lang.reflect.Method r3) throws java.lang.Exception {
            r2 = this;
            java.lang.Class[] r0 = r2.getDependents(r3)
            java.lang.Class r3 = r2.getType(r3)
            if (r3 == 0) goto L11
            org.simpleframework.xml.core.AnnotationFactory r1 = r2.factory
            java.lang.annotation.Annotation r3 = r1.getInstance(r3, r0)
            return r3
        L11:
            r3 = 0
            return r3
    }

    private java.lang.Class[] getDependents(java.lang.reflect.Method r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.MethodType r0 = r2.getMethodType(r3)
            org.simpleframework.xml.core.MethodType r1 = org.simpleframework.xml.core.MethodType.SET
            if (r0 != r1) goto Le
            r0 = 0
            java.lang.Class[] r3 = org.simpleframework.xml.core.Reflector.getParameterDependents(r3, r0)
            return r3
        Le:
            org.simpleframework.xml.core.MethodType r1 = org.simpleframework.xml.core.MethodType.GET
            if (r0 != r1) goto L17
            java.lang.Class[] r3 = org.simpleframework.xml.core.Reflector.getReturnDependents(r3)
            return r3
        L17:
            org.simpleframework.xml.core.MethodType r1 = org.simpleframework.xml.core.MethodType.IS
            if (r0 != r1) goto L20
            java.lang.Class[] r3 = org.simpleframework.xml.core.Reflector.getReturnDependents(r3)
            return r3
        L20:
            r3 = 0
            return r3
    }

    private org.simpleframework.xml.core.MethodType getMethodType(java.lang.reflect.Method r2) {
            r1 = this;
            java.lang.String r2 = r2.getName()
            java.lang.String r0 = "get"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto Lf
            org.simpleframework.xml.core.MethodType r2 = org.simpleframework.xml.core.MethodType.GET
            return r2
        Lf:
            java.lang.String r0 = "is"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L1a
            org.simpleframework.xml.core.MethodType r2 = org.simpleframework.xml.core.MethodType.IS
            return r2
        L1a:
            java.lang.String r0 = "set"
            boolean r2 = r2.startsWith(r0)
            if (r2 == 0) goto L25
            org.simpleframework.xml.core.MethodType r2 = org.simpleframework.xml.core.MethodType.SET
            return r2
        L25:
            org.simpleframework.xml.core.MethodType r2 = org.simpleframework.xml.core.MethodType.NONE
            return r2
    }

    private org.simpleframework.xml.core.MethodName getName(java.lang.reflect.Method r3, java.lang.annotation.Annotation r4) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.MethodType r0 = r2.getMethodType(r3)
            org.simpleframework.xml.core.MethodType r1 = org.simpleframework.xml.core.MethodType.GET
            if (r0 != r1) goto Ld
            org.simpleframework.xml.core.MethodName r3 = r2.getRead(r3, r0)
            return r3
        Ld:
            org.simpleframework.xml.core.MethodType r1 = org.simpleframework.xml.core.MethodType.IS
            if (r0 != r1) goto L16
            org.simpleframework.xml.core.MethodName r3 = r2.getRead(r3, r0)
            return r3
        L16:
            org.simpleframework.xml.core.MethodType r1 = org.simpleframework.xml.core.MethodType.SET
            if (r0 != r1) goto L1f
            org.simpleframework.xml.core.MethodName r3 = r2.getWrite(r3, r0)
            return r3
        L1f:
            org.simpleframework.xml.core.MethodException r3 = new org.simpleframework.xml.core.MethodException
            java.lang.String r0 = "Annotation %s must mark a set or get method"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r3.<init>(r0, r4)
            throw r3
    }

    private java.lang.Class getParameterType(java.lang.reflect.Method r3) throws java.lang.Exception {
            r2 = this;
            java.lang.Class[] r0 = r3.getParameterTypes()
            int r0 = r0.length
            r1 = 1
            if (r0 != r1) goto L10
            java.lang.Class[] r3 = r3.getParameterTypes()
            r0 = 0
            r3 = r3[r0]
            return r3
        L10:
            r3 = 0
            return r3
    }

    private org.simpleframework.xml.core.MethodName getRead(java.lang.reflect.Method r3, org.simpleframework.xml.core.MethodType r4) throws java.lang.Exception {
            r2 = this;
            java.lang.Class[] r0 = r3.getParameterTypes()
            java.lang.String r1 = r3.getName()
            int r0 = r0.length
            if (r0 != 0) goto L23
            java.lang.String r0 = r2.getTypeName(r1, r4)
            if (r0 == 0) goto L17
            org.simpleframework.xml.core.MethodName r1 = new org.simpleframework.xml.core.MethodName
            r1.<init>(r3, r4, r0)
            return r1
        L17:
            org.simpleframework.xml.core.MethodException r4 = new org.simpleframework.xml.core.MethodException
            java.lang.String r0 = "Could not get name for %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r4.<init>(r0, r3)
            throw r4
        L23:
            org.simpleframework.xml.core.MethodException r4 = new org.simpleframework.xml.core.MethodException
            java.lang.String r0 = "Get method %s is not a valid property"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r4.<init>(r0, r3)
            throw r4
    }

    private java.lang.Class getReturnType(java.lang.reflect.Method r2) throws java.lang.Exception {
            r1 = this;
            java.lang.Class[] r0 = r2.getParameterTypes()
            int r0 = r0.length
            if (r0 != 0) goto Lc
            java.lang.Class r2 = r2.getReturnType()
            return r2
        Lc:
            r2 = 0
            return r2
    }

    private java.lang.String getTypeName(java.lang.String r2, org.simpleframework.xml.core.MethodType r3) {
            r1 = this;
            int r3 = r3.getPrefix()
            int r0 = r2.length()
            if (r0 <= r3) goto Le
            java.lang.String r2 = r2.substring(r3, r0)
        Le:
            java.lang.String r2 = org.simpleframework.xml.core.Reflector.getName(r2)
            return r2
    }

    private org.simpleframework.xml.core.MethodName getWrite(java.lang.reflect.Method r4, org.simpleframework.xml.core.MethodType r5) throws java.lang.Exception {
            r3 = this;
            java.lang.Class[] r0 = r4.getParameterTypes()
            java.lang.String r1 = r4.getName()
            int r0 = r0.length
            r2 = 1
            if (r0 != r2) goto L24
            java.lang.String r0 = r3.getTypeName(r1, r5)
            if (r0 == 0) goto L18
            org.simpleframework.xml.core.MethodName r1 = new org.simpleframework.xml.core.MethodName
            r1.<init>(r4, r5, r0)
            return r1
        L18:
            org.simpleframework.xml.core.MethodException r5 = new org.simpleframework.xml.core.MethodException
            java.lang.String r0 = "Could not get name for %s"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r5.<init>(r0, r4)
            throw r5
        L24:
            org.simpleframework.xml.core.MethodException r5 = new org.simpleframework.xml.core.MethodException
            java.lang.String r0 = "Set method %s is not a valid property"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r5.<init>(r0, r4)
            throw r5
    }

    public org.simpleframework.xml.core.MethodPart getInstance(java.lang.reflect.Method r3, java.lang.annotation.Annotation r4, java.lang.annotation.Annotation[] r5) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.MethodName r3 = r2.getName(r3, r4)
            org.simpleframework.xml.core.MethodType r0 = r3.getType()
            org.simpleframework.xml.core.MethodType r1 = org.simpleframework.xml.core.MethodType.SET
            if (r0 != r1) goto L12
            org.simpleframework.xml.core.SetPart r0 = new org.simpleframework.xml.core.SetPart
            r0.<init>(r3, r4, r5)
            return r0
        L12:
            org.simpleframework.xml.core.GetPart r0 = new org.simpleframework.xml.core.GetPart
            r0.<init>(r3, r4, r5)
            return r0
    }

    public org.simpleframework.xml.core.MethodPart getInstance(java.lang.reflect.Method r2, java.lang.annotation.Annotation[] r3) throws java.lang.Exception {
            r1 = this;
            java.lang.annotation.Annotation r0 = r1.getAnnotation(r2)
            if (r0 == 0) goto Lb
            org.simpleframework.xml.core.MethodPart r2 = r1.getInstance(r2, r0, r3)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public java.lang.Class getType(java.lang.reflect.Method r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.MethodType r0 = r2.getMethodType(r3)
            org.simpleframework.xml.core.MethodType r1 = org.simpleframework.xml.core.MethodType.SET
            if (r0 != r1) goto Ld
            java.lang.Class r3 = r2.getParameterType(r3)
            return r3
        Ld:
            org.simpleframework.xml.core.MethodType r1 = org.simpleframework.xml.core.MethodType.GET
            if (r0 != r1) goto L16
            java.lang.Class r3 = r2.getReturnType(r3)
            return r3
        L16:
            org.simpleframework.xml.core.MethodType r1 = org.simpleframework.xml.core.MethodType.IS
            if (r0 != r1) goto L1f
            java.lang.Class r3 = r2.getReturnType(r3)
            return r3
        L1f:
            r3 = 0
            return r3
    }
}
