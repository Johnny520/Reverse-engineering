package net.bytebuddy.implementation;

/* JADX INFO: loaded from: classes2.dex */
public enum SuperMethodCall extends java.lang.Enum<net.bytebuddy.implementation.SuperMethodCall> implements net.bytebuddy.implementation.Implementation.Composable {
    private static final /* synthetic */ net.bytebuddy.implementation.SuperMethodCall[] $VALUES = null;
    public static final net.bytebuddy.implementation.SuperMethodCall INSTANCE = null;

    /* JADX INFO: renamed from: net.bytebuddy.implementation.SuperMethodCall$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Appender implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
        private final net.bytebuddy.implementation.Implementation.Target implementationTarget;
        private final net.bytebuddy.implementation.SuperMethodCall.Appender.TerminationHandler terminationHandler;

        public enum TerminationHandler extends java.lang.Enum<net.bytebuddy.implementation.SuperMethodCall.Appender.TerminationHandler> {
            private static final /* synthetic */ net.bytebuddy.implementation.SuperMethodCall.Appender.TerminationHandler[] $VALUES = null;
            public static final net.bytebuddy.implementation.SuperMethodCall.Appender.TerminationHandler DROPPING = null;
            public static final net.bytebuddy.implementation.SuperMethodCall.Appender.TerminationHandler RETURNING = null;



            static {
                    net.bytebuddy.implementation.SuperMethodCall$Appender$TerminationHandler$1 r0 = new net.bytebuddy.implementation.SuperMethodCall$Appender$TerminationHandler$1
                    java.lang.String r1 = "RETURNING"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.implementation.SuperMethodCall.Appender.TerminationHandler.RETURNING = r0
                    net.bytebuddy.implementation.SuperMethodCall$Appender$TerminationHandler$2 r1 = new net.bytebuddy.implementation.SuperMethodCall$Appender$TerminationHandler$2
                    java.lang.String r3 = "DROPPING"
                    r4 = 1
                    r1.<init>(r3, r4)
                    net.bytebuddy.implementation.SuperMethodCall.Appender.TerminationHandler.DROPPING = r1
                    r3 = 2
                    net.bytebuddy.implementation.SuperMethodCall$Appender$TerminationHandler[] r3 = new net.bytebuddy.implementation.SuperMethodCall.Appender.TerminationHandler[r3]
                    r3[r2] = r0
                    r3[r4] = r1
                    net.bytebuddy.implementation.SuperMethodCall.Appender.TerminationHandler.$VALUES = r3
                    return
            }

            TerminationHandler(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            /* synthetic */ TerminationHandler(java.lang.String r1, int r2, net.bytebuddy.implementation.SuperMethodCall.AnonymousClass1 r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.implementation.SuperMethodCall.Appender.TerminationHandler valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.implementation.SuperMethodCall$Appender$TerminationHandler> r0 = net.bytebuddy.implementation.SuperMethodCall.Appender.TerminationHandler.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.implementation.SuperMethodCall$Appender$TerminationHandler r1 = (net.bytebuddy.implementation.SuperMethodCall.Appender.TerminationHandler) r1
                    return r1
            }

            public static net.bytebuddy.implementation.SuperMethodCall.Appender.TerminationHandler[] values() {
                    net.bytebuddy.implementation.SuperMethodCall$Appender$TerminationHandler[] r0 = net.bytebuddy.implementation.SuperMethodCall.Appender.TerminationHandler.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.implementation.SuperMethodCall$Appender$TerminationHandler[] r0 = (net.bytebuddy.implementation.SuperMethodCall.Appender.TerminationHandler[]) r0
                    return r0
            }

            public abstract net.bytebuddy.implementation.bytecode.StackManipulation of(net.bytebuddy.description.method.MethodDescription r1);
        }

