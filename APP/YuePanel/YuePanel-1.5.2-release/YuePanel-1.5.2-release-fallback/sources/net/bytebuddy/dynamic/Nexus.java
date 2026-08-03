package net.bytebuddy.dynamic;

/* JADX INFO: loaded from: classes2.dex */
public class Nexus extends java.lang.ref.WeakReference<java.lang.ClassLoader> {

    @net.bytebuddy.utility.nullability.AlwaysNull
    private static final java.lang.ref.ReferenceQueue<java.lang.ClassLoader> NO_QUEUE = null;
    public static final java.lang.String PROPERTY = "net.bytebuddy.nexus.disabled";
    private static final java.util.concurrent.ConcurrentMap<net.bytebuddy.dynamic.Nexus, java.lang.Object> TYPE_INITIALIZERS = null;
    private final int classLoaderHashCode;
    private final int identification;
    private final java.lang.String name;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            net.bytebuddy.dynamic.Nexus.TYPE_INITIALIZERS = r0
            return
    }

    private Nexus(java.lang.Class<?> r3, int r4) {
            r2 = this;
            java.lang.String r0 = r3.getName()
            java.lang.String r0 = nonAnonymous(r0)
            java.lang.ClassLoader r3 = r3.getClassLoader()
            java.lang.ref.ReferenceQueue<java.lang.ClassLoader> r1 = net.bytebuddy.dynamic.Nexus.NO_QUEUE
            r2.<init>(r0, r3, r1, r4)
            return
    }

    private Nexus(java.lang.String r1, @net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.ref.ReferenceQueue<? super java.lang.ClassLoader> r3, int r4) {
            r0 = this;
            if (r2 != 0) goto L3
            r3 = 0
        L3:
            r0.<init>(r2, r3)
            r0.name = r1
            int r1 = java.lang.System.identityHashCode(r2)
            r0.classLoaderHashCode = r1
            r0.identification = r4
            return
    }

    public static void clean(java.lang.ref.Reference<? super java.lang.ClassLoader> r1) {
            java.util.concurrent.ConcurrentMap<net.bytebuddy.dynamic.Nexus, java.lang.Object> r0 = net.bytebuddy.dynamic.Nexus.TYPE_INITIALIZERS
            r0.remove(r1)
            return
    }

    public static void initialize(java.lang.Class<?> r3, int r4) throws java.lang.Exception {
            java.util.concurrent.ConcurrentMap<net.bytebuddy.dynamic.Nexus, java.lang.Object> r0 = net.bytebuddy.dynamic.Nexus.TYPE_INITIALIZERS
            net.bytebuddy.dynamic.Nexus r1 = new net.bytebuddy.dynamic.Nexus
            r1.<init>(r3, r4)
            java.lang.Object r4 = r0.remove(r1)
            if (r4 == 0) goto L2f
            java.lang.Class r0 = r4.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.String r1 = "net.bytebuddy.implementation.LoadedTypeInitializer"
            r2 = 1
            java.lang.Class r0 = java.lang.Class.forName(r1, r2, r0)
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            java.lang.Class[] r1 = new java.lang.Class[]{r1}
            java.lang.String r2 = "onLoad"
            java.lang.reflect.Method r0 = r0.getMethod(r2, r1)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r0.invoke(r4, r3)
        L2f:
            return
    }

    private static java.lang.String nonAnonymous(java.lang.String r2) {
            r0 = 47
            int r0 = r2.indexOf(r0)
            r1 = -1
            if (r0 != r1) goto La
            goto Lf
        La:
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)
        Lf:
            return r2
    }

    public static void register(java.lang.String r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r3, @net.bytebuddy.utility.nullability.MaybeNull java.lang.ref.ReferenceQueue<? super java.lang.ClassLoader> r4, int r5, java.lang.Object r6) {
            java.util.concurrent.ConcurrentMap<net.bytebuddy.dynamic.Nexus, java.lang.Object> r0 = net.bytebuddy.dynamic.Nexus.TYPE_INITIALIZERS
            net.bytebuddy.dynamic.Nexus r1 = new net.bytebuddy.dynamic.Nexus
            r1.<init>(r2, r3, r4, r5)
            r0.put(r1, r6)
            return
    }

    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L37
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L37
        L12:
            net.bytebuddy.dynamic.Nexus r5 = (net.bytebuddy.dynamic.Nexus) r5
            int r2 = r4.classLoaderHashCode
            int r3 = r5.classLoaderHashCode
            if (r2 != r3) goto L35
            int r2 = r4.identification
            int r3 = r5.identification
            if (r2 != r3) goto L35
            java.lang.String r2 = r4.name
            java.lang.String r3 = r5.name
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L35
            java.lang.Object r2 = r4.get()
            java.lang.Object r5 = r5.get()
            if (r2 != r5) goto L35
            goto L36
        L35:
            r0 = r1
        L36:
            return r0
        L37:
            return r1
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.name
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r2.classLoaderHashCode
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.identification
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Nexus{name='"
            r0.append(r1)
            java.lang.String r1 = r2.name
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r1 = ", classLoaderHashCode="
            r0.append(r1)
            int r1 = r2.classLoaderHashCode
            r0.append(r1)
            java.lang.String r1 = ", identification="
            r0.append(r1)
            int r1 = r2.identification
            r0.append(r1)
            java.lang.String r1 = ", classLoader="
            r0.append(r1)
            java.lang.Object r1 = r2.get()
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
