package net.bytebuddy.pool;

/* JADX INFO: loaded from: classes2.dex */
public interface TypePool {

    /* JADX INFO: renamed from: net.bytebuddy.pool.TypePool$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static abstract class AbstractBase implements net.bytebuddy.pool.TypePool {
        private static final java.lang.String ARRAY_SYMBOL = "[";
        protected static final java.util.Map<java.lang.String, java.lang.String> PRIMITIVE_DESCRIPTORS = null;
        protected static final java.util.Map<java.lang.String, net.bytebuddy.description.type.TypeDescription> PRIMITIVE_TYPES = null;
        protected final net.bytebuddy.pool.TypePool.CacheProvider cacheProvider;

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ArrayTypeResolution implements net.bytebuddy.pool.TypePool.Resolution {
            private final int arity;
            private final net.bytebuddy.pool.TypePool.Resolution resolution;

            public ArrayTypeResolution(net.bytebuddy.pool.TypePool.Resolution r1, int r2) {
                    r0 = this;
                    r0.<init>()
                    r0.resolution = r1
                    r0.arity = r2
                    return
            }

            public static net.bytebuddy.pool.TypePool.Resolution of(net.bytebuddy.pool.TypePool.Resolution r1, int r2) {
                    if (r2 != 0) goto L3
                    goto L9
                L3:
                    net.bytebuddy.pool.TypePool$AbstractBase$ArrayTypeResolution r0 = new net.bytebuddy.pool.TypePool$AbstractBase$ArrayTypeResolution
                    r0.<init>(r1, r2)
                    r1 = r0
                L9:
                    return r1
            }

            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                    r4 = this;
                    r0 = 1
                    if (r4 != r5) goto L4
                    return r0
                L4:
                    r1 = 0
                    if (r5 != 0) goto L8
                    return r1
                L8:
                    java.lang.Class r2 = r4.getClass()
                    java.lang.Class r3 = r5.getClass()
                    if (r2 == r3) goto L13
                    return r1
                L13:
                    int r2 = r4.arity
                    net.bytebuddy.pool.TypePool$AbstractBase$ArrayTypeResolution r5 = (net.bytebuddy.pool.TypePool.AbstractBase.ArrayTypeResolution) r5
                    int r3 = r5.arity
                    if (r2 == r3) goto L1c
                    return r1
                L1c:
                    net.bytebuddy.pool.TypePool$Resolution r2 = r4.resolution
                    net.bytebuddy.pool.TypePool$Resolution r5 = r5.resolution
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L27
                    return r1
                L27:
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.pool.TypePool$Resolution r1 = r2.resolution
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    int r1 = r2.arity
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.pool.TypePool.Resolution
            public boolean isResolved() {
                    r1 = this;
                    net.bytebuddy.pool.TypePool$Resolution r0 = r1.resolution
                    boolean r0 = r0.isResolved()
                    return r0
            }

            @Override // net.bytebuddy.pool.TypePool.Resolution
            public net.bytebuddy.description.type.TypeDescription resolve() {
                    r2 = this;
                    net.bytebuddy.pool.TypePool$Resolution r0 = r2.resolution
                    net.bytebuddy.description.type.TypeDescription r0 = r0.resolve()
                    int r1 = r2.arity
                    net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ArrayProjection.of(r0, r1)
                    return r0
            }
        }

        public interface ComponentTypeReference {

            @net.bytebuddy.utility.nullability.MaybeNull
            public static final java.lang.String NO_ARRAY = null;

            static {
                    return
            }

            @net.bytebuddy.utility.nullability.MaybeNull
            java.lang.String resolve();
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static abstract class Hierarchical extends net.bytebuddy.pool.TypePool.AbstractBase {
            private final net.bytebuddy.pool.TypePool parent;

            public Hierarchical(net.bytebuddy.pool.TypePool.CacheProvider r1, net.bytebuddy.pool.TypePool r2) {
                    r0 = this;
                    r0.<init>(r1)
                    r0.parent = r2
                    return
            }

            @Override // net.bytebuddy.pool.TypePool.AbstractBase, net.bytebuddy.pool.TypePool
            public void clear() {
                    r1 = this;
                    net.bytebuddy.pool.TypePool r0 = r1.parent     // Catch: java.lang.Throwable -> L9
                    r0.clear()     // Catch: java.lang.Throwable -> L9
                    super.clear()
                    return
                L9:
                    r0 = move-exception
                    super.clear()
                    throw r0
            }

            @Override // net.bytebuddy.pool.TypePool.AbstractBase, net.bytebuddy.pool.TypePool
            public net.bytebuddy.pool.TypePool.Resolution describe(java.lang.String r3) {
                    r2 = this;
                    net.bytebuddy.pool.TypePool r0 = r2.parent
                    net.bytebuddy.pool.TypePool$Resolution r0 = r0.describe(r3)
                    boolean r1 = r0.isResolved()
                    if (r1 == 0) goto Ld
                    goto L11
                Ld:
                    net.bytebuddy.pool.TypePool$Resolution r0 = super.describe(r3)
                L11:
                    return r0
            }

            @Override // net.bytebuddy.pool.TypePool.AbstractBase
            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                    r4 = this;
                    boolean r0 = super.equals(r5)
                    r1 = 0
                    if (r0 != 0) goto L8
                    return r1
                L8:
                    r0 = 1
                    if (r4 != r5) goto Lc
                    return r0
                Lc:
                    if (r5 != 0) goto Lf
                    return r1
                Lf:
                    java.lang.Class r2 = r4.getClass()
                    java.lang.Class r3 = r5.getClass()
                    if (r2 == r3) goto L1a
                    return r1
                L1a:
                    net.bytebuddy.pool.TypePool r2 = r4.parent
                    net.bytebuddy.pool.TypePool$AbstractBase$Hierarchical r5 = (net.bytebuddy.pool.TypePool.AbstractBase.Hierarchical) r5
                    net.bytebuddy.pool.TypePool r5 = r5.parent
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L27
                    return r1
                L27:
                    return r0
            }

            @Override // net.bytebuddy.pool.TypePool.AbstractBase
            public int hashCode() {
                    r2 = this;
                    int r0 = super.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.pool.TypePool r1 = r2.parent
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }
        }

        static {
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                java.lang.Class r2 = java.lang.Boolean.TYPE
                java.lang.Class r3 = java.lang.Byte.TYPE
                java.lang.Class r4 = java.lang.Short.TYPE
                java.lang.Class r5 = java.lang.Character.TYPE
                java.lang.Class r6 = java.lang.Integer.TYPE
                java.lang.Class r7 = java.lang.Long.TYPE
                java.lang.Class r8 = java.lang.Float.TYPE
                java.lang.Class r9 = java.lang.Double.TYPE
                java.lang.Class r10 = java.lang.Void.TYPE
                java.lang.Class[] r2 = new java.lang.Class[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}
                r3 = 0
            L21:
                r4 = 9
                if (r3 >= r4) goto L40
                r4 = r2[r3]
                java.lang.String r5 = r4.getName()
                net.bytebuddy.description.type.TypeDescription r6 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r4)
                r0.put(r5, r6)
                java.lang.String r5 = net.bytebuddy.jar.asm.Type.getDescriptor(r4)
                java.lang.String r4 = r4.getName()
                r1.put(r5, r4)
                int r3 = r3 + 1
                goto L21
            L40:
                java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
                net.bytebuddy.pool.TypePool.AbstractBase.PRIMITIVE_TYPES = r0
                java.util.Map r0 = java.util.Collections.unmodifiableMap(r1)
                net.bytebuddy.pool.TypePool.AbstractBase.PRIMITIVE_DESCRIPTORS = r0
                return
        }

        public AbstractBase(net.bytebuddy.pool.TypePool.CacheProvider r1) {
                r0 = this;
                r0.<init>()
                r0.cacheProvider = r1
                return
        }

        @Override // net.bytebuddy.pool.TypePool
        public void clear() {
                r1 = this;
                net.bytebuddy.pool.TypePool$CacheProvider r0 = r1.cacheProvider
                r0.clear()
                return
        }

        @Override // net.bytebuddy.pool.TypePool
        public net.bytebuddy.pool.TypePool.Resolution describe(java.lang.String r4) {
                r3 = this;
                java.lang.String r0 = "/"
                boolean r0 = r4.contains(r0)
                if (r0 != 0) goto L56
                r0 = 0
            L9:
                java.lang.String r1 = "["
                boolean r1 = r4.startsWith(r1)
                r2 = 1
                if (r1 == 0) goto L19
                int r0 = r0 + 1
                java.lang.String r4 = r4.substring(r2)
                goto L9
            L19:
                if (r0 <= 0) goto L30
                java.util.Map<java.lang.String, java.lang.String> r1 = net.bytebuddy.pool.TypePool.AbstractBase.PRIMITIVE_DESCRIPTORS
                java.lang.Object r1 = r1.get(r4)
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto L2f
                int r1 = r4.length()
                int r1 = r1 - r2
                java.lang.String r4 = r4.substring(r2, r1)
                goto L30
            L2f:
                r4 = r1
            L30:
                java.util.Map<java.lang.String, net.bytebuddy.description.type.TypeDescription> r1 = net.bytebuddy.pool.TypePool.AbstractBase.PRIMITIVE_TYPES
                java.lang.Object r1 = r1.get(r4)
                net.bytebuddy.description.type.TypeDescription r1 = (net.bytebuddy.description.type.TypeDescription) r1
                if (r1 != 0) goto L41
                net.bytebuddy.pool.TypePool$CacheProvider r1 = r3.cacheProvider
                net.bytebuddy.pool.TypePool$Resolution r1 = r1.find(r4)
                goto L47
            L41:
                net.bytebuddy.pool.TypePool$Resolution$Simple r2 = new net.bytebuddy.pool.TypePool$Resolution$Simple
                r2.<init>(r1)
                r1 = r2
            L47:
                if (r1 != 0) goto L51
                net.bytebuddy.pool.TypePool$Resolution r1 = r3.doDescribe(r4)
                net.bytebuddy.pool.TypePool$Resolution r1 = r3.doCache(r4, r1)
            L51:
                net.bytebuddy.pool.TypePool$Resolution r4 = net.bytebuddy.pool.TypePool.AbstractBase.ArrayTypeResolution.of(r1, r0)
                return r4
            L56:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r4)
                java.lang.String r4 = " contains the illegal character '/'"
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        public net.bytebuddy.pool.TypePool.Resolution doCache(java.lang.String r2, net.bytebuddy.pool.TypePool.Resolution r3) {
                r1 = this;
                net.bytebuddy.pool.TypePool$CacheProvider r0 = r1.cacheProvider
                net.bytebuddy.pool.TypePool$Resolution r2 = r0.register(r2, r3)
                return r2
        }

        public abstract net.bytebuddy.pool.TypePool.Resolution doDescribe(java.lang.String r1);

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 != 0) goto L8
                return r1
            L8:
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L13
                return r1
            L13:
                net.bytebuddy.pool.TypePool$CacheProvider r2 = r4.cacheProvider
                net.bytebuddy.pool.TypePool$AbstractBase r5 = (net.bytebuddy.pool.TypePool.AbstractBase) r5
                net.bytebuddy.pool.TypePool$CacheProvider r5 = r5.cacheProvider
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L20
                return r1
            L20:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.pool.TypePool$CacheProvider r1 = r2.cacheProvider
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    public interface CacheProvider {

        @net.bytebuddy.utility.nullability.MaybeNull
        public static final net.bytebuddy.pool.TypePool.Resolution UNRESOLVED = null;

        public static class Discriminating implements net.bytebuddy.pool.TypePool.CacheProvider {
            private final net.bytebuddy.pool.TypePool.CacheProvider matched;
            private final net.bytebuddy.matcher.ElementMatcher<java.lang.String> matcher;
            private final net.bytebuddy.pool.TypePool.CacheProvider unmatched;

            public Discriminating(net.bytebuddy.matcher.ElementMatcher<java.lang.String> r1, net.bytebuddy.pool.TypePool.CacheProvider r2, net.bytebuddy.pool.TypePool.CacheProvider r3) {
                    r0 = this;
                    r0.<init>()
                    r0.matcher = r1
                    r0.matched = r2
                    r0.unmatched = r3
                    return
            }

            @Override // net.bytebuddy.pool.TypePool.CacheProvider
            public void clear() {
                    r2 = this;
                    net.bytebuddy.pool.TypePool$CacheProvider r0 = r2.unmatched     // Catch: java.lang.Throwable -> Lb
                    r0.clear()     // Catch: java.lang.Throwable -> Lb
                    net.bytebuddy.pool.TypePool$CacheProvider r0 = r2.matched
                    r0.clear()
                    return
                Lb:
                    r0 = move-exception
                    net.bytebuddy.pool.TypePool$CacheProvider r1 = r2.matched
                    r1.clear()
                    throw r0
            }

            @Override // net.bytebuddy.pool.TypePool.CacheProvider
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.pool.TypePool.Resolution find(java.lang.String r2) {
                    r1 = this;
                    net.bytebuddy.matcher.ElementMatcher<java.lang.String> r0 = r1.matcher
                    boolean r0 = r0.matches(r2)
                    if (r0 == 0) goto Lb
                    net.bytebuddy.pool.TypePool$CacheProvider r0 = r1.matched
                    goto Ld
                Lb:
                    net.bytebuddy.pool.TypePool$CacheProvider r0 = r1.unmatched
                Ld:
                    net.bytebuddy.pool.TypePool$Resolution r2 = r0.find(r2)
                    return r2
            }

            @Override // net.bytebuddy.pool.TypePool.CacheProvider
            public net.bytebuddy.pool.TypePool.Resolution register(java.lang.String r2, net.bytebuddy.pool.TypePool.Resolution r3) {
                    r1 = this;
                    net.bytebuddy.matcher.ElementMatcher<java.lang.String> r0 = r1.matcher
                    boolean r0 = r0.matches(r2)
                    if (r0 == 0) goto Lb
                    net.bytebuddy.pool.TypePool$CacheProvider r0 = r1.matched
                    goto Ld
                Lb:
                    net.bytebuddy.pool.TypePool$CacheProvider r0 = r1.unmatched
                Ld:
                    net.bytebuddy.pool.TypePool$Resolution r2 = r0.register(r2, r3)
                    return r2
            }
        }

        public enum NoOp extends java.lang.Enum<net.bytebuddy.pool.TypePool.CacheProvider.NoOp> implements net.bytebuddy.pool.TypePool.CacheProvider {
            private static final /* synthetic */ net.bytebuddy.pool.TypePool.CacheProvider.NoOp[] $VALUES = null;
            public static final net.bytebuddy.pool.TypePool.CacheProvider.NoOp INSTANCE = null;

            static {
                    net.bytebuddy.pool.TypePool$CacheProvider$NoOp r0 = new net.bytebuddy.pool.TypePool$CacheProvider$NoOp
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.pool.TypePool.CacheProvider.NoOp.INSTANCE = r0
                    net.bytebuddy.pool.TypePool$CacheProvider$NoOp[] r0 = new net.bytebuddy.pool.TypePool.CacheProvider.NoOp[]{r0}
                    net.bytebuddy.pool.TypePool.CacheProvider.NoOp.$VALUES = r0
                    return
            }

            NoOp(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.pool.TypePool.CacheProvider.NoOp valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.pool.TypePool$CacheProvider$NoOp> r0 = net.bytebuddy.pool.TypePool.CacheProvider.NoOp.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.pool.TypePool$CacheProvider$NoOp r1 = (net.bytebuddy.pool.TypePool.CacheProvider.NoOp) r1
                    return r1
            }

            public static net.bytebuddy.pool.TypePool.CacheProvider.NoOp[] values() {
                    net.bytebuddy.pool.TypePool$CacheProvider$NoOp[] r0 = net.bytebuddy.pool.TypePool.CacheProvider.NoOp.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.pool.TypePool$CacheProvider$NoOp[] r0 = (net.bytebuddy.pool.TypePool.CacheProvider.NoOp[]) r0
                    return r0
            }

            @Override // net.bytebuddy.pool.TypePool.CacheProvider
            public void clear() {
                    r0 = this;
                    return
            }

            @Override // net.bytebuddy.pool.TypePool.CacheProvider
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.pool.TypePool.Resolution find(java.lang.String r1) {
                    r0 = this;
                    net.bytebuddy.pool.TypePool$Resolution r1 = net.bytebuddy.pool.TypePool.CacheProvider.UNRESOLVED
                    return r1
            }

            @Override // net.bytebuddy.pool.TypePool.CacheProvider
            public net.bytebuddy.pool.TypePool.Resolution register(java.lang.String r1, net.bytebuddy.pool.TypePool.Resolution r2) {
                    r0 = this;
                    return r2
            }
        }

        public static class Simple implements net.bytebuddy.pool.TypePool.CacheProvider {
            private final java.util.concurrent.ConcurrentMap<java.lang.String, net.bytebuddy.pool.TypePool.Resolution> storage;

            public static class UsingSoftReference implements net.bytebuddy.pool.TypePool.CacheProvider {
                private final java.util.concurrent.atomic.AtomicReference<java.lang.ref.SoftReference<net.bytebuddy.pool.TypePool.CacheProvider.Simple>> delegate;

                public UsingSoftReference() {
                        r3 = this;
                        r3.<init>()
                        java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                        java.lang.ref.SoftReference r1 = new java.lang.ref.SoftReference
                        net.bytebuddy.pool.TypePool$CacheProvider$Simple r2 = new net.bytebuddy.pool.TypePool$CacheProvider$Simple
                        r2.<init>()
                        r1.<init>(r2)
                        r0.<init>(r1)
                        r3.delegate = r0
                        return
                }

                @Override // net.bytebuddy.pool.TypePool.CacheProvider
                public void clear() {
                        r1 = this;
                        java.util.concurrent.atomic.AtomicReference<java.lang.ref.SoftReference<net.bytebuddy.pool.TypePool$CacheProvider$Simple>> r0 = r1.delegate
                        java.lang.Object r0 = r0.get()
                        java.lang.ref.SoftReference r0 = (java.lang.ref.SoftReference) r0
                        java.lang.Object r0 = r0.get()
                        net.bytebuddy.pool.TypePool$CacheProvider r0 = (net.bytebuddy.pool.TypePool.CacheProvider) r0
                        if (r0 == 0) goto L13
                        r0.clear()
                    L13:
                        return
                }

                @Override // net.bytebuddy.pool.TypePool.CacheProvider
                @net.bytebuddy.utility.nullability.MaybeNull
                public net.bytebuddy.pool.TypePool.Resolution find(java.lang.String r2) {
                        r1 = this;
                        java.util.concurrent.atomic.AtomicReference<java.lang.ref.SoftReference<net.bytebuddy.pool.TypePool$CacheProvider$Simple>> r0 = r1.delegate
                        java.lang.Object r0 = r0.get()
                        java.lang.ref.SoftReference r0 = (java.lang.ref.SoftReference) r0
                        java.lang.Object r0 = r0.get()
                        net.bytebuddy.pool.TypePool$CacheProvider r0 = (net.bytebuddy.pool.TypePool.CacheProvider) r0
                        if (r0 != 0) goto L13
                        net.bytebuddy.pool.TypePool$Resolution r2 = net.bytebuddy.pool.TypePool.CacheProvider.UNRESOLVED
                        goto L17
                    L13:
                        net.bytebuddy.pool.TypePool$Resolution r2 = r0.find(r2)
                    L17:
                        return r2
                }

                @Override // net.bytebuddy.pool.TypePool.CacheProvider
                public net.bytebuddy.pool.TypePool.Resolution register(java.lang.String r5, net.bytebuddy.pool.TypePool.Resolution r6) {
                        r4 = this;
                        java.util.concurrent.atomic.AtomicReference<java.lang.ref.SoftReference<net.bytebuddy.pool.TypePool$CacheProvider$Simple>> r0 = r4.delegate
                        java.lang.Object r0 = r0.get()
                        java.lang.ref.SoftReference r0 = (java.lang.ref.SoftReference) r0
                        java.lang.Object r1 = r0.get()
                        net.bytebuddy.pool.TypePool$CacheProvider$Simple r1 = (net.bytebuddy.pool.TypePool.CacheProvider.Simple) r1
                        if (r1 != 0) goto L33
                        net.bytebuddy.pool.TypePool$CacheProvider$Simple r1 = new net.bytebuddy.pool.TypePool$CacheProvider$Simple
                        r1.<init>()
                    L15:
                        java.util.concurrent.atomic.AtomicReference<java.lang.ref.SoftReference<net.bytebuddy.pool.TypePool$CacheProvider$Simple>> r2 = r4.delegate
                        java.lang.ref.SoftReference r3 = new java.lang.ref.SoftReference
                        r3.<init>(r1)
                        boolean r0 = Yue.C3587.m14520(r2, r0, r3)
                        if (r0 != 0) goto L33
                        java.util.concurrent.atomic.AtomicReference<java.lang.ref.SoftReference<net.bytebuddy.pool.TypePool$CacheProvider$Simple>> r0 = r4.delegate
                        java.lang.Object r0 = r0.get()
                        java.lang.ref.SoftReference r0 = (java.lang.ref.SoftReference) r0
                        java.lang.Object r2 = r0.get()
                        net.bytebuddy.pool.TypePool$CacheProvider$Simple r2 = (net.bytebuddy.pool.TypePool.CacheProvider.Simple) r2
                        if (r2 == 0) goto L15
                        r1 = r2
                    L33:
                        net.bytebuddy.pool.TypePool$Resolution r5 = r1.register(r5, r6)
                        return r5
                }
            }

            public Simple() {
                    r1 = this;
                    java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
                    r0.<init>()
                    r1.<init>(r0)
                    return
            }

            public Simple(java.util.concurrent.ConcurrentMap<java.lang.String, net.bytebuddy.pool.TypePool.Resolution> r1) {
                    r0 = this;
                    r0.<init>()
                    r0.storage = r1
                    return
            }

            public static net.bytebuddy.pool.TypePool.CacheProvider withObjectType() {
                    net.bytebuddy.pool.TypePool$CacheProvider$Simple r0 = new net.bytebuddy.pool.TypePool$CacheProvider$Simple
                    r0.<init>()
                    java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                    java.lang.String r2 = r1.getName()
                    net.bytebuddy.pool.TypePool$Resolution$Simple r3 = new net.bytebuddy.pool.TypePool$Resolution$Simple
                    net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                    r3.<init>(r1)
                    r0.register(r2, r3)
                    return r0
            }

            @Override // net.bytebuddy.pool.TypePool.CacheProvider
            public void clear() {
                    r1 = this;
                    java.util.concurrent.ConcurrentMap<java.lang.String, net.bytebuddy.pool.TypePool$Resolution> r0 = r1.storage
                    r0.clear()
                    return
            }

            @Override // net.bytebuddy.pool.TypePool.CacheProvider
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.pool.TypePool.Resolution find(java.lang.String r2) {
                    r1 = this;
                    java.util.concurrent.ConcurrentMap<java.lang.String, net.bytebuddy.pool.TypePool$Resolution> r0 = r1.storage
                    java.lang.Object r2 = r0.get(r2)
                    net.bytebuddy.pool.TypePool$Resolution r2 = (net.bytebuddy.pool.TypePool.Resolution) r2
                    return r2
            }

            public java.util.concurrent.ConcurrentMap<java.lang.String, net.bytebuddy.pool.TypePool.Resolution> getStorage() {
                    r1 = this;
                    java.util.concurrent.ConcurrentMap<java.lang.String, net.bytebuddy.pool.TypePool$Resolution> r0 = r1.storage
                    return r0
            }

            @Override // net.bytebuddy.pool.TypePool.CacheProvider
            public net.bytebuddy.pool.TypePool.Resolution register(java.lang.String r2, net.bytebuddy.pool.TypePool.Resolution r3) {
                    r1 = this;
                    java.util.concurrent.ConcurrentMap<java.lang.String, net.bytebuddy.pool.TypePool$Resolution> r0 = r1.storage
                    java.lang.Object r2 = r0.putIfAbsent(r2, r3)
                    net.bytebuddy.pool.TypePool$Resolution r2 = (net.bytebuddy.pool.TypePool.Resolution) r2
                    if (r2 != 0) goto Lb
                    goto Lc
                Lb:
                    r3 = r2
                Lc:
                    return r3
            }
        }

        static {
                return
        }

        void clear();

        @net.bytebuddy.utility.nullability.MaybeNull
        net.bytebuddy.pool.TypePool.Resolution find(java.lang.String r1);

        net.bytebuddy.pool.TypePool.Resolution register(java.lang.String r1, net.bytebuddy.pool.TypePool.Resolution r2);
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ClassLoading extends net.bytebuddy.pool.TypePool.AbstractBase.Hierarchical {

        @net.bytebuddy.utility.nullability.MaybeNull
        @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
        private final java.lang.ClassLoader classLoader;

        public ClassLoading(net.bytebuddy.pool.TypePool.CacheProvider r1, net.bytebuddy.pool.TypePool r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.classLoader = r3
                return
        }

        public static net.bytebuddy.pool.TypePool of(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1) {
                net.bytebuddy.pool.TypePool$Empty r0 = net.bytebuddy.pool.TypePool.Empty.INSTANCE
                net.bytebuddy.pool.TypePool r1 = of(r1, r0)
                return r1
        }

        public static net.bytebuddy.pool.TypePool of(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r2, net.bytebuddy.pool.TypePool r3) {
                net.bytebuddy.pool.TypePool$ClassLoading r0 = new net.bytebuddy.pool.TypePool$ClassLoading
                net.bytebuddy.pool.TypePool$CacheProvider$Simple r1 = new net.bytebuddy.pool.TypePool$CacheProvider$Simple
                r1.<init>()
                r0.<init>(r1, r3, r2)
                return r0
        }

        public static net.bytebuddy.pool.TypePool ofBootLoader() {
                java.lang.ClassLoader r0 = net.bytebuddy.dynamic.loading.ClassLoadingStrategy.BOOTSTRAP_LOADER
                net.bytebuddy.pool.TypePool r0 = of(r0)
                return r0
        }

        public static net.bytebuddy.pool.TypePool ofPlatformLoader() {
                java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()
                java.lang.ClassLoader r0 = r0.getParent()
                net.bytebuddy.pool.TypePool r0 = of(r0)
                return r0
        }

        public static net.bytebuddy.pool.TypePool ofSystemLoader() {
                java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()
                net.bytebuddy.pool.TypePool r0 = of(r0)
                return r0
        }

        @Override // net.bytebuddy.pool.TypePool.AbstractBase
        public net.bytebuddy.pool.TypePool.Resolution doDescribe(java.lang.String r4) {
                r3 = this;
                net.bytebuddy.pool.TypePool$Resolution$Simple r0 = new net.bytebuddy.pool.TypePool$Resolution$Simple     // Catch: java.lang.ClassNotFoundException -> L11
                java.lang.ClassLoader r1 = r3.classLoader     // Catch: java.lang.ClassNotFoundException -> L11
                r2 = 0
                java.lang.Class r1 = java.lang.Class.forName(r4, r2, r1)     // Catch: java.lang.ClassNotFoundException -> L11
                net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)     // Catch: java.lang.ClassNotFoundException -> L11
                r0.<init>(r1)     // Catch: java.lang.ClassNotFoundException -> L11
                return r0
            L11:
                net.bytebuddy.pool.TypePool$Resolution$Illegal r0 = new net.bytebuddy.pool.TypePool$Resolution$Illegal
                r0.<init>(r4)
                return r0
        }

        @Override // net.bytebuddy.pool.TypePool.AbstractBase.Hierarchical, net.bytebuddy.pool.TypePool.AbstractBase
        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                r4 = this;
                boolean r0 = super.equals(r5)
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                r0 = 1
                if (r4 != r5) goto Lc
                return r0
            Lc:
                if (r5 != 0) goto Lf
                return r1
            Lf:
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L1a
                return r1
            L1a:
                java.lang.ClassLoader r2 = r4.classLoader
                net.bytebuddy.pool.TypePool$ClassLoading r5 = (net.bytebuddy.pool.TypePool.ClassLoading) r5
                java.lang.ClassLoader r5 = r5.classLoader
                if (r5 == 0) goto L2b
                if (r2 == 0) goto L2d
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L2e
                return r1
            L2b:
                if (r2 == 0) goto L2e
            L2d:
                return r1
            L2e:
                return r0
        }

        @Override // net.bytebuddy.pool.TypePool.AbstractBase.Hierarchical, net.bytebuddy.pool.TypePool.AbstractBase
        public int hashCode() {
                r2 = this;
                int r0 = super.hashCode()
                int r0 = r0 * 31
                java.lang.ClassLoader r1 = r2.classLoader
                if (r1 == 0) goto Lf
                int r1 = r1.hashCode()
                int r0 = r0 + r1
            Lf:
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Default extends net.bytebuddy.pool.TypePool.AbstractBase.Hierarchical {

        @net.bytebuddy.utility.nullability.AlwaysNull
        private static final net.bytebuddy.jar.asm.MethodVisitor IGNORE_METHOD = null;
        protected final net.bytebuddy.dynamic.ClassFileLocator classFileLocator;
        protected final net.bytebuddy.pool.TypePool.Default.ReaderMode readerMode;

        public interface AnnotationRegistrant {

            public static abstract class AbstractBase implements net.bytebuddy.pool.TypePool.Default.AnnotationRegistrant {
                private final java.lang.String descriptor;
                private final java.util.Map<java.lang.String, net.bytebuddy.description.annotation.AnnotationValue<?, ?>> values;

                public static abstract class ForTypeVariable extends net.bytebuddy.pool.TypePool.Default.AnnotationRegistrant.AbstractBase {
                    private final java.lang.String typePath;

                    public static abstract class WithIndex extends net.bytebuddy.pool.TypePool.Default.AnnotationRegistrant.AbstractBase.ForTypeVariable {
                        private final int index;

                        public static abstract class DoubleIndexed extends net.bytebuddy.pool.TypePool.Default.AnnotationRegistrant.AbstractBase.ForTypeVariable.WithIndex {
                            private final int preIndex;

                            public DoubleIndexed(java.lang.String r1, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.jar.asm.TypePath r2, int r3, int r4) {
                                    r0 = this;
                                    r0.<init>(r1, r2, r3)
                                    r0.preIndex = r4
                                    return
                            }

                            public abstract java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>>> getDoubleIndexedPathMap();

                            @Override // net.bytebuddy.pool.TypePool.Default.AnnotationRegistrant.AbstractBase.ForTypeVariable.WithIndex
                            public java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> getIndexedPathMap() {
                                    r3 = this;
                                    java.util.Map r0 = r3.getDoubleIndexedPathMap()
                                    int r1 = r3.preIndex
                                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                                    java.lang.Object r1 = r0.get(r1)
                                    java.util.Map r1 = (java.util.Map) r1
                                    if (r1 != 0) goto L20
                                    java.util.HashMap r1 = new java.util.HashMap
                                    r1.<init>()
                                    int r2 = r3.preIndex
                                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                                    r0.put(r2, r1)
                                L20:
                                    return r1
                            }
                        }

                        public WithIndex(java.lang.String r1, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.jar.asm.TypePath r2, int r3) {
                                r0 = this;
                                r0.<init>(r1, r2)
                                r0.index = r3
                                return
                        }

                        public abstract java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> getIndexedPathMap();

                        @Override // net.bytebuddy.pool.TypePool.Default.AnnotationRegistrant.AbstractBase.ForTypeVariable
                        public java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> getPathMap() {
                                r3 = this;
                                java.util.Map r0 = r3.getIndexedPathMap()
                                int r1 = r3.index
                                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                                java.lang.Object r1 = r0.get(r1)
                                java.util.Map r1 = (java.util.Map) r1
                                if (r1 != 0) goto L20
                                java.util.HashMap r1 = new java.util.HashMap
                                r1.<init>()
                                int r2 = r3.index
                                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                                r0.put(r2, r1)
                            L20:
                                return r1
                        }
                    }

                    public ForTypeVariable(java.lang.String r1, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.jar.asm.TypePath r2) {
                            r0 = this;
                            r0.<init>(r1)
                            if (r2 != 0) goto L8
                            java.lang.String r1 = ""
                            goto Lc
                        L8:
                            java.lang.String r1 = r2.toString()
                        Lc:
                            r0.typePath = r1
                            return
                    }

                    public abstract java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> getPathMap();

                    @Override // net.bytebuddy.pool.TypePool.Default.AnnotationRegistrant.AbstractBase
                    public java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken> getTokens() {
                            r3 = this;
                            java.util.Map r0 = r3.getPathMap()
                            java.lang.String r1 = r3.typePath
                            java.lang.Object r1 = r0.get(r1)
                            java.util.List r1 = (java.util.List) r1
                            if (r1 != 0) goto L18
                            java.util.ArrayList r1 = new java.util.ArrayList
                            r1.<init>()
                            java.lang.String r2 = r3.typePath
                            r0.put(r2, r1)
                        L18:
                            return r1
                    }
                }

                public AbstractBase(java.lang.String r1) {
                        r0 = this;
                        r0.<init>()
                        r0.descriptor = r1
                        java.util.HashMap r1 = new java.util.HashMap
                        r1.<init>()
                        r0.values = r1
                        return
                }

                public abstract java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken> getTokens();

                @Override // net.bytebuddy.pool.TypePool.Default.AnnotationRegistrant
                public void onComplete() {
                        r4 = this;
                        java.util.List r0 = r4.getTokens()
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken r1 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken
                        java.lang.String r2 = r4.descriptor
                        java.util.Map<java.lang.String, net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r3 = r4.values
                        r1.<init>(r2, r3)
                        r0.add(r1)
                        return
                }

                @Override // net.bytebuddy.pool.TypePool.Default.AnnotationRegistrant
                public void register(java.lang.String r2, net.bytebuddy.description.annotation.AnnotationValue<?, ?> r3) {
                        r1 = this;
                        java.util.Map<java.lang.String, net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r0 = r1.values
                        r0.put(r2, r3)
                        return
                }
            }

            public static class ForByteCodeElement extends net.bytebuddy.pool.TypePool.Default.AnnotationRegistrant.AbstractBase {
                private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken> annotationTokens;

                public static class WithIndex extends net.bytebuddy.pool.TypePool.Default.AnnotationRegistrant.AbstractBase {
                    private final java.util.Map<java.lang.Integer, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> annotationTokens;
                    private final int index;

                    public WithIndex(java.lang.String r1, int r2, java.util.Map<java.lang.Integer, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r3) {
                            r0 = this;
                            r0.<init>(r1)
                            r0.index = r2
                            r0.annotationTokens = r3
                            return
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.AnnotationRegistrant.AbstractBase
                    public java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken> getTokens() {
                            r3 = this;
                            java.util.Map<java.lang.Integer, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r0 = r3.annotationTokens
                            int r1 = r3.index
                            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                            java.lang.Object r0 = r0.get(r1)
                            java.util.List r0 = (java.util.List) r0
                            if (r0 != 0) goto L20
                            java.util.ArrayList r0 = new java.util.ArrayList
                            r0.<init>()
                            java.util.Map<java.lang.Integer, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r1 = r3.annotationTokens
                            int r2 = r3.index
                            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                            r1.put(r2, r0)
                        L20:
                            return r0
                    }
                }

                public ForByteCodeElement(java.lang.String r1, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken> r2) {
                        r0 = this;
                        r0.<init>(r1)
                        r0.annotationTokens = r2
                        return
                }

                @Override // net.bytebuddy.pool.TypePool.Default.AnnotationRegistrant.AbstractBase
                public java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken> getTokens() {
                        r1 = this;
                        java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken> r0 = r1.annotationTokens
                        return r0
                }
            }

            public static class ForTypeVariable extends net.bytebuddy.pool.TypePool.Default.AnnotationRegistrant.AbstractBase.ForTypeVariable {
                private final java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> pathMap;

                public static class WithIndex extends net.bytebuddy.pool.TypePool.Default.AnnotationRegistrant.AbstractBase.ForTypeVariable.WithIndex {
                    private final java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> indexedPathMap;

                    public static class DoubleIndexed extends net.bytebuddy.pool.TypePool.Default.AnnotationRegistrant.AbstractBase.ForTypeVariable.WithIndex.DoubleIndexed {
                        private final java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>>> doubleIndexedPathMap;

                        public DoubleIndexed(java.lang.String r1, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.jar.asm.TypePath r2, int r3, int r4, java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>>> r5) {
                                r0 = this;
                                r0.<init>(r1, r2, r3, r4)
                                r0.doubleIndexedPathMap = r5
                                return
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.AnnotationRegistrant.AbstractBase.ForTypeVariable.WithIndex.DoubleIndexed
                        public java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>>> getDoubleIndexedPathMap() {
                                r1 = this;
                                java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>>> r0 = r1.doubleIndexedPathMap
                                return r0
                        }
                    }

                    public WithIndex(java.lang.String r1, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.jar.asm.TypePath r2, int r3, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> r4) {
                            r0 = this;
                            r0.<init>(r1, r2, r3)
                            r0.indexedPathMap = r4
                            return
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.AnnotationRegistrant.AbstractBase.ForTypeVariable.WithIndex
                    public java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> getIndexedPathMap() {
                            r1 = this;
                            java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>> r0 = r1.indexedPathMap
                            return r0
                    }
                }

                public ForTypeVariable(java.lang.String r1, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.jar.asm.TypePath r2, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r3) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        r0.pathMap = r3
                        return
                }

                @Override // net.bytebuddy.pool.TypePool.Default.AnnotationRegistrant.AbstractBase.ForTypeVariable
                public java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> getPathMap() {
                        r1 = this;
                        java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r0 = r1.pathMap
                        return r0
                }
            }

            void onComplete();

            void register(java.lang.String r1, net.bytebuddy.description.annotation.AnnotationValue<?, ?> r2);
        }

        public interface ComponentTypeLocator {

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForAnnotationProperty implements net.bytebuddy.pool.TypePool.Default.ComponentTypeLocator {
                private final java.lang.String annotationName;
                private final net.bytebuddy.pool.TypePool typePool;

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                public class Bound implements net.bytebuddy.pool.TypePool.AbstractBase.ComponentTypeReference {
                    private final java.lang.String name;
                    final /* synthetic */ net.bytebuddy.pool.TypePool.Default.ComponentTypeLocator.ForAnnotationProperty this$0;

                    public Bound(net.bytebuddy.pool.TypePool.Default.ComponentTypeLocator.ForAnnotationProperty r1, java.lang.String r2) {
                            r0 = this;
                            r0.this$0 = r1
                            r0.<init>()
                            r0.name = r2
                            return
                    }

                    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                            r4 = this;
                            r0 = 1
                            if (r4 != r5) goto L4
                            return r0
                        L4:
                            r1 = 0
                            if (r5 != 0) goto L8
                            return r1
                        L8:
                            java.lang.Class r2 = r4.getClass()
                            java.lang.Class r3 = r5.getClass()
                            if (r2 == r3) goto L13
                            return r1
                        L13:
                            java.lang.String r2 = r4.name
                            net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$ForAnnotationProperty$Bound r5 = (net.bytebuddy.pool.TypePool.Default.ComponentTypeLocator.ForAnnotationProperty.Bound) r5
                            java.lang.String r3 = r5.name
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L20
                            return r1
                        L20:
                            net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$ForAnnotationProperty r2 = r4.this$0
                            net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$ForAnnotationProperty r5 = r5.this$0
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L2b
                            return r1
                        L2b:
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            java.lang.String r1 = r2.name
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$ForAnnotationProperty r1 = r2.this$0
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.AbstractBase.ComponentTypeReference
                    @net.bytebuddy.utility.nullability.MaybeNull
                    public java.lang.String resolve() {
                            r2 = this;
                            net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$ForAnnotationProperty r0 = r2.this$0
                            net.bytebuddy.pool.TypePool r0 = net.bytebuddy.pool.TypePool.Default.ComponentTypeLocator.ForAnnotationProperty.access$200(r0)
                            net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$ForAnnotationProperty r1 = r2.this$0
                            java.lang.String r1 = net.bytebuddy.pool.TypePool.Default.ComponentTypeLocator.ForAnnotationProperty.access$100(r1)
                            net.bytebuddy.pool.TypePool$Resolution r0 = r0.describe(r1)
                            net.bytebuddy.description.type.TypeDescription r0 = r0.resolve()
                            net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                            java.lang.String r1 = r2.name
                            net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                            net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                            net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                            java.lang.Object r0 = r0.getOnly()
                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getReturnType()
                            net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                            net.bytebuddy.description.type.TypeDescription r0 = r0.getComponentType()
                            if (r0 != 0) goto L3b
                            java.lang.String r0 = net.bytebuddy.pool.TypePool.AbstractBase.ComponentTypeReference.NO_ARRAY
                            goto L3f
                        L3b:
                            java.lang.String r0 = r0.getName()
                        L3f:
                            return r0
                    }
                }

                public ForAnnotationProperty(net.bytebuddy.pool.TypePool r2, java.lang.String r3) {
                        r1 = this;
                        r1.<init>()
                        r1.typePool = r2
                        int r2 = r3.length()
                        r0 = 1
                        int r2 = r2 - r0
                        java.lang.String r2 = r3.substring(r0, r2)
                        r3 = 47
                        r0 = 46
                        java.lang.String r2 = r2.replace(r3, r0)
                        r1.annotationName = r2
                        return
                }

                public static /* synthetic */ java.lang.String access$100(net.bytebuddy.pool.TypePool.Default.ComponentTypeLocator.ForAnnotationProperty r0) {
                        java.lang.String r0 = r0.annotationName
                        return r0
                }

                public static /* synthetic */ net.bytebuddy.pool.TypePool access$200(net.bytebuddy.pool.TypePool.Default.ComponentTypeLocator.ForAnnotationProperty r0) {
                        net.bytebuddy.pool.TypePool r0 = r0.typePool
                        return r0
                }

                @Override // net.bytebuddy.pool.TypePool.Default.ComponentTypeLocator
                public net.bytebuddy.pool.TypePool.AbstractBase.ComponentTypeReference bind(java.lang.String r2) {
                        r1 = this;
                        net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$ForAnnotationProperty$Bound r0 = new net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$ForAnnotationProperty$Bound
                        r0.<init>(r1, r2)
                        return r0
                }

                public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                        r4 = this;
                        r0 = 1
                        if (r4 != r5) goto L4
                        return r0
                    L4:
                        r1 = 0
                        if (r5 != 0) goto L8
                        return r1
                    L8:
                        java.lang.Class r2 = r4.getClass()
                        java.lang.Class r3 = r5.getClass()
                        if (r2 == r3) goto L13
                        return r1
                    L13:
                        java.lang.String r2 = r4.annotationName
                        net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$ForAnnotationProperty r5 = (net.bytebuddy.pool.TypePool.Default.ComponentTypeLocator.ForAnnotationProperty) r5
                        java.lang.String r3 = r5.annotationName
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        net.bytebuddy.pool.TypePool r2 = r4.typePool
                        net.bytebuddy.pool.TypePool r5 = r5.typePool
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L2b
                        return r1
                    L2b:
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        net.bytebuddy.pool.TypePool r1 = r2.typePool
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.lang.String r1 = r2.annotationName
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForArrayType implements net.bytebuddy.pool.TypePool.Default.ComponentTypeLocator, net.bytebuddy.pool.TypePool.AbstractBase.ComponentTypeReference {
                private final java.lang.String componentType;

                public ForArrayType(java.lang.String r3) {
                        r2 = this;
                        r2.<init>()
                        net.bytebuddy.jar.asm.Type r3 = net.bytebuddy.jar.asm.Type.getMethodType(r3)
                        net.bytebuddy.jar.asm.Type r3 = r3.getReturnType()
                        java.lang.String r3 = r3.getClassName()
                        int r0 = r3.length()
                        int r0 = r0 + (-2)
                        r1 = 0
                        java.lang.String r3 = r3.substring(r1, r0)
                        r2.componentType = r3
                        return
                }

                @Override // net.bytebuddy.pool.TypePool.Default.ComponentTypeLocator
                public net.bytebuddy.pool.TypePool.AbstractBase.ComponentTypeReference bind(java.lang.String r1) {
                        r0 = this;
                        return r0
                }

                public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                        r4 = this;
                        r0 = 1
                        if (r4 != r5) goto L4
                        return r0
                    L4:
                        r1 = 0
                        if (r5 != 0) goto L8
                        return r1
                    L8:
                        java.lang.Class r2 = r4.getClass()
                        java.lang.Class r3 = r5.getClass()
                        if (r2 == r3) goto L13
                        return r1
                    L13:
                        java.lang.String r2 = r4.componentType
                        net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$ForArrayType r5 = (net.bytebuddy.pool.TypePool.Default.ComponentTypeLocator.ForArrayType) r5
                        java.lang.String r5 = r5.componentType
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L20
                        return r1
                    L20:
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        java.lang.String r1 = r2.componentType
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.pool.TypePool.AbstractBase.ComponentTypeReference
                public java.lang.String resolve() {
                        r1 = this;
                        java.lang.String r0 = r1.componentType
                        return r0
                }
            }

            public enum Illegal extends java.lang.Enum<net.bytebuddy.pool.TypePool.Default.ComponentTypeLocator.Illegal> implements net.bytebuddy.pool.TypePool.Default.ComponentTypeLocator {
                private static final /* synthetic */ net.bytebuddy.pool.TypePool.Default.ComponentTypeLocator.Illegal[] $VALUES = null;
                public static final net.bytebuddy.pool.TypePool.Default.ComponentTypeLocator.Illegal INSTANCE = null;

                static {
                        net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$Illegal r0 = new net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$Illegal
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.pool.TypePool.Default.ComponentTypeLocator.Illegal.INSTANCE = r0
                        net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$Illegal[] r0 = new net.bytebuddy.pool.TypePool.Default.ComponentTypeLocator.Illegal[]{r0}
                        net.bytebuddy.pool.TypePool.Default.ComponentTypeLocator.Illegal.$VALUES = r0
                        return
                }

                Illegal(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.pool.TypePool.Default.ComponentTypeLocator.Illegal valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$Illegal> r0 = net.bytebuddy.pool.TypePool.Default.ComponentTypeLocator.Illegal.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$Illegal r1 = (net.bytebuddy.pool.TypePool.Default.ComponentTypeLocator.Illegal) r1
                        return r1
                }

                public static net.bytebuddy.pool.TypePool.Default.ComponentTypeLocator.Illegal[] values() {
                        net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$Illegal[] r0 = net.bytebuddy.pool.TypePool.Default.ComponentTypeLocator.Illegal.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$Illegal[] r0 = (net.bytebuddy.pool.TypePool.Default.ComponentTypeLocator.Illegal[]) r0
                        return r0
                }

                @Override // net.bytebuddy.pool.TypePool.Default.ComponentTypeLocator
                public net.bytebuddy.pool.TypePool.AbstractBase.ComponentTypeReference bind(java.lang.String r4) {
                        r3 = this;
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "Unexpected lookup of component type for "
                        r1.append(r2)
                        r1.append(r4)
                        java.lang.String r4 = r1.toString()
                        r0.<init>(r4)
                        throw r0
                }
            }

            net.bytebuddy.pool.TypePool.AbstractBase.ComponentTypeReference bind(java.lang.String r1);
        }

        public static class GenericTypeExtractor extends net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant.RejectingSignatureVisitor implements net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant {
            private final net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant genericTypeRegistrant;

            @net.bytebuddy.utility.nullability.UnknownNull
            private net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.IncompleteToken incompleteToken;

            public static abstract class ForSignature<T extends net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution> extends net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant.RejectingSignatureVisitor implements net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant {

                @net.bytebuddy.utility.nullability.UnknownNull
                protected java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken> currentBounds;

                @net.bytebuddy.utility.nullability.MaybeNull
                protected java.lang.String currentTypeParameter;
                protected final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.OfFormalTypeVariable> typeVariableTokens;

                public static class OfField implements net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant {

                    @net.bytebuddy.utility.nullability.UnknownNull
                    private net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken fieldTypeToken;

                    public OfField() {
                            r0 = this;
                            r0.<init>()
                            return
                    }

                    public static net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForField extract(@net.bytebuddy.utility.nullability.MaybeNull java.lang.String r2) {
                            if (r2 != 0) goto L5
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Raw r2 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Raw.INSTANCE
                            return r2
                        L5:
                            net.bytebuddy.jar.asm.signature.SignatureReader r0 = new net.bytebuddy.jar.asm.signature.SignatureReader
                            r0.<init>(r2)
                            net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfField r2 = new net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfField
                            r2.<init>()
                            net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor r1 = new net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor     // Catch: java.lang.RuntimeException -> L1c
                            r1.<init>(r2)     // Catch: java.lang.RuntimeException -> L1c
                            r0.acceptType(r1)     // Catch: java.lang.RuntimeException -> L1c
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForField r2 = r2.resolve()     // Catch: java.lang.RuntimeException -> L1c
                            return r2
                        L1c:
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Malformed r2 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Malformed.INSTANCE
                            return r2
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant
                    public void register(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken r1) {
                            r0 = this;
                            r0.fieldTypeToken = r1
                            return
                    }

                    public net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForField resolve() {
                            r2 = this;
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForField$Tokenized r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForField$Tokenized
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r1 = r2.fieldTypeToken
                            r0.<init>(r1)
                            return r0
                    }
                }

                public static class OfMethod extends net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForMethod> {
                    private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken> exceptionTypeTokens;
                    private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken> parameterTypeTokens;

                    @net.bytebuddy.utility.nullability.UnknownNull
                    private net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken returnTypeToken;

                    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                    public class ExceptionTypeRegistrant implements net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant {
                        final /* synthetic */ net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature.OfMethod this$0;

                        public ExceptionTypeRegistrant(net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature.OfMethod r1) {
                                r0 = this;
                                r0.this$0 = r1
                                r0.<init>()
                                return
                        }

                        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                                r4 = this;
                                r0 = 1
                                if (r4 != r5) goto L4
                                return r0
                            L4:
                                r1 = 0
                                if (r5 != 0) goto L8
                                return r1
                            L8:
                                java.lang.Class r2 = r4.getClass()
                                java.lang.Class r3 = r5.getClass()
                                if (r2 == r3) goto L13
                                return r1
                            L13:
                                net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfMethod r2 = r4.this$0
                                net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfMethod$ExceptionTypeRegistrant r5 = (net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature.OfMethod.ExceptionTypeRegistrant) r5
                                net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfMethod r5 = r5.this$0
                                boolean r5 = r2.equals(r5)
                                if (r5 != 0) goto L20
                                return r1
                            L20:
                                return r0
                        }

                        public int hashCode() {
                                r2 = this;
                                java.lang.Class r0 = r2.getClass()
                                int r0 = r0.hashCode()
                                int r0 = r0 * 31
                                net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfMethod r1 = r2.this$0
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                                return r0
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant
                        public void register(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken r2) {
                                r1 = this;
                                net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfMethod r0 = r1.this$0
                                java.util.List r0 = net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature.OfMethod.access$700(r0)
                                r0.add(r2)
                                return
                        }
                    }

                    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                    public class ParameterTypeRegistrant implements net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant {
                        final /* synthetic */ net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature.OfMethod this$0;

                        public ParameterTypeRegistrant(net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature.OfMethod r1) {
                                r0 = this;
                                r0.this$0 = r1
                                r0.<init>()
                                return
                        }

                        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                                r4 = this;
                                r0 = 1
                                if (r4 != r5) goto L4
                                return r0
                            L4:
                                r1 = 0
                                if (r5 != 0) goto L8
                                return r1
                            L8:
                                java.lang.Class r2 = r4.getClass()
                                java.lang.Class r3 = r5.getClass()
                                if (r2 == r3) goto L13
                                return r1
                            L13:
                                net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfMethod r2 = r4.this$0
                                net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfMethod$ParameterTypeRegistrant r5 = (net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature.OfMethod.ParameterTypeRegistrant) r5
                                net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfMethod r5 = r5.this$0
                                boolean r5 = r2.equals(r5)
                                if (r5 != 0) goto L20
                                return r1
                            L20:
                                return r0
                        }

                        public int hashCode() {
                                r2 = this;
                                java.lang.Class r0 = r2.getClass()
                                int r0 = r0.hashCode()
                                int r0 = r0 * 31
                                net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfMethod r1 = r2.this$0
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                                return r0
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant
                        public void register(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken r2) {
                                r1 = this;
                                net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfMethod r0 = r1.this$0
                                java.util.List r0 = net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature.OfMethod.access$500(r0)
                                r0.add(r2)
                                return
                        }
                    }

                    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                    public class ReturnTypeTypeRegistrant implements net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant {
                        final /* synthetic */ net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature.OfMethod this$0;

                        public ReturnTypeTypeRegistrant(net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature.OfMethod r1) {
                                r0 = this;
                                r0.this$0 = r1
                                r0.<init>()
                                return
                        }

                        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                                r4 = this;
                                r0 = 1
                                if (r4 != r5) goto L4
                                return r0
                            L4:
                                r1 = 0
                                if (r5 != 0) goto L8
                                return r1
                            L8:
                                java.lang.Class r2 = r4.getClass()
                                java.lang.Class r3 = r5.getClass()
                                if (r2 == r3) goto L13
                                return r1
                            L13:
                                net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfMethod r2 = r4.this$0
                                net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfMethod$ReturnTypeTypeRegistrant r5 = (net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature.OfMethod.ReturnTypeTypeRegistrant) r5
                                net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfMethod r5 = r5.this$0
                                boolean r5 = r2.equals(r5)
                                if (r5 != 0) goto L20
                                return r1
                            L20:
                                return r0
                        }

                        public int hashCode() {
                                r2 = this;
                                java.lang.Class r0 = r2.getClass()
                                int r0 = r0.hashCode()
                                int r0 = r0 * 31
                                net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfMethod r1 = r2.this$0
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                                return r0
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant
                        public void register(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken r2) {
                                r1 = this;
                                net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfMethod r0 = r1.this$0
                                net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature.OfMethod.access$602(r0, r2)
                                return
                        }
                    }

                    public OfMethod() {
                            r1 = this;
                            r1.<init>()
                            java.util.ArrayList r0 = new java.util.ArrayList
                            r0.<init>()
                            r1.parameterTypeTokens = r0
                            java.util.ArrayList r0 = new java.util.ArrayList
                            r0.<init>()
                            r1.exceptionTypeTokens = r0
                            return
                    }

                    public static /* synthetic */ java.util.List access$500(net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature.OfMethod r0) {
                            java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r0 = r0.parameterTypeTokens
                            return r0
                    }

                    public static /* synthetic */ net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken access$602(net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature.OfMethod r0, net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken r1) {
                            r0.returnTypeToken = r1
                            return r1
                    }

                    public static /* synthetic */ java.util.List access$700(net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature.OfMethod r0) {
                            java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r0 = r0.exceptionTypeTokens
                            return r0
                    }

                    public static net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForMethod extract(@net.bytebuddy.utility.nullability.MaybeNull java.lang.String r1) {
                            if (r1 != 0) goto L5
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Raw r1 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Raw.INSTANCE     // Catch: java.lang.RuntimeException -> L11
                            goto L10
                        L5:
                            net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfMethod r0 = new net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfMethod     // Catch: java.lang.RuntimeException -> L11
                            r0.<init>()     // Catch: java.lang.RuntimeException -> L11
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution r1 = net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature.extract(r1, r0)     // Catch: java.lang.RuntimeException -> L11
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForMethod r1 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForMethod) r1     // Catch: java.lang.RuntimeException -> L11
                        L10:
                            return r1
                        L11:
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Malformed r1 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Malformed.INSTANCE
                            return r1
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature
                    public net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForMethod resolve() {
                            r5 = this;
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForMethod$Tokenized r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForMethod$Tokenized
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r1 = r5.returnTypeToken
                            java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r2 = r5.parameterTypeTokens
                            java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r3 = r5.exceptionTypeTokens
                            java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$OfFormalTypeVariable> r4 = r5.typeVariableTokens
                            r0.<init>(r1, r2, r3, r4)
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature
                    public /* bridge */ /* synthetic */ net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution resolve() {
                            r1 = this;
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForMethod r0 = r1.resolve()
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant.RejectingSignatureVisitor, net.bytebuddy.jar.asm.signature.SignatureVisitor
                    public net.bytebuddy.jar.asm.signature.SignatureVisitor visitExceptionType() {
                            r2 = this;
                            net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor r0 = new net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor
                            net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfMethod$ExceptionTypeRegistrant r1 = new net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfMethod$ExceptionTypeRegistrant
                            r1.<init>(r2)
                            r0.<init>(r1)
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant.RejectingSignatureVisitor, net.bytebuddy.jar.asm.signature.SignatureVisitor
                    public net.bytebuddy.jar.asm.signature.SignatureVisitor visitParameterType() {
                            r2 = this;
                            net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor r0 = new net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor
                            net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfMethod$ParameterTypeRegistrant r1 = new net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfMethod$ParameterTypeRegistrant
                            r1.<init>(r2)
                            r0.<init>(r1)
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant.RejectingSignatureVisitor, net.bytebuddy.jar.asm.signature.SignatureVisitor
                    public net.bytebuddy.jar.asm.signature.SignatureVisitor visitReturnType() {
                            r2 = this;
                            r2.collectTypeParameter()
                            net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor r0 = new net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor
                            net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfMethod$ReturnTypeTypeRegistrant r1 = new net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfMethod$ReturnTypeTypeRegistrant
                            r1.<init>(r2)
                            r0.<init>(r1)
                            return r0
                    }
                }

                public static class OfRecordComponent implements net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant {

                    @net.bytebuddy.utility.nullability.UnknownNull
                    private net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken recordComponentType;

                    public OfRecordComponent() {
                            r0 = this;
                            r0.<init>()
                            return
                    }

                    public static net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForRecordComponent extract(@net.bytebuddy.utility.nullability.MaybeNull java.lang.String r2) {
                            if (r2 != 0) goto L5
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Raw r2 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Raw.INSTANCE
                            return r2
                        L5:
                            net.bytebuddy.jar.asm.signature.SignatureReader r0 = new net.bytebuddy.jar.asm.signature.SignatureReader
                            r0.<init>(r2)
                            net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfRecordComponent r2 = new net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfRecordComponent
                            r2.<init>()
                            net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor r1 = new net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor     // Catch: java.lang.RuntimeException -> L1c
                            r1.<init>(r2)     // Catch: java.lang.RuntimeException -> L1c
                            r0.acceptType(r1)     // Catch: java.lang.RuntimeException -> L1c
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForRecordComponent r2 = r2.resolve()     // Catch: java.lang.RuntimeException -> L1c
                            return r2
                        L1c:
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Malformed r2 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Malformed.INSTANCE
                            return r2
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant
                    public void register(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken r1) {
                            r0 = this;
                            r0.recordComponentType = r1
                            return
                    }

                    public net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForRecordComponent resolve() {
                            r2 = this;
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForRecordComponent$Tokenized r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForRecordComponent$Tokenized
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r1 = r2.recordComponentType
                            r0.<init>(r1)
                            return r0
                    }
                }

                public static class OfType extends net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForType> {
                    private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken> interfaceTypeTokens;

                    @net.bytebuddy.utility.nullability.UnknownNull
                    private net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken superClassToken;

                    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                    public class InterfaceTypeRegistrant implements net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant {
                        final /* synthetic */ net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature.OfType this$0;

                        public InterfaceTypeRegistrant(net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature.OfType r1) {
                                r0 = this;
                                r0.this$0 = r1
                                r0.<init>()
                                return
                        }

                        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                                r4 = this;
                                r0 = 1
                                if (r4 != r5) goto L4
                                return r0
                            L4:
                                r1 = 0
                                if (r5 != 0) goto L8
                                return r1
                            L8:
                                java.lang.Class r2 = r4.getClass()
                                java.lang.Class r3 = r5.getClass()
                                if (r2 == r3) goto L13
                                return r1
                            L13:
                                net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfType r2 = r4.this$0
                                net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfType$InterfaceTypeRegistrant r5 = (net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature.OfType.InterfaceTypeRegistrant) r5
                                net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfType r5 = r5.this$0
                                boolean r5 = r2.equals(r5)
                                if (r5 != 0) goto L20
                                return r1
                            L20:
                                return r0
                        }

                        public int hashCode() {
                                r2 = this;
                                java.lang.Class r0 = r2.getClass()
                                int r0 = r0.hashCode()
                                int r0 = r0 * 31
                                net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfType r1 = r2.this$0
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                                return r0
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant
                        public void register(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken r2) {
                                r1 = this;
                                net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfType r0 = r1.this$0
                                java.util.List r0 = net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature.OfType.access$400(r0)
                                r0.add(r2)
                                return
                        }
                    }

                    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                    public class SuperClassRegistrant implements net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant {
                        final /* synthetic */ net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature.OfType this$0;

                        public SuperClassRegistrant(net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature.OfType r1) {
                                r0 = this;
                                r0.this$0 = r1
                                r0.<init>()
                                return
                        }

                        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                                r4 = this;
                                r0 = 1
                                if (r4 != r5) goto L4
                                return r0
                            L4:
                                r1 = 0
                                if (r5 != 0) goto L8
                                return r1
                            L8:
                                java.lang.Class r2 = r4.getClass()
                                java.lang.Class r3 = r5.getClass()
                                if (r2 == r3) goto L13
                                return r1
                            L13:
                                net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfType r2 = r4.this$0
                                net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfType$SuperClassRegistrant r5 = (net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature.OfType.SuperClassRegistrant) r5
                                net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfType r5 = r5.this$0
                                boolean r5 = r2.equals(r5)
                                if (r5 != 0) goto L20
                                return r1
                            L20:
                                return r0
                        }

                        public int hashCode() {
                                r2 = this;
                                java.lang.Class r0 = r2.getClass()
                                int r0 = r0.hashCode()
                                int r0 = r0 * 31
                                net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfType r1 = r2.this$0
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                                return r0
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant
                        public void register(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken r2) {
                                r1 = this;
                                net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfType r0 = r1.this$0
                                net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature.OfType.access$302(r0, r2)
                                return
                        }
                    }

                    public OfType() {
                            r1 = this;
                            r1.<init>()
                            java.util.ArrayList r0 = new java.util.ArrayList
                            r0.<init>()
                            r1.interfaceTypeTokens = r0
                            return
                    }

                    public static /* synthetic */ net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken access$302(net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature.OfType r0, net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken r1) {
                            r0.superClassToken = r1
                            return r1
                    }

                    public static /* synthetic */ java.util.List access$400(net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature.OfType r0) {
                            java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r0 = r0.interfaceTypeTokens
                            return r0
                    }

                    public static net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForType extract(@net.bytebuddy.utility.nullability.MaybeNull java.lang.String r1) {
                            if (r1 != 0) goto L5
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Raw r1 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Raw.INSTANCE     // Catch: java.lang.RuntimeException -> L11
                            goto L10
                        L5:
                            net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfType r0 = new net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfType     // Catch: java.lang.RuntimeException -> L11
                            r0.<init>()     // Catch: java.lang.RuntimeException -> L11
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution r1 = net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature.extract(r1, r0)     // Catch: java.lang.RuntimeException -> L11
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForType r1 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForType) r1     // Catch: java.lang.RuntimeException -> L11
                        L10:
                            return r1
                        L11:
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Malformed r1 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Malformed.INSTANCE
                            return r1
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature
                    public net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForType resolve() {
                            r4 = this;
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForType$Tokenized r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForType$Tokenized
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r1 = r4.superClassToken
                            java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r2 = r4.interfaceTypeTokens
                            java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$OfFormalTypeVariable> r3 = r4.typeVariableTokens
                            r0.<init>(r1, r2, r3)
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature
                    public /* bridge */ /* synthetic */ net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution resolve() {
                            r1 = this;
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForType r0 = r1.resolve()
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant.RejectingSignatureVisitor, net.bytebuddy.jar.asm.signature.SignatureVisitor
                    public net.bytebuddy.jar.asm.signature.SignatureVisitor visitInterface() {
                            r2 = this;
                            net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor r0 = new net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor
                            net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfType$InterfaceTypeRegistrant r1 = new net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfType$InterfaceTypeRegistrant
                            r1.<init>(r2)
                            r0.<init>(r1)
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant.RejectingSignatureVisitor, net.bytebuddy.jar.asm.signature.SignatureVisitor
                    public net.bytebuddy.jar.asm.signature.SignatureVisitor visitSuperclass() {
                            r2 = this;
                            r2.collectTypeParameter()
                            net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor r0 = new net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor
                            net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfType$SuperClassRegistrant r1 = new net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$ForSignature$OfType$SuperClassRegistrant
                            r1.<init>(r2)
                            r0.<init>(r1)
                            return r0
                    }
                }

                public ForSignature() {
                        r1 = this;
                        r1.<init>()
                        java.util.ArrayList r0 = new java.util.ArrayList
                        r0.<init>()
                        r1.typeVariableTokens = r0
                        return
                }

                public static <S extends net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution> S extract(java.lang.String r1, net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature<S> r2) {
                        net.bytebuddy.jar.asm.signature.SignatureReader r0 = new net.bytebuddy.jar.asm.signature.SignatureReader
                        r0.<init>(r1)
                        r0.accept(r2)
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution r1 = r2.resolve()
                        return r1
                }

                public void collectTypeParameter() {
                        r4 = this;
                        java.lang.String r0 = r4.currentTypeParameter
                        if (r0 == 0) goto L10
                        java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$OfFormalTypeVariable> r1 = r4.typeVariableTokens
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForTypeVariable$Formal r2 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForTypeVariable$Formal
                        java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r3 = r4.currentBounds
                        r2.<init>(r0, r3)
                        r1.add(r2)
                    L10:
                        return
                }

                @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant
                public void register(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken r4) {
                        r3 = this;
                        java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r0 = r3.currentBounds
                        if (r0 == 0) goto L8
                        r0.add(r4)
                        return
                    L8:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "Did not expect "
                        r1.append(r2)
                        r1.append(r4)
                        java.lang.String r4 = " before finding formal parameter"
                        r1.append(r4)
                        java.lang.String r4 = r1.toString()
                        r0.<init>(r4)
                        throw r0
                }

                public abstract T resolve();

                @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant.RejectingSignatureVisitor, net.bytebuddy.jar.asm.signature.SignatureVisitor
                public net.bytebuddy.jar.asm.signature.SignatureVisitor visitClassBound() {
                        r1 = this;
                        net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor r0 = new net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor
                        r0.<init>(r1)
                        return r0
                }

                @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant.RejectingSignatureVisitor, net.bytebuddy.jar.asm.signature.SignatureVisitor
                public void visitFormalTypeParameter(java.lang.String r1) {
                        r0 = this;
                        r0.collectTypeParameter()
                        r0.currentTypeParameter = r1
                        java.util.ArrayList r1 = new java.util.ArrayList
                        r1.<init>()
                        r0.currentBounds = r1
                        return
                }

                @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant.RejectingSignatureVisitor, net.bytebuddy.jar.asm.signature.SignatureVisitor
                public net.bytebuddy.jar.asm.signature.SignatureVisitor visitInterfaceBound() {
                        r1 = this;
                        net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor r0 = new net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor
                        r0.<init>(r1)
                        return r0
                }
            }

            public interface IncompleteToken {

                public static abstract class AbstractBase implements net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.IncompleteToken {
                    protected final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken> parameters;

                    public class ForDirectBound implements net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant {
                        final /* synthetic */ net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.IncompleteToken.AbstractBase this$0;

                        public ForDirectBound(net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.IncompleteToken.AbstractBase r1) {
                                r0 = this;
                                r0.this$0 = r1
                                r0.<init>()
                                return
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant
                        public void register(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken r2) {
                                r1 = this;
                                net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$IncompleteToken$AbstractBase r0 = r1.this$0
                                java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r0 = r0.parameters
                                r0.add(r2)
                                return
                        }
                    }

                    public class ForLowerBound implements net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant {
                        final /* synthetic */ net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.IncompleteToken.AbstractBase this$0;

                        public ForLowerBound(net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.IncompleteToken.AbstractBase r1) {
                                r0 = this;
                                r0.this$0 = r1
                                r0.<init>()
                                return
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant
                        public void register(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken r3) {
                                r2 = this;
                                net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$IncompleteToken$AbstractBase r0 = r2.this$0
                                java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r0 = r0.parameters
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForLowerBoundWildcard r1 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForLowerBoundWildcard
                                r1.<init>(r3)
                                r0.add(r1)
                                return
                        }
                    }

                    public class ForUpperBound implements net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant {
                        final /* synthetic */ net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.IncompleteToken.AbstractBase this$0;

                        public ForUpperBound(net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.IncompleteToken.AbstractBase r1) {
                                r0 = this;
                                r0.this$0 = r1
                                r0.<init>()
                                return
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant
                        public void register(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken r3) {
                                r2 = this;
                                net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$IncompleteToken$AbstractBase r0 = r2.this$0
                                java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r0 = r0.parameters
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForUpperBoundWildcard r1 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForUpperBoundWildcard
                                r1.<init>(r3)
                                r0.add(r1)
                                return
                        }
                    }

                    public AbstractBase() {
                            r1 = this;
                            r1.<init>()
                            java.util.ArrayList r0 = new java.util.ArrayList
                            r0.<init>()
                            r1.parameters = r0
                            return
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.IncompleteToken
                    public net.bytebuddy.jar.asm.signature.SignatureVisitor appendDirectBound() {
                            r2 = this;
                            net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor r0 = new net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor
                            net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$IncompleteToken$AbstractBase$ForDirectBound r1 = new net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$IncompleteToken$AbstractBase$ForDirectBound
                            r1.<init>(r2)
                            r0.<init>(r1)
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.IncompleteToken
                    public net.bytebuddy.jar.asm.signature.SignatureVisitor appendLowerBound() {
                            r2 = this;
                            net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor r0 = new net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor
                            net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$IncompleteToken$AbstractBase$ForLowerBound r1 = new net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$IncompleteToken$AbstractBase$ForLowerBound
                            r1.<init>(r2)
                            r0.<init>(r1)
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.IncompleteToken
                    public void appendPlaceholder() {
                            r2 = this;
                            java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r0 = r2.parameters
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForUnboundWildcard r1 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForUnboundWildcard.INSTANCE
                            r0.add(r1)
                            return
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.IncompleteToken
                    public net.bytebuddy.jar.asm.signature.SignatureVisitor appendUpperBound() {
                            r2 = this;
                            net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor r0 = new net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor
                            net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$IncompleteToken$AbstractBase$ForUpperBound r1 = new net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$IncompleteToken$AbstractBase$ForUpperBound
                            r1.<init>(r2)
                            r0.<init>(r1)
                            return r0
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class ForInnerClass extends net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.IncompleteToken.AbstractBase {
                    private static final char INNER_CLASS_SEPARATOR = '$';
                    private final java.lang.String internalName;
                    private final net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.IncompleteToken outerTypeToken;

                    public ForInnerClass(java.lang.String r1, net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.IncompleteToken r2) {
                            r0 = this;
                            r0.<init>()
                            r0.internalName = r1
                            r0.outerTypeToken = r2
                            return
                    }

                    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                            r4 = this;
                            r0 = 1
                            if (r4 != r5) goto L4
                            return r0
                        L4:
                            r1 = 0
                            if (r5 != 0) goto L8
                            return r1
                        L8:
                            java.lang.Class r2 = r4.getClass()
                            java.lang.Class r3 = r5.getClass()
                            if (r2 == r3) goto L13
                            return r1
                        L13:
                            java.lang.String r2 = r4.internalName
                            net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$IncompleteToken$ForInnerClass r5 = (net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.IncompleteToken.ForInnerClass) r5
                            java.lang.String r3 = r5.internalName
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L20
                            return r1
                        L20:
                            net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$IncompleteToken r2 = r4.outerTypeToken
                            net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$IncompleteToken r5 = r5.outerTypeToken
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L2b
                            return r1
                        L2b:
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.IncompleteToken
                    public java.lang.String getName() {
                            r4 = this;
                            java.lang.StringBuilder r0 = new java.lang.StringBuilder
                            r0.<init>()
                            net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$IncompleteToken r1 = r4.outerTypeToken
                            java.lang.String r1 = r1.getName()
                            r0.append(r1)
                            r1 = 36
                            r0.append(r1)
                            java.lang.String r1 = r4.internalName
                            r2 = 47
                            r3 = 46
                            java.lang.String r1 = r1.replace(r2, r3)
                            r0.append(r1)
                            java.lang.String r0 = r0.toString()
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            java.lang.String r1 = r2.internalName
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$IncompleteToken r1 = r2.outerTypeToken
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.IncompleteToken
                    public boolean isParameterized() {
                            r1 = this;
                            java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r0 = r1.parameters
                            boolean r0 = r0.isEmpty()
                            if (r0 == 0) goto L13
                            net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$IncompleteToken r0 = r1.outerTypeToken
                            boolean r0 = r0.isParameterized()
                            if (r0 != 0) goto L11
                            goto L13
                        L11:
                            r0 = 0
                            goto L14
                        L13:
                            r0 = 1
                        L14:
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.IncompleteToken
                    public net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken toToken() {
                            r4 = this;
                            boolean r0 = r4.isParameterized()
                            if (r0 != 0) goto L19
                            net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$IncompleteToken r0 = r4.outerTypeToken
                            boolean r0 = r0.isParameterized()
                            if (r0 == 0) goto Lf
                            goto L19
                        Lf:
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForRawType r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForRawType
                            java.lang.String r1 = r4.getName()
                            r0.<init>(r1)
                            goto L2a
                        L19:
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForParameterizedType$Nested r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForParameterizedType$Nested
                            java.lang.String r1 = r4.getName()
                            java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r2 = r4.parameters
                            net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$IncompleteToken r3 = r4.outerTypeToken
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r3 = r3.toToken()
                            r0.<init>(r1, r2, r3)
                        L2a:
                            return r0
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class ForTopLevelType extends net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.IncompleteToken.AbstractBase {
                    private final java.lang.String internalName;

                    public ForTopLevelType(java.lang.String r1) {
                            r0 = this;
                            r0.<init>()
                            r0.internalName = r1
                            return
                    }

                    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                            r4 = this;
                            r0 = 1
                            if (r4 != r5) goto L4
                            return r0
                        L4:
                            r1 = 0
                            if (r5 != 0) goto L8
                            return r1
                        L8:
                            java.lang.Class r2 = r4.getClass()
                            java.lang.Class r3 = r5.getClass()
                            if (r2 == r3) goto L13
                            return r1
                        L13:
                            java.lang.String r2 = r4.internalName
                            net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$IncompleteToken$ForTopLevelType r5 = (net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.IncompleteToken.ForTopLevelType) r5
                            java.lang.String r5 = r5.internalName
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L20
                            return r1
                        L20:
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.IncompleteToken
                    public java.lang.String getName() {
                            r3 = this;
                            java.lang.String r0 = r3.internalName
                            r1 = 47
                            r2 = 46
                            java.lang.String r0 = r0.replace(r1, r2)
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            java.lang.String r1 = r2.internalName
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.IncompleteToken
                    public boolean isParameterized() {
                            r1 = this;
                            java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r0 = r1.parameters
                            boolean r0 = r0.isEmpty()
                            r0 = r0 ^ 1
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.IncompleteToken
                    public net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken toToken() {
                            r3 = this;
                            boolean r0 = r3.isParameterized()
                            if (r0 == 0) goto L12
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForParameterizedType r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForParameterizedType
                            java.lang.String r1 = r3.getName()
                            java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r2 = r3.parameters
                            r0.<init>(r1, r2)
                            goto L1b
                        L12:
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForRawType r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForRawType
                            java.lang.String r1 = r3.getName()
                            r0.<init>(r1)
                        L1b:
                            return r0
                    }
                }

                net.bytebuddy.jar.asm.signature.SignatureVisitor appendDirectBound();

                net.bytebuddy.jar.asm.signature.SignatureVisitor appendLowerBound();

                void appendPlaceholder();

                net.bytebuddy.jar.asm.signature.SignatureVisitor appendUpperBound();

                java.lang.String getName();

                boolean isParameterized();

                net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken toToken();
            }

            public GenericTypeExtractor(net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant r1) {
                    r0 = this;
                    r0.<init>()
                    r0.genericTypeRegistrant = r1
                    return
            }

            @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant
            public void register(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken r3) {
                    r2 = this;
                    net.bytebuddy.pool.TypePool$Default$GenericTypeRegistrant r0 = r2.genericTypeRegistrant
                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForGenericArray r1 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForGenericArray
                    r1.<init>(r3)
                    r0.register(r1)
                    return
            }

            @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant.RejectingSignatureVisitor, net.bytebuddy.jar.asm.signature.SignatureVisitor
            public net.bytebuddy.jar.asm.signature.SignatureVisitor visitArrayType() {
                    r1 = this;
                    net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor r0 = new net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor
                    r0.<init>(r1)
                    return r0
            }

            @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant.RejectingSignatureVisitor, net.bytebuddy.jar.asm.signature.SignatureVisitor
            public void visitBaseType(char r2) {
                    r1 = this;
                    net.bytebuddy.pool.TypePool$Default$GenericTypeRegistrant r0 = r1.genericTypeRegistrant
                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r2 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType.of(r2)
                    r0.register(r2)
                    return
            }

            @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant.RejectingSignatureVisitor, net.bytebuddy.jar.asm.signature.SignatureVisitor
            public void visitClassType(java.lang.String r2) {
                    r1 = this;
                    net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$IncompleteToken$ForTopLevelType r0 = new net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$IncompleteToken$ForTopLevelType
                    r0.<init>(r2)
                    r1.incompleteToken = r0
                    return
            }

            @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant.RejectingSignatureVisitor, net.bytebuddy.jar.asm.signature.SignatureVisitor
            public void visitEnd() {
                    r2 = this;
                    net.bytebuddy.pool.TypePool$Default$GenericTypeRegistrant r0 = r2.genericTypeRegistrant
                    net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$IncompleteToken r1 = r2.incompleteToken
                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r1 = r1.toToken()
                    r0.register(r1)
                    return
            }

            @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant.RejectingSignatureVisitor, net.bytebuddy.jar.asm.signature.SignatureVisitor
            public void visitInnerClassType(java.lang.String r3) {
                    r2 = this;
                    net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$IncompleteToken$ForInnerClass r0 = new net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$IncompleteToken$ForInnerClass
                    net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$IncompleteToken r1 = r2.incompleteToken
                    r0.<init>(r3, r1)
                    r2.incompleteToken = r0
                    return
            }

            @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant.RejectingSignatureVisitor, net.bytebuddy.jar.asm.signature.SignatureVisitor
            public net.bytebuddy.jar.asm.signature.SignatureVisitor visitTypeArgument(char r4) {
                    r3 = this;
                    r0 = 43
                    if (r4 == r0) goto L31
                    r0 = 45
                    if (r4 == r0) goto L2a
                    r0 = 61
                    if (r4 != r0) goto L13
                    net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$IncompleteToken r4 = r3.incompleteToken
                    net.bytebuddy.jar.asm.signature.SignatureVisitor r4 = r4.appendDirectBound()
                    return r4
                L13:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Unknown wildcard: "
                    r1.append(r2)
                    r1.append(r4)
                    java.lang.String r4 = r1.toString()
                    r0.<init>(r4)
                    throw r0
                L2a:
                    net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$IncompleteToken r4 = r3.incompleteToken
                    net.bytebuddy.jar.asm.signature.SignatureVisitor r4 = r4.appendLowerBound()
                    return r4
                L31:
                    net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$IncompleteToken r4 = r3.incompleteToken
                    net.bytebuddy.jar.asm.signature.SignatureVisitor r4 = r4.appendUpperBound()
                    return r4
            }

            @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant.RejectingSignatureVisitor, net.bytebuddy.jar.asm.signature.SignatureVisitor
            public void visitTypeArgument() {
                    r1 = this;
                    net.bytebuddy.pool.TypePool$Default$GenericTypeExtractor$IncompleteToken r0 = r1.incompleteToken
                    r0.appendPlaceholder()
                    return
            }

            @Override // net.bytebuddy.pool.TypePool.Default.GenericTypeRegistrant.RejectingSignatureVisitor, net.bytebuddy.jar.asm.signature.SignatureVisitor
            public void visitTypeVariable(java.lang.String r3) {
                    r2 = this;
                    net.bytebuddy.pool.TypePool$Default$GenericTypeRegistrant r0 = r2.genericTypeRegistrant
                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForTypeVariable r1 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForTypeVariable
                    r1.<init>(r3)
                    r0.register(r1)
                    return
            }
        }

        public interface GenericTypeRegistrant {

            public static class RejectingSignatureVisitor extends net.bytebuddy.jar.asm.signature.SignatureVisitor {
                private static final java.lang.String MESSAGE = "Unexpected token in generic signature";

                public RejectingSignatureVisitor() {
                        r1 = this;
                        int r0 = net.bytebuddy.utility.OpenedClassReader.ASM_API
                        r1.<init>(r0)
                        return
                }

                @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
                public net.bytebuddy.jar.asm.signature.SignatureVisitor visitArrayType() {
                        r2 = this;
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.String r1 = "Unexpected token in generic signature"
                        r0.<init>(r1)
                        throw r0
                }

                @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
                public void visitBaseType(char r2) {
                        r1 = this;
                        java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                        java.lang.String r0 = "Unexpected token in generic signature"
                        r2.<init>(r0)
                        throw r2
                }

                @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
                public net.bytebuddy.jar.asm.signature.SignatureVisitor visitClassBound() {
                        r2 = this;
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.String r1 = "Unexpected token in generic signature"
                        r0.<init>(r1)
                        throw r0
                }

                @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
                public void visitClassType(java.lang.String r2) {
                        r1 = this;
                        java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                        java.lang.String r0 = "Unexpected token in generic signature"
                        r2.<init>(r0)
                        throw r2
                }

                @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
                public void visitEnd() {
                        r2 = this;
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.String r1 = "Unexpected token in generic signature"
                        r0.<init>(r1)
                        throw r0
                }

                @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
                public net.bytebuddy.jar.asm.signature.SignatureVisitor visitExceptionType() {
                        r2 = this;
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.String r1 = "Unexpected token in generic signature"
                        r0.<init>(r1)
                        throw r0
                }

                @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
                public void visitFormalTypeParameter(java.lang.String r2) {
                        r1 = this;
                        java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                        java.lang.String r0 = "Unexpected token in generic signature"
                        r2.<init>(r0)
                        throw r2
                }

                @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
                public void visitInnerClassType(java.lang.String r2) {
                        r1 = this;
                        java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                        java.lang.String r0 = "Unexpected token in generic signature"
                        r2.<init>(r0)
                        throw r2
                }

                @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
                public net.bytebuddy.jar.asm.signature.SignatureVisitor visitInterface() {
                        r2 = this;
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.String r1 = "Unexpected token in generic signature"
                        r0.<init>(r1)
                        throw r0
                }

                @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
                public net.bytebuddy.jar.asm.signature.SignatureVisitor visitInterfaceBound() {
                        r2 = this;
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.String r1 = "Unexpected token in generic signature"
                        r0.<init>(r1)
                        throw r0
                }

                @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
                public net.bytebuddy.jar.asm.signature.SignatureVisitor visitParameterType() {
                        r2 = this;
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.String r1 = "Unexpected token in generic signature"
                        r0.<init>(r1)
                        throw r0
                }

                @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
                public net.bytebuddy.jar.asm.signature.SignatureVisitor visitReturnType() {
                        r2 = this;
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.String r1 = "Unexpected token in generic signature"
                        r0.<init>(r1)
                        throw r0
                }

                @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
                public net.bytebuddy.jar.asm.signature.SignatureVisitor visitSuperclass() {
                        r2 = this;
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.String r1 = "Unexpected token in generic signature"
                        r0.<init>(r1)
                        throw r0
                }

                @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
                public net.bytebuddy.jar.asm.signature.SignatureVisitor visitTypeArgument(char r2) {
                        r1 = this;
                        java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                        java.lang.String r0 = "Unexpected token in generic signature"
                        r2.<init>(r0)
                        throw r2
                }

                @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
                public void visitTypeArgument() {
                        r2 = this;
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.String r1 = "Unexpected token in generic signature"
                        r0.<init>(r1)
                        throw r0
                }

                @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
                public void visitTypeVariable(java.lang.String r2) {
                        r1 = this;
                        java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                        java.lang.String r0 = "Unexpected token in generic signature"
                        r2.<init>(r0)
                        throw r2
                }
            }

            void register(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken r1);
        }

        public static class LazyTypeDescription extends net.bytebuddy.description.type.TypeDescription.AbstractBase.OfSimpleType {

            @net.bytebuddy.utility.nullability.AlwaysNull
            private static final java.lang.String NO_TYPE = null;
            private final int actualModifiers;
            private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken> annotationTokens;
            private final boolean anonymousType;
            private final net.bytebuddy.ClassFileVersion classFileVersion;
            private final java.util.List<java.lang.String> declaredTypes;

            @net.bytebuddy.utility.nullability.MaybeNull
            private final java.lang.String declaringTypeName;
            private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.FieldToken> fieldTokens;

            @net.bytebuddy.utility.nullability.MaybeNull
            private final java.lang.String genericSignature;
            private final java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> interfaceAnnotationTokens;
            private final java.util.List<java.lang.String> interfaceTypeDescriptors;
            private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.MethodToken> methodTokens;
            private final int modifiers;
            private final java.lang.String name;

            @net.bytebuddy.utility.nullability.MaybeNull
            private final java.lang.String nestHost;
            private final java.util.List<java.lang.String> nestMembers;
            private final java.util.List<java.lang.String> permittedSubclasses;
            private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.RecordComponentToken> recordComponentTokens;
            private final net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForType signatureResolution;
            private final java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> superClassAnnotationTokens;

            @net.bytebuddy.utility.nullability.MaybeNull
            private final java.lang.String superClassDescriptor;
            private final net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment typeContainment;
            private final net.bytebuddy.pool.TypePool typePool;
            private final java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> typeVariableAnnotationTokens;
            private final java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>>> typeVariableBoundsAnnotationTokens;

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class AnnotationToken {
                private final java.lang.String descriptor;
                private final java.util.Map<java.lang.String, net.bytebuddy.description.annotation.AnnotationValue<?, ?>> values;

                public interface Resolution {

                    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                    public static class Illegal implements net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken.Resolution {
                        private final java.lang.String annotationType;

                        public Illegal(java.lang.String r1) {
                                r0 = this;
                                r0.<init>()
                                r0.annotationType = r1
                                return
                        }

                        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                                r4 = this;
                                r0 = 1
                                if (r4 != r5) goto L4
                                return r0
                            L4:
                                r1 = 0
                                if (r5 != 0) goto L8
                                return r1
                            L8:
                                java.lang.Class r2 = r4.getClass()
                                java.lang.Class r3 = r5.getClass()
                                if (r2 == r3) goto L13
                                return r1
                            L13:
                                java.lang.String r2 = r4.annotationType
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken$Resolution$Illegal r5 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken.Resolution.Illegal) r5
                                java.lang.String r5 = r5.annotationType
                                boolean r5 = r2.equals(r5)
                                if (r5 != 0) goto L20
                                return r1
                            L20:
                                return r0
                        }

                        public int hashCode() {
                                r2 = this;
                                java.lang.Class r0 = r2.getClass()
                                int r0 = r0.hashCode()
                                int r0 = r0 * 31
                                java.lang.String r1 = r2.annotationType
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                                return r0
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken.Resolution
                        public boolean isResolved() {
                                r1 = this;
                                r0 = 0
                                return r0
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken.Resolution
                        public net.bytebuddy.description.annotation.AnnotationDescription resolve() {
                                r3 = this;
                                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                                r1.<init>()
                                java.lang.String r2 = "Annotation type is not available: "
                                r1.append(r2)
                                java.lang.String r2 = r3.annotationType
                                r1.append(r2)
                                java.lang.String r1 = r1.toString()
                                r0.<init>(r1)
                                throw r0
                        }
                    }

                    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                    public static class Simple implements net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken.Resolution {
                        private final net.bytebuddy.description.annotation.AnnotationDescription annotationDescription;

                        public Simple(net.bytebuddy.description.annotation.AnnotationDescription r1) {
                                r0 = this;
                                r0.<init>()
                                r0.annotationDescription = r1
                                return
                        }

                        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                                r4 = this;
                                r0 = 1
                                if (r4 != r5) goto L4
                                return r0
                            L4:
                                r1 = 0
                                if (r5 != 0) goto L8
                                return r1
                            L8:
                                java.lang.Class r2 = r4.getClass()
                                java.lang.Class r3 = r5.getClass()
                                if (r2 == r3) goto L13
                                return r1
                            L13:
                                net.bytebuddy.description.annotation.AnnotationDescription r2 = r4.annotationDescription
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken$Resolution$Simple r5 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken.Resolution.Simple) r5
                                net.bytebuddy.description.annotation.AnnotationDescription r5 = r5.annotationDescription
                                boolean r5 = r2.equals(r5)
                                if (r5 != 0) goto L20
                                return r1
                            L20:
                                return r0
                        }

                        public int hashCode() {
                                r2 = this;
                                java.lang.Class r0 = r2.getClass()
                                int r0 = r0.hashCode()
                                int r0 = r0 * 31
                                net.bytebuddy.description.annotation.AnnotationDescription r1 = r2.annotationDescription
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                                return r0
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken.Resolution
                        public boolean isResolved() {
                                r1 = this;
                                r0 = 1
                                return r0
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken.Resolution
                        public net.bytebuddy.description.annotation.AnnotationDescription resolve() {
                                r1 = this;
                                net.bytebuddy.description.annotation.AnnotationDescription r0 = r1.annotationDescription
                                return r0
                        }
                    }

                    boolean isResolved();

                    net.bytebuddy.description.annotation.AnnotationDescription resolve();
                }

                public AnnotationToken(java.lang.String r1, java.util.Map<java.lang.String, net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r2) {
                        r0 = this;
                        r0.<init>()
                        r0.descriptor = r1
                        r0.values = r2
                        return
                }

                public static /* synthetic */ net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken.Resolution access$2000(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken r0, net.bytebuddy.pool.TypePool r1) {
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken$Resolution r0 = r0.toAnnotationDescription(r1)
                        return r0
                }

                private net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken.Resolution toAnnotationDescription(net.bytebuddy.pool.TypePool r6) {
                        r5 = this;
                        java.lang.String r0 = r5.getBinaryName()
                        net.bytebuddy.pool.TypePool$Resolution r0 = r6.describe(r0)
                        boolean r1 = r0.isResolved()
                        if (r1 == 0) goto L20
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken$Resolution$Simple r1 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken$Resolution$Simple
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyAnnotationDescription r2 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyAnnotationDescription
                        net.bytebuddy.description.type.TypeDescription r0 = r0.resolve()
                        java.util.Map<java.lang.String, net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r3 = r5.values
                        r4 = 0
                        r2.<init>(r6, r0, r3, r4)
                        r1.<init>(r2)
                        goto L29
                    L20:
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken$Resolution$Illegal r1 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken$Resolution$Illegal
                        java.lang.String r6 = r5.getBinaryName()
                        r1.<init>(r6)
                    L29:
                        return r1
                }

                public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                        r4 = this;
                        r0 = 1
                        if (r4 != r5) goto L4
                        return r0
                    L4:
                        r1 = 0
                        if (r5 != 0) goto L8
                        return r1
                    L8:
                        java.lang.Class r2 = r4.getClass()
                        java.lang.Class r3 = r5.getClass()
                        if (r2 == r3) goto L13
                        return r1
                    L13:
                        java.lang.String r2 = r4.descriptor
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken r5 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken) r5
                        java.lang.String r3 = r5.descriptor
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        java.util.Map<java.lang.String, net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r2 = r4.values
                        java.util.Map<java.lang.String, net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r5 = r5.values
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L2b
                        return r1
                    L2b:
                        return r0
                }

                public java.lang.String getBinaryName() {
                        r3 = this;
                        java.lang.String r0 = r3.descriptor
                        int r1 = r0.length()
                        r2 = 1
                        int r1 = r1 - r2
                        java.lang.String r0 = r0.substring(r2, r1)
                        r1 = 47
                        r2 = 46
                        java.lang.String r0 = r0.replace(r1, r2)
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        java.lang.String r1 = r2.descriptor
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.util.Map<java.lang.String, net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r1 = r2.values
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class FieldToken {
                private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken> annotationTokens;
                private final java.lang.String descriptor;

                @net.bytebuddy.utility.nullability.UnknownNull
                private final java.lang.String genericSignature;
                private final int modifiers;
                private final java.lang.String name;
                private final net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForField signatureResolution;
                private final java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> typeAnnotationTokens;

                public FieldToken(java.lang.String r2, int r3, java.lang.String r4, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r5, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r6, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken> r7) {
                        r1 = this;
                        r1.<init>()
                        r0 = -131073(0xfffffffffffdffff, float:NaN)
                        r3 = r3 & r0
                        r1.modifiers = r3
                        r1.name = r2
                        r1.descriptor = r4
                        r1.genericSignature = r5
                        boolean r2 = net.bytebuddy.description.type.TypeDescription.AbstractBase.RAW_TYPES
                        if (r2 == 0) goto L16
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Raw r2 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Raw.INSTANCE
                        goto L1a
                    L16:
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForField r2 = net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature.OfField.extract(r5)
                    L1a:
                        r1.signatureResolution = r2
                        r1.typeAnnotationTokens = r6
                        r1.annotationTokens = r7
                        return
                }

                public static /* synthetic */ net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyFieldDescription access$1000(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.FieldToken r0, net.bytebuddy.pool.TypePool.Default.LazyTypeDescription r1) {
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyFieldDescription r0 = r0.toFieldDescription(r1)
                        return r0
                }

                private net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyFieldDescription toFieldDescription(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription r12) {
                        r11 = this;
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyFieldDescription r10 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyFieldDescription
                        r12.getClass()
                        java.lang.String r2 = r11.name
                        int r3 = r11.modifiers
                        java.lang.String r4 = r11.descriptor
                        java.lang.String r5 = r11.genericSignature
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForField r6 = r11.signatureResolution
                        java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r7 = r11.typeAnnotationTokens
                        java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken> r8 = r11.annotationTokens
                        r9 = 0
                        r0 = r10
                        r1 = r12
                        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                        return r10
                }

                public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                        r4 = this;
                        r0 = 1
                        if (r4 != r5) goto L4
                        return r0
                    L4:
                        r1 = 0
                        if (r5 != 0) goto L8
                        return r1
                    L8:
                        java.lang.Class r2 = r4.getClass()
                        java.lang.Class r3 = r5.getClass()
                        if (r2 == r3) goto L13
                        return r1
                    L13:
                        int r2 = r4.modifiers
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$FieldToken r5 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.FieldToken) r5
                        int r3 = r5.modifiers
                        if (r2 == r3) goto L1c
                        return r1
                    L1c:
                        java.lang.String r2 = r4.name
                        java.lang.String r3 = r5.name
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L27
                        return r1
                    L27:
                        java.lang.String r2 = r4.descriptor
                        java.lang.String r3 = r5.descriptor
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L32
                        return r1
                    L32:
                        java.lang.String r2 = r4.genericSignature
                        java.lang.String r3 = r5.genericSignature
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L3d
                        return r1
                    L3d:
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForField r2 = r4.signatureResolution
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForField r3 = r5.signatureResolution
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L48
                        return r1
                    L48:
                        java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r2 = r4.typeAnnotationTokens
                        java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r3 = r5.typeAnnotationTokens
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L53
                        return r1
                    L53:
                        java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken> r2 = r4.annotationTokens
                        java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken> r5 = r5.annotationTokens
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L5e
                        return r1
                    L5e:
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        java.lang.String r1 = r2.name
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        int r1 = r2.modifiers
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.lang.String r1 = r2.descriptor
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.lang.String r1 = r2.genericSignature
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForField r1 = r2.signatureResolution
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r1 = r2.typeAnnotationTokens
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken> r1 = r2.annotationTokens
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }
            }

            public class FieldTokenList extends net.bytebuddy.description.field.FieldList.AbstractBase<net.bytebuddy.description.field.FieldDescription.InDefinedShape> {
                final /* synthetic */ net.bytebuddy.pool.TypePool.Default.LazyTypeDescription this$0;

                public FieldTokenList(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription r1) {
                        r0 = this;
                        r0.this$0 = r1
                        r0.<init>()
                        return
                }

                @Override // java.util.AbstractList, java.util.List
                public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                        r0 = this;
                        net.bytebuddy.description.field.FieldDescription$InDefinedShape r1 = r0.get(r1)
                        return r1
                }

                @Override // java.util.AbstractList, java.util.List
                public net.bytebuddy.description.field.FieldDescription.InDefinedShape get(int r2) {
                        r1 = this;
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription r0 = r1.this$0
                        java.util.List r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.access$900(r0)
                        java.lang.Object r2 = r0.get(r2)
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$FieldToken r2 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.FieldToken) r2
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription r0 = r1.this$0
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyFieldDescription r2 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.FieldToken.access$1000(r2, r0)
                        return r2
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                        r1 = this;
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription r0 = r1.this$0
                        java.util.List r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.access$900(r0)
                        int r0 = r0.size()
                        return r0
                }
            }

            public interface GenericTypeToken {
                public static final char COMPONENT_TYPE_PATH = '[';
                public static final java.lang.String EMPTY_TYPE_PATH = "";
                public static final char INDEXED_TYPE_DELIMITER = ';';
                public static final char INNER_CLASS_PATH = '.';
                public static final char WILDCARD_TYPE_PATH = '*';

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class ForGenericArray implements net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken {
                    private final net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken componentTypeToken;

                    public static class LazyGenericArray extends net.bytebuddy.description.type.TypeDescription.Generic.OfGenericArray {
                        private final java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> annotationTokens;
                        private final net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken componentTypeToken;
                        private final java.lang.String typePath;
                        private final net.bytebuddy.pool.TypePool typePool;
                        private final net.bytebuddy.description.TypeVariableSource typeVariableSource;

                        public LazyGenericArray(net.bytebuddy.pool.TypePool r1, net.bytebuddy.description.TypeVariableSource r2, java.lang.String r3, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r4, net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken r5) {
                                r0 = this;
                                r0.<init>()
                                r0.typePool = r1
                                r0.typeVariableSource = r2
                                r0.typePath = r3
                                r0.annotationTokens = r4
                                r0.componentTypeToken = r5
                                return
                        }

                        @Override // net.bytebuddy.description.type.TypeDefinition
                        public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getComponentType() {
                                r1 = this;
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.getComponentType()
                                return r0
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
                        public net.bytebuddy.description.type.TypeDescription.Generic getComponentType() {
                                r5 = this;
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r0 = r5.componentTypeToken
                                net.bytebuddy.pool.TypePool r1 = r5.typePool
                                net.bytebuddy.description.TypeVariableSource r2 = r5.typeVariableSource
                                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                                r3.<init>()
                                java.lang.String r4 = r5.typePath
                                r3.append(r4)
                                r4 = 91
                                r3.append(r4)
                                java.lang.String r3 = r3.toString()
                                java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r4 = r5.annotationTokens
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.toGenericType(r1, r2, r3, r4)
                                return r0
                        }

                        @Override // net.bytebuddy.description.annotation.AnnotationSource
                        public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                                r3 = this;
                                net.bytebuddy.pool.TypePool r0 = r3.typePool
                                java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r1 = r3.annotationTokens
                                java.lang.String r2 = r3.typePath
                                java.lang.Object r1 = r1.get(r2)
                                java.util.List r1 = (java.util.List) r1
                                net.bytebuddy.description.annotation.AnnotationList r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyAnnotationDescription.asListOfNullable(r0, r1)
                                return r0
                        }
                    }

                    public ForGenericArray(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken r1) {
                            r0 = this;
                            r0.<init>()
                            r0.componentTypeToken = r1
                            return
                    }

                    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                            r4 = this;
                            r0 = 1
                            if (r4 != r5) goto L4
                            return r0
                        L4:
                            r1 = 0
                            if (r5 != 0) goto L8
                            return r1
                        L8:
                            java.lang.Class r2 = r4.getClass()
                            java.lang.Class r3 = r5.getClass()
                            if (r2 == r3) goto L13
                            return r1
                        L13:
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r2 = r4.componentTypeToken
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForGenericArray r5 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForGenericArray) r5
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r5 = r5.componentTypeToken
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L20
                            return r1
                        L20:
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public java.lang.String getTypePathPrefix() {
                            r3 = this;
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            r1.<init>()
                            java.lang.String r2 = "A generic array type cannot be the owner of a nested type: "
                            r1.append(r2)
                            r1.append(r3)
                            java.lang.String r1 = r1.toString()
                            r0.<init>(r1)
                            throw r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r1 = r2.componentTypeToken
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public boolean isPrimaryBound(net.bytebuddy.pool.TypePool r3) {
                            r2 = this;
                            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r0 = new java.lang.StringBuilder
                            r0.<init>()
                            java.lang.String r1 = "A generic array type cannot be a type variable bound: "
                            r0.append(r1)
                            r0.append(r2)
                            java.lang.String r0 = r0.toString()
                            r3.<init>(r0)
                            throw r3
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public net.bytebuddy.description.type.TypeDescription.Generic toGenericType(net.bytebuddy.pool.TypePool r8, net.bytebuddy.description.TypeVariableSource r9, java.lang.String r10, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r11) {
                            r7 = this;
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForGenericArray$LazyGenericArray r6 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForGenericArray$LazyGenericArray
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r5 = r7.componentTypeToken
                            r0 = r6
                            r1 = r8
                            r2 = r9
                            r3 = r10
                            r4 = r11
                            r0.<init>(r1, r2, r3, r4, r5)
                            return r6
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class ForLowerBoundWildcard implements net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken {
                    private final net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken boundTypeToken;

                    public static class LazyLowerBoundWildcard extends net.bytebuddy.description.type.TypeDescription.Generic.OfWildcardType {
                        private final java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> annotationTokens;
                        private final net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken boundTypeToken;
                        private final java.lang.String typePath;
                        private final net.bytebuddy.pool.TypePool typePool;
                        private final net.bytebuddy.description.TypeVariableSource typeVariableSource;

                        public LazyLowerBoundWildcard(net.bytebuddy.pool.TypePool r1, net.bytebuddy.description.TypeVariableSource r2, java.lang.String r3, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r4, net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken r5) {
                                r0 = this;
                                r0.<init>()
                                r0.typePool = r1
                                r0.typeVariableSource = r2
                                r0.typePath = r3
                                r0.annotationTokens = r4
                                r0.boundTypeToken = r5
                                return
                        }

                        @Override // net.bytebuddy.description.annotation.AnnotationSource
                        public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                                r3 = this;
                                net.bytebuddy.pool.TypePool r0 = r3.typePool
                                java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r1 = r3.annotationTokens
                                java.lang.String r2 = r3.typePath
                                java.lang.Object r1 = r1.get(r2)
                                java.util.List r1 = (java.util.List) r1
                                net.bytebuddy.description.annotation.AnnotationList r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyAnnotationDescription.asListOfNullable(r0, r1)
                                return r0
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic
                        public net.bytebuddy.description.type.TypeList.Generic getLowerBounds() {
                                r7 = this;
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$LazyTokenList$ForWildcardBound r6 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$LazyTokenList$ForWildcardBound
                                net.bytebuddy.pool.TypePool r1 = r7.typePool
                                net.bytebuddy.description.TypeVariableSource r2 = r7.typeVariableSource
                                java.lang.String r3 = r7.typePath
                                java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r4 = r7.annotationTokens
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r5 = r7.boundTypeToken
                                r0 = r6
                                r0.<init>(r1, r2, r3, r4, r5)
                                return r6
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic
                        public net.bytebuddy.description.type.TypeList.Generic getUpperBounds() {
                                r4 = this;
                                net.bytebuddy.description.type.TypeList$Generic$Explicit r0 = new net.bytebuddy.description.type.TypeList$Generic$Explicit
                                java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                                net.bytebuddy.description.type.TypeDescription$Generic r1 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r1)
                                r2 = 1
                                net.bytebuddy.description.type.TypeDefinition[] r2 = new net.bytebuddy.description.type.TypeDefinition[r2]
                                r3 = 0
                                r2[r3] = r1
                                r0.<init>(r2)
                                return r0
                        }
                    }

                    public ForLowerBoundWildcard(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken r1) {
                            r0 = this;
                            r0.<init>()
                            r0.boundTypeToken = r1
                            return
                    }

                    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                            r4 = this;
                            r0 = 1
                            if (r4 != r5) goto L4
                            return r0
                        L4:
                            r1 = 0
                            if (r5 != 0) goto L8
                            return r1
                        L8:
                            java.lang.Class r2 = r4.getClass()
                            java.lang.Class r3 = r5.getClass()
                            if (r2 == r3) goto L13
                            return r1
                        L13:
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r2 = r4.boundTypeToken
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForLowerBoundWildcard r5 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForLowerBoundWildcard) r5
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r5 = r5.boundTypeToken
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L20
                            return r1
                        L20:
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public java.lang.String getTypePathPrefix() {
                            r3 = this;
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            r1.<init>()
                            java.lang.String r2 = "A lower bound wildcard cannot be the owner of a nested type: "
                            r1.append(r2)
                            r1.append(r3)
                            java.lang.String r1 = r1.toString()
                            r0.<init>(r1)
                            throw r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r1 = r2.boundTypeToken
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public boolean isPrimaryBound(net.bytebuddy.pool.TypePool r3) {
                            r2 = this;
                            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r0 = new java.lang.StringBuilder
                            r0.<init>()
                            java.lang.String r1 = "A wildcard type cannot be a type variable bound: "
                            r0.append(r1)
                            r0.append(r2)
                            java.lang.String r0 = r0.toString()
                            r3.<init>(r0)
                            throw r3
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public net.bytebuddy.description.type.TypeDescription.Generic toGenericType(net.bytebuddy.pool.TypePool r8, net.bytebuddy.description.TypeVariableSource r9, java.lang.String r10, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r11) {
                            r7 = this;
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForLowerBoundWildcard$LazyLowerBoundWildcard r6 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForLowerBoundWildcard$LazyLowerBoundWildcard
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r5 = r7.boundTypeToken
                            r0 = r6
                            r1 = r8
                            r2 = r9
                            r3 = r10
                            r4 = r11
                            r0.<init>(r1, r2, r3, r4, r5)
                            return r6
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class ForParameterizedType implements net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken {
                    private final java.lang.String name;
                    private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken> parameterTypeTokens;

                    public static class LazyParameterizedType extends net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType {
                        private final java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> annotationTokens;
                        private final java.lang.String name;
                        private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken> parameterTypeTokens;
                        private final java.lang.String typePath;
                        private final net.bytebuddy.pool.TypePool typePool;
                        private final net.bytebuddy.description.TypeVariableSource typeVariableSource;

                        public LazyParameterizedType(net.bytebuddy.pool.TypePool r1, net.bytebuddy.description.TypeVariableSource r2, java.lang.String r3, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r4, java.lang.String r5, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken> r6) {
                                r0 = this;
                                r0.<init>()
                                r0.typePool = r1
                                r0.typeVariableSource = r2
                                r0.typePath = r3
                                r0.annotationTokens = r4
                                r0.name = r5
                                r0.parameterTypeTokens = r6
                                return
                        }

                        @Override // net.bytebuddy.description.type.TypeDefinition
                        public net.bytebuddy.description.type.TypeDescription asErasure() {
                                r2 = this;
                                net.bytebuddy.pool.TypePool r0 = r2.typePool
                                java.lang.String r1 = r2.name
                                net.bytebuddy.pool.TypePool$Resolution r0 = r0.describe(r1)
                                net.bytebuddy.description.type.TypeDescription r0 = r0.resolve()
                                return r0
                        }

                        @Override // net.bytebuddy.description.annotation.AnnotationSource
                        public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                                r3 = this;
                                net.bytebuddy.pool.TypePool r0 = r3.typePool
                                java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r1 = r3.annotationTokens
                                java.lang.String r2 = r3.typePath
                                java.lang.Object r1 = r1.get(r2)
                                java.util.List r1 = (java.util.List) r1
                                net.bytebuddy.description.annotation.AnnotationList r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyAnnotationDescription.asListOfNullable(r0, r1)
                                return r0
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic
                        @net.bytebuddy.utility.nullability.MaybeNull
                        public net.bytebuddy.description.type.TypeDescription.Generic getOwnerType() {
                                r2 = this;
                                net.bytebuddy.pool.TypePool r0 = r2.typePool
                                java.lang.String r1 = r2.name
                                net.bytebuddy.pool.TypePool$Resolution r0 = r0.describe(r1)
                                net.bytebuddy.description.type.TypeDescription r0 = r0.resolve()
                                net.bytebuddy.description.type.TypeDescription r0 = r0.getEnclosingType()
                                if (r0 != 0) goto L15
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                                goto L19
                            L15:
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.asGenericType()
                            L19:
                                return r0
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic
                        public net.bytebuddy.description.type.TypeList.Generic getTypeArguments() {
                                r7 = this;
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$LazyTokenList r6 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$LazyTokenList
                                net.bytebuddy.pool.TypePool r1 = r7.typePool
                                net.bytebuddy.description.TypeVariableSource r2 = r7.typeVariableSource
                                java.lang.String r3 = r7.typePath
                                java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r4 = r7.annotationTokens
                                java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r5 = r7.parameterTypeTokens
                                r0 = r6
                                r0.<init>(r1, r2, r3, r4, r5)
                                return r6
                        }
                    }

                    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                    public static class Nested implements net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken {
                        private final java.lang.String name;
                        private final net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken ownerTypeToken;
                        private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken> parameterTypeTokens;

                        public static class LazyParameterizedType extends net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType {
                            private final java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> annotationTokens;
                            private final java.lang.String name;
                            private final net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken ownerTypeToken;
                            private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken> parameterTypeTokens;
                            private final java.lang.String typePath;
                            private final net.bytebuddy.pool.TypePool typePool;
                            private final net.bytebuddy.description.TypeVariableSource typeVariableSource;

                            public LazyParameterizedType(net.bytebuddy.pool.TypePool r1, net.bytebuddy.description.TypeVariableSource r2, java.lang.String r3, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r4, java.lang.String r5, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken> r6, net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken r7) {
                                    r0 = this;
                                    r0.<init>()
                                    r0.typePool = r1
                                    r0.typeVariableSource = r2
                                    r0.typePath = r3
                                    r0.annotationTokens = r4
                                    r0.name = r5
                                    r0.parameterTypeTokens = r6
                                    r0.ownerTypeToken = r7
                                    return
                            }

                            @Override // net.bytebuddy.description.type.TypeDefinition
                            public net.bytebuddy.description.type.TypeDescription asErasure() {
                                    r2 = this;
                                    net.bytebuddy.pool.TypePool r0 = r2.typePool
                                    java.lang.String r1 = r2.name
                                    net.bytebuddy.pool.TypePool$Resolution r0 = r0.describe(r1)
                                    net.bytebuddy.description.type.TypeDescription r0 = r0.resolve()
                                    return r0
                            }

                            @Override // net.bytebuddy.description.annotation.AnnotationSource
                            public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                                    r4 = this;
                                    net.bytebuddy.pool.TypePool r0 = r4.typePool
                                    java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r1 = r4.annotationTokens
                                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                                    r2.<init>()
                                    java.lang.String r3 = r4.typePath
                                    r2.append(r3)
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r3 = r4.ownerTypeToken
                                    java.lang.String r3 = r3.getTypePathPrefix()
                                    r2.append(r3)
                                    java.lang.String r2 = r2.toString()
                                    java.lang.Object r1 = r1.get(r2)
                                    java.util.List r1 = (java.util.List) r1
                                    net.bytebuddy.description.annotation.AnnotationList r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyAnnotationDescription.asListOfNullable(r0, r1)
                                    return r0
                            }

                            @Override // net.bytebuddy.description.type.TypeDescription.Generic
                            @net.bytebuddy.utility.nullability.MaybeNull
                            public net.bytebuddy.description.type.TypeDescription.Generic getOwnerType() {
                                    r5 = this;
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r0 = r5.ownerTypeToken
                                    net.bytebuddy.pool.TypePool r1 = r5.typePool
                                    net.bytebuddy.description.TypeVariableSource r2 = r5.typeVariableSource
                                    java.lang.String r3 = r5.typePath
                                    java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r4 = r5.annotationTokens
                                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.toGenericType(r1, r2, r3, r4)
                                    return r0
                            }

                            @Override // net.bytebuddy.description.type.TypeDescription.Generic
                            public net.bytebuddy.description.type.TypeList.Generic getTypeArguments() {
                                    r7 = this;
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$LazyTokenList r6 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$LazyTokenList
                                    net.bytebuddy.pool.TypePool r1 = r7.typePool
                                    net.bytebuddy.description.TypeVariableSource r2 = r7.typeVariableSource
                                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                    r0.<init>()
                                    java.lang.String r3 = r7.typePath
                                    r0.append(r3)
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r3 = r7.ownerTypeToken
                                    java.lang.String r3 = r3.getTypePathPrefix()
                                    r0.append(r3)
                                    java.lang.String r3 = r0.toString()
                                    java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r4 = r7.annotationTokens
                                    java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r5 = r7.parameterTypeTokens
                                    r0 = r6
                                    r0.<init>(r1, r2, r3, r4, r5)
                                    return r6
                            }
                        }

                        public Nested(java.lang.String r1, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken> r2, net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken r3) {
                                r0 = this;
                                r0.<init>()
                                r0.name = r1
                                r0.parameterTypeTokens = r2
                                r0.ownerTypeToken = r3
                                return
                        }

                        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                                r4 = this;
                                r0 = 1
                                if (r4 != r5) goto L4
                                return r0
                            L4:
                                r1 = 0
                                if (r5 != 0) goto L8
                                return r1
                            L8:
                                java.lang.Class r2 = r4.getClass()
                                java.lang.Class r3 = r5.getClass()
                                if (r2 == r3) goto L13
                                return r1
                            L13:
                                java.lang.String r2 = r4.name
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForParameterizedType$Nested r5 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForParameterizedType.Nested) r5
                                java.lang.String r3 = r5.name
                                boolean r2 = r2.equals(r3)
                                if (r2 != 0) goto L20
                                return r1
                            L20:
                                java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r2 = r4.parameterTypeTokens
                                java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r3 = r5.parameterTypeTokens
                                boolean r2 = r2.equals(r3)
                                if (r2 != 0) goto L2b
                                return r1
                            L2b:
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r2 = r4.ownerTypeToken
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r5 = r5.ownerTypeToken
                                boolean r5 = r2.equals(r5)
                                if (r5 != 0) goto L36
                                return r1
                            L36:
                                return r0
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                        public java.lang.String getTypePathPrefix() {
                                r2 = this;
                                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                r0.<init>()
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r1 = r2.ownerTypeToken
                                java.lang.String r1 = r1.getTypePathPrefix()
                                r0.append(r1)
                                r1 = 46
                                r0.append(r1)
                                java.lang.String r0 = r0.toString()
                                return r0
                        }

                        public int hashCode() {
                                r2 = this;
                                java.lang.Class r0 = r2.getClass()
                                int r0 = r0.hashCode()
                                int r0 = r0 * 31
                                java.lang.String r1 = r2.name
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                                int r0 = r0 * 31
                                java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r1 = r2.parameterTypeTokens
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                                int r0 = r0 * 31
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r1 = r2.ownerTypeToken
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                                return r0
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                        public boolean isPrimaryBound(net.bytebuddy.pool.TypePool r2) {
                                r1 = this;
                                java.lang.String r0 = r1.name
                                net.bytebuddy.pool.TypePool$Resolution r2 = r2.describe(r0)
                                net.bytebuddy.description.type.TypeDescription r2 = r2.resolve()
                                boolean r2 = r2.isInterface()
                                r2 = r2 ^ 1
                                return r2
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                        public net.bytebuddy.description.type.TypeDescription.Generic toGenericType(net.bytebuddy.pool.TypePool r10, net.bytebuddy.description.TypeVariableSource r11, java.lang.String r12, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r13) {
                                r9 = this;
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForParameterizedType$Nested$LazyParameterizedType r8 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForParameterizedType$Nested$LazyParameterizedType
                                java.lang.String r5 = r9.name
                                java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r6 = r9.parameterTypeTokens
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r7 = r9.ownerTypeToken
                                r0 = r8
                                r1 = r10
                                r2 = r11
                                r3 = r12
                                r4 = r13
                                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                                return r8
                        }
                    }

                    public ForParameterizedType(java.lang.String r1, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken> r2) {
                            r0 = this;
                            r0.<init>()
                            r0.name = r1
                            r0.parameterTypeTokens = r2
                            return
                    }

                    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                            r4 = this;
                            r0 = 1
                            if (r4 != r5) goto L4
                            return r0
                        L4:
                            r1 = 0
                            if (r5 != 0) goto L8
                            return r1
                        L8:
                            java.lang.Class r2 = r4.getClass()
                            java.lang.Class r3 = r5.getClass()
                            if (r2 == r3) goto L13
                            return r1
                        L13:
                            java.lang.String r2 = r4.name
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForParameterizedType r5 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForParameterizedType) r5
                            java.lang.String r3 = r5.name
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L20
                            return r1
                        L20:
                            java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r2 = r4.parameterTypeTokens
                            java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r5 = r5.parameterTypeTokens
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L2b
                            return r1
                        L2b:
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public java.lang.String getTypePathPrefix() {
                            r1 = this;
                            r0 = 46
                            java.lang.String r0 = java.lang.String.valueOf(r0)
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            java.lang.String r1 = r2.name
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r1 = r2.parameterTypeTokens
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public boolean isPrimaryBound(net.bytebuddy.pool.TypePool r2) {
                            r1 = this;
                            java.lang.String r0 = r1.name
                            net.bytebuddy.pool.TypePool$Resolution r2 = r2.describe(r0)
                            net.bytebuddy.description.type.TypeDescription r2 = r2.resolve()
                            boolean r2 = r2.isInterface()
                            r2 = r2 ^ 1
                            return r2
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public net.bytebuddy.description.type.TypeDescription.Generic toGenericType(net.bytebuddy.pool.TypePool r9, net.bytebuddy.description.TypeVariableSource r10, java.lang.String r11, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r12) {
                            r8 = this;
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForParameterizedType$LazyParameterizedType r7 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForParameterizedType$LazyParameterizedType
                            java.lang.String r5 = r8.name
                            java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r6 = r8.parameterTypeTokens
                            r0 = r7
                            r1 = r9
                            r2 = r10
                            r3 = r11
                            r4 = r12
                            r0.<init>(r1, r2, r3, r4, r5, r6)
                            return r7
                    }
                }

                public enum ForPrimitiveType extends java.lang.Enum<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType> implements net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken {
                    private static final /* synthetic */ net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType[] $VALUES = null;
                    public static final net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType BOOLEAN = null;
                    public static final net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType BYTE = null;
                    public static final net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType CHAR = null;
                    public static final net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType DOUBLE = null;
                    public static final net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType FLOAT = null;
                    public static final net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType INTEGER = null;
                    public static final net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType LONG = null;
                    public static final net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType SHORT = null;
                    public static final net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType VOID = null;
                    private final net.bytebuddy.description.type.TypeDescription typeDescription;

                    public static class LazyPrimitiveType extends net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType {
                        private final java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> annotationTokens;
                        private final net.bytebuddy.description.type.TypeDescription typeDescription;
                        private final java.lang.String typePath;
                        private final net.bytebuddy.pool.TypePool typePool;

                        public LazyPrimitiveType(net.bytebuddy.pool.TypePool r1, java.lang.String r2, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r3, net.bytebuddy.description.type.TypeDescription r4) {
                                r0 = this;
                                r0.<init>()
                                r0.typePool = r1
                                r0.typePath = r2
                                r0.annotationTokens = r3
                                r0.typeDescription = r4
                                return
                        }

                        @Override // net.bytebuddy.description.type.TypeDefinition
                        public net.bytebuddy.description.type.TypeDescription asErasure() {
                                r1 = this;
                                net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                                return r0
                        }

                        @Override // net.bytebuddy.description.type.TypeDefinition
                        @net.bytebuddy.utility.nullability.MaybeNull
                        public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getComponentType() {
                                r1 = this;
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.getComponentType()
                                return r0
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
                        @net.bytebuddy.utility.nullability.MaybeNull
                        public net.bytebuddy.description.type.TypeDescription.Generic getComponentType() {
                                r1 = this;
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                                return r0
                        }

                        @Override // net.bytebuddy.description.annotation.AnnotationSource
                        public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                                r3 = this;
                                net.bytebuddy.pool.TypePool r0 = r3.typePool
                                java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r1 = r3.annotationTokens
                                java.lang.String r2 = r3.typePath
                                java.lang.Object r1 = r1.get(r2)
                                java.util.List r1 = (java.util.List) r1
                                net.bytebuddy.description.annotation.AnnotationList r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyAnnotationDescription.asListOfNullable(r0, r1)
                                return r0
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic
                        @net.bytebuddy.utility.nullability.MaybeNull
                        public net.bytebuddy.description.type.TypeDescription.Generic getOwnerType() {
                                r1 = this;
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                                return r0
                        }
                    }

                    static {
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForPrimitiveType r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForPrimitiveType
                            r1 = 0
                            java.lang.Class r2 = java.lang.Boolean.TYPE
                            java.lang.String r3 = "BOOLEAN"
                            r0.<init>(r3, r1, r2)
                            net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType.BOOLEAN = r0
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForPrimitiveType r1 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForPrimitiveType
                            r2 = 1
                            java.lang.Class r3 = java.lang.Byte.TYPE
                            java.lang.String r4 = "BYTE"
                            r1.<init>(r4, r2, r3)
                            net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType.BYTE = r1
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForPrimitiveType r2 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForPrimitiveType
                            r3 = 2
                            java.lang.Class r4 = java.lang.Short.TYPE
                            java.lang.String r5 = "SHORT"
                            r2.<init>(r5, r3, r4)
                            net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType.SHORT = r2
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForPrimitiveType r3 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForPrimitiveType
                            r4 = 3
                            java.lang.Class r5 = java.lang.Character.TYPE
                            java.lang.String r6 = "CHAR"
                            r3.<init>(r6, r4, r5)
                            net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType.CHAR = r3
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForPrimitiveType r4 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForPrimitiveType
                            r5 = 4
                            java.lang.Class r6 = java.lang.Integer.TYPE
                            java.lang.String r7 = "INTEGER"
                            r4.<init>(r7, r5, r6)
                            net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType.INTEGER = r4
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForPrimitiveType r5 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForPrimitiveType
                            r6 = 5
                            java.lang.Class r7 = java.lang.Long.TYPE
                            java.lang.String r8 = "LONG"
                            r5.<init>(r8, r6, r7)
                            net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType.LONG = r5
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForPrimitiveType r6 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForPrimitiveType
                            r7 = 6
                            java.lang.Class r8 = java.lang.Float.TYPE
                            java.lang.String r9 = "FLOAT"
                            r6.<init>(r9, r7, r8)
                            net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType.FLOAT = r6
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForPrimitiveType r7 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForPrimitiveType
                            r8 = 7
                            java.lang.Class r9 = java.lang.Double.TYPE
                            java.lang.String r10 = "DOUBLE"
                            r7.<init>(r10, r8, r9)
                            net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType.DOUBLE = r7
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForPrimitiveType r8 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForPrimitiveType
                            r9 = 8
                            java.lang.Class r10 = java.lang.Void.TYPE
                            java.lang.String r11 = "VOID"
                            r8.<init>(r11, r9, r10)
                            net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType.VOID = r8
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForPrimitiveType[] r0 = new net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
                            net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType.$VALUES = r0
                            return
                    }

                    ForPrimitiveType(java.lang.String r1, int r2, java.lang.Class r3) {
                            r0 = this;
                            r0.<init>(r1, r2)
                            net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r3)
                            r0.typeDescription = r1
                            return
                    }

                    public static net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken of(char r3) {
                            r0 = 70
                            if (r3 == r0) goto L4a
                            r0 = 83
                            if (r3 == r0) goto L47
                            r0 = 86
                            if (r3 == r0) goto L44
                            r0 = 90
                            if (r3 == r0) goto L41
                            r0 = 73
                            if (r3 == r0) goto L3e
                            r0 = 74
                            if (r3 == r0) goto L3b
                            switch(r3) {
                                case 66: goto L38;
                                case 67: goto L35;
                                case 68: goto L32;
                                default: goto L1b;
                            }
                        L1b:
                            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            r1.<init>()
                            java.lang.String r2 = "Not a valid primitive type descriptor: "
                            r1.append(r2)
                            r1.append(r3)
                            java.lang.String r3 = r1.toString()
                            r0.<init>(r3)
                            throw r0
                        L32:
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForPrimitiveType r3 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType.DOUBLE
                            return r3
                        L35:
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForPrimitiveType r3 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType.CHAR
                            return r3
                        L38:
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForPrimitiveType r3 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType.BYTE
                            return r3
                        L3b:
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForPrimitiveType r3 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType.LONG
                            return r3
                        L3e:
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForPrimitiveType r3 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType.INTEGER
                            return r3
                        L41:
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForPrimitiveType r3 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType.BOOLEAN
                            return r3
                        L44:
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForPrimitiveType r3 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType.VOID
                            return r3
                        L47:
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForPrimitiveType r3 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType.SHORT
                            return r3
                        L4a:
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForPrimitiveType r3 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType.FLOAT
                            return r3
                    }

                    public static net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType valueOf(java.lang.String r1) {
                            java.lang.Class<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForPrimitiveType> r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType.class
                            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForPrimitiveType r1 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType) r1
                            return r1
                    }

                    public static net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType[] values() {
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForPrimitiveType[] r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType.$VALUES
                            java.lang.Object r0 = r0.clone()
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForPrimitiveType[] r0 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForPrimitiveType[]) r0
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public java.lang.String getTypePathPrefix() {
                            r3 = this;
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            r1.<init>()
                            java.lang.String r2 = "A primitive type cannot be the owner of a nested type: "
                            r1.append(r2)
                            r1.append(r3)
                            java.lang.String r1 = r1.toString()
                            r0.<init>(r1)
                            throw r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public boolean isPrimaryBound(net.bytebuddy.pool.TypePool r3) {
                            r2 = this;
                            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r0 = new java.lang.StringBuilder
                            r0.<init>()
                            java.lang.String r1 = "A primitive type cannot be a type variable bound: "
                            r0.append(r1)
                            r0.append(r2)
                            java.lang.String r0 = r0.toString()
                            r3.<init>(r0)
                            throw r3
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public net.bytebuddy.description.type.TypeDescription.Generic toGenericType(net.bytebuddy.pool.TypePool r2, net.bytebuddy.description.TypeVariableSource r3, java.lang.String r4, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r5) {
                            r1 = this;
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForPrimitiveType$LazyPrimitiveType r3 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForPrimitiveType$LazyPrimitiveType
                            net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                            r3.<init>(r2, r4, r5, r0)
                            return r3
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class ForRawType implements net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken {
                    private final java.lang.String name;

                    public ForRawType(java.lang.String r1) {
                            r0 = this;
                            r0.<init>()
                            r0.name = r1
                            return
                    }

                    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                            r4 = this;
                            r0 = 1
                            if (r4 != r5) goto L4
                            return r0
                        L4:
                            r1 = 0
                            if (r5 != 0) goto L8
                            return r1
                        L8:
                            java.lang.Class r2 = r4.getClass()
                            java.lang.Class r3 = r5.getClass()
                            if (r2 == r3) goto L13
                            return r1
                        L13:
                            java.lang.String r2 = r4.name
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForRawType r5 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForRawType) r5
                            java.lang.String r5 = r5.name
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L20
                            return r1
                        L20:
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public java.lang.String getTypePathPrefix() {
                            r3 = this;
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            r1.<init>()
                            java.lang.String r2 = "A non-generic type cannot be the owner of a nested type: "
                            r1.append(r2)
                            r1.append(r3)
                            java.lang.String r1 = r1.toString()
                            r0.<init>(r1)
                            throw r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            java.lang.String r1 = r2.name
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public boolean isPrimaryBound(net.bytebuddy.pool.TypePool r2) {
                            r1 = this;
                            java.lang.String r0 = r1.name
                            net.bytebuddy.pool.TypePool$Resolution r2 = r2.describe(r0)
                            net.bytebuddy.description.type.TypeDescription r2 = r2.resolve()
                            boolean r2 = r2.isInterface()
                            r2 = r2 ^ 1
                            return r2
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public net.bytebuddy.description.type.TypeDescription.Generic toGenericType(net.bytebuddy.pool.TypePool r2, net.bytebuddy.description.TypeVariableSource r3, java.lang.String r4, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r5) {
                            r1 = this;
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Raw$RawAnnotatedType r3 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Raw$RawAnnotatedType
                            java.lang.String r0 = r1.name
                            net.bytebuddy.pool.TypePool$Resolution r0 = r2.describe(r0)
                            net.bytebuddy.description.type.TypeDescription r0 = r0.resolve()
                            r3.<init>(r2, r4, r5, r0)
                            return r3
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class ForTypeVariable implements net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken {
                    private final java.lang.String symbol;

                    public static class AnnotatedTypeVariable extends net.bytebuddy.description.type.TypeDescription.Generic.OfTypeVariable {
                        private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken> annotationTokens;
                        private final net.bytebuddy.pool.TypePool typePool;
                        private final net.bytebuddy.description.type.TypeDescription.Generic typeVariable;

                        public AnnotatedTypeVariable(net.bytebuddy.pool.TypePool r1, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken> r2, net.bytebuddy.description.type.TypeDescription.Generic r3) {
                                r0 = this;
                                r0.<init>()
                                r0.typePool = r1
                                r0.annotationTokens = r2
                                r0.typeVariable = r3
                                return
                        }

                        @Override // net.bytebuddy.description.annotation.AnnotationSource
                        public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                                r2 = this;
                                net.bytebuddy.pool.TypePool r0 = r2.typePool
                                java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken> r1 = r2.annotationTokens
                                net.bytebuddy.description.annotation.AnnotationList r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyAnnotationDescription.asListOfNullable(r0, r1)
                                return r0
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic
                        public java.lang.String getSymbol() {
                                r1 = this;
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.typeVariable
                                java.lang.String r0 = r0.getSymbol()
                                return r0
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic
                        public net.bytebuddy.description.TypeVariableSource getTypeVariableSource() {
                                r1 = this;
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.typeVariable
                                net.bytebuddy.description.TypeVariableSource r0 = r0.getTypeVariableSource()
                                return r0
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic
                        public net.bytebuddy.description.type.TypeList.Generic getUpperBounds() {
                                r1 = this;
                                net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.typeVariable
                                net.bytebuddy.description.type.TypeList$Generic r0 = r0.getUpperBounds()
                                return r0
                        }
                    }

                    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                    public static class Formal implements net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.OfFormalTypeVariable {
                        private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken> boundTypeTokens;
                        private final java.lang.String symbol;

                        public static class LazyTypeVariable extends net.bytebuddy.description.type.TypeDescription.Generic.OfTypeVariable {
                            private final java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> annotationTokens;
                            private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken> boundTypeTokens;
                            private final java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> boundaryAnnotationTokens;
                            private final java.lang.String symbol;
                            private final net.bytebuddy.pool.TypePool typePool;
                            private final net.bytebuddy.description.TypeVariableSource typeVariableSource;

                            public static class LazyBoundTokenList extends net.bytebuddy.description.type.TypeList.Generic.AbstractBase {
                                private final java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> annotationTokens;
                                private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken> boundTypeTokens;
                                private final net.bytebuddy.pool.TypePool typePool;
                                private final net.bytebuddy.description.TypeVariableSource typeVariableSource;

                                public LazyBoundTokenList(net.bytebuddy.pool.TypePool r1, net.bytebuddy.description.TypeVariableSource r2, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> r3, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken> r4) {
                                        r0 = this;
                                        r0.<init>()
                                        r0.typePool = r1
                                        r0.typeVariableSource = r2
                                        r0.annotationTokens = r3
                                        r0.boundTypeTokens = r4
                                        return
                                }

                                @Override // java.util.AbstractList, java.util.List
                                public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                                        r0 = this;
                                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.get(r1)
                                        return r1
                                }

                                @Override // java.util.AbstractList, java.util.List
                                public net.bytebuddy.description.type.TypeDescription.Generic get(int r5) {
                                        r4 = this;
                                        java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>> r0 = r4.annotationTokens
                                        java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
                                        boolean r0 = r0.containsKey(r1)
                                        if (r0 != 0) goto L1f
                                        java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>> r0 = r4.annotationTokens
                                        int r1 = r5 + 1
                                        java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                                        boolean r0 = r0.containsKey(r1)
                                        if (r0 != 0) goto L1f
                                        java.util.Map r0 = java.util.Collections.emptyMap()
                                        goto L3d
                                    L1f:
                                        java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>> r0 = r4.annotationTokens
                                        java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r1 = r4.boundTypeTokens
                                        r2 = 0
                                        java.lang.Object r1 = r1.get(r2)
                                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r1 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken) r1
                                        net.bytebuddy.pool.TypePool r2 = r4.typePool
                                        boolean r1 = r1.isPrimaryBound(r2)
                                        r1 = r1 ^ 1
                                        int r1 = r1 + r5
                                        java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                                        java.lang.Object r0 = r0.get(r1)
                                        java.util.Map r0 = (java.util.Map) r0
                                    L3d:
                                        java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r1 = r4.boundTypeTokens
                                        java.lang.Object r5 = r1.get(r5)
                                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r5 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken) r5
                                        net.bytebuddy.pool.TypePool r1 = r4.typePool
                                        net.bytebuddy.description.TypeVariableSource r2 = r4.typeVariableSource
                                        if (r0 != 0) goto L4f
                                        java.util.Map r0 = java.util.Collections.emptyMap()
                                    L4f:
                                        java.lang.String r3 = ""
                                        net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.toGenericType(r1, r2, r3, r0)
                                        return r5
                                }

                                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                                public int size() {
                                        r1 = this;
                                        java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r0 = r1.boundTypeTokens
                                        int r0 = r0.size()
                                        return r0
                                }
                            }

                            public LazyTypeVariable(net.bytebuddy.pool.TypePool r1, net.bytebuddy.description.TypeVariableSource r2, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r3, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> r4, java.lang.String r5, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken> r6) {
                                    r0 = this;
                                    r0.<init>()
                                    r0.typePool = r1
                                    r0.typeVariableSource = r2
                                    r0.annotationTokens = r3
                                    r0.boundaryAnnotationTokens = r4
                                    r0.symbol = r5
                                    r0.boundTypeTokens = r6
                                    return
                            }

                            @Override // net.bytebuddy.description.annotation.AnnotationSource
                            public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                                    r3 = this;
                                    net.bytebuddy.pool.TypePool r0 = r3.typePool
                                    java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r1 = r3.annotationTokens
                                    java.lang.String r2 = ""
                                    java.lang.Object r1 = r1.get(r2)
                                    java.util.List r1 = (java.util.List) r1
                                    net.bytebuddy.description.annotation.AnnotationList r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyAnnotationDescription.asListOfNullable(r0, r1)
                                    return r0
                            }

                            @Override // net.bytebuddy.description.type.TypeDescription.Generic
                            public java.lang.String getSymbol() {
                                    r1 = this;
                                    java.lang.String r0 = r1.symbol
                                    return r0
                            }

                            @Override // net.bytebuddy.description.type.TypeDescription.Generic
                            public net.bytebuddy.description.TypeVariableSource getTypeVariableSource() {
                                    r1 = this;
                                    net.bytebuddy.description.TypeVariableSource r0 = r1.typeVariableSource
                                    return r0
                            }

                            @Override // net.bytebuddy.description.type.TypeDescription.Generic
                            public net.bytebuddy.description.type.TypeList.Generic getUpperBounds() {
                                    r5 = this;
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForTypeVariable$Formal$LazyTypeVariable$LazyBoundTokenList r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForTypeVariable$Formal$LazyTypeVariable$LazyBoundTokenList
                                    net.bytebuddy.pool.TypePool r1 = r5.typePool
                                    net.bytebuddy.description.TypeVariableSource r2 = r5.typeVariableSource
                                    java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>> r3 = r5.boundaryAnnotationTokens
                                    java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r4 = r5.boundTypeTokens
                                    r0.<init>(r1, r2, r3, r4)
                                    return r0
                            }
                        }

                        public Formal(java.lang.String r1, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken> r2) {
                                r0 = this;
                                r0.<init>()
                                r0.symbol = r1
                                r0.boundTypeTokens = r2
                                return
                        }

                        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                                r4 = this;
                                r0 = 1
                                if (r4 != r5) goto L4
                                return r0
                            L4:
                                r1 = 0
                                if (r5 != 0) goto L8
                                return r1
                            L8:
                                java.lang.Class r2 = r4.getClass()
                                java.lang.Class r3 = r5.getClass()
                                if (r2 == r3) goto L13
                                return r1
                            L13:
                                java.lang.String r2 = r4.symbol
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForTypeVariable$Formal r5 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForTypeVariable.Formal) r5
                                java.lang.String r3 = r5.symbol
                                boolean r2 = r2.equals(r3)
                                if (r2 != 0) goto L20
                                return r1
                            L20:
                                java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r2 = r4.boundTypeTokens
                                java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r5 = r5.boundTypeTokens
                                boolean r5 = r2.equals(r5)
                                if (r5 != 0) goto L2b
                                return r1
                            L2b:
                                return r0
                        }

                        public int hashCode() {
                                r2 = this;
                                java.lang.Class r0 = r2.getClass()
                                int r0 = r0.hashCode()
                                int r0 = r0 * 31
                                java.lang.String r1 = r2.symbol
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                                int r0 = r0 * 31
                                java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r1 = r2.boundTypeTokens
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                                return r0
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.OfFormalTypeVariable
                        public net.bytebuddy.description.type.TypeDescription.Generic toGenericType(net.bytebuddy.pool.TypePool r9, net.bytebuddy.description.TypeVariableSource r10, @net.bytebuddy.utility.nullability.MaybeNull java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r11, @net.bytebuddy.utility.nullability.MaybeNull java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> r12) {
                                r8 = this;
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForTypeVariable$Formal$LazyTypeVariable r7 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForTypeVariable$Formal$LazyTypeVariable
                                if (r11 != 0) goto L8
                                java.util.Map r11 = java.util.Collections.emptyMap()
                            L8:
                                r3 = r11
                                if (r12 != 0) goto Lf
                                java.util.Map r12 = java.util.Collections.emptyMap()
                            Lf:
                                r4 = r12
                                java.lang.String r5 = r8.symbol
                                java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r6 = r8.boundTypeTokens
                                r0 = r7
                                r1 = r9
                                r2 = r10
                                r0.<init>(r1, r2, r3, r4, r5, r6)
                                return r7
                        }
                    }

                    public static class UnresolvedTypeVariable extends net.bytebuddy.description.type.TypeDescription.Generic.OfTypeVariable {
                        private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken> annotationTokens;
                        private final java.lang.String symbol;
                        private final net.bytebuddy.pool.TypePool typePool;
                        private final net.bytebuddy.description.TypeVariableSource typeVariableSource;

                        public UnresolvedTypeVariable(net.bytebuddy.description.TypeVariableSource r1, net.bytebuddy.pool.TypePool r2, java.lang.String r3, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken> r4) {
                                r0 = this;
                                r0.<init>()
                                r0.typeVariableSource = r1
                                r0.typePool = r2
                                r0.symbol = r3
                                r0.annotationTokens = r4
                                return
                        }

                        @Override // net.bytebuddy.description.annotation.AnnotationSource
                        public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                                r2 = this;
                                net.bytebuddy.pool.TypePool r0 = r2.typePool
                                java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken> r1 = r2.annotationTokens
                                net.bytebuddy.description.annotation.AnnotationList r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyAnnotationDescription.asListOfNullable(r0, r1)
                                return r0
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic
                        public java.lang.String getSymbol() {
                                r1 = this;
                                java.lang.String r0 = r1.symbol
                                return r0
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic
                        public net.bytebuddy.description.TypeVariableSource getTypeVariableSource() {
                                r1 = this;
                                net.bytebuddy.description.TypeVariableSource r0 = r1.typeVariableSource
                                return r0
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic
                        public net.bytebuddy.description.type.TypeList.Generic getUpperBounds() {
                                r3 = this;
                                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                                r1.<init>()
                                java.lang.String r2 = "Cannot resolve bounds of unresolved type variable "
                                r1.append(r2)
                                r1.append(r3)
                                java.lang.String r2 = " by "
                                r1.append(r2)
                                net.bytebuddy.description.TypeVariableSource r2 = r3.typeVariableSource
                                r1.append(r2)
                                java.lang.String r1 = r1.toString()
                                r0.<init>(r1)
                                throw r0
                        }
                    }

                    public ForTypeVariable(java.lang.String r1) {
                            r0 = this;
                            r0.<init>()
                            r0.symbol = r1
                            return
                    }

                    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                            r4 = this;
                            r0 = 1
                            if (r4 != r5) goto L4
                            return r0
                        L4:
                            r1 = 0
                            if (r5 != 0) goto L8
                            return r1
                        L8:
                            java.lang.Class r2 = r4.getClass()
                            java.lang.Class r3 = r5.getClass()
                            if (r2 == r3) goto L13
                            return r1
                        L13:
                            java.lang.String r2 = r4.symbol
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForTypeVariable r5 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForTypeVariable) r5
                            java.lang.String r5 = r5.symbol
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L20
                            return r1
                        L20:
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public java.lang.String getTypePathPrefix() {
                            r3 = this;
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            r1.<init>()
                            java.lang.String r2 = "A type variable cannot be the owner of a nested type: "
                            r1.append(r2)
                            r1.append(r3)
                            java.lang.String r1 = r1.toString()
                            r0.<init>(r1)
                            throw r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            java.lang.String r1 = r2.symbol
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public boolean isPrimaryBound(net.bytebuddy.pool.TypePool r1) {
                            r0 = this;
                            r1 = 1
                            return r1
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public net.bytebuddy.description.type.TypeDescription.Generic toGenericType(net.bytebuddy.pool.TypePool r3, net.bytebuddy.description.TypeVariableSource r4, java.lang.String r5, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r6) {
                            r2 = this;
                            java.lang.String r0 = r2.symbol
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = r4.findVariable(r0)
                            if (r0 != 0) goto L16
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForTypeVariable$UnresolvedTypeVariable r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForTypeVariable$UnresolvedTypeVariable
                            java.lang.String r1 = r2.symbol
                            java.lang.Object r5 = r6.get(r5)
                            java.util.List r5 = (java.util.List) r5
                            r0.<init>(r4, r3, r1, r5)
                            goto L22
                        L16:
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForTypeVariable$AnnotatedTypeVariable r4 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForTypeVariable$AnnotatedTypeVariable
                            java.lang.Object r5 = r6.get(r5)
                            java.util.List r5 = (java.util.List) r5
                            r4.<init>(r3, r5, r0)
                            r0 = r4
                        L22:
                            return r0
                    }
                }

                public enum ForUnboundWildcard extends java.lang.Enum<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForUnboundWildcard> implements net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken {
                    private static final /* synthetic */ net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForUnboundWildcard[] $VALUES = null;
                    public static final net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForUnboundWildcard INSTANCE = null;

                    public static class LazyUnboundWildcard extends net.bytebuddy.description.type.TypeDescription.Generic.OfWildcardType {
                        private final java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> annotationTokens;
                        private final java.lang.String typePath;
                        private final net.bytebuddy.pool.TypePool typePool;

                        public LazyUnboundWildcard(net.bytebuddy.pool.TypePool r1, java.lang.String r2, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r3) {
                                r0 = this;
                                r0.<init>()
                                r0.typePool = r1
                                r0.typePath = r2
                                r0.annotationTokens = r3
                                return
                        }

                        @Override // net.bytebuddy.description.annotation.AnnotationSource
                        public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                                r3 = this;
                                net.bytebuddy.pool.TypePool r0 = r3.typePool
                                java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r1 = r3.annotationTokens
                                java.lang.String r2 = r3.typePath
                                java.lang.Object r1 = r1.get(r2)
                                java.util.List r1 = (java.util.List) r1
                                net.bytebuddy.description.annotation.AnnotationList r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyAnnotationDescription.asListOfNullable(r0, r1)
                                return r0
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic
                        public net.bytebuddy.description.type.TypeList.Generic getLowerBounds() {
                                r1 = this;
                                net.bytebuddy.description.type.TypeList$Generic$Empty r0 = new net.bytebuddy.description.type.TypeList$Generic$Empty
                                r0.<init>()
                                return r0
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic
                        public net.bytebuddy.description.type.TypeList.Generic getUpperBounds() {
                                r4 = this;
                                net.bytebuddy.description.type.TypeList$Generic$Explicit r0 = new net.bytebuddy.description.type.TypeList$Generic$Explicit
                                java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                                net.bytebuddy.description.type.TypeDescription$Generic r1 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r1)
                                r2 = 1
                                net.bytebuddy.description.type.TypeDefinition[] r2 = new net.bytebuddy.description.type.TypeDefinition[r2]
                                r3 = 0
                                r2[r3] = r1
                                r0.<init>(r2)
                                return r0
                        }
                    }

                    static {
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForUnboundWildcard r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForUnboundWildcard
                            java.lang.String r1 = "INSTANCE"
                            r2 = 0
                            r0.<init>(r1, r2)
                            net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForUnboundWildcard.INSTANCE = r0
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForUnboundWildcard[] r0 = new net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForUnboundWildcard[]{r0}
                            net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForUnboundWildcard.$VALUES = r0
                            return
                    }

                    ForUnboundWildcard(java.lang.String r1, int r2) {
                            r0 = this;
                            r0.<init>(r1, r2)
                            return
                    }

                    public static net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForUnboundWildcard valueOf(java.lang.String r1) {
                            java.lang.Class<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForUnboundWildcard> r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForUnboundWildcard.class
                            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForUnboundWildcard r1 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForUnboundWildcard) r1
                            return r1
                    }

                    public static net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForUnboundWildcard[] values() {
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForUnboundWildcard[] r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForUnboundWildcard.$VALUES
                            java.lang.Object r0 = r0.clone()
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForUnboundWildcard[] r0 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForUnboundWildcard[]) r0
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public java.lang.String getTypePathPrefix() {
                            r3 = this;
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            r1.<init>()
                            java.lang.String r2 = "An unbound wildcard cannot be the owner of a nested type: "
                            r1.append(r2)
                            r1.append(r3)
                            java.lang.String r1 = r1.toString()
                            r0.<init>(r1)
                            throw r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public boolean isPrimaryBound(net.bytebuddy.pool.TypePool r3) {
                            r2 = this;
                            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r0 = new java.lang.StringBuilder
                            r0.<init>()
                            java.lang.String r1 = "A wildcard type cannot be a type variable bound: "
                            r0.append(r1)
                            r0.append(r2)
                            java.lang.String r0 = r0.toString()
                            r3.<init>(r0)
                            throw r3
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public net.bytebuddy.description.type.TypeDescription.Generic toGenericType(net.bytebuddy.pool.TypePool r1, net.bytebuddy.description.TypeVariableSource r2, java.lang.String r3, @net.bytebuddy.utility.nullability.MaybeNull java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r4) {
                            r0 = this;
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForUnboundWildcard$LazyUnboundWildcard r2 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForUnboundWildcard$LazyUnboundWildcard
                            if (r4 != 0) goto L8
                            java.util.Map r4 = java.util.Collections.emptyMap()
                        L8:
                            r2.<init>(r1, r3, r4)
                            return r2
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class ForUpperBoundWildcard implements net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken {
                    private final net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken boundTypeToken;

                    public static class LazyUpperBoundWildcard extends net.bytebuddy.description.type.TypeDescription.Generic.OfWildcardType {
                        private final java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> annotationTokens;
                        private final net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken boundTypeToken;
                        private final java.lang.String typePath;
                        private final net.bytebuddy.pool.TypePool typePool;
                        private final net.bytebuddy.description.TypeVariableSource typeVariableSource;

                        public LazyUpperBoundWildcard(net.bytebuddy.pool.TypePool r1, net.bytebuddy.description.TypeVariableSource r2, java.lang.String r3, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r4, net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken r5) {
                                r0 = this;
                                r0.<init>()
                                r0.typePool = r1
                                r0.typeVariableSource = r2
                                r0.typePath = r3
                                r0.annotationTokens = r4
                                r0.boundTypeToken = r5
                                return
                        }

                        @Override // net.bytebuddy.description.annotation.AnnotationSource
                        public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                                r3 = this;
                                net.bytebuddy.pool.TypePool r0 = r3.typePool
                                java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r1 = r3.annotationTokens
                                java.lang.String r2 = r3.typePath
                                java.lang.Object r1 = r1.get(r2)
                                java.util.List r1 = (java.util.List) r1
                                net.bytebuddy.description.annotation.AnnotationList r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyAnnotationDescription.asListOfNullable(r0, r1)
                                return r0
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic
                        public net.bytebuddy.description.type.TypeList.Generic getLowerBounds() {
                                r1 = this;
                                net.bytebuddy.description.type.TypeList$Generic$Empty r0 = new net.bytebuddy.description.type.TypeList$Generic$Empty
                                r0.<init>()
                                return r0
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic
                        public net.bytebuddy.description.type.TypeList.Generic getUpperBounds() {
                                r7 = this;
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$LazyTokenList$ForWildcardBound r6 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$LazyTokenList$ForWildcardBound
                                net.bytebuddy.pool.TypePool r1 = r7.typePool
                                net.bytebuddy.description.TypeVariableSource r2 = r7.typeVariableSource
                                java.lang.String r3 = r7.typePath
                                java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r4 = r7.annotationTokens
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r5 = r7.boundTypeToken
                                r0 = r6
                                r0.<init>(r1, r2, r3, r4, r5)
                                return r6
                        }
                    }

                    public ForUpperBoundWildcard(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken r1) {
                            r0 = this;
                            r0.<init>()
                            r0.boundTypeToken = r1
                            return
                    }

                    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                            r4 = this;
                            r0 = 1
                            if (r4 != r5) goto L4
                            return r0
                        L4:
                            r1 = 0
                            if (r5 != 0) goto L8
                            return r1
                        L8:
                            java.lang.Class r2 = r4.getClass()
                            java.lang.Class r3 = r5.getClass()
                            if (r2 == r3) goto L13
                            return r1
                        L13:
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r2 = r4.boundTypeToken
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForUpperBoundWildcard r5 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.ForUpperBoundWildcard) r5
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r5 = r5.boundTypeToken
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L20
                            return r1
                        L20:
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public java.lang.String getTypePathPrefix() {
                            r3 = this;
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            r1.<init>()
                            java.lang.String r2 = "An upper bound wildcard cannot be the owner of a nested type: "
                            r1.append(r2)
                            r1.append(r3)
                            java.lang.String r1 = r1.toString()
                            r0.<init>(r1)
                            throw r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r1 = r2.boundTypeToken
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public boolean isPrimaryBound(net.bytebuddy.pool.TypePool r3) {
                            r2 = this;
                            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r0 = new java.lang.StringBuilder
                            r0.<init>()
                            java.lang.String r1 = "A wildcard type cannot be a type variable bound: "
                            r0.append(r1)
                            r0.append(r2)
                            java.lang.String r0 = r0.toString()
                            r3.<init>(r0)
                            throw r3
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public net.bytebuddy.description.type.TypeDescription.Generic toGenericType(net.bytebuddy.pool.TypePool r8, net.bytebuddy.description.TypeVariableSource r9, java.lang.String r10, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r11) {
                            r7 = this;
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForUpperBoundWildcard$LazyUpperBoundWildcard r6 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$ForUpperBoundWildcard$LazyUpperBoundWildcard
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r5 = r7.boundTypeToken
                            r0 = r6
                            r1 = r8
                            r2 = r9
                            r3 = r10
                            r4 = r11
                            r0.<init>(r1, r2, r3, r4, r5)
                            return r6
                    }
                }

                public static class LazyTokenList extends net.bytebuddy.description.type.TypeList.Generic.AbstractBase {
                    private final java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> annotationTokens;
                    private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken> genericTypeTokens;
                    private final java.lang.String typePath;
                    private final net.bytebuddy.pool.TypePool typePool;
                    private final net.bytebuddy.description.TypeVariableSource typeVariableSource;

                    public static class ForWildcardBound extends net.bytebuddy.description.type.TypeList.Generic.AbstractBase {
                        private final java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> annotationTokens;
                        private final net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken genericTypeToken;
                        private final java.lang.String typePath;
                        private final net.bytebuddy.pool.TypePool typePool;
                        private final net.bytebuddy.description.TypeVariableSource typeVariableSource;

                        public ForWildcardBound(net.bytebuddy.pool.TypePool r1, net.bytebuddy.description.TypeVariableSource r2, java.lang.String r3, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r4, net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken r5) {
                                r0 = this;
                                r0.<init>()
                                r0.typePool = r1
                                r0.typeVariableSource = r2
                                r0.typePath = r3
                                r0.annotationTokens = r4
                                r0.genericTypeToken = r5
                                return
                        }

                        @Override // java.util.AbstractList, java.util.List
                        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                                r0 = this;
                                net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.get(r1)
                                return r1
                        }

                        @Override // java.util.AbstractList, java.util.List
                        public net.bytebuddy.description.type.TypeDescription.Generic get(int r5) {
                                r4 = this;
                                if (r5 != 0) goto L22
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r5 = r4.genericTypeToken
                                net.bytebuddy.pool.TypePool r0 = r4.typePool
                                net.bytebuddy.description.TypeVariableSource r1 = r4.typeVariableSource
                                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                                r2.<init>()
                                java.lang.String r3 = r4.typePath
                                r2.append(r3)
                                r3 = 42
                                r2.append(r3)
                                java.lang.String r2 = r2.toString()
                                java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r3 = r4.annotationTokens
                                net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.toGenericType(r0, r1, r2, r3)
                                return r5
                            L22:
                                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                                r1.<init>()
                                java.lang.String r2 = "index = "
                                r1.append(r2)
                                r1.append(r5)
                                java.lang.String r5 = r1.toString()
                                r0.<init>(r5)
                                throw r0
                        }

                        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                        public int size() {
                                r1 = this;
                                r0 = 1
                                return r0
                        }
                    }

                    public LazyTokenList(net.bytebuddy.pool.TypePool r1, net.bytebuddy.description.TypeVariableSource r2, java.lang.String r3, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r4, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken> r5) {
                            r0 = this;
                            r0.<init>()
                            r0.typePool = r1
                            r0.typeVariableSource = r2
                            r0.typePath = r3
                            r0.annotationTokens = r4
                            r0.genericTypeTokens = r5
                            return
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.get(r1)
                            return r1
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public net.bytebuddy.description.type.TypeDescription.Generic get(int r6) {
                            r5 = this;
                            java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r0 = r5.genericTypeTokens
                            java.lang.Object r0 = r0.get(r6)
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r0 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken) r0
                            net.bytebuddy.pool.TypePool r1 = r5.typePool
                            net.bytebuddy.description.TypeVariableSource r2 = r5.typeVariableSource
                            java.lang.StringBuilder r3 = new java.lang.StringBuilder
                            r3.<init>()
                            java.lang.String r4 = r5.typePath
                            r3.append(r4)
                            r3.append(r6)
                            r6 = 59
                            r3.append(r6)
                            java.lang.String r6 = r3.toString()
                            java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r3 = r5.annotationTokens
                            net.bytebuddy.description.type.TypeDescription$Generic r6 = r0.toGenericType(r1, r2, r6, r3)
                            return r6
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public int size() {
                            r1 = this;
                            java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r0 = r1.genericTypeTokens
                            int r0 = r0.size()
                            return r0
                    }
                }

                public interface OfFormalTypeVariable {
                    net.bytebuddy.description.type.TypeDescription.Generic toGenericType(net.bytebuddy.pool.TypePool r1, net.bytebuddy.description.TypeVariableSource r2, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r3, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> r4);
                }

                public interface Resolution {

                    public interface ForField {

                        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                        public static class Tokenized implements net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForField {
                            private final net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken fieldTypeToken;

                            public Tokenized(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken r1) {
                                    r0 = this;
                                    r0.<init>()
                                    r0.fieldTypeToken = r1
                                    return
                            }

                            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                                    r4 = this;
                                    r0 = 1
                                    if (r4 != r5) goto L4
                                    return r0
                                L4:
                                    r1 = 0
                                    if (r5 != 0) goto L8
                                    return r1
                                L8:
                                    java.lang.Class r2 = r4.getClass()
                                    java.lang.Class r3 = r5.getClass()
                                    if (r2 == r3) goto L13
                                    return r1
                                L13:
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r2 = r4.fieldTypeToken
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForField$Tokenized r5 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForField.Tokenized) r5
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r5 = r5.fieldTypeToken
                                    boolean r5 = r2.equals(r5)
                                    if (r5 != 0) goto L20
                                    return r1
                                L20:
                                    return r0
                            }

                            public int hashCode() {
                                    r2 = this;
                                    java.lang.Class r0 = r2.getClass()
                                    int r0 = r0.hashCode()
                                    int r0 = r0 * 31
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r1 = r2.fieldTypeToken
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    return r0
                            }

                            @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForField
                            public net.bytebuddy.description.type.TypeDescription.Generic resolveFieldType(java.lang.String r2, net.bytebuddy.pool.TypePool r3, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r4, net.bytebuddy.description.field.FieldDescription.InDefinedShape r5) {
                                    r1 = this;
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r0 = r1.fieldTypeToken
                                    net.bytebuddy.description.type.TypeDescription r5 = r5.getDeclaringType()
                                    net.bytebuddy.description.type.TypeDescription$Generic r2 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TokenizedGenericType.of(r3, r0, r2, r4, r5)
                                    return r2
                            }
                        }

                        net.bytebuddy.description.type.TypeDescription.Generic resolveFieldType(java.lang.String r1, net.bytebuddy.pool.TypePool r2, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r3, net.bytebuddy.description.field.FieldDescription.InDefinedShape r4);
                    }

                    public interface ForMethod extends net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution {

                        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                        public static class Tokenized implements net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForMethod {
                            private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken> exceptionTypeTokens;
                            private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken> parameterTypeTokens;
                            private final net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken returnTypeToken;
                            private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.OfFormalTypeVariable> typeVariableTokens;

                            public Tokenized(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken r1, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken> r2, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken> r3, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.OfFormalTypeVariable> r4) {
                                    r0 = this;
                                    r0.<init>()
                                    r0.returnTypeToken = r1
                                    r0.parameterTypeTokens = r2
                                    r0.exceptionTypeTokens = r3
                                    r0.typeVariableTokens = r4
                                    return
                            }

                            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                                    r4 = this;
                                    r0 = 1
                                    if (r4 != r5) goto L4
                                    return r0
                                L4:
                                    r1 = 0
                                    if (r5 != 0) goto L8
                                    return r1
                                L8:
                                    java.lang.Class r2 = r4.getClass()
                                    java.lang.Class r3 = r5.getClass()
                                    if (r2 == r3) goto L13
                                    return r1
                                L13:
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r2 = r4.returnTypeToken
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForMethod$Tokenized r5 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForMethod.Tokenized) r5
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r3 = r5.returnTypeToken
                                    boolean r2 = r2.equals(r3)
                                    if (r2 != 0) goto L20
                                    return r1
                                L20:
                                    java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r2 = r4.parameterTypeTokens
                                    java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r3 = r5.parameterTypeTokens
                                    boolean r2 = r2.equals(r3)
                                    if (r2 != 0) goto L2b
                                    return r1
                                L2b:
                                    java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r2 = r4.exceptionTypeTokens
                                    java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r3 = r5.exceptionTypeTokens
                                    boolean r2 = r2.equals(r3)
                                    if (r2 != 0) goto L36
                                    return r1
                                L36:
                                    java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$OfFormalTypeVariable> r2 = r4.typeVariableTokens
                                    java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$OfFormalTypeVariable> r5 = r5.typeVariableTokens
                                    boolean r5 = r2.equals(r5)
                                    if (r5 != 0) goto L41
                                    return r1
                                L41:
                                    return r0
                            }

                            public int hashCode() {
                                    r2 = this;
                                    java.lang.Class r0 = r2.getClass()
                                    int r0 = r0.hashCode()
                                    int r0 = r0 * 31
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r1 = r2.returnTypeToken
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    int r0 = r0 * 31
                                    java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r1 = r2.parameterTypeTokens
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    int r0 = r0 * 31
                                    java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r1 = r2.exceptionTypeTokens
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    int r0 = r0 * 31
                                    java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$OfFormalTypeVariable> r1 = r2.typeVariableTokens
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    return r0
                            }

                            @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForMethod
                            public net.bytebuddy.description.type.TypeList.Generic resolveExceptionTypes(java.util.List<java.lang.String> r9, net.bytebuddy.pool.TypePool r10, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> r11, net.bytebuddy.description.method.MethodDescription.InDefinedShape r12) {
                                    r8 = this;
                                    java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r0 = r8.exceptionTypeTokens
                                    boolean r0 = r0.isEmpty()
                                    if (r0 == 0) goto Lf
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Raw r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Raw.INSTANCE
                                    net.bytebuddy.description.type.TypeList$Generic r9 = r0.resolveExceptionTypes(r9, r10, r11, r12)
                                    goto L1d
                                Lf:
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TokenizedGenericType$TokenList r7 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TokenizedGenericType$TokenList
                                    java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r2 = r8.exceptionTypeTokens
                                    r6 = 0
                                    r0 = r7
                                    r1 = r10
                                    r3 = r11
                                    r4 = r9
                                    r5 = r12
                                    r0.<init>(r1, r2, r3, r4, r5, r6)
                                    r9 = r7
                                L1d:
                                    return r9
                            }

                            @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForMethod
                            public net.bytebuddy.description.type.TypeList.Generic resolveParameterTypes(java.util.List<java.lang.String> r9, net.bytebuddy.pool.TypePool r10, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> r11, net.bytebuddy.description.method.MethodDescription.InDefinedShape r12) {
                                    r8 = this;
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TokenizedGenericType$TokenList r7 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TokenizedGenericType$TokenList
                                    java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r2 = r8.parameterTypeTokens
                                    r6 = 0
                                    r0 = r7
                                    r1 = r10
                                    r3 = r11
                                    r4 = r9
                                    r5 = r12
                                    r0.<init>(r1, r2, r3, r4, r5, r6)
                                    return r7
                            }

                            @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForMethod
                            public net.bytebuddy.description.type.TypeDescription.Generic resolveReturnType(java.lang.String r2, net.bytebuddy.pool.TypePool r3, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r4, net.bytebuddy.description.method.MethodDescription.InDefinedShape r5) {
                                    r1 = this;
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r0 = r1.returnTypeToken
                                    net.bytebuddy.description.type.TypeDescription$Generic r2 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TokenizedGenericType.of(r3, r0, r2, r4, r5)
                                    return r2
                            }

                            @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution
                            public net.bytebuddy.description.type.TypeList.Generic resolveTypeVariables(net.bytebuddy.pool.TypePool r8, net.bytebuddy.description.TypeVariableSource r9, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> r10, java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>>> r11) {
                                    r7 = this;
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TokenizedGenericType$TypeVariableList r6 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TokenizedGenericType$TypeVariableList
                                    java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$OfFormalTypeVariable> r2 = r7.typeVariableTokens
                                    r0 = r6
                                    r1 = r8
                                    r3 = r9
                                    r4 = r10
                                    r5 = r11
                                    r0.<init>(r1, r2, r3, r4, r5)
                                    return r6
                            }
                        }

                        net.bytebuddy.description.type.TypeList.Generic resolveExceptionTypes(java.util.List<java.lang.String> r1, net.bytebuddy.pool.TypePool r2, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> r3, net.bytebuddy.description.method.MethodDescription.InDefinedShape r4);

                        net.bytebuddy.description.type.TypeList.Generic resolveParameterTypes(java.util.List<java.lang.String> r1, net.bytebuddy.pool.TypePool r2, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> r3, net.bytebuddy.description.method.MethodDescription.InDefinedShape r4);

                        net.bytebuddy.description.type.TypeDescription.Generic resolveReturnType(java.lang.String r1, net.bytebuddy.pool.TypePool r2, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r3, net.bytebuddy.description.method.MethodDescription.InDefinedShape r4);
                    }

                    public interface ForRecordComponent {

                        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                        public static class Tokenized implements net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForRecordComponent {
                            private final net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken recordComponentTypeToken;

                            public Tokenized(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken r1) {
                                    r0 = this;
                                    r0.<init>()
                                    r0.recordComponentTypeToken = r1
                                    return
                            }

                            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                                    r4 = this;
                                    r0 = 1
                                    if (r4 != r5) goto L4
                                    return r0
                                L4:
                                    r1 = 0
                                    if (r5 != 0) goto L8
                                    return r1
                                L8:
                                    java.lang.Class r2 = r4.getClass()
                                    java.lang.Class r3 = r5.getClass()
                                    if (r2 == r3) goto L13
                                    return r1
                                L13:
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r2 = r4.recordComponentTypeToken
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForRecordComponent$Tokenized r5 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForRecordComponent.Tokenized) r5
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r5 = r5.recordComponentTypeToken
                                    boolean r5 = r2.equals(r5)
                                    if (r5 != 0) goto L20
                                    return r1
                                L20:
                                    return r0
                            }

                            public int hashCode() {
                                    r2 = this;
                                    java.lang.Class r0 = r2.getClass()
                                    int r0 = r0.hashCode()
                                    int r0 = r0 * 31
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r1 = r2.recordComponentTypeToken
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    return r0
                            }

                            @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForRecordComponent
                            public net.bytebuddy.description.type.TypeDescription.Generic resolveRecordType(java.lang.String r2, net.bytebuddy.pool.TypePool r3, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r4, net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape r5) {
                                    r1 = this;
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r0 = r1.recordComponentTypeToken
                                    net.bytebuddy.description.type.TypeDescription r5 = r5.getDeclaringType()
                                    net.bytebuddy.description.type.TypeDescription$Generic r2 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TokenizedGenericType.of(r3, r0, r2, r4, r5)
                                    return r2
                            }
                        }

                        net.bytebuddy.description.type.TypeDescription.Generic resolveRecordType(java.lang.String r1, net.bytebuddy.pool.TypePool r2, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r3, net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape r4);
                    }

                    public interface ForType extends net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution {

                        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                        public static class Tokenized implements net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForType {
                            private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken> interfaceTypeTokens;
                            private final net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken superClassToken;
                            private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.OfFormalTypeVariable> typeVariableTokens;

                            public Tokenized(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken r1, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken> r2, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.OfFormalTypeVariable> r3) {
                                    r0 = this;
                                    r0.<init>()
                                    r0.superClassToken = r1
                                    r0.interfaceTypeTokens = r2
                                    r0.typeVariableTokens = r3
                                    return
                            }

                            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                                    r4 = this;
                                    r0 = 1
                                    if (r4 != r5) goto L4
                                    return r0
                                L4:
                                    r1 = 0
                                    if (r5 != 0) goto L8
                                    return r1
                                L8:
                                    java.lang.Class r2 = r4.getClass()
                                    java.lang.Class r3 = r5.getClass()
                                    if (r2 == r3) goto L13
                                    return r1
                                L13:
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r2 = r4.superClassToken
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForType$Tokenized r5 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForType.Tokenized) r5
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r3 = r5.superClassToken
                                    boolean r2 = r2.equals(r3)
                                    if (r2 != 0) goto L20
                                    return r1
                                L20:
                                    java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r2 = r4.interfaceTypeTokens
                                    java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r3 = r5.interfaceTypeTokens
                                    boolean r2 = r2.equals(r3)
                                    if (r2 != 0) goto L2b
                                    return r1
                                L2b:
                                    java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$OfFormalTypeVariable> r2 = r4.typeVariableTokens
                                    java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$OfFormalTypeVariable> r5 = r5.typeVariableTokens
                                    boolean r5 = r2.equals(r5)
                                    if (r5 != 0) goto L36
                                    return r1
                                L36:
                                    return r0
                            }

                            public int hashCode() {
                                    r2 = this;
                                    java.lang.Class r0 = r2.getClass()
                                    int r0 = r0.hashCode()
                                    int r0 = r0 * 31
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r1 = r2.superClassToken
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    int r0 = r0 * 31
                                    java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r1 = r2.interfaceTypeTokens
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    int r0 = r0 * 31
                                    java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$OfFormalTypeVariable> r1 = r2.typeVariableTokens
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    return r0
                            }

                            @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForType
                            public net.bytebuddy.description.type.TypeList.Generic resolveInterfaceTypes(java.util.List<java.lang.String> r9, net.bytebuddy.pool.TypePool r10, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> r11, net.bytebuddy.description.type.TypeDescription r12) {
                                    r8 = this;
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TokenizedGenericType$TokenList r7 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TokenizedGenericType$TokenList
                                    java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r2 = r8.interfaceTypeTokens
                                    r6 = 0
                                    r0 = r7
                                    r1 = r10
                                    r3 = r11
                                    r4 = r9
                                    r5 = r12
                                    r0.<init>(r1, r2, r3, r4, r5, r6)
                                    return r7
                            }

                            @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForType
                            public net.bytebuddy.description.type.TypeDescription.Generic resolveSuperClass(java.lang.String r2, net.bytebuddy.pool.TypePool r3, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r4, net.bytebuddy.description.type.TypeDescription r5) {
                                    r1 = this;
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r0 = r1.superClassToken
                                    net.bytebuddy.description.type.TypeDescription$Generic r2 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TokenizedGenericType.of(r3, r0, r2, r4, r5)
                                    return r2
                            }

                            @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution
                            public net.bytebuddy.description.type.TypeList.Generic resolveTypeVariables(net.bytebuddy.pool.TypePool r8, net.bytebuddy.description.TypeVariableSource r9, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> r10, java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>>> r11) {
                                    r7 = this;
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TokenizedGenericType$TypeVariableList r6 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TokenizedGenericType$TypeVariableList
                                    java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$OfFormalTypeVariable> r2 = r7.typeVariableTokens
                                    r0 = r6
                                    r1 = r8
                                    r3 = r9
                                    r4 = r10
                                    r5 = r11
                                    r0.<init>(r1, r2, r3, r4, r5)
                                    return r6
                            }
                        }

                        net.bytebuddy.description.type.TypeList.Generic resolveInterfaceTypes(java.util.List<java.lang.String> r1, net.bytebuddy.pool.TypePool r2, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> r3, net.bytebuddy.description.type.TypeDescription r4);

                        net.bytebuddy.description.type.TypeDescription.Generic resolveSuperClass(java.lang.String r1, net.bytebuddy.pool.TypePool r2, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r3, net.bytebuddy.description.type.TypeDescription r4);
                    }

                    public enum Malformed extends java.lang.Enum<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Malformed> implements net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForType, net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForField, net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForMethod, net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForRecordComponent {
                        private static final /* synthetic */ net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Malformed[] $VALUES = null;
                        public static final net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Malformed INSTANCE = null;

                        static {
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Malformed r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Malformed
                                java.lang.String r1 = "INSTANCE"
                                r2 = 0
                                r0.<init>(r1, r2)
                                net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Malformed.INSTANCE = r0
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Malformed[] r0 = new net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Malformed[]{r0}
                                net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Malformed.$VALUES = r0
                                return
                        }

                        Malformed(java.lang.String r1, int r2) {
                                r0 = this;
                                r0.<init>(r1, r2)
                                return
                        }

                        public static net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Malformed valueOf(java.lang.String r1) {
                                java.lang.Class<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Malformed> r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Malformed.class
                                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Malformed r1 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Malformed) r1
                                return r1
                        }

                        public static net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Malformed[] values() {
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Malformed[] r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Malformed.$VALUES
                                java.lang.Object r0 = r0.clone()
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Malformed[] r0 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Malformed[]) r0
                                return r0
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForMethod
                        public net.bytebuddy.description.type.TypeList.Generic resolveExceptionTypes(java.util.List<java.lang.String> r1, net.bytebuddy.pool.TypePool r2, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> r3, net.bytebuddy.description.method.MethodDescription.InDefinedShape r4) {
                                r0 = this;
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TokenizedGenericType$Malformed$TokenList r3 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TokenizedGenericType$Malformed$TokenList
                                r3.<init>(r2, r1)
                                return r3
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForField
                        public net.bytebuddy.description.type.TypeDescription.Generic resolveFieldType(java.lang.String r1, net.bytebuddy.pool.TypePool r2, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r3, net.bytebuddy.description.field.FieldDescription.InDefinedShape r4) {
                                r0 = this;
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TokenizedGenericType$Malformed r3 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TokenizedGenericType$Malformed
                                r3.<init>(r2, r1)
                                return r3
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForType
                        public net.bytebuddy.description.type.TypeList.Generic resolveInterfaceTypes(java.util.List<java.lang.String> r1, net.bytebuddy.pool.TypePool r2, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> r3, net.bytebuddy.description.type.TypeDescription r4) {
                                r0 = this;
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TokenizedGenericType$Malformed$TokenList r3 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TokenizedGenericType$Malformed$TokenList
                                r3.<init>(r2, r1)
                                return r3
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForMethod
                        public net.bytebuddy.description.type.TypeList.Generic resolveParameterTypes(java.util.List<java.lang.String> r1, net.bytebuddy.pool.TypePool r2, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> r3, net.bytebuddy.description.method.MethodDescription.InDefinedShape r4) {
                                r0 = this;
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TokenizedGenericType$Malformed$TokenList r3 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TokenizedGenericType$Malformed$TokenList
                                r3.<init>(r2, r1)
                                return r3
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForRecordComponent
                        public net.bytebuddy.description.type.TypeDescription.Generic resolveRecordType(java.lang.String r1, net.bytebuddy.pool.TypePool r2, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r3, net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape r4) {
                                r0 = this;
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TokenizedGenericType$Malformed r3 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TokenizedGenericType$Malformed
                                r3.<init>(r2, r1)
                                return r3
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForMethod
                        public net.bytebuddy.description.type.TypeDescription.Generic resolveReturnType(java.lang.String r1, net.bytebuddy.pool.TypePool r2, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r3, net.bytebuddy.description.method.MethodDescription.InDefinedShape r4) {
                                r0 = this;
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TokenizedGenericType$Malformed r3 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TokenizedGenericType$Malformed
                                r3.<init>(r2, r1)
                                return r3
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForType
                        public net.bytebuddy.description.type.TypeDescription.Generic resolveSuperClass(java.lang.String r1, net.bytebuddy.pool.TypePool r2, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r3, net.bytebuddy.description.type.TypeDescription r4) {
                                r0 = this;
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TokenizedGenericType$Malformed r3 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TokenizedGenericType$Malformed
                                r3.<init>(r2, r1)
                                return r3
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution
                        public net.bytebuddy.description.type.TypeList.Generic resolveTypeVariables(net.bytebuddy.pool.TypePool r1, net.bytebuddy.description.TypeVariableSource r2, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> r3, java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>>> r4) {
                                r0 = this;
                                java.lang.reflect.GenericSignatureFormatError r1 = new java.lang.reflect.GenericSignatureFormatError
                                r1.<init>()
                                throw r1
                        }
                    }

                    public enum Raw extends java.lang.Enum<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Raw> implements net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForType, net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForField, net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForMethod, net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForRecordComponent {
                        private static final /* synthetic */ net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Raw[] $VALUES = null;
                        public static final net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Raw INSTANCE = null;

                        public static class RawAnnotatedType extends net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType {
                            private final java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> annotationTokens;
                            private final net.bytebuddy.description.type.TypeDescription typeDescription;
                            private final java.lang.String typePath;
                            private final net.bytebuddy.pool.TypePool typePool;

                            public static class LazyRawAnnotatedTypeList extends net.bytebuddy.description.type.TypeList.Generic.AbstractBase {
                                private final java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> annotationTokens;
                                private final java.util.List<java.lang.String> descriptors;
                                private final net.bytebuddy.pool.TypePool typePool;

                                public LazyRawAnnotatedTypeList(net.bytebuddy.pool.TypePool r1, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> r2, java.util.List<java.lang.String> r3) {
                                        r0 = this;
                                        r0.<init>()
                                        r0.typePool = r1
                                        r0.annotationTokens = r2
                                        r0.descriptors = r3
                                        return
                                }

                                public static net.bytebuddy.description.type.TypeList.Generic of(net.bytebuddy.pool.TypePool r1, @net.bytebuddy.utility.nullability.MaybeNull java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> r2, java.util.List<java.lang.String> r3) {
                                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Raw$RawAnnotatedType$LazyRawAnnotatedTypeList r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Raw$RawAnnotatedType$LazyRawAnnotatedTypeList
                                        if (r2 != 0) goto L8
                                        java.util.Map r2 = java.util.Collections.emptyMap()
                                    L8:
                                        r0.<init>(r1, r2, r3)
                                        return r0
                                }

                                @Override // net.bytebuddy.description.type.TypeList.Generic.AbstractBase, net.bytebuddy.description.type.TypeList.Generic
                                public net.bytebuddy.description.type.TypeList asErasures() {
                                        r3 = this;
                                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyTypeList r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyTypeList
                                        net.bytebuddy.pool.TypePool r1 = r3.typePool
                                        java.util.List<java.lang.String> r2 = r3.descriptors
                                        r0.<init>(r1, r2)
                                        return r0
                                }

                                @Override // net.bytebuddy.description.type.TypeList.Generic.AbstractBase, net.bytebuddy.description.type.TypeList.Generic
                                public net.bytebuddy.description.type.TypeList.Generic asRawTypes() {
                                        r0 = this;
                                        return r0
                                }

                                @Override // java.util.AbstractList, java.util.List
                                public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                                        r0 = this;
                                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.get(r1)
                                        return r1
                                }

                                @Override // java.util.AbstractList, java.util.List
                                public net.bytebuddy.description.type.TypeDescription.Generic get(int r4) {
                                        r3 = this;
                                        net.bytebuddy.pool.TypePool r0 = r3.typePool
                                        java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>> r1 = r3.annotationTokens
                                        java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
                                        java.lang.Object r1 = r1.get(r2)
                                        java.util.Map r1 = (java.util.Map) r1
                                        java.util.List<java.lang.String> r2 = r3.descriptors
                                        java.lang.Object r4 = r2.get(r4)
                                        java.lang.String r4 = (java.lang.String) r4
                                        net.bytebuddy.description.type.TypeDescription$Generic r4 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Raw.RawAnnotatedType.of(r0, r1, r4)
                                        return r4
                                }

                                @Override // net.bytebuddy.description.type.TypeList.Generic.AbstractBase, net.bytebuddy.description.type.TypeList.Generic
                                public int getStackSize() {
                                        r3 = this;
                                        java.util.List<java.lang.String> r0 = r3.descriptors
                                        java.util.Iterator r0 = r0.iterator()
                                        r1 = 0
                                    L7:
                                        boolean r2 = r0.hasNext()
                                        if (r2 == 0) goto L1d
                                        java.lang.Object r2 = r0.next()
                                        java.lang.String r2 = (java.lang.String) r2
                                        net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.getType(r2)
                                        int r2 = r2.getSize()
                                        int r1 = r1 + r2
                                        goto L7
                                    L1d:
                                        return r1
                                }

                                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                                public int size() {
                                        r1 = this;
                                        java.util.List<java.lang.String> r0 = r1.descriptors
                                        int r0 = r0.size()
                                        return r0
                                }
                            }

                            public RawAnnotatedType(net.bytebuddy.pool.TypePool r1, java.lang.String r2, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r3, net.bytebuddy.description.type.TypeDescription r4) {
                                    r0 = this;
                                    r0.<init>()
                                    r0.typePool = r1
                                    r0.typePath = r2
                                    r0.annotationTokens = r3
                                    r0.typeDescription = r4
                                    return
                            }

                            public static net.bytebuddy.description.type.TypeDescription.Generic of(net.bytebuddy.pool.TypePool r2, @net.bytebuddy.utility.nullability.MaybeNull java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r3, java.lang.String r4) {
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Raw$RawAnnotatedType r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Raw$RawAnnotatedType
                                    if (r3 != 0) goto L8
                                    java.util.Map r3 = java.util.Collections.emptyMap()
                                L8:
                                    net.bytebuddy.description.type.TypeDescription r4 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TokenizedGenericType.toErasure(r2, r4)
                                    java.lang.String r1 = ""
                                    r0.<init>(r2, r1, r3, r4)
                                    return r0
                            }

                            @Override // net.bytebuddy.description.type.TypeDefinition
                            public net.bytebuddy.description.type.TypeDescription asErasure() {
                                    r1 = this;
                                    net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                                    return r0
                            }

                            @Override // net.bytebuddy.description.type.TypeDefinition
                            @net.bytebuddy.utility.nullability.MaybeNull
                            public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getComponentType() {
                                    r1 = this;
                                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.getComponentType()
                                    return r0
                            }

                            @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
                            @net.bytebuddy.utility.nullability.MaybeNull
                            public net.bytebuddy.description.type.TypeDescription.Generic getComponentType() {
                                    r5 = this;
                                    net.bytebuddy.description.type.TypeDescription r0 = r5.typeDescription
                                    net.bytebuddy.description.type.TypeDescription r0 = r0.getComponentType()
                                    if (r0 != 0) goto Lb
                                    net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                                    goto L28
                                Lb:
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Raw$RawAnnotatedType r1 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Raw$RawAnnotatedType
                                    net.bytebuddy.pool.TypePool r2 = r5.typePool
                                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                                    r3.<init>()
                                    java.lang.String r4 = r5.typePath
                                    r3.append(r4)
                                    r4 = 91
                                    r3.append(r4)
                                    java.lang.String r3 = r3.toString()
                                    java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r4 = r5.annotationTokens
                                    r1.<init>(r2, r3, r4, r0)
                                    r0 = r1
                                L28:
                                    return r0
                            }

                            @Override // net.bytebuddy.description.annotation.AnnotationSource
                            public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                                    r3 = this;
                                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                    java.lang.String r1 = r3.typePath
                                    r0.<init>(r1)
                                    r1 = 0
                                L8:
                                    net.bytebuddy.description.type.TypeDescription r2 = r3.typeDescription
                                    int r2 = r2.getInnerClassCount()
                                    if (r1 >= r2) goto L18
                                    r2 = 46
                                    r0.append(r2)
                                    int r1 = r1 + 1
                                    goto L8
                                L18:
                                    net.bytebuddy.pool.TypePool r1 = r3.typePool
                                    java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r2 = r3.annotationTokens
                                    java.lang.String r0 = r0.toString()
                                    java.lang.Object r0 = r2.get(r0)
                                    java.util.List r0 = (java.util.List) r0
                                    net.bytebuddy.description.annotation.AnnotationList r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyAnnotationDescription.asListOfNullable(r1, r0)
                                    return r0
                            }

                            @Override // net.bytebuddy.description.type.TypeDescription.Generic
                            @net.bytebuddy.utility.nullability.MaybeNull
                            public net.bytebuddy.description.type.TypeDescription.Generic getOwnerType() {
                                    r5 = this;
                                    net.bytebuddy.description.type.TypeDescription r0 = r5.typeDescription
                                    net.bytebuddy.description.type.TypeDescription r0 = r0.getDeclaringType()
                                    if (r0 != 0) goto Lb
                                    net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                                    goto L17
                                Lb:
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Raw$RawAnnotatedType r1 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Raw$RawAnnotatedType
                                    net.bytebuddy.pool.TypePool r2 = r5.typePool
                                    java.lang.String r3 = r5.typePath
                                    java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r4 = r5.annotationTokens
                                    r1.<init>(r2, r3, r4, r0)
                                    r0 = r1
                                L17:
                                    return r0
                            }
                        }

                        static {
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Raw r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Raw
                                java.lang.String r1 = "INSTANCE"
                                r2 = 0
                                r0.<init>(r1, r2)
                                net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Raw.INSTANCE = r0
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Raw[] r0 = new net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Raw[]{r0}
                                net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Raw.$VALUES = r0
                                return
                        }

                        Raw(java.lang.String r1, int r2) {
                                r0 = this;
                                r0.<init>(r1, r2)
                                return
                        }

                        public static net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Raw valueOf(java.lang.String r1) {
                                java.lang.Class<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Raw> r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Raw.class
                                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Raw r1 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Raw) r1
                                return r1
                        }

                        public static net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Raw[] values() {
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Raw[] r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Raw.$VALUES
                                java.lang.Object r0 = r0.clone()
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Raw[] r0 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Raw[]) r0
                                return r0
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForMethod
                        public net.bytebuddy.description.type.TypeList.Generic resolveExceptionTypes(java.util.List<java.lang.String> r1, net.bytebuddy.pool.TypePool r2, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> r3, net.bytebuddy.description.method.MethodDescription.InDefinedShape r4) {
                                r0 = this;
                                net.bytebuddy.description.type.TypeList$Generic r1 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Raw.RawAnnotatedType.LazyRawAnnotatedTypeList.of(r2, r3, r1)
                                return r1
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForField
                        public net.bytebuddy.description.type.TypeDescription.Generic resolveFieldType(java.lang.String r1, net.bytebuddy.pool.TypePool r2, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r3, net.bytebuddy.description.field.FieldDescription.InDefinedShape r4) {
                                r0 = this;
                                net.bytebuddy.description.type.TypeDescription$Generic r1 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Raw.RawAnnotatedType.of(r2, r3, r1)
                                return r1
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForType
                        public net.bytebuddy.description.type.TypeList.Generic resolveInterfaceTypes(java.util.List<java.lang.String> r1, net.bytebuddy.pool.TypePool r2, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> r3, net.bytebuddy.description.type.TypeDescription r4) {
                                r0 = this;
                                net.bytebuddy.description.type.TypeList$Generic r1 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Raw.RawAnnotatedType.LazyRawAnnotatedTypeList.of(r2, r3, r1)
                                return r1
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForMethod
                        public net.bytebuddy.description.type.TypeList.Generic resolveParameterTypes(java.util.List<java.lang.String> r1, net.bytebuddy.pool.TypePool r2, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> r3, net.bytebuddy.description.method.MethodDescription.InDefinedShape r4) {
                                r0 = this;
                                net.bytebuddy.description.type.TypeList$Generic r1 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Raw.RawAnnotatedType.LazyRawAnnotatedTypeList.of(r2, r3, r1)
                                return r1
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForRecordComponent
                        public net.bytebuddy.description.type.TypeDescription.Generic resolveRecordType(java.lang.String r1, net.bytebuddy.pool.TypePool r2, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r3, net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape r4) {
                                r0 = this;
                                net.bytebuddy.description.type.TypeDescription$Generic r1 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Raw.RawAnnotatedType.of(r2, r3, r1)
                                return r1
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForMethod
                        public net.bytebuddy.description.type.TypeDescription.Generic resolveReturnType(java.lang.String r1, net.bytebuddy.pool.TypePool r2, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r3, net.bytebuddy.description.method.MethodDescription.InDefinedShape r4) {
                                r0 = this;
                                net.bytebuddy.description.type.TypeDescription$Generic r1 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Raw.RawAnnotatedType.of(r2, r3, r1)
                                return r1
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForType
                        public net.bytebuddy.description.type.TypeDescription.Generic resolveSuperClass(java.lang.String r1, net.bytebuddy.pool.TypePool r2, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r3, net.bytebuddy.description.type.TypeDescription r4) {
                                r0 = this;
                                net.bytebuddy.description.type.TypeDescription$Generic r1 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Raw.RawAnnotatedType.of(r2, r3, r1)
                                return r1
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution
                        public net.bytebuddy.description.type.TypeList.Generic resolveTypeVariables(net.bytebuddy.pool.TypePool r1, net.bytebuddy.description.TypeVariableSource r2, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> r3, java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>>> r4) {
                                r0 = this;
                                net.bytebuddy.description.type.TypeList$Generic$Empty r1 = new net.bytebuddy.description.type.TypeList$Generic$Empty
                                r1.<init>()
                                return r1
                        }
                    }

                    net.bytebuddy.description.type.TypeList.Generic resolveTypeVariables(net.bytebuddy.pool.TypePool r1, net.bytebuddy.description.TypeVariableSource r2, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> r3, java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>>> r4);
                }

                java.lang.String getTypePathPrefix();

                boolean isPrimaryBound(net.bytebuddy.pool.TypePool r1);

                net.bytebuddy.description.type.TypeDescription.Generic toGenericType(net.bytebuddy.pool.TypePool r1, net.bytebuddy.description.TypeVariableSource r2, java.lang.String r3, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r4);
            }

            public static class LazyAnnotationDescription extends net.bytebuddy.description.annotation.AnnotationDescription.AbstractBase {
                private final net.bytebuddy.description.type.TypeDescription annotationType;
                protected final net.bytebuddy.pool.TypePool typePool;
                protected final java.util.Map<java.lang.String, net.bytebuddy.description.annotation.AnnotationValue<?, ?>> values;

                public static class Loadable<S extends java.lang.annotation.Annotation> extends net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyAnnotationDescription implements net.bytebuddy.description.annotation.AnnotationDescription.Loadable<S> {
                    private final java.lang.Class<S> annotationType;

                    private Loadable(net.bytebuddy.pool.TypePool r3, java.lang.Class<S> r4, java.util.Map<java.lang.String, net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r5) {
                            r2 = this;
                            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r4)
                            r1 = 0
                            r2.<init>(r3, r0, r5, r1)
                            r2.annotationType = r4
                            return
                    }

                    public /* synthetic */ Loadable(net.bytebuddy.pool.TypePool r1, java.lang.Class r2, java.util.Map r3, net.bytebuddy.pool.TypePool.AnonymousClass1 r4) {
                            r0 = this;
                            r0.<init>(r1, r2, r3)
                            return
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationDescription.Loadable
                    public S load() {
                            r3 = this;
                            java.lang.Class<S extends java.lang.annotation.Annotation> r0 = r3.annotationType
                            java.lang.ClassLoader r0 = r0.getClassLoader()
                            java.lang.Class<S extends java.lang.annotation.Annotation> r1 = r3.annotationType
                            java.util.Map<java.lang.String, net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r2 = r3.values
                            java.lang.annotation.Annotation r0 = net.bytebuddy.description.annotation.AnnotationDescription.AnnotationInvocationHandler.of(r0, r1, r2)
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyAnnotationDescription, net.bytebuddy.description.annotation.AnnotationDescription
                    public /* bridge */ /* synthetic */ net.bytebuddy.description.annotation.AnnotationDescription.Loadable prepare(java.lang.Class r1) {
                            r0 = this;
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyAnnotationDescription$Loadable r1 = super.prepare(r1)
                            return r1
                    }
                }

                public static class UnresolvedAnnotationList extends net.bytebuddy.description.annotation.AnnotationList.Explicit {
                    private final java.util.List<? extends net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken> tokens;

                    private UnresolvedAnnotationList(java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1, java.util.List<? extends net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken> r2) {
                            r0 = this;
                            r0.<init>(r1)
                            r0.tokens = r2
                            return
                    }

                    public /* synthetic */ UnresolvedAnnotationList(java.util.List r1, java.util.List r2, net.bytebuddy.pool.TypePool.AnonymousClass1 r3) {
                            r0 = this;
                            r0.<init>(r1, r2)
                            return
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationList.AbstractBase, net.bytebuddy.description.annotation.AnnotationList
                    public java.util.List<java.lang.String> asTypeNames() {
                            r3 = this;
                            java.util.ArrayList r0 = new java.util.ArrayList
                            java.util.List<? extends net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken> r1 = r3.tokens
                            int r1 = r1.size()
                            r0.<init>(r1)
                            java.util.List<? extends net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken> r1 = r3.tokens
                            java.util.Iterator r1 = r1.iterator()
                        L11:
                            boolean r2 = r1.hasNext()
                            if (r2 == 0) goto L25
                            java.lang.Object r2 = r1.next()
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken r2 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken) r2
                            java.lang.String r2 = r2.getBinaryName()
                            r0.add(r2)
                            goto L11
                        L25:
                            return r0
                    }
                }

                private LazyAnnotationDescription(net.bytebuddy.pool.TypePool r1, net.bytebuddy.description.type.TypeDescription r2, java.util.Map<java.lang.String, net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r3) {
                        r0 = this;
                        r0.<init>()
                        r0.typePool = r1
                        r0.annotationType = r2
                        r0.values = r3
                        return
                }

                public /* synthetic */ LazyAnnotationDescription(net.bytebuddy.pool.TypePool r1, net.bytebuddy.description.type.TypeDescription r2, java.util.Map r3, net.bytebuddy.pool.TypePool.AnonymousClass1 r4) {
                        r0 = this;
                        r0.<init>(r1, r2, r3)
                        return
                }

                public static net.bytebuddy.description.annotation.AnnotationList asList(net.bytebuddy.pool.TypePool r4, java.util.List<? extends net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken> r5) {
                        java.util.ArrayList r0 = new java.util.ArrayList
                        int r1 = r5.size()
                        r0.<init>(r1)
                        java.util.Iterator r1 = r5.iterator()
                    Ld:
                        boolean r2 = r1.hasNext()
                        if (r2 == 0) goto L39
                        java.lang.Object r2 = r1.next()
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken r2 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken) r2
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken$Resolution r2 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken.access$2000(r2, r4)
                        boolean r3 = r2.isResolved()
                        if (r3 == 0) goto Ld
                        net.bytebuddy.description.annotation.AnnotationDescription r3 = r2.resolve()
                        net.bytebuddy.description.type.TypeDescription r3 = r3.getAnnotationType()
                        boolean r3 = r3.isAnnotation()
                        if (r3 == 0) goto Ld
                        net.bytebuddy.description.annotation.AnnotationDescription r2 = r2.resolve()
                        r0.add(r2)
                        goto Ld
                    L39:
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyAnnotationDescription$UnresolvedAnnotationList r4 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyAnnotationDescription$UnresolvedAnnotationList
                        r1 = 0
                        r4.<init>(r0, r5, r1)
                        return r4
                }

                public static net.bytebuddy.description.annotation.AnnotationList asListOfNullable(net.bytebuddy.pool.TypePool r0, @net.bytebuddy.utility.nullability.MaybeNull java.util.List<? extends net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken> r1) {
                        if (r1 != 0) goto L8
                        net.bytebuddy.description.annotation.AnnotationList$Empty r0 = new net.bytebuddy.description.annotation.AnnotationList$Empty
                        r0.<init>()
                        goto Lc
                    L8:
                        net.bytebuddy.description.annotation.AnnotationList r0 = asList(r0, r1)
                    Lc:
                        return r0
                }

                @Override // net.bytebuddy.description.annotation.AnnotationDescription
                public net.bytebuddy.description.type.TypeDescription getAnnotationType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.annotationType
                        return r0
                }

                @Override // net.bytebuddy.description.annotation.AnnotationDescription
                public net.bytebuddy.description.annotation.AnnotationValue<?, ?> getValue(net.bytebuddy.description.method.MethodDescription.InDefinedShape r3) {
                        r2 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r3.getDeclaringType()
                        net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                        net.bytebuddy.description.type.TypeDescription r1 = r2.annotationType
                        boolean r0 = r0.equals(r1)
                        if (r0 == 0) goto L4d
                        java.util.Map<java.lang.String, net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r0 = r2.values
                        java.lang.String r1 = r3.getName()
                        java.lang.Object r0 = r0.get(r1)
                        net.bytebuddy.description.annotation.AnnotationValue r0 = (net.bytebuddy.description.annotation.AnnotationValue) r0
                        if (r0 == 0) goto L23
                        net.bytebuddy.description.annotation.AnnotationValue r3 = r0.filter(r3)
                        return r3
                    L23:
                        net.bytebuddy.description.type.TypeDescription r0 = r2.getAnnotationType()
                        net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                        net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.is(r3)
                        net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                        net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                        java.lang.Object r0 = r0.getOnly()
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                        net.bytebuddy.description.annotation.AnnotationValue r0 = r0.getDefaultValue()
                        if (r0 != 0) goto L4c
                        net.bytebuddy.description.annotation.AnnotationValue$ForMissingValue r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForMissingValue
                        net.bytebuddy.description.type.TypeDescription r1 = r2.annotationType
                        java.lang.String r3 = r3.getName()
                        r0.<init>(r1, r3)
                    L4c:
                        return r0
                    L4d:
                        java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        r1.append(r3)
                        java.lang.String r3 = " is not declared by "
                        r1.append(r3)
                        net.bytebuddy.description.type.TypeDescription r3 = r2.getAnnotationType()
                        r1.append(r3)
                        java.lang.String r3 = r1.toString()
                        r0.<init>(r3)
                        throw r0
                }

                @Override // net.bytebuddy.description.annotation.AnnotationDescription
                public /* bridge */ /* synthetic */ net.bytebuddy.description.annotation.AnnotationDescription.Loadable prepare(java.lang.Class r1) {
                        r0 = this;
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyAnnotationDescription$Loadable r1 = r0.prepare(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.annotation.AnnotationDescription
                public <T extends java.lang.annotation.Annotation> net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyAnnotationDescription.Loadable<T> prepare(java.lang.Class<T> r5) {
                        r4 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r4.annotationType
                        boolean r0 = r0.represents(r5)
                        if (r0 == 0) goto L13
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyAnnotationDescription$Loadable r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyAnnotationDescription$Loadable
                        net.bytebuddy.pool.TypePool r1 = r4.typePool
                        java.util.Map<java.lang.String, net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r2 = r4.values
                        r3 = 0
                        r0.<init>(r1, r5, r2, r3)
                        return r0
                    L13:
                        java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        r1.append(r5)
                        java.lang.String r5 = " does not represent "
                        r1.append(r5)
                        net.bytebuddy.description.type.TypeDescription r5 = r4.annotationType
                        r1.append(r5)
                        java.lang.String r5 = r1.toString()
                        r0.<init>(r5)
                        throw r0
                }
            }

            public static abstract class LazyAnnotationValue<U, V> extends net.bytebuddy.description.annotation.AnnotationValue.AbstractBase<U, V> {
                private transient /* synthetic */ int hashCode;

                public static class ForAnnotationValue extends net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyAnnotationValue<net.bytebuddy.description.annotation.AnnotationDescription, java.lang.annotation.Annotation> {
                    private final net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken annotationToken;
                    private transient /* synthetic */ net.bytebuddy.description.annotation.AnnotationValue resolved;
                    private final net.bytebuddy.pool.TypePool typePool;

                    private ForAnnotationValue(net.bytebuddy.pool.TypePool r2, net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken r3) {
                            r1 = this;
                            r0 = 0
                            r1.<init>(r0)
                            r1.typePool = r2
                            r1.annotationToken = r3
                            return
                    }

                    public /* synthetic */ ForAnnotationValue(net.bytebuddy.pool.TypePool r1, net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken r2, net.bytebuddy.pool.TypePool.AnonymousClass1 r3) {
                            r0 = this;
                            r0.<init>(r1, r2)
                            return
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyAnnotationValue
                    @net.bytebuddy.build.CachedReturnPlugin.Enhance("resolved")
                    public net.bytebuddy.description.annotation.AnnotationValue<net.bytebuddy.description.annotation.AnnotationDescription, java.lang.annotation.Annotation> doResolve() {
                            r4 = this;
                            net.bytebuddy.description.annotation.AnnotationValue r0 = r4.resolved
                            r1 = 0
                            if (r0 == 0) goto L6
                            goto L4c
                        L6:
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken r0 = r4.annotationToken
                            net.bytebuddy.pool.TypePool r2 = r4.typePool
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken$Resolution r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken.access$2000(r0, r2)
                            boolean r2 = r0.isResolved()
                            if (r2 != 0) goto L20
                            net.bytebuddy.description.annotation.AnnotationValue$ForMissingType r1 = new net.bytebuddy.description.annotation.AnnotationValue$ForMissingType
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken r0 = r4.annotationToken
                            java.lang.String r0 = r0.getBinaryName()
                            r1.<init>(r0)
                            goto L4c
                        L20:
                            net.bytebuddy.description.annotation.AnnotationDescription r2 = r0.resolve()
                            net.bytebuddy.description.type.TypeDescription r2 = r2.getAnnotationType()
                            boolean r2 = r2.isAnnotation()
                            if (r2 != 0) goto L43
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForMismatchedType r2 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForMismatchedType
                            net.bytebuddy.description.annotation.AnnotationDescription r0 = r0.resolve()
                            net.bytebuddy.description.type.TypeDescription r0 = r0.getAnnotationType()
                            java.lang.String r0 = r0.getName()
                            net.bytebuddy.description.annotation.AnnotationValue$Sort r3 = net.bytebuddy.description.annotation.AnnotationValue.Sort.ANNOTATION
                            r2.<init>(r0, r3, r1)
                            r1 = r2
                            goto L4c
                        L43:
                            net.bytebuddy.description.annotation.AnnotationValue$ForAnnotationDescription r1 = new net.bytebuddy.description.annotation.AnnotationValue$ForAnnotationDescription
                            net.bytebuddy.description.annotation.AnnotationDescription r0 = r0.resolve()
                            r1.<init>(r0)
                        L4c:
                            if (r1 != 0) goto L51
                            net.bytebuddy.description.annotation.AnnotationValue r1 = r4.resolved
                            goto L53
                        L51:
                            r4.resolved = r1
                        L53:
                            return r1
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue
                    public net.bytebuddy.description.annotation.AnnotationValue.Sort getSort() {
                            r1 = this;
                            net.bytebuddy.description.annotation.AnnotationValue$Sort r0 = net.bytebuddy.description.annotation.AnnotationValue.Sort.ANNOTATION
                            return r0
                    }
                }

                public static class ForArray extends net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyAnnotationValue<java.lang.Object, java.lang.Object> {
                    private final net.bytebuddy.pool.TypePool.AbstractBase.ComponentTypeReference componentTypeReference;
                    private transient /* synthetic */ net.bytebuddy.description.annotation.AnnotationValue resolved;
                    private final net.bytebuddy.pool.TypePool typePool;
                    private final java.util.List<net.bytebuddy.description.annotation.AnnotationValue<?, ?>> values;

                    private ForArray(net.bytebuddy.pool.TypePool r2, net.bytebuddy.pool.TypePool.AbstractBase.ComponentTypeReference r3, java.util.List<net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r4) {
                            r1 = this;
                            r0 = 0
                            r1.<init>(r0)
                            r1.typePool = r2
                            r1.componentTypeReference = r3
                            r1.values = r4
                            return
                    }

                    public /* synthetic */ ForArray(net.bytebuddy.pool.TypePool r1, net.bytebuddy.pool.TypePool.AbstractBase.ComponentTypeReference r2, java.util.List r3, net.bytebuddy.pool.TypePool.AnonymousClass1 r4) {
                            r0 = this;
                            r0.<init>(r1, r2, r3)
                            return
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyAnnotationValue
                    @net.bytebuddy.build.CachedReturnPlugin.Enhance("resolved")
                    public net.bytebuddy.description.annotation.AnnotationValue<java.lang.Object, java.lang.Object> doResolve() {
                            r4 = this;
                            net.bytebuddy.description.annotation.AnnotationValue r0 = r4.resolved
                            r1 = 0
                            if (r0 == 0) goto L7
                            goto L17c
                        L7:
                            net.bytebuddy.pool.TypePool$AbstractBase$ComponentTypeReference r0 = r4.componentTypeReference
                            java.lang.String r0 = r0.resolve()
                            if (r0 == 0) goto L14d
                            net.bytebuddy.pool.TypePool r2 = r4.typePool
                            net.bytebuddy.pool.TypePool$Resolution r2 = r2.describe(r0)
                            boolean r3 = r2.isResolved()
                            if (r3 != 0) goto L22
                            net.bytebuddy.description.annotation.AnnotationValue$ForMissingType r1 = new net.bytebuddy.description.annotation.AnnotationValue$ForMissingType
                            r1.<init>(r0)
                            goto L17c
                        L22:
                            net.bytebuddy.description.type.TypeDescription r0 = r2.resolve()
                            boolean r0 = r0.isEnum()
                            if (r0 == 0) goto L3b
                            net.bytebuddy.description.annotation.AnnotationValue$ForDescriptionArray r1 = new net.bytebuddy.description.annotation.AnnotationValue$ForDescriptionArray
                            net.bytebuddy.description.type.TypeDescription r0 = r2.resolve()
                            java.util.List<net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r2 = r4.values
                            java.lang.Class<net.bytebuddy.description.enumeration.EnumerationDescription> r3 = net.bytebuddy.description.enumeration.EnumerationDescription.class
                            r1.<init>(r3, r0, r2)
                            goto L17c
                        L3b:
                            net.bytebuddy.description.type.TypeDescription r0 = r2.resolve()
                            boolean r0 = r0.isAnnotation()
                            if (r0 == 0) goto L54
                            net.bytebuddy.description.annotation.AnnotationValue$ForDescriptionArray r1 = new net.bytebuddy.description.annotation.AnnotationValue$ForDescriptionArray
                            net.bytebuddy.description.type.TypeDescription r0 = r2.resolve()
                            java.util.List<net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r2 = r4.values
                            java.lang.Class<net.bytebuddy.description.annotation.AnnotationDescription> r3 = net.bytebuddy.description.annotation.AnnotationDescription.class
                            r1.<init>(r3, r0, r2)
                            goto L17c
                        L54:
                            net.bytebuddy.description.type.TypeDescription r0 = r2.resolve()
                            java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
                            boolean r0 = r0.represents(r3)
                            if (r0 == 0) goto L6f
                            net.bytebuddy.description.annotation.AnnotationValue$ForDescriptionArray r1 = new net.bytebuddy.description.annotation.AnnotationValue$ForDescriptionArray
                            net.bytebuddy.description.type.TypeDescription r0 = r2.resolve()
                            java.util.List<net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r2 = r4.values
                            java.lang.Class<net.bytebuddy.description.type.TypeDescription> r3 = net.bytebuddy.description.type.TypeDescription.class
                            r1.<init>(r3, r0, r2)
                            goto L17c
                        L6f:
                            net.bytebuddy.description.type.TypeDescription r0 = r2.resolve()
                            java.lang.Class<java.lang.String> r3 = java.lang.String.class
                            boolean r0 = r0.represents(r3)
                            if (r0 == 0) goto L88
                            net.bytebuddy.description.annotation.AnnotationValue$ForDescriptionArray r1 = new net.bytebuddy.description.annotation.AnnotationValue$ForDescriptionArray
                            net.bytebuddy.description.type.TypeDescription r0 = r2.resolve()
                            java.util.List<net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r2 = r4.values
                            r1.<init>(r3, r0, r2)
                            goto L17c
                        L88:
                            net.bytebuddy.description.type.TypeDescription r0 = r2.resolve()
                            java.lang.Class r3 = java.lang.Boolean.TYPE
                            boolean r0 = r0.represents(r3)
                            if (r0 == 0) goto La1
                            net.bytebuddy.description.annotation.AnnotationValue$ForDescriptionArray r1 = new net.bytebuddy.description.annotation.AnnotationValue$ForDescriptionArray
                            net.bytebuddy.description.type.TypeDescription r0 = r2.resolve()
                            java.util.List<net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r2 = r4.values
                            r1.<init>(r3, r0, r2)
                            goto L17c
                        La1:
                            net.bytebuddy.description.type.TypeDescription r0 = r2.resolve()
                            java.lang.Class r3 = java.lang.Byte.TYPE
                            boolean r0 = r0.represents(r3)
                            if (r0 == 0) goto Lba
                            net.bytebuddy.description.annotation.AnnotationValue$ForDescriptionArray r1 = new net.bytebuddy.description.annotation.AnnotationValue$ForDescriptionArray
                            net.bytebuddy.description.type.TypeDescription r0 = r2.resolve()
                            java.util.List<net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r2 = r4.values
                            r1.<init>(r3, r0, r2)
                            goto L17c
                        Lba:
                            net.bytebuddy.description.type.TypeDescription r0 = r2.resolve()
                            java.lang.Class r3 = java.lang.Short.TYPE
                            boolean r0 = r0.represents(r3)
                            if (r0 == 0) goto Ld3
                            net.bytebuddy.description.annotation.AnnotationValue$ForDescriptionArray r1 = new net.bytebuddy.description.annotation.AnnotationValue$ForDescriptionArray
                            net.bytebuddy.description.type.TypeDescription r0 = r2.resolve()
                            java.util.List<net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r2 = r4.values
                            r1.<init>(r3, r0, r2)
                            goto L17c
                        Ld3:
                            net.bytebuddy.description.type.TypeDescription r0 = r2.resolve()
                            java.lang.Class r3 = java.lang.Character.TYPE
                            boolean r0 = r0.represents(r3)
                            if (r0 == 0) goto Lec
                            net.bytebuddy.description.annotation.AnnotationValue$ForDescriptionArray r1 = new net.bytebuddy.description.annotation.AnnotationValue$ForDescriptionArray
                            net.bytebuddy.description.type.TypeDescription r0 = r2.resolve()
                            java.util.List<net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r2 = r4.values
                            r1.<init>(r3, r0, r2)
                            goto L17c
                        Lec:
                            net.bytebuddy.description.type.TypeDescription r0 = r2.resolve()
                            java.lang.Class r3 = java.lang.Integer.TYPE
                            boolean r0 = r0.represents(r3)
                            if (r0 == 0) goto L105
                            net.bytebuddy.description.annotation.AnnotationValue$ForDescriptionArray r1 = new net.bytebuddy.description.annotation.AnnotationValue$ForDescriptionArray
                            net.bytebuddy.description.type.TypeDescription r0 = r2.resolve()
                            java.util.List<net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r2 = r4.values
                            r1.<init>(r3, r0, r2)
                            goto L17c
                        L105:
                            net.bytebuddy.description.type.TypeDescription r0 = r2.resolve()
                            java.lang.Class r3 = java.lang.Long.TYPE
                            boolean r0 = r0.represents(r3)
                            if (r0 == 0) goto L11d
                            net.bytebuddy.description.annotation.AnnotationValue$ForDescriptionArray r1 = new net.bytebuddy.description.annotation.AnnotationValue$ForDescriptionArray
                            net.bytebuddy.description.type.TypeDescription r0 = r2.resolve()
                            java.util.List<net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r2 = r4.values
                            r1.<init>(r3, r0, r2)
                            goto L17c
                        L11d:
                            net.bytebuddy.description.type.TypeDescription r0 = r2.resolve()
                            java.lang.Class r3 = java.lang.Float.TYPE
                            boolean r0 = r0.represents(r3)
                            if (r0 == 0) goto L135
                            net.bytebuddy.description.annotation.AnnotationValue$ForDescriptionArray r1 = new net.bytebuddy.description.annotation.AnnotationValue$ForDescriptionArray
                            net.bytebuddy.description.type.TypeDescription r0 = r2.resolve()
                            java.util.List<net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r2 = r4.values
                            r1.<init>(r3, r0, r2)
                            goto L17c
                        L135:
                            net.bytebuddy.description.type.TypeDescription r0 = r2.resolve()
                            java.lang.Class r3 = java.lang.Double.TYPE
                            boolean r0 = r0.represents(r3)
                            if (r0 == 0) goto L14d
                            net.bytebuddy.description.annotation.AnnotationValue$ForDescriptionArray r1 = new net.bytebuddy.description.annotation.AnnotationValue$ForDescriptionArray
                            net.bytebuddy.description.type.TypeDescription r0 = r2.resolve()
                            java.util.List<net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r2 = r4.values
                            r1.<init>(r3, r0, r2)
                            goto L17c
                        L14d:
                            net.bytebuddy.description.annotation.AnnotationValue$Sort r0 = net.bytebuddy.description.annotation.AnnotationValue.Sort.NONE
                            java.util.List<net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r2 = r4.values
                            int r3 = r2.size()
                            java.util.ListIterator r2 = r2.listIterator(r3)
                        L159:
                            boolean r3 = r2.hasPrevious()
                            if (r3 == 0) goto L170
                            boolean r3 = r0.isDefined()
                            if (r3 != 0) goto L170
                            java.lang.Object r0 = r2.previous()
                            net.bytebuddy.description.annotation.AnnotationValue r0 = (net.bytebuddy.description.annotation.AnnotationValue) r0
                            net.bytebuddy.description.annotation.AnnotationValue$Sort r0 = r0.getSort()
                            goto L159
                        L170:
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForMismatchedType r2 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForMismatchedType
                            net.bytebuddy.description.annotation.AnnotationValue$RenderingDispatcher r3 = net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher.CURRENT
                            java.lang.String r3 = r3.toArrayErrorString(r0)
                            r2.<init>(r3, r0, r1)
                            r1 = r2
                        L17c:
                            if (r1 != 0) goto L181
                            net.bytebuddy.description.annotation.AnnotationValue r1 = r4.resolved
                            goto L183
                        L181:
                            r4.resolved = r1
                        L183:
                            return r1
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue
                    public net.bytebuddy.description.annotation.AnnotationValue.Sort getSort() {
                            r1 = this;
                            net.bytebuddy.description.annotation.AnnotationValue$Sort r0 = net.bytebuddy.description.annotation.AnnotationValue.Sort.ARRAY
                            return r0
                    }
                }

                public static class ForEnumerationValue extends net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyAnnotationValue<net.bytebuddy.description.enumeration.EnumerationDescription, java.lang.Enum<?>> {
                    private transient /* synthetic */ net.bytebuddy.description.annotation.AnnotationValue resolved;
                    private final java.lang.String typeName;
                    private final net.bytebuddy.pool.TypePool typePool;
                    private final java.lang.String value;

                    private ForEnumerationValue(net.bytebuddy.pool.TypePool r2, java.lang.String r3, java.lang.String r4) {
                            r1 = this;
                            r0 = 0
                            r1.<init>(r0)
                            r1.typePool = r2
                            r1.typeName = r3
                            r1.value = r4
                            return
                    }

                    public /* synthetic */ ForEnumerationValue(net.bytebuddy.pool.TypePool r1, java.lang.String r2, java.lang.String r3, net.bytebuddy.pool.TypePool.AnonymousClass1 r4) {
                            r0 = this;
                            r0.<init>(r1, r2, r3)
                            return
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyAnnotationValue
                    @net.bytebuddy.build.CachedReturnPlugin.Enhance("resolved")
                    public net.bytebuddy.description.annotation.AnnotationValue<net.bytebuddy.description.enumeration.EnumerationDescription, java.lang.Enum<?>> doResolve() {
                            r4 = this;
                            net.bytebuddy.description.annotation.AnnotationValue r0 = r4.resolved
                            r1 = 0
                            if (r0 == 0) goto L7
                            goto L7e
                        L7:
                            net.bytebuddy.pool.TypePool r0 = r4.typePool
                            java.lang.String r2 = r4.typeName
                            net.bytebuddy.pool.TypePool$Resolution r0 = r0.describe(r2)
                            boolean r2 = r0.isResolved()
                            if (r2 != 0) goto L1d
                            net.bytebuddy.description.annotation.AnnotationValue$ForMissingType r1 = new net.bytebuddy.description.annotation.AnnotationValue$ForMissingType
                            java.lang.String r0 = r4.typeName
                            r1.<init>(r0)
                            goto L7e
                        L1d:
                            net.bytebuddy.description.type.TypeDescription r2 = r0.resolve()
                            boolean r2 = r2.isEnum()
                            if (r2 != 0) goto L48
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForMismatchedType r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForMismatchedType
                            java.lang.StringBuilder r2 = new java.lang.StringBuilder
                            r2.<init>()
                            java.lang.String r3 = r4.typeName
                            r2.append(r3)
                            java.lang.String r3 = "."
                            r2.append(r3)
                            java.lang.String r3 = r4.value
                            r2.append(r3)
                            java.lang.String r2 = r2.toString()
                            net.bytebuddy.description.annotation.AnnotationValue$Sort r3 = net.bytebuddy.description.annotation.AnnotationValue.Sort.ENUMERATION
                            r0.<init>(r2, r3, r1)
                            r1 = r0
                            goto L7e
                        L48:
                            net.bytebuddy.description.type.TypeDescription r1 = r0.resolve()
                            net.bytebuddy.description.field.FieldList r1 = r1.getDeclaredFields()
                            java.lang.String r2 = r4.value
                            net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.named(r2)
                            net.bytebuddy.matcher.FilterableList r1 = r1.filter(r2)
                            net.bytebuddy.description.field.FieldList r1 = (net.bytebuddy.description.field.FieldList) r1
                            boolean r1 = r1.isEmpty()
                            if (r1 == 0) goto L6e
                            net.bytebuddy.description.annotation.AnnotationValue$ForEnumerationDescription$WithUnknownConstant r1 = new net.bytebuddy.description.annotation.AnnotationValue$ForEnumerationDescription$WithUnknownConstant
                            net.bytebuddy.description.type.TypeDescription r0 = r0.resolve()
                            java.lang.String r2 = r4.value
                            r1.<init>(r0, r2)
                            goto L7e
                        L6e:
                            net.bytebuddy.description.annotation.AnnotationValue$ForEnumerationDescription r1 = new net.bytebuddy.description.annotation.AnnotationValue$ForEnumerationDescription
                            net.bytebuddy.description.enumeration.EnumerationDescription$Latent r2 = new net.bytebuddy.description.enumeration.EnumerationDescription$Latent
                            net.bytebuddy.description.type.TypeDescription r0 = r0.resolve()
                            java.lang.String r3 = r4.value
                            r2.<init>(r0, r3)
                            r1.<init>(r2)
                        L7e:
                            if (r1 != 0) goto L83
                            net.bytebuddy.description.annotation.AnnotationValue r1 = r4.resolved
                            goto L85
                        L83:
                            r4.resolved = r1
                        L85:
                            return r1
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue
                    public net.bytebuddy.description.annotation.AnnotationValue.Sort getSort() {
                            r1 = this;
                            net.bytebuddy.description.annotation.AnnotationValue$Sort r0 = net.bytebuddy.description.annotation.AnnotationValue.Sort.ENUMERATION
                            return r0
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class ForMismatchedType<W, X> extends net.bytebuddy.description.annotation.AnnotationValue.AbstractBase<W, X> {
                    private final net.bytebuddy.description.annotation.AnnotationValue.Sort sort;
                    private final java.lang.String value;

                    private ForMismatchedType(java.lang.String r1, net.bytebuddy.description.annotation.AnnotationValue.Sort r2) {
                            r0 = this;
                            r0.<init>()
                            r0.value = r1
                            r0.sort = r2
                            return
                    }

                    public /* synthetic */ ForMismatchedType(java.lang.String r1, net.bytebuddy.description.annotation.AnnotationValue.Sort r2, net.bytebuddy.pool.TypePool.AnonymousClass1 r3) {
                            r0 = this;
                            r0.<init>(r1, r2)
                            return
                    }

                    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                            r4 = this;
                            r0 = 1
                            if (r4 != r5) goto L4
                            return r0
                        L4:
                            r1 = 0
                            if (r5 != 0) goto L8
                            return r1
                        L8:
                            java.lang.Class r2 = r4.getClass()
                            java.lang.Class r3 = r5.getClass()
                            if (r2 == r3) goto L13
                            return r1
                        L13:
                            net.bytebuddy.description.annotation.AnnotationValue$Sort r2 = r4.sort
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForMismatchedType r5 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyAnnotationValue.ForMismatchedType) r5
                            net.bytebuddy.description.annotation.AnnotationValue$Sort r3 = r5.sort
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L20
                            return r1
                        L20:
                            java.lang.String r2 = r4.value
                            java.lang.String r5 = r5.value
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L2b
                            return r1
                        L2b:
                            return r0
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue
                    public net.bytebuddy.description.annotation.AnnotationValue<W, X> filter(net.bytebuddy.description.method.MethodDescription.InDefinedShape r3, net.bytebuddy.description.type.TypeDefinition r4) {
                            r2 = this;
                            net.bytebuddy.description.annotation.AnnotationValue$ForMismatchedType r4 = new net.bytebuddy.description.annotation.AnnotationValue$ForMismatchedType
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.getReturnType()
                            boolean r0 = r0.isArray()
                            if (r0 == 0) goto L15
                            net.bytebuddy.description.annotation.AnnotationValue$RenderingDispatcher r0 = net.bytebuddy.description.annotation.AnnotationValue.RenderingDispatcher.CURRENT
                            net.bytebuddy.description.annotation.AnnotationValue$Sort r1 = r2.sort
                            java.lang.String r0 = r0.toArrayErrorString(r1)
                            goto L17
                        L15:
                            java.lang.String r0 = r2.value
                        L17:
                            r4.<init>(r3, r0)
                            return r4
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue
                    public net.bytebuddy.description.annotation.AnnotationValue.Sort getSort() {
                            r1 = this;
                            net.bytebuddy.description.annotation.AnnotationValue$Sort r0 = net.bytebuddy.description.annotation.AnnotationValue.Sort.NONE
                            return r0
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue
                    public net.bytebuddy.description.annotation.AnnotationValue.State getState() {
                            r1 = this;
                            net.bytebuddy.description.annotation.AnnotationValue$State r0 = net.bytebuddy.description.annotation.AnnotationValue.State.UNRESOLVED
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            java.lang.String r1 = r2.value
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.description.annotation.AnnotationValue$Sort r1 = r2.sort
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue
                    public net.bytebuddy.description.annotation.AnnotationValue.Loaded<X> load(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r2) {
                            r1 = this;
                            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                            java.lang.String r0 = "Expected filtering of this unresolved property"
                            r2.<init>(r0)
                            throw r2
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue
                    public W resolve() {
                            r2 = this;
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            java.lang.String r1 = "Expected filtering of this unresolved property"
                            r0.<init>(r1)
                            throw r0
                    }
                }

                public static class ForTypeValue extends net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyAnnotationValue<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> {
                    private transient /* synthetic */ net.bytebuddy.description.annotation.AnnotationValue resolved;
                    private final java.lang.String typeName;
                    private final net.bytebuddy.pool.TypePool typePool;

                    private ForTypeValue(net.bytebuddy.pool.TypePool r2, java.lang.String r3) {
                            r1 = this;
                            r0 = 0
                            r1.<init>(r0)
                            r1.typePool = r2
                            r1.typeName = r3
                            return
                    }

                    public /* synthetic */ ForTypeValue(net.bytebuddy.pool.TypePool r1, java.lang.String r2, net.bytebuddy.pool.TypePool.AnonymousClass1 r3) {
                            r0 = this;
                            r0.<init>(r1, r2)
                            return
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyAnnotationValue
                    @net.bytebuddy.build.CachedReturnPlugin.Enhance("resolved")
                    public net.bytebuddy.description.annotation.AnnotationValue<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> doResolve() {
                            r2 = this;
                            net.bytebuddy.description.annotation.AnnotationValue r0 = r2.resolved
                            if (r0 == 0) goto L6
                            r0 = 0
                            goto L26
                        L6:
                            net.bytebuddy.pool.TypePool r0 = r2.typePool
                            java.lang.String r1 = r2.typeName
                            net.bytebuddy.pool.TypePool$Resolution r0 = r0.describe(r1)
                            boolean r1 = r0.isResolved()
                            if (r1 == 0) goto L1f
                            net.bytebuddy.description.annotation.AnnotationValue$ForTypeDescription r1 = new net.bytebuddy.description.annotation.AnnotationValue$ForTypeDescription
                            net.bytebuddy.description.type.TypeDescription r0 = r0.resolve()
                            r1.<init>(r0)
                            r0 = r1
                            goto L26
                        L1f:
                            net.bytebuddy.description.annotation.AnnotationValue$ForMissingType r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForMissingType
                            java.lang.String r1 = r2.typeName
                            r0.<init>(r1)
                        L26:
                            if (r0 != 0) goto L2b
                            net.bytebuddy.description.annotation.AnnotationValue r0 = r2.resolved
                            goto L2d
                        L2b:
                            r2.resolved = r0
                        L2d:
                            return r0
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue
                    public net.bytebuddy.description.annotation.AnnotationValue.Sort getSort() {
                            r1 = this;
                            net.bytebuddy.description.annotation.AnnotationValue$Sort r0 = net.bytebuddy.description.annotation.AnnotationValue.Sort.TYPE
                            return r0
                    }
                }

                private LazyAnnotationValue() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                public /* synthetic */ LazyAnnotationValue(net.bytebuddy.pool.TypePool.AnonymousClass1 r1) {
                        r0 = this;
                        r0.<init>()
                        return
                }

                public abstract net.bytebuddy.description.annotation.AnnotationValue<U, V> doResolve();

                public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r2) {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationValue r0 = r1.doResolve()
                        boolean r2 = r0.equals(r2)
                        return r2
                }

                @Override // net.bytebuddy.description.annotation.AnnotationValue
                public net.bytebuddy.description.annotation.AnnotationValue<U, V> filter(net.bytebuddy.description.method.MethodDescription.InDefinedShape r2, net.bytebuddy.description.type.TypeDefinition r3) {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationValue r0 = r1.doResolve()
                        net.bytebuddy.description.annotation.AnnotationValue r2 = r0.filter(r2, r3)
                        return r2
                }

                @Override // net.bytebuddy.description.annotation.AnnotationValue
                public net.bytebuddy.description.annotation.AnnotationValue.State getState() {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationValue r0 = r1.doResolve()
                        net.bytebuddy.description.annotation.AnnotationValue$State r0 = r0.getState()
                        return r0
                }

                @net.bytebuddy.build.CachedReturnPlugin.Enhance("hashCode")
                public int hashCode() {
                        r1 = this;
                        int r0 = r1.hashCode
                        if (r0 == 0) goto L6
                        r0 = 0
                        goto Le
                    L6:
                        net.bytebuddy.description.annotation.AnnotationValue r0 = r1.doResolve()
                        int r0 = r0.hashCode()
                    Le:
                        if (r0 != 0) goto L13
                        int r0 = r1.hashCode
                        goto L15
                    L13:
                        r1.hashCode = r0
                    L15:
                        return r0
                }

                @Override // net.bytebuddy.description.annotation.AnnotationValue
                public net.bytebuddy.description.annotation.AnnotationValue.Loaded<V> load(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r2) {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationValue r0 = r1.doResolve()
                        net.bytebuddy.description.annotation.AnnotationValue$Loaded r2 = r0.load(r2)
                        return r2
                }

                @Override // net.bytebuddy.description.annotation.AnnotationValue
                public U resolve() {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationValue r0 = r1.doResolve()
                        java.lang.Object r0 = r0.resolve()
                        return r0
                }

                public java.lang.String toString() {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationValue r0 = r1.doResolve()
                        java.lang.String r0 = r0.toString()
                        return r0
                }
            }

            public class LazyFieldDescription extends net.bytebuddy.description.field.FieldDescription.InDefinedShape.AbstractBase {
                private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken> annotationTokens;
                private final java.lang.String descriptor;

                @net.bytebuddy.utility.nullability.MaybeNull
                private final java.lang.String genericSignature;
                private final int modifiers;
                private final java.lang.String name;
                private final net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForField signatureResolution;
                final /* synthetic */ net.bytebuddy.pool.TypePool.Default.LazyTypeDescription this$0;
                private final java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> typeAnnotationTokens;

                private LazyFieldDescription(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription r1, java.lang.String r2, int r3, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r4, java.lang.String r5, net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForField r6, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r7, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken> r8) {
                        r0 = this;
                        r0.this$0 = r1
                        r0.<init>()
                        r0.modifiers = r3
                        r0.name = r2
                        r0.descriptor = r4
                        r0.genericSignature = r5
                        r0.signatureResolution = r6
                        r0.typeAnnotationTokens = r7
                        r0.annotationTokens = r8
                        return
                }

                public /* synthetic */ LazyFieldDescription(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription r1, java.lang.String r2, int r3, java.lang.String r4, java.lang.String r5, net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForField r6, java.util.Map r7, java.util.List r8, net.bytebuddy.pool.TypePool.AnonymousClass1 r9) {
                        r0 = this;
                        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                        return
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                        r2 = this;
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription r0 = r2.this$0
                        net.bytebuddy.pool.TypePool r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.access$2500(r0)
                        java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken> r1 = r2.annotationTokens
                        net.bytebuddy.description.annotation.AnnotationList r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyAnnotationDescription.asListOfNullable(r0, r1)
                        return r0
                }

                @Override // net.bytebuddy.description.field.FieldDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
                @javax.annotation.Nonnull
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getDeclaringType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.getDeclaringType()
                        return r0
                }

                @Override // net.bytebuddy.description.field.FieldDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
                @javax.annotation.Nonnull
                public net.bytebuddy.description.type.TypeDescription getDeclaringType() {
                        r1 = this;
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription r0 = r1.this$0
                        return r0
                }

                @Override // net.bytebuddy.description.field.FieldDescription.AbstractBase, net.bytebuddy.description.NamedElement.WithDescriptor
                @net.bytebuddy.utility.nullability.MaybeNull
                public java.lang.String getGenericSignature() {
                        r1 = this;
                        java.lang.String r0 = r1.genericSignature
                        return r0
                }

                @Override // net.bytebuddy.description.ModifierReviewable
                public int getModifiers() {
                        r1 = this;
                        int r0 = r1.modifiers
                        return r0
                }

                @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
                public java.lang.String getName() {
                        r1 = this;
                        java.lang.String r0 = r1.name
                        return r0
                }

                @Override // net.bytebuddy.description.field.FieldDescription
                public net.bytebuddy.description.type.TypeDescription.Generic getType() {
                        r4 = this;
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForField r0 = r4.signatureResolution
                        java.lang.String r1 = r4.descriptor
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription r2 = r4.this$0
                        net.bytebuddy.pool.TypePool r2 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.access$2500(r2)
                        java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r3 = r4.typeAnnotationTokens
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.resolveFieldType(r1, r2, r3, r4)
                        return r0
                }
            }

            public class LazyMethodDescription extends net.bytebuddy.description.method.MethodDescription.InDefinedShape.AbstractBase {
                private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken> annotationTokens;

                @net.bytebuddy.utility.nullability.MaybeNull
                private final net.bytebuddy.description.annotation.AnnotationValue<?, ?> defaultValue;
                private final java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> exceptionTypeAnnotationTokens;
                private final java.util.List<java.lang.String> exceptionTypeDescriptors;

                @net.bytebuddy.utility.nullability.MaybeNull
                private final java.lang.String genericSignature;
                private final java.lang.String internalName;
                private final int modifiers;
                private final java.util.Map<java.lang.Integer, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> parameterAnnotationTokens;
                private final java.lang.Integer[] parameterModifiers;
                private final java.lang.String[] parameterNames;
                private final java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> parameterTypeAnnotationTokens;
                private final java.util.List<java.lang.String> parameterTypeDescriptors;
                private final java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> receiverTypeAnnotationTokens;
                private final java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> returnTypeAnnotationTokens;
                private final java.lang.String returnTypeDescriptor;
                private final net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForMethod signatureResolution;
                final /* synthetic */ net.bytebuddy.pool.TypePool.Default.LazyTypeDescription this$0;
                private final java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> typeVariableAnnotationTokens;
                private final java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>>> typeVariableBoundAnnotationTokens;

                public class LazyNonGenericReceiverType extends net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType {
                    final /* synthetic */ net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription this$1;
                    private final net.bytebuddy.description.type.TypeDescription typeDescription;

                    public LazyNonGenericReceiverType(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription r2) {
                            r1 = this;
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription r0 = r2.this$0
                            r1.<init>(r2, r0)
                            return
                    }

                    public LazyNonGenericReceiverType(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription r1, net.bytebuddy.description.type.TypeDescription r2) {
                            r0 = this;
                            r0.this$1 = r1
                            r0.<init>()
                            r0.typeDescription = r2
                            return
                    }

                    @Override // net.bytebuddy.description.type.TypeDefinition
                    public net.bytebuddy.description.type.TypeDescription asErasure() {
                            r1 = this;
                            net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                            return r0
                    }

                    @Override // net.bytebuddy.description.type.TypeDefinition
                    @net.bytebuddy.utility.nullability.MaybeNull
                    public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getComponentType() {
                            r1 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.getComponentType()
                            return r0
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic, net.bytebuddy.description.type.TypeDefinition
                    @net.bytebuddy.utility.nullability.MaybeNull
                    public net.bytebuddy.description.type.TypeDescription.Generic getComponentType() {
                            r1 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                            return r0
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationSource
                    public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                            r3 = this;
                            java.lang.StringBuilder r0 = new java.lang.StringBuilder
                            r0.<init>()
                            r1 = 0
                        L6:
                            net.bytebuddy.description.type.TypeDescription r2 = r3.typeDescription
                            int r2 = r2.getInnerClassCount()
                            if (r1 >= r2) goto L16
                            r2 = 46
                            r0.append(r2)
                            int r1 = r1 + 1
                            goto L6
                        L16:
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription r1 = r3.this$1
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription r1 = r1.this$0
                            net.bytebuddy.pool.TypePool r1 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.access$2500(r1)
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription r2 = r3.this$1
                            java.util.Map r2 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription.access$3300(r2)
                            java.lang.String r0 = r0.toString()
                            java.lang.Object r0 = r2.get(r0)
                            java.util.List r0 = (java.util.List) r0
                            net.bytebuddy.description.annotation.AnnotationList r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyAnnotationDescription.asListOfNullable(r1, r0)
                            return r0
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic
                    @net.bytebuddy.utility.nullability.MaybeNull
                    public net.bytebuddy.description.type.TypeDescription.Generic getOwnerType() {
                            r3 = this;
                            net.bytebuddy.description.type.TypeDescription r0 = r3.typeDescription
                            net.bytebuddy.description.type.TypeDescription r0 = r0.getDeclaringType()
                            if (r0 != 0) goto Lb
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                            goto L13
                        Lb:
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription$LazyNonGenericReceiverType r1 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription$LazyNonGenericReceiverType
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription r2 = r3.this$1
                            r1.<init>(r2, r0)
                            r0 = r1
                        L13:
                            return r0
                    }
                }

                public class LazyParameterDescription extends net.bytebuddy.description.method.ParameterDescription.InDefinedShape.AbstractBase {
                    private final int index;
                    final /* synthetic */ net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription this$1;

                    public LazyParameterDescription(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription r1, int r2) {
                            r0 = this;
                            r0.this$1 = r1
                            r0.<init>()
                            r0.index = r2
                            return
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationSource
                    public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                            r3 = this;
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription r0 = r3.this$1
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription r0 = r0.this$0
                            net.bytebuddy.pool.TypePool r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.access$2500(r0)
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription r1 = r3.this$1
                            java.util.Map r1 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription.access$3200(r1)
                            int r2 = r3.index
                            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                            java.lang.Object r1 = r1.get(r2)
                            java.util.List r1 = (java.util.List) r1
                            net.bytebuddy.description.annotation.AnnotationList r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyAnnotationDescription.asListOfNullable(r0, r1)
                            return r0
                    }

                    @Override // net.bytebuddy.description.method.ParameterDescription, net.bytebuddy.description.method.ParameterDescription.InDefinedShape
                    public net.bytebuddy.description.method.MethodDescription.InDefinedShape getDeclaringMethod() {
                            r1 = this;
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription r0 = r1.this$1
                            return r0
                    }

                    @Override // net.bytebuddy.description.method.ParameterDescription, net.bytebuddy.description.method.ParameterDescription.InDefinedShape
                    public /* bridge */ /* synthetic */ net.bytebuddy.description.method.MethodDescription getDeclaringMethod() {
                            r1 = this;
                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.getDeclaringMethod()
                            return r0
                    }

                    @Override // net.bytebuddy.description.method.ParameterDescription
                    public int getIndex() {
                            r1 = this;
                            int r0 = r1.index
                            return r0
                    }

                    @Override // net.bytebuddy.description.method.ParameterDescription.AbstractBase, net.bytebuddy.description.ModifierReviewable
                    public int getModifiers() {
                            r2 = this;
                            boolean r0 = r2.hasModifiers()
                            if (r0 == 0) goto L15
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription r0 = r2.this$1
                            java.lang.Integer[] r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription.access$2800(r0)
                            int r1 = r2.index
                            r0 = r0[r1]
                            int r0 = r0.intValue()
                            goto L19
                        L15:
                            int r0 = super.getModifiers()
                        L19:
                            return r0
                    }

                    @Override // net.bytebuddy.description.method.ParameterDescription.AbstractBase, net.bytebuddy.description.NamedElement.WithRuntimeName
                    public java.lang.String getName() {
                            r2 = this;
                            boolean r0 = r2.isNamed()
                            if (r0 == 0) goto L11
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription r0 = r2.this$1
                            java.lang.String[] r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription.access$2700(r0)
                            int r1 = r2.index
                            r0 = r0[r1]
                            goto L15
                        L11:
                            java.lang.String r0 = super.getName()
                        L15:
                            return r0
                    }

                    @Override // net.bytebuddy.description.method.ParameterDescription
                    public net.bytebuddy.description.type.TypeDescription.Generic getType() {
                            r5 = this;
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription r0 = r5.this$1
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForMethod r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription.access$3100(r0)
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription r1 = r5.this$1
                            java.util.List r1 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription.access$2900(r1)
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription r2 = r5.this$1
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription r2 = r2.this$0
                            net.bytebuddy.pool.TypePool r2 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.access$2500(r2)
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription r3 = r5.this$1
                            java.util.Map r3 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription.access$3000(r3)
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription r4 = r5.this$1
                            net.bytebuddy.description.type.TypeList$Generic r0 = r0.resolveParameterTypes(r1, r2, r3, r4)
                            int r1 = r5.index
                            java.lang.Object r0 = r0.get(r1)
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                            return r0
                    }

                    @Override // net.bytebuddy.description.method.ParameterDescription
                    public boolean hasModifiers() {
                            r2 = this;
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription r0 = r2.this$1
                            java.lang.Integer[] r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription.access$2800(r0)
                            int r1 = r2.index
                            r0 = r0[r1]
                            if (r0 == 0) goto Le
                            r0 = 1
                            goto Lf
                        Le:
                            r0 = 0
                        Lf:
                            return r0
                    }

                    @Override // net.bytebuddy.description.NamedElement.WithOptionalName
                    public boolean isNamed() {
                            r2 = this;
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription r0 = r2.this$1
                            java.lang.String[] r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription.access$2700(r0)
                            int r1 = r2.index
                            r0 = r0[r1]
                            if (r0 == 0) goto Le
                            r0 = 1
                            goto Lf
                        Le:
                            r0 = 0
                        Lf:
                            return r0
                    }
                }

                public class LazyParameterList extends net.bytebuddy.description.method.ParameterList.AbstractBase<net.bytebuddy.description.method.ParameterDescription.InDefinedShape> {
                    final /* synthetic */ net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription this$1;

                    private LazyParameterList(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription r1) {
                            r0 = this;
                            r0.this$1 = r1
                            r0.<init>()
                            return
                    }

                    public /* synthetic */ LazyParameterList(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription r1, net.bytebuddy.pool.TypePool.AnonymousClass1 r2) {
                            r0 = this;
                            r0.<init>(r1)
                            return
                    }

                    @Override // net.bytebuddy.description.method.ParameterList.AbstractBase, net.bytebuddy.description.method.ParameterList
                    public net.bytebuddy.description.type.TypeList.Generic asTypeList() {
                            r5 = this;
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription r0 = r5.this$1
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForMethod r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription.access$3100(r0)
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription r1 = r5.this$1
                            java.util.List r1 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription.access$2900(r1)
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription r2 = r5.this$1
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription r2 = r2.this$0
                            net.bytebuddy.pool.TypePool r2 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.access$2500(r2)
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription r3 = r5.this$1
                            java.util.Map r3 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription.access$3000(r3)
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription r4 = r5.this$1
                            net.bytebuddy.description.type.TypeList$Generic r0 = r0.resolveParameterTypes(r1, r2, r3, r4)
                            return r0
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                            r0 = this;
                            net.bytebuddy.description.method.ParameterDescription$InDefinedShape r1 = r0.get(r1)
                            return r1
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public net.bytebuddy.description.method.ParameterDescription.InDefinedShape get(int r3) {
                            r2 = this;
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription$LazyParameterDescription r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription$LazyParameterDescription
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription r1 = r2.this$1
                            r0.<init>(r1, r3)
                            return r0
                    }

                    @Override // net.bytebuddy.description.method.ParameterList.AbstractBase, net.bytebuddy.description.method.ParameterList
                    public boolean hasExplicitMetaData() {
                            r3 = this;
                            r0 = 0
                            r1 = r0
                        L2:
                            int r2 = r3.size()
                            if (r1 >= r2) goto L21
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription r2 = r3.this$1
                            java.lang.String[] r2 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription.access$2700(r2)
                            r2 = r2[r1]
                            if (r2 == 0) goto L20
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription r2 = r3.this$1
                            java.lang.Integer[] r2 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription.access$2800(r2)
                            r2 = r2[r1]
                            if (r2 != 0) goto L1d
                            goto L20
                        L1d:
                            int r1 = r1 + 1
                            goto L2
                        L20:
                            return r0
                        L21:
                            r0 = 1
                            return r0
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public int size() {
                            r1 = this;
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription r0 = r1.this$1
                            java.util.List r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription.access$2900(r0)
                            int r0 = r0.size()
                            return r0
                    }
                }

                public class LazyParameterizedReceiverType extends net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType {
                    final /* synthetic */ net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription this$1;
                    private final net.bytebuddy.description.type.TypeDescription typeDescription;

                    public class TypeArgumentList extends net.bytebuddy.description.type.TypeList.Generic.AbstractBase {
                        final /* synthetic */ net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription.LazyParameterizedReceiverType this$2;
                        private final java.util.List<? extends net.bytebuddy.description.type.TypeDescription.Generic> typeVariables;

                        public class AnnotatedTypeVariable extends net.bytebuddy.description.type.TypeDescription.Generic.OfTypeVariable {
                            private final int index;
                            final /* synthetic */ net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription.LazyParameterizedReceiverType.TypeArgumentList this$3;
                            private final net.bytebuddy.description.type.TypeDescription.Generic typeVariable;

                            public AnnotatedTypeVariable(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription.LazyParameterizedReceiverType.TypeArgumentList r1, net.bytebuddy.description.type.TypeDescription.Generic r2, int r3) {
                                    r0 = this;
                                    r0.this$3 = r1
                                    r0.<init>()
                                    r0.typeVariable = r2
                                    r0.index = r3
                                    return
                            }

                            @Override // net.bytebuddy.description.annotation.AnnotationSource
                            public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                                    r4 = this;
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription$LazyParameterizedReceiverType$TypeArgumentList r0 = r4.this$3
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription$LazyParameterizedReceiverType r0 = r0.this$2
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription r0 = r0.this$1
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription r0 = r0.this$0
                                    net.bytebuddy.pool.TypePool r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.access$2500(r0)
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription$LazyParameterizedReceiverType$TypeArgumentList r1 = r4.this$3
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription$LazyParameterizedReceiverType r1 = r1.this$2
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription r1 = r1.this$1
                                    java.util.Map r1 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription.access$3300(r1)
                                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                                    r2.<init>()
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription$LazyParameterizedReceiverType$TypeArgumentList r3 = r4.this$3
                                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription$LazyParameterizedReceiverType r3 = r3.this$2
                                    java.lang.String r3 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription.LazyParameterizedReceiverType.access$3400(r3)
                                    r2.append(r3)
                                    int r3 = r4.index
                                    r2.append(r3)
                                    r3 = 59
                                    r2.append(r3)
                                    java.lang.String r2 = r2.toString()
                                    java.lang.Object r1 = r1.get(r2)
                                    java.util.List r1 = (java.util.List) r1
                                    net.bytebuddy.description.annotation.AnnotationList r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyAnnotationDescription.asListOfNullable(r0, r1)
                                    return r0
                            }

                            @Override // net.bytebuddy.description.type.TypeDescription.Generic
                            public java.lang.String getSymbol() {
                                    r1 = this;
                                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.typeVariable
                                    java.lang.String r0 = r0.getSymbol()
                                    return r0
                            }

                            @Override // net.bytebuddy.description.type.TypeDescription.Generic
                            public net.bytebuddy.description.TypeVariableSource getTypeVariableSource() {
                                    r1 = this;
                                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.typeVariable
                                    net.bytebuddy.description.TypeVariableSource r0 = r0.getTypeVariableSource()
                                    return r0
                            }

                            @Override // net.bytebuddy.description.type.TypeDescription.Generic
                            public net.bytebuddy.description.type.TypeList.Generic getUpperBounds() {
                                    r1 = this;
                                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.typeVariable
                                    net.bytebuddy.description.type.TypeList$Generic r0 = r0.getUpperBounds()
                                    return r0
                            }
                        }

                        public TypeArgumentList(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription.LazyParameterizedReceiverType r1, java.util.List<? extends net.bytebuddy.description.type.TypeDescription.Generic> r2) {
                                r0 = this;
                                r0.this$2 = r1
                                r0.<init>()
                                r0.typeVariables = r2
                                return
                        }

                        @Override // java.util.AbstractList, java.util.List
                        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                                r0 = this;
                                net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.get(r1)
                                return r1
                        }

                        @Override // java.util.AbstractList, java.util.List
                        public net.bytebuddy.description.type.TypeDescription.Generic get(int r3) {
                                r2 = this;
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription$LazyParameterizedReceiverType$TypeArgumentList$AnnotatedTypeVariable r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription$LazyParameterizedReceiverType$TypeArgumentList$AnnotatedTypeVariable
                                java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r1 = r2.typeVariables
                                java.lang.Object r1 = r1.get(r3)
                                net.bytebuddy.description.type.TypeDescription$Generic r1 = (net.bytebuddy.description.type.TypeDescription.Generic) r1
                                r0.<init>(r2, r1, r3)
                                return r0
                        }

                        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                        public int size() {
                                r1 = this;
                                java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r0 = r1.typeVariables
                                int r0 = r0.size()
                                return r0
                        }
                    }

                    public LazyParameterizedReceiverType(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription r2) {
                            r1 = this;
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription r0 = r2.this$0
                            r1.<init>(r2, r0)
                            return
                    }

                    public LazyParameterizedReceiverType(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription r1, net.bytebuddy.description.type.TypeDescription r2) {
                            r0 = this;
                            r0.this$1 = r1
                            r0.<init>()
                            r0.typeDescription = r2
                            return
                    }

                    public static /* synthetic */ java.lang.String access$3400(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription.LazyParameterizedReceiverType r0) {
                            java.lang.String r0 = r0.getTypePath()
                            return r0
                    }

                    private java.lang.String getTypePath() {
                            r3 = this;
                            java.lang.StringBuilder r0 = new java.lang.StringBuilder
                            r0.<init>()
                            r1 = 0
                        L6:
                            net.bytebuddy.description.type.TypeDescription r2 = r3.typeDescription
                            int r2 = r2.getInnerClassCount()
                            if (r1 >= r2) goto L16
                            r2 = 46
                            r0.append(r2)
                            int r1 = r1 + 1
                            goto L6
                        L16:
                            java.lang.String r0 = r0.toString()
                            return r0
                    }

                    @Override // net.bytebuddy.description.type.TypeDefinition
                    public net.bytebuddy.description.type.TypeDescription asErasure() {
                            r1 = this;
                            net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                            return r0
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationSource
                    public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                            r3 = this;
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription r0 = r3.this$1
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription r0 = r0.this$0
                            net.bytebuddy.pool.TypePool r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.access$2500(r0)
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription r1 = r3.this$1
                            java.util.Map r1 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription.access$3300(r1)
                            java.lang.String r2 = r3.getTypePath()
                            java.lang.Object r1 = r1.get(r2)
                            java.util.List r1 = (java.util.List) r1
                            net.bytebuddy.description.annotation.AnnotationList r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyAnnotationDescription.asListOfNullable(r0, r1)
                            return r0
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic
                    @net.bytebuddy.utility.nullability.MaybeNull
                    public net.bytebuddy.description.type.TypeDescription.Generic getOwnerType() {
                            r3 = this;
                            net.bytebuddy.description.type.TypeDescription r0 = r3.typeDescription
                            net.bytebuddy.description.type.TypeDescription r0 = r0.getDeclaringType()
                            if (r0 != 0) goto Lb
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                            return r0
                        Lb:
                            net.bytebuddy.description.type.TypeDescription r1 = r3.typeDescription
                            boolean r1 = r1.isStatic()
                            if (r1 != 0) goto L21
                            boolean r1 = r0.isGenerified()
                            if (r1 == 0) goto L21
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription$LazyParameterizedReceiverType r1 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription$LazyParameterizedReceiverType
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription r2 = r3.this$1
                            r1.<init>(r2, r0)
                            goto L28
                        L21:
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription$LazyNonGenericReceiverType r1 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription$LazyNonGenericReceiverType
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription r2 = r3.this$1
                            r1.<init>(r2, r0)
                        L28:
                            return r1
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic
                    public net.bytebuddy.description.type.TypeList.Generic getTypeArguments() {
                            r2 = this;
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription$LazyParameterizedReceiverType$TypeArgumentList r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription$LazyParameterizedReceiverType$TypeArgumentList
                            net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                            net.bytebuddy.description.type.TypeList$Generic r1 = r1.getTypeVariables()
                            r0.<init>(r2, r1)
                            return r0
                    }
                }

                private LazyMethodDescription(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription r9, java.lang.String r10, int r11, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r12, java.lang.String r13, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForMethod r14, java.lang.String[] r15, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> r16, java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>>> r17, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r18, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> r19, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> r20, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r21, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken> r22, java.util.Map<java.lang.Integer, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r23, @net.bytebuddy.utility.nullability.MaybeNull java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.MethodToken.ParameterToken> r24, net.bytebuddy.description.annotation.AnnotationValue<?, ?> r25) {
                        r8 = this;
                        r0 = r8
                        r1 = r15
                        r2 = r9
                        r0.this$0 = r2
                        r8.<init>()
                        r2 = r11
                        r0.modifiers = r2
                        r2 = r10
                        r0.internalName = r2
                        net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.getMethodType(r12)
                        net.bytebuddy.jar.asm.Type r3 = r2.getReturnType()
                        net.bytebuddy.jar.asm.Type[] r2 = r2.getArgumentTypes()
                        java.lang.String r3 = r3.getDescriptor()
                        r0.returnTypeDescriptor = r3
                        java.util.ArrayList r3 = new java.util.ArrayList
                        int r4 = r2.length
                        r3.<init>(r4)
                        r0.parameterTypeDescriptors = r3
                        int r3 = r2.length
                        r4 = 0
                        r5 = r4
                    L2b:
                        if (r5 >= r3) goto L3b
                        r6 = r2[r5]
                        java.util.List<java.lang.String> r7 = r0.parameterTypeDescriptors
                        java.lang.String r6 = r6.getDescriptor()
                        r7.add(r6)
                        int r5 = r5 + 1
                        goto L2b
                    L3b:
                        r5 = r13
                        r0.genericSignature = r5
                        r3 = r14
                        r0.signatureResolution = r3
                        if (r1 != 0) goto L4c
                        java.util.List r1 = java.util.Collections.emptyList()
                        r0.exceptionTypeDescriptors = r1
                    L49:
                        r1 = r16
                        goto L6a
                    L4c:
                        java.util.ArrayList r3 = new java.util.ArrayList
                        int r5 = r1.length
                        r3.<init>(r5)
                        r0.exceptionTypeDescriptors = r3
                        int r3 = r1.length
                        r5 = r4
                    L56:
                        if (r5 >= r3) goto L49
                        r6 = r1[r5]
                        java.util.List<java.lang.String> r7 = r0.exceptionTypeDescriptors
                        net.bytebuddy.jar.asm.Type r6 = net.bytebuddy.jar.asm.Type.getObjectType(r6)
                        java.lang.String r6 = r6.getDescriptor()
                        r7.add(r6)
                        int r5 = r5 + 1
                        goto L56
                    L6a:
                        r0.typeVariableAnnotationTokens = r1
                        r1 = r17
                        r0.typeVariableBoundAnnotationTokens = r1
                        r1 = r18
                        r0.returnTypeAnnotationTokens = r1
                        r1 = r19
                        r0.parameterTypeAnnotationTokens = r1
                        r1 = r20
                        r0.exceptionTypeAnnotationTokens = r1
                        r1 = r21
                        r0.receiverTypeAnnotationTokens = r1
                        r1 = r22
                        r0.annotationTokens = r1
                        r1 = r23
                        r0.parameterAnnotationTokens = r1
                        int r1 = r2.length
                        java.lang.String[] r1 = new java.lang.String[r1]
                        r0.parameterNames = r1
                        int r1 = r2.length
                        java.lang.Integer[] r1 = new java.lang.Integer[r1]
                        r0.parameterModifiers = r1
                        int r1 = r24.size()
                        int r2 = r2.length
                        if (r1 != r2) goto Lbc
                        java.util.Iterator r1 = r24.iterator()
                    L9d:
                        boolean r2 = r1.hasNext()
                        if (r2 == 0) goto Lbc
                        java.lang.Object r2 = r1.next()
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$MethodToken$ParameterToken r2 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.MethodToken.ParameterToken) r2
                        java.lang.String[] r3 = r0.parameterNames
                        java.lang.String r5 = r2.getName()
                        r3[r4] = r5
                        java.lang.Integer[] r3 = r0.parameterModifiers
                        java.lang.Integer r2 = r2.getModifiers()
                        r3[r4] = r2
                        int r4 = r4 + 1
                        goto L9d
                    Lbc:
                        r1 = r25
                        r0.defaultValue = r1
                        return
                }

                public /* synthetic */ LazyMethodDescription(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription r1, java.lang.String r2, int r3, java.lang.String r4, java.lang.String r5, net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForMethod r6, java.lang.String[] r7, java.util.Map r8, java.util.Map r9, java.util.Map r10, java.util.Map r11, java.util.Map r12, java.util.Map r13, java.util.List r14, java.util.Map r15, java.util.List r16, net.bytebuddy.description.annotation.AnnotationValue r17, net.bytebuddy.pool.TypePool.AnonymousClass1 r18) {
                        r0 = this;
                        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                        return
                }

                public static /* synthetic */ java.lang.String[] access$2700(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription r0) {
                        java.lang.String[] r0 = r0.parameterNames
                        return r0
                }

                public static /* synthetic */ java.lang.Integer[] access$2800(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription r0) {
                        java.lang.Integer[] r0 = r0.parameterModifiers
                        return r0
                }

                public static /* synthetic */ java.util.List access$2900(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription r0) {
                        java.util.List<java.lang.String> r0 = r0.parameterTypeDescriptors
                        return r0
                }

                public static /* synthetic */ java.util.Map access$3000(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription r0) {
                        java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>> r0 = r0.parameterTypeAnnotationTokens
                        return r0
                }

                public static /* synthetic */ net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForMethod access$3100(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription r0) {
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForMethod r0 = r0.signatureResolution
                        return r0
                }

                public static /* synthetic */ java.util.Map access$3200(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription r0) {
                        java.util.Map<java.lang.Integer, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r0 = r0.parameterAnnotationTokens
                        return r0
                }

                public static /* synthetic */ java.util.Map access$3300(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyMethodDescription r0) {
                        java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r0 = r0.receiverTypeAnnotationTokens
                        return r0
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                        r2 = this;
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription r0 = r2.this$0
                        net.bytebuddy.pool.TypePool r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.access$2500(r0)
                        java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken> r1 = r2.annotationTokens
                        net.bytebuddy.description.annotation.AnnotationList r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyAnnotationDescription.asList(r0, r1)
                        return r0
                }

                @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
                @javax.annotation.Nonnull
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getDeclaringType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.getDeclaringType()
                        return r0
                }

                @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
                @javax.annotation.Nonnull
                public net.bytebuddy.description.type.TypeDescription getDeclaringType() {
                        r1 = this;
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription r0 = r1.this$0
                        return r0
                }

                @Override // net.bytebuddy.description.method.MethodDescription
                @net.bytebuddy.utility.nullability.MaybeNull
                public net.bytebuddy.description.annotation.AnnotationValue<?, ?> getDefaultValue() {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationValue<?, ?> r0 = r1.defaultValue
                        return r0
                }

                @Override // net.bytebuddy.description.method.MethodDescription
                public net.bytebuddy.description.type.TypeList.Generic getExceptionTypes() {
                        r4 = this;
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForMethod r0 = r4.signatureResolution
                        java.util.List<java.lang.String> r1 = r4.exceptionTypeDescriptors
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription r2 = r4.this$0
                        net.bytebuddy.pool.TypePool r2 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.access$2500(r2)
                        java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>> r3 = r4.exceptionTypeAnnotationTokens
                        net.bytebuddy.description.type.TypeList$Generic r0 = r0.resolveExceptionTypes(r1, r2, r3, r4)
                        return r0
                }

                @Override // net.bytebuddy.description.method.MethodDescription.AbstractBase, net.bytebuddy.description.NamedElement.WithDescriptor
                @net.bytebuddy.utility.nullability.MaybeNull
                public java.lang.String getGenericSignature() {
                        r1 = this;
                        java.lang.String r0 = r1.genericSignature
                        return r0
                }

                @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
                public java.lang.String getInternalName() {
                        r1 = this;
                        java.lang.String r0 = r1.internalName
                        return r0
                }

                @Override // net.bytebuddy.description.ModifierReviewable
                public int getModifiers() {
                        r1 = this;
                        int r0 = r1.modifiers
                        return r0
                }

                @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.method.MethodDescription.InDefinedShape
                public net.bytebuddy.description.method.ParameterList<net.bytebuddy.description.method.ParameterDescription.InDefinedShape> getParameters() {
                        r2 = this;
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription$LazyParameterList r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription$LazyParameterList
                        r1 = 0
                        r0.<init>(r2, r1)
                        return r0
                }

                @Override // net.bytebuddy.description.method.MethodDescription.InDefinedShape.AbstractBase, net.bytebuddy.description.method.MethodDescription
                @net.bytebuddy.utility.nullability.MaybeNull
                public net.bytebuddy.description.type.TypeDescription.Generic getReceiverType() {
                        r3 = this;
                        boolean r0 = r3.isStatic()
                        if (r0 == 0) goto L9
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                        return r0
                    L9:
                        boolean r0 = r3.isConstructor()
                        if (r0 == 0) goto L43
                        net.bytebuddy.description.type.TypeDescription r0 = r3.getDeclaringType()
                        net.bytebuddy.description.type.TypeDescription r1 = r0.getEnclosingType()
                        if (r1 != 0) goto L2b
                        boolean r1 = r0.isGenerified()
                        if (r1 == 0) goto L25
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription$LazyParameterizedReceiverType r1 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription$LazyParameterizedReceiverType
                        r1.<init>(r3, r0)
                        goto L2a
                    L25:
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription$LazyNonGenericReceiverType r1 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription$LazyNonGenericReceiverType
                        r1.<init>(r3, r0)
                    L2a:
                        return r1
                    L2b:
                        boolean r2 = r0.isStatic()
                        if (r2 != 0) goto L3d
                        boolean r0 = r0.isGenerified()
                        if (r0 == 0) goto L3d
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription$LazyParameterizedReceiverType r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription$LazyParameterizedReceiverType
                        r0.<init>(r3, r1)
                        goto L42
                    L3d:
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription$LazyNonGenericReceiverType r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription$LazyNonGenericReceiverType
                        r0.<init>(r3, r1)
                    L42:
                        return r0
                    L43:
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription r0 = r3.this$0
                        boolean r0 = r0.isGenerified()
                        if (r0 == 0) goto L51
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription$LazyParameterizedReceiverType r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription$LazyParameterizedReceiverType
                        r0.<init>(r3)
                        goto L56
                    L51:
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription$LazyNonGenericReceiverType r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription$LazyNonGenericReceiverType
                        r0.<init>(r3)
                    L56:
                        return r0
                }

                @Override // net.bytebuddy.description.method.MethodDescription
                public net.bytebuddy.description.type.TypeDescription.Generic getReturnType() {
                        r4 = this;
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForMethod r0 = r4.signatureResolution
                        java.lang.String r1 = r4.returnTypeDescriptor
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription r2 = r4.this$0
                        net.bytebuddy.pool.TypePool r2 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.access$2500(r2)
                        java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r3 = r4.returnTypeAnnotationTokens
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.resolveReturnType(r1, r2, r3, r4)
                        return r0
                }

                @Override // net.bytebuddy.description.TypeVariableSource
                public net.bytebuddy.description.type.TypeList.Generic getTypeVariables() {
                        r4 = this;
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForMethod r0 = r4.signatureResolution
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription r1 = r4.this$0
                        net.bytebuddy.pool.TypePool r1 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.access$2500(r1)
                        java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>> r2 = r4.typeVariableAnnotationTokens
                        java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>>> r3 = r4.typeVariableBoundAnnotationTokens
                        net.bytebuddy.description.type.TypeList$Generic r0 = r0.resolveTypeVariables(r1, r4, r2, r3)
                        return r0
                }
            }

            public static class LazyNestMemberList extends net.bytebuddy.description.type.TypeList.AbstractBase {
                private final java.util.List<java.lang.String> nestMembers;
                private final net.bytebuddy.description.type.TypeDescription typeDescription;
                private final net.bytebuddy.pool.TypePool typePool;

                public LazyNestMemberList(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.pool.TypePool r2, java.util.List<java.lang.String> r3) {
                        r0 = this;
                        r0.<init>()
                        r0.typeDescription = r1
                        r0.typePool = r2
                        r0.nestMembers = r3
                        return
                }

                @Override // java.util.AbstractList, java.util.List
                public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription r1 = r0.get(r1)
                        return r1
                }

                @Override // java.util.AbstractList, java.util.List
                public net.bytebuddy.description.type.TypeDescription get(int r3) {
                        r2 = this;
                        if (r3 != 0) goto L5
                        net.bytebuddy.description.type.TypeDescription r3 = r2.typeDescription
                        goto L19
                    L5:
                        net.bytebuddy.pool.TypePool r0 = r2.typePool
                        java.util.List<java.lang.String> r1 = r2.nestMembers
                        int r3 = r3 + (-1)
                        java.lang.Object r3 = r1.get(r3)
                        java.lang.String r3 = (java.lang.String) r3
                        net.bytebuddy.pool.TypePool$Resolution r3 = r0.describe(r3)
                        net.bytebuddy.description.type.TypeDescription r3 = r3.resolve()
                    L19:
                        return r3
                }

                @Override // net.bytebuddy.description.type.TypeList.AbstractBase, net.bytebuddy.description.type.TypeList
                public int getStackSize() {
                        r1 = this;
                        java.util.List<java.lang.String> r0 = r1.nestMembers
                        int r0 = r0.size()
                        int r0 = r0 + 1
                        return r0
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                        r1 = this;
                        java.util.List<java.lang.String> r0 = r1.nestMembers
                        int r0 = r0.size()
                        int r0 = r0 + 1
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeList.AbstractBase, net.bytebuddy.description.type.TypeList
                public java.lang.String[] toInternalNames() {
                        r7 = this;
                        java.util.List<java.lang.String> r0 = r7.nestMembers
                        int r0 = r0.size()
                        r1 = 1
                        int r0 = r0 + r1
                        java.lang.String[] r0 = new java.lang.String[r0]
                        net.bytebuddy.description.type.TypeDescription r2 = r7.typeDescription
                        java.lang.String r2 = r2.getInternalName()
                        r3 = 0
                        r0[r3] = r2
                        java.util.List<java.lang.String> r2 = r7.nestMembers
                        java.util.Iterator r2 = r2.iterator()
                    L19:
                        boolean r3 = r2.hasNext()
                        if (r3 == 0) goto L33
                        java.lang.Object r3 = r2.next()
                        java.lang.String r3 = (java.lang.String) r3
                        int r4 = r1 + 1
                        r5 = 46
                        r6 = 47
                        java.lang.String r3 = r3.replace(r5, r6)
                        r0[r1] = r3
                        r1 = r4
                        goto L19
                    L33:
                        return r0
                }
            }

            public static class LazyPackageDescription extends net.bytebuddy.description.type.PackageDescription.AbstractBase {
                private final java.lang.String name;
                private final net.bytebuddy.pool.TypePool typePool;

                private LazyPackageDescription(net.bytebuddy.pool.TypePool r1, java.lang.String r2) {
                        r0 = this;
                        r0.<init>()
                        r0.typePool = r1
                        r0.name = r2
                        return
                }

                public /* synthetic */ LazyPackageDescription(net.bytebuddy.pool.TypePool r1, java.lang.String r2, net.bytebuddy.pool.TypePool.AnonymousClass1 r3) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                        r3 = this;
                        net.bytebuddy.pool.TypePool r0 = r3.typePool
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = r3.name
                        r1.append(r2)
                        java.lang.String r2 = "."
                        r1.append(r2)
                        java.lang.String r2 = "package-info"
                        r1.append(r2)
                        java.lang.String r1 = r1.toString()
                        net.bytebuddy.pool.TypePool$Resolution r0 = r0.describe(r1)
                        boolean r1 = r0.isResolved()
                        if (r1 == 0) goto L2d
                        net.bytebuddy.description.type.TypeDescription r0 = r0.resolve()
                        net.bytebuddy.description.annotation.AnnotationList r0 = r0.getDeclaredAnnotations()
                        goto L32
                    L2d:
                        net.bytebuddy.description.annotation.AnnotationList$Empty r0 = new net.bytebuddy.description.annotation.AnnotationList$Empty
                        r0.<init>()
                    L32:
                        return r0
                }

                @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
                public java.lang.String getName() {
                        r1 = this;
                        java.lang.String r0 = r1.name
                        return r0
                }
            }

            public class LazyRecordComponentDescription extends net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape.AbstractBase {
                private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken> annotationTokens;
                private final java.lang.String descriptor;

                @net.bytebuddy.utility.nullability.MaybeNull
                private final java.lang.String genericSignature;
                private final java.lang.String name;
                private final net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForRecordComponent signatureResolution;
                final /* synthetic */ net.bytebuddy.pool.TypePool.Default.LazyTypeDescription this$0;
                private final java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> typeAnnotationTokens;

                private LazyRecordComponentDescription(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription r1, java.lang.String r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r3, java.lang.String r4, net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForRecordComponent r5, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r6, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken> r7) {
                        r0 = this;
                        r0.this$0 = r1
                        r0.<init>()
                        r0.name = r2
                        r0.descriptor = r3
                        r0.genericSignature = r4
                        r0.signatureResolution = r5
                        r0.typeAnnotationTokens = r6
                        r0.annotationTokens = r7
                        return
                }

                public /* synthetic */ LazyRecordComponentDescription(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForRecordComponent r5, java.util.Map r6, java.util.List r7, net.bytebuddy.pool.TypePool.AnonymousClass1 r8) {
                        r0 = this;
                        r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                        return
                }

                @Override // net.bytebuddy.description.NamedElement
                public java.lang.String getActualName() {
                        r1 = this;
                        java.lang.String r0 = r1.name
                        return r0
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                        r2 = this;
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription r0 = r2.this$0
                        net.bytebuddy.pool.TypePool r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.access$2500(r0)
                        java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken> r1 = r2.annotationTokens
                        net.bytebuddy.description.annotation.AnnotationList r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyAnnotationDescription.asList(r0, r1)
                        return r0
                }

                @Override // net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
                @javax.annotation.Nonnull
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getDeclaringType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.getDeclaringType()
                        return r0
                }

                @Override // net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
                @javax.annotation.Nonnull
                public net.bytebuddy.description.type.TypeDescription getDeclaringType() {
                        r1 = this;
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription r0 = r1.this$0
                        return r0
                }

                @Override // net.bytebuddy.description.type.RecordComponentDescription.AbstractBase, net.bytebuddy.description.NamedElement.WithDescriptor
                @net.bytebuddy.utility.nullability.MaybeNull
                public java.lang.String getGenericSignature() {
                        r1 = this;
                        java.lang.String r0 = r1.genericSignature
                        return r0
                }

                @Override // net.bytebuddy.description.type.RecordComponentDescription
                public net.bytebuddy.description.type.TypeDescription.Generic getType() {
                        r4 = this;
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForRecordComponent r0 = r4.signatureResolution
                        java.lang.String r1 = r4.descriptor
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription r2 = r4.this$0
                        net.bytebuddy.pool.TypePool r2 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.access$2500(r2)
                        java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r3 = r4.typeAnnotationTokens
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.resolveRecordType(r1, r2, r3, r4)
                        return r0
                }
            }

            public static class LazyTypeList extends net.bytebuddy.description.type.TypeList.AbstractBase {
                private final java.util.List<java.lang.String> descriptors;
                private final net.bytebuddy.pool.TypePool typePool;

                public LazyTypeList(net.bytebuddy.pool.TypePool r1, java.util.List<java.lang.String> r2) {
                        r0 = this;
                        r0.<init>()
                        r0.typePool = r1
                        r0.descriptors = r2
                        return
                }

                @Override // java.util.AbstractList, java.util.List
                public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription r1 = r0.get(r1)
                        return r1
                }

                @Override // java.util.AbstractList, java.util.List
                public net.bytebuddy.description.type.TypeDescription get(int r3) {
                        r2 = this;
                        net.bytebuddy.pool.TypePool r0 = r2.typePool
                        java.util.List<java.lang.String> r1 = r2.descriptors
                        java.lang.Object r3 = r1.get(r3)
                        java.lang.String r3 = (java.lang.String) r3
                        net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TokenizedGenericType.toErasure(r0, r3)
                        return r3
                }

                @Override // net.bytebuddy.description.type.TypeList.AbstractBase, net.bytebuddy.description.type.TypeList
                public int getStackSize() {
                        r3 = this;
                        java.util.List<java.lang.String> r0 = r3.descriptors
                        java.util.Iterator r0 = r0.iterator()
                        r1 = 0
                    L7:
                        boolean r2 = r0.hasNext()
                        if (r2 == 0) goto L1d
                        java.lang.Object r2 = r0.next()
                        java.lang.String r2 = (java.lang.String) r2
                        net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.getType(r2)
                        int r2 = r2.getSize()
                        int r1 = r1 + r2
                        goto L7
                    L1d:
                        return r1
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                        r1 = this;
                        java.util.List<java.lang.String> r0 = r1.descriptors
                        int r0 = r0.size()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeList.AbstractBase, net.bytebuddy.description.type.TypeList
                @net.bytebuddy.utility.nullability.MaybeNull
                public java.lang.String[] toInternalNames() {
                        r6 = this;
                        java.util.List<java.lang.String> r0 = r6.descriptors
                        int r0 = r0.size()
                        java.lang.String[] r1 = new java.lang.String[r0]
                        java.util.List<java.lang.String> r2 = r6.descriptors
                        java.util.Iterator r2 = r2.iterator()
                        r3 = 0
                    Lf:
                        boolean r4 = r2.hasNext()
                        if (r4 == 0) goto L29
                        java.lang.Object r4 = r2.next()
                        java.lang.String r4 = (java.lang.String) r4
                        int r5 = r3 + 1
                        net.bytebuddy.jar.asm.Type r4 = net.bytebuddy.jar.asm.Type.getType(r4)
                        java.lang.String r4 = r4.getInternalName()
                        r1[r3] = r4
                        r3 = r5
                        goto Lf
                    L29:
                        if (r0 != 0) goto L2d
                        java.lang.String[] r1 = net.bytebuddy.description.type.TypeList.NO_INTERFACES
                    L2d:
                        return r1
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class MethodToken {
                private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken> annotationTokens;

                @net.bytebuddy.utility.nullability.UnknownNull
                private final net.bytebuddy.description.annotation.AnnotationValue<?, ?> defaultValue;
                private final java.lang.String descriptor;

                @net.bytebuddy.utility.nullability.MaybeNull
                private final java.lang.String[] exceptionName;
                private final java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> exceptionTypeAnnotationTokens;

                @net.bytebuddy.utility.nullability.UnknownNull
                private final java.lang.String genericSignature;
                private final int modifiers;
                private final java.lang.String name;
                private final java.util.Map<java.lang.Integer, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> parameterAnnotationTokens;
                private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.MethodToken.ParameterToken> parameterTokens;
                private final java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> parameterTypeAnnotationTokens;
                private final java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> receiverTypeAnnotationTokens;
                private final java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> returnTypeAnnotationTokens;
                private final net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForMethod signatureResolution;
                private final java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> typeVariableAnnotationTokens;
                private final java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>>> typeVariableBoundAnnotationTokens;

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class ParameterToken {

                    @net.bytebuddy.utility.nullability.AlwaysNull
                    protected static final java.lang.Integer NO_MODIFIERS = null;

                    @net.bytebuddy.utility.nullability.AlwaysNull
                    protected static final java.lang.String NO_NAME = null;

                    @net.bytebuddy.utility.nullability.MaybeNull
                    @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                    private final java.lang.Integer modifiers;

                    @net.bytebuddy.utility.nullability.MaybeNull
                    @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                    private final java.lang.String name;

                    static {
                            return
                    }

                    public ParameterToken() {
                            r1 = this;
                            java.lang.String r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.MethodToken.ParameterToken.NO_NAME
                            r1.<init>(r0)
                            return
                    }

                    public ParameterToken(@net.bytebuddy.utility.nullability.MaybeNull java.lang.String r2) {
                            r1 = this;
                            java.lang.Integer r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.MethodToken.ParameterToken.NO_MODIFIERS
                            r1.<init>(r2, r0)
                            return
                    }

                    public ParameterToken(@net.bytebuddy.utility.nullability.MaybeNull java.lang.String r1, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Integer r2) {
                            r0 = this;
                            r0.<init>()
                            r0.name = r1
                            r0.modifiers = r2
                            return
                    }

                    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                            r4 = this;
                            r0 = 1
                            if (r4 != r5) goto L4
                            return r0
                        L4:
                            r1 = 0
                            if (r5 != 0) goto L8
                            return r1
                        L8:
                            java.lang.Class r2 = r4.getClass()
                            java.lang.Class r3 = r5.getClass()
                            if (r2 == r3) goto L13
                            return r1
                        L13:
                            java.lang.Integer r2 = r4.modifiers
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$MethodToken$ParameterToken r5 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.MethodToken.ParameterToken) r5
                            java.lang.Integer r3 = r5.modifiers
                            if (r3 == 0) goto L24
                            if (r2 == 0) goto L26
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L27
                            return r1
                        L24:
                            if (r2 == 0) goto L27
                        L26:
                            return r1
                        L27:
                            java.lang.String r2 = r4.name
                            java.lang.String r5 = r5.name
                            if (r5 == 0) goto L36
                            if (r2 == 0) goto L38
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L39
                            return r1
                        L36:
                            if (r2 == 0) goto L39
                        L38:
                            return r1
                        L39:
                            return r0
                    }

                    @net.bytebuddy.utility.nullability.MaybeNull
                    public java.lang.Integer getModifiers() {
                            r1 = this;
                            java.lang.Integer r0 = r1.modifiers
                            return r0
                    }

                    @net.bytebuddy.utility.nullability.MaybeNull
                    public java.lang.String getName() {
                            r1 = this;
                            java.lang.String r0 = r1.name
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            java.lang.String r1 = r2.name
                            if (r1 == 0) goto L13
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                        L13:
                            int r0 = r0 * 31
                            java.lang.Integer r1 = r2.modifiers
                            if (r1 == 0) goto L1e
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                        L1e:
                            return r0
                    }
                }

                public MethodToken(java.lang.String r4, int r5, java.lang.String r6, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r7, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String[] r8, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> r9, java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>>> r10, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r11, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> r12, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> r13, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r14, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken> r15, java.util.Map<java.lang.Integer, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r16, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.MethodToken.ParameterToken> r17, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.annotation.AnnotationValue<?, ?> r18) {
                        r3 = this;
                        r0 = r3
                        r3.<init>()
                        r1 = -131073(0xfffffffffffdffff, float:NaN)
                        r1 = r1 & r5
                        r0.modifiers = r1
                        r1 = r4
                        r0.name = r1
                        r1 = r6
                        r0.descriptor = r1
                        r1 = r7
                        r0.genericSignature = r1
                        boolean r2 = net.bytebuddy.description.type.TypeDescription.AbstractBase.RAW_TYPES
                        if (r2 == 0) goto L1a
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Raw r1 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Raw.INSTANCE
                        goto L1e
                    L1a:
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForMethod r1 = net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature.OfMethod.extract(r7)
                    L1e:
                        r0.signatureResolution = r1
                        r1 = r8
                        r0.exceptionName = r1
                        r1 = r9
                        r0.typeVariableAnnotationTokens = r1
                        r1 = r10
                        r0.typeVariableBoundAnnotationTokens = r1
                        r1 = r11
                        r0.returnTypeAnnotationTokens = r1
                        r1 = r12
                        r0.parameterTypeAnnotationTokens = r1
                        r1 = r13
                        r0.exceptionTypeAnnotationTokens = r1
                        r1 = r14
                        r0.receiverTypeAnnotationTokens = r1
                        r1 = r15
                        r0.annotationTokens = r1
                        r1 = r16
                        r0.parameterAnnotationTokens = r1
                        r1 = r17
                        r0.parameterTokens = r1
                        r1 = r18
                        r0.defaultValue = r1
                        return
                }

                public static /* synthetic */ net.bytebuddy.description.method.MethodDescription.InDefinedShape access$1200(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.MethodToken r0, net.bytebuddy.pool.TypePool.Default.LazyTypeDescription r1) {
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r0.toMethodDescription(r1)
                        return r0
                }

                private net.bytebuddy.description.method.MethodDescription.InDefinedShape toMethodDescription(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription r23) {
                        r22 = this;
                        r0 = r22
                        r2 = r23
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription r20 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyMethodDescription
                        r1 = r20
                        r23.getClass()
                        java.lang.String r3 = r0.name
                        int r4 = r0.modifiers
                        java.lang.String r5 = r0.descriptor
                        java.lang.String r6 = r0.genericSignature
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForMethod r7 = r0.signatureResolution
                        java.lang.String[] r8 = r0.exceptionName
                        java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>> r9 = r0.typeVariableAnnotationTokens
                        java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>>> r10 = r0.typeVariableBoundAnnotationTokens
                        java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r11 = r0.returnTypeAnnotationTokens
                        java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>> r12 = r0.parameterTypeAnnotationTokens
                        java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>> r13 = r0.exceptionTypeAnnotationTokens
                        java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r14 = r0.receiverTypeAnnotationTokens
                        java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken> r15 = r0.annotationTokens
                        r21 = r1
                        java.util.Map<java.lang.Integer, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r1 = r0.parameterAnnotationTokens
                        r16 = r1
                        java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$MethodToken$ParameterToken> r1 = r0.parameterTokens
                        r17 = r1
                        net.bytebuddy.description.annotation.AnnotationValue<?, ?> r1 = r0.defaultValue
                        r18 = r1
                        r19 = 0
                        r1 = r21
                        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                        return r20
                }

                public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                        r4 = this;
                        r0 = 1
                        if (r4 != r5) goto L4
                        return r0
                    L4:
                        r1 = 0
                        if (r5 != 0) goto L8
                        return r1
                    L8:
                        java.lang.Class r2 = r4.getClass()
                        java.lang.Class r3 = r5.getClass()
                        if (r2 == r3) goto L13
                        return r1
                    L13:
                        int r2 = r4.modifiers
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$MethodToken r5 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.MethodToken) r5
                        int r3 = r5.modifiers
                        if (r2 == r3) goto L1c
                        return r1
                    L1c:
                        java.lang.String r2 = r4.name
                        java.lang.String r3 = r5.name
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L27
                        return r1
                    L27:
                        java.lang.String r2 = r4.descriptor
                        java.lang.String r3 = r5.descriptor
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L32
                        return r1
                    L32:
                        java.lang.String r2 = r4.genericSignature
                        java.lang.String r3 = r5.genericSignature
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L3d
                        return r1
                    L3d:
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForMethod r2 = r4.signatureResolution
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForMethod r3 = r5.signatureResolution
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L48
                        return r1
                    L48:
                        java.lang.String[] r2 = r4.exceptionName
                        java.lang.String[] r3 = r5.exceptionName
                        boolean r2 = java.util.Arrays.equals(r2, r3)
                        if (r2 != 0) goto L53
                        return r1
                    L53:
                        java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>> r2 = r4.typeVariableAnnotationTokens
                        java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>> r3 = r5.typeVariableAnnotationTokens
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L5e
                        return r1
                    L5e:
                        java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>>> r2 = r4.typeVariableBoundAnnotationTokens
                        java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>>> r3 = r5.typeVariableBoundAnnotationTokens
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L69
                        return r1
                    L69:
                        java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r2 = r4.returnTypeAnnotationTokens
                        java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r3 = r5.returnTypeAnnotationTokens
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L74
                        return r1
                    L74:
                        java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>> r2 = r4.parameterTypeAnnotationTokens
                        java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>> r3 = r5.parameterTypeAnnotationTokens
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L7f
                        return r1
                    L7f:
                        java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>> r2 = r4.exceptionTypeAnnotationTokens
                        java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>> r3 = r5.exceptionTypeAnnotationTokens
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L8a
                        return r1
                    L8a:
                        java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r2 = r4.receiverTypeAnnotationTokens
                        java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r3 = r5.receiverTypeAnnotationTokens
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L95
                        return r1
                    L95:
                        java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken> r2 = r4.annotationTokens
                        java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken> r3 = r5.annotationTokens
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto La0
                        return r1
                    La0:
                        java.util.Map<java.lang.Integer, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r2 = r4.parameterAnnotationTokens
                        java.util.Map<java.lang.Integer, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r3 = r5.parameterAnnotationTokens
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto Lab
                        return r1
                    Lab:
                        java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$MethodToken$ParameterToken> r2 = r4.parameterTokens
                        java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$MethodToken$ParameterToken> r3 = r5.parameterTokens
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto Lb6
                        return r1
                    Lb6:
                        net.bytebuddy.description.annotation.AnnotationValue<?, ?> r2 = r4.defaultValue
                        net.bytebuddy.description.annotation.AnnotationValue<?, ?> r5 = r5.defaultValue
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto Lc1
                        return r1
                    Lc1:
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        java.lang.String r1 = r2.name
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        int r1 = r2.modifiers
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.lang.String r1 = r2.descriptor
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.lang.String r1 = r2.genericSignature
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForMethod r1 = r2.signatureResolution
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.lang.String[] r1 = r2.exceptionName
                        int r1 = java.util.Arrays.hashCode(r1)
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>> r1 = r2.typeVariableAnnotationTokens
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>>> r1 = r2.typeVariableBoundAnnotationTokens
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r1 = r2.returnTypeAnnotationTokens
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>> r1 = r2.parameterTypeAnnotationTokens
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>> r1 = r2.exceptionTypeAnnotationTokens
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r1 = r2.receiverTypeAnnotationTokens
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken> r1 = r2.annotationTokens
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.util.Map<java.lang.Integer, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r1 = r2.parameterAnnotationTokens
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$MethodToken$ParameterToken> r1 = r2.parameterTokens
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.description.annotation.AnnotationValue<?, ?> r1 = r2.defaultValue
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }
            }

            public class MethodTokenList extends net.bytebuddy.description.method.MethodList.AbstractBase<net.bytebuddy.description.method.MethodDescription.InDefinedShape> {
                final /* synthetic */ net.bytebuddy.pool.TypePool.Default.LazyTypeDescription this$0;

                public MethodTokenList(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription r1) {
                        r0 = this;
                        r0.this$0 = r1
                        r0.<init>()
                        return
                }

                @Override // java.util.AbstractList, java.util.List
                public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                        r0 = this;
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r0.get(r1)
                        return r1
                }

                @Override // java.util.AbstractList, java.util.List
                public net.bytebuddy.description.method.MethodDescription.InDefinedShape get(int r2) {
                        r1 = this;
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription r0 = r1.this$0
                        java.util.List r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.access$1100(r0)
                        java.lang.Object r2 = r0.get(r2)
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$MethodToken r2 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.MethodToken) r2
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription r0 = r1.this$0
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.MethodToken.access$1200(r2, r0)
                        return r2
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                        r1 = this;
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription r0 = r1.this$0
                        java.util.List r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.access$1100(r0)
                        int r0 = r0.size()
                        return r0
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class RecordComponentToken {
                private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken> annotationTokens;
                private final java.lang.String descriptor;

                @net.bytebuddy.utility.nullability.UnknownNull
                private final java.lang.String genericSignature;
                private final java.lang.String name;
                private final net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.ForRecordComponent signatureResolution;
                private final java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> typeAnnotationTokens;

                public RecordComponentToken(java.lang.String r1, java.lang.String r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r3, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r4, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken> r5) {
                        r0 = this;
                        r0.<init>()
                        r0.name = r1
                        r0.descriptor = r2
                        r0.genericSignature = r3
                        boolean r1 = net.bytebuddy.description.type.TypeDescription.AbstractBase.RAW_TYPES
                        if (r1 == 0) goto L10
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Raw r1 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Raw.INSTANCE
                        goto L14
                    L10:
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForRecordComponent r1 = net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature.OfRecordComponent.extract(r3)
                    L14:
                        r0.signatureResolution = r1
                        r0.typeAnnotationTokens = r4
                        r0.annotationTokens = r5
                        return
                }

                public static /* synthetic */ net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape access$1400(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.RecordComponentToken r0, net.bytebuddy.pool.TypePool.Default.LazyTypeDescription r1) {
                        net.bytebuddy.description.type.RecordComponentDescription$InDefinedShape r0 = r0.toRecordComponentDescription(r1)
                        return r0
                }

                private net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape toRecordComponentDescription(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription r11) {
                        r10 = this;
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyRecordComponentDescription r9 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyRecordComponentDescription
                        r11.getClass()
                        java.lang.String r2 = r10.name
                        java.lang.String r3 = r10.descriptor
                        java.lang.String r4 = r10.genericSignature
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForRecordComponent r5 = r10.signatureResolution
                        java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r6 = r10.typeAnnotationTokens
                        java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken> r7 = r10.annotationTokens
                        r8 = 0
                        r0 = r9
                        r1 = r11
                        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                        return r9
                }

                public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                        r4 = this;
                        r0 = 1
                        if (r4 != r5) goto L4
                        return r0
                    L4:
                        r1 = 0
                        if (r5 != 0) goto L8
                        return r1
                    L8:
                        java.lang.Class r2 = r4.getClass()
                        java.lang.Class r3 = r5.getClass()
                        if (r2 == r3) goto L13
                        return r1
                    L13:
                        java.lang.String r2 = r4.name
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$RecordComponentToken r5 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.RecordComponentToken) r5
                        java.lang.String r3 = r5.name
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        java.lang.String r2 = r4.descriptor
                        java.lang.String r3 = r5.descriptor
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L2b
                        return r1
                    L2b:
                        java.lang.String r2 = r4.genericSignature
                        java.lang.String r3 = r5.genericSignature
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L36
                        return r1
                    L36:
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForRecordComponent r2 = r4.signatureResolution
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForRecordComponent r3 = r5.signatureResolution
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L41
                        return r1
                    L41:
                        java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r2 = r4.typeAnnotationTokens
                        java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r3 = r5.typeAnnotationTokens
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L4c
                        return r1
                    L4c:
                        java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken> r2 = r4.annotationTokens
                        java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken> r5 = r5.annotationTokens
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L57
                        return r1
                    L57:
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        java.lang.String r1 = r2.name
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.lang.String r1 = r2.descriptor
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.lang.String r1 = r2.genericSignature
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForRecordComponent r1 = r2.signatureResolution
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r1 = r2.typeAnnotationTokens
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken> r1 = r2.annotationTokens
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }
            }

            public class RecordComponentTokenList extends net.bytebuddy.description.type.RecordComponentList.AbstractBase<net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape> {
                final /* synthetic */ net.bytebuddy.pool.TypePool.Default.LazyTypeDescription this$0;

                public RecordComponentTokenList(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription r1) {
                        r0 = this;
                        r0.this$0 = r1
                        r0.<init>()
                        return
                }

                @Override // java.util.AbstractList, java.util.List
                public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                        r0 = this;
                        net.bytebuddy.description.type.RecordComponentDescription$InDefinedShape r1 = r0.get(r1)
                        return r1
                }

                @Override // java.util.AbstractList, java.util.List
                public net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape get(int r2) {
                        r1 = this;
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription r0 = r1.this$0
                        java.util.List r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.access$1300(r0)
                        java.lang.Object r2 = r0.get(r2)
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$RecordComponentToken r2 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.RecordComponentToken) r2
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription r0 = r1.this$0
                        net.bytebuddy.description.type.RecordComponentDescription$InDefinedShape r2 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.RecordComponentToken.access$1400(r2, r0)
                        return r2
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                        r1 = this;
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription r0 = r1.this$0
                        java.util.List r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.access$1300(r0)
                        int r0 = r0.size()
                        return r0
                }
            }

            public static class TokenizedGenericType extends net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithEagerNavigation {
                private final java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> annotationTokens;
                private transient /* synthetic */ net.bytebuddy.description.type.TypeDescription erasure;
                private final net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken genericTypeToken;
                private final java.lang.String rawTypeDescriptor;
                private transient /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic resolved;
                private final net.bytebuddy.pool.TypePool typePool;
                private final net.bytebuddy.description.TypeVariableSource typeVariableSource;

                public static class Malformed extends net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithEagerNavigation {
                    private final java.lang.String rawTypeDescriptor;
                    private final net.bytebuddy.pool.TypePool typePool;

                    public static class TokenList extends net.bytebuddy.description.type.TypeList.Generic.AbstractBase {
                        private final java.util.List<java.lang.String> rawTypeDescriptors;
                        private final net.bytebuddy.pool.TypePool typePool;

                        public TokenList(net.bytebuddy.pool.TypePool r1, java.util.List<java.lang.String> r2) {
                                r0 = this;
                                r0.<init>()
                                r0.typePool = r1
                                r0.rawTypeDescriptors = r2
                                return
                        }

                        @Override // net.bytebuddy.description.type.TypeList.Generic.AbstractBase, net.bytebuddy.description.type.TypeList.Generic
                        public net.bytebuddy.description.type.TypeList asErasures() {
                                r3 = this;
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyTypeList r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyTypeList
                                net.bytebuddy.pool.TypePool r1 = r3.typePool
                                java.util.List<java.lang.String> r2 = r3.rawTypeDescriptors
                                r0.<init>(r1, r2)
                                return r0
                        }

                        @Override // java.util.AbstractList, java.util.List
                        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                                r0 = this;
                                net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.get(r1)
                                return r1
                        }

                        @Override // java.util.AbstractList, java.util.List
                        public net.bytebuddy.description.type.TypeDescription.Generic get(int r4) {
                                r3 = this;
                                net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TokenizedGenericType$Malformed r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TokenizedGenericType$Malformed
                                net.bytebuddy.pool.TypePool r1 = r3.typePool
                                java.util.List<java.lang.String> r2 = r3.rawTypeDescriptors
                                java.lang.Object r4 = r2.get(r4)
                                java.lang.String r4 = (java.lang.String) r4
                                r0.<init>(r1, r4)
                                return r0
                        }

                        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                        public int size() {
                                r1 = this;
                                java.util.List<java.lang.String> r0 = r1.rawTypeDescriptors
                                int r0 = r0.size()
                                return r0
                        }
                    }

                    public Malformed(net.bytebuddy.pool.TypePool r1, java.lang.String r2) {
                            r0 = this;
                            r0.<init>()
                            r0.typePool = r1
                            r0.rawTypeDescriptor = r2
                            return
                    }

                    @Override // net.bytebuddy.description.type.TypeDefinition
                    public net.bytebuddy.description.type.TypeDescription asErasure() {
                            r2 = this;
                            net.bytebuddy.pool.TypePool r0 = r2.typePool
                            java.lang.String r1 = r2.rawTypeDescriptor
                            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TokenizedGenericType.toErasure(r0, r1)
                            return r0
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationSource
                    public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                            r1 = this;
                            java.lang.reflect.GenericSignatureFormatError r0 = new java.lang.reflect.GenericSignatureFormatError
                            r0.<init>()
                            throw r0
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection
                    public net.bytebuddy.description.type.TypeDescription.Generic resolve() {
                            r1 = this;
                            java.lang.reflect.GenericSignatureFormatError r0 = new java.lang.reflect.GenericSignatureFormatError
                            r0.<init>()
                            throw r0
                    }
                }

                public static class TokenList extends net.bytebuddy.description.type.TypeList.Generic.AbstractBase {
                    private final java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> annotationTokens;
                    private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken> genericTypeTokens;
                    private final java.util.List<java.lang.String> rawTypeDescriptors;
                    private final net.bytebuddy.pool.TypePool typePool;
                    private final net.bytebuddy.description.TypeVariableSource typeVariableSource;

                    private TokenList(net.bytebuddy.pool.TypePool r1, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken> r2, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> r3, java.util.List<java.lang.String> r4, net.bytebuddy.description.TypeVariableSource r5) {
                            r0 = this;
                            r0.<init>()
                            r0.typePool = r1
                            r0.genericTypeTokens = r2
                            r0.annotationTokens = r3
                            r0.rawTypeDescriptors = r4
                            r0.typeVariableSource = r5
                            return
                    }

                    public /* synthetic */ TokenList(net.bytebuddy.pool.TypePool r1, java.util.List r2, java.util.Map r3, java.util.List r4, net.bytebuddy.description.TypeVariableSource r5, net.bytebuddy.pool.TypePool.AnonymousClass1 r6) {
                            r0 = this;
                            r0.<init>(r1, r2, r3, r4, r5)
                            return
                    }

                    @Override // net.bytebuddy.description.type.TypeList.Generic.AbstractBase, net.bytebuddy.description.type.TypeList.Generic
                    public net.bytebuddy.description.type.TypeList asErasures() {
                            r3 = this;
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyTypeList r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyTypeList
                            net.bytebuddy.pool.TypePool r1 = r3.typePool
                            java.util.List<java.lang.String> r2 = r3.rawTypeDescriptors
                            r0.<init>(r1, r2)
                            return r0
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.get(r1)
                            return r1
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public net.bytebuddy.description.type.TypeDescription.Generic get(int r5) {
                            r4 = this;
                            java.util.List<java.lang.String> r0 = r4.rawTypeDescriptors
                            int r0 = r0.size()
                            java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r1 = r4.genericTypeTokens
                            int r1 = r1.size()
                            if (r0 != r1) goto L33
                            net.bytebuddy.pool.TypePool r0 = r4.typePool
                            java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken> r1 = r4.genericTypeTokens
                            java.lang.Object r1 = r1.get(r5)
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r1 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken) r1
                            java.util.List<java.lang.String> r2 = r4.rawTypeDescriptors
                            java.lang.Object r2 = r2.get(r5)
                            java.lang.String r2 = (java.lang.String) r2
                            java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>> r3 = r4.annotationTokens
                            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                            java.lang.Object r5 = r3.get(r5)
                            java.util.Map r5 = (java.util.Map) r5
                            net.bytebuddy.description.TypeVariableSource r3 = r4.typeVariableSource
                            net.bytebuddy.description.type.TypeDescription$Generic r5 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TokenizedGenericType.of(r0, r1, r2, r5, r3)
                            goto L45
                        L33:
                            net.bytebuddy.pool.TypePool r0 = r4.typePool
                            java.util.List<java.lang.String> r1 = r4.rawTypeDescriptors
                            java.lang.Object r5 = r1.get(r5)
                            java.lang.String r5 = (java.lang.String) r5
                            net.bytebuddy.description.type.TypeDescription r5 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TokenizedGenericType.toErasure(r0, r5)
                            net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.asGenericType()
                        L45:
                            return r5
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public int size() {
                            r1 = this;
                            java.util.List<java.lang.String> r0 = r1.rawTypeDescriptors
                            int r0 = r0.size()
                            return r0
                    }
                }

                public static class TypeVariableList extends net.bytebuddy.description.type.TypeList.Generic.AbstractBase {
                    private final java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> annotationTokens;
                    private final java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>>> boundAnnotationTokens;
                    private final net.bytebuddy.pool.TypePool typePool;
                    private final net.bytebuddy.description.TypeVariableSource typeVariableSource;
                    private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.OfFormalTypeVariable> typeVariables;

                    public TypeVariableList(net.bytebuddy.pool.TypePool r1, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.OfFormalTypeVariable> r2, net.bytebuddy.description.TypeVariableSource r3, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> r4, java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>>> r5) {
                            r0 = this;
                            r0.<init>()
                            r0.typePool = r1
                            r0.typeVariables = r2
                            r0.typeVariableSource = r3
                            r0.annotationTokens = r4
                            r0.boundAnnotationTokens = r5
                            return
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.get(r1)
                            return r1
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public net.bytebuddy.description.type.TypeDescription.Generic get(int r6) {
                            r5 = this;
                            java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$OfFormalTypeVariable> r0 = r5.typeVariables
                            java.lang.Object r0 = r0.get(r6)
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$OfFormalTypeVariable r0 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.OfFormalTypeVariable) r0
                            net.bytebuddy.pool.TypePool r1 = r5.typePool
                            net.bytebuddy.description.TypeVariableSource r2 = r5.typeVariableSource
                            java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>> r3 = r5.annotationTokens
                            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
                            java.lang.Object r3 = r3.get(r4)
                            java.util.Map r3 = (java.util.Map) r3
                            java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>>> r4 = r5.boundAnnotationTokens
                            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                            java.lang.Object r6 = r4.get(r6)
                            java.util.Map r6 = (java.util.Map) r6
                            net.bytebuddy.description.type.TypeDescription$Generic r6 = r0.toGenericType(r1, r2, r3, r6)
                            return r6
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public int size() {
                            r1 = this;
                            java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$OfFormalTypeVariable> r0 = r1.typeVariables
                            int r0 = r0.size()
                            return r0
                    }
                }

                public TokenizedGenericType(net.bytebuddy.pool.TypePool r1, net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken r2, java.lang.String r3, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r4, net.bytebuddy.description.TypeVariableSource r5) {
                        r0 = this;
                        r0.<init>()
                        r0.typePool = r1
                        r0.genericTypeToken = r2
                        r0.rawTypeDescriptor = r3
                        r0.annotationTokens = r4
                        r0.typeVariableSource = r5
                        return
                }

                public static net.bytebuddy.description.type.TypeDescription.Generic of(net.bytebuddy.pool.TypePool r7, net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken r8, java.lang.String r9, @net.bytebuddy.utility.nullability.MaybeNull java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r10, net.bytebuddy.description.TypeVariableSource r11) {
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TokenizedGenericType r6 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TokenizedGenericType
                        if (r10 != 0) goto L8
                        java.util.Map r10 = java.util.Collections.emptyMap()
                    L8:
                        r4 = r10
                        r0 = r6
                        r1 = r7
                        r2 = r8
                        r3 = r9
                        r5 = r11
                        r0.<init>(r1, r2, r3, r4, r5)
                        return r6
                }

                public static net.bytebuddy.description.type.TypeDescription toErasure(net.bytebuddy.pool.TypePool r2, java.lang.String r3) {
                        net.bytebuddy.jar.asm.Type r3 = net.bytebuddy.jar.asm.Type.getType(r3)
                        int r0 = r3.getSort()
                        r1 = 9
                        if (r0 != r1) goto L19
                        java.lang.String r3 = r3.getInternalName()
                        r0 = 47
                        r1 = 46
                        java.lang.String r3 = r3.replace(r0, r1)
                        goto L1d
                    L19:
                        java.lang.String r3 = r3.getClassName()
                    L1d:
                        net.bytebuddy.pool.TypePool$Resolution r2 = r2.describe(r3)
                        net.bytebuddy.description.type.TypeDescription r2 = r2.resolve()
                        return r2
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                @net.bytebuddy.build.CachedReturnPlugin.Enhance("erasure")
                public net.bytebuddy.description.type.TypeDescription asErasure() {
                        r2 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r2.erasure
                        if (r0 == 0) goto L6
                        r0 = 0
                        goto Le
                    L6:
                        net.bytebuddy.pool.TypePool r0 = r2.typePool
                        java.lang.String r1 = r2.rawTypeDescriptor
                        net.bytebuddy.description.type.TypeDescription r0 = toErasure(r0, r1)
                    Le:
                        if (r0 != 0) goto L13
                        net.bytebuddy.description.type.TypeDescription r0 = r2.erasure
                        goto L15
                    L13:
                        r2.erasure = r0
                    L15:
                        return r0
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.resolve()
                        net.bytebuddy.description.annotation.AnnotationList r0 = r0.getDeclaredAnnotations()
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection
                @net.bytebuddy.build.CachedReturnPlugin.Enhance("resolved")
                public net.bytebuddy.description.type.TypeDescription.Generic resolve() {
                        r5 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r5.resolved
                        if (r0 == 0) goto L6
                        r0 = 0
                        goto L14
                    L6:
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken r0 = r5.genericTypeToken
                        net.bytebuddy.pool.TypePool r1 = r5.typePool
                        net.bytebuddy.description.TypeVariableSource r2 = r5.typeVariableSource
                        java.lang.String r3 = ""
                        java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r4 = r5.annotationTokens
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.toGenericType(r1, r2, r3, r4)
                    L14:
                        if (r0 != 0) goto L19
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r5.resolved
                        goto L1b
                    L19:
                        r5.resolved = r0
                    L1b:
                        return r0
                }
            }

            public interface TypeContainment {

                public enum SelfContained extends java.lang.Enum<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment.SelfContained> implements net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment {
                    private static final /* synthetic */ net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment.SelfContained[] $VALUES = null;
                    public static final net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment.SelfContained INSTANCE = null;

                    static {
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TypeContainment$SelfContained r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TypeContainment$SelfContained
                            java.lang.String r1 = "INSTANCE"
                            r2 = 0
                            r0.<init>(r1, r2)
                            net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment.SelfContained.INSTANCE = r0
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TypeContainment$SelfContained[] r0 = new net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment.SelfContained[]{r0}
                            net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment.SelfContained.$VALUES = r0
                            return
                    }

                    SelfContained(java.lang.String r1, int r2) {
                            r0 = this;
                            r0.<init>(r1, r2)
                            return
                    }

                    public static net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment.SelfContained valueOf(java.lang.String r1) {
                            java.lang.Class<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TypeContainment$SelfContained> r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment.SelfContained.class
                            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TypeContainment$SelfContained r1 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment.SelfContained) r1
                            return r1
                    }

                    public static net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment.SelfContained[] values() {
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TypeContainment$SelfContained[] r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment.SelfContained.$VALUES
                            java.lang.Object r0 = r0.clone()
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TypeContainment$SelfContained[] r0 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment.SelfContained[]) r0
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    @net.bytebuddy.utility.nullability.MaybeNull
                    public net.bytebuddy.description.method.MethodDescription.InDefinedShape getEnclosingMethod(net.bytebuddy.pool.TypePool r1) {
                            r0 = this;
                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = net.bytebuddy.description.method.MethodDescription.UNDEFINED
                            return r1
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    @net.bytebuddy.utility.nullability.MaybeNull
                    public net.bytebuddy.description.type.TypeDescription getEnclosingType(net.bytebuddy.pool.TypePool r1) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.UNDEFINED
                            return r1
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    public boolean isLocalType() {
                            r1 = this;
                            r0 = 0
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    public boolean isSelfContained() {
                            r1 = this;
                            r0 = 1
                            return r0
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class WithinMethod implements net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment {
                    private final java.lang.String methodDescriptor;
                    private final java.lang.String methodName;
                    private final java.lang.String name;

                    public WithinMethod(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
                            r2 = this;
                            r2.<init>()
                            r0 = 47
                            r1 = 46
                            java.lang.String r3 = r3.replace(r0, r1)
                            r2.name = r3
                            r2.methodName = r4
                            r2.methodDescriptor = r5
                            return
                    }

                    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                            r4 = this;
                            r0 = 1
                            if (r4 != r5) goto L4
                            return r0
                        L4:
                            r1 = 0
                            if (r5 != 0) goto L8
                            return r1
                        L8:
                            java.lang.Class r2 = r4.getClass()
                            java.lang.Class r3 = r5.getClass()
                            if (r2 == r3) goto L13
                            return r1
                        L13:
                            java.lang.String r2 = r4.name
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TypeContainment$WithinMethod r5 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment.WithinMethod) r5
                            java.lang.String r3 = r5.name
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L20
                            return r1
                        L20:
                            java.lang.String r2 = r4.methodName
                            java.lang.String r3 = r5.methodName
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L2b
                            return r1
                        L2b:
                            java.lang.String r2 = r4.methodDescriptor
                            java.lang.String r5 = r5.methodDescriptor
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L36
                            return r1
                        L36:
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    public net.bytebuddy.description.method.MethodDescription.InDefinedShape getEnclosingMethod(net.bytebuddy.pool.TypePool r4) {
                            r3 = this;
                            net.bytebuddy.description.type.TypeDescription r4 = r3.getEnclosingType(r4)
                            if (r4 == 0) goto L4e
                            net.bytebuddy.description.method.MethodList r0 = r4.getDeclaredMethods()
                            java.lang.String r1 = r3.methodName
                            net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.hasMethodName(r1)
                            java.lang.String r2 = r3.methodDescriptor
                            net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.hasDescriptor(r2)
                            net.bytebuddy.matcher.ElementMatcher$Junction r1 = r1.and(r2)
                            net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                            net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                            boolean r1 = r0.isEmpty()
                            if (r1 != 0) goto L2d
                            java.lang.Object r4 = r0.getOnly()
                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r4
                            return r4
                        L2d:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            r1.<init>()
                            java.lang.String r2 = r3.methodName
                            r1.append(r2)
                            java.lang.String r2 = r3.methodDescriptor
                            r1.append(r2)
                            java.lang.String r2 = " not declared by "
                            r1.append(r2)
                            r1.append(r4)
                            java.lang.String r4 = r1.toString()
                            r0.<init>(r4)
                            throw r0
                        L4e:
                            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r0 = new java.lang.StringBuilder
                            r0.<init>()
                            java.lang.String r1 = "Could not resolve enclosing type "
                            r0.append(r1)
                            java.lang.String r1 = r3.name
                            r0.append(r1)
                            java.lang.String r0 = r0.toString()
                            r4.<init>(r0)
                            throw r4
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    public net.bytebuddy.description.type.TypeDescription getEnclosingType(net.bytebuddy.pool.TypePool r2) {
                            r1 = this;
                            java.lang.String r0 = r1.name
                            net.bytebuddy.pool.TypePool$Resolution r2 = r2.describe(r0)
                            net.bytebuddy.description.type.TypeDescription r2 = r2.resolve()
                            return r2
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            java.lang.String r1 = r2.name
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            java.lang.String r1 = r2.methodName
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            java.lang.String r1 = r2.methodDescriptor
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    public boolean isLocalType() {
                            r1 = this;
                            r0 = 1
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    public boolean isSelfContained() {
                            r1 = this;
                            r0 = 0
                            return r0
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class WithinType implements net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment {
                    private final boolean localType;
                    private final java.lang.String name;

                    public WithinType(java.lang.String r3, boolean r4) {
                            r2 = this;
                            r2.<init>()
                            r0 = 47
                            r1 = 46
                            java.lang.String r3 = r3.replace(r0, r1)
                            r2.name = r3
                            r2.localType = r4
                            return
                    }

                    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                            r4 = this;
                            r0 = 1
                            if (r4 != r5) goto L4
                            return r0
                        L4:
                            r1 = 0
                            if (r5 != 0) goto L8
                            return r1
                        L8:
                            java.lang.Class r2 = r4.getClass()
                            java.lang.Class r3 = r5.getClass()
                            if (r2 == r3) goto L13
                            return r1
                        L13:
                            boolean r2 = r4.localType
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TypeContainment$WithinType r5 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment.WithinType) r5
                            boolean r3 = r5.localType
                            if (r2 == r3) goto L1c
                            return r1
                        L1c:
                            java.lang.String r2 = r4.name
                            java.lang.String r5 = r5.name
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L27
                            return r1
                        L27:
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    @net.bytebuddy.utility.nullability.MaybeNull
                    public net.bytebuddy.description.method.MethodDescription.InDefinedShape getEnclosingMethod(net.bytebuddy.pool.TypePool r1) {
                            r0 = this;
                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = net.bytebuddy.description.method.MethodDescription.UNDEFINED
                            return r1
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    public net.bytebuddy.description.type.TypeDescription getEnclosingType(net.bytebuddy.pool.TypePool r2) {
                            r1 = this;
                            java.lang.String r0 = r1.name
                            net.bytebuddy.pool.TypePool$Resolution r2 = r2.describe(r0)
                            net.bytebuddy.description.type.TypeDescription r2 = r2.resolve()
                            return r2
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            java.lang.String r1 = r2.name
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            boolean r1 = r2.localType
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    public boolean isLocalType() {
                            r1 = this;
                            boolean r0 = r1.localType
                            return r0
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    public boolean isSelfContained() {
                            r1 = this;
                            r0 = 0
                            return r0
                    }
                }

                @net.bytebuddy.utility.nullability.MaybeNull
                net.bytebuddy.description.method.MethodDescription.InDefinedShape getEnclosingMethod(net.bytebuddy.pool.TypePool r1);

                @net.bytebuddy.utility.nullability.MaybeNull
                net.bytebuddy.description.type.TypeDescription getEnclosingType(net.bytebuddy.pool.TypePool r1);

                boolean isLocalType();

                boolean isSelfContained();
            }

            static {
                    return
            }

            public LazyTypeDescription(net.bytebuddy.pool.TypePool r8, int r9, int r10, java.lang.String r11, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r12, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String[] r13, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r14, net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment r15, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r16, java.util.List<java.lang.String> r17, boolean r18, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r19, java.util.List<java.lang.String> r20, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r21, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> r22, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> r23, java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>>> r24, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken> r25, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.FieldToken> r26, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.MethodToken> r27, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.RecordComponentToken> r28, java.util.List<java.lang.String> r29, net.bytebuddy.ClassFileVersion r30) {
                    r7 = this;
                    r0 = r7
                    r1 = r13
                    r2 = r16
                    r7.<init>()
                    r3 = r8
                    r0.typePool = r3
                    r3 = r9 & (-33)
                    r0.actualModifiers = r3
                    r3 = -131105(0xfffffffffffdffdf, float:NaN)
                    r3 = r3 & r10
                    r0.modifiers = r3
                    net.bytebuddy.jar.asm.Type r3 = net.bytebuddy.jar.asm.Type.getObjectType(r11)
                    java.lang.String r3 = r3.getClassName()
                    r0.name = r3
                    if (r12 != 0) goto L23
                    java.lang.String r3 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.NO_TYPE
                    goto L2b
                L23:
                    net.bytebuddy.jar.asm.Type r3 = net.bytebuddy.jar.asm.Type.getObjectType(r12)
                    java.lang.String r3 = r3.getDescriptor()
                L2b:
                    r0.superClassDescriptor = r3
                    r3 = r14
                    r0.genericSignature = r3
                    boolean r4 = net.bytebuddy.description.type.TypeDescription.AbstractBase.RAW_TYPES
                    if (r4 == 0) goto L37
                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Raw r3 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.Raw.INSTANCE
                    goto L3b
                L37:
                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForType r3 = net.bytebuddy.pool.TypePool.Default.GenericTypeExtractor.ForSignature.OfType.extract(r14)
                L3b:
                    r0.signatureResolution = r3
                    if (r1 != 0) goto L47
                    java.util.List r1 = java.util.Collections.emptyList()
                    r0.interfaceTypeDescriptors = r1
                L45:
                    r1 = r15
                    goto L65
                L47:
                    java.util.ArrayList r3 = new java.util.ArrayList
                    int r4 = r1.length
                    r3.<init>(r4)
                    r0.interfaceTypeDescriptors = r3
                    int r3 = r1.length
                    r4 = 0
                L51:
                    if (r4 >= r3) goto L45
                    r5 = r1[r4]
                    java.util.List<java.lang.String> r6 = r0.interfaceTypeDescriptors
                    net.bytebuddy.jar.asm.Type r5 = net.bytebuddy.jar.asm.Type.getObjectType(r5)
                    java.lang.String r5 = r5.getDescriptor()
                    r6.add(r5)
                    int r4 = r4 + 1
                    goto L51
                L65:
                    r0.typeContainment = r1
                    if (r2 != 0) goto L6c
                    java.lang.String r1 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.NO_TYPE
                    goto L74
                L6c:
                    r1 = 47
                    r3 = 46
                    java.lang.String r1 = r2.replace(r1, r3)
                L74:
                    r0.declaringTypeName = r1
                    r1 = r17
                    r0.declaredTypes = r1
                    r1 = r18
                    r0.anonymousType = r1
                    if (r19 != 0) goto L83
                    java.lang.String r1 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.NO_TYPE
                    goto L8b
                L83:
                    net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getObjectType(r19)
                    java.lang.String r1 = r1.getClassName()
                L8b:
                    r0.nestHost = r1
                    java.util.ArrayList r1 = new java.util.ArrayList
                    int r2 = r20.size()
                    r1.<init>(r2)
                    r0.nestMembers = r1
                    java.util.Iterator r1 = r20.iterator()
                L9c:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto Lb6
                    java.lang.Object r2 = r1.next()
                    java.lang.String r2 = (java.lang.String) r2
                    java.util.List<java.lang.String> r3 = r0.nestMembers
                    net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.getObjectType(r2)
                    java.lang.String r2 = r2.getClassName()
                    r3.add(r2)
                    goto L9c
                Lb6:
                    r2 = r21
                    r0.superClassAnnotationTokens = r2
                    r1 = r22
                    r0.interfaceAnnotationTokens = r1
                    r1 = r23
                    r0.typeVariableAnnotationTokens = r1
                    r1 = r24
                    r0.typeVariableBoundsAnnotationTokens = r1
                    r1 = r25
                    r0.annotationTokens = r1
                    r1 = r26
                    r0.fieldTokens = r1
                    r1 = r27
                    r0.methodTokens = r1
                    r1 = r28
                    r0.recordComponentTokens = r1
                    java.util.ArrayList r1 = new java.util.ArrayList
                    int r2 = r29.size()
                    r1.<init>(r2)
                    r0.permittedSubclasses = r1
                    java.util.Iterator r1 = r29.iterator()
                Le5:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto Lff
                    java.lang.Object r2 = r1.next()
                    java.lang.String r2 = (java.lang.String) r2
                    java.util.List<java.lang.String> r3 = r0.permittedSubclasses
                    net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.getObjectType(r2)
                    java.lang.String r2 = r2.getDescriptor()
                    r3.add(r2)
                    goto Le5
                Lff:
                    r2 = r30
                    r0.classFileVersion = r2
                    return
            }

            public static /* synthetic */ java.util.List access$1100(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription r0) {
                    java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$MethodToken> r0 = r0.methodTokens
                    return r0
            }

            public static /* synthetic */ java.util.List access$1300(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription r0) {
                    java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$RecordComponentToken> r0 = r0.recordComponentTokens
                    return r0
            }

            public static /* synthetic */ net.bytebuddy.pool.TypePool access$2500(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription r0) {
                    net.bytebuddy.pool.TypePool r0 = r0.typePool
                    return r0
            }

            public static /* synthetic */ java.util.List access$900(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription r0) {
                    java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$FieldToken> r0 = r0.fieldTokens
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase, net.bytebuddy.description.type.TypeDescription
            public int getActualModifiers(boolean r1) {
                    r0 = this;
                    if (r1 == 0) goto L7
                    int r1 = r0.actualModifiers
                    r1 = r1 | 32
                    goto L9
                L7:
                    int r1 = r0.actualModifiers
                L9:
                    return r1
            }

            @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase, net.bytebuddy.description.type.TypeDescription
            public net.bytebuddy.ClassFileVersion getClassFileVersion() {
                    r1 = this;
                    net.bytebuddy.ClassFileVersion r0 = r1.classFileVersion
                    return r0
            }

            @Override // net.bytebuddy.description.annotation.AnnotationSource
            public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                    r2 = this;
                    net.bytebuddy.pool.TypePool r0 = r2.typePool
                    java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken> r1 = r2.annotationTokens
                    net.bytebuddy.description.annotation.AnnotationList r0 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.LazyAnnotationDescription.asList(r0, r1)
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InDefinedShape> getDeclaredFields() {
                    r1 = this;
                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$FieldTokenList r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$FieldTokenList
                    r0.<init>(r1)
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.method.MethodList<net.bytebuddy.description.method.MethodDescription.InDefinedShape> getDeclaredMethods() {
                    r1 = this;
                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$MethodTokenList r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$MethodTokenList
                    r0.<init>(r1)
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription
            public net.bytebuddy.description.type.TypeList getDeclaredTypes() {
                    r3 = this;
                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyTypeList r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyTypeList
                    net.bytebuddy.pool.TypePool r1 = r3.typePool
                    java.util.List<java.lang.String> r2 = r3.declaredTypes
                    r0.<init>(r1, r2)
                    return r0
            }

            @Override // net.bytebuddy.description.DeclaredByType
            @net.bytebuddy.utility.nullability.MaybeNull
            public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getDeclaringType() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r1.getDeclaringType()
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.DeclaredByType
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.description.type.TypeDescription getDeclaringType() {
                    r2 = this;
                    java.lang.String r0 = r2.declaringTypeName
                    if (r0 != 0) goto L7
                    net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.UNDEFINED
                    goto L11
                L7:
                    net.bytebuddy.pool.TypePool r1 = r2.typePool
                    net.bytebuddy.pool.TypePool$Resolution r0 = r1.describe(r0)
                    net.bytebuddy.description.type.TypeDescription r0 = r0.resolve()
                L11:
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.description.method.MethodDescription.InDefinedShape getEnclosingMethod() {
                    r2 = this;
                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TypeContainment r0 = r2.typeContainment
                    net.bytebuddy.pool.TypePool r1 = r2.typePool
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r0.getEnclosingMethod(r1)
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.description.type.TypeDescription getEnclosingType() {
                    r2 = this;
                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TypeContainment r0 = r2.typeContainment
                    net.bytebuddy.pool.TypePool r1 = r2.typePool
                    net.bytebuddy.description.type.TypeDescription r0 = r0.getEnclosingType(r1)
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase, net.bytebuddy.description.NamedElement.WithDescriptor
            @net.bytebuddy.utility.nullability.MaybeNull
            public java.lang.String getGenericSignature() {
                    r1 = this;
                    java.lang.String r0 = r1.genericSignature
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.type.TypeList.Generic getInterfaces() {
                    r4 = this;
                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForType r0 = r4.signatureResolution
                    java.util.List<java.lang.String> r1 = r4.interfaceTypeDescriptors
                    net.bytebuddy.pool.TypePool r2 = r4.typePool
                    java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>> r3 = r4.interfaceAnnotationTokens
                    net.bytebuddy.description.type.TypeList$Generic r0 = r0.resolveInterfaceTypes(r1, r2, r3, r4)
                    return r0
            }

            @Override // net.bytebuddy.description.ModifierReviewable
            public int getModifiers() {
                    r1 = this;
                    int r0 = r1.modifiers
                    return r0
            }

            @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
            public java.lang.String getName() {
                    r1 = this;
                    java.lang.String r0 = r1.name
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription
            public net.bytebuddy.description.type.TypeDescription getNestHost() {
                    r2 = this;
                    java.lang.String r0 = r2.nestHost
                    if (r0 != 0) goto L6
                    r0 = r2
                    goto L10
                L6:
                    net.bytebuddy.pool.TypePool r1 = r2.typePool
                    net.bytebuddy.pool.TypePool$Resolution r0 = r1.describe(r0)
                    net.bytebuddy.description.type.TypeDescription r0 = r0.resolve()
                L10:
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription
            public net.bytebuddy.description.type.TypeList getNestMembers() {
                    r3 = this;
                    java.lang.String r0 = r3.nestHost
                    if (r0 != 0) goto Le
                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyNestMemberList r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyNestMemberList
                    net.bytebuddy.pool.TypePool r1 = r3.typePool
                    java.util.List<java.lang.String> r2 = r3.nestMembers
                    r0.<init>(r3, r1, r2)
                    goto L1c
                Le:
                    net.bytebuddy.pool.TypePool r1 = r3.typePool
                    net.bytebuddy.pool.TypePool$Resolution r0 = r1.describe(r0)
                    net.bytebuddy.description.type.TypeDescription r0 = r0.resolve()
                    net.bytebuddy.description.type.TypeList r0 = r0.getNestMembers()
                L1c:
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.description.type.PackageDescription getPackage() {
                    r5 = this;
                    java.lang.String r0 = r5.getName()
                    r1 = 46
                    int r1 = r0.lastIndexOf(r1)
                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyPackageDescription r2 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyPackageDescription
                    net.bytebuddy.pool.TypePool r3 = r5.typePool
                    r4 = -1
                    if (r1 != r4) goto L14
                    java.lang.String r0 = ""
                    goto L19
                L14:
                    r4 = 0
                    java.lang.String r0 = r0.substring(r4, r1)
                L19:
                    r1 = 0
                    r2.<init>(r3, r0, r1)
                    return r2
            }

            @Override // net.bytebuddy.description.type.TypeDescription
            public net.bytebuddy.description.type.TypeList getPermittedSubtypes() {
                    r3 = this;
                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyTypeList r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyTypeList
                    net.bytebuddy.pool.TypePool r1 = r3.typePool
                    java.util.List<java.lang.String> r2 = r3.permittedSubclasses
                    r0.<init>(r1, r2)
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
            public net.bytebuddy.description.type.RecordComponentList<net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape> getRecordComponents() {
                    r1 = this;
                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$RecordComponentTokenList r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$RecordComponentTokenList
                    r0.<init>(r1)
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.description.type.TypeDescription.Generic getSuperClass() {
                    r4 = this;
                    java.lang.String r0 = r4.superClassDescriptor
                    if (r0 == 0) goto L18
                    boolean r0 = r4.isInterface()
                    if (r0 == 0) goto Lb
                    goto L18
                Lb:
                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForType r0 = r4.signatureResolution
                    java.lang.String r1 = r4.superClassDescriptor
                    net.bytebuddy.pool.TypePool r2 = r4.typePool
                    java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r3 = r4.superClassAnnotationTokens
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.resolveSuperClass(r1, r2, r3, r4)
                    goto L1a
                L18:
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                L1a:
                    return r0
            }

            @Override // net.bytebuddy.description.TypeVariableSource
            public net.bytebuddy.description.type.TypeList.Generic getTypeVariables() {
                    r4 = this;
                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForType r0 = r4.signatureResolution
                    net.bytebuddy.pool.TypePool r1 = r4.typePool
                    java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>> r2 = r4.typeVariableAnnotationTokens
                    java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>>> r3 = r4.typeVariableBoundsAnnotationTokens
                    net.bytebuddy.description.type.TypeList$Generic r0 = r0.resolveTypeVariables(r1, r4, r2, r3)
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription
            public boolean isAnonymousType() {
                    r1 = this;
                    boolean r0 = r1.anonymousType
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription
            public boolean isLocalType() {
                    r1 = this;
                    boolean r0 = r1.anonymousType
                    if (r0 != 0) goto Le
                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TypeContainment r0 = r1.typeContainment
                    boolean r0 = r0.isLocalType()
                    if (r0 == 0) goto Le
                    r0 = 1
                    goto Lf
                Le:
                    r0 = 0
                Lf:
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public boolean isRecord() {
                    r2 = this;
                    int r0 = r2.actualModifiers
                    r1 = 65536(0x10000, float:9.1835E-41)
                    r0 = r0 & r1
                    if (r0 == 0) goto L1b
                    net.bytebuddy.utility.JavaType r0 = net.bytebuddy.utility.JavaType.RECORD
                    net.bytebuddy.description.type.TypeDescription r0 = r0.getTypeStub()
                    java.lang.String r0 = r0.getDescriptor()
                    java.lang.String r1 = r2.superClassDescriptor
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L1b
                    r0 = 1
                    goto L1c
                L1b:
                    r0 = 0
                L1c:
                    return r0
            }

            @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase, net.bytebuddy.description.type.TypeDescription
            public boolean isSealed() {
                    r1 = this;
                    java.util.List<java.lang.String> r0 = r1.permittedSubclasses
                    boolean r0 = r0.isEmpty()
                    r0 = r0 ^ 1
                    return r0
            }
        }

        public static class ParameterBag {
            private final java.util.Map<java.lang.Integer, java.lang.String> parameterRegistry;
            private final net.bytebuddy.jar.asm.Type[] parameterType;

            public ParameterBag(net.bytebuddy.jar.asm.Type[] r1) {
                    r0 = this;
                    r0.<init>()
                    r0.parameterType = r1
                    java.util.HashMap r1 = new java.util.HashMap
                    r1.<init>()
                    r0.parameterRegistry = r1
                    return
            }

            public void register(int r2, java.lang.String r3) {
                    r1 = this;
                    java.util.Map<java.lang.Integer, java.lang.String> r0 = r1.parameterRegistry
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    r0.put(r2, r3)
                    return
            }

            public java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.MethodToken.ParameterToken> resolve(boolean r8) {
                    r7 = this;
                    java.util.ArrayList r0 = new java.util.ArrayList
                    net.bytebuddy.jar.asm.Type[] r1 = r7.parameterType
                    int r1 = r1.length
                    r0.<init>(r1)
                    if (r8 == 0) goto L11
                    net.bytebuddy.implementation.bytecode.StackSize r8 = net.bytebuddy.implementation.bytecode.StackSize.ZERO
                    int r8 = r8.getSize()
                    goto L17
                L11:
                    net.bytebuddy.implementation.bytecode.StackSize r8 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
                    int r8 = r8.getSize()
                L17:
                    net.bytebuddy.jar.asm.Type[] r1 = r7.parameterType
                    int r2 = r1.length
                    r3 = 0
                L1b:
                    if (r3 >= r2) goto L44
                    r4 = r1[r3]
                    java.util.Map<java.lang.Integer, java.lang.String> r5 = r7.parameterRegistry
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
                    java.lang.Object r5 = r5.get(r6)
                    java.lang.String r5 = (java.lang.String) r5
                    if (r5 != 0) goto L33
                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$MethodToken$ParameterToken r5 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$MethodToken$ParameterToken
                    r5.<init>()
                    goto L39
                L33:
                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$MethodToken$ParameterToken r6 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$MethodToken$ParameterToken
                    r6.<init>(r5)
                    r5 = r6
                L39:
                    r0.add(r5)
                    int r4 = r4.getSize()
                    int r8 = r8 + r4
                    int r3 = r3 + 1
                    goto L1b
                L44:
                    return r0
            }
        }

        public enum ReaderMode extends java.lang.Enum<net.bytebuddy.pool.TypePool.Default.ReaderMode> {
            private static final /* synthetic */ net.bytebuddy.pool.TypePool.Default.ReaderMode[] $VALUES = null;
            public static final net.bytebuddy.pool.TypePool.Default.ReaderMode EXTENDED = null;
            public static final net.bytebuddy.pool.TypePool.Default.ReaderMode FAST = null;
            private final int flags;

            static {
                    net.bytebuddy.pool.TypePool$Default$ReaderMode r0 = new net.bytebuddy.pool.TypePool$Default$ReaderMode
                    r1 = 0
                    r2 = 4
                    java.lang.String r3 = "EXTENDED"
                    r0.<init>(r3, r1, r2)
                    net.bytebuddy.pool.TypePool.Default.ReaderMode.EXTENDED = r0
                    net.bytebuddy.pool.TypePool$Default$ReaderMode r1 = new net.bytebuddy.pool.TypePool$Default$ReaderMode
                    java.lang.String r2 = "FAST"
                    r3 = 1
                    r1.<init>(r2, r3, r3)
                    net.bytebuddy.pool.TypePool.Default.ReaderMode.FAST = r1
                    net.bytebuddy.pool.TypePool$Default$ReaderMode[] r0 = new net.bytebuddy.pool.TypePool.Default.ReaderMode[]{r0, r1}
                    net.bytebuddy.pool.TypePool.Default.ReaderMode.$VALUES = r0
                    return
            }

            ReaderMode(java.lang.String r1, int r2, int r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    r0.flags = r3
                    return
            }

            public static net.bytebuddy.pool.TypePool.Default.ReaderMode valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.pool.TypePool$Default$ReaderMode> r0 = net.bytebuddy.pool.TypePool.Default.ReaderMode.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.pool.TypePool$Default$ReaderMode r1 = (net.bytebuddy.pool.TypePool.Default.ReaderMode) r1
                    return r1
            }

            public static net.bytebuddy.pool.TypePool.Default.ReaderMode[] values() {
                    net.bytebuddy.pool.TypePool$Default$ReaderMode[] r0 = net.bytebuddy.pool.TypePool.Default.ReaderMode.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.pool.TypePool$Default$ReaderMode[] r0 = (net.bytebuddy.pool.TypePool.Default.ReaderMode[]) r0
                    return r0
            }

            public int getFlags() {
                    r1 = this;
                    int r0 = r1.flags
                    return r0
            }

            public boolean isExtended() {
                    r1 = this;
                    net.bytebuddy.pool.TypePool$Default$ReaderMode r0 = net.bytebuddy.pool.TypePool.Default.ReaderMode.EXTENDED
                    if (r1 != r0) goto L6
                    r0 = 1
                    goto L7
                L6:
                    r0 = 0
                L7:
                    return r0
            }
        }

        public class TypeExtractor extends net.bytebuddy.jar.asm.ClassVisitor {
            private static final int REAL_MODIFIER_MASK = 65535;
            private static final int SUPER_CLASS_INDEX = -1;
            private int actualModifiers;
            private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken> annotationTokens;
            private boolean anonymousType;

            @net.bytebuddy.utility.nullability.MaybeNull
            private net.bytebuddy.ClassFileVersion classFileVersion;
            private final java.util.List<java.lang.String> declaredTypes;

            @net.bytebuddy.utility.nullability.MaybeNull
            private java.lang.String declaringTypeName;
            private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.FieldToken> fieldTokens;

            @net.bytebuddy.utility.nullability.MaybeNull
            private java.lang.String genericSignature;

            @net.bytebuddy.utility.nullability.MaybeNull
            private java.lang.String[] interfaceName;

            @net.bytebuddy.utility.nullability.MaybeNull
            private java.lang.String internalName;
            private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.MethodToken> methodTokens;
            private int modifiers;

            @net.bytebuddy.utility.nullability.MaybeNull
            private java.lang.String nestHost;
            private final java.util.List<java.lang.String> nestMembers;
            private final java.util.List<java.lang.String> permittedSubclasses;
            private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.RecordComponentToken> recordComponentTokens;

            @net.bytebuddy.utility.nullability.MaybeNull
            private java.lang.String superClassName;
            private final java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> superTypeAnnotationTokens;
            final /* synthetic */ net.bytebuddy.pool.TypePool.Default this$0;
            private net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment typeContainment;
            private final java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> typeVariableAnnotationTokens;
            private final java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>>> typeVariableBoundsAnnotationTokens;

            public class AnnotationExtractor extends net.bytebuddy.jar.asm.AnnotationVisitor {
                private final net.bytebuddy.pool.TypePool.Default.AnnotationRegistrant annotationRegistrant;
                private final net.bytebuddy.pool.TypePool.Default.ComponentTypeLocator componentTypeLocator;
                final /* synthetic */ net.bytebuddy.pool.TypePool.Default.TypeExtractor this$1;

                public class AnnotationLookup implements net.bytebuddy.pool.TypePool.Default.AnnotationRegistrant {
                    private final java.lang.String descriptor;
                    private final java.lang.String name;
                    final /* synthetic */ net.bytebuddy.pool.TypePool.Default.TypeExtractor.AnnotationExtractor this$2;
                    private final java.util.Map<java.lang.String, net.bytebuddy.description.annotation.AnnotationValue<?, ?>> values;

                    public AnnotationLookup(net.bytebuddy.pool.TypePool.Default.TypeExtractor.AnnotationExtractor r1, java.lang.String r2, java.lang.String r3) {
                            r0 = this;
                            r0.this$2 = r1
                            r0.<init>()
                            r0.descriptor = r2
                            r0.name = r3
                            java.util.HashMap r1 = new java.util.HashMap
                            r1.<init>()
                            r0.values = r1
                            return
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.AnnotationRegistrant
                    public void onComplete() {
                            r7 = this;
                            net.bytebuddy.pool.TypePool$Default$TypeExtractor$AnnotationExtractor r0 = r7.this$2
                            net.bytebuddy.pool.TypePool$Default$AnnotationRegistrant r0 = net.bytebuddy.pool.TypePool.Default.TypeExtractor.AnnotationExtractor.access$4000(r0)
                            java.lang.String r1 = r7.name
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForAnnotationValue r2 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForAnnotationValue
                            net.bytebuddy.pool.TypePool$Default$TypeExtractor$AnnotationExtractor r3 = r7.this$2
                            net.bytebuddy.pool.TypePool$Default$TypeExtractor r3 = r3.this$1
                            net.bytebuddy.pool.TypePool$Default r3 = r3.this$0
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken r4 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken
                            java.lang.String r5 = r7.descriptor
                            java.util.Map<java.lang.String, net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r6 = r7.values
                            r4.<init>(r5, r6)
                            r5 = 0
                            r2.<init>(r3, r4, r5)
                            r0.register(r1, r2)
                            return
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.AnnotationRegistrant
                    public void register(java.lang.String r2, net.bytebuddy.description.annotation.AnnotationValue<?, ?> r3) {
                            r1 = this;
                            java.util.Map<java.lang.String, net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r0 = r1.values
                            r0.put(r2, r3)
                            return
                    }
                }

                public class ArrayLookup implements net.bytebuddy.pool.TypePool.Default.AnnotationRegistrant {
                    private final net.bytebuddy.pool.TypePool.AbstractBase.ComponentTypeReference componentTypeReference;
                    private final java.lang.String name;
                    final /* synthetic */ net.bytebuddy.pool.TypePool.Default.TypeExtractor.AnnotationExtractor this$2;
                    private final java.util.List<net.bytebuddy.description.annotation.AnnotationValue<?, ?>> values;

                    private ArrayLookup(net.bytebuddy.pool.TypePool.Default.TypeExtractor.AnnotationExtractor r1, java.lang.String r2, net.bytebuddy.pool.TypePool.AbstractBase.ComponentTypeReference r3) {
                            r0 = this;
                            r0.this$2 = r1
                            r0.<init>()
                            r0.name = r2
                            r0.componentTypeReference = r3
                            java.util.ArrayList r1 = new java.util.ArrayList
                            r1.<init>()
                            r0.values = r1
                            return
                    }

                    public /* synthetic */ ArrayLookup(net.bytebuddy.pool.TypePool.Default.TypeExtractor.AnnotationExtractor r1, java.lang.String r2, net.bytebuddy.pool.TypePool.AbstractBase.ComponentTypeReference r3, net.bytebuddy.pool.TypePool.AnonymousClass1 r4) {
                            r0 = this;
                            r0.<init>(r1, r2, r3)
                            return
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.AnnotationRegistrant
                    public void onComplete() {
                            r7 = this;
                            net.bytebuddy.pool.TypePool$Default$TypeExtractor$AnnotationExtractor r0 = r7.this$2
                            net.bytebuddy.pool.TypePool$Default$AnnotationRegistrant r0 = net.bytebuddy.pool.TypePool.Default.TypeExtractor.AnnotationExtractor.access$4000(r0)
                            java.lang.String r1 = r7.name
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray r2 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForArray
                            net.bytebuddy.pool.TypePool$Default$TypeExtractor$AnnotationExtractor r3 = r7.this$2
                            net.bytebuddy.pool.TypePool$Default$TypeExtractor r3 = r3.this$1
                            net.bytebuddy.pool.TypePool$Default r3 = r3.this$0
                            net.bytebuddy.pool.TypePool$AbstractBase$ComponentTypeReference r4 = r7.componentTypeReference
                            java.util.List<net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r5 = r7.values
                            r6 = 0
                            r2.<init>(r3, r4, r5, r6)
                            r0.register(r1, r2)
                            return
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.AnnotationRegistrant
                    public void register(java.lang.String r1, net.bytebuddy.description.annotation.AnnotationValue<?, ?> r2) {
                            r0 = this;
                            java.util.List<net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r1 = r0.values
                            r1.add(r2)
                            return
                    }
                }

                public AnnotationExtractor(net.bytebuddy.pool.TypePool.Default.TypeExtractor r2, java.lang.String r3, int r4, java.util.Map<java.lang.Integer, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> r5, net.bytebuddy.pool.TypePool.Default.ComponentTypeLocator r6) {
                        r1 = this;
                        net.bytebuddy.pool.TypePool$Default$AnnotationRegistrant$ForByteCodeElement$WithIndex r0 = new net.bytebuddy.pool.TypePool$Default$AnnotationRegistrant$ForByteCodeElement$WithIndex
                        r0.<init>(r3, r4, r5)
                        r1.<init>(r2, r0, r6)
                        return
                }

                public AnnotationExtractor(net.bytebuddy.pool.TypePool.Default.TypeExtractor r2, java.lang.String r3, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken> r4, net.bytebuddy.pool.TypePool.Default.ComponentTypeLocator r5) {
                        r1 = this;
                        net.bytebuddy.pool.TypePool$Default$AnnotationRegistrant$ForByteCodeElement r0 = new net.bytebuddy.pool.TypePool$Default$AnnotationRegistrant$ForByteCodeElement
                        r0.<init>(r3, r4)
                        r1.<init>(r2, r0, r5)
                        return
                }

                public AnnotationExtractor(net.bytebuddy.pool.TypePool.Default.TypeExtractor r1, net.bytebuddy.pool.TypePool.Default.AnnotationRegistrant r2, net.bytebuddy.pool.TypePool.Default.ComponentTypeLocator r3) {
                        r0 = this;
                        r0.this$1 = r1
                        int r1 = net.bytebuddy.utility.OpenedClassReader.ASM_API
                        r0.<init>(r1)
                        r0.annotationRegistrant = r2
                        r0.componentTypeLocator = r3
                        return
                }

                public static /* synthetic */ net.bytebuddy.pool.TypePool.Default.AnnotationRegistrant access$4000(net.bytebuddy.pool.TypePool.Default.TypeExtractor.AnnotationExtractor r0) {
                        net.bytebuddy.pool.TypePool$Default$AnnotationRegistrant r0 = r0.annotationRegistrant
                        return r0
                }

                @Override // net.bytebuddy.jar.asm.AnnotationVisitor
                public void visit(java.lang.String r6, java.lang.Object r7) {
                        r5 = this;
                        boolean r0 = r7 instanceof net.bytebuddy.jar.asm.Type
                        if (r0 == 0) goto L2f
                        net.bytebuddy.jar.asm.Type r7 = (net.bytebuddy.jar.asm.Type) r7
                        net.bytebuddy.pool.TypePool$Default$AnnotationRegistrant r0 = r5.annotationRegistrant
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForTypeValue r1 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForTypeValue
                        net.bytebuddy.pool.TypePool$Default$TypeExtractor r2 = r5.this$1
                        net.bytebuddy.pool.TypePool$Default r2 = r2.this$0
                        int r3 = r7.getSort()
                        r4 = 9
                        if (r3 != r4) goto L23
                        java.lang.String r7 = r7.getInternalName()
                        r3 = 47
                        r4 = 46
                        java.lang.String r7 = r7.replace(r3, r4)
                        goto L27
                    L23:
                        java.lang.String r7 = r7.getClassName()
                    L27:
                        r3 = 0
                        r1.<init>(r2, r7, r3)
                        r0.register(r6, r1)
                        goto L38
                    L2f:
                        net.bytebuddy.pool.TypePool$Default$AnnotationRegistrant r0 = r5.annotationRegistrant
                        net.bytebuddy.description.annotation.AnnotationValue r7 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.of(r7)
                        r0.register(r6, r7)
                    L38:
                        return
                }

                @Override // net.bytebuddy.jar.asm.AnnotationVisitor
                public net.bytebuddy.jar.asm.AnnotationVisitor visitAnnotation(java.lang.String r5, java.lang.String r6) {
                        r4 = this;
                        net.bytebuddy.pool.TypePool$Default$TypeExtractor$AnnotationExtractor r0 = new net.bytebuddy.pool.TypePool$Default$TypeExtractor$AnnotationExtractor
                        net.bytebuddy.pool.TypePool$Default$TypeExtractor r1 = r4.this$1
                        net.bytebuddy.pool.TypePool$Default$TypeExtractor$AnnotationExtractor$AnnotationLookup r2 = new net.bytebuddy.pool.TypePool$Default$TypeExtractor$AnnotationExtractor$AnnotationLookup
                        r2.<init>(r4, r6, r5)
                        net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$ForAnnotationProperty r5 = new net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$ForAnnotationProperty
                        net.bytebuddy.pool.TypePool$Default$TypeExtractor r3 = r4.this$1
                        net.bytebuddy.pool.TypePool$Default r3 = r3.this$0
                        r5.<init>(r3, r6)
                        r0.<init>(r1, r2, r5)
                        return r0
                }

                @Override // net.bytebuddy.jar.asm.AnnotationVisitor
                public net.bytebuddy.jar.asm.AnnotationVisitor visitArray(java.lang.String r6) {
                        r5 = this;
                        net.bytebuddy.pool.TypePool$Default$TypeExtractor$AnnotationExtractor r0 = new net.bytebuddy.pool.TypePool$Default$TypeExtractor$AnnotationExtractor
                        net.bytebuddy.pool.TypePool$Default$TypeExtractor r1 = r5.this$1
                        net.bytebuddy.pool.TypePool$Default$TypeExtractor$AnnotationExtractor$ArrayLookup r2 = new net.bytebuddy.pool.TypePool$Default$TypeExtractor$AnnotationExtractor$ArrayLookup
                        net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator r3 = r5.componentTypeLocator
                        net.bytebuddy.pool.TypePool$AbstractBase$ComponentTypeReference r3 = r3.bind(r6)
                        r4 = 0
                        r2.<init>(r5, r6, r3, r4)
                        net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$Illegal r6 = net.bytebuddy.pool.TypePool.Default.ComponentTypeLocator.Illegal.INSTANCE
                        r0.<init>(r1, r2, r6)
                        return r0
                }

                @Override // net.bytebuddy.jar.asm.AnnotationVisitor
                public void visitEnd() {
                        r1 = this;
                        net.bytebuddy.pool.TypePool$Default$AnnotationRegistrant r0 = r1.annotationRegistrant
                        r0.onComplete()
                        return
                }

                @Override // net.bytebuddy.jar.asm.AnnotationVisitor
                public void visitEnum(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
                        r5 = this;
                        net.bytebuddy.pool.TypePool$Default$AnnotationRegistrant r0 = r5.annotationRegistrant
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForEnumerationValue r1 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$LazyAnnotationValue$ForEnumerationValue
                        net.bytebuddy.pool.TypePool$Default$TypeExtractor r2 = r5.this$1
                        net.bytebuddy.pool.TypePool$Default r2 = r2.this$0
                        int r3 = r7.length()
                        r4 = 1
                        int r3 = r3 - r4
                        java.lang.String r7 = r7.substring(r4, r3)
                        r3 = 47
                        r4 = 46
                        java.lang.String r7 = r7.replace(r3, r4)
                        r3 = 0
                        r1.<init>(r2, r7, r8, r3)
                        r0.register(r6, r1)
                        return
                }
            }

            public class FieldExtractor extends net.bytebuddy.jar.asm.FieldVisitor {
                private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken> annotationTokens;
                private final java.lang.String descriptor;

                @net.bytebuddy.utility.nullability.MaybeNull
                private final java.lang.String genericSignature;
                private final java.lang.String internalName;
                private final int modifiers;
                final /* synthetic */ net.bytebuddy.pool.TypePool.Default.TypeExtractor this$1;
                private final java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> typeAnnotationTokens;

                public FieldExtractor(net.bytebuddy.pool.TypePool.Default.TypeExtractor r1, int r2, java.lang.String r3, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r4, java.lang.String r5) {
                        r0 = this;
                        r0.this$1 = r1
                        int r1 = net.bytebuddy.utility.OpenedClassReader.ASM_API
                        r0.<init>(r1)
                        r0.modifiers = r2
                        r0.internalName = r3
                        r0.descriptor = r4
                        r0.genericSignature = r5
                        java.util.HashMap r1 = new java.util.HashMap
                        r1.<init>()
                        r0.typeAnnotationTokens = r1
                        java.util.ArrayList r1 = new java.util.ArrayList
                        r1.<init>()
                        r0.annotationTokens = r1
                        return
                }

                @Override // net.bytebuddy.jar.asm.FieldVisitor
                public net.bytebuddy.jar.asm.AnnotationVisitor visitAnnotation(java.lang.String r5, boolean r6) {
                        r4 = this;
                        net.bytebuddy.pool.TypePool$Default$TypeExtractor$AnnotationExtractor r6 = new net.bytebuddy.pool.TypePool$Default$TypeExtractor$AnnotationExtractor
                        net.bytebuddy.pool.TypePool$Default$TypeExtractor r0 = r4.this$1
                        java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken> r1 = r4.annotationTokens
                        net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$ForAnnotationProperty r2 = new net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$ForAnnotationProperty
                        net.bytebuddy.pool.TypePool$Default r3 = r0.this$0
                        r2.<init>(r3, r5)
                        r6.<init>(r0, r5, r1, r2)
                        return r6
                }

                @Override // net.bytebuddy.jar.asm.FieldVisitor
                public void visitEnd() {
                        r9 = this;
                        net.bytebuddy.pool.TypePool$Default$TypeExtractor r0 = r9.this$1
                        java.util.List r0 = net.bytebuddy.pool.TypePool.Default.TypeExtractor.access$4200(r0)
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$FieldToken r8 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$FieldToken
                        java.lang.String r2 = r9.internalName
                        int r3 = r9.modifiers
                        java.lang.String r4 = r9.descriptor
                        java.lang.String r5 = r9.genericSignature
                        java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r6 = r9.typeAnnotationTokens
                        java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken> r7 = r9.annotationTokens
                        r1 = r8
                        r1.<init>(r2, r3, r4, r5, r6, r7)
                        r0.add(r8)
                        return
                }

                @Override // net.bytebuddy.jar.asm.FieldVisitor
                @net.bytebuddy.utility.nullability.MaybeNull
                public net.bytebuddy.jar.asm.AnnotationVisitor visitTypeAnnotation(int r3, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.jar.asm.TypePath r4, java.lang.String r5, boolean r6) {
                        r2 = this;
                        net.bytebuddy.jar.asm.TypeReference r6 = new net.bytebuddy.jar.asm.TypeReference
                        r6.<init>(r3)
                        int r3 = r6.getSort()
                        r0 = 19
                        if (r3 != r0) goto L23
                        net.bytebuddy.pool.TypePool$Default$AnnotationRegistrant$ForTypeVariable r3 = new net.bytebuddy.pool.TypePool$Default$AnnotationRegistrant$ForTypeVariable
                        java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r6 = r2.typeAnnotationTokens
                        r3.<init>(r5, r4, r6)
                        net.bytebuddy.pool.TypePool$Default$TypeExtractor$AnnotationExtractor r4 = new net.bytebuddy.pool.TypePool$Default$TypeExtractor$AnnotationExtractor
                        net.bytebuddy.pool.TypePool$Default$TypeExtractor r6 = r2.this$1
                        net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$ForAnnotationProperty r0 = new net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$ForAnnotationProperty
                        net.bytebuddy.pool.TypePool$Default r1 = r6.this$0
                        r0.<init>(r1, r5)
                        r4.<init>(r6, r3, r0)
                        return r4
                    L23:
                        java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r4 = new java.lang.StringBuilder
                        r4.<init>()
                        java.lang.String r5 = "Unexpected type reference on field: "
                        r4.append(r5)
                        int r5 = r6.getSort()
                        r4.append(r5)
                        java.lang.String r4 = r4.toString()
                        r3.<init>(r4)
                        throw r3
                }
            }

            public class MethodExtractor extends net.bytebuddy.jar.asm.MethodVisitor implements net.bytebuddy.pool.TypePool.Default.AnnotationRegistrant {
                private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken> annotationTokens;

                @net.bytebuddy.utility.nullability.MaybeNull
                private net.bytebuddy.description.annotation.AnnotationValue<?, ?> defaultValue;
                private final java.lang.String descriptor;

                @net.bytebuddy.utility.nullability.MaybeNull
                private final java.lang.String[] exceptionName;
                private final java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> exceptionTypeAnnotationTokens;

                @net.bytebuddy.utility.nullability.MaybeNull
                private net.bytebuddy.jar.asm.Label firstLabel;

                @net.bytebuddy.utility.nullability.MaybeNull
                private final java.lang.String genericSignature;
                private final java.lang.String internalName;
                private int invisibleParameterShift;
                private final net.bytebuddy.pool.TypePool.Default.ParameterBag legacyParameterBag;
                private final int modifiers;
                private final java.util.Map<java.lang.Integer, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> parameterAnnotationTokens;
                private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.MethodToken.ParameterToken> parameterTokens;
                private final java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> parameterTypeAnnotationTokens;
                private final java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> receiverTypeAnnotationTokens;
                private final java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> returnTypeAnnotationTokens;
                final /* synthetic */ net.bytebuddy.pool.TypePool.Default.TypeExtractor this$1;
                private final java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>> typeVariableAnnotationTokens;
                private final java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>>>> typeVariableBoundAnnotationTokens;
                private int visibleParameterShift;

                public MethodExtractor(net.bytebuddy.pool.TypePool.Default.TypeExtractor r1, int r2, java.lang.String r3, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r4, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r5, java.lang.String[] r6) {
                        r0 = this;
                        r0.this$1 = r1
                        int r1 = net.bytebuddy.utility.OpenedClassReader.ASM_API
                        r0.<init>(r1)
                        r0.modifiers = r2
                        r0.internalName = r3
                        r0.descriptor = r4
                        r0.genericSignature = r5
                        r0.exceptionName = r6
                        java.util.HashMap r1 = new java.util.HashMap
                        r1.<init>()
                        r0.typeVariableAnnotationTokens = r1
                        java.util.HashMap r1 = new java.util.HashMap
                        r1.<init>()
                        r0.typeVariableBoundAnnotationTokens = r1
                        java.util.HashMap r1 = new java.util.HashMap
                        r1.<init>()
                        r0.returnTypeAnnotationTokens = r1
                        java.util.HashMap r1 = new java.util.HashMap
                        r1.<init>()
                        r0.parameterTypeAnnotationTokens = r1
                        java.util.HashMap r1 = new java.util.HashMap
                        r1.<init>()
                        r0.exceptionTypeAnnotationTokens = r1
                        java.util.HashMap r1 = new java.util.HashMap
                        r1.<init>()
                        r0.receiverTypeAnnotationTokens = r1
                        java.util.ArrayList r1 = new java.util.ArrayList
                        r1.<init>()
                        r0.annotationTokens = r1
                        java.util.HashMap r1 = new java.util.HashMap
                        r1.<init>()
                        r0.parameterAnnotationTokens = r1
                        java.util.ArrayList r1 = new java.util.ArrayList
                        r1.<init>()
                        r0.parameterTokens = r1
                        net.bytebuddy.pool.TypePool$Default$ParameterBag r1 = new net.bytebuddy.pool.TypePool$Default$ParameterBag
                        net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.getMethodType(r4)
                        net.bytebuddy.jar.asm.Type[] r2 = r2.getArgumentTypes()
                        r1.<init>(r2)
                        r0.legacyParameterBag = r1
                        return
                }

                @Override // net.bytebuddy.pool.TypePool.Default.AnnotationRegistrant
                public void onComplete() {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.pool.TypePool.Default.AnnotationRegistrant
                public void register(java.lang.String r1, net.bytebuddy.description.annotation.AnnotationValue<?, ?> r2) {
                        r0 = this;
                        r0.defaultValue = r2
                        return
                }

                @Override // net.bytebuddy.jar.asm.MethodVisitor
                public void visitAnnotableParameterCount(int r1, boolean r2) {
                        r0 = this;
                        if (r2 == 0) goto L11
                        java.lang.String r2 = r0.descriptor
                        net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.getMethodType(r2)
                        net.bytebuddy.jar.asm.Type[] r2 = r2.getArgumentTypes()
                        int r2 = r2.length
                        int r2 = r2 - r1
                        r0.visibleParameterShift = r2
                        goto L1f
                    L11:
                        java.lang.String r2 = r0.descriptor
                        net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.getMethodType(r2)
                        net.bytebuddy.jar.asm.Type[] r2 = r2.getArgumentTypes()
                        int r2 = r2.length
                        int r2 = r2 - r1
                        r0.invisibleParameterShift = r2
                    L1f:
                        return
                }

                @Override // net.bytebuddy.jar.asm.MethodVisitor
                public net.bytebuddy.jar.asm.AnnotationVisitor visitAnnotation(java.lang.String r5, boolean r6) {
                        r4 = this;
                        net.bytebuddy.pool.TypePool$Default$TypeExtractor$AnnotationExtractor r6 = new net.bytebuddy.pool.TypePool$Default$TypeExtractor$AnnotationExtractor
                        net.bytebuddy.pool.TypePool$Default$TypeExtractor r0 = r4.this$1
                        java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken> r1 = r4.annotationTokens
                        net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$ForAnnotationProperty r2 = new net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$ForAnnotationProperty
                        net.bytebuddy.pool.TypePool$Default r3 = r0.this$0
                        r2.<init>(r3, r5)
                        r6.<init>(r0, r5, r1, r2)
                        return r6
                }

                @Override // net.bytebuddy.jar.asm.MethodVisitor
                public net.bytebuddy.jar.asm.AnnotationVisitor visitAnnotationDefault() {
                        r4 = this;
                        net.bytebuddy.pool.TypePool$Default$TypeExtractor$AnnotationExtractor r0 = new net.bytebuddy.pool.TypePool$Default$TypeExtractor$AnnotationExtractor
                        net.bytebuddy.pool.TypePool$Default$TypeExtractor r1 = r4.this$1
                        net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$ForArrayType r2 = new net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$ForArrayType
                        java.lang.String r3 = r4.descriptor
                        r2.<init>(r3)
                        r0.<init>(r1, r4, r2)
                        return r0
                }

                @Override // net.bytebuddy.jar.asm.MethodVisitor
                public void visitEnd() {
                        r19 = this;
                        r0 = r19
                        net.bytebuddy.pool.TypePool$Default$TypeExtractor r1 = r0.this$1
                        java.util.List r1 = net.bytebuddy.pool.TypePool.Default.TypeExtractor.access$4300(r1)
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$MethodToken r15 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$MethodToken
                        java.lang.String r3 = r0.internalName
                        int r4 = r0.modifiers
                        java.lang.String r5 = r0.descriptor
                        java.lang.String r6 = r0.genericSignature
                        java.lang.String[] r7 = r0.exceptionName
                        java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>> r8 = r0.typeVariableAnnotationTokens
                        java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>>> r9 = r0.typeVariableBoundAnnotationTokens
                        java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r10 = r0.returnTypeAnnotationTokens
                        java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>> r11 = r0.parameterTypeAnnotationTokens
                        java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>> r12 = r0.exceptionTypeAnnotationTokens
                        java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r13 = r0.receiverTypeAnnotationTokens
                        java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken> r14 = r0.annotationTokens
                        java.util.Map<java.lang.Integer, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r2 = r0.parameterAnnotationTokens
                        r16 = r2
                        java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$MethodToken$ParameterToken> r2 = r0.parameterTokens
                        boolean r2 = r2.isEmpty()
                        if (r2 == 0) goto L40
                        net.bytebuddy.pool.TypePool$Default$ParameterBag r2 = r0.legacyParameterBag
                        r18 = r1
                        int r1 = r0.modifiers
                        r1 = r1 & 8
                        if (r1 == 0) goto L3a
                        r1 = 1
                        goto L3b
                    L3a:
                        r1 = 0
                    L3b:
                        java.util.List r1 = r2.resolve(r1)
                        goto L44
                    L40:
                        r18 = r1
                        java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$MethodToken$ParameterToken> r1 = r0.parameterTokens
                    L44:
                        net.bytebuddy.description.annotation.AnnotationValue<?, ?> r2 = r0.defaultValue
                        r17 = r2
                        r2 = r15
                        r0 = r15
                        r15 = r16
                        r16 = r1
                        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                        r1 = r18
                        r1.add(r0)
                        return
                }

                @Override // net.bytebuddy.jar.asm.MethodVisitor
                public void visitLabel(net.bytebuddy.jar.asm.Label r2) {
                        r1 = this;
                        net.bytebuddy.pool.TypePool$Default$TypeExtractor r0 = r1.this$1
                        net.bytebuddy.pool.TypePool$Default r0 = r0.this$0
                        net.bytebuddy.pool.TypePool$Default$ReaderMode r0 = r0.readerMode
                        boolean r0 = r0.isExtended()
                        if (r0 == 0) goto L12
                        net.bytebuddy.jar.asm.Label r0 = r1.firstLabel
                        if (r0 != 0) goto L12
                        r1.firstLabel = r2
                    L12:
                        return
                }

                @Override // net.bytebuddy.jar.asm.MethodVisitor
                public void visitLocalVariable(java.lang.String r1, java.lang.String r2, java.lang.String r3, net.bytebuddy.jar.asm.Label r4, net.bytebuddy.jar.asm.Label r5, int r6) {
                        r0 = this;
                        net.bytebuddy.pool.TypePool$Default$TypeExtractor r2 = r0.this$1
                        net.bytebuddy.pool.TypePool$Default r2 = r2.this$0
                        net.bytebuddy.pool.TypePool$Default$ReaderMode r2 = r2.readerMode
                        boolean r2 = r2.isExtended()
                        if (r2 == 0) goto L15
                        net.bytebuddy.jar.asm.Label r2 = r0.firstLabel
                        if (r4 != r2) goto L15
                        net.bytebuddy.pool.TypePool$Default$ParameterBag r2 = r0.legacyParameterBag
                        r2.register(r6, r1)
                    L15:
                        return
                }

                @Override // net.bytebuddy.jar.asm.MethodVisitor
                public void visitParameter(java.lang.String r3, int r4) {
                        r2 = this;
                        java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$MethodToken$ParameterToken> r0 = r2.parameterTokens
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$MethodToken$ParameterToken r1 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$MethodToken$ParameterToken
                        java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                        r1.<init>(r3, r4)
                        r0.add(r1)
                        return
                }

                @Override // net.bytebuddy.jar.asm.MethodVisitor
                public net.bytebuddy.jar.asm.AnnotationVisitor visitParameterAnnotation(int r8, java.lang.String r9, boolean r10) {
                        r7 = this;
                        net.bytebuddy.pool.TypePool$Default$TypeExtractor$AnnotationExtractor r6 = new net.bytebuddy.pool.TypePool$Default$TypeExtractor$AnnotationExtractor
                        net.bytebuddy.pool.TypePool$Default$TypeExtractor r1 = r7.this$1
                        if (r10 == 0) goto L9
                        int r10 = r7.visibleParameterShift
                        goto Lb
                    L9:
                        int r10 = r7.invisibleParameterShift
                    Lb:
                        int r3 = r8 + r10
                        java.util.Map<java.lang.Integer, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r4 = r7.parameterAnnotationTokens
                        net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$ForAnnotationProperty r5 = new net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$ForAnnotationProperty
                        net.bytebuddy.pool.TypePool$Default r8 = r1.this$0
                        r5.<init>(r8, r9)
                        r0 = r6
                        r2 = r9
                        r0.<init>(r1, r2, r3, r4, r5)
                        return r6
                }

                @Override // net.bytebuddy.jar.asm.MethodVisitor
                @net.bytebuddy.utility.nullability.MaybeNull
                public net.bytebuddy.jar.asm.AnnotationVisitor visitTypeAnnotation(int r7, net.bytebuddy.jar.asm.TypePath r8, java.lang.String r9, boolean r10) {
                        r6 = this;
                        net.bytebuddy.jar.asm.TypeReference r10 = new net.bytebuddy.jar.asm.TypeReference
                        r10.<init>(r7)
                        int r7 = r10.getSort()
                        r0 = 1
                        if (r7 == r0) goto L67
                        switch(r7) {
                            case 18: goto L54;
                            case 19: goto L52;
                            case 20: goto L4a;
                            case 21: goto L42;
                            case 22: goto L36;
                            case 23: goto L2a;
                            default: goto Lf;
                        }
                    Lf:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r8 = new java.lang.StringBuilder
                        r8.<init>()
                        java.lang.String r9 = "Unexpected type reference on method: "
                        r8.append(r9)
                        int r9 = r10.getSort()
                        r8.append(r9)
                        java.lang.String r8 = r8.toString()
                        r7.<init>(r8)
                        throw r7
                    L2a:
                        net.bytebuddy.pool.TypePool$Default$AnnotationRegistrant$ForTypeVariable$WithIndex r7 = new net.bytebuddy.pool.TypePool$Default$AnnotationRegistrant$ForTypeVariable$WithIndex
                        int r10 = r10.getExceptionIndex()
                        java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>> r0 = r6.exceptionTypeAnnotationTokens
                        r7.<init>(r9, r8, r10, r0)
                        goto L72
                    L36:
                        net.bytebuddy.pool.TypePool$Default$AnnotationRegistrant$ForTypeVariable$WithIndex r7 = new net.bytebuddy.pool.TypePool$Default$AnnotationRegistrant$ForTypeVariable$WithIndex
                        int r10 = r10.getFormalParameterIndex()
                        java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>> r0 = r6.parameterTypeAnnotationTokens
                        r7.<init>(r9, r8, r10, r0)
                        goto L72
                    L42:
                        net.bytebuddy.pool.TypePool$Default$AnnotationRegistrant$ForTypeVariable r7 = new net.bytebuddy.pool.TypePool$Default$AnnotationRegistrant$ForTypeVariable
                        java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r10 = r6.receiverTypeAnnotationTokens
                        r7.<init>(r9, r8, r10)
                        goto L72
                    L4a:
                        net.bytebuddy.pool.TypePool$Default$AnnotationRegistrant$ForTypeVariable r7 = new net.bytebuddy.pool.TypePool$Default$AnnotationRegistrant$ForTypeVariable
                        java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r10 = r6.returnTypeAnnotationTokens
                        r7.<init>(r9, r8, r10)
                        goto L72
                    L52:
                        r7 = 0
                        return r7
                    L54:
                        net.bytebuddy.pool.TypePool$Default$AnnotationRegistrant$ForTypeVariable$WithIndex$DoubleIndexed r7 = new net.bytebuddy.pool.TypePool$Default$AnnotationRegistrant$ForTypeVariable$WithIndex$DoubleIndexed
                        int r3 = r10.getTypeParameterBoundIndex()
                        int r4 = r10.getTypeParameterIndex()
                        java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>>> r5 = r6.typeVariableBoundAnnotationTokens
                        r0 = r7
                        r1 = r9
                        r2 = r8
                        r0.<init>(r1, r2, r3, r4, r5)
                        goto L72
                    L67:
                        net.bytebuddy.pool.TypePool$Default$AnnotationRegistrant$ForTypeVariable$WithIndex r7 = new net.bytebuddy.pool.TypePool$Default$AnnotationRegistrant$ForTypeVariable$WithIndex
                        int r10 = r10.getTypeParameterIndex()
                        java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>> r0 = r6.typeVariableAnnotationTokens
                        r7.<init>(r9, r8, r10, r0)
                    L72:
                        net.bytebuddy.pool.TypePool$Default$TypeExtractor$AnnotationExtractor r8 = new net.bytebuddy.pool.TypePool$Default$TypeExtractor$AnnotationExtractor
                        net.bytebuddy.pool.TypePool$Default$TypeExtractor r10 = r6.this$1
                        net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$ForAnnotationProperty r0 = new net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$ForAnnotationProperty
                        net.bytebuddy.pool.TypePool$Default r1 = r10.this$0
                        r0.<init>(r1, r9)
                        r8.<init>(r10, r7, r0)
                        return r8
                }
            }

            public class RecordComponentExtractor extends net.bytebuddy.jar.asm.RecordComponentVisitor {
                private final java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken> annotationTokens;
                private final java.lang.String descriptor;

                @net.bytebuddy.utility.nullability.MaybeNull
                private final java.lang.String genericSignature;
                private final java.lang.String name;
                final /* synthetic */ net.bytebuddy.pool.TypePool.Default.TypeExtractor this$1;
                private final java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.AnnotationToken>> typeAnnotationTokens;

                public RecordComponentExtractor(net.bytebuddy.pool.TypePool.Default.TypeExtractor r1, java.lang.String r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r3, java.lang.String r4) {
                        r0 = this;
                        r0.this$1 = r1
                        int r1 = net.bytebuddy.utility.OpenedClassReader.ASM_API
                        r0.<init>(r1)
                        r0.name = r2
                        r0.descriptor = r3
                        r0.genericSignature = r4
                        java.util.HashMap r1 = new java.util.HashMap
                        r1.<init>()
                        r0.typeAnnotationTokens = r1
                        java.util.ArrayList r1 = new java.util.ArrayList
                        r1.<init>()
                        r0.annotationTokens = r1
                        return
                }

                @Override // net.bytebuddy.jar.asm.RecordComponentVisitor
                public net.bytebuddy.jar.asm.AnnotationVisitor visitAnnotation(java.lang.String r5, boolean r6) {
                        r4 = this;
                        net.bytebuddy.pool.TypePool$Default$TypeExtractor$AnnotationExtractor r6 = new net.bytebuddy.pool.TypePool$Default$TypeExtractor$AnnotationExtractor
                        net.bytebuddy.pool.TypePool$Default$TypeExtractor r0 = r4.this$1
                        java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken> r1 = r4.annotationTokens
                        net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$ForAnnotationProperty r2 = new net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$ForAnnotationProperty
                        net.bytebuddy.pool.TypePool$Default r3 = r0.this$0
                        r2.<init>(r3, r5)
                        r6.<init>(r0, r5, r1, r2)
                        return r6
                }

                @Override // net.bytebuddy.jar.asm.RecordComponentVisitor
                public void visitEnd() {
                        r8 = this;
                        net.bytebuddy.pool.TypePool$Default$TypeExtractor r0 = r8.this$1
                        java.util.List r0 = net.bytebuddy.pool.TypePool.Default.TypeExtractor.access$4400(r0)
                        net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$RecordComponentToken r7 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$RecordComponentToken
                        java.lang.String r2 = r8.name
                        java.lang.String r3 = r8.descriptor
                        java.lang.String r4 = r8.genericSignature
                        java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r5 = r8.typeAnnotationTokens
                        java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken> r6 = r8.annotationTokens
                        r1 = r7
                        r1.<init>(r2, r3, r4, r5, r6)
                        r0.add(r7)
                        return
                }

                @Override // net.bytebuddy.jar.asm.RecordComponentVisitor
                public net.bytebuddy.jar.asm.AnnotationVisitor visitTypeAnnotation(int r3, net.bytebuddy.jar.asm.TypePath r4, java.lang.String r5, boolean r6) {
                        r2 = this;
                        net.bytebuddy.jar.asm.TypeReference r6 = new net.bytebuddy.jar.asm.TypeReference
                        r6.<init>(r3)
                        int r3 = r6.getSort()
                        r0 = 19
                        if (r3 != r0) goto L23
                        net.bytebuddy.pool.TypePool$Default$AnnotationRegistrant$ForTypeVariable r3 = new net.bytebuddy.pool.TypePool$Default$AnnotationRegistrant$ForTypeVariable
                        java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>> r6 = r2.typeAnnotationTokens
                        r3.<init>(r5, r4, r6)
                        net.bytebuddy.pool.TypePool$Default$TypeExtractor$AnnotationExtractor r4 = new net.bytebuddy.pool.TypePool$Default$TypeExtractor$AnnotationExtractor
                        net.bytebuddy.pool.TypePool$Default$TypeExtractor r6 = r2.this$1
                        net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$ForAnnotationProperty r0 = new net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$ForAnnotationProperty
                        net.bytebuddy.pool.TypePool$Default r1 = r6.this$0
                        r0.<init>(r1, r5)
                        r4.<init>(r6, r3, r0)
                        return r4
                    L23:
                        java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r4 = new java.lang.StringBuilder
                        r4.<init>()
                        java.lang.String r5 = "Unexpected type reference on record component: "
                        r4.append(r5)
                        int r5 = r6.getSort()
                        r4.append(r5)
                        java.lang.String r4 = r4.toString()
                        r3.<init>(r4)
                        throw r3
                }
            }

            public TypeExtractor(net.bytebuddy.pool.TypePool.Default r1) {
                    r0 = this;
                    r0.this$0 = r1
                    int r1 = net.bytebuddy.utility.OpenedClassReader.ASM_API
                    r0.<init>(r1)
                    java.util.HashMap r1 = new java.util.HashMap
                    r1.<init>()
                    r0.superTypeAnnotationTokens = r1
                    java.util.HashMap r1 = new java.util.HashMap
                    r1.<init>()
                    r0.typeVariableAnnotationTokens = r1
                    java.util.HashMap r1 = new java.util.HashMap
                    r1.<init>()
                    r0.typeVariableBoundsAnnotationTokens = r1
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    r0.annotationTokens = r1
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    r0.fieldTokens = r1
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    r0.methodTokens = r1
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    r0.recordComponentTokens = r1
                    r1 = 0
                    r0.anonymousType = r1
                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TypeContainment$SelfContained r1 = net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment.SelfContained.INSTANCE
                    r0.typeContainment = r1
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    r0.nestMembers = r1
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    r0.declaredTypes = r1
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    r0.permittedSubclasses = r1
                    return
            }

            public static /* synthetic */ java.util.List access$4200(net.bytebuddy.pool.TypePool.Default.TypeExtractor r0) {
                    java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$FieldToken> r0 = r0.fieldTokens
                    return r0
            }

            public static /* synthetic */ java.util.List access$4300(net.bytebuddy.pool.TypePool.Default.TypeExtractor r0) {
                    java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$MethodToken> r0 = r0.methodTokens
                    return r0
            }

            public static /* synthetic */ java.util.List access$4400(net.bytebuddy.pool.TypePool.Default.TypeExtractor r0) {
                    java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$RecordComponentToken> r0 = r0.recordComponentTokens
                    return r0
            }

            public net.bytebuddy.description.type.TypeDescription toTypeDescription() {
                    r27 = this;
                    r0 = r27
                    java.lang.String r1 = r0.internalName
                    if (r1 == 0) goto L65
                    net.bytebuddy.ClassFileVersion r1 = r0.classFileVersion
                    if (r1 == 0) goto L65
                    java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>> r1 = r0.superTypeAnnotationTokens
                    r2 = -1
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    java.lang.Object r1 = r1.remove(r2)
                    java.util.Map r1 = (java.util.Map) r1
                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription r26 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription
                    net.bytebuddy.pool.TypePool$Default r3 = r0.this$0
                    int r4 = r0.actualModifiers
                    int r5 = r0.modifiers
                    java.lang.String r6 = r0.internalName
                    java.lang.String r7 = r0.superClassName
                    java.lang.String[] r8 = r0.interfaceName
                    java.lang.String r9 = r0.genericSignature
                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TypeContainment r10 = r0.typeContainment
                    java.lang.String r11 = r0.declaringTypeName
                    java.util.List<java.lang.String> r12 = r0.declaredTypes
                    boolean r13 = r0.anonymousType
                    java.lang.String r14 = r0.nestHost
                    java.util.List<java.lang.String> r15 = r0.nestMembers
                    if (r1 != 0) goto L39
                    java.util.Map r1 = java.util.Collections.emptyMap()
                L39:
                    r16 = r1
                    java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>> r1 = r0.superTypeAnnotationTokens
                    r17 = r1
                    java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>> r1 = r0.typeVariableAnnotationTokens
                    r18 = r1
                    java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>>> r1 = r0.typeVariableBoundsAnnotationTokens
                    r19 = r1
                    java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken> r1 = r0.annotationTokens
                    r20 = r1
                    java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$FieldToken> r1 = r0.fieldTokens
                    r21 = r1
                    java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$MethodToken> r1 = r0.methodTokens
                    r22 = r1
                    java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$RecordComponentToken> r1 = r0.recordComponentTokens
                    r23 = r1
                    java.util.List<java.lang.String> r1 = r0.permittedSubclasses
                    r24 = r1
                    net.bytebuddy.ClassFileVersion r1 = r0.classFileVersion
                    r25 = r1
                    r2 = r26
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
                    return r26
                L65:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "Internal name or class file version were not set"
                    r1.<init>(r2)
                    throw r1
            }

            @Override // net.bytebuddy.jar.asm.ClassVisitor
            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "The array is not modified by class contract.", value = {"EI_EXPOSE_REP2"})
            public void visit(int r2, int r3, java.lang.String r4, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r5, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r6, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String[] r7) {
                    r1 = this;
                    r0 = 65535(0xffff, float:9.1834E-41)
                    r0 = r0 & r3
                    r1.modifiers = r0
                    r1.actualModifiers = r3
                    r1.internalName = r4
                    r1.genericSignature = r5
                    r1.superClassName = r6
                    r1.interfaceName = r7
                    net.bytebuddy.ClassFileVersion r2 = net.bytebuddy.ClassFileVersion.ofMinorMajor(r2)
                    r1.classFileVersion = r2
                    return
            }

            @Override // net.bytebuddy.jar.asm.ClassVisitor
            public net.bytebuddy.jar.asm.AnnotationVisitor visitAnnotation(java.lang.String r4, boolean r5) {
                    r3 = this;
                    net.bytebuddy.pool.TypePool$Default$TypeExtractor$AnnotationExtractor r5 = new net.bytebuddy.pool.TypePool$Default$TypeExtractor$AnnotationExtractor
                    java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken> r0 = r3.annotationTokens
                    net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$ForAnnotationProperty r1 = new net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$ForAnnotationProperty
                    net.bytebuddy.pool.TypePool$Default r2 = r3.this$0
                    r1.<init>(r2, r4)
                    r5.<init>(r3, r4, r0, r1)
                    return r5
            }

            @Override // net.bytebuddy.jar.asm.ClassVisitor
            public net.bytebuddy.jar.asm.FieldVisitor visitField(int r7, java.lang.String r8, java.lang.String r9, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r10, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r11) {
                    r6 = this;
                    net.bytebuddy.pool.TypePool$Default$TypeExtractor$FieldExtractor r11 = new net.bytebuddy.pool.TypePool$Default$TypeExtractor$FieldExtractor
                    r0 = 65535(0xffff, float:9.1834E-41)
                    r2 = r7 & r0
                    r0 = r11
                    r1 = r6
                    r3 = r8
                    r4 = r9
                    r5 = r10
                    r0.<init>(r1, r2, r3, r4, r5)
                    return r11
            }

            @Override // net.bytebuddy.jar.asm.ClassVisitor
            public void visitInnerClass(java.lang.String r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r3, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r4, int r5) {
                    r1 = this;
                    java.lang.String r0 = r1.internalName
                    boolean r0 = r2.equals(r0)
                    if (r0 == 0) goto L30
                    if (r3 == 0) goto L1c
                    r1.declaringTypeName = r3
                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TypeContainment r2 = r1.typeContainment
                    boolean r2 = r2.isSelfContained()
                    if (r2 == 0) goto L1c
                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TypeContainment$WithinType r2 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TypeContainment$WithinType
                    r0 = 0
                    r2.<init>(r3, r0)
                    r1.typeContainment = r2
                L1c:
                    if (r4 != 0) goto L29
                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TypeContainment r2 = r1.typeContainment
                    boolean r2 = r2.isSelfContained()
                    if (r2 != 0) goto L29
                    r2 = 1
                    r1.anonymousType = r2
                L29:
                    r2 = 65535(0xffff, float:9.1834E-41)
                    r2 = r2 & r5
                    r1.modifiers = r2
                    goto L57
                L30:
                    if (r3 == 0) goto L57
                    if (r4 == 0) goto L57
                    java.lang.String r4 = r1.internalName
                    boolean r3 = r3.equals(r4)
                    if (r3 == 0) goto L57
                    java.util.List<java.lang.String> r3 = r1.declaredTypes
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    java.lang.String r5 = "L"
                    r4.append(r5)
                    r4.append(r2)
                    java.lang.String r2 = ";"
                    r4.append(r2)
                    java.lang.String r2 = r4.toString()
                    r3.add(r2)
                L57:
                    return
            }

            @Override // net.bytebuddy.jar.asm.ClassVisitor
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.jar.asm.MethodVisitor visitMethod(int r9, java.lang.String r10, java.lang.String r11, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r12, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String[] r13) {
                    r8 = this;
                    java.lang.String r0 = "<clinit>"
                    boolean r0 = r10.equals(r0)
                    if (r0 == 0) goto Ld
                    net.bytebuddy.jar.asm.MethodVisitor r9 = net.bytebuddy.pool.TypePool.Default.access$3500()
                    goto L1e
                Ld:
                    net.bytebuddy.pool.TypePool$Default$TypeExtractor$MethodExtractor r7 = new net.bytebuddy.pool.TypePool$Default$TypeExtractor$MethodExtractor
                    r0 = 65535(0xffff, float:9.1834E-41)
                    r2 = r9 & r0
                    r0 = r7
                    r1 = r8
                    r3 = r10
                    r4 = r11
                    r5 = r12
                    r6 = r13
                    r0.<init>(r1, r2, r3, r4, r5, r6)
                    r9 = r7
                L1e:
                    return r9
            }

            @Override // net.bytebuddy.jar.asm.ClassVisitor
            public void visitNestHost(java.lang.String r1) {
                    r0 = this;
                    r0.nestHost = r1
                    return
            }

            @Override // net.bytebuddy.jar.asm.ClassVisitor
            public void visitNestMember(java.lang.String r2) {
                    r1 = this;
                    java.util.List<java.lang.String> r0 = r1.nestMembers
                    r0.add(r2)
                    return
            }

            @Override // net.bytebuddy.jar.asm.ClassVisitor
            public void visitOuterClass(@net.bytebuddy.utility.nullability.MaybeNull java.lang.String r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r3, java.lang.String r4) {
                    r1 = this;
                    if (r3 == 0) goto L12
                    java.lang.String r0 = "<clinit>"
                    boolean r0 = r3.equals(r0)
                    if (r0 != 0) goto L12
                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TypeContainment$WithinMethod r0 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TypeContainment$WithinMethod
                    r0.<init>(r2, r3, r4)
                    r1.typeContainment = r0
                    goto L1c
                L12:
                    if (r2 == 0) goto L1c
                    net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TypeContainment$WithinType r3 = new net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$TypeContainment$WithinType
                    r4 = 1
                    r3.<init>(r2, r4)
                    r1.typeContainment = r3
                L1c:
                    return
            }

            @Override // net.bytebuddy.jar.asm.ClassVisitor
            public void visitPermittedSubclass(java.lang.String r2) {
                    r1 = this;
                    java.util.List<java.lang.String> r0 = r1.permittedSubclasses
                    r0.add(r2)
                    return
            }

            @Override // net.bytebuddy.jar.asm.ClassVisitor
            public net.bytebuddy.jar.asm.RecordComponentVisitor visitRecordComponent(java.lang.String r2, java.lang.String r3, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r4) {
                    r1 = this;
                    net.bytebuddy.pool.TypePool$Default$TypeExtractor$RecordComponentExtractor r0 = new net.bytebuddy.pool.TypePool$Default$TypeExtractor$RecordComponentExtractor
                    r0.<init>(r1, r2, r3, r4)
                    return r0
            }

            @Override // net.bytebuddy.jar.asm.ClassVisitor
            public net.bytebuddy.jar.asm.AnnotationVisitor visitTypeAnnotation(int r8, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.jar.asm.TypePath r9, java.lang.String r10, boolean r11) {
                    r7 = this;
                    net.bytebuddy.jar.asm.TypeReference r11 = new net.bytebuddy.jar.asm.TypeReference
                    r11.<init>(r8)
                    int r8 = r11.getSort()
                    if (r8 == 0) goto L4d
                    r0 = 16
                    if (r8 == r0) goto L41
                    r0 = 17
                    if (r8 != r0) goto L26
                    net.bytebuddy.pool.TypePool$Default$AnnotationRegistrant$ForTypeVariable$WithIndex$DoubleIndexed r8 = new net.bytebuddy.pool.TypePool$Default$AnnotationRegistrant$ForTypeVariable$WithIndex$DoubleIndexed
                    int r4 = r11.getTypeParameterBoundIndex()
                    int r5 = r11.getTypeParameterIndex()
                    java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>>> r6 = r7.typeVariableBoundsAnnotationTokens
                    r1 = r8
                    r2 = r10
                    r3 = r9
                    r1.<init>(r2, r3, r4, r5, r6)
                    goto L58
                L26:
                    java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r9 = new java.lang.StringBuilder
                    r9.<init>()
                    java.lang.String r10 = "Unexpected type reference: "
                    r9.append(r10)
                    int r10 = r11.getSort()
                    r9.append(r10)
                    java.lang.String r9 = r9.toString()
                    r8.<init>(r9)
                    throw r8
                L41:
                    net.bytebuddy.pool.TypePool$Default$AnnotationRegistrant$ForTypeVariable$WithIndex r8 = new net.bytebuddy.pool.TypePool$Default$AnnotationRegistrant$ForTypeVariable$WithIndex
                    int r11 = r11.getSuperTypeIndex()
                    java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>> r0 = r7.superTypeAnnotationTokens
                    r8.<init>(r10, r9, r11, r0)
                    goto L58
                L4d:
                    net.bytebuddy.pool.TypePool$Default$AnnotationRegistrant$ForTypeVariable$WithIndex r8 = new net.bytebuddy.pool.TypePool$Default$AnnotationRegistrant$ForTypeVariable$WithIndex
                    int r11 = r11.getTypeParameterIndex()
                    java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, java.util.List<net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$AnnotationToken>>> r0 = r7.typeVariableAnnotationTokens
                    r8.<init>(r10, r9, r11, r0)
                L58:
                    net.bytebuddy.pool.TypePool$Default$TypeExtractor$AnnotationExtractor r9 = new net.bytebuddy.pool.TypePool$Default$TypeExtractor$AnnotationExtractor
                    net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$ForAnnotationProperty r11 = new net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$ForAnnotationProperty
                    net.bytebuddy.pool.TypePool$Default r0 = r7.this$0
                    r11.<init>(r0, r10)
                    r9.<init>(r7, r8, r11)
                    return r9
            }
        }

        public static class WithLazyResolution extends net.bytebuddy.pool.TypePool.Default {

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
            public class LazyResolution implements net.bytebuddy.pool.TypePool.Resolution {
                private final java.lang.String name;
                final /* synthetic */ net.bytebuddy.pool.TypePool.Default.WithLazyResolution this$0;

                public LazyResolution(net.bytebuddy.pool.TypePool.Default.WithLazyResolution r1, java.lang.String r2) {
                        r0 = this;
                        r0.this$0 = r1
                        r0.<init>()
                        r0.name = r2
                        return
                }

                public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                        r4 = this;
                        r0 = 1
                        if (r4 != r5) goto L4
                        return r0
                    L4:
                        r1 = 0
                        if (r5 != 0) goto L8
                        return r1
                    L8:
                        java.lang.Class r2 = r4.getClass()
                        java.lang.Class r3 = r5.getClass()
                        if (r2 == r3) goto L13
                        return r1
                    L13:
                        java.lang.String r2 = r4.name
                        net.bytebuddy.pool.TypePool$Default$WithLazyResolution$LazyResolution r5 = (net.bytebuddy.pool.TypePool.Default.WithLazyResolution.LazyResolution) r5
                        java.lang.String r3 = r5.name
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        net.bytebuddy.pool.TypePool$Default$WithLazyResolution r2 = r4.this$0
                        net.bytebuddy.pool.TypePool$Default$WithLazyResolution r5 = r5.this$0
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L2b
                        return r1
                    L2b:
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        java.lang.String r1 = r2.name
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.pool.TypePool$Default$WithLazyResolution r1 = r2.this$0
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.pool.TypePool.Resolution
                public boolean isResolved() {
                        r2 = this;
                        net.bytebuddy.pool.TypePool$Default$WithLazyResolution r0 = r2.this$0
                        java.lang.String r1 = r2.name
                        net.bytebuddy.pool.TypePool$Resolution r0 = r0.doResolve(r1)
                        boolean r0 = r0.isResolved()
                        return r0
                }

                @Override // net.bytebuddy.pool.TypePool.Resolution
                public net.bytebuddy.description.type.TypeDescription resolve() {
                        r3 = this;
                        net.bytebuddy.pool.TypePool$Default$WithLazyResolution$LazyTypeDescription r0 = new net.bytebuddy.pool.TypePool$Default$WithLazyResolution$LazyTypeDescription
                        net.bytebuddy.pool.TypePool$Default$WithLazyResolution r1 = r3.this$0
                        java.lang.String r2 = r3.name
                        r0.<init>(r1, r2)
                        return r0
                }
            }

            public class LazyTypeDescription extends net.bytebuddy.description.type.TypeDescription.AbstractBase.OfSimpleType.WithDelegation {
                private transient /* synthetic */ net.bytebuddy.description.type.TypeDescription delegate;
                private final java.lang.String name;
                final /* synthetic */ net.bytebuddy.pool.TypePool.Default.WithLazyResolution this$0;

                public LazyTypeDescription(net.bytebuddy.pool.TypePool.Default.WithLazyResolution r1, java.lang.String r2) {
                        r0 = this;
                        r0.this$0 = r1
                        r0.<init>()
                        r0.name = r2
                        return
                }

                @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase.OfSimpleType.WithDelegation
                @net.bytebuddy.build.CachedReturnPlugin.Enhance("delegate")
                public net.bytebuddy.description.type.TypeDescription delegate() {
                        r2 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r2.delegate
                        if (r0 == 0) goto L6
                        r0 = 0
                        goto L12
                    L6:
                        net.bytebuddy.pool.TypePool$Default$WithLazyResolution r0 = r2.this$0
                        java.lang.String r1 = r2.name
                        net.bytebuddy.pool.TypePool$Resolution r0 = r0.doResolve(r1)
                        net.bytebuddy.description.type.TypeDescription r0 = r0.resolve()
                    L12:
                        if (r0 != 0) goto L17
                        net.bytebuddy.description.type.TypeDescription r0 = r2.delegate
                        goto L19
                    L17:
                        r2.delegate = r0
                    L19:
                        return r0
                }

                @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
                public java.lang.String getName() {
                        r1 = this;
                        java.lang.String r0 = r1.name
                        return r0
                }
            }

            public WithLazyResolution(net.bytebuddy.pool.TypePool.CacheProvider r2, net.bytebuddy.dynamic.ClassFileLocator r3, net.bytebuddy.pool.TypePool.Default.ReaderMode r4) {
                    r1 = this;
                    net.bytebuddy.pool.TypePool$Empty r0 = net.bytebuddy.pool.TypePool.Empty.INSTANCE
                    r1.<init>(r2, r3, r4, r0)
                    return
            }

            public WithLazyResolution(net.bytebuddy.pool.TypePool.CacheProvider r1, net.bytebuddy.dynamic.ClassFileLocator r2, net.bytebuddy.pool.TypePool.Default.ReaderMode r3, net.bytebuddy.pool.TypePool r4) {
                    r0 = this;
                    r0.<init>(r1, r2, r3, r4)
                    return
            }

            public static /* synthetic */ net.bytebuddy.pool.TypePool.Resolution access$001(net.bytebuddy.pool.TypePool.Default.WithLazyResolution r0, java.lang.String r1) {
                    net.bytebuddy.pool.TypePool$Resolution r0 = super.doDescribe(r1)
                    return r0
            }

            public static net.bytebuddy.pool.TypePool of(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r0) {
                    net.bytebuddy.dynamic.ClassFileLocator r0 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.of(r0)
                    net.bytebuddy.pool.TypePool r0 = of(r0)
                    return r0
            }

            public static net.bytebuddy.pool.TypePool of(net.bytebuddy.dynamic.ClassFileLocator r3) {
                    net.bytebuddy.pool.TypePool$Default$WithLazyResolution r0 = new net.bytebuddy.pool.TypePool$Default$WithLazyResolution
                    net.bytebuddy.pool.TypePool$CacheProvider$Simple r1 = new net.bytebuddy.pool.TypePool$CacheProvider$Simple
                    r1.<init>()
                    net.bytebuddy.pool.TypePool$Default$ReaderMode r2 = net.bytebuddy.pool.TypePool.Default.ReaderMode.FAST
                    r0.<init>(r1, r3, r2)
                    return r0
            }

            public static net.bytebuddy.pool.TypePool ofBootLoader() {
                    net.bytebuddy.dynamic.ClassFileLocator r0 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.ofBootLoader()
                    net.bytebuddy.pool.TypePool r0 = of(r0)
                    return r0
            }

            public static net.bytebuddy.pool.TypePool ofPlatformLoader() {
                    net.bytebuddy.dynamic.ClassFileLocator r0 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.ofPlatformLoader()
                    net.bytebuddy.pool.TypePool r0 = of(r0)
                    return r0
            }

            public static net.bytebuddy.pool.TypePool ofSystemLoader() {
                    net.bytebuddy.dynamic.ClassFileLocator r0 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.ofSystemLoader()
                    net.bytebuddy.pool.TypePool r0 = of(r0)
                    return r0
            }

            @Override // net.bytebuddy.pool.TypePool.AbstractBase
            public net.bytebuddy.pool.TypePool.Resolution doCache(java.lang.String r1, net.bytebuddy.pool.TypePool.Resolution r2) {
                    r0 = this;
                    return r2
            }

            @Override // net.bytebuddy.pool.TypePool.Default, net.bytebuddy.pool.TypePool.AbstractBase
            public net.bytebuddy.pool.TypePool.Resolution doDescribe(java.lang.String r2) {
                    r1 = this;
                    net.bytebuddy.pool.TypePool$Default$WithLazyResolution$LazyResolution r0 = new net.bytebuddy.pool.TypePool$Default$WithLazyResolution$LazyResolution
                    r0.<init>(r1, r2)
                    return r0
            }

            public net.bytebuddy.pool.TypePool.Resolution doResolve(java.lang.String r3) {
                    r2 = this;
                    net.bytebuddy.pool.TypePool$CacheProvider r0 = r2.cacheProvider
                    net.bytebuddy.pool.TypePool$Resolution r0 = r0.find(r3)
                    if (r0 != 0) goto L12
                    net.bytebuddy.pool.TypePool$CacheProvider r0 = r2.cacheProvider
                    net.bytebuddy.pool.TypePool$Resolution r1 = access$001(r2, r3)
                    net.bytebuddy.pool.TypePool$Resolution r0 = r0.register(r3, r1)
                L12:
                    return r0
            }
        }

        static {
                return
        }

        public Default(net.bytebuddy.pool.TypePool.CacheProvider r2, net.bytebuddy.dynamic.ClassFileLocator r3, net.bytebuddy.pool.TypePool.Default.ReaderMode r4) {
                r1 = this;
                net.bytebuddy.pool.TypePool$Empty r0 = net.bytebuddy.pool.TypePool.Empty.INSTANCE
                r1.<init>(r2, r3, r4, r0)
                return
        }

        public Default(net.bytebuddy.pool.TypePool.CacheProvider r1, net.bytebuddy.dynamic.ClassFileLocator r2, net.bytebuddy.pool.TypePool.Default.ReaderMode r3, net.bytebuddy.pool.TypePool r4) {
                r0 = this;
                r0.<init>(r1, r4)
                r0.classFileLocator = r2
                r0.readerMode = r3
                return
        }

        public static /* synthetic */ net.bytebuddy.jar.asm.MethodVisitor access$3500() {
                net.bytebuddy.jar.asm.MethodVisitor r0 = net.bytebuddy.pool.TypePool.Default.IGNORE_METHOD
                return r0
        }

        public static net.bytebuddy.pool.TypePool of(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r0) {
                net.bytebuddy.dynamic.ClassFileLocator r0 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.of(r0)
                net.bytebuddy.pool.TypePool r0 = of(r0)
                return r0
        }

        public static net.bytebuddy.pool.TypePool of(net.bytebuddy.dynamic.ClassFileLocator r3) {
                net.bytebuddy.pool.TypePool$Default r0 = new net.bytebuddy.pool.TypePool$Default
                net.bytebuddy.pool.TypePool$CacheProvider$Simple r1 = new net.bytebuddy.pool.TypePool$CacheProvider$Simple
                r1.<init>()
                net.bytebuddy.pool.TypePool$Default$ReaderMode r2 = net.bytebuddy.pool.TypePool.Default.ReaderMode.FAST
                r0.<init>(r1, r3, r2)
                return r0
        }

        public static net.bytebuddy.pool.TypePool ofBootLoader() {
                net.bytebuddy.dynamic.ClassFileLocator r0 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.ofBootLoader()
                net.bytebuddy.pool.TypePool r0 = of(r0)
                return r0
        }

        public static net.bytebuddy.pool.TypePool ofPlatformLoader() {
                net.bytebuddy.dynamic.ClassFileLocator r0 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.ofPlatformLoader()
                net.bytebuddy.pool.TypePool r0 = of(r0)
                return r0
        }

        public static net.bytebuddy.pool.TypePool ofSystemLoader() {
                net.bytebuddy.dynamic.ClassFileLocator r0 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.ofSystemLoader()
                net.bytebuddy.pool.TypePool r0 = of(r0)
                return r0
        }

        private net.bytebuddy.description.type.TypeDescription parse(byte[] r3) {
                r2 = this;
                net.bytebuddy.jar.asm.ClassReader r3 = net.bytebuddy.utility.OpenedClassReader.of(r3)
                net.bytebuddy.pool.TypePool$Default$TypeExtractor r0 = new net.bytebuddy.pool.TypePool$Default$TypeExtractor
                r0.<init>(r2)
                net.bytebuddy.pool.TypePool$Default$ReaderMode r1 = r2.readerMode
                int r1 = r1.getFlags()
                r3.accept(r0, r1)
                net.bytebuddy.description.type.TypeDescription r3 = r0.toTypeDescription()
                return r3
        }

        @Override // net.bytebuddy.pool.TypePool.AbstractBase
        public net.bytebuddy.pool.TypePool.Resolution doDescribe(java.lang.String r3) {
                r2 = this;
                net.bytebuddy.dynamic.ClassFileLocator r0 = r2.classFileLocator     // Catch: java.io.IOException -> L1a
                net.bytebuddy.dynamic.ClassFileLocator$Resolution r0 = r0.locate(r3)     // Catch: java.io.IOException -> L1a
                boolean r1 = r0.isResolved()     // Catch: java.io.IOException -> L1a
                if (r1 == 0) goto L1c
                net.bytebuddy.pool.TypePool$Resolution$Simple r3 = new net.bytebuddy.pool.TypePool$Resolution$Simple     // Catch: java.io.IOException -> L1a
                byte[] r0 = r0.resolve()     // Catch: java.io.IOException -> L1a
                net.bytebuddy.description.type.TypeDescription r0 = r2.parse(r0)     // Catch: java.io.IOException -> L1a
                r3.<init>(r0)     // Catch: java.io.IOException -> L1a
                goto L22
            L1a:
                r3 = move-exception
                goto L23
            L1c:
                net.bytebuddy.pool.TypePool$Resolution$Illegal r0 = new net.bytebuddy.pool.TypePool$Resolution$Illegal     // Catch: java.io.IOException -> L1a
                r0.<init>(r3)     // Catch: java.io.IOException -> L1a
                r3 = r0
            L22:
                return r3
            L23:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Error while reading class file"
                r0.<init>(r1, r3)
                throw r0
        }

        @Override // net.bytebuddy.pool.TypePool.AbstractBase.Hierarchical, net.bytebuddy.pool.TypePool.AbstractBase
        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                r4 = this;
                boolean r0 = super.equals(r5)
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                r0 = 1
                if (r4 != r5) goto Lc
                return r0
            Lc:
                if (r5 != 0) goto Lf
                return r1
            Lf:
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L1a
                return r1
            L1a:
                net.bytebuddy.pool.TypePool$Default$ReaderMode r2 = r4.readerMode
                net.bytebuddy.pool.TypePool$Default r5 = (net.bytebuddy.pool.TypePool.Default) r5
                net.bytebuddy.pool.TypePool$Default$ReaderMode r3 = r5.readerMode
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L27
                return r1
            L27:
                net.bytebuddy.dynamic.ClassFileLocator r2 = r4.classFileLocator
                net.bytebuddy.dynamic.ClassFileLocator r5 = r5.classFileLocator
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L32
                return r1
            L32:
                return r0
        }

        @Override // net.bytebuddy.pool.TypePool.AbstractBase.Hierarchical, net.bytebuddy.pool.TypePool.AbstractBase
        public int hashCode() {
                r2 = this;
                int r0 = super.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.dynamic.ClassFileLocator r1 = r2.classFileLocator
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.pool.TypePool$Default$ReaderMode r1 = r2.readerMode
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    public enum Empty extends java.lang.Enum<net.bytebuddy.pool.TypePool.Empty> implements net.bytebuddy.pool.TypePool {
        private static final /* synthetic */ net.bytebuddy.pool.TypePool.Empty[] $VALUES = null;
        public static final net.bytebuddy.pool.TypePool.Empty INSTANCE = null;

        static {
                net.bytebuddy.pool.TypePool$Empty r0 = new net.bytebuddy.pool.TypePool$Empty
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.pool.TypePool.Empty.INSTANCE = r0
                net.bytebuddy.pool.TypePool$Empty[] r0 = new net.bytebuddy.pool.TypePool.Empty[]{r0}
                net.bytebuddy.pool.TypePool.Empty.$VALUES = r0
                return
        }

        Empty(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.pool.TypePool.Empty valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.pool.TypePool$Empty> r0 = net.bytebuddy.pool.TypePool.Empty.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.pool.TypePool$Empty r1 = (net.bytebuddy.pool.TypePool.Empty) r1
                return r1
        }

        public static net.bytebuddy.pool.TypePool.Empty[] values() {
                net.bytebuddy.pool.TypePool$Empty[] r0 = net.bytebuddy.pool.TypePool.Empty.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.pool.TypePool$Empty[] r0 = (net.bytebuddy.pool.TypePool.Empty[]) r0
                return r0
        }

        @Override // net.bytebuddy.pool.TypePool
        public void clear() {
                r0 = this;
                return
        }

        @Override // net.bytebuddy.pool.TypePool
        public net.bytebuddy.pool.TypePool.Resolution describe(java.lang.String r2) {
                r1 = this;
                net.bytebuddy.pool.TypePool$Resolution$Illegal r0 = new net.bytebuddy.pool.TypePool$Resolution$Illegal
                r0.<init>(r2)
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Explicit extends net.bytebuddy.pool.TypePool.AbstractBase.Hierarchical {
        private final java.util.Map<java.lang.String, net.bytebuddy.description.type.TypeDescription> types;

        public Explicit(java.util.Map<java.lang.String, net.bytebuddy.description.type.TypeDescription> r2) {
                r1 = this;
                net.bytebuddy.pool.TypePool$Empty r0 = net.bytebuddy.pool.TypePool.Empty.INSTANCE
                r1.<init>(r0, r2)
                return
        }

        public Explicit(net.bytebuddy.pool.TypePool r2, java.util.Map<java.lang.String, net.bytebuddy.description.type.TypeDescription> r3) {
                r1 = this;
                net.bytebuddy.pool.TypePool$CacheProvider$NoOp r0 = net.bytebuddy.pool.TypePool.CacheProvider.NoOp.INSTANCE
                r1.<init>(r0, r2)
                r1.types = r3
                return
        }

        public static net.bytebuddy.pool.TypePool wrap(net.bytebuddy.description.type.TypeDescription r3, java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r4, net.bytebuddy.pool.TypePool r5) {
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                java.lang.String r1 = r3.getName()
                r0.put(r1, r3)
                java.util.Iterator r3 = r4.iterator()
            L10:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L3c
                java.lang.Object r4 = r3.next()
                net.bytebuddy.dynamic.DynamicType r4 = (net.bytebuddy.dynamic.DynamicType) r4
                java.util.Map r4 = r4.getAllTypes()
                java.util.Set r4 = r4.keySet()
                java.util.Iterator r4 = r4.iterator()
            L28:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L10
                java.lang.Object r1 = r4.next()
                net.bytebuddy.description.type.TypeDescription r1 = (net.bytebuddy.description.type.TypeDescription) r1
                java.lang.String r2 = r1.getName()
                r0.put(r2, r1)
                goto L28
            L3c:
                net.bytebuddy.pool.TypePool$Explicit r3 = new net.bytebuddy.pool.TypePool$Explicit
                r3.<init>(r5, r0)
                return r3
        }

        @Override // net.bytebuddy.pool.TypePool.AbstractBase
        public net.bytebuddy.pool.TypePool.Resolution doDescribe(java.lang.String r2) {
                r1 = this;
                java.util.Map<java.lang.String, net.bytebuddy.description.type.TypeDescription> r0 = r1.types
                java.lang.Object r0 = r0.get(r2)
                net.bytebuddy.description.type.TypeDescription r0 = (net.bytebuddy.description.type.TypeDescription) r0
                if (r0 != 0) goto L10
                net.bytebuddy.pool.TypePool$Resolution$Illegal r0 = new net.bytebuddy.pool.TypePool$Resolution$Illegal
                r0.<init>(r2)
                goto L16
            L10:
                net.bytebuddy.pool.TypePool$Resolution$Simple r2 = new net.bytebuddy.pool.TypePool$Resolution$Simple
                r2.<init>(r0)
                r0 = r2
            L16:
                return r0
        }

        @Override // net.bytebuddy.pool.TypePool.AbstractBase.Hierarchical, net.bytebuddy.pool.TypePool.AbstractBase
        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                r4 = this;
                boolean r0 = super.equals(r5)
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                r0 = 1
                if (r4 != r5) goto Lc
                return r0
            Lc:
                if (r5 != 0) goto Lf
                return r1
            Lf:
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L1a
                return r1
            L1a:
                java.util.Map<java.lang.String, net.bytebuddy.description.type.TypeDescription> r2 = r4.types
                net.bytebuddy.pool.TypePool$Explicit r5 = (net.bytebuddy.pool.TypePool.Explicit) r5
                java.util.Map<java.lang.String, net.bytebuddy.description.type.TypeDescription> r5 = r5.types
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L27
                return r1
            L27:
                return r0
        }

        @Override // net.bytebuddy.pool.TypePool.AbstractBase.Hierarchical, net.bytebuddy.pool.TypePool.AbstractBase
        public int hashCode() {
                r2 = this;
                int r0 = super.hashCode()
                int r0 = r0 * 31
                java.util.Map<java.lang.String, net.bytebuddy.description.type.TypeDescription> r1 = r2.types
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class LazyFacade extends net.bytebuddy.pool.TypePool.AbstractBase {
        private final net.bytebuddy.pool.TypePool typePool;

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class LazyResolution implements net.bytebuddy.pool.TypePool.Resolution {
            private final java.lang.String name;
            private final net.bytebuddy.pool.TypePool typePool;

            public LazyResolution(net.bytebuddy.pool.TypePool r1, java.lang.String r2) {
                    r0 = this;
                    r0.<init>()
                    r0.typePool = r1
                    r0.name = r2
                    return
            }

            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                    r4 = this;
                    r0 = 1
                    if (r4 != r5) goto L4
                    return r0
                L4:
                    r1 = 0
                    if (r5 != 0) goto L8
                    return r1
                L8:
                    java.lang.Class r2 = r4.getClass()
                    java.lang.Class r3 = r5.getClass()
                    if (r2 == r3) goto L13
                    return r1
                L13:
                    java.lang.String r2 = r4.name
                    net.bytebuddy.pool.TypePool$LazyFacade$LazyResolution r5 = (net.bytebuddy.pool.TypePool.LazyFacade.LazyResolution) r5
                    java.lang.String r3 = r5.name
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.pool.TypePool r2 = r4.typePool
                    net.bytebuddy.pool.TypePool r5 = r5.typePool
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L2b
                    return r1
                L2b:
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.pool.TypePool r1 = r2.typePool
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    java.lang.String r1 = r2.name
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.pool.TypePool.Resolution
            public boolean isResolved() {
                    r2 = this;
                    net.bytebuddy.pool.TypePool r0 = r2.typePool
                    java.lang.String r1 = r2.name
                    net.bytebuddy.pool.TypePool$Resolution r0 = r0.describe(r1)
                    boolean r0 = r0.isResolved()
                    return r0
            }

            @Override // net.bytebuddy.pool.TypePool.Resolution
            public net.bytebuddy.description.type.TypeDescription resolve() {
                    r3 = this;
                    net.bytebuddy.pool.TypePool$LazyFacade$LazyTypeDescription r0 = new net.bytebuddy.pool.TypePool$LazyFacade$LazyTypeDescription
                    net.bytebuddy.pool.TypePool r1 = r3.typePool
                    java.lang.String r2 = r3.name
                    r0.<init>(r1, r2)
                    return r0
            }
        }

        public static class LazyTypeDescription extends net.bytebuddy.description.type.TypeDescription.AbstractBase.OfSimpleType.WithDelegation {
            private transient /* synthetic */ net.bytebuddy.description.type.TypeDescription delegate;
            private final java.lang.String name;
            private final net.bytebuddy.pool.TypePool typePool;

            public LazyTypeDescription(net.bytebuddy.pool.TypePool r1, java.lang.String r2) {
                    r0 = this;
                    r0.<init>()
                    r0.typePool = r1
                    r0.name = r2
                    return
            }

            @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase.OfSimpleType.WithDelegation
            @net.bytebuddy.build.CachedReturnPlugin.Enhance("delegate")
            public net.bytebuddy.description.type.TypeDescription delegate() {
                    r2 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r2.delegate
                    if (r0 == 0) goto L6
                    r0 = 0
                    goto L12
                L6:
                    net.bytebuddy.pool.TypePool r0 = r2.typePool
                    java.lang.String r1 = r2.name
                    net.bytebuddy.pool.TypePool$Resolution r0 = r0.describe(r1)
                    net.bytebuddy.description.type.TypeDescription r0 = r0.resolve()
                L12:
                    if (r0 != 0) goto L17
                    net.bytebuddy.description.type.TypeDescription r0 = r2.delegate
                    goto L19
                L17:
                    r2.delegate = r0
                L19:
                    return r0
            }

            @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
            public java.lang.String getName() {
                    r1 = this;
                    java.lang.String r0 = r1.name
                    return r0
            }
        }

        public LazyFacade(net.bytebuddy.pool.TypePool r2) {
                r1 = this;
                net.bytebuddy.pool.TypePool$CacheProvider$NoOp r0 = net.bytebuddy.pool.TypePool.CacheProvider.NoOp.INSTANCE
                r1.<init>(r0)
                r1.typePool = r2
                return
        }

        @Override // net.bytebuddy.pool.TypePool.AbstractBase, net.bytebuddy.pool.TypePool
        public void clear() {
                r1 = this;
                net.bytebuddy.pool.TypePool r0 = r1.typePool
                r0.clear()
                return
        }

        @Override // net.bytebuddy.pool.TypePool.AbstractBase
        public net.bytebuddy.pool.TypePool.Resolution doDescribe(java.lang.String r3) {
                r2 = this;
                net.bytebuddy.pool.TypePool$LazyFacade$LazyResolution r0 = new net.bytebuddy.pool.TypePool$LazyFacade$LazyResolution
                net.bytebuddy.pool.TypePool r1 = r2.typePool
                r0.<init>(r1, r3)
                return r0
        }

        @Override // net.bytebuddy.pool.TypePool.AbstractBase
        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                r4 = this;
                boolean r0 = super.equals(r5)
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                r0 = 1
                if (r4 != r5) goto Lc
                return r0
            Lc:
                if (r5 != 0) goto Lf
                return r1
            Lf:
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L1a
                return r1
            L1a:
                net.bytebuddy.pool.TypePool r2 = r4.typePool
                net.bytebuddy.pool.TypePool$LazyFacade r5 = (net.bytebuddy.pool.TypePool.LazyFacade) r5
                net.bytebuddy.pool.TypePool r5 = r5.typePool
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L27
                return r1
            L27:
                return r0
        }

        @Override // net.bytebuddy.pool.TypePool.AbstractBase
        public int hashCode() {
                r2 = this;
                int r0 = super.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.pool.TypePool r1 = r2.typePool
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    public interface Resolution {

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Illegal implements net.bytebuddy.pool.TypePool.Resolution {
            private final java.lang.String name;

            public Illegal(java.lang.String r1) {
                    r0 = this;
                    r0.<init>()
                    r0.name = r1
                    return
            }

            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                    r4 = this;
                    r0 = 1
                    if (r4 != r5) goto L4
                    return r0
                L4:
                    r1 = 0
                    if (r5 != 0) goto L8
                    return r1
                L8:
                    java.lang.Class r2 = r4.getClass()
                    java.lang.Class r3 = r5.getClass()
                    if (r2 == r3) goto L13
                    return r1
                L13:
                    java.lang.String r2 = r4.name
                    net.bytebuddy.pool.TypePool$Resolution$Illegal r5 = (net.bytebuddy.pool.TypePool.Resolution.Illegal) r5
                    java.lang.String r5 = r5.name
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L20
                    return r1
                L20:
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    java.lang.String r1 = r2.name
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.pool.TypePool.Resolution
            public boolean isResolved() {
                    r1 = this;
                    r0 = 0
                    return r0
            }

            @Override // net.bytebuddy.pool.TypePool.Resolution
            public net.bytebuddy.description.type.TypeDescription resolve() {
                    r2 = this;
                    net.bytebuddy.pool.TypePool$Resolution$NoSuchTypeException r0 = new net.bytebuddy.pool.TypePool$Resolution$NoSuchTypeException
                    java.lang.String r1 = r2.name
                    r0.<init>(r1)
                    throw r0
            }
        }

        public static class NoSuchTypeException extends java.lang.IllegalStateException {
            private static final long serialVersionUID = 1;
            private final java.lang.String name;

            public NoSuchTypeException(java.lang.String r3) {
                    r2 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "Cannot resolve type description for "
                    r0.append(r1)
                    r0.append(r3)
                    java.lang.String r0 = r0.toString()
                    r2.<init>(r0)
                    r2.name = r3
                    return
            }

            public java.lang.String getName() {
                    r1 = this;
                    java.lang.String r0 = r1.name
                    return r0
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Simple implements net.bytebuddy.pool.TypePool.Resolution {
            private final net.bytebuddy.description.type.TypeDescription typeDescription;

            public Simple(net.bytebuddy.description.type.TypeDescription r1) {
                    r0 = this;
                    r0.<init>()
                    r0.typeDescription = r1
                    return
            }

            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                    r4 = this;
                    r0 = 1
                    if (r4 != r5) goto L4
                    return r0
                L4:
                    r1 = 0
                    if (r5 != 0) goto L8
                    return r1
                L8:
                    java.lang.Class r2 = r4.getClass()
                    java.lang.Class r3 = r5.getClass()
                    if (r2 == r3) goto L13
                    return r1
                L13:
                    net.bytebuddy.description.type.TypeDescription r2 = r4.typeDescription
                    net.bytebuddy.pool.TypePool$Resolution$Simple r5 = (net.bytebuddy.pool.TypePool.Resolution.Simple) r5
                    net.bytebuddy.description.type.TypeDescription r5 = r5.typeDescription
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L20
                    return r1
                L20:
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.pool.TypePool.Resolution
            public boolean isResolved() {
                    r1 = this;
                    r0 = 1
                    return r0
            }

            @Override // net.bytebuddy.pool.TypePool.Resolution
            public net.bytebuddy.description.type.TypeDescription resolve() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                    return r0
            }
        }

        boolean isResolved();

        net.bytebuddy.description.type.TypeDescription resolve();
    }

    void clear();

    net.bytebuddy.pool.TypePool.Resolution describe(java.lang.String r1);
}
