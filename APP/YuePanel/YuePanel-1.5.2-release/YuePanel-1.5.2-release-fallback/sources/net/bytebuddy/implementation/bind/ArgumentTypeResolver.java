package net.bytebuddy.implementation.bind;

/* JADX INFO: loaded from: classes2.dex */
public enum ArgumentTypeResolver extends java.lang.Enum<net.bytebuddy.implementation.bind.ArgumentTypeResolver> implements net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver {
    private static final /* synthetic */ net.bytebuddy.implementation.bind.ArgumentTypeResolver[] $VALUES = null;
    public static final net.bytebuddy.implementation.bind.ArgumentTypeResolver INSTANCE = null;

    public static class ParameterIndexToken {
        private final int parameterIndex;

        public ParameterIndexToken(int r1) {
                r0 = this;
                r0.<init>()
                r0.parameterIndex = r1
                return
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L1d
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L12
                goto L1d
            L12:
                net.bytebuddy.implementation.bind.ArgumentTypeResolver$ParameterIndexToken r5 = (net.bytebuddy.implementation.bind.ArgumentTypeResolver.ParameterIndexToken) r5
                int r2 = r4.parameterIndex
                int r5 = r5.parameterIndex
                if (r2 != r5) goto L1b
                goto L1c
            L1b:
                r0 = r1
            L1c:
                return r0
            L1d:
                return r1
        }

        public int hashCode() {
                r1 = this;
                int r0 = r1.parameterIndex
                return r0
        }
    }

    public enum PrimitiveTypePrecedence extends java.lang.Enum<net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence> {
        private static final /* synthetic */ net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence[] $VALUES = null;
        public static final net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence BOOLEAN = null;
        public static final net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence BYTE = null;
        public static final net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence CHARACTER = null;
        public static final net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence DOUBLE = null;
        public static final net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence FLOAT = null;
        public static final net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence INTEGER = null;
        public static final net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence LONG = null;
        public static final net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence SHORT = null;
        private final int score;

        static {
                net.bytebuddy.implementation.bind.ArgumentTypeResolver$PrimitiveTypePrecedence r0 = new net.bytebuddy.implementation.bind.ArgumentTypeResolver$PrimitiveTypePrecedence
                java.lang.String r1 = "BOOLEAN"
                r2 = 0
                r0.<init>(r1, r2, r2)
                net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence.BOOLEAN = r0
                net.bytebuddy.implementation.bind.ArgumentTypeResolver$PrimitiveTypePrecedence r1 = new net.bytebuddy.implementation.bind.ArgumentTypeResolver$PrimitiveTypePrecedence
                java.lang.String r2 = "BYTE"
                r3 = 1
                r1.<init>(r2, r3, r3)
                net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence.BYTE = r1
                net.bytebuddy.implementation.bind.ArgumentTypeResolver$PrimitiveTypePrecedence r2 = new net.bytebuddy.implementation.bind.ArgumentTypeResolver$PrimitiveTypePrecedence
                java.lang.String r3 = "SHORT"
                r4 = 2
                r2.<init>(r3, r4, r4)
                net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence.SHORT = r2
                net.bytebuddy.implementation.bind.ArgumentTypeResolver$PrimitiveTypePrecedence r3 = new net.bytebuddy.implementation.bind.ArgumentTypeResolver$PrimitiveTypePrecedence
                java.lang.String r4 = "INTEGER"
                r5 = 3
                r3.<init>(r4, r5, r5)
                net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence.INTEGER = r3
                net.bytebuddy.implementation.bind.ArgumentTypeResolver$PrimitiveTypePrecedence r4 = new net.bytebuddy.implementation.bind.ArgumentTypeResolver$PrimitiveTypePrecedence
                java.lang.String r5 = "CHARACTER"
                r6 = 4
                r4.<init>(r5, r6, r6)
                net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence.CHARACTER = r4
                net.bytebuddy.implementation.bind.ArgumentTypeResolver$PrimitiveTypePrecedence r5 = new net.bytebuddy.implementation.bind.ArgumentTypeResolver$PrimitiveTypePrecedence
                java.lang.String r6 = "LONG"
                r7 = 5
                r5.<init>(r6, r7, r7)
                net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence.LONG = r5
                net.bytebuddy.implementation.bind.ArgumentTypeResolver$PrimitiveTypePrecedence r6 = new net.bytebuddy.implementation.bind.ArgumentTypeResolver$PrimitiveTypePrecedence
                java.lang.String r7 = "FLOAT"
                r8 = 6
                r6.<init>(r7, r8, r8)
                net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence.FLOAT = r6
                net.bytebuddy.implementation.bind.ArgumentTypeResolver$PrimitiveTypePrecedence r7 = new net.bytebuddy.implementation.bind.ArgumentTypeResolver$PrimitiveTypePrecedence
                java.lang.String r8 = "DOUBLE"
                r9 = 7
                r7.<init>(r8, r9, r9)
                net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence.DOUBLE = r7
                net.bytebuddy.implementation.bind.ArgumentTypeResolver$PrimitiveTypePrecedence[] r0 = new net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence[]{r0, r1, r2, r3, r4, r5, r6, r7}
                net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence.$VALUES = r0
                return
        }

