package net.bytebuddy.implementation.bind;

/* JADX INFO: loaded from: classes2.dex */
public interface MethodDelegationBinder {

    /* JADX INFO: renamed from: net.bytebuddy.implementation.bind.MethodDelegationBinder$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$net$bytebuddy$implementation$bind$MethodDelegationBinder$AmbiguityResolver$Resolution = null;

        static {
                net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution[] r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                net.bytebuddy.implementation.bind.MethodDelegationBinder.AnonymousClass1.$SwitchMap$net$bytebuddy$implementation$bind$MethodDelegationBinder$AmbiguityResolver$Resolution = r0
                net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r1 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.LEFT     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AnonymousClass1.$SwitchMap$net$bytebuddy$implementation$bind$MethodDelegationBinder$AmbiguityResolver$Resolution     // Catch: java.lang.NoSuchFieldError -> L1d
                net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r1 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.RIGHT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AnonymousClass1.$SwitchMap$net$bytebuddy$implementation$bind$MethodDelegationBinder$AmbiguityResolver$Resolution     // Catch: java.lang.NoSuchFieldError -> L28
                net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r1 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.AMBIGUOUS     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AnonymousClass1.$SwitchMap$net$bytebuddy$implementation$bind$MethodDelegationBinder$AmbiguityResolver$Resolution     // Catch: java.lang.NoSuchFieldError -> L33
                net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r1 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.UNKNOWN     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Safe initialization is implied.", value = {"IC_SUPERCLASS_USES_SUBCLASS_DURING_INITIALIZATION"})
    public interface AmbiguityResolver {
        public static final net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver DEFAULT = null;

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Compound implements net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver {
            private final java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver> ambiguityResolvers;

            public Compound(java.util.List<? extends net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver> r3) {
                    r2 = this;
                    r2.<init>()
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    r2.ambiguityResolvers = r0
                    java.util.Iterator r3 = r3.iterator()
                Le:
                    boolean r0 = r3.hasNext()
                    if (r0 == 0) goto L32
                    java.lang.Object r0 = r3.next()
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver r0 = (net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver) r0
                    boolean r1 = r0 instanceof net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Compound
                    if (r1 == 0) goto L28
                    java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver> r1 = r2.ambiguityResolvers
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Compound r0 = (net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Compound) r0
                    java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver> r0 = r0.ambiguityResolvers
                    r1.addAll(r0)
                    goto Le
                L28:
                    boolean r1 = r0 instanceof net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.NoOp
                    if (r1 != 0) goto Le
                    java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver> r1 = r2.ambiguityResolvers
                    r1.add(r0)
                    goto Le
                L32:
                    return
            }

            public Compound(net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver... r1) {
                    r0 = this;
                    java.util.List r1 = java.util.Arrays.asList(r1)
                    r0.<init>(r1)
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
                    java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver> r2 = r4.ambiguityResolvers
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Compound r5 = (net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Compound) r5
                    java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver> r5 = r5.ambiguityResolvers
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
                    java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver> r1 = r2.ambiguityResolvers
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver
            public net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution resolve(net.bytebuddy.description.method.MethodDescription r4, net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding r5, net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding r6) {
                    r3 = this;
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.UNKNOWN
                    java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver> r1 = r3.ambiguityResolvers
                    java.util.Iterator r1 = r1.iterator()
                L8:
                    boolean r2 = r0.isUnresolved()
                    if (r2 == 0) goto L1f
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L1f
                    java.lang.Object r0 = r1.next()
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver r0 = (net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver) r0
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r0 = r0.resolve(r4, r5, r6)
                    goto L8
                L1f:
                    return r0
            }
        }

        public enum Directional extends java.lang.Enum<net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Directional> implements net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver {
            private static final /* synthetic */ net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Directional[] $VALUES = null;
            public static final net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Directional LEFT = null;
            public static final net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Directional RIGHT = null;
            private final boolean left;

            static {
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Directional r0 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Directional
                    java.lang.String r1 = "LEFT"
                    r2 = 0
                    r3 = 1
                    r0.<init>(r1, r2, r3)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Directional.LEFT = r0
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Directional r1 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Directional
                    java.lang.String r4 = "RIGHT"
                    r1.<init>(r4, r3, r2)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Directional.RIGHT = r1
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Directional[] r0 = new net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Directional[]{r0, r1}
                    net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Directional.$VALUES = r0
                    return
            }

            Directional(java.lang.String r1, int r2, boolean r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    r0.left = r3
                    return
            }

