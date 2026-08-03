package net.bytebuddy.matcher;

/* JADX INFO: loaded from: classes2.dex */
public interface LatentMatcher<T> {

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Conjunction<S> implements net.bytebuddy.matcher.LatentMatcher<S> {
        private final java.util.List<? extends net.bytebuddy.matcher.LatentMatcher<? super S>> matchers;

        public Conjunction(java.util.List<? extends net.bytebuddy.matcher.LatentMatcher<? super S>> r1) {
                r0 = this;
                r0.<init>()
                r0.matchers = r1
                return
        }

        public Conjunction(net.bytebuddy.matcher.LatentMatcher<? super S>... r1) {
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
                java.util.List<? extends net.bytebuddy.matcher.LatentMatcher<? super S>> r2 = r4.matchers
                net.bytebuddy.matcher.LatentMatcher$Conjunction r5 = (net.bytebuddy.matcher.LatentMatcher.Conjunction) r5
                java.util.List<? extends net.bytebuddy.matcher.LatentMatcher<? super S>> r5 = r5.matchers
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
                java.util.List<? extends net.bytebuddy.matcher.LatentMatcher<? super S>> r1 = r2.matchers
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.matcher.LatentMatcher
        public net.bytebuddy.matcher.ElementMatcher<? super S> resolve(net.bytebuddy.description.type.TypeDescription r4) {
                r3 = this;
                net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.any()
                java.util.List<? extends net.bytebuddy.matcher.LatentMatcher<? super S>> r1 = r3.matchers
                java.util.Iterator r1 = r1.iterator()
            La:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L1f
                java.lang.Object r2 = r1.next()
                net.bytebuddy.matcher.LatentMatcher r2 = (net.bytebuddy.matcher.LatentMatcher) r2
                net.bytebuddy.matcher.ElementMatcher r2 = r2.resolve(r4)
                net.bytebuddy.matcher.ElementMatcher$Junction r0 = r0.and(r2)
                goto La
            L1f:
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Disjunction<S> implements net.bytebuddy.matcher.LatentMatcher<S> {
        private final java.util.List<? extends net.bytebuddy.matcher.LatentMatcher<? super S>> matchers;

        public Disjunction(java.util.List<? extends net.bytebuddy.matcher.LatentMatcher<? super S>> r1) {
                r0 = this;
                r0.<init>()
                r0.matchers = r1
                return
        }

        public Disjunction(net.bytebuddy.matcher.LatentMatcher<? super S>... r1) {
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
                java.util.List<? extends net.bytebuddy.matcher.LatentMatcher<? super S>> r2 = r4.matchers
                net.bytebuddy.matcher.LatentMatcher$Disjunction r5 = (net.bytebuddy.matcher.LatentMatcher.Disjunction) r5
                java.util.List<? extends net.bytebuddy.matcher.LatentMatcher<? super S>> r5 = r5.matchers
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
                java.util.List<? extends net.bytebuddy.matcher.LatentMatcher<? super S>> r1 = r2.matchers
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.matcher.LatentMatcher
        public net.bytebuddy.matcher.ElementMatcher<? super S> resolve(net.bytebuddy.description.type.TypeDescription r4) {
                r3 = this;
                net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.none()
                java.util.List<? extends net.bytebuddy.matcher.LatentMatcher<? super S>> r1 = r3.matchers
                java.util.Iterator r1 = r1.iterator()
            La:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L1f
                java.lang.Object r2 = r1.next()
                net.bytebuddy.matcher.LatentMatcher r2 = (net.bytebuddy.matcher.LatentMatcher) r2
                net.bytebuddy.matcher.ElementMatcher r2 = r2.resolve(r4)
                net.bytebuddy.matcher.ElementMatcher$Junction r0 = r0.or(r2)
                goto La
            L1f:
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ForFieldToken implements net.bytebuddy.matcher.LatentMatcher<net.bytebuddy.description.field.FieldDescription> {
        private final net.bytebuddy.description.field.FieldDescription.Token token;

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ResolvedMatcher extends net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues<net.bytebuddy.description.field.FieldDescription> {
            private final net.bytebuddy.description.field.FieldDescription.SignatureToken signatureToken;

            public ResolvedMatcher(net.bytebuddy.description.field.FieldDescription.SignatureToken r1) {
                    r0 = this;
                    r0.<init>()
                    r0.signatureToken = r1
                    return
            }

            @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
            public /* bridge */ /* synthetic */ boolean doMatch(net.bytebuddy.description.field.FieldDescription r1) {
                    r0 = this;
                    net.bytebuddy.description.field.FieldDescription r1 = (net.bytebuddy.description.field.FieldDescription) r1
                    boolean r1 = r0.doMatch2(r1)
                    return r1
            }

            /* JADX INFO: renamed from: doMatch, reason: avoid collision after fix types in other method */
            public boolean doMatch2(net.bytebuddy.description.field.FieldDescription r2) {
                    r1 = this;
                    net.bytebuddy.description.field.FieldDescription$SignatureToken r2 = r2.asSignatureToken()
                    net.bytebuddy.description.field.FieldDescription$SignatureToken r0 = r1.signatureToken
                    boolean r2 = r2.equals(r0)
                    return r2
            }

            @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
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
                    net.bytebuddy.description.field.FieldDescription$SignatureToken r2 = r4.signatureToken
                    net.bytebuddy.matcher.LatentMatcher$ForFieldToken$ResolvedMatcher r5 = (net.bytebuddy.matcher.LatentMatcher.ForFieldToken.ResolvedMatcher) r5
                    net.bytebuddy.description.field.FieldDescription$SignatureToken r5 = r5.signatureToken
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L27
                    return r1
                L27:
                    return r0
            }

            @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
            public int hashCode() {
                    r2 = this;
                    int r0 = super.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.description.field.FieldDescription$SignatureToken r1 = r2.signatureToken
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }
        }

        public ForFieldToken(net.bytebuddy.description.field.FieldDescription.Token r1) {
                r0 = this;
                r0.<init>()
                r0.token = r1
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
                net.bytebuddy.description.field.FieldDescription$Token r2 = r4.token
                net.bytebuddy.matcher.LatentMatcher$ForFieldToken r5 = (net.bytebuddy.matcher.LatentMatcher.ForFieldToken) r5
                net.bytebuddy.description.field.FieldDescription$Token r5 = r5.token
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
                net.bytebuddy.description.field.FieldDescription$Token r1 = r2.token
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.matcher.LatentMatcher
        public net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> resolve(net.bytebuddy.description.type.TypeDescription r3) {
                r2 = this;
                net.bytebuddy.matcher.LatentMatcher$ForFieldToken$ResolvedMatcher r0 = new net.bytebuddy.matcher.LatentMatcher$ForFieldToken$ResolvedMatcher
                net.bytebuddy.description.field.FieldDescription$Token r1 = r2.token
                net.bytebuddy.description.field.FieldDescription$SignatureToken r3 = r1.asSignatureToken(r3)
                r0.<init>(r3)
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ForMethodToken implements net.bytebuddy.matcher.LatentMatcher<net.bytebuddy.description.method.MethodDescription> {
        private final net.bytebuddy.description.method.MethodDescription.Token token;

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ResolvedMatcher extends net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues<net.bytebuddy.description.method.MethodDescription> {
            private final net.bytebuddy.description.method.MethodDescription.SignatureToken signatureToken;

            public ResolvedMatcher(net.bytebuddy.description.method.MethodDescription.SignatureToken r1) {
                    r0 = this;
                    r0.<init>()
                    r0.signatureToken = r1
                    return
            }

            @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
            public /* bridge */ /* synthetic */ boolean doMatch(net.bytebuddy.description.method.MethodDescription r1) {
                    r0 = this;
                    net.bytebuddy.description.method.MethodDescription r1 = (net.bytebuddy.description.method.MethodDescription) r1
                    boolean r1 = r0.doMatch2(r1)
                    return r1
            }

            /* JADX INFO: renamed from: doMatch, reason: avoid collision after fix types in other method */
            public boolean doMatch2(net.bytebuddy.description.method.MethodDescription r2) {
                    r1 = this;
                    net.bytebuddy.description.method.MethodDescription$SignatureToken r2 = r2.asSignatureToken()
                    net.bytebuddy.description.method.MethodDescription$SignatureToken r0 = r1.signatureToken
                    boolean r2 = r2.equals(r0)
                    return r2
            }

            @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
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
                    net.bytebuddy.description.method.MethodDescription$SignatureToken r2 = r4.signatureToken
                    net.bytebuddy.matcher.LatentMatcher$ForMethodToken$ResolvedMatcher r5 = (net.bytebuddy.matcher.LatentMatcher.ForMethodToken.ResolvedMatcher) r5
                    net.bytebuddy.description.method.MethodDescription$SignatureToken r5 = r5.signatureToken
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L27
                    return r1
                L27:
                    return r0
            }

            @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
            public int hashCode() {
                    r2 = this;
                    int r0 = super.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.description.method.MethodDescription$SignatureToken r1 = r2.signatureToken
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }
        }

        public ForMethodToken(net.bytebuddy.description.method.MethodDescription.Token r1) {
                r0 = this;
                r0.<init>()
                r0.token = r1
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
                net.bytebuddy.description.method.MethodDescription$Token r2 = r4.token
                net.bytebuddy.matcher.LatentMatcher$ForMethodToken r5 = (net.bytebuddy.matcher.LatentMatcher.ForMethodToken) r5
                net.bytebuddy.description.method.MethodDescription$Token r5 = r5.token
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
                net.bytebuddy.description.method.MethodDescription$Token r1 = r2.token
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.matcher.LatentMatcher
        public net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> resolve(net.bytebuddy.description.type.TypeDescription r3) {
                r2 = this;
                net.bytebuddy.matcher.LatentMatcher$ForMethodToken$ResolvedMatcher r0 = new net.bytebuddy.matcher.LatentMatcher$ForMethodToken$ResolvedMatcher
                net.bytebuddy.description.method.MethodDescription$Token r1 = r2.token
                net.bytebuddy.description.method.MethodDescription$SignatureToken r3 = r1.asSignatureToken(r3)
                r0.<init>(r3)
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ForRecordComponentToken implements net.bytebuddy.matcher.LatentMatcher<net.bytebuddy.description.type.RecordComponentDescription> {
        private final net.bytebuddy.description.type.RecordComponentDescription.Token token;

        public ForRecordComponentToken(net.bytebuddy.description.type.RecordComponentDescription.Token r1) {
                r0 = this;
                r0.<init>()
                r0.token = r1
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
                net.bytebuddy.description.type.RecordComponentDescription$Token r2 = r4.token
                net.bytebuddy.matcher.LatentMatcher$ForRecordComponentToken r5 = (net.bytebuddy.matcher.LatentMatcher.ForRecordComponentToken) r5
                net.bytebuddy.description.type.RecordComponentDescription$Token r5 = r5.token
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
                net.bytebuddy.description.type.RecordComponentDescription$Token r1 = r2.token
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.matcher.LatentMatcher
        public net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.RecordComponentDescription> resolve(net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                net.bytebuddy.description.type.RecordComponentDescription$Token r1 = r0.token
                java.lang.String r1 = r1.getName()
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                return r1
        }
    }

    public enum ForSelfDeclaredMethod extends java.lang.Enum<net.bytebuddy.matcher.LatentMatcher.ForSelfDeclaredMethod> implements net.bytebuddy.matcher.LatentMatcher<net.bytebuddy.description.method.MethodDescription> {
        private static final /* synthetic */ net.bytebuddy.matcher.LatentMatcher.ForSelfDeclaredMethod[] $VALUES = null;
        public static final net.bytebuddy.matcher.LatentMatcher.ForSelfDeclaredMethod DECLARED = null;
        public static final net.bytebuddy.matcher.LatentMatcher.ForSelfDeclaredMethod NOT_DECLARED = null;
        private final boolean inverted;

        static {
                net.bytebuddy.matcher.LatentMatcher$ForSelfDeclaredMethod r0 = new net.bytebuddy.matcher.LatentMatcher$ForSelfDeclaredMethod
                java.lang.String r1 = "DECLARED"
                r2 = 0
                r0.<init>(r1, r2, r2)
                net.bytebuddy.matcher.LatentMatcher.ForSelfDeclaredMethod.DECLARED = r0
                net.bytebuddy.matcher.LatentMatcher$ForSelfDeclaredMethod r1 = new net.bytebuddy.matcher.LatentMatcher$ForSelfDeclaredMethod
                java.lang.String r2 = "NOT_DECLARED"
                r3 = 1
                r1.<init>(r2, r3, r3)
                net.bytebuddy.matcher.LatentMatcher.ForSelfDeclaredMethod.NOT_DECLARED = r1
                net.bytebuddy.matcher.LatentMatcher$ForSelfDeclaredMethod[] r0 = new net.bytebuddy.matcher.LatentMatcher.ForSelfDeclaredMethod[]{r0, r1}
                net.bytebuddy.matcher.LatentMatcher.ForSelfDeclaredMethod.$VALUES = r0
                return
        }

        ForSelfDeclaredMethod(java.lang.String r1, int r2, boolean r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.inverted = r3
                return
        }

        public static net.bytebuddy.matcher.LatentMatcher.ForSelfDeclaredMethod valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.matcher.LatentMatcher$ForSelfDeclaredMethod> r0 = net.bytebuddy.matcher.LatentMatcher.ForSelfDeclaredMethod.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.matcher.LatentMatcher$ForSelfDeclaredMethod r1 = (net.bytebuddy.matcher.LatentMatcher.ForSelfDeclaredMethod) r1
                return r1
        }

        public static net.bytebuddy.matcher.LatentMatcher.ForSelfDeclaredMethod[] values() {
                net.bytebuddy.matcher.LatentMatcher$ForSelfDeclaredMethod[] r0 = net.bytebuddy.matcher.LatentMatcher.ForSelfDeclaredMethod.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.matcher.LatentMatcher$ForSelfDeclaredMethod[] r0 = (net.bytebuddy.matcher.LatentMatcher.ForSelfDeclaredMethod[]) r0
                return r0
        }

        @Override // net.bytebuddy.matcher.LatentMatcher
        public net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> resolve(net.bytebuddy.description.type.TypeDescription r2) {
                r1 = this;
                boolean r0 = r1.inverted
                if (r0 == 0) goto Ld
                net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.isDeclaredBy(r2)
                net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.not(r2)
                goto L11
            Ld:
                net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.isDeclaredBy(r2)
            L11:
                return r2
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Resolved<S> implements net.bytebuddy.matcher.LatentMatcher<S> {
        private final net.bytebuddy.matcher.ElementMatcher<? super S> matcher;

        public Resolved(net.bytebuddy.matcher.ElementMatcher<? super S> r1) {
                r0 = this;
                r0.<init>()
                r0.matcher = r1
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
                net.bytebuddy.matcher.ElementMatcher<? super S> r2 = r4.matcher
                net.bytebuddy.matcher.LatentMatcher$Resolved r5 = (net.bytebuddy.matcher.LatentMatcher.Resolved) r5
                net.bytebuddy.matcher.ElementMatcher<? super S> r5 = r5.matcher
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
                net.bytebuddy.matcher.ElementMatcher<? super S> r1 = r2.matcher
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.matcher.LatentMatcher
        public net.bytebuddy.matcher.ElementMatcher<? super S> resolve(net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                net.bytebuddy.matcher.ElementMatcher<? super S> r1 = r0.matcher
                return r1
        }
    }

    net.bytebuddy.matcher.ElementMatcher<? super T> resolve(net.bytebuddy.description.type.TypeDescription r1);
}