        PrimitiveTypePrecedence(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.score = r3
                return
        }

        public static net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence forPrimitive(net.bytebuddy.description.type.TypeDescription r3) {
                java.lang.Class r0 = java.lang.Boolean.TYPE
                boolean r0 = r3.represents(r0)
                if (r0 == 0) goto Lb
                net.bytebuddy.implementation.bind.ArgumentTypeResolver$PrimitiveTypePrecedence r3 = net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence.BOOLEAN
                return r3
            Lb:
                java.lang.Class r0 = java.lang.Byte.TYPE
                boolean r0 = r3.represents(r0)
                if (r0 == 0) goto L16
                net.bytebuddy.implementation.bind.ArgumentTypeResolver$PrimitiveTypePrecedence r3 = net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence.BYTE
                return r3
            L16:
                java.lang.Class r0 = java.lang.Short.TYPE
                boolean r0 = r3.represents(r0)
                if (r0 == 0) goto L21
                net.bytebuddy.implementation.bind.ArgumentTypeResolver$PrimitiveTypePrecedence r3 = net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence.SHORT
                return r3
            L21:
                java.lang.Class r0 = java.lang.Integer.TYPE
                boolean r0 = r3.represents(r0)
                if (r0 == 0) goto L2c
                net.bytebuddy.implementation.bind.ArgumentTypeResolver$PrimitiveTypePrecedence r3 = net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence.INTEGER
                return r3
            L2c:
                java.lang.Class r0 = java.lang.Character.TYPE
                boolean r0 = r3.represents(r0)
                if (r0 == 0) goto L37
                net.bytebuddy.implementation.bind.ArgumentTypeResolver$PrimitiveTypePrecedence r3 = net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence.CHARACTER
                return r3
            L37:
                java.lang.Class r0 = java.lang.Long.TYPE
                boolean r0 = r3.represents(r0)
                if (r0 == 0) goto L42
                net.bytebuddy.implementation.bind.ArgumentTypeResolver$PrimitiveTypePrecedence r3 = net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence.LONG
                return r3
            L42:
                java.lang.Class r0 = java.lang.Float.TYPE
                boolean r0 = r3.represents(r0)
                if (r0 == 0) goto L4d
                net.bytebuddy.implementation.bind.ArgumentTypeResolver$PrimitiveTypePrecedence r3 = net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence.FLOAT
                return r3
            L4d:
                java.lang.Class r0 = java.lang.Double.TYPE
                boolean r0 = r3.represents(r0)
                if (r0 == 0) goto L58
                net.bytebuddy.implementation.bind.ArgumentTypeResolver$PrimitiveTypePrecedence r3 = net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence.DOUBLE
                return r3
            L58:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Not a non-void, primitive type "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
        }

        public static net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.bind.ArgumentTypeResolver$PrimitiveTypePrecedence> r0 = net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.bind.ArgumentTypeResolver$PrimitiveTypePrecedence r1 = (net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence) r1
                return r1
        }

        public static net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence[] values() {
                net.bytebuddy.implementation.bind.ArgumentTypeResolver$PrimitiveTypePrecedence[] r0 = net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.bind.ArgumentTypeResolver$PrimitiveTypePrecedence[] r0 = (net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence[]) r0
                return r0
        }

