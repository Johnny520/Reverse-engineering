package net.bytebuddy.dynamic.loading;

/* JADX INFO: loaded from: classes2.dex */
public abstract class InjectionClassLoader extends java.lang.ClassLoader {
    private final java.util.concurrent.atomic.AtomicBoolean sealed;

    public enum Strategy extends java.lang.Enum<net.bytebuddy.dynamic.loading.InjectionClassLoader.Strategy> implements net.bytebuddy.dynamic.loading.ClassLoadingStrategy<net.bytebuddy.dynamic.loading.InjectionClassLoader> {
        private static final /* synthetic */ net.bytebuddy.dynamic.loading.InjectionClassLoader.Strategy[] $VALUES = null;
        public static final net.bytebuddy.dynamic.loading.InjectionClassLoader.Strategy INSTANCE = null;

        static {
                net.bytebuddy.dynamic.loading.InjectionClassLoader$Strategy r0 = new net.bytebuddy.dynamic.loading.InjectionClassLoader$Strategy
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.dynamic.loading.InjectionClassLoader.Strategy.INSTANCE = r0
                net.bytebuddy.dynamic.loading.InjectionClassLoader$Strategy[] r0 = new net.bytebuddy.dynamic.loading.InjectionClassLoader.Strategy[]{r0}
                net.bytebuddy.dynamic.loading.InjectionClassLoader.Strategy.$VALUES = r0
                return
        }

        Strategy(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.dynamic.loading.InjectionClassLoader.Strategy valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.dynamic.loading.InjectionClassLoader$Strategy> r0 = net.bytebuddy.dynamic.loading.InjectionClassLoader.Strategy.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.dynamic.loading.InjectionClassLoader$Strategy r1 = (net.bytebuddy.dynamic.loading.InjectionClassLoader.Strategy) r1
                return r1
        }

        public static net.bytebuddy.dynamic.loading.InjectionClassLoader.Strategy[] values() {
                net.bytebuddy.dynamic.loading.InjectionClassLoader$Strategy[] r0 = net.bytebuddy.dynamic.loading.InjectionClassLoader.Strategy.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.dynamic.loading.InjectionClassLoader$Strategy[] r0 = (net.bytebuddy.dynamic.loading.InjectionClassLoader.Strategy[]) r0
                return r0
        }

        @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy
        public /* bridge */ /* synthetic */ java.util.Map load(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1, java.util.Map r2) {
                r0 = this;
                net.bytebuddy.dynamic.loading.InjectionClassLoader r1 = (net.bytebuddy.dynamic.loading.InjectionClassLoader) r1
                java.util.Map r1 = r0.load(r1, r2)
                return r1
        }

        public java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> load(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.dynamic.loading.InjectionClassLoader r7, java.util.Map<net.bytebuddy.description.type.TypeDescription, byte[]> r8) {
                r6 = this;
                if (r7 == 0) goto L8a
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                java.util.Set r2 = r8.entrySet()
                java.util.Iterator r2 = r2.iterator()
            L14:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L43
                java.lang.Object r3 = r2.next()
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                java.lang.Object r4 = r3.getKey()
                net.bytebuddy.description.type.TypeDescription r4 = (net.bytebuddy.description.type.TypeDescription) r4
                java.lang.String r4 = r4.getName()
                java.lang.Object r5 = r3.getValue()
                r0.put(r4, r5)
                java.lang.Object r4 = r3.getKey()
                net.bytebuddy.description.type.TypeDescription r4 = (net.bytebuddy.description.type.TypeDescription) r4
                java.lang.String r4 = r4.getName()
                java.lang.Object r3 = r3.getKey()
                r1.put(r4, r3)
                goto L14
            L43:
                java.util.HashMap r2 = new java.util.HashMap
                r2.<init>()
                java.util.Map r7 = r7.defineClasses(r0)     // Catch: java.lang.ClassNotFoundException -> L70
                java.util.Set r7 = r7.entrySet()     // Catch: java.lang.ClassNotFoundException -> L70
                java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.ClassNotFoundException -> L70
            L54:
                boolean r0 = r7.hasNext()     // Catch: java.lang.ClassNotFoundException -> L70
                if (r0 == 0) goto L72
                java.lang.Object r0 = r7.next()     // Catch: java.lang.ClassNotFoundException -> L70
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.ClassNotFoundException -> L70
                java.lang.Object r3 = r0.getKey()     // Catch: java.lang.ClassNotFoundException -> L70
                java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.ClassNotFoundException -> L70
                java.lang.Object r0 = r0.getValue()     // Catch: java.lang.ClassNotFoundException -> L70
                r2.put(r3, r0)     // Catch: java.lang.ClassNotFoundException -> L70
                goto L54
            L70:
                r7 = move-exception
                goto L73
            L72:
                return r2
            L73:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Cannot load classes: "
                r1.append(r2)
                r1.append(r8)
                java.lang.String r8 = r1.toString()
                r0.<init>(r8, r7)
                throw r0
            L8a:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot add types to bootstrap class loader: "
                r0.append(r1)
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                r7.<init>(r8)
                throw r7
        }
    }

    static {
            doRegisterAsParallelCapable()
            return
    }

    public InjectionClassLoader(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1, boolean r2) {
            r0 = this;
            r0.<init>(r1)
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r1.<init>(r2)
            r0.sealed = r1
            return
    }

    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Must be invoked from targeting class loader type.", value = {"DP_DO_INSIDE_DO_PRIVILEGED"})
    private static void doRegisterAsParallelCapable() {
            java.lang.Class<java.lang.ClassLoader> r0 = java.lang.ClassLoader.class
            java.lang.String r1 = "registerAsParallelCapable"
            r2 = 0
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Throwable -> L10
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L10
            r0.invoke(r2, r2)     // Catch: java.lang.Throwable -> L10
        L10:
            return
    }

    public java.lang.Class<?> defineClass(java.lang.String r1, byte[] r2) throws java.lang.ClassNotFoundException {
            r0 = this;
            java.util.Map r2 = java.util.Collections.singletonMap(r1, r2)
            java.util.Map r2 = r0.defineClasses(r2)
            java.lang.Object r1 = r2.get(r1)
            java.lang.Class r1 = (java.lang.Class) r1
            return r1
    }

    public java.util.Map<java.lang.String, java.lang.Class<?>> defineClasses(java.util.Map<java.lang.String, byte[]> r2) throws java.lang.ClassNotFoundException {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.sealed
            boolean r0 = r0.get()
            if (r0 != 0) goto Ld
            java.util.Map r2 = r1.doDefineClasses(r2)
            return r2
        Ld:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot inject classes into a sealed class loader"
            r2.<init>(r0)
            throw r2
    }

    public abstract java.util.Map<java.lang.String, java.lang.Class<?>> doDefineClasses(java.util.Map<java.lang.String, byte[]> r1) throws java.lang.ClassNotFoundException;

    public boolean isSealed() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.sealed
            boolean r0 = r0.get()
            return r0
    }

    public boolean seal() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.sealed
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            r0 = r0 ^ r1
            return r0
    }
}
