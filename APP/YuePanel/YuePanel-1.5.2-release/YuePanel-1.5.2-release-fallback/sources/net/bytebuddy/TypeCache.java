package net.bytebuddy;

/* JADX INFO: loaded from: classes2.dex */
public class TypeCache<T> extends java.lang.ref.ReferenceQueue<java.lang.ClassLoader> {

    @net.bytebuddy.utility.nullability.AlwaysNull
    private static final java.lang.Class<?> NOT_FOUND = null;
    protected final java.util.concurrent.ConcurrentMap<net.bytebuddy.TypeCache.StorageKey, java.util.concurrent.ConcurrentMap<T, java.lang.Object>> cache;
    protected final net.bytebuddy.TypeCache.Sort sort;

    /* JADX INFO: renamed from: net.bytebuddy.TypeCache$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class LookupKey {

        @net.bytebuddy.utility.nullability.MaybeNull
        private final java.lang.ClassLoader classLoader;
        private final int hashCode;

        public LookupKey(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1) {
                r0 = this;
                r0.<init>()
                r0.classLoader = r1
                int r1 = java.lang.System.identityHashCode(r1)
                r0.hashCode = r1
                return
        }

        public static /* synthetic */ int access$200(net.bytebuddy.TypeCache.LookupKey r0) {
                int r0 = r0.hashCode
                return r0
        }