        public Appender(net.bytebuddy.implementation.Implementation.Target r1, net.bytebuddy.implementation.SuperMethodCall.Appender.TerminationHandler r2) {
                r0 = this;
                r0.<init>()
                r0.implementationTarget = r1
                r0.terminationHandler = r2
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r7, net.bytebuddy.implementation.Implementation.Context r8, net.bytebuddy.description.method.MethodDescription r9) {
                r6 = this;
                net.bytebuddy.implementation.Implementation$Target r0 = r6.implementationTarget
                net.bytebuddy.description.method.MethodDescription$SignatureToken r1 = r9.asSignatureToken()
                net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r0 = r0.invokeDominant(r1)
                net.bytebuddy.description.method.MethodDescription$TypeToken r1 = r9.asTypeToken()
                net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r0 = r0.withCheckedCompatibilityTo(r1)
                boolean r1 = r0.isValid()
                if (r1 == 0) goto L49
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r1 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$MethodLoading r2 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.allArgumentsOf(r9)
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = r2.prependThisReference()
                net.bytebuddy.implementation.SuperMethodCall$Appender$TerminationHandler r3 = r6.terminationHandler
                net.bytebuddy.implementation.bytecode.StackManipulation r3 = r3.of(r9)
                r4 = 3
                net.bytebuddy.implementation.bytecode.StackManipulation[] r4 = new net.bytebuddy.implementation.bytecode.StackManipulation[r4]
                r5 = 0
                r4[r5] = r2
                r2 = 1
                r4[r2] = r0
                r0 = 2
                r4[r0] = r3
                r1.<init>(r4)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r7 = r1.apply(r7, r8)
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r8 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                int r7 = r7.getMaximalSize()
                int r9 = r9.getStackSize()
                r8.<init>(r7, r9)
                return r8
            L49:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r0 = "Cannot call super (or default) method for "
                r8.append(r0)
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                r7.<init>(r8)
                throw r7
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
                net.bytebuddy.implementation.SuperMethodCall$Appender$TerminationHandler r2 = r4.terminationHandler
                net.bytebuddy.implementation.SuperMethodCall$Appender r5 = (net.bytebuddy.implementation.SuperMethodCall.Appender) r5
                net.bytebuddy.implementation.SuperMethodCall$Appender$TerminationHandler r3 = r5.terminationHandler
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                net.bytebuddy.implementation.Implementation$Target r2 = r4.implementationTarget
                net.bytebuddy.implementation.Implementation$Target r5 = r5.implementationTarget
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
                net.bytebuddy.implementation.Implementation$Target r1 = r2.implementationTarget
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.SuperMethodCall$Appender$TerminationHandler r1 = r2.terminationHandler
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    public enum WithoutReturn extends java.lang.Enum<net.bytebuddy.implementation.SuperMethodCall.WithoutReturn> implements net.bytebuddy.implementation.Implementation {
        private static final /* synthetic */ net.bytebuddy.implementation.SuperMethodCall.WithoutReturn[] $VALUES = null;
        public static final net.bytebuddy.implementation.SuperMethodCall.WithoutReturn INSTANCE = null;

        static {
                net.bytebuddy.implementation.SuperMethodCall$WithoutReturn r0 = new net.bytebuddy.implementation.SuperMethodCall$WithoutReturn
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.SuperMethodCall.WithoutReturn.INSTANCE = r0
                net.bytebuddy.implementation.SuperMethodCall$WithoutReturn[] r0 = new net.bytebuddy.implementation.SuperMethodCall.WithoutReturn[]{r0}
                net.bytebuddy.implementation.SuperMethodCall.WithoutReturn.$VALUES = r0
                return
        }

        WithoutReturn(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.SuperMethodCall.WithoutReturn valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.SuperMethodCall$WithoutReturn> r0 = net.bytebuddy.implementation.SuperMethodCall.WithoutReturn.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.SuperMethodCall$WithoutReturn r1 = (net.bytebuddy.implementation.SuperMethodCall.WithoutReturn) r1
                return r1
        }

        public static net.bytebuddy.implementation.SuperMethodCall.WithoutReturn[] values() {
                net.bytebuddy.implementation.SuperMethodCall$WithoutReturn[] r0 = net.bytebuddy.implementation.SuperMethodCall.WithoutReturn.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.SuperMethodCall$WithoutReturn[] r0 = (net.bytebuddy.implementation.SuperMethodCall.WithoutReturn[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.Implementation
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r3) {
                r2 = this;
                net.bytebuddy.implementation.SuperMethodCall$Appender r0 = new net.bytebuddy.implementation.SuperMethodCall$Appender
                net.bytebuddy.implementation.SuperMethodCall$Appender$TerminationHandler r1 = net.bytebuddy.implementation.SuperMethodCall.Appender.TerminationHandler.DROPPING
                r0.<init>(r3, r1)
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                r0 = this;
                return r1
        }
    }

    static {
            net.bytebuddy.implementation.SuperMethodCall r0 = new net.bytebuddy.implementation.SuperMethodCall
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            net.bytebuddy.implementation.SuperMethodCall.INSTANCE = r0
            net.bytebuddy.implementation.SuperMethodCall[] r0 = new net.bytebuddy.implementation.SuperMethodCall[]{r0}
            net.bytebuddy.implementation.SuperMethodCall.$VALUES = r0
            return
    }

    SuperMethodCall(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static net.bytebuddy.implementation.SuperMethodCall valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.implementation.SuperMethodCall> r0 = net.bytebuddy.implementation.SuperMethodCall.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.implementation.SuperMethodCall r1 = (net.bytebuddy.implementation.SuperMethodCall) r1
            return r1
    }

    public static net.bytebuddy.implementation.SuperMethodCall[] values() {
            net.bytebuddy.implementation.SuperMethodCall[] r0 = net.bytebuddy.implementation.SuperMethodCall.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.implementation.SuperMethodCall[] r0 = (net.bytebuddy.implementation.SuperMethodCall[]) r0
            return r0
    }

    @Override // net.bytebuddy.implementation.Implementation.Composable
    public net.bytebuddy.implementation.Implementation.Composable andThen(net.bytebuddy.implementation.Implementation.Composable r3) {
            r2 = this;
            net.bytebuddy.implementation.Implementation$Compound$Composable r0 = new net.bytebuddy.implementation.Implementation$Compound$Composable
            net.bytebuddy.implementation.SuperMethodCall$WithoutReturn r1 = net.bytebuddy.implementation.SuperMethodCall.WithoutReturn.INSTANCE
            r0.<init>(r1, r3)
            return r0
    }

    @Override // net.bytebuddy.implementation.Implementation.Composable
    public net.bytebuddy.implementation.Implementation andThen(net.bytebuddy.implementation.Implementation r5) {
            r4 = this;
            net.bytebuddy.implementation.Implementation$Compound r0 = new net.bytebuddy.implementation.Implementation$Compound
            r1 = 2
            net.bytebuddy.implementation.Implementation[] r1 = new net.bytebuddy.implementation.Implementation[r1]
            net.bytebuddy.implementation.SuperMethodCall$WithoutReturn r2 = net.bytebuddy.implementation.SuperMethodCall.WithoutReturn.INSTANCE
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r1[r2] = r5
            r0.<init>(r1)
            return r0
    }

    @Override // net.bytebuddy.implementation.Implementation
    public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r3) {
            r2 = this;
            net.bytebuddy.implementation.SuperMethodCall$Appender r0 = new net.bytebuddy.implementation.SuperMethodCall$Appender
            net.bytebuddy.implementation.SuperMethodCall$Appender$TerminationHandler r1 = net.bytebuddy.implementation.SuperMethodCall.Appender.TerminationHandler.RETURNING
            r0.<init>(r3, r1)
            return r0
    }

    @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
    public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
            r0 = this;
            return r1
    }
}
