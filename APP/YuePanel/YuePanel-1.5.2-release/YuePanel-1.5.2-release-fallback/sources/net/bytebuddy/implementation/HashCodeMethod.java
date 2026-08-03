package net.bytebuddy.implementation;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class HashCodeMethod implements net.bytebuddy.implementation.Implementation {
    private static final int DEFAULT_MULTIPLIER = 31;
    private static final int DEFAULT_OFFSET = 17;
    private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape GET_CLASS = null;
    private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape HASH_CODE = null;
    private final net.bytebuddy.matcher.ElementMatcher.Junction<? super net.bytebuddy.description.field.FieldDescription.InDefinedShape> ignored;
    private final int multiplier;
    private final net.bytebuddy.matcher.ElementMatcher.Junction<? super net.bytebuddy.description.field.FieldDescription.InDefinedShape> nonNullable;
    private final net.bytebuddy.implementation.HashCodeMethod.OffsetProvider offsetProvider;

    /* JADX INFO: renamed from: net.bytebuddy.implementation.HashCodeMethod$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Appender implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
        private final java.util.List<net.bytebuddy.description.field.FieldDescription.InDefinedShape> fieldDescriptions;
        private final net.bytebuddy.implementation.bytecode.StackManipulation initialValue;
        private final int multiplier;
        private final net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription.InDefinedShape> nonNullable;

        public Appender(net.bytebuddy.implementation.bytecode.StackManipulation r1, int r2, java.util.List<net.bytebuddy.description.field.FieldDescription.InDefinedShape> r3, net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription.InDefinedShape> r4) {
                r0 = this;
                r0.<init>()
                r0.initialValue = r1
                r0.multiplier = r2
                r0.fieldDescriptions = r3
                r0.nonNullable = r4
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r7, net.bytebuddy.implementation.Implementation.Context r8, net.bytebuddy.description.method.MethodDescription r9) {
                r6 = this;
                boolean r0 = r9.isStatic()
                if (r0 != 0) goto Ld9
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r9.getReturnType()
                java.lang.Class r1 = java.lang.Integer.TYPE
                boolean r0 = r0.represents(r1)
                if (r0 == 0) goto Lc2
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.List<net.bytebuddy.description.field.FieldDescription$InDefinedShape> r1 = r6.fieldDescriptions
                int r1 = r1.size()
                int r1 = r1 * 8
                int r1 = r1 + 2
                r0.<init>(r1)
                net.bytebuddy.implementation.bytecode.StackManipulation r1 = r6.initialValue
                r0.add(r1)
                java.util.List<net.bytebuddy.description.field.FieldDescription$InDefinedShape> r1 = r6.fieldDescriptions
                java.util.Iterator r1 = r1.iterator()
                r2 = 0
            L2d:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto La5
                java.lang.Object r3 = r1.next()
                net.bytebuddy.description.field.FieldDescription$InDefinedShape r3 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r3
                int r4 = r6.multiplier
                net.bytebuddy.implementation.bytecode.StackManipulation r4 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.forValue(r4)
                r0.add(r4)
                net.bytebuddy.implementation.bytecode.Multiplication r4 = net.bytebuddy.implementation.bytecode.Multiplication.INTEGER
                r0.add(r4)
                net.bytebuddy.implementation.bytecode.StackManipulation r4 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                r0.add(r4)
                net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r4 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r3)
                net.bytebuddy.implementation.bytecode.StackManipulation r4 = r4.read()
                r0.add(r4)
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r3.getType()
                boolean r4 = r4.isPrimitive()
                if (r4 != 0) goto L7c
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r3.getType()
                boolean r4 = r4.isArray()
                if (r4 != 0) goto L7c
                net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r4 = r6.nonNullable
                boolean r4 = r4.matches(r3)
                if (r4 == 0) goto L76
                goto L7c
            L76:
                net.bytebuddy.implementation.HashCodeMethod$NullValueGuard$UsingJump r4 = new net.bytebuddy.implementation.HashCodeMethod$NullValueGuard$UsingJump
                r4.<init>(r9)
                goto L7e
            L7c:
                net.bytebuddy.implementation.HashCodeMethod$NullValueGuard$NoOp r4 = net.bytebuddy.implementation.HashCodeMethod.NullValueGuard.NoOp.INSTANCE
            L7e:
                net.bytebuddy.implementation.bytecode.StackManipulation r5 = r4.before()
                r0.add(r5)
                net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.getType()
                net.bytebuddy.implementation.bytecode.StackManipulation r3 = net.bytebuddy.implementation.HashCodeMethod.ValueTransformer.of(r3)
                r0.add(r3)
                net.bytebuddy.implementation.bytecode.Addition r3 = net.bytebuddy.implementation.bytecode.Addition.INTEGER
                r0.add(r3)
                net.bytebuddy.implementation.bytecode.StackManipulation r3 = r4.after()
                r0.add(r3)
                int r3 = r4.getRequiredVariablePadding()
                int r2 = java.lang.Math.max(r2, r3)
                goto L2d
            La5:
                net.bytebuddy.implementation.bytecode.member.MethodReturn r1 = net.bytebuddy.implementation.bytecode.member.MethodReturn.INTEGER
                r0.add(r1)
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r1 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r3 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                r3.<init>(r0)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r7 = r3.apply(r7, r8)
                int r7 = r7.getMaximalSize()
                int r8 = r9.getStackSize()
                int r8 = r8 + r2
                r1.<init>(r7, r8)
                return r1
            Lc2:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r0 = "Hash code method does not return primitive integer: "
                r8.append(r0)
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                r7.<init>(r8)
                throw r7
            Ld9:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r0 = "Hash code method must not be static: "
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
                int r2 = r4.multiplier
                net.bytebuddy.implementation.HashCodeMethod$Appender r5 = (net.bytebuddy.implementation.HashCodeMethod.Appender) r5
                int r3 = r5.multiplier
                if (r2 == r3) goto L1c
                return r1
            L1c:
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = r4.initialValue
                net.bytebuddy.implementation.bytecode.StackManipulation r3 = r5.initialValue
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L27
                return r1
            L27:
                java.util.List<net.bytebuddy.description.field.FieldDescription$InDefinedShape> r2 = r4.fieldDescriptions
                java.util.List<net.bytebuddy.description.field.FieldDescription$InDefinedShape> r3 = r5.fieldDescriptions
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L32
                return r1
            L32:
                net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r2 = r4.nonNullable
                net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r5 = r5.nonNullable
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L3d
                return r1
            L3d:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.implementation.bytecode.StackManipulation r1 = r2.initialValue
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r2.multiplier
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.util.List<net.bytebuddy.description.field.FieldDescription$InDefinedShape> r1 = r2.fieldDescriptions
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r1 = r2.nonNullable
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    public interface NullValueGuard {

        public enum NoOp extends java.lang.Enum<net.bytebuddy.implementation.HashCodeMethod.NullValueGuard.NoOp> implements net.bytebuddy.implementation.HashCodeMethod.NullValueGuard {
            private static final /* synthetic */ net.bytebuddy.implementation.HashCodeMethod.NullValueGuard.NoOp[] $VALUES = null;
            public static final net.bytebuddy.implementation.HashCodeMethod.NullValueGuard.NoOp INSTANCE = null;

            static {
                    net.bytebuddy.implementation.HashCodeMethod$NullValueGuard$NoOp r0 = new net.bytebuddy.implementation.HashCodeMethod$NullValueGuard$NoOp
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.implementation.HashCodeMethod.NullValueGuard.NoOp.INSTANCE = r0
                    net.bytebuddy.implementation.HashCodeMethod$NullValueGuard$NoOp[] r0 = new net.bytebuddy.implementation.HashCodeMethod.NullValueGuard.NoOp[]{r0}
                    net.bytebuddy.implementation.HashCodeMethod.NullValueGuard.NoOp.$VALUES = r0
                    return
            }

            NoOp(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.implementation.HashCodeMethod.NullValueGuard.NoOp valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.implementation.HashCodeMethod$NullValueGuard$NoOp> r0 = net.bytebuddy.implementation.HashCodeMethod.NullValueGuard.NoOp.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.implementation.HashCodeMethod$NullValueGuard$NoOp r1 = (net.bytebuddy.implementation.HashCodeMethod.NullValueGuard.NoOp) r1
                    return r1
            }

            public static net.bytebuddy.implementation.HashCodeMethod.NullValueGuard.NoOp[] values() {
                    net.bytebuddy.implementation.HashCodeMethod$NullValueGuard$NoOp[] r0 = net.bytebuddy.implementation.HashCodeMethod.NullValueGuard.NoOp.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.implementation.HashCodeMethod$NullValueGuard$NoOp[] r0 = (net.bytebuddy.implementation.HashCodeMethod.NullValueGuard.NoOp[]) r0
                    return r0
            }

            @Override // net.bytebuddy.implementation.HashCodeMethod.NullValueGuard
            public net.bytebuddy.implementation.bytecode.StackManipulation after() {
                    r1 = this;
                    net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r0 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
                    return r0
            }

            @Override // net.bytebuddy.implementation.HashCodeMethod.NullValueGuard
            public net.bytebuddy.implementation.bytecode.StackManipulation before() {
                    r1 = this;
                    net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r0 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
                    return r0
            }

            @Override // net.bytebuddy.implementation.HashCodeMethod.NullValueGuard
            public int getRequiredVariablePadding() {
                    r1 = this;
                    net.bytebuddy.implementation.bytecode.StackSize r0 = net.bytebuddy.implementation.bytecode.StackSize.ZERO
                    int r0 = r0.getSize()
                    return r0
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class UsingJump implements net.bytebuddy.implementation.HashCodeMethod.NullValueGuard {
            private final net.bytebuddy.description.method.MethodDescription instrumentedMethod;
            private final net.bytebuddy.jar.asm.Label label;

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
            public class AfterInstruction extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase {
                final /* synthetic */ net.bytebuddy.implementation.HashCodeMethod.NullValueGuard.UsingJump this$0;

                public AfterInstruction(net.bytebuddy.implementation.HashCodeMethod.NullValueGuard.UsingJump r1) {
                        r0 = this;
                        r0.this$0 = r1
                        r0.<init>()
                        return
                }

                @Override // net.bytebuddy.implementation.bytecode.StackManipulation
                public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r6, net.bytebuddy.implementation.Implementation.Context r7) {
                        r5 = this;
                        net.bytebuddy.implementation.HashCodeMethod$NullValueGuard$UsingJump r0 = r5.this$0
                        net.bytebuddy.jar.asm.Label r0 = net.bytebuddy.implementation.HashCodeMethod.NullValueGuard.UsingJump.access$300(r0)
                        r6.visitLabel(r0)
                        net.bytebuddy.implementation.Implementation$Context$FrameGeneration r0 = r7.getFrameGeneration()
                        java.lang.Class r1 = java.lang.Integer.TYPE
                        net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                        net.bytebuddy.description.type.TypeDescription r7 = r7.getInstrumentedType()
                        java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
                        net.bytebuddy.description.type.TypeDescription r2 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r2)
                        r3 = 2
                        net.bytebuddy.description.type.TypeDescription[] r3 = new net.bytebuddy.description.type.TypeDescription[r3]
                        r4 = 0
                        r3[r4] = r7
                        r7 = 1
                        r3[r7] = r2
                        java.util.List r7 = java.util.Arrays.asList(r3)
                        r0.same1(r6, r1, r7)
                        net.bytebuddy.implementation.bytecode.StackManipulation$Size r6 = net.bytebuddy.implementation.bytecode.StackManipulation.Size.ZERO
                        return r6
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
                        net.bytebuddy.implementation.HashCodeMethod$NullValueGuard$UsingJump r2 = r4.this$0
                        net.bytebuddy.implementation.HashCodeMethod$NullValueGuard$UsingJump$AfterInstruction r5 = (net.bytebuddy.implementation.HashCodeMethod.NullValueGuard.UsingJump.AfterInstruction) r5
                        net.bytebuddy.implementation.HashCodeMethod$NullValueGuard$UsingJump r5 = r5.this$0
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
                        net.bytebuddy.implementation.HashCodeMethod$NullValueGuard$UsingJump r1 = r2.this$0
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
            public class BeforeInstruction extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase {
                final /* synthetic */ net.bytebuddy.implementation.HashCodeMethod.NullValueGuard.UsingJump this$0;

                public BeforeInstruction(net.bytebuddy.implementation.HashCodeMethod.NullValueGuard.UsingJump r1) {
                        r0 = this;
                        r0.this$0 = r1
                        r0.<init>()
                        return
                }

                @Override // net.bytebuddy.implementation.bytecode.StackManipulation
                public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r3, net.bytebuddy.implementation.Implementation.Context r4) {
                        r2 = this;
                        net.bytebuddy.implementation.HashCodeMethod$NullValueGuard$UsingJump r4 = r2.this$0
                        net.bytebuddy.description.method.MethodDescription r4 = net.bytebuddy.implementation.HashCodeMethod.NullValueGuard.UsingJump.access$200(r4)
                        int r4 = r4.getStackSize()
                        r0 = 58
                        r3.visitVarInsn(r0, r4)
                        net.bytebuddy.implementation.HashCodeMethod$NullValueGuard$UsingJump r4 = r2.this$0
                        net.bytebuddy.description.method.MethodDescription r4 = net.bytebuddy.implementation.HashCodeMethod.NullValueGuard.UsingJump.access$200(r4)
                        int r4 = r4.getStackSize()
                        r0 = 25
                        r3.visitVarInsn(r0, r4)
                        net.bytebuddy.implementation.HashCodeMethod$NullValueGuard$UsingJump r4 = r2.this$0
                        net.bytebuddy.jar.asm.Label r4 = net.bytebuddy.implementation.HashCodeMethod.NullValueGuard.UsingJump.access$300(r4)
                        r1 = 198(0xc6, float:2.77E-43)
                        r3.visitJumpInsn(r1, r4)
                        net.bytebuddy.implementation.HashCodeMethod$NullValueGuard$UsingJump r4 = r2.this$0
                        net.bytebuddy.description.method.MethodDescription r4 = net.bytebuddy.implementation.HashCodeMethod.NullValueGuard.UsingJump.access$200(r4)
                        int r4 = r4.getStackSize()
                        r3.visitVarInsn(r0, r4)
                        net.bytebuddy.implementation.bytecode.StackManipulation$Size r3 = net.bytebuddy.implementation.bytecode.StackManipulation.Size.ZERO
                        return r3
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
                        net.bytebuddy.implementation.HashCodeMethod$NullValueGuard$UsingJump r2 = r4.this$0
                        net.bytebuddy.implementation.HashCodeMethod$NullValueGuard$UsingJump$BeforeInstruction r5 = (net.bytebuddy.implementation.HashCodeMethod.NullValueGuard.UsingJump.BeforeInstruction) r5
                        net.bytebuddy.implementation.HashCodeMethod$NullValueGuard$UsingJump r5 = r5.this$0
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
                        net.bytebuddy.implementation.HashCodeMethod$NullValueGuard$UsingJump r1 = r2.this$0
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }
            }

            public UsingJump(net.bytebuddy.description.method.MethodDescription r1) {
                    r0 = this;
                    r0.<init>()
                    r0.instrumentedMethod = r1
                    net.bytebuddy.jar.asm.Label r1 = new net.bytebuddy.jar.asm.Label
                    r1.<init>()
                    r0.label = r1
                    return
            }

            public static /* synthetic */ net.bytebuddy.description.method.MethodDescription access$200(net.bytebuddy.implementation.HashCodeMethod.NullValueGuard.UsingJump r0) {
                    net.bytebuddy.description.method.MethodDescription r0 = r0.instrumentedMethod
                    return r0
            }

            public static /* synthetic */ net.bytebuddy.jar.asm.Label access$300(net.bytebuddy.implementation.HashCodeMethod.NullValueGuard.UsingJump r0) {
                    net.bytebuddy.jar.asm.Label r0 = r0.label
                    return r0
            }

            @Override // net.bytebuddy.implementation.HashCodeMethod.NullValueGuard
            public net.bytebuddy.implementation.bytecode.StackManipulation after() {
                    r1 = this;
                    net.bytebuddy.implementation.HashCodeMethod$NullValueGuard$UsingJump$AfterInstruction r0 = new net.bytebuddy.implementation.HashCodeMethod$NullValueGuard$UsingJump$AfterInstruction
                    r0.<init>(r1)
                    return r0
            }

            @Override // net.bytebuddy.implementation.HashCodeMethod.NullValueGuard
            public net.bytebuddy.implementation.bytecode.StackManipulation before() {
                    r1 = this;
                    net.bytebuddy.implementation.HashCodeMethod$NullValueGuard$UsingJump$BeforeInstruction r0 = new net.bytebuddy.implementation.HashCodeMethod$NullValueGuard$UsingJump$BeforeInstruction
                    r0.<init>(r1)
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
                    net.bytebuddy.description.method.MethodDescription r2 = r4.instrumentedMethod
                    net.bytebuddy.implementation.HashCodeMethod$NullValueGuard$UsingJump r5 = (net.bytebuddy.implementation.HashCodeMethod.NullValueGuard.UsingJump) r5
                    net.bytebuddy.description.method.MethodDescription r3 = r5.instrumentedMethod
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.jar.asm.Label r2 = r4.label
                    net.bytebuddy.jar.asm.Label r5 = r5.label
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L2b
                    return r1
                L2b:
                    return r0
            }

            @Override // net.bytebuddy.implementation.HashCodeMethod.NullValueGuard
            public int getRequiredVariablePadding() {
                    r1 = this;
                    r0 = 1
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.description.method.MethodDescription r1 = r2.instrumentedMethod
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.jar.asm.Label r1 = r2.label
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }
        }

        net.bytebuddy.implementation.bytecode.StackManipulation after();

        net.bytebuddy.implementation.bytecode.StackManipulation before();

        int getRequiredVariablePadding();
    }

    public interface OffsetProvider {

        public enum ForDynamicTypeHash extends java.lang.Enum<net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForDynamicTypeHash> implements net.bytebuddy.implementation.HashCodeMethod.OffsetProvider {
            private static final /* synthetic */ net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForDynamicTypeHash[] $VALUES = null;
            public static final net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForDynamicTypeHash INSTANCE = null;

            static {
                    net.bytebuddy.implementation.HashCodeMethod$OffsetProvider$ForDynamicTypeHash r0 = new net.bytebuddy.implementation.HashCodeMethod$OffsetProvider$ForDynamicTypeHash
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForDynamicTypeHash.INSTANCE = r0
                    net.bytebuddy.implementation.HashCodeMethod$OffsetProvider$ForDynamicTypeHash[] r0 = new net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForDynamicTypeHash[]{r0}
                    net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForDynamicTypeHash.$VALUES = r0
                    return
            }

            ForDynamicTypeHash(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForDynamicTypeHash valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.implementation.HashCodeMethod$OffsetProvider$ForDynamicTypeHash> r0 = net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForDynamicTypeHash.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.implementation.HashCodeMethod$OffsetProvider$ForDynamicTypeHash r1 = (net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForDynamicTypeHash) r1
                    return r1
            }

            public static net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForDynamicTypeHash[] values() {
                    net.bytebuddy.implementation.HashCodeMethod$OffsetProvider$ForDynamicTypeHash[] r0 = net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForDynamicTypeHash.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.implementation.HashCodeMethod$OffsetProvider$ForDynamicTypeHash[] r0 = (net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForDynamicTypeHash[]) r0
                    return r0
            }

            @Override // net.bytebuddy.implementation.HashCodeMethod.OffsetProvider
            public net.bytebuddy.implementation.bytecode.StackManipulation resolve(net.bytebuddy.description.type.TypeDescription r6) {
                    r5 = this;
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = net.bytebuddy.implementation.HashCodeMethod.access$100()
                    net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r2 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r2)
                    net.bytebuddy.implementation.bytecode.StackManipulation r6 = r2.virtual(r6)
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = net.bytebuddy.implementation.HashCodeMethod.access$000()
                    net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r2 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r2)
                    java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
                    net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r3)
                    net.bytebuddy.implementation.bytecode.StackManipulation r2 = r2.virtual(r3)
                    r3 = 3
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r3 = new net.bytebuddy.implementation.bytecode.StackManipulation[r3]
                    r4 = 0
                    r3[r4] = r1
                    r1 = 1
                    r3[r1] = r6
                    r6 = 2
                    r3[r6] = r2
                    r0.<init>(r3)
                    return r0
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForFixedValue implements net.bytebuddy.implementation.HashCodeMethod.OffsetProvider {
            private final int value;

            public ForFixedValue(int r1) {
                    r0 = this;
                    r0.<init>()
                    r0.value = r1
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
                    int r2 = r4.value
                    net.bytebuddy.implementation.HashCodeMethod$OffsetProvider$ForFixedValue r5 = (net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForFixedValue) r5
                    int r5 = r5.value
                    if (r2 == r5) goto L1c
                    return r1
                L1c:
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    int r1 = r2.value
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.HashCodeMethod.OffsetProvider
            public net.bytebuddy.implementation.bytecode.StackManipulation resolve(net.bytebuddy.description.type.TypeDescription r1) {
                    r0 = this;
                    int r1 = r0.value
                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.forValue(r1)
                    return r1
            }
        }

        public enum ForStaticTypeHash extends java.lang.Enum<net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForStaticTypeHash> implements net.bytebuddy.implementation.HashCodeMethod.OffsetProvider {
            private static final /* synthetic */ net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForStaticTypeHash[] $VALUES = null;
            public static final net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForStaticTypeHash INSTANCE = null;

            static {
                    net.bytebuddy.implementation.HashCodeMethod$OffsetProvider$ForStaticTypeHash r0 = new net.bytebuddy.implementation.HashCodeMethod$OffsetProvider$ForStaticTypeHash
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForStaticTypeHash.INSTANCE = r0
                    net.bytebuddy.implementation.HashCodeMethod$OffsetProvider$ForStaticTypeHash[] r0 = new net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForStaticTypeHash[]{r0}
                    net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForStaticTypeHash.$VALUES = r0
                    return
            }

            ForStaticTypeHash(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForStaticTypeHash valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.implementation.HashCodeMethod$OffsetProvider$ForStaticTypeHash> r0 = net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForStaticTypeHash.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.implementation.HashCodeMethod$OffsetProvider$ForStaticTypeHash r1 = (net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForStaticTypeHash) r1
                    return r1
            }

            public static net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForStaticTypeHash[] values() {
                    net.bytebuddy.implementation.HashCodeMethod$OffsetProvider$ForStaticTypeHash[] r0 = net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForStaticTypeHash.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.implementation.HashCodeMethod$OffsetProvider$ForStaticTypeHash[] r0 = (net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForStaticTypeHash[]) r0
                    return r0
            }

            @Override // net.bytebuddy.implementation.HashCodeMethod.OffsetProvider
            public net.bytebuddy.implementation.bytecode.StackManipulation resolve(net.bytebuddy.description.type.TypeDescription r5) {
                    r4 = this;
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    net.bytebuddy.implementation.bytecode.StackManipulation r5 = net.bytebuddy.implementation.bytecode.constant.ClassConstant.of(r5)
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = net.bytebuddy.implementation.HashCodeMethod.access$000()
                    net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r1 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r1)
                    java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
                    net.bytebuddy.description.type.TypeDescription r2 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r2)
                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = r1.virtual(r2)
                    r2 = 2
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r2 = new net.bytebuddy.implementation.bytecode.StackManipulation[r2]
                    r3 = 0
                    r2[r3] = r5
                    r5 = 1
                    r2[r5] = r1
                    r0.<init>(r2)
                    return r0
            }
        }

        public enum ForSuperMethodCall extends java.lang.Enum<net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForSuperMethodCall> implements net.bytebuddy.implementation.HashCodeMethod.OffsetProvider {
            private static final /* synthetic */ net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForSuperMethodCall[] $VALUES = null;
            public static final net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForSuperMethodCall INSTANCE = null;

            static {
                    net.bytebuddy.implementation.HashCodeMethod$OffsetProvider$ForSuperMethodCall r0 = new net.bytebuddy.implementation.HashCodeMethod$OffsetProvider$ForSuperMethodCall
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForSuperMethodCall.INSTANCE = r0
                    net.bytebuddy.implementation.HashCodeMethod$OffsetProvider$ForSuperMethodCall[] r0 = new net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForSuperMethodCall[]{r0}
                    net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForSuperMethodCall.$VALUES = r0
                    return
            }

            ForSuperMethodCall(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForSuperMethodCall valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.implementation.HashCodeMethod$OffsetProvider$ForSuperMethodCall> r0 = net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForSuperMethodCall.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.implementation.HashCodeMethod$OffsetProvider$ForSuperMethodCall r1 = (net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForSuperMethodCall) r1
                    return r1
            }

            public static net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForSuperMethodCall[] values() {
                    net.bytebuddy.implementation.HashCodeMethod$OffsetProvider$ForSuperMethodCall[] r0 = net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForSuperMethodCall.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.implementation.HashCodeMethod$OffsetProvider$ForSuperMethodCall[] r0 = (net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForSuperMethodCall[]) r0
                    return r0
            }

            @Override // net.bytebuddy.implementation.HashCodeMethod.OffsetProvider
            public net.bytebuddy.implementation.bytecode.StackManipulation resolve(net.bytebuddy.description.type.TypeDescription r5) {
                    r4 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r5.getSuperClass()
                    if (r0 == 0) goto L29
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r5 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = net.bytebuddy.implementation.HashCodeMethod.access$000()
                    net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r2 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r2)
                    net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                    net.bytebuddy.implementation.bytecode.StackManipulation r0 = r2.special(r0)
                    r2 = 2
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r2 = new net.bytebuddy.implementation.bytecode.StackManipulation[r2]
                    r3 = 0
                    r2[r3] = r1
                    r1 = 1
                    r2[r1] = r0
                    r5.<init>(r2)
                    return r5
                L29:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    r1.append(r5)
                    java.lang.String r5 = " does not declare a super class"
                    r1.append(r5)
                    java.lang.String r5 = r1.toString()
                    r0.<init>(r5)
                    throw r0
            }
        }

        net.bytebuddy.implementation.bytecode.StackManipulation resolve(net.bytebuddy.description.type.TypeDescription r1);
    }

    public enum ValueTransformer extends java.lang.Enum<net.bytebuddy.implementation.HashCodeMethod.ValueTransformer> implements net.bytebuddy.implementation.bytecode.StackManipulation {
        private static final /* synthetic */ net.bytebuddy.implementation.HashCodeMethod.ValueTransformer[] $VALUES = null;
        public static final net.bytebuddy.implementation.HashCodeMethod.ValueTransformer BOOLEAN_ARRAY = null;
        public static final net.bytebuddy.implementation.HashCodeMethod.ValueTransformer BYTE_ARRAY = null;
        public static final net.bytebuddy.implementation.HashCodeMethod.ValueTransformer CHARACTER_ARRAY = null;
        public static final net.bytebuddy.implementation.HashCodeMethod.ValueTransformer DOUBLE = null;
        public static final net.bytebuddy.implementation.HashCodeMethod.ValueTransformer DOUBLE_ARRAY = null;
        public static final net.bytebuddy.implementation.HashCodeMethod.ValueTransformer FLOAT = null;
        public static final net.bytebuddy.implementation.HashCodeMethod.ValueTransformer FLOAT_ARRAY = null;
        public static final net.bytebuddy.implementation.HashCodeMethod.ValueTransformer INTEGER_ARRAY = null;
        public static final net.bytebuddy.implementation.HashCodeMethod.ValueTransformer LONG = null;
        public static final net.bytebuddy.implementation.HashCodeMethod.ValueTransformer LONG_ARRAY = null;
        public static final net.bytebuddy.implementation.HashCodeMethod.ValueTransformer NESTED_ARRAY = null;
        public static final net.bytebuddy.implementation.HashCodeMethod.ValueTransformer REFERENCE_ARRAY = null;
        public static final net.bytebuddy.implementation.HashCodeMethod.ValueTransformer SHORT_ARRAY = null;














        static {
                net.bytebuddy.implementation.HashCodeMethod$ValueTransformer$1 r0 = new net.bytebuddy.implementation.HashCodeMethod$ValueTransformer$1
                java.lang.String r1 = "LONG"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.HashCodeMethod.ValueTransformer.LONG = r0
                net.bytebuddy.implementation.HashCodeMethod$ValueTransformer$2 r1 = new net.bytebuddy.implementation.HashCodeMethod$ValueTransformer$2
                java.lang.String r3 = "FLOAT"
                r4 = 1
                r1.<init>(r3, r4)
                net.bytebuddy.implementation.HashCodeMethod.ValueTransformer.FLOAT = r1
                net.bytebuddy.implementation.HashCodeMethod$ValueTransformer$3 r3 = new net.bytebuddy.implementation.HashCodeMethod$ValueTransformer$3
                java.lang.String r5 = "DOUBLE"
                r6 = 2
                r3.<init>(r5, r6)
                net.bytebuddy.implementation.HashCodeMethod.ValueTransformer.DOUBLE = r3
                net.bytebuddy.implementation.HashCodeMethod$ValueTransformer$4 r5 = new net.bytebuddy.implementation.HashCodeMethod$ValueTransformer$4
                java.lang.String r7 = "BOOLEAN_ARRAY"
                r8 = 3
                r5.<init>(r7, r8)
                net.bytebuddy.implementation.HashCodeMethod.ValueTransformer.BOOLEAN_ARRAY = r5
                net.bytebuddy.implementation.HashCodeMethod$ValueTransformer$5 r7 = new net.bytebuddy.implementation.HashCodeMethod$ValueTransformer$5
                java.lang.String r9 = "BYTE_ARRAY"
                r10 = 4
                r7.<init>(r9, r10)
                net.bytebuddy.implementation.HashCodeMethod.ValueTransformer.BYTE_ARRAY = r7
                net.bytebuddy.implementation.HashCodeMethod$ValueTransformer$6 r9 = new net.bytebuddy.implementation.HashCodeMethod$ValueTransformer$6
                java.lang.String r11 = "SHORT_ARRAY"
                r12 = 5
                r9.<init>(r11, r12)
                net.bytebuddy.implementation.HashCodeMethod.ValueTransformer.SHORT_ARRAY = r9
                net.bytebuddy.implementation.HashCodeMethod$ValueTransformer$7 r11 = new net.bytebuddy.implementation.HashCodeMethod$ValueTransformer$7
                java.lang.String r13 = "CHARACTER_ARRAY"
                r14 = 6
                r11.<init>(r13, r14)
                net.bytebuddy.implementation.HashCodeMethod.ValueTransformer.CHARACTER_ARRAY = r11
                net.bytebuddy.implementation.HashCodeMethod$ValueTransformer$8 r13 = new net.bytebuddy.implementation.HashCodeMethod$ValueTransformer$8
                java.lang.String r15 = "INTEGER_ARRAY"
                r14 = 7
                r13.<init>(r15, r14)
                net.bytebuddy.implementation.HashCodeMethod.ValueTransformer.INTEGER_ARRAY = r13
                net.bytebuddy.implementation.HashCodeMethod$ValueTransformer$9 r15 = new net.bytebuddy.implementation.HashCodeMethod$ValueTransformer$9
                java.lang.String r14 = "LONG_ARRAY"
                r12 = 8
                r15.<init>(r14, r12)
                net.bytebuddy.implementation.HashCodeMethod.ValueTransformer.LONG_ARRAY = r15
                net.bytebuddy.implementation.HashCodeMethod$ValueTransformer$10 r14 = new net.bytebuddy.implementation.HashCodeMethod$ValueTransformer$10
                java.lang.String r12 = "FLOAT_ARRAY"
                r10 = 9
                r14.<init>(r12, r10)
                net.bytebuddy.implementation.HashCodeMethod.ValueTransformer.FLOAT_ARRAY = r14
                net.bytebuddy.implementation.HashCodeMethod$ValueTransformer$11 r12 = new net.bytebuddy.implementation.HashCodeMethod$ValueTransformer$11
                java.lang.String r10 = "DOUBLE_ARRAY"
                r8 = 10
                r12.<init>(r10, r8)
                net.bytebuddy.implementation.HashCodeMethod.ValueTransformer.DOUBLE_ARRAY = r12
                net.bytebuddy.implementation.HashCodeMethod$ValueTransformer$12 r10 = new net.bytebuddy.implementation.HashCodeMethod$ValueTransformer$12
                java.lang.String r8 = "REFERENCE_ARRAY"
                r6 = 11
                r10.<init>(r8, r6)
                net.bytebuddy.implementation.HashCodeMethod.ValueTransformer.REFERENCE_ARRAY = r10
                net.bytebuddy.implementation.HashCodeMethod$ValueTransformer$13 r8 = new net.bytebuddy.implementation.HashCodeMethod$ValueTransformer$13
                java.lang.String r6 = "NESTED_ARRAY"
                r4 = 12
                r8.<init>(r6, r4)
                net.bytebuddy.implementation.HashCodeMethod.ValueTransformer.NESTED_ARRAY = r8
                r6 = 13
                net.bytebuddy.implementation.HashCodeMethod$ValueTransformer[] r6 = new net.bytebuddy.implementation.HashCodeMethod.ValueTransformer[r6]
                r6[r2] = r0
                r0 = 1
                r6[r0] = r1
                r0 = 2
                r6[r0] = r3
                r0 = 3
                r6[r0] = r5
                r0 = 4
                r6[r0] = r7
                r0 = 5
                r6[r0] = r9
                r0 = 6
                r6[r0] = r11
                r0 = 7
                r6[r0] = r13
                r0 = 8
                r6[r0] = r15
                r0 = 9
                r6[r0] = r14
                r0 = 10
                r6[r0] = r12
                r0 = 11
                r6[r0] = r10
                r6[r4] = r8
                net.bytebuddy.implementation.HashCodeMethod.ValueTransformer.$VALUES = r6
                return
        }

        ValueTransformer(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ ValueTransformer(java.lang.String r1, int r2, net.bytebuddy.implementation.HashCodeMethod.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public static net.bytebuddy.implementation.bytecode.StackManipulation of(net.bytebuddy.description.type.TypeDefinition r1) {
                java.lang.Class r0 = java.lang.Boolean.TYPE
                boolean r0 = r1.represents(r0)
                if (r0 != 0) goto Lca
                java.lang.Class r0 = java.lang.Byte.TYPE
                boolean r0 = r1.represents(r0)
                if (r0 != 0) goto Lca
                java.lang.Class r0 = java.lang.Short.TYPE
                boolean r0 = r1.represents(r0)
                if (r0 != 0) goto Lca
                java.lang.Class r0 = java.lang.Character.TYPE
                boolean r0 = r1.represents(r0)
                if (r0 != 0) goto Lca
                java.lang.Class r0 = java.lang.Integer.TYPE
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L2a
                goto Lca
            L2a:
                java.lang.Class r0 = java.lang.Long.TYPE
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L35
                net.bytebuddy.implementation.HashCodeMethod$ValueTransformer r1 = net.bytebuddy.implementation.HashCodeMethod.ValueTransformer.LONG
                return r1
            L35:
                java.lang.Class r0 = java.lang.Float.TYPE
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L40
                net.bytebuddy.implementation.HashCodeMethod$ValueTransformer r1 = net.bytebuddy.implementation.HashCodeMethod.ValueTransformer.FLOAT
                return r1
            L40:
                java.lang.Class r0 = java.lang.Double.TYPE
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L4b
                net.bytebuddy.implementation.HashCodeMethod$ValueTransformer r1 = net.bytebuddy.implementation.HashCodeMethod.ValueTransformer.DOUBLE
                return r1
            L4b:
                java.lang.Class<boolean[]> r0 = boolean[].class
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L56
                net.bytebuddy.implementation.HashCodeMethod$ValueTransformer r1 = net.bytebuddy.implementation.HashCodeMethod.ValueTransformer.BOOLEAN_ARRAY
                return r1
            L56:
                java.lang.Class<byte[]> r0 = byte[].class
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L61
                net.bytebuddy.implementation.HashCodeMethod$ValueTransformer r1 = net.bytebuddy.implementation.HashCodeMethod.ValueTransformer.BYTE_ARRAY
                return r1
            L61:
                java.lang.Class<short[]> r0 = short[].class
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L6c
                net.bytebuddy.implementation.HashCodeMethod$ValueTransformer r1 = net.bytebuddy.implementation.HashCodeMethod.ValueTransformer.SHORT_ARRAY
                return r1
            L6c:
                java.lang.Class<char[]> r0 = char[].class
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L77
                net.bytebuddy.implementation.HashCodeMethod$ValueTransformer r1 = net.bytebuddy.implementation.HashCodeMethod.ValueTransformer.CHARACTER_ARRAY
                return r1
            L77:
                java.lang.Class<int[]> r0 = int[].class
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L82
                net.bytebuddy.implementation.HashCodeMethod$ValueTransformer r1 = net.bytebuddy.implementation.HashCodeMethod.ValueTransformer.INTEGER_ARRAY
                return r1
            L82:
                java.lang.Class<long[]> r0 = long[].class
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L8d
                net.bytebuddy.implementation.HashCodeMethod$ValueTransformer r1 = net.bytebuddy.implementation.HashCodeMethod.ValueTransformer.LONG_ARRAY
                return r1
            L8d:
                java.lang.Class<float[]> r0 = float[].class
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L98
                net.bytebuddy.implementation.HashCodeMethod$ValueTransformer r1 = net.bytebuddy.implementation.HashCodeMethod.ValueTransformer.FLOAT_ARRAY
                return r1
            L98:
                java.lang.Class<double[]> r0 = double[].class
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto La3
                net.bytebuddy.implementation.HashCodeMethod$ValueTransformer r1 = net.bytebuddy.implementation.HashCodeMethod.ValueTransformer.DOUBLE_ARRAY
                return r1
            La3:
                boolean r0 = r1.isArray()
                if (r0 == 0) goto Lb9
                net.bytebuddy.description.type.TypeDefinition r1 = r1.getComponentType()
                boolean r1 = r1.isArray()
                if (r1 == 0) goto Lb6
                net.bytebuddy.implementation.HashCodeMethod$ValueTransformer r1 = net.bytebuddy.implementation.HashCodeMethod.ValueTransformer.NESTED_ARRAY
                goto Lb8
            Lb6:
                net.bytebuddy.implementation.HashCodeMethod$ValueTransformer r1 = net.bytebuddy.implementation.HashCodeMethod.ValueTransformer.REFERENCE_ARRAY
            Lb8:
                return r1
            Lb9:
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.implementation.HashCodeMethod.access$000()
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r0 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r0)
                net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                net.bytebuddy.implementation.bytecode.StackManipulation r1 = r0.virtual(r1)
                return r1
            Lca:
                net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r1 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
                return r1
        }

        public static net.bytebuddy.implementation.HashCodeMethod.ValueTransformer valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.HashCodeMethod$ValueTransformer> r0 = net.bytebuddy.implementation.HashCodeMethod.ValueTransformer.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.HashCodeMethod$ValueTransformer r1 = (net.bytebuddy.implementation.HashCodeMethod.ValueTransformer) r1
                return r1
        }

        public static net.bytebuddy.implementation.HashCodeMethod.ValueTransformer[] values() {
                net.bytebuddy.implementation.HashCodeMethod$ValueTransformer[] r0 = net.bytebuddy.implementation.HashCodeMethod.ValueTransformer.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.HashCodeMethod$ValueTransformer[] r0 = (net.bytebuddy.implementation.HashCodeMethod.ValueTransformer[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
            net.bytebuddy.description.method.MethodList r1 = r1.getDeclaredMethods()
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.isHashCode()
            net.bytebuddy.matcher.FilterableList r1 = r1.filter(r2)
            net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
            java.lang.Object r1 = r1.getOnly()
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
            net.bytebuddy.implementation.HashCodeMethod.HASH_CODE = r1
            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
            net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
            java.lang.String r1 = "getClass"
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
            r2 = 0
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.takesArguments(r2)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = r1.and(r2)
            net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
            net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
            java.lang.Object r0 = r0.getOnly()
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
            net.bytebuddy.implementation.HashCodeMethod.GET_CLASS = r0
            return
    }

    public HashCodeMethod(net.bytebuddy.implementation.HashCodeMethod.OffsetProvider r4) {
            r3 = this;
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.none()
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.none()
            r2 = 31
            r3.<init>(r4, r2, r0, r1)
            return
    }

    private HashCodeMethod(net.bytebuddy.implementation.HashCodeMethod.OffsetProvider r1, int r2, net.bytebuddy.matcher.ElementMatcher.Junction<? super net.bytebuddy.description.field.FieldDescription.InDefinedShape> r3, net.bytebuddy.matcher.ElementMatcher.Junction<? super net.bytebuddy.description.field.FieldDescription.InDefinedShape> r4) {
            r0 = this;
            r0.<init>()
            r0.offsetProvider = r1
            r0.multiplier = r2
            r0.ignored = r3
            r0.nonNullable = r4
            return
    }

    public static /* synthetic */ net.bytebuddy.description.method.MethodDescription.InDefinedShape access$000() {
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.implementation.HashCodeMethod.HASH_CODE
            return r0
    }

    public static /* synthetic */ net.bytebuddy.description.method.MethodDescription.InDefinedShape access$100() {
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.implementation.HashCodeMethod.GET_CLASS
            return r0
    }

    public static net.bytebuddy.implementation.HashCodeMethod usingDefaultOffset() {
            r0 = 17
            net.bytebuddy.implementation.HashCodeMethod r0 = usingOffset(r0)
            return r0
    }

    public static net.bytebuddy.implementation.HashCodeMethod usingOffset(int r2) {
            net.bytebuddy.implementation.HashCodeMethod r0 = new net.bytebuddy.implementation.HashCodeMethod
            net.bytebuddy.implementation.HashCodeMethod$OffsetProvider$ForFixedValue r1 = new net.bytebuddy.implementation.HashCodeMethod$OffsetProvider$ForFixedValue
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public static net.bytebuddy.implementation.HashCodeMethod usingSuperClassOffset() {
            net.bytebuddy.implementation.HashCodeMethod r0 = new net.bytebuddy.implementation.HashCodeMethod
            net.bytebuddy.implementation.HashCodeMethod$OffsetProvider$ForSuperMethodCall r1 = net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForSuperMethodCall.INSTANCE
            r0.<init>(r1)
            return r0
    }

    public static net.bytebuddy.implementation.HashCodeMethod usingTypeHashOffset(boolean r1) {
            net.bytebuddy.implementation.HashCodeMethod r0 = new net.bytebuddy.implementation.HashCodeMethod
            if (r1 == 0) goto L7
            net.bytebuddy.implementation.HashCodeMethod$OffsetProvider$ForDynamicTypeHash r1 = net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForDynamicTypeHash.INSTANCE
            goto L9
        L7:
            net.bytebuddy.implementation.HashCodeMethod$OffsetProvider$ForStaticTypeHash r1 = net.bytebuddy.implementation.HashCodeMethod.OffsetProvider.ForStaticTypeHash.INSTANCE
        L9:
            r0.<init>(r1)
            return r0
    }

    @Override // net.bytebuddy.implementation.Implementation
    public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r6) {
            r5 = this;
            net.bytebuddy.description.type.TypeDescription r0 = r6.getInstrumentedType()
            boolean r0 = r0.isInterface()
            if (r0 != 0) goto L38
            net.bytebuddy.implementation.HashCodeMethod$Appender r0 = new net.bytebuddy.implementation.HashCodeMethod$Appender
            net.bytebuddy.implementation.HashCodeMethod$OffsetProvider r1 = r5.offsetProvider
            net.bytebuddy.description.type.TypeDescription r2 = r6.getInstrumentedType()
            net.bytebuddy.implementation.bytecode.StackManipulation r1 = r1.resolve(r2)
            int r2 = r5.multiplier
            net.bytebuddy.description.type.TypeDescription r6 = r6.getInstrumentedType()
            net.bytebuddy.description.field.FieldList r6 = r6.getDeclaredFields()
            net.bytebuddy.matcher.ElementMatcher$Junction r3 = net.bytebuddy.matcher.ElementMatchers.isStatic()
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r4 = r5.ignored
            net.bytebuddy.matcher.ElementMatcher$Junction r3 = r3.or(r4)
            net.bytebuddy.matcher.ElementMatcher$Junction r3 = net.bytebuddy.matcher.ElementMatchers.not(r3)
            net.bytebuddy.matcher.FilterableList r6 = r6.filter(r3)
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r3 = r5.nonNullable
            r0.<init>(r1, r2, r6, r3)
            return r0
        L38:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot implement meaningful hash code method for "
            r1.append(r2)
            net.bytebuddy.description.type.TypeDescription r6 = r6.getInstrumentedType()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
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
            int r2 = r4.multiplier
            net.bytebuddy.implementation.HashCodeMethod r5 = (net.bytebuddy.implementation.HashCodeMethod) r5
            int r3 = r5.multiplier
            if (r2 == r3) goto L1c
            return r1
        L1c:
            net.bytebuddy.implementation.HashCodeMethod$OffsetProvider r2 = r4.offsetProvider
            net.bytebuddy.implementation.HashCodeMethod$OffsetProvider r3 = r5.offsetProvider
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L27
            return r1
        L27:
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r2 = r4.ignored
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r3 = r5.ignored
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L32
            return r1
        L32:
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r2 = r4.nonNullable
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r5 = r5.nonNullable
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L3d
            return r1
        L3d:
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            net.bytebuddy.implementation.HashCodeMethod$OffsetProvider r1 = r2.offsetProvider
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.multiplier
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r1 = r2.ignored
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r1 = r2.nonNullable
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
    public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
            r0 = this;
            return r1
    }

    public net.bytebuddy.implementation.HashCodeMethod withIgnoredFields(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription.InDefinedShape> r5) {
            r4 = this;
            net.bytebuddy.implementation.HashCodeMethod r0 = new net.bytebuddy.implementation.HashCodeMethod
            net.bytebuddy.implementation.HashCodeMethod$OffsetProvider r1 = r4.offsetProvider
            int r2 = r4.multiplier
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r3 = r4.ignored
            net.bytebuddy.matcher.ElementMatcher$Junction r5 = r3.or(r5)
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r3 = r4.nonNullable
            r0.<init>(r1, r2, r5, r3)
            return r0
    }

    public net.bytebuddy.implementation.Implementation withMultiplier(int r5) {
            r4 = this;
            if (r5 == 0) goto Le
            net.bytebuddy.implementation.HashCodeMethod r0 = new net.bytebuddy.implementation.HashCodeMethod
            net.bytebuddy.implementation.HashCodeMethod$OffsetProvider r1 = r4.offsetProvider
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r2 = r4.ignored
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r3 = r4.nonNullable
            r0.<init>(r1, r5, r2, r3)
            return r0
        Le:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Hash code multiplier must not be zero"
            r5.<init>(r0)
            throw r5
    }

    public net.bytebuddy.implementation.HashCodeMethod withNonNullableFields(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription.InDefinedShape> r6) {
            r5 = this;
            net.bytebuddy.implementation.HashCodeMethod r0 = new net.bytebuddy.implementation.HashCodeMethod
            net.bytebuddy.implementation.HashCodeMethod$OffsetProvider r1 = r5.offsetProvider
            int r2 = r5.multiplier
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r3 = r5.ignored
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r4 = r5.nonNullable
            net.bytebuddy.matcher.ElementMatcher$Junction r6 = r4.or(r6)
            r0.<init>(r1, r2, r3, r6)
            return r0
    }
}