        public static /* synthetic */ java.lang.ClassLoader access$300(net.bytebuddy.TypeCache.LookupKey r0) {
                java.lang.ClassLoader r0 = r0.classLoader
                return r0
        }

        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Cross-comparison is intended.", value = {"EQ_CHECK_FOR_OPERAND_NOT_COMPATIBLE_WITH_THIS"})
        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof net.bytebuddy.TypeCache.LookupKey
                r2 = 0
                if (r1 == 0) goto L14
                java.lang.ClassLoader r1 = r4.classLoader
                net.bytebuddy.TypeCache$LookupKey r5 = (net.bytebuddy.TypeCache.LookupKey) r5
                java.lang.ClassLoader r5 = r5.classLoader
                if (r1 != r5) goto L12
                goto L13
            L12:
                r0 = r2
            L13:
                return r0
            L14:
                boolean r1 = r5 instanceof net.bytebuddy.TypeCache.StorageKey
                if (r1 == 0) goto L2d
                net.bytebuddy.TypeCache$StorageKey r5 = (net.bytebuddy.TypeCache.StorageKey) r5
                int r1 = r4.hashCode
                int r3 = net.bytebuddy.TypeCache.StorageKey.access$100(r5)
                if (r1 != r3) goto L2b
                java.lang.ClassLoader r1 = r4.classLoader
                java.lang.Object r5 = r5.get()
                if (r1 != r5) goto L2b
                goto L2c
            L2b:
                r0 = r2
            L2c:
                return r0
            L2d:
                return r2
        }

        public int hashCode() {
                r1 = this;
                int r0 = r1.hashCode
                return r0
        }
    }

    public static class SimpleKey {
        private transient /* synthetic */ int hashCode;
        private final java.util.Set<java.lang.String> types;

        public SimpleKey(java.lang.Class<?> r2, java.util.Collection<? extends java.lang.Class<?>> r3) {
                r1 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r3)
                java.util.List r2 = net.bytebuddy.utility.CompoundList.of(r2, r0)
                r1.<init>(r2)
                return
        }

        public SimpleKey(java.lang.Class<?> r1, java.lang.Class<?>... r2) {
                r0 = this;
                java.util.List r2 = java.util.Arrays.asList(r2)
                r0.<init>(r1, r2)
                return
        }

        public SimpleKey(java.util.Collection<? extends java.lang.Class<?>> r3) {
                r2 = this;
                r2.<init>()
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r2.types = r0
                java.util.Iterator r3 = r3.iterator()
            Le:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L24
                java.lang.Object r0 = r3.next()
                java.lang.Class r0 = (java.lang.Class) r0
                java.util.Set<java.lang.String> r1 = r2.types
                java.lang.String r0 = r0.getName()
                r1.add(r0)
                goto Le
            L24:
                return
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r3) {
                r2 = this;
                if (r2 != r3) goto L4
                r3 = 1
                return r3
            L4:
                if (r3 == 0) goto L1c
                java.lang.Class r0 = r2.getClass()
                java.lang.Class r1 = r3.getClass()
                if (r0 == r1) goto L11
                goto L1c
            L11:
                net.bytebuddy.TypeCache$SimpleKey r3 = (net.bytebuddy.TypeCache.SimpleKey) r3
                java.util.Set<java.lang.String> r0 = r2.types
                java.util.Set<java.lang.String> r3 = r3.types
                boolean r3 = r0.equals(r3)
                return r3
            L1c:
                r3 = 0
                return r3
        }

        @net.bytebuddy.build.CachedReturnPlugin.Enhance("hashCode")
        public int hashCode() {
                r1 = this;
                int r0 = r1.hashCode
                if (r0 == 0) goto L6
                r0 = 0
                goto Lc
            L6:
                java.util.Set<java.lang.String> r0 = r1.types
                int r0 = r0.hashCode()
            Lc:
                if (r0 != 0) goto L11
                int r0 = r1.hashCode
                goto L13
            L11:
                r1.hashCode = r0
            L13:
                return r0
        }
    }

    public enum Sort extends java.lang.Enum<net.bytebuddy.TypeCache.Sort> {
        private static final /* synthetic */ net.bytebuddy.TypeCache.Sort[] $VALUES = null;
        public static final net.bytebuddy.TypeCache.Sort SOFT = null;
        public static final net.bytebuddy.TypeCache.Sort STRONG = null;
        public static final net.bytebuddy.TypeCache.Sort WEAK = null;




        static {
                net.bytebuddy.TypeCache$Sort$1 r0 = new net.bytebuddy.TypeCache$Sort$1
                java.lang.String r1 = "WEAK"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.TypeCache.Sort.WEAK = r0
                net.bytebuddy.TypeCache$Sort$2 r1 = new net.bytebuddy.TypeCache$Sort$2
                java.lang.String r3 = "SOFT"
                r4 = 1
                r1.<init>(r3, r4)
                net.bytebuddy.TypeCache.Sort.SOFT = r1
                net.bytebuddy.TypeCache$Sort$3 r3 = new net.bytebuddy.TypeCache$Sort$3
                java.lang.String r5 = "STRONG"
                r6 = 2
                r3.<init>(r5, r6)
                net.bytebuddy.TypeCache.Sort.STRONG = r3
                r5 = 3
                net.bytebuddy.TypeCache$Sort[] r5 = new net.bytebuddy.TypeCache.Sort[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                net.bytebuddy.TypeCache.Sort.$VALUES = r5
                return
        }

        Sort(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ Sort(java.lang.String r1, int r2, net.bytebuddy.TypeCache.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.TypeCache.Sort valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.TypeCache$Sort> r0 = net.bytebuddy.TypeCache.Sort.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.TypeCache$Sort r1 = (net.bytebuddy.TypeCache.Sort) r1
                return r1
        }

        public static net.bytebuddy.TypeCache.Sort[] values() {
                net.bytebuddy.TypeCache$Sort[] r0 = net.bytebuddy.TypeCache.Sort.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.TypeCache$Sort[] r0 = (net.bytebuddy.TypeCache.Sort[]) r0
                return r0
        }

        public abstract java.lang.Object wrap(java.lang.Class<?> r1);
    }

    public static class StorageKey extends java.lang.ref.WeakReference<java.lang.ClassLoader> {
        private final int hashCode;

        public StorageKey(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1, java.lang.ref.ReferenceQueue<? super java.lang.ClassLoader> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                int r1 = java.lang.System.identityHashCode(r1)
                r0.hashCode = r1
                return
        }

        public static /* synthetic */ int access$100(net.bytebuddy.TypeCache.StorageKey r0) {
                int r0 = r0.hashCode
                return r0
        }

        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Cross-comparison is intended.", value = {"EQ_CHECK_FOR_OPERAND_NOT_COMPATIBLE_WITH_THIS"})
        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof net.bytebuddy.TypeCache.LookupKey
                r2 = 0
                if (r1 == 0) goto L20
                net.bytebuddy.TypeCache$LookupKey r5 = (net.bytebuddy.TypeCache.LookupKey) r5
                int r1 = r4.hashCode
                int r3 = net.bytebuddy.TypeCache.LookupKey.access$200(r5)
                if (r1 != r3) goto L1e
                java.lang.Object r1 = r4.get()
                java.lang.ClassLoader r5 = net.bytebuddy.TypeCache.LookupKey.access$300(r5)
                if (r1 != r5) goto L1e
                goto L1f
            L1e:
                r0 = r2
            L1f:
                return r0
            L20:
                boolean r1 = r5 instanceof net.bytebuddy.TypeCache.StorageKey
                if (r1 == 0) goto L39
                net.bytebuddy.TypeCache$StorageKey r5 = (net.bytebuddy.TypeCache.StorageKey) r5
                int r1 = r4.hashCode
                int r3 = r5.hashCode
                if (r1 != r3) goto L37
                java.lang.Object r1 = r4.get()
                java.lang.Object r5 = r5.get()
                if (r1 != r5) goto L37
                goto L38
            L37:
                r0 = r2
            L38:
                return r0
            L39:
                return r2
        }

        public int hashCode() {
                r1 = this;
                int r0 = r1.hashCode
                return r0
        }
    }

    public static class WithInlineExpunction<S> extends net.bytebuddy.TypeCache<S> {
        public WithInlineExpunction() {
                r1 = this;
                net.bytebuddy.TypeCache$Sort r0 = net.bytebuddy.TypeCache.Sort.STRONG
                r1.<init>(r0)
                return
        }

        public WithInlineExpunction(net.bytebuddy.TypeCache.Sort r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // net.bytebuddy.TypeCache
        public java.lang.Class<?> find(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1, S r2) {
                r0 = this;
                java.lang.Class r1 = super.find(r1, r2)     // Catch: java.lang.Throwable -> L8
                r0.expungeStaleEntries()
                return r1
            L8:
                r1 = move-exception
                r0.expungeStaleEntries()
                throw r1
        }

        @Override // net.bytebuddy.TypeCache
        public java.lang.Class<?> findOrInsert(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1, S r2, java.util.concurrent.Callable<java.lang.Class<?>> r3) {
                r0 = this;
                java.lang.Class r1 = super.findOrInsert(r1, r2, r3)     // Catch: java.lang.Throwable -> L8
                r0.expungeStaleEntries()
                return r1
            L8:
                r1 = move-exception
                r0.expungeStaleEntries()
                throw r1
        }

        @Override // net.bytebuddy.TypeCache
        public java.lang.Class<?> findOrInsert(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1, S r2, java.util.concurrent.Callable<java.lang.Class<?>> r3, java.lang.Object r4) {
                r0 = this;
                java.lang.Class r1 = super.findOrInsert(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L8
                r0.expungeStaleEntries()
                return r1
            L8:
                r1 = move-exception
                r0.expungeStaleEntries()
                throw r1
        }

        @Override // net.bytebuddy.TypeCache
        public java.lang.Class<?> insert(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1, S r2, java.lang.Class<?> r3) {
                r0 = this;
                java.lang.Class r1 = super.insert(r1, r2, r3)     // Catch: java.lang.Throwable -> L8
                r0.expungeStaleEntries()
                return r1
            L8:
                r1 = move-exception
                r0.expungeStaleEntries()
                throw r1
        }
    }

    static {
            return
    }

    public TypeCache() {
            r1 = this;
            net.bytebuddy.TypeCache$Sort r0 = net.bytebuddy.TypeCache.Sort.STRONG
            r1.<init>(r0)
            return
    }

    public TypeCache(net.bytebuddy.TypeCache.Sort r1) {
            r0 = this;
            r0.<init>()
            r0.sort = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.cache = r1
            return
    }

    public void clear() {
            r1 = this;
            java.util.concurrent.ConcurrentMap<net.bytebuddy.TypeCache$StorageKey, java.util.concurrent.ConcurrentMap<T, java.lang.Object>> r0 = r1.cache
            r0.clear()
            return
    }

    public void expungeStaleEntries() {
            r2 = this;
        L0:
            java.lang.ref.Reference r0 = r2.poll()
            if (r0 == 0) goto Lc
            java.util.concurrent.ConcurrentMap<net.bytebuddy.TypeCache$StorageKey, java.util.concurrent.ConcurrentMap<T, java.lang.Object>> r1 = r2.cache
            r1.remove(r0)
            goto L0
        Lc:
            return
    }

    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Cross-comparison is intended.", value = {"GC_UNRELATED_TYPES"})
    @net.bytebuddy.utility.nullability.MaybeNull
    public java.lang.Class<?> find(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r3, T r4) {
            r2 = this;
            java.util.concurrent.ConcurrentMap<net.bytebuddy.TypeCache$StorageKey, java.util.concurrent.ConcurrentMap<T, java.lang.Object>> r0 = r2.cache
            net.bytebuddy.TypeCache$LookupKey r1 = new net.bytebuddy.TypeCache$LookupKey
            r1.<init>(r3)
            java.lang.Object r3 = r0.get(r1)
            java.util.concurrent.ConcurrentMap r3 = (java.util.concurrent.ConcurrentMap) r3
            if (r3 != 0) goto L12
            java.lang.Class<?> r3 = net.bytebuddy.TypeCache.NOT_FOUND
            return r3
        L12:
            java.lang.Object r3 = r3.get(r4)
            if (r3 != 0) goto L1b
            java.lang.Class<?> r3 = net.bytebuddy.TypeCache.NOT_FOUND
            return r3
        L1b:
            boolean r4 = r3 instanceof java.lang.ref.Reference
            if (r4 == 0) goto L28
            java.lang.ref.Reference r3 = (java.lang.ref.Reference) r3
            java.lang.Object r3 = r3.get()
            java.lang.Class r3 = (java.lang.Class) r3
            return r3
        L28:
            java.lang.Class r3 = (java.lang.Class) r3
            return r3
    }

    public java.lang.Class<?> findOrInsert(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r2, T r3, java.util.concurrent.Callable<java.lang.Class<?>> r4) {
            r1 = this;
            java.lang.Class r0 = r1.find(r2, r3)
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.Object r4 = r4.call()     // Catch: java.lang.Throwable -> L12
            java.lang.Class r4 = (java.lang.Class) r4     // Catch: java.lang.Throwable -> L12
            java.lang.Class r2 = r1.insert(r2, r3, r4)     // Catch: java.lang.Throwable -> L12
            return r2
        L12:
            r2 = move-exception
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Could not create type"
            r3.<init>(r4, r2)
            throw r3
    }

    public java.lang.Class<?> findOrInsert(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r2, T r3, java.util.concurrent.Callable<java.lang.Class<?>> r4, java.lang.Object r5) {
            r1 = this;
            java.lang.Class r0 = r1.find(r2, r3)
            if (r0 == 0) goto L7
            return r0
        L7:
            monitor-enter(r5)
            java.lang.Class r2 = r1.findOrInsert(r2, r3, r4)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Le
            return r2
        Le:
            r2 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Le
            throw r2
    }

    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Cross-comparison is intended.", value = {"GC_UNRELATED_TYPES"})
    public java.lang.Class<?> insert(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r4, T r5, java.lang.Class<?> r6) {
            r3 = this;
            java.util.concurrent.ConcurrentMap<net.bytebuddy.TypeCache$StorageKey, java.util.concurrent.ConcurrentMap<T, java.lang.Object>> r0 = r3.cache
            net.bytebuddy.TypeCache$LookupKey r1 = new net.bytebuddy.TypeCache$LookupKey
            r1.<init>(r4)
            java.lang.Object r0 = r0.get(r1)
            java.util.concurrent.ConcurrentMap r0 = (java.util.concurrent.ConcurrentMap) r0
            if (r0 != 0) goto L24
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.concurrent.ConcurrentMap<net.bytebuddy.TypeCache$StorageKey, java.util.concurrent.ConcurrentMap<T, java.lang.Object>> r1 = r3.cache
            net.bytebuddy.TypeCache$StorageKey r2 = new net.bytebuddy.TypeCache$StorageKey
            r2.<init>(r4, r3)
            java.lang.Object r4 = r1.putIfAbsent(r2, r0)
            java.util.concurrent.ConcurrentMap r4 = (java.util.concurrent.ConcurrentMap) r4
            if (r4 == 0) goto L24
            r0 = r4
        L24:
            net.bytebuddy.TypeCache$Sort r4 = r3.sort
            java.lang.Object r4 = r4.wrap(r6)
            java.lang.Object r1 = r0.putIfAbsent(r5, r4)
        L2e:
            if (r1 == 0) goto L58
            boolean r2 = r1 instanceof java.lang.ref.Reference
            if (r2 == 0) goto L3c
            r2 = r1
            java.lang.ref.Reference r2 = (java.lang.ref.Reference) r2
            java.lang.Object r2 = r2.get()
            goto L3d
        L3c:
            r2 = r1
        L3d:
            java.lang.Class r2 = (java.lang.Class) r2
            if (r2 == 0) goto L42
            return r2
        L42:
            boolean r1 = r0.remove(r5, r1)
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r0.putIfAbsent(r5, r4)
            goto L2e
        L4d:
            java.lang.Object r1 = r0.get(r5)
            if (r1 != 0) goto L2e
            java.lang.Object r1 = r0.putIfAbsent(r5, r4)
            goto L2e
        L58:
            return r6
    }
}