        public net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution resolve(net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence r3) {
                r2 = this;
                int r0 = r2.score
                int r3 = r3.score
                int r1 = r0 - r3
                if (r1 != 0) goto Lb
                net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r3 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.UNKNOWN
                return r3
            Lb:
                int r0 = r0 - r3
                if (r0 <= 0) goto L11
                net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r3 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.RIGHT
                return r3
            L11:
                net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r3 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.LEFT
                return r3
        }
    }

    static {
            net.bytebuddy.implementation.bind.ArgumentTypeResolver r0 = new net.bytebuddy.implementation.bind.ArgumentTypeResolver
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            net.bytebuddy.implementation.bind.ArgumentTypeResolver.INSTANCE = r0
            net.bytebuddy.implementation.bind.ArgumentTypeResolver[] r0 = new net.bytebuddy.implementation.bind.ArgumentTypeResolver[]{r0}
            net.bytebuddy.implementation.bind.ArgumentTypeResolver.$VALUES = r0
            return
    }

    ArgumentTypeResolver(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private static net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution resolveByScore(int r0) {
            if (r0 != 0) goto L5
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.AMBIGUOUS
            return r0
        L5:
            if (r0 <= 0) goto La
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.LEFT
            return r0
        La:
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.RIGHT
            return r0
    }

    private static net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution resolveRivalBinding(net.bytebuddy.description.type.TypeDescription r0, int r1, net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding r2, int r3, net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding r4) {
            net.bytebuddy.description.method.MethodDescription r2 = r2.getTarget()
            net.bytebuddy.description.method.ParameterList r2 = r2.getParameters()
            java.lang.Object r1 = r2.get(r1)
            net.bytebuddy.description.method.ParameterDescription r1 = (net.bytebuddy.description.method.ParameterDescription) r1
            net.bytebuddy.description.type.TypeDescription$Generic r1 = r1.getType()
            net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
            net.bytebuddy.description.method.MethodDescription r2 = r4.getTarget()
            net.bytebuddy.description.method.ParameterList r2 = r2.getParameters()
            java.lang.Object r2 = r2.get(r3)
            net.bytebuddy.description.method.ParameterDescription r2 = (net.bytebuddy.description.method.ParameterDescription) r2
            net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.getType()
            net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
            boolean r3 = r1.equals(r2)
            if (r3 != 0) goto L84
            boolean r3 = r1.isPrimitive()
            if (r3 == 0) goto L4b
            boolean r3 = r2.isPrimitive()
            if (r3 == 0) goto L4b
            net.bytebuddy.implementation.bind.ArgumentTypeResolver$PrimitiveTypePrecedence r0 = net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence.forPrimitive(r1)
            net.bytebuddy.implementation.bind.ArgumentTypeResolver$PrimitiveTypePrecedence r1 = net.bytebuddy.implementation.bind.ArgumentTypeResolver.PrimitiveTypePrecedence.forPrimitive(r2)
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r0 = r0.resolve(r1)
            return r0
        L4b:
            boolean r3 = r1.isPrimitive()
            if (r3 == 0) goto L5d
            boolean r0 = r0.isPrimitive()
            if (r0 == 0) goto L5a
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.LEFT
            goto L5c
        L5a:
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.RIGHT
        L5c:
            return r0
        L5d:
            boolean r3 = r2.isPrimitive()
            if (r3 == 0) goto L6f
            boolean r0 = r0.isPrimitive()
            if (r0 == 0) goto L6c
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.RIGHT
            goto L6e
        L6c:
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.LEFT
        L6e:
            return r0
        L6f:
            boolean r0 = r1.isAssignableFrom(r2)
            if (r0 == 0) goto L78
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.RIGHT
            return r0
        L78:
            boolean r0 = r2.isAssignableFrom(r1)
            if (r0 == 0) goto L81
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.LEFT
            return r0
        L81:
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.AMBIGUOUS
            return r0
        L84:
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.UNKNOWN
            return r0
    }

    public static net.bytebuddy.implementation.bind.ArgumentTypeResolver valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.implementation.bind.ArgumentTypeResolver> r0 = net.bytebuddy.implementation.bind.ArgumentTypeResolver.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.implementation.bind.ArgumentTypeResolver r1 = (net.bytebuddy.implementation.bind.ArgumentTypeResolver) r1
            return r1
    }

    public static net.bytebuddy.implementation.bind.ArgumentTypeResolver[] values() {
            net.bytebuddy.implementation.bind.ArgumentTypeResolver[] r0 = net.bytebuddy.implementation.bind.ArgumentTypeResolver.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.implementation.bind.ArgumentTypeResolver[] r0 = (net.bytebuddy.implementation.bind.ArgumentTypeResolver[]) r0
            return r0
    }

    @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver
    public net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution resolve(net.bytebuddy.description.method.MethodDescription r8, net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding r9, net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding r10) {
            r7 = this;
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.UNKNOWN
            net.bytebuddy.description.method.ParameterList r8 = r8.getParameters()
            r1 = 0
            r2 = r1
            r3 = r2
        L9:
            int r4 = r8.size()
            if (r1 >= r4) goto L4b
            net.bytebuddy.implementation.bind.ArgumentTypeResolver$ParameterIndexToken r4 = new net.bytebuddy.implementation.bind.ArgumentTypeResolver$ParameterIndexToken
            r4.<init>(r1)
            java.lang.Integer r5 = r9.getTargetParameterIndex(r4)
            java.lang.Integer r4 = r10.getTargetParameterIndex(r4)
            if (r5 == 0) goto L3f
            if (r4 == 0) goto L3f
            java.lang.Object r6 = r8.get(r1)
            net.bytebuddy.description.method.ParameterDescription r6 = (net.bytebuddy.description.method.ParameterDescription) r6
            net.bytebuddy.description.type.TypeDescription$Generic r6 = r6.getType()
            net.bytebuddy.description.type.TypeDescription r6 = r6.asErasure()
            int r5 = r5.intValue()
            int r4 = r4.intValue()
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r4 = resolveRivalBinding(r6, r5, r9, r4, r10)
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r0 = r0.merge(r4)
            goto L48
        L3f:
            if (r5 == 0) goto L44
            int r2 = r2 + 1
            goto L48
        L44:
            if (r4 == 0) goto L48
            int r3 = r3 + 1
        L48:
            int r1 = r1 + 1
            goto L9
        L4b:
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r8 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.UNKNOWN
            if (r0 != r8) goto L54
            int r2 = r2 - r3
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r0 = resolveByScore(r2)
        L54:
            return r0
    }
}
