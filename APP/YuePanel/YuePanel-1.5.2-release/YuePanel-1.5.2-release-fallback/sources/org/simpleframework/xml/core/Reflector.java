package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
final class Reflector {
    public Reflector() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.Class getArrayClass(java.lang.reflect.Type r1) {
            java.lang.reflect.GenericArrayType r1 = (java.lang.reflect.GenericArrayType) r1
            java.lang.reflect.Type r1 = r1.getGenericComponentType()
            java.lang.Class r1 = getClass(r1)
            if (r1 == 0) goto L16
            r0 = 0
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r0)
            java.lang.Class r1 = r1.getClass()
            return r1
        L16:
            r1 = 0
            return r1
    }

    private static java.lang.Class getClass(java.lang.reflect.ParameterizedType r1) {
            java.lang.reflect.Type[] r1 = r1.getActualTypeArguments()
            int r0 = r1.length
            if (r0 <= 0) goto Lf
            r0 = 0
            r1 = r1[r0]
            java.lang.Class r1 = getClass(r1)
            return r1
        Lf:
            r1 = 0
            return r1
    }

    private static java.lang.Class getClass(java.lang.reflect.Type r1) {
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto L7
            java.lang.Class r1 = (java.lang.Class) r1
            return r1
        L7:
            java.lang.Class r1 = getGenericClass(r1)
            return r1
    }

    private static java.lang.Class[] getClasses(java.lang.reflect.ParameterizedType r3) {
            java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
            int r0 = r3.length
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
        L8:
            int r2 = r3.length
            if (r1 >= r2) goto L16
            r2 = r3[r1]
            java.lang.Class r2 = getClass(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L8
        L16:
            return r0
    }

    public static java.lang.Class getDependent(java.lang.reflect.Field r0) {
            java.lang.reflect.ParameterizedType r0 = getType(r0)
            if (r0 == 0) goto Lb
            java.lang.Class r0 = getClass(r0)
            return r0
        Lb:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            return r0
    }

    public static java.lang.Class[] getDependents(java.lang.reflect.Field r0) {
            java.lang.reflect.ParameterizedType r0 = getType(r0)
            if (r0 == 0) goto Lb
            java.lang.Class[] r0 = getClasses(r0)
            return r0
        Lb:
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]
            return r0
    }

    private static java.lang.Class getGenericClass(java.lang.reflect.Type r1) {
            boolean r0 = r1 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L9
            java.lang.Class r1 = getArrayClass(r1)
            return r1
        L9:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            return r1
    }

    public static java.lang.String getName(java.lang.String r3) {
            int r0 = r3.length()
            if (r0 <= 0) goto L1f
            char[] r3 = r3.toCharArray()
            r0 = 0
            char r1 = r3[r0]
            boolean r2 = isAcronym(r3)
            if (r2 != 0) goto L19
            char r1 = toLowerCase(r1)
            r3[r0] = r1
        L19:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            return r0
        L1f:
            return r3
    }

    public static java.lang.Class getParameterDependent(java.lang.reflect.Constructor r0, int r1) {
            java.lang.reflect.ParameterizedType r0 = getParameterType(r0, r1)
            if (r0 == 0) goto Lb
            java.lang.Class r0 = getClass(r0)
            return r0
        Lb:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            return r0
    }

    public static java.lang.Class getParameterDependent(java.lang.reflect.Method r0, int r1) {
            java.lang.reflect.ParameterizedType r0 = getParameterType(r0, r1)
            if (r0 == 0) goto Lb
            java.lang.Class r0 = getClass(r0)
            return r0
        Lb:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            return r0
    }

    public static java.lang.Class[] getParameterDependents(java.lang.reflect.Constructor r0, int r1) {
            java.lang.reflect.ParameterizedType r0 = getParameterType(r0, r1)
            if (r0 == 0) goto Lb
            java.lang.Class[] r0 = getClasses(r0)
            return r0
        Lb:
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]
            return r0
    }

    public static java.lang.Class[] getParameterDependents(java.lang.reflect.Method r0, int r1) {
            java.lang.reflect.ParameterizedType r0 = getParameterType(r0, r1)
            if (r0 == 0) goto Lb
            java.lang.Class[] r0 = getClasses(r0)
            return r0
        Lb:
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]
            return r0
    }

    private static java.lang.reflect.ParameterizedType getParameterType(java.lang.reflect.Constructor r1, int r2) {
            java.lang.reflect.Type[] r1 = r1.getGenericParameterTypes()
            int r0 = r1.length
            if (r0 <= r2) goto L10
            r1 = r1[r2]
            boolean r2 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L10
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            return r1
        L10:
            r1 = 0
            return r1
    }

    private static java.lang.reflect.ParameterizedType getParameterType(java.lang.reflect.Method r1, int r2) {
            java.lang.reflect.Type[] r1 = r1.getGenericParameterTypes()
            int r0 = r1.length
            if (r0 <= r2) goto L10
            r1 = r1[r2]
            boolean r2 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L10
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            return r1
        L10:
            r1 = 0
            return r1
    }

    public static java.lang.Class getReturnDependent(java.lang.reflect.Method r0) {
            java.lang.reflect.ParameterizedType r0 = getReturnType(r0)
            if (r0 == 0) goto Lb
            java.lang.Class r0 = getClass(r0)
            return r0
        Lb:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            return r0
    }

    public static java.lang.Class[] getReturnDependents(java.lang.reflect.Method r0) {
            java.lang.reflect.ParameterizedType r0 = getReturnType(r0)
            if (r0 == 0) goto Lb
            java.lang.Class[] r0 = getClasses(r0)
            return r0
        Lb:
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]
            return r0
    }

    private static java.lang.reflect.ParameterizedType getReturnType(java.lang.reflect.Method r1) {
            java.lang.reflect.Type r1 = r1.getGenericReturnType()
            boolean r0 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto Lb
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    private static java.lang.reflect.ParameterizedType getType(java.lang.reflect.Field r1) {
            java.lang.reflect.Type r1 = r1.getGenericType()
            boolean r0 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto Lb
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    private static boolean isAcronym(char[] r3) {
            int r0 = r3.length
            r1 = 2
            r2 = 0
            if (r0 >= r1) goto L6
            return r2
        L6:
            char r0 = r3[r2]
            boolean r0 = isUpperCase(r0)
            if (r0 != 0) goto Lf
            return r2
        Lf:
            r0 = 1
            char r3 = r3[r0]
            boolean r3 = isUpperCase(r3)
            return r3
    }

    private static boolean isUpperCase(char r0) {
            boolean r0 = java.lang.Character.isUpperCase(r0)
            return r0
    }

    private static char toLowerCase(char r0) {
            char r0 = java.lang.Character.toLowerCase(r0)
            return r0
    }
}