            public static net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Directional valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Directional> r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Directional.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Directional r1 = (net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Directional) r1
                    return r1
            }

            public static net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Directional[] values() {
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Directional[] r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Directional.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Directional[] r0 = (net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Directional[]) r0
                    return r0
            }

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver
            public net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution resolve(net.bytebuddy.description.method.MethodDescription r1, net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding r2, net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding r3) {
                    r0 = this;
                    boolean r1 = r0.left
                    if (r1 == 0) goto L7
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r1 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.LEFT
                    goto L9
                L7:
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r1 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.RIGHT
                L9:
                    return r1
            }
        }

        public enum NoOp extends java.lang.Enum<net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.NoOp> implements net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver {
            private static final /* synthetic */ net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.NoOp[] $VALUES = null;
            public static final net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.NoOp INSTANCE = null;

            static {
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$NoOp r0 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$NoOp
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.NoOp.INSTANCE = r0
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$NoOp[] r0 = new net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.NoOp[]{r0}
                    net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.NoOp.$VALUES = r0
                    return
            }

            NoOp(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.NoOp valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$NoOp> r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.NoOp.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$NoOp r1 = (net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.NoOp) r1
                    return r1
            }

            public static net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.NoOp[] values() {
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$NoOp[] r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.NoOp.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$NoOp[] r0 = (net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.NoOp[]) r0
                    return r0
            }

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver
            public net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution resolve(net.bytebuddy.description.method.MethodDescription r1, net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding r2, net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding r3) {
                    r0 = this;
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r1 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.UNKNOWN
                    return r1
            }
        }

        public enum Resolution extends java.lang.Enum<net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution> {
            private static final /* synthetic */ net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution[] $VALUES = null;
            public static final net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution AMBIGUOUS = null;
            public static final net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution LEFT = null;
            public static final net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution RIGHT = null;
            public static final net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution UNKNOWN = null;
            private final boolean unresolved;

            static {
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r0 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution
                    java.lang.String r1 = "UNKNOWN"
                    r2 = 0
                    r3 = 1
                    r0.<init>(r1, r2, r3)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.UNKNOWN = r0
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r1 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution
                    java.lang.String r4 = "LEFT"
                    r1.<init>(r4, r3, r2)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.LEFT = r1
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r4 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution
                    java.lang.String r5 = "RIGHT"
                    r6 = 2
                    r4.<init>(r5, r6, r2)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.RIGHT = r4
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r2 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution
                    java.lang.String r5 = "AMBIGUOUS"
                    r6 = 3
                    r2.<init>(r5, r6, r3)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.AMBIGUOUS = r2
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution[] r0 = new net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution[]{r0, r1, r4, r2}
                    net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.$VALUES = r0
                    return
            }

            Resolution(java.lang.String r1, int r2, boolean r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    r0.unresolved = r3
                    return
            }

            public static net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution> r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r1 = (net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution) r1
                    return r1
            }

            public static net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution[] values() {
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution[] r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution[] r0 = (net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution[]) r0
                    return r0
            }

            public boolean isUnresolved() {
                    r1 = this;
                    boolean r0 = r1.unresolved
                    return r0
            }

            public net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution merge(net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution r3) {
                    r2 = this;
                    int[] r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AnonymousClass1.$SwitchMap$net$bytebuddy$implementation$bind$MethodDelegationBinder$AmbiguityResolver$Resolution
                    int r1 = r2.ordinal()
                    r0 = r0[r1]
                    r1 = 1
                    if (r0 == r1) goto L1e
                    r1 = 2
                    if (r0 == r1) goto L1e
                    r1 = 3
                    if (r0 == r1) goto L1b
                    r1 = 4
                    if (r0 != r1) goto L15
                    return r3
                L15:
                    java.lang.AssertionError r3 = new java.lang.AssertionError
                    r3.<init>()
                    throw r3
                L1b:
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r3 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.AMBIGUOUS
                    return r3
                L1e:
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.UNKNOWN
                    if (r3 == r0) goto L28
                    if (r3 != r2) goto L25
                    goto L28
                L25:
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r3 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.AMBIGUOUS
                    goto L29
                L28:
                    r3 = r2
                L29:
                    return r3
            }
        }

        static {
                net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Compound r0 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Compound
                r1 = 5
                net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver[] r1 = new net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver[r1]
                net.bytebuddy.implementation.bind.annotation.BindingPriority$Resolver r2 = net.bytebuddy.implementation.bind.annotation.BindingPriority.Resolver.INSTANCE
                r3 = 0
                r1[r3] = r2
                net.bytebuddy.implementation.bind.DeclaringTypeResolver r2 = net.bytebuddy.implementation.bind.DeclaringTypeResolver.INSTANCE
                r3 = 1
                r1[r3] = r2
                net.bytebuddy.implementation.bind.ArgumentTypeResolver r2 = net.bytebuddy.implementation.bind.ArgumentTypeResolver.INSTANCE
                r3 = 2
                r1[r3] = r2
                net.bytebuddy.implementation.bind.MethodNameEqualityResolver r2 = net.bytebuddy.implementation.bind.MethodNameEqualityResolver.INSTANCE
                r3 = 3
                r1[r3] = r2
                net.bytebuddy.implementation.bind.ParameterLengthResolver r2 = net.bytebuddy.implementation.bind.ParameterLengthResolver.INSTANCE
                r3 = 4
                r1[r3] = r2
                r0.<init>(r1)
                net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.DEFAULT = r0
                return
        }

        net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution resolve(net.bytebuddy.description.method.MethodDescription r1, net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding r2, net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding r3);
    }

    public interface BindingResolver {

        public enum Default extends java.lang.Enum<net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver.Default> implements net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver {
            private static final /* synthetic */ net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver.Default[] $VALUES = null;
            public static final net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver.Default INSTANCE = null;
            private static final int LEFT = 0;
            private static final int ONLY = 0;
            private static final int RIGHT = 1;

            static {
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver$Default r0 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver$Default
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver.Default.INSTANCE = r0
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver$Default[] r0 = new net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver.Default[]{r0}
                    net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver.Default.$VALUES = r0
                    return
            }

            Default(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            private net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding doResolve(net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver r13, net.bytebuddy.description.method.MethodDescription r14, java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding> r15) {
                    r12 = this;
                    int r0 = r15.size()
                    r1 = 0
                    r2 = 1
                    if (r0 == r2) goto L104
                    java.lang.String r3 = " or "
                    java.lang.String r4 = " to "
                    java.lang.String r5 = "Cannot resolve ambiguous delegation of "
                    r6 = 4
                    r7 = 3
                    r8 = 2
                    if (r0 == r8) goto Lb3
                    java.lang.Object r0 = r15.get(r1)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodBinding r0 = (net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding) r0
                    java.lang.Object r9 = r15.get(r2)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodBinding r9 = (net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding) r9
                    int[] r10 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AnonymousClass1.$SwitchMap$net$bytebuddy$implementation$bind$MethodDelegationBinder$AmbiguityResolver$Resolution
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r11 = r13.resolve(r14, r0, r9)
                    int r11 = r11.ordinal()
                    r11 = r10[r11]
                    if (r11 == r2) goto Lab
                    if (r11 == r8) goto La3
                    if (r11 == r7) goto L4f
                    if (r11 != r6) goto L34
                    goto L4f
                L34:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r14 = new java.lang.StringBuilder
                    r14.<init>()
                    java.lang.String r0 = "Unexpected amount of targets: "
                    r14.append(r0)
                    int r15 = r15.size()
                    r14.append(r15)
                    java.lang.String r14 = r14.toString()
                    r13.<init>(r14)
                    throw r13
                L4f:
                    r15.remove(r2)
                    r15.remove(r1)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodBinding r15 = r12.doResolve(r13, r14, r15)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r1 = r13.resolve(r14, r0, r15)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r13 = r13.resolve(r14, r9, r15)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r13 = r1.merge(r13)
                    int r13 = r13.ordinal()
                    r13 = r10[r13]
                    if (r13 == r2) goto L7a
                    if (r13 == r8) goto L79
                    if (r13 == r7) goto L7a
                    if (r13 == r6) goto L7a
                    java.lang.AssertionError r13 = new java.lang.AssertionError
                    r13.<init>()
                    throw r13
                L79:
                    return r15
                L7a:
                    java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r15 = new java.lang.StringBuilder
                    r15.<init>()
                    r15.append(r5)
                    r15.append(r14)
                    r15.append(r4)
                    net.bytebuddy.description.method.MethodDescription r14 = r0.getTarget()
                    r15.append(r14)
                    r15.append(r3)
                    net.bytebuddy.description.method.MethodDescription r14 = r9.getTarget()
                    r15.append(r14)
                    java.lang.String r14 = r15.toString()
                    r13.<init>(r14)
                    throw r13
                La3:
                    r15.remove(r1)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodBinding r13 = r12.doResolve(r13, r14, r15)
                    return r13
                Lab:
                    r15.remove(r2)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodBinding r13 = r12.doResolve(r13, r14, r15)
                    return r13
                Lb3:
                    java.lang.Object r0 = r15.get(r1)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodBinding r0 = (net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding) r0
                    java.lang.Object r15 = r15.get(r2)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodBinding r15 = (net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding) r15
                    int[] r1 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AnonymousClass1.$SwitchMap$net$bytebuddy$implementation$bind$MethodDelegationBinder$AmbiguityResolver$Resolution
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r13 = r13.resolve(r14, r0, r15)
                    int r13 = r13.ordinal()
                    r13 = r1[r13]
                    if (r13 == r2) goto L103
                    if (r13 == r8) goto L102
                    if (r13 == r7) goto Ld9
                    if (r13 == r6) goto Ld9
                    java.lang.AssertionError r13 = new java.lang.AssertionError
                    r13.<init>()
                    throw r13
                Ld9:
                    java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    r1.append(r5)
                    r1.append(r14)
                    r1.append(r4)
                    net.bytebuddy.description.method.MethodDescription r14 = r0.getTarget()
                    r1.append(r14)
                    r1.append(r3)
                    net.bytebuddy.description.method.MethodDescription r14 = r15.getTarget()
                    r1.append(r14)
                    java.lang.String r14 = r1.toString()
                    r13.<init>(r14)
                    throw r13
                L102:
                    return r15
                L103:
                    return r0
                L104:
                    java.lang.Object r13 = r15.get(r1)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodBinding r13 = (net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding) r13
                    return r13
            }

            public static net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver.Default valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver$Default> r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver.Default.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver$Default r1 = (net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver.Default) r1
                    return r1
            }

            public static net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver.Default[] values() {
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver$Default[] r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver.Default.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver$Default[] r0 = (net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver.Default[]) r0
                    return r0
            }

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver
            public net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding resolve(net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver r2, net.bytebuddy.description.method.MethodDescription r3, java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding> r4) {
                    r1 = this;
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>(r4)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodBinding r2 = r1.doResolve(r2, r3, r0)
                    return r2
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class StreamWriting implements net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver {
            private final net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver delegate;
            private final java.io.PrintStream printStream;

            public StreamWriting(net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver r1, java.io.PrintStream r2) {
                    r0 = this;
                    r0.<init>()
                    r0.delegate = r1
                    r0.printStream = r2
                    return
            }

            public static net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver toSystemError() {
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver$Default r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver.Default.INSTANCE
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver r0 = toSystemError(r0)
                    return r0
            }

            public static net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver toSystemError(net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver r2) {
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver$StreamWriting r0 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver$StreamWriting
                    java.io.PrintStream r1 = java.lang.System.err
                    r0.<init>(r2, r1)
                    return r0
            }

            public static net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver toSystemOut() {
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver$Default r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver.Default.INSTANCE
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver r0 = toSystemOut(r0)
                    return r0
            }

            public static net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver toSystemOut(net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver r2) {
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver$StreamWriting r0 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver$StreamWriting
                    java.io.PrintStream r1 = java.lang.System.out
                    r0.<init>(r2, r1)
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
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver r2 = r4.delegate
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver$StreamWriting r5 = (net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver.StreamWriting) r5
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver r3 = r5.delegate
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    java.io.PrintStream r2 = r4.printStream
                    java.io.PrintStream r5 = r5.printStream
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
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver r1 = r2.delegate
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    java.io.PrintStream r1 = r2.printStream
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver
            public net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding resolve(net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver r3, net.bytebuddy.description.method.MethodDescription r4, java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding> r5) {
                    r2 = this;
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver r0 = r2.delegate
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodBinding r3 = r0.resolve(r3, r4, r5)
                    java.io.PrintStream r5 = r2.printStream
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "Binding "
                    r0.append(r1)
                    r0.append(r4)
                    java.lang.String r4 = " as delegation to "
                    r0.append(r4)
                    net.bytebuddy.description.method.MethodDescription r4 = r3.getTarget()
                    r0.append(r4)
                    java.lang.String r4 = r0.toString()
                    r5.println(r4)
                    return r3
            }
        }

        public enum Unique extends java.lang.Enum<net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver.Unique> implements net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver {
            private static final /* synthetic */ net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver.Unique[] $VALUES = null;
            public static final net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver.Unique INSTANCE = null;
            private static final int ONLY = 0;

            static {
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver$Unique r0 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver$Unique
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver.Unique.INSTANCE = r0
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver$Unique[] r0 = new net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver.Unique[]{r0}
                    net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver.Unique.$VALUES = r0
                    return
            }

            Unique(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver.Unique valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver$Unique> r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver.Unique.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver$Unique r1 = (net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver.Unique) r1
                    return r1
            }

            public static net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver.Unique[] values() {
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver$Unique[] r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver.Unique.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver$Unique[] r0 = (net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver.Unique[]) r0
                    return r0
            }

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver
            public net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding resolve(net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver r2, net.bytebuddy.description.method.MethodDescription r3, java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding> r4) {
                    r1 = this;
                    int r2 = r4.size()
                    r0 = 1
                    if (r2 != r0) goto Lf
                    r2 = 0
                    java.lang.Object r2 = r4.get(r2)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodBinding r2 = (net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding) r2
                    return r2
                Lf:
                    java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r3)
                    java.lang.String r3 = " allowed for more than one binding: "
                    r0.append(r3)
                    r0.append(r4)
                    java.lang.String r3 = r0.toString()
                    r2.<init>(r3)
                    throw r2
            }
        }

        net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding resolve(net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver r1, net.bytebuddy.description.method.MethodDescription r2, java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding> r3);
    }

    public interface MethodBinding extends net.bytebuddy.implementation.bytecode.StackManipulation {

        public static class Builder {
            private final net.bytebuddy.description.method.MethodDescription candidate;
            private final net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker methodInvoker;
            private int nextParameterIndex;
            private final java.util.List<net.bytebuddy.implementation.bytecode.StackManipulation> parameterStackManipulations;
            private final java.util.LinkedHashMap<java.lang.Object, java.lang.Integer> registeredTargetIndices;

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Build implements net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding {
                private final net.bytebuddy.implementation.bytecode.StackManipulation methodInvocation;
                private final java.util.List<net.bytebuddy.implementation.bytecode.StackManipulation> parameterStackManipulations;
                private final java.util.Map<?, java.lang.Integer> registeredTargetIndices;
                private final net.bytebuddy.description.method.MethodDescription target;
                private final net.bytebuddy.implementation.bytecode.StackManipulation terminatingStackManipulation;

                public Build(net.bytebuddy.description.method.MethodDescription r1, java.util.Map<?, java.lang.Integer> r2, net.bytebuddy.implementation.bytecode.StackManipulation r3, java.util.List<net.bytebuddy.implementation.bytecode.StackManipulation> r4, net.bytebuddy.implementation.bytecode.StackManipulation r5) {
                        r0 = this;
                        r0.<init>()
                        r0.target = r1
                        java.util.HashMap r1 = new java.util.HashMap
                        r1.<init>(r2)
                        r0.registeredTargetIndices = r1
                        r0.methodInvocation = r3
                        java.util.ArrayList r1 = new java.util.ArrayList
                        r1.<init>(r4)
                        r0.parameterStackManipulations = r1
                        r0.terminatingStackManipulation = r5
                        return
                }

                @Override // net.bytebuddy.implementation.bytecode.StackManipulation
                public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r7, net.bytebuddy.implementation.Implementation.Context r8) {
                        r6 = this;
                        net.bytebuddy.implementation.bytecode.StackManipulation$Compound r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                        java.util.List<net.bytebuddy.implementation.bytecode.StackManipulation> r1 = r6.parameterStackManipulations
                        net.bytebuddy.implementation.bytecode.StackManipulation r2 = r6.methodInvocation
                        net.bytebuddy.implementation.bytecode.StackManipulation r3 = r6.terminatingStackManipulation
                        r4 = 2
                        net.bytebuddy.implementation.bytecode.StackManipulation[] r4 = new net.bytebuddy.implementation.bytecode.StackManipulation[r4]
                        r5 = 0
                        r4[r5] = r2
                        r2 = 1
                        r4[r2] = r3
                        java.util.List r2 = java.util.Arrays.asList(r4)
                        java.util.List r1 = net.bytebuddy.utility.CompoundList.of(r1, r2)
                        r0.<init>(r1)
                        net.bytebuddy.implementation.bytecode.StackManipulation$Size r7 = r0.apply(r7, r8)
                        return r7
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
                        net.bytebuddy.description.method.MethodDescription r2 = r4.target
                        net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodBinding$Builder$Build r5 = (net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding.Builder.Build) r5
                        net.bytebuddy.description.method.MethodDescription r3 = r5.target
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        java.util.Map<?, java.lang.Integer> r2 = r4.registeredTargetIndices
                        java.util.Map<?, java.lang.Integer> r3 = r5.registeredTargetIndices
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L2b
                        return r1
                    L2b:
                        net.bytebuddy.implementation.bytecode.StackManipulation r2 = r4.methodInvocation
                        net.bytebuddy.implementation.bytecode.StackManipulation r3 = r5.methodInvocation
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L36
                        return r1
                    L36:
                        java.util.List<net.bytebuddy.implementation.bytecode.StackManipulation> r2 = r4.parameterStackManipulations
                        java.util.List<net.bytebuddy.implementation.bytecode.StackManipulation> r3 = r5.parameterStackManipulations
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L41
                        return r1
                    L41:
                        net.bytebuddy.implementation.bytecode.StackManipulation r2 = r4.terminatingStackManipulation
                        net.bytebuddy.implementation.bytecode.StackManipulation r5 = r5.terminatingStackManipulation
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L4c
                        return r1
                    L4c:
                        return r0
                }

                @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding
                public net.bytebuddy.description.method.MethodDescription getTarget() {
                        r1 = this;
                        net.bytebuddy.description.method.MethodDescription r0 = r1.target
                        return r0
                }

                @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding
                @net.bytebuddy.utility.nullability.MaybeNull
                public java.lang.Integer getTargetParameterIndex(java.lang.Object r2) {
                        r1 = this;
                        java.util.Map<?, java.lang.Integer> r0 = r1.registeredTargetIndices
                        java.lang.Object r2 = r0.get(r2)
                        java.lang.Integer r2 = (java.lang.Integer) r2
                        return r2
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        net.bytebuddy.description.method.MethodDescription r1 = r2.target
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.util.Map<?, java.lang.Integer> r1 = r2.registeredTargetIndices
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.implementation.bytecode.StackManipulation r1 = r2.methodInvocation
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.util.List<net.bytebuddy.implementation.bytecode.StackManipulation> r1 = r2.parameterStackManipulations
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.implementation.bytecode.StackManipulation r1 = r2.terminatingStackManipulation
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.bytecode.StackManipulation
                public boolean isValid() {
                        r3 = this;
                        net.bytebuddy.implementation.bytecode.StackManipulation r0 = r3.methodInvocation
                        boolean r0 = r0.isValid()
                        if (r0 == 0) goto L12
                        net.bytebuddy.implementation.bytecode.StackManipulation r0 = r3.terminatingStackManipulation
                        boolean r0 = r0.isValid()
                        if (r0 == 0) goto L12
                        r0 = 1
                        goto L13
                    L12:
                        r0 = 0
                    L13:
                        java.util.List<net.bytebuddy.implementation.bytecode.StackManipulation> r1 = r3.parameterStackManipulations
                        java.util.Iterator r1 = r1.iterator()
                    L19:
                        if (r0 == 0) goto L2c
                        boolean r2 = r1.hasNext()
                        if (r2 == 0) goto L2c
                        java.lang.Object r0 = r1.next()
                        net.bytebuddy.implementation.bytecode.StackManipulation r0 = (net.bytebuddy.implementation.bytecode.StackManipulation) r0
                        boolean r0 = r0.isValid()
                        goto L19
                    L2c:
                        return r0
                }
            }

            public Builder(net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker r1, net.bytebuddy.description.method.MethodDescription r2) {
                    r0 = this;
                    r0.<init>()
                    r0.methodInvoker = r1
                    r0.candidate = r2
                    java.util.ArrayList r1 = new java.util.ArrayList
                    net.bytebuddy.description.method.ParameterList r2 = r2.getParameters()
                    int r2 = r2.size()
                    r1.<init>(r2)
                    r0.parameterStackManipulations = r1
                    java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                    r1.<init>()
                    r0.registeredTargetIndices = r1
                    r1 = 0
                    r0.nextParameterIndex = r1
                    return
            }

            public boolean append(net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding<?> r4) {
                    r3 = this;
                    java.util.List<net.bytebuddy.implementation.bytecode.StackManipulation> r0 = r3.parameterStackManipulations
                    r0.add(r4)
                    java.util.LinkedHashMap<java.lang.Object, java.lang.Integer> r0 = r3.registeredTargetIndices
                    java.lang.Object r4 = r4.getIdentificationToken()
                    int r1 = r3.nextParameterIndex
                    int r2 = r1 + 1
                    r3.nextParameterIndex = r2
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    java.lang.Object r4 = r0.put(r4, r1)
                    if (r4 != 0) goto L1d
                    r4 = 1
                    goto L1e
                L1d:
                    r4 = 0
                L1e:
                    return r4
            }

            public net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding build(net.bytebuddy.implementation.bytecode.StackManipulation r9) {
                    r8 = this;
                    net.bytebuddy.description.method.MethodDescription r0 = r8.candidate
                    net.bytebuddy.description.method.ParameterList r0 = r0.getParameters()
                    int r0 = r0.size()
                    int r1 = r8.nextParameterIndex
                    if (r0 != r1) goto L22
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodBinding$Builder$Build r0 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodBinding$Builder$Build
                    net.bytebuddy.description.method.MethodDescription r3 = r8.candidate
                    java.util.LinkedHashMap<java.lang.Object, java.lang.Integer> r4 = r8.registeredTargetIndices
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodInvoker r1 = r8.methodInvoker
                    net.bytebuddy.implementation.bytecode.StackManipulation r5 = r1.invoke(r3)
                    java.util.List<net.bytebuddy.implementation.bytecode.StackManipulation> r6 = r8.parameterStackManipulations
                    r2 = r0
                    r7 = r9
                    r2.<init>(r3, r4, r5, r6, r7)
                    return r0
                L22:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "The number of parameters bound does not equal the target's number of parameters"
                    r9.<init>(r0)
                    throw r9
            }
        }

        public enum Illegal extends java.lang.Enum<net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding.Illegal> implements net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding {
            private static final /* synthetic */ net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding.Illegal[] $VALUES = null;
            public static final net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding.Illegal INSTANCE = null;

            static {
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodBinding$Illegal r0 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodBinding$Illegal
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding.Illegal.INSTANCE = r0
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodBinding$Illegal[] r0 = new net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding.Illegal[]{r0}
                    net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding.Illegal.$VALUES = r0
                    return
            }

            Illegal(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding.Illegal valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodBinding$Illegal> r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding.Illegal.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodBinding$Illegal r1 = (net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding.Illegal) r1
                    return r1
            }

            public static net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding.Illegal[] values() {
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodBinding$Illegal[] r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding.Illegal.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodBinding$Illegal[] r0 = (net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding.Illegal[]) r0
                    return r0
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.implementation.Implementation.Context r2) {
                    r0 = this;
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "Cannot delegate to an unbound method"
                    r1.<init>(r2)
                    throw r1
            }

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding
            public net.bytebuddy.description.method.MethodDescription getTarget() {
                    r2 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "Method is not bound"
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding
            public java.lang.Integer getTargetParameterIndex(java.lang.Object r2) {
                    r1 = this;
                    java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                    java.lang.String r0 = "Method is not bound"
                    r2.<init>(r0)
                    throw r2
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public boolean isValid() {
                    r1 = this;
                    r0 = 0
                    return r0
            }
        }

        net.bytebuddy.description.method.MethodDescription getTarget();

        @net.bytebuddy.utility.nullability.MaybeNull
        java.lang.Integer getTargetParameterIndex(java.lang.Object r1);
    }

    public interface MethodInvoker {

        public enum Simple extends java.lang.Enum<net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker.Simple> implements net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker {
            private static final /* synthetic */ net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker.Simple[] $VALUES = null;
            public static final net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker.Simple INSTANCE = null;

            static {
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodInvoker$Simple r0 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodInvoker$Simple
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker.Simple.INSTANCE = r0
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodInvoker$Simple[] r0 = new net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker.Simple[]{r0}
                    net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker.Simple.$VALUES = r0
                    return
            }

            Simple(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker.Simple valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodInvoker$Simple> r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker.Simple.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodInvoker$Simple r1 = (net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker.Simple) r1
                    return r1
            }

            public static net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker.Simple[] values() {
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodInvoker$Simple[] r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker.Simple.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodInvoker$Simple[] r0 = (net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker.Simple[]) r0
                    return r0
            }

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker
            public net.bytebuddy.implementation.bytecode.StackManipulation invoke(net.bytebuddy.description.method.MethodDescription r1) {
                    r0 = this;
                    net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r1 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r1)
                    return r1
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Virtual implements net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker {
            private final net.bytebuddy.description.type.TypeDescription typeDescription;

            public Virtual(net.bytebuddy.description.type.TypeDescription r1) {
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
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodInvoker$Virtual r5 = (net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker.Virtual) r5
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

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker
            public net.bytebuddy.implementation.bytecode.StackManipulation invoke(net.bytebuddy.description.method.MethodDescription r2) {
                    r1 = this;
                    net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r2 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r2)
                    net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                    net.bytebuddy.implementation.bytecode.StackManipulation r2 = r2.virtual(r0)
                    return r2
            }
        }

        net.bytebuddy.implementation.bytecode.StackManipulation invoke(net.bytebuddy.description.method.MethodDescription r1);
    }

    public interface ParameterBinding<T> extends net.bytebuddy.implementation.bytecode.StackManipulation {

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Anonymous implements net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding<java.lang.Object> {

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.IGNORE)
            private final java.lang.Object anonymousToken;
            private final net.bytebuddy.implementation.bytecode.StackManipulation delegate;

            public Anonymous(net.bytebuddy.implementation.bytecode.StackManipulation r1) {
                    r0 = this;
                    r0.<init>()
                    r0.delegate = r1
                    java.lang.Object r1 = new java.lang.Object
                    r1.<init>()
                    r0.anonymousToken = r1
                    return
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.implementation.Implementation.Context r3) {
                    r1 = this;
                    net.bytebuddy.implementation.bytecode.StackManipulation r0 = r1.delegate
                    net.bytebuddy.implementation.bytecode.StackManipulation$Size r2 = r0.apply(r2, r3)
                    return r2
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
                    net.bytebuddy.implementation.bytecode.StackManipulation r2 = r4.delegate
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r5 = (net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Anonymous) r5
                    net.bytebuddy.implementation.bytecode.StackManipulation r5 = r5.delegate
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L20
                    return r1
                L20:
                    return r0
            }

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding
            public java.lang.Object getIdentificationToken() {
                    r1 = this;
                    java.lang.Object r0 = r1.anonymousToken
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = r2.delegate
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public boolean isValid() {
                    r1 = this;
                    net.bytebuddy.implementation.bytecode.StackManipulation r0 = r1.delegate
                    boolean r0 = r0.isValid()
                    return r0
            }
        }

        public enum Illegal extends java.lang.Enum<net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Illegal> implements net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding<java.lang.Void> {
            private static final /* synthetic */ net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Illegal[] $VALUES = null;
            public static final net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Illegal INSTANCE = null;

            static {
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Illegal r0 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Illegal
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE = r0
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Illegal[] r0 = new net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Illegal[]{r0}
                    net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Illegal.$VALUES = r0
                    return
            }

            Illegal(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Illegal valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Illegal> r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Illegal.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Illegal r1 = (net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Illegal) r1
                    return r1
            }

            public static net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Illegal[] values() {
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Illegal[] r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Illegal.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Illegal[] r0 = (net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Illegal[]) r0
                    return r0
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.implementation.Implementation.Context r2) {
                    r0 = this;
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "An illegal parameter binding must not be applied"
                    r1.<init>(r2)
                    throw r1
            }

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding
            public /* bridge */ /* synthetic */ java.lang.Void getIdentificationToken() {
                    r1 = this;
                    java.lang.Void r0 = r1.getIdentificationToken2()
                    return r0
            }

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding
            /* JADX INFO: renamed from: getIdentificationToken, reason: avoid collision after fix types in other method */
            public java.lang.Void getIdentificationToken2() {
                    r2 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "An illegal binding does not define an identification token"
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public boolean isValid() {
                    r1 = this;
                    r0 = 0
                    return r0
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Unique<T> implements net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding<T> {
            private final net.bytebuddy.implementation.bytecode.StackManipulation delegate;
            private final T identificationToken;

            public Unique(net.bytebuddy.implementation.bytecode.StackManipulation r1, T r2) {
                    r0 = this;
                    r0.<init>()
                    r0.delegate = r1
                    r0.identificationToken = r2
                    return
            }

            public static <S> net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Unique<S> of(net.bytebuddy.implementation.bytecode.StackManipulation r1, S r2) {
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Unique r0 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Unique
                    r0.<init>(r1, r2)
                    return r0
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.implementation.Implementation.Context r3) {
                    r1 = this;
                    net.bytebuddy.implementation.bytecode.StackManipulation r0 = r1.delegate
                    net.bytebuddy.implementation.bytecode.StackManipulation$Size r2 = r0.apply(r2, r3)
                    return r2
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
                    T r2 = r4.identificationToken
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Unique r5 = (net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Unique) r5
                    T r3 = r5.identificationToken
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.implementation.bytecode.StackManipulation r2 = r4.delegate
                    net.bytebuddy.implementation.bytecode.StackManipulation r5 = r5.delegate
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L2b
                    return r1
                L2b:
                    return r0
            }

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding
            public T getIdentificationToken() {
                    r1 = this;
                    T r0 = r1.identificationToken
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    T r1 = r2.identificationToken
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = r2.delegate
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public boolean isValid() {
                    r1 = this;
                    net.bytebuddy.implementation.bytecode.StackManipulation r0 = r1.delegate
                    boolean r0 = r0.isValid()
                    return r0
            }
        }

        T getIdentificationToken();
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Processor implements net.bytebuddy.implementation.bind.MethodDelegationBinder.Record {
        private final net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver ambiguityResolver;
        private final net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver bindingResolver;
        private final java.util.List<? extends net.bytebuddy.implementation.bind.MethodDelegationBinder.Record> records;

        public Processor(java.util.List<? extends net.bytebuddy.implementation.bind.MethodDelegationBinder.Record> r1, net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver r2, net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver r3) {
                r0 = this;
                r0.<init>()
                r0.records = r1
                r0.ambiguityResolver = r2
                r0.bindingResolver = r3
                return
        }

        @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.Record
        public net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding bind(net.bytebuddy.implementation.Implementation.Target r10, net.bytebuddy.description.method.MethodDescription r11, net.bytebuddy.implementation.bind.MethodDelegationBinder.TerminationHandler r12, net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker r13, net.bytebuddy.implementation.bytecode.assign.Assigner r14) {
                r9 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.List<? extends net.bytebuddy.implementation.bind.MethodDelegationBinder$Record> r1 = r9.records
                java.util.Iterator r1 = r1.iterator()
            Lb:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L2b
                java.lang.Object r2 = r1.next()
                r3 = r2
                net.bytebuddy.implementation.bind.MethodDelegationBinder$Record r3 = (net.bytebuddy.implementation.bind.MethodDelegationBinder.Record) r3
                r4 = r10
                r5 = r11
                r6 = r12
                r7 = r13
                r8 = r14
                net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodBinding r2 = r3.bind(r4, r5, r6, r7, r8)
                boolean r3 = r2.isValid()
                if (r3 == 0) goto Lb
                r0.add(r2)
                goto Lb
            L2b:
                boolean r10 = r0.isEmpty()
                if (r10 != 0) goto L3a
                net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver r10 = r9.bindingResolver
                net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver r12 = r9.ambiguityResolver
                net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodBinding r10 = r10.resolve(r12, r11, r0)
                return r10
            L3a:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "None of "
                r12.append(r13)
                java.util.List<? extends net.bytebuddy.implementation.bind.MethodDelegationBinder$Record> r13 = r9.records
                r12.append(r13)
                java.lang.String r13 = " allows for delegation from "
                r12.append(r13)
                r12.append(r11)
                java.lang.String r11 = r12.toString()
                r10.<init>(r11)
                throw r10
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
                java.util.List<? extends net.bytebuddy.implementation.bind.MethodDelegationBinder$Record> r2 = r4.records
                net.bytebuddy.implementation.bind.MethodDelegationBinder$Processor r5 = (net.bytebuddy.implementation.bind.MethodDelegationBinder.Processor) r5
                java.util.List<? extends net.bytebuddy.implementation.bind.MethodDelegationBinder$Record> r3 = r5.records
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver r2 = r4.ambiguityResolver
                net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver r3 = r5.ambiguityResolver
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L2b
                return r1
            L2b:
                net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver r2 = r4.bindingResolver
                net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver r5 = r5.bindingResolver
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
                java.util.List<? extends net.bytebuddy.implementation.bind.MethodDelegationBinder$Record> r1 = r2.records
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver r1 = r2.ambiguityResolver
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver r1 = r2.bindingResolver
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    public interface Record {

        public enum Illegal extends java.lang.Enum<net.bytebuddy.implementation.bind.MethodDelegationBinder.Record.Illegal> implements net.bytebuddy.implementation.bind.MethodDelegationBinder.Record {
            private static final /* synthetic */ net.bytebuddy.implementation.bind.MethodDelegationBinder.Record.Illegal[] $VALUES = null;
            public static final net.bytebuddy.implementation.bind.MethodDelegationBinder.Record.Illegal INSTANCE = null;

            static {
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$Record$Illegal r0 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$Record$Illegal
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder.Record.Illegal.INSTANCE = r0
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$Record$Illegal[] r0 = new net.bytebuddy.implementation.bind.MethodDelegationBinder.Record.Illegal[]{r0}
                    net.bytebuddy.implementation.bind.MethodDelegationBinder.Record.Illegal.$VALUES = r0
                    return
            }

            Illegal(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.implementation.bind.MethodDelegationBinder.Record.Illegal valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.implementation.bind.MethodDelegationBinder$Record$Illegal> r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.Record.Illegal.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$Record$Illegal r1 = (net.bytebuddy.implementation.bind.MethodDelegationBinder.Record.Illegal) r1
                    return r1
            }

            public static net.bytebuddy.implementation.bind.MethodDelegationBinder.Record.Illegal[] values() {
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$Record$Illegal[] r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.Record.Illegal.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$Record$Illegal[] r0 = (net.bytebuddy.implementation.bind.MethodDelegationBinder.Record.Illegal[]) r0
                    return r0
            }

            @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.Record
            public net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding bind(net.bytebuddy.implementation.Implementation.Target r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.implementation.bind.MethodDelegationBinder.TerminationHandler r3, net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker r4, net.bytebuddy.implementation.bytecode.assign.Assigner r5) {
                    r0 = this;
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodBinding$Illegal r1 = net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding.Illegal.INSTANCE
                    return r1
            }
        }

        net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding bind(net.bytebuddy.implementation.Implementation.Target r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.implementation.bind.MethodDelegationBinder.TerminationHandler r3, net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker r4, net.bytebuddy.implementation.bytecode.assign.Assigner r5);
    }

    public interface TerminationHandler {

        public enum Default extends java.lang.Enum<net.bytebuddy.implementation.bind.MethodDelegationBinder.TerminationHandler.Default> implements net.bytebuddy.implementation.bind.MethodDelegationBinder.TerminationHandler {
            private static final /* synthetic */ net.bytebuddy.implementation.bind.MethodDelegationBinder.TerminationHandler.Default[] $VALUES = null;
            public static final net.bytebuddy.implementation.bind.MethodDelegationBinder.TerminationHandler.Default DROPPING = null;
            public static final net.bytebuddy.implementation.bind.MethodDelegationBinder.TerminationHandler.Default RETURNING = null;



            static {
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$TerminationHandler$Default$1 r0 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$TerminationHandler$Default$1
                    java.lang.String r1 = "RETURNING"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder.TerminationHandler.Default.RETURNING = r0
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$TerminationHandler$Default$2 r1 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$TerminationHandler$Default$2
                    java.lang.String r3 = "DROPPING"
                    r4 = 1
                    r1.<init>(r3, r4)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder.TerminationHandler.Default.DROPPING = r1
                    r3 = 2
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$TerminationHandler$Default[] r3 = new net.bytebuddy.implementation.bind.MethodDelegationBinder.TerminationHandler.Default[r3]
                    r3[r2] = r0
                    r3[r4] = r1
                    net.bytebuddy.implementation.bind.MethodDelegationBinder.TerminationHandler.Default.$VALUES = r3
                    return
            }

            Default(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            /* synthetic */ Default(java.lang.String r1, int r2, net.bytebuddy.implementation.bind.MethodDelegationBinder.AnonymousClass1 r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.implementation.bind.MethodDelegationBinder.TerminationHandler.Default valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.implementation.bind.MethodDelegationBinder$TerminationHandler$Default> r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.TerminationHandler.Default.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$TerminationHandler$Default r1 = (net.bytebuddy.implementation.bind.MethodDelegationBinder.TerminationHandler.Default) r1
                    return r1
            }

            public static net.bytebuddy.implementation.bind.MethodDelegationBinder.TerminationHandler.Default[] values() {
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$TerminationHandler$Default[] r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.TerminationHandler.Default.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$TerminationHandler$Default[] r0 = (net.bytebuddy.implementation.bind.MethodDelegationBinder.TerminationHandler.Default[]) r0
                    return r0
            }
        }

        net.bytebuddy.implementation.bytecode.StackManipulation resolve(net.bytebuddy.implementation.bytecode.assign.Assigner r1, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r2, net.bytebuddy.description.method.MethodDescription r3, net.bytebuddy.description.method.MethodDescription r4);
    }

    net.bytebuddy.implementation.bind.MethodDelegationBinder.Record compile(net.bytebuddy.description.method.MethodDescription r1);
}
