package net.bytebuddy.implementation.bytecode.member;

/* JADX INFO: loaded from: classes2.dex */
public enum MethodVariableAccess extends java.lang.Enum<net.bytebuddy.implementation.bytecode.member.MethodVariableAccess> {
    private static final /* synthetic */ net.bytebuddy.implementation.bytecode.member.MethodVariableAccess[] $VALUES = null;
    public static final net.bytebuddy.implementation.bytecode.member.MethodVariableAccess DOUBLE = null;
    public static final net.bytebuddy.implementation.bytecode.member.MethodVariableAccess FLOAT = null;
    public static final net.bytebuddy.implementation.bytecode.member.MethodVariableAccess INTEGER = null;
    public static final net.bytebuddy.implementation.bytecode.member.MethodVariableAccess LONG = null;
    public static final net.bytebuddy.implementation.bytecode.member.MethodVariableAccess REFERENCE = null;
    private static /* synthetic */ net.bytebuddy.implementation.bytecode.StackManipulation loadThis;
    private final int loadOpcode;
    private final net.bytebuddy.implementation.bytecode.StackSize size;
    private final int storeOpcode;

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class MethodLoading extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase {
        private final net.bytebuddy.description.method.MethodDescription methodDescription;
        private final net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.MethodLoading.TypeCastingHandler typeCastingHandler;

        public interface TypeCastingHandler {

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForBridgeTarget implements net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.MethodLoading.TypeCastingHandler {
                private final net.bytebuddy.description.method.MethodDescription bridgeTarget;

                public ForBridgeTarget(net.bytebuddy.description.method.MethodDescription r1) {
                        r0 = this;
                        r0.<init>()
                        r0.bridgeTarget = r1
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
                        net.bytebuddy.description.method.MethodDescription r2 = r4.bridgeTarget
                        net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$MethodLoading$TypeCastingHandler$ForBridgeTarget r5 = (net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.MethodLoading.TypeCastingHandler.ForBridgeTarget) r5
                        net.bytebuddy.description.method.MethodDescription r5 = r5.bridgeTarget
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
                        net.bytebuddy.description.method.MethodDescription r1 = r2.bridgeTarget
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.MethodLoading.TypeCastingHandler
                public net.bytebuddy.implementation.bytecode.StackManipulation ofIndex(net.bytebuddy.description.type.TypeDescription r2, int r3) {
                        r1 = this;
                        net.bytebuddy.description.method.MethodDescription r0 = r1.bridgeTarget
                        net.bytebuddy.description.method.ParameterList r0 = r0.getParameters()
                        java.lang.Object r3 = r0.get(r3)
                        net.bytebuddy.description.method.ParameterDescription r3 = (net.bytebuddy.description.method.ParameterDescription) r3
                        net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.getType()
                        net.bytebuddy.description.type.TypeDescription r3 = r3.asErasure()
                        boolean r2 = r2.equals(r3)
                        if (r2 == 0) goto L1d
                        net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r2 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
                        goto L21
                    L1d:
                        net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.assign.TypeCasting.to(r3)
                    L21:
                        return r2
                }
            }

            public enum NoOp extends java.lang.Enum<net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.MethodLoading.TypeCastingHandler.NoOp> implements net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.MethodLoading.TypeCastingHandler {
                private static final /* synthetic */ net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.MethodLoading.TypeCastingHandler.NoOp[] $VALUES = null;
                public static final net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.MethodLoading.TypeCastingHandler.NoOp INSTANCE = null;

                static {
                        net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$MethodLoading$TypeCastingHandler$NoOp r0 = new net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$MethodLoading$TypeCastingHandler$NoOp
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.MethodLoading.TypeCastingHandler.NoOp.INSTANCE = r0
                        net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$MethodLoading$TypeCastingHandler$NoOp[] r0 = new net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.MethodLoading.TypeCastingHandler.NoOp[]{r0}
                        net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.MethodLoading.TypeCastingHandler.NoOp.$VALUES = r0
                        return
                }

                NoOp(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.MethodLoading.TypeCastingHandler.NoOp valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$MethodLoading$TypeCastingHandler$NoOp> r0 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.MethodLoading.TypeCastingHandler.NoOp.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$MethodLoading$TypeCastingHandler$NoOp r1 = (net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.MethodLoading.TypeCastingHandler.NoOp) r1
                        return r1
                }

                public static net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.MethodLoading.TypeCastingHandler.NoOp[] values() {
                        net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$MethodLoading$TypeCastingHandler$NoOp[] r0 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.MethodLoading.TypeCastingHandler.NoOp.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$MethodLoading$TypeCastingHandler$NoOp[] r0 = (net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.MethodLoading.TypeCastingHandler.NoOp[]) r0
                        return r0
                }

                @Override // net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.MethodLoading.TypeCastingHandler
                public net.bytebuddy.implementation.bytecode.StackManipulation ofIndex(net.bytebuddy.description.type.TypeDescription r1, int r2) {
                        r0 = this;
                        net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r1 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
                        return r1
                }
            }

            net.bytebuddy.implementation.bytecode.StackManipulation ofIndex(net.bytebuddy.description.type.TypeDescription r1, int r2);
        }

        public MethodLoading(net.bytebuddy.description.method.MethodDescription r1, net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.MethodLoading.TypeCastingHandler r2) {
                r0 = this;
                r0.<init>()
                r0.methodDescription = r1
                r0.typeCastingHandler = r2
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r7, net.bytebuddy.implementation.Implementation.Context r8) {
                r6 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                net.bytebuddy.description.method.MethodDescription r1 = r6.methodDescription
                net.bytebuddy.description.method.ParameterList r1 = r1.getParameters()
                java.util.Iterator r1 = r1.iterator()
            Lf:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L40
                java.lang.Object r2 = r1.next()
                net.bytebuddy.description.method.ParameterDescription r2 = (net.bytebuddy.description.method.ParameterDescription) r2
                net.bytebuddy.description.type.TypeDescription$Generic r3 = r2.getType()
                net.bytebuddy.description.type.TypeDescription r3 = r3.asErasure()
                net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r4 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.of(r3)
                int r5 = r2.getOffset()
                net.bytebuddy.implementation.bytecode.StackManipulation r4 = r4.loadFrom(r5)
                r0.add(r4)
                net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$MethodLoading$TypeCastingHandler r4 = r6.typeCastingHandler
                int r2 = r2.getIndex()
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = r4.ofIndex(r3, r2)
                r0.add(r2)
                goto Lf
            L40:
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r1 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                r1.<init>(r0)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r7 = r1.apply(r7, r8)
                return r7
        }

        public net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.MethodLoading asBridgeOf(net.bytebuddy.description.method.MethodDescription r4) {
                r3 = this;
                net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$MethodLoading r0 = new net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$MethodLoading
                net.bytebuddy.description.method.MethodDescription r1 = r3.methodDescription
                net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$MethodLoading$TypeCastingHandler$ForBridgeTarget r2 = new net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$MethodLoading$TypeCastingHandler$ForBridgeTarget
                r2.<init>(r4)
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
                net.bytebuddy.description.method.MethodDescription r2 = r4.methodDescription
                net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$MethodLoading r5 = (net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.MethodLoading) r5
                net.bytebuddy.description.method.MethodDescription r3 = r5.methodDescription
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$MethodLoading$TypeCastingHandler r2 = r4.typeCastingHandler
                net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$MethodLoading$TypeCastingHandler r5 = r5.typeCastingHandler
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
                net.bytebuddy.description.method.MethodDescription r1 = r2.methodDescription
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$MethodLoading$TypeCastingHandler r1 = r2.typeCastingHandler
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        public net.bytebuddy.implementation.bytecode.StackManipulation prependThisReference() {
                r4 = this;
                net.bytebuddy.description.method.MethodDescription r0 = r4.methodDescription
                boolean r0 = r0.isStatic()
                if (r0 == 0) goto La
                r0 = r4
                goto L1c
            La:
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.implementation.bytecode.StackManipulation r1 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                r2 = 2
                net.bytebuddy.implementation.bytecode.StackManipulation[] r2 = new net.bytebuddy.implementation.bytecode.StackManipulation[r2]
                r3 = 0
                r2[r3] = r1
                r1 = 1
                r2[r1] = r4
                r0.<init>(r2)
            L1c:
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class OffsetIncrementing extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase {
        private final int offset;
        private final int value;

        public OffsetIncrementing(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.offset = r1
                r0.value = r2
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.implementation.Implementation.Context r3) {
                r1 = this;
                int r3 = r1.offset
                int r0 = r1.value
                r2.visitIincInsn(r3, r0)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r2 = net.bytebuddy.implementation.bytecode.StackManipulation.Size.ZERO
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
                int r2 = r4.offset
                net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$OffsetIncrementing r5 = (net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.OffsetIncrementing) r5
                int r3 = r5.offset
                if (r2 == r3) goto L1c
                return r1
            L1c:
                int r2 = r4.value
                int r5 = r5.value
                if (r2 == r5) goto L23
                return r1
            L23:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                int r1 = r2.offset
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r2.value
                int r0 = r0 + r1
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
    public class OffsetLoading extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase {
        private final int offset;
        final /* synthetic */ net.bytebuddy.implementation.bytecode.member.MethodVariableAccess this$0;

        public OffsetLoading(net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r1, int r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.offset = r2
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.implementation.Implementation.Context r3) {
                r1 = this;
                net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r3 = r1.this$0
                int r3 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.access$000(r3)
                int r0 = r1.offset
                r2.visitVarInsn(r3, r0)
                net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r2 = r1.this$0
                net.bytebuddy.implementation.bytecode.StackSize r2 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.access$100(r2)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r2 = r2.toIncreasingSize()
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
                int r2 = r4.offset
                net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$OffsetLoading r5 = (net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.OffsetLoading) r5
                int r3 = r5.offset
                if (r2 == r3) goto L1c
                return r1
            L1c:
                net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r2 = r4.this$0
                net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r5 = r5.this$0
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
                int r1 = r2.offset
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r1 = r2.this$0
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
    public class OffsetWriting extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase {
        private final int offset;
        final /* synthetic */ net.bytebuddy.implementation.bytecode.member.MethodVariableAccess this$0;

        public OffsetWriting(net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r1, int r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.offset = r2
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.implementation.Implementation.Context r3) {
                r1 = this;
                net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r3 = r1.this$0
                int r3 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.access$200(r3)
                int r0 = r1.offset
                r2.visitVarInsn(r3, r0)
                net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r2 = r1.this$0
                net.bytebuddy.implementation.bytecode.StackSize r2 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.access$100(r2)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r2 = r2.toDecreasingSize()
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
                int r2 = r4.offset
                net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$OffsetWriting r5 = (net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.OffsetWriting) r5
                int r3 = r5.offset
                if (r2 == r3) goto L1c
                return r1
            L1c:
                net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r2 = r4.this$0
                net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r5 = r5.this$0
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
                int r1 = r2.offset
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r1 = r2.this$0
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    static {
            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r6 = new net.bytebuddy.implementation.bytecode.member.MethodVariableAccess
            net.bytebuddy.implementation.bytecode.StackSize r7 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
            java.lang.String r1 = "INTEGER"
            r2 = 0
            r3 = 21
            r4 = 54
            r0 = r6
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.INTEGER = r6
            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r14 = new net.bytebuddy.implementation.bytecode.member.MethodVariableAccess
            net.bytebuddy.implementation.bytecode.StackSize r15 = net.bytebuddy.implementation.bytecode.StackSize.DOUBLE
            java.lang.String r9 = "LONG"
            r10 = 1
            r11 = 22
            r12 = 55
            r8 = r14
            r13 = r15
            r8.<init>(r9, r10, r11, r12, r13)
            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.LONG = r14
            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r8 = new net.bytebuddy.implementation.bytecode.member.MethodVariableAccess
            r3 = 23
            r4 = 56
            java.lang.String r1 = "FLOAT"
            r2 = 2
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.FLOAT = r8
            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r9 = new net.bytebuddy.implementation.bytecode.member.MethodVariableAccess
            r3 = 24
            r4 = 57
            java.lang.String r1 = "DOUBLE"
            r2 = 3
            r0 = r9
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.DOUBLE = r9
            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r10 = new net.bytebuddy.implementation.bytecode.member.MethodVariableAccess
            r3 = 25
            r4 = 58
            java.lang.String r1 = "REFERENCE"
            r2 = 4
            r0 = r10
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.REFERENCE = r10
            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess[] r0 = new net.bytebuddy.implementation.bytecode.member.MethodVariableAccess[]{r6, r14, r8, r9, r10}
            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.$VALUES = r0
            return
    }

    MethodVariableAccess(java.lang.String r1, int r2, int r3, int r4, net.bytebuddy.implementation.bytecode.StackSize r5) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.loadOpcode = r3
            r0.size = r5
            r0.storeOpcode = r4
            return
    }

    public static /* synthetic */ int access$000(net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r0) {
            int r0 = r0.loadOpcode
            return r0
    }

    public static /* synthetic */ net.bytebuddy.implementation.bytecode.StackSize access$100(net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r0) {
            net.bytebuddy.implementation.bytecode.StackSize r0 = r0.size
            return r0
    }

    public static /* synthetic */ int access$200(net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r0) {
            int r0 = r0.storeOpcode
            return r0
    }

    public static net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.MethodLoading allArgumentsOf(net.bytebuddy.description.method.MethodDescription r2) {
            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$MethodLoading r0 = new net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$MethodLoading
            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$MethodLoading$TypeCastingHandler$NoOp r1 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.MethodLoading.TypeCastingHandler.NoOp.INSTANCE
            r0.<init>(r2, r1)
            return r0
    }

    public static net.bytebuddy.implementation.bytecode.StackManipulation increment(net.bytebuddy.description.method.ParameterDescription r1, int r2) {
            net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.getType()
            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r0 = of(r0)
            int r1 = r1.getOffset()
            net.bytebuddy.implementation.bytecode.StackManipulation r1 = r0.increment(r1, r2)
            return r1
    }

    public static net.bytebuddy.implementation.bytecode.StackManipulation load(net.bytebuddy.description.method.ParameterDescription r1) {
            net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.getType()
            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r0 = of(r0)
            int r1 = r1.getOffset()
            net.bytebuddy.implementation.bytecode.StackManipulation r1 = r0.loadFrom(r1)
            return r1
    }

    @net.bytebuddy.build.CachedReturnPlugin.Enhance("loadThis")
    public static net.bytebuddy.implementation.bytecode.StackManipulation loadThis() {
            net.bytebuddy.implementation.bytecode.StackManipulation r0 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis
            if (r0 == 0) goto L6
            r0 = 0
            goto Ld
        L6:
            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r0 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.REFERENCE
            r1 = 0
            net.bytebuddy.implementation.bytecode.StackManipulation r0 = r0.loadFrom(r1)
        Ld:
            if (r0 != 0) goto L12
            net.bytebuddy.implementation.bytecode.StackManipulation r0 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis
            goto L14
        L12:
            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis = r0
        L14:
            return r0
    }

    public static net.bytebuddy.implementation.bytecode.member.MethodVariableAccess of(net.bytebuddy.description.type.TypeDefinition r1) {
            boolean r0 = r1.isPrimitive()
            if (r0 == 0) goto L3a
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = r1.represents(r0)
            if (r0 == 0) goto L11
            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r1 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.LONG
            return r1
        L11:
            java.lang.Class r0 = java.lang.Double.TYPE
            boolean r0 = r1.represents(r0)
            if (r0 == 0) goto L1c
            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r1 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.DOUBLE
            return r1
        L1c:
            java.lang.Class r0 = java.lang.Float.TYPE
            boolean r0 = r1.represents(r0)
            if (r0 == 0) goto L27
            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r1 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.FLOAT
            return r1
        L27:
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r1 = r1.represents(r0)
            if (r1 != 0) goto L32
            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r1 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.INTEGER
            return r1
        L32:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Variable type cannot be void"
            r1.<init>(r0)
            throw r1
        L3a:
            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r1 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.REFERENCE
            return r1
    }

    public static net.bytebuddy.implementation.bytecode.StackManipulation store(net.bytebuddy.description.method.ParameterDescription r1) {
            net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.getType()
            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r0 = of(r0)
            int r1 = r1.getOffset()
            net.bytebuddy.implementation.bytecode.StackManipulation r1 = r0.storeAt(r1)
            return r1
    }

    public static net.bytebuddy.implementation.bytecode.member.MethodVariableAccess valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.implementation.bytecode.member.MethodVariableAccess> r0 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r1 = (net.bytebuddy.implementation.bytecode.member.MethodVariableAccess) r1
            return r1
    }

    public static net.bytebuddy.implementation.bytecode.member.MethodVariableAccess[] values() {
            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess[] r0 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess[] r0 = (net.bytebuddy.implementation.bytecode.member.MethodVariableAccess[]) r0
            return r0
    }

    public net.bytebuddy.implementation.bytecode.StackManipulation increment(int r2, int r3) {
            r1 = this;
            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r0 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.INTEGER
            if (r1 != r0) goto La
            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$OffsetIncrementing r0 = new net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$OffsetIncrementing
            r0.<init>(r2, r3)
            return r0
        La:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Cannot increment type: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public net.bytebuddy.implementation.bytecode.StackManipulation loadFrom(int r2) {
            r1 = this;
            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$OffsetLoading r0 = new net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$OffsetLoading
            r0.<init>(r1, r2)
            return r0
    }

    public net.bytebuddy.implementation.bytecode.StackManipulation storeAt(int r2) {
            r1 = this;
            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$OffsetWriting r0 = new net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$OffsetWriting
            r0.<init>(r1, r2)
            return r0
    }
}
