package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ConstructorSupplier implements java.util.function.Supplier {
    final java.lang.reflect.Constructor constructor;
    final java.lang.Class objectClass;
    final int parameterCount;
    final boolean useClassNewInstance;

    public ConstructorSupplier(java.lang.reflect.Constructor r4) {
            r3 = this;
            r3.<init>()
            r0 = 1
            r4.setAccessible(r0)
            r3.constructor = r4
            java.lang.Class r1 = r4.getDeclaringClass()
            r3.objectClass = r1
            int r2 = r4.getParameterCount()
            r3.parameterCount = r2
            if (r2 != 0) goto L2c
            int r4 = r4.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isPublic(r4)
            if (r4 == 0) goto L2c
            int r4 = r1.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isPublic(r4)
            if (r4 == 0) goto L2c
            goto L2d
        L2c:
            r0 = 0
        L2d:
            r3.useClassNewInstance = r0
            return
    }

    @Override // java.util.function.Supplier
    public java.lang.Object get() {
            r3 = this;
            boolean r0 = r3.useClassNewInstance     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Ld
            java.lang.Class r0 = r3.objectClass     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.Throwable -> Lb
            return r0
        Lb:
            r0 = move-exception
            goto L21
        Ld:
            int r0 = r3.parameterCount     // Catch: java.lang.Throwable -> Lb
            java.lang.reflect.Constructor r1 = r3.constructor
            r2 = 1
            if (r0 != r2) goto L1b
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.Throwable -> Lb
            return r0
        L1b:
            r0 = 0
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.Throwable -> Lb
            return r0
        L21:
            java.lang.String r1 = "create instance error"
            ah.a.x(r1, r0)
            r0 = 0
            return r0
    }
}
