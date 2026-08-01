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

    static /* synthetic */ void access$000(java.lang.Class r0) {
            assertInstantiable(r0)
            return
    }

    private static void assertInstantiable(java.lang.Class<?> r4) {
            java.lang.String r0 = com.google.gson.internal.ConstructorConstructor.checkInstantiable(r4)
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UnsafeAllocator is used for non-instantiable type: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    private static com.google.gson.internal.UnsafeAllocator create() {
            java.lang.String r0 = "newInstance"
            r1 = 0
            r2 = 1
            java.lang.String r3 = "sun.misc.Unsafe"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Exception -> L29
            java.lang.String r4 = "theUnsafe"
            java.lang.reflect.Field r4 = r3.getDeclaredField(r4)     // Catch: java.lang.Exception -> L29
            r4.setAccessible(r2)     // Catch: java.lang.Exception -> L29
            java.lang.Object r5 = r4.get(r1)     // Catch: java.lang.Exception -> L29
            java.lang.String r6 = "allocateInstance"
            java.lang.Class<java.lang.Class> r7 = java.lang.Class.class
            java.lang.Class[] r7 = new java.lang.Class[]{r7}     // Catch: java.lang.Exception -> L29
            java.lang.reflect.Method r6 = r3.getMethod(r6, r7)     // Catch: java.lang.Exception -> L29
            com.google.gson.internal.UnsafeAllocator$1 r7 = new com.google.gson.internal.UnsafeAllocator$1     // Catch: java.lang.Exception -> L29
            r7.<init>(r6, r5)     // Catch: java.lang.Exception -> L29
            return r7
        L29:
            r3 = move-exception
            java.lang.Class<java.io.ObjectStreamClass> r3 = java.io.ObjectStreamClass.class
            java.lang.String r4 = "getConstructorId"
            java.lang.Class<java.lang.Class> r5 = java.lang.Class.class
            java.lang.Class[] r5 = new java.lang.Class[]{r5}     // Catch: java.lang.Exception -> L62
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.Exception -> L62
            r3.setAccessible(r2)     // Catch: java.lang.Exception -> L62
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Exception -> L62
            java.lang.Object r1 = r3.invoke(r1, r4)     // Catch: java.lang.Exception -> L62
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L62
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L62
            java.lang.Class<java.io.ObjectStreamClass> r4 = java.io.ObjectStreamClass.class
            java.lang.Class<java.lang.Class> r5 = java.lang.Class.class
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L62
            java.lang.Class[] r5 = new java.lang.Class[]{r5, r6}     // Catch: java.lang.Exception -> L62
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r0, r5)     // Catch: java.lang.Exception -> L62
            r4.setAccessible(r2)     // Catch: java.lang.Exception -> L62
            com.google.gson.internal.UnsafeAllocator$2 r5 = new com.google.gson.internal.UnsafeAllocator$2     // Catch: java.lang.Exception -> L62
            r5.<init>(r4, r1)     // Catch: java.lang.Exception -> L62
            return r5
        L62:
            r1 = move-exception
            java.lang.Class<java.io.ObjectInputStream> r1 = java.io.ObjectInputStream.class
            java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
            java.lang.Class<java.lang.Class> r4 = java.lang.Class.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r4}     // Catch: java.lang.Exception -> L7a
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r0, r3)     // Catch: java.lang.Exception -> L7a
            r0.setAccessible(r2)     // Catch: java.lang.Exception -> L7a
            com.google.gson.internal.UnsafeAllocator$3 r1 = new com.google.gson.internal.UnsafeAllocator$3     // Catch: java.lang.Exception -> L7a
            r1.<init>(r0)     // Catch: java.lang.Exception -> L7a
            return r1
        L7a:
            r0 = move-exception
            com.google.gson.internal.UnsafeAllocator$4 r0 = new com.google.gson.internal.UnsafeAllocator$4
            r0.<init>()
            return r0
    }

    public abstract <T> T newInstance(java.lang.Class<T> r1) throws java.lang.Exception;
}
