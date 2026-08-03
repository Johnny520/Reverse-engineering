package com.google.gson.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class UnsafeAllocator {
    public static final com.google.gson.internal.UnsafeAllocator INSTANCE = null;





    static {
            com.google.gson.internal.UnsafeAllocator r0 = create()
            com.google.gson.internal.UnsafeAllocator.INSTANCE = r0
            return
    }

    public UnsafeAllocator() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void access$000(java.lang.Class r0) {
            assertInstantiable(r0)
            return
    }

    private static void assertInstantiable(java.lang.Class<?> r3) {
            java.lang.String r3 = com.google.gson.internal.ConstructorConstructor.checkInstantiable(r3)
            if (r3 != 0) goto L7
            return
        L7:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "UnsafeAllocator is used for non-instantiable type: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private static com.google.gson.internal.UnsafeAllocator create() {
            java.lang.String r0 = "newInstance"
            java.lang.Class<java.io.ObjectStreamClass> r1 = java.io.ObjectStreamClass.class
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            r3 = 0
            r4 = 1
            java.lang.String r5 = "sun.misc.Unsafe"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Exception -> L2b
            java.lang.String r6 = "theUnsafe"
            java.lang.reflect.Field r6 = r5.getDeclaredField(r6)     // Catch: java.lang.Exception -> L2b
            r6.setAccessible(r4)     // Catch: java.lang.Exception -> L2b
            java.lang.Object r6 = r6.get(r3)     // Catch: java.lang.Exception -> L2b
            java.lang.String r7 = "allocateInstance"
            java.lang.Class[] r8 = new java.lang.Class[]{r2}     // Catch: java.lang.Exception -> L2b
            java.lang.reflect.Method r5 = r5.getMethod(r7, r8)     // Catch: java.lang.Exception -> L2b
            com.google.gson.internal.UnsafeAllocator$1 r7 = new com.google.gson.internal.UnsafeAllocator$1     // Catch: java.lang.Exception -> L2b
            r7.<init>(r5, r6)     // Catch: java.lang.Exception -> L2b
            return r7
        L2b:
            java.lang.String r5 = "getConstructorId"
            java.lang.Class[] r6 = new java.lang.Class[]{r2}     // Catch: java.lang.Exception -> L5b
            java.lang.reflect.Method r5 = r1.getDeclaredMethod(r5, r6)     // Catch: java.lang.Exception -> L5b
            r5.setAccessible(r4)     // Catch: java.lang.Exception -> L5b
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Exception -> L5b
            java.lang.Object r3 = r5.invoke(r3, r6)     // Catch: java.lang.Exception -> L5b
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Exception -> L5b
            int r3 = r3.intValue()     // Catch: java.lang.Exception -> L5b
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L5b
            java.lang.Class[] r5 = new java.lang.Class[]{r2, r5}     // Catch: java.lang.Exception -> L5b
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r0, r5)     // Catch: java.lang.Exception -> L5b
            r1.setAccessible(r4)     // Catch: java.lang.Exception -> L5b
            com.google.gson.internal.UnsafeAllocator$2 r5 = new com.google.gson.internal.UnsafeAllocator$2     // Catch: java.lang.Exception -> L5b
            r5.<init>(r1, r3)     // Catch: java.lang.Exception -> L5b
            return r5
        L5b:
            java.lang.Class<java.io.ObjectInputStream> r1 = java.io.ObjectInputStream.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2, r2}     // Catch: java.lang.Exception -> L6e
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r0, r2)     // Catch: java.lang.Exception -> L6e
            r0.setAccessible(r4)     // Catch: java.lang.Exception -> L6e
            com.google.gson.internal.UnsafeAllocator$3 r1 = new com.google.gson.internal.UnsafeAllocator$3     // Catch: java.lang.Exception -> L6e
            r1.<init>(r0)     // Catch: java.lang.Exception -> L6e
            return r1
        L6e:
            com.google.gson.internal.UnsafeAllocator$4 r0 = new com.google.gson.internal.UnsafeAllocator$4
            r0.<init>()
            return r0
    }

    public abstract <T> T newInstance(java.lang.Class<T> r1) throws java.lang.Exception;
}
