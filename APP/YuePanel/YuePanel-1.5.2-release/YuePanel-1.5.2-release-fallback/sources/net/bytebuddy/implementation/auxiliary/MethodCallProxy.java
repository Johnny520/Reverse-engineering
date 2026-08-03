package net.bytebuddy.implementation.auxiliary;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class MethodCallProxy implements net.bytebuddy.implementation.auxiliary.AuxiliaryType {
    private static final java.lang.String FIELD_NAME_PREFIX = "argument";
    private final net.bytebuddy.implementation.bytecode.assign.Assigner assigner;
    private final boolean serializableProxy;
    private final net.bytebuddy.implementation.Implementation.SpecialMethodInvocation specialMethodInvocation;

    /* JADX INFO: renamed from: net.bytebuddy.implementation.auxiliary.MethodCallProxy$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class AssignableSignatureCall extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase {
        private final boolean serializable;
        private final net.bytebuddy.implementation.Implementation.SpecialMethodInvocation specialMethodInvocation;

        public AssignableSignatureCall(net.bytebuddy.implementation.Implementation.SpecialMethodInvocation r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.specialMethodInvocation = r1
                r0.serializable = r2
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r7, net.bytebuddy.implementation.Implementation.Context r8) {
                r6 = this;
                net.bytebuddy.implementation.auxiliary.MethodCallProxy r0 = new net.bytebuddy.implementation.auxiliary.MethodCallProxy
                net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r1 = r6.specialMethodInvocation
                boolean r2 = r6.serializable
                r0.<init>(r1, r2)
                net.bytebuddy.description.type.TypeDescription r0 = r8.register(r0)
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r1 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.TypeCreation.of(r0)
                net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r3 = r6.specialMethodInvocation
                net.bytebuddy.description.method.MethodDescription r3 = r3.getMethodDescription()
                net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$MethodLoading r3 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.allArgumentsOf(r3)
                net.bytebuddy.implementation.bytecode.StackManipulation r3 = r3.prependThisReference()
                net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                net.bytebuddy.matcher.ElementMatcher$Junction r4 = net.bytebuddy.matcher.ElementMatchers.isConstructor()
                net.bytebuddy.matcher.FilterableList r0 = r0.filter(r4)
                net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                java.lang.Object r0 = r0.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r0 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r0)
                r4 = 4
                net.bytebuddy.implementation.bytecode.StackManipulation[] r4 = new net.bytebuddy.implementation.bytecode.StackManipulation[r4]
                r5 = 0
                r4[r5] = r2
                net.bytebuddy.implementation.bytecode.Duplication r2 = net.bytebuddy.implementation.bytecode.Duplication.SINGLE
                r5 = 1
                r4[r5] = r2
                r2 = 2
                r4[r2] = r3
                r2 = 3
                r4[r2] = r0
                r1.<init>(r4)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r7 = r1.apply(r7, r8)
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
                boolean r2 = r4.serializable
                net.bytebuddy.implementation.auxiliary.MethodCallProxy$AssignableSignatureCall r5 = (net.bytebuddy.implementation.auxiliary.MethodCallProxy.AssignableSignatureCall) r5
                boolean r3 = r5.serializable
                if (r2 == r3) goto L1c
                return r1
            L1c:
                net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r2 = r4.specialMethodInvocation
                net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r5 = r5.specialMethodInvocation
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
                net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r1 = r2.specialMethodInvocation
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                boolean r1 = r2.serializable
                int r0 = r0 + r1
                return r0
        }
    }

    public enum ConstructorCall extends java.lang.Enum<net.bytebuddy.implementation.auxiliary.MethodCallProxy.ConstructorCall> implements net.bytebuddy.implementation.Implementation {
        private static final /* synthetic */ net.bytebuddy.implementation.auxiliary.MethodCallProxy.ConstructorCall[] $VALUES = null;
        public static final net.bytebuddy.implementation.auxiliary.MethodCallProxy.ConstructorCall INSTANCE = null;
        private final net.bytebuddy.description.method.MethodDescription objectTypeDefaultConstructor;

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Appender implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
            private final net.bytebuddy.description.type.TypeDescription instrumentedType;

            private Appender(net.bytebuddy.description.type.TypeDescription r1) {
                    r0 = this;
                    r0.<init>()
                    r0.instrumentedType = r1
                    return
            }

            public /* synthetic */ Appender(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.implementation.auxiliary.MethodCallProxy.AnonymousClass1 r2) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
            public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r13, net.bytebuddy.implementation.Implementation.Context r14, net.bytebuddy.description.method.MethodDescription r15) {
                    r12 = this;
                    r0 = 2
                    r1 = 3
                    r2 = 1
                    net.bytebuddy.description.type.TypeDescription r3 = r12.instrumentedType
                    net.bytebuddy.description.field.FieldList r3 = r3.getDeclaredFields()
                    int r4 = r3.size()
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r4 = new net.bytebuddy.implementation.bytecode.StackManipulation[r4]
                    java.util.Iterator r3 = r3.iterator()
                    r5 = 0
                    r6 = r5
                L15:
                    boolean r7 = r3.hasNext()
                    if (r7 == 0) goto L4c
                    java.lang.Object r7 = r3.next()
                    net.bytebuddy.description.field.FieldDescription r7 = (net.bytebuddy.description.field.FieldDescription) r7
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r8 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    net.bytebuddy.implementation.bytecode.StackManipulation r9 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                    net.bytebuddy.description.method.ParameterList r10 = r15.getParameters()
                    java.lang.Object r10 = r10.get(r6)
                    net.bytebuddy.description.method.ParameterDescription r10 = (net.bytebuddy.description.method.ParameterDescription) r10
                    net.bytebuddy.implementation.bytecode.StackManipulation r10 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.load(r10)
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r7 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r7)
                    net.bytebuddy.implementation.bytecode.StackManipulation r7 = r7.write()
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r11 = new net.bytebuddy.implementation.bytecode.StackManipulation[r1]
                    r11[r5] = r9
                    r11[r2] = r10
                    r11[r0] = r7
                    r8.<init>(r11)
                    r4[r6] = r8
                    int r6 = r6 + r2
                    goto L15
                L4c:
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r3 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    net.bytebuddy.implementation.bytecode.StackManipulation r6 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                    net.bytebuddy.implementation.auxiliary.MethodCallProxy$ConstructorCall r7 = net.bytebuddy.implementation.auxiliary.MethodCallProxy.ConstructorCall.INSTANCE
                    net.bytebuddy.description.method.MethodDescription r7 = net.bytebuddy.implementation.auxiliary.MethodCallProxy.ConstructorCall.access$100(r7)
                    net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r7 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r7)
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r8 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    r8.<init>(r4)
                    r4 = 4
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r4 = new net.bytebuddy.implementation.bytecode.StackManipulation[r4]
                    r4[r5] = r6
                    r4[r2] = r7
                    r4[r0] = r8
                    net.bytebuddy.implementation.bytecode.member.MethodReturn r0 = net.bytebuddy.implementation.bytecode.member.MethodReturn.VOID
                    r4[r1] = r0
                    r3.<init>(r4)
                    net.bytebuddy.implementation.bytecode.StackManipulation$Size r13 = r3.apply(r13, r14)
                    net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r14 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                    int r13 = r13.getMaximalSize()
                    int r15 = r15.getStackSize()
                    r14.<init>(r13, r15)
                    return r14
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
                    net.bytebuddy.description.type.TypeDescription r2 = r4.instrumentedType
                    net.bytebuddy.implementation.auxiliary.MethodCallProxy$ConstructorCall$Appender r5 = (net.bytebuddy.implementation.auxiliary.MethodCallProxy.ConstructorCall.Appender) r5
                    net.bytebuddy.description.type.TypeDescription r5 = r5.instrumentedType
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
                    net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }
        }

        static {
                net.bytebuddy.implementation.auxiliary.MethodCallProxy$ConstructorCall r0 = new net.bytebuddy.implementation.auxiliary.MethodCallProxy$ConstructorCall
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.auxiliary.MethodCallProxy.ConstructorCall.INSTANCE = r0
                net.bytebuddy.implementation.auxiliary.MethodCallProxy$ConstructorCall[] r0 = new net.bytebuddy.implementation.auxiliary.MethodCallProxy.ConstructorCall[]{r0}
                net.bytebuddy.implementation.auxiliary.MethodCallProxy.ConstructorCall.$VALUES = r0
                return
        }

        ConstructorCall(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                net.bytebuddy.description.method.MethodList r1 = r1.getDeclaredMethods()
                net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.isConstructor()
                net.bytebuddy.matcher.FilterableList r1 = r1.filter(r2)
                net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                java.lang.Object r1 = r1.getOnly()
                net.bytebuddy.description.method.MethodDescription r1 = (net.bytebuddy.description.method.MethodDescription) r1
                r0.objectTypeDefaultConstructor = r1
                return
        }

        public static /* synthetic */ net.bytebuddy.description.method.MethodDescription access$100(net.bytebuddy.implementation.auxiliary.MethodCallProxy.ConstructorCall r0) {
                net.bytebuddy.description.method.MethodDescription r0 = r0.objectTypeDefaultConstructor
                return r0
        }

        public static net.bytebuddy.implementation.auxiliary.MethodCallProxy.ConstructorCall valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.auxiliary.MethodCallProxy$ConstructorCall> r0 = net.bytebuddy.implementation.auxiliary.MethodCallProxy.ConstructorCall.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.auxiliary.MethodCallProxy$ConstructorCall r1 = (net.bytebuddy.implementation.auxiliary.MethodCallProxy.ConstructorCall) r1
                return r1
        }

        public static net.bytebuddy.implementation.auxiliary.MethodCallProxy.ConstructorCall[] values() {
                net.bytebuddy.implementation.auxiliary.MethodCallProxy$ConstructorCall[] r0 = net.bytebuddy.implementation.auxiliary.MethodCallProxy.ConstructorCall.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.auxiliary.MethodCallProxy$ConstructorCall[] r0 = (net.bytebuddy.implementation.auxiliary.MethodCallProxy.ConstructorCall[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.Implementation
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r3) {
                r2 = this;
                net.bytebuddy.implementation.auxiliary.MethodCallProxy$ConstructorCall$Appender r0 = new net.bytebuddy.implementation.auxiliary.MethodCallProxy$ConstructorCall$Appender
                net.bytebuddy.description.type.TypeDescription r3 = r3.getInstrumentedType()
                r1 = 0
                r0.<init>(r3, r1)
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                r0 = this;
                return r1
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class MethodCall implements net.bytebuddy.implementation.Implementation {
        private final net.bytebuddy.description.method.MethodDescription accessorMethod;
        private final net.bytebuddy.implementation.bytecode.assign.Assigner assigner;

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
        public class Appender implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
            private final net.bytebuddy.description.type.TypeDescription instrumentedType;
            final /* synthetic */ net.bytebuddy.implementation.auxiliary.MethodCallProxy.MethodCall this$0;

            private Appender(net.bytebuddy.implementation.auxiliary.MethodCallProxy.MethodCall r1, net.bytebuddy.description.type.TypeDescription r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r0.instrumentedType = r2
                    return
            }

            public /* synthetic */ Appender(net.bytebuddy.implementation.auxiliary.MethodCallProxy.MethodCall r1, net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.implementation.auxiliary.MethodCallProxy.AnonymousClass1 r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
            public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r11, net.bytebuddy.implementation.Implementation.Context r12, net.bytebuddy.description.method.MethodDescription r13) {
                    r10 = this;
                    r0 = 1
                    r1 = 0
                    r2 = 2
                    net.bytebuddy.description.type.TypeDescription r3 = r10.instrumentedType
                    net.bytebuddy.description.field.FieldList r3 = r3.getDeclaredFields()
                    java.util.ArrayList r4 = new java.util.ArrayList
                    int r5 = r3.size()
                    r4.<init>(r5)
                    java.util.Iterator r3 = r3.iterator()
                L16:
                    boolean r5 = r3.hasNext()
                    if (r5 == 0) goto L3d
                    java.lang.Object r5 = r3.next()
                    net.bytebuddy.description.field.FieldDescription r5 = (net.bytebuddy.description.field.FieldDescription) r5
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r6 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    net.bytebuddy.implementation.bytecode.StackManipulation r7 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r5 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r5)
                    net.bytebuddy.implementation.bytecode.StackManipulation r5 = r5.read()
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r8 = new net.bytebuddy.implementation.bytecode.StackManipulation[r2]
                    r8[r1] = r7
                    r8[r0] = r5
                    r6.<init>(r8)
                    r4.add(r6)
                    goto L16
                L3d:
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r3 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r5 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    r5.<init>(r4)
                    net.bytebuddy.implementation.auxiliary.MethodCallProxy$MethodCall r4 = r10.this$0
                    net.bytebuddy.description.method.MethodDescription r4 = net.bytebuddy.implementation.auxiliary.MethodCallProxy.MethodCall.access$300(r4)
                    net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r4 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r4)
                    net.bytebuddy.implementation.auxiliary.MethodCallProxy$MethodCall r6 = r10.this$0
                    net.bytebuddy.implementation.bytecode.assign.Assigner r6 = net.bytebuddy.implementation.auxiliary.MethodCallProxy.MethodCall.access$400(r6)
                    net.bytebuddy.implementation.auxiliary.MethodCallProxy$MethodCall r7 = r10.this$0
                    net.bytebuddy.description.method.MethodDescription r7 = net.bytebuddy.implementation.auxiliary.MethodCallProxy.MethodCall.access$300(r7)
                    net.bytebuddy.description.type.TypeDescription$Generic r7 = r7.getReturnType()
                    net.bytebuddy.description.type.TypeDescription$Generic r8 = r13.getReturnType()
                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r9 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.DYNAMIC
                    net.bytebuddy.implementation.bytecode.StackManipulation r6 = r6.assign(r7, r8, r9)
                    net.bytebuddy.description.type.TypeDescription$Generic r7 = r13.getReturnType()
                    net.bytebuddy.implementation.bytecode.StackManipulation r7 = net.bytebuddy.implementation.bytecode.member.MethodReturn.of(r7)
                    r8 = 4
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r8 = new net.bytebuddy.implementation.bytecode.StackManipulation[r8]
                    r8[r1] = r5
                    r8[r0] = r4
                    r8[r2] = r6
                    r0 = 3
                    r8[r0] = r7
                    r3.<init>(r8)
                    net.bytebuddy.implementation.bytecode.StackManipulation$Size r11 = r3.apply(r11, r12)
                    net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r12 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                    int r11 = r11.getMaximalSize()
                    int r13 = r13.getStackSize()
                    r12.<init>(r11, r13)
                    return r12
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
                    net.bytebuddy.description.type.TypeDescription r2 = r4.instrumentedType
                    net.bytebuddy.implementation.auxiliary.MethodCallProxy$MethodCall$Appender r5 = (net.bytebuddy.implementation.auxiliary.MethodCallProxy.MethodCall.Appender) r5
                    net.bytebuddy.description.type.TypeDescription r3 = r5.instrumentedType
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.implementation.auxiliary.MethodCallProxy$MethodCall r2 = r4.this$0
                    net.bytebuddy.implementation.auxiliary.MethodCallProxy$MethodCall r5 = r5.this$0
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
                    net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.implementation.auxiliary.MethodCallProxy$MethodCall r1 = r2.this$0
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }
        }

        public MethodCall(net.bytebuddy.description.method.MethodDescription r1, net.bytebuddy.implementation.bytecode.assign.Assigner r2) {
                r0 = this;
                r0.<init>()
                r0.accessorMethod = r1
                r0.assigner = r2
                return
        }

        public static /* synthetic */ net.bytebuddy.description.method.MethodDescription access$300(net.bytebuddy.implementation.auxiliary.MethodCallProxy.MethodCall r0) {
                net.bytebuddy.description.method.MethodDescription r0 = r0.accessorMethod
                return r0
        }

        public static /* synthetic */ net.bytebuddy.implementation.bytecode.assign.Assigner access$400(net.bytebuddy.implementation.auxiliary.MethodCallProxy.MethodCall r0) {
                net.bytebuddy.implementation.bytecode.assign.Assigner r0 = r0.assigner
                return r0
        }

        @Override // net.bytebuddy.implementation.Implementation
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r3) {
                r2 = this;
                net.bytebuddy.implementation.auxiliary.MethodCallProxy$MethodCall$Appender r0 = new net.bytebuddy.implementation.auxiliary.MethodCallProxy$MethodCall$Appender
                net.bytebuddy.description.type.TypeDescription r3 = r3.getInstrumentedType()
                r1 = 0
                r0.<init>(r2, r3, r1)
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
                net.bytebuddy.description.method.MethodDescription r2 = r4.accessorMethod
                net.bytebuddy.implementation.auxiliary.MethodCallProxy$MethodCall r5 = (net.bytebuddy.implementation.auxiliary.MethodCallProxy.MethodCall) r5
                net.bytebuddy.description.method.MethodDescription r3 = r5.accessorMethod
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                net.bytebuddy.implementation.bytecode.assign.Assigner r2 = r4.assigner
                net.bytebuddy.implementation.bytecode.assign.Assigner r5 = r5.assigner
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
                net.bytebuddy.description.method.MethodDescription r1 = r2.accessorMethod
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.bytecode.assign.Assigner r1 = r2.assigner
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                r0 = this;
                return r1
        }
    }

    public enum PrecomputedMethodGraph extends java.lang.Enum<net.bytebuddy.implementation.auxiliary.MethodCallProxy.PrecomputedMethodGraph> implements net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler {
        private static final /* synthetic */ net.bytebuddy.implementation.auxiliary.MethodCallProxy.PrecomputedMethodGraph[] $VALUES = null;
        public static final net.bytebuddy.implementation.auxiliary.MethodCallProxy.PrecomputedMethodGraph INSTANCE = null;
        private final transient net.bytebuddy.dynamic.scaffold.MethodGraph.Linked methodGraph;

        static {
                net.bytebuddy.implementation.auxiliary.MethodCallProxy$PrecomputedMethodGraph r0 = new net.bytebuddy.implementation.auxiliary.MethodCallProxy$PrecomputedMethodGraph
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.auxiliary.MethodCallProxy.PrecomputedMethodGraph.INSTANCE = r0
                net.bytebuddy.implementation.auxiliary.MethodCallProxy$PrecomputedMethodGraph[] r0 = new net.bytebuddy.implementation.auxiliary.MethodCallProxy.PrecomputedMethodGraph[]{r0}
                net.bytebuddy.implementation.auxiliary.MethodCallProxy.PrecomputedMethodGraph.$VALUES = r0
                return
        }

        PrecomputedMethodGraph(java.lang.String r25, int r26) {
                r24 = this;
                r24.<init>(r25, r26)
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                net.bytebuddy.description.method.MethodDescription$Latent r12 = new net.bytebuddy.description.method.MethodDescription$Latent
                java.lang.Class<java.util.concurrent.Callable> r1 = java.util.concurrent.Callable.class
                net.bytebuddy.description.type.TypeDescription r2 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                java.util.List r5 = java.util.Collections.emptyList()
                java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                net.bytebuddy.description.type.TypeDescription$Generic r6 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r1)
                java.util.List r7 = java.util.Collections.emptyList()
                java.lang.Class<java.lang.Exception> r1 = java.lang.Exception.class
                net.bytebuddy.description.type.TypeDescription$Generic r1 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r1)
                java.util.List r8 = java.util.Collections.singletonList(r1)
                java.util.List r9 = java.util.Collections.emptyList()
                net.bytebuddy.description.annotation.AnnotationValue<?, ?> r22 = net.bytebuddy.description.annotation.AnnotationValue.UNDEFINED
                net.bytebuddy.description.type.TypeDescription$Generic r23 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                java.lang.String r3 = "call"
                r4 = 1025(0x401, float:1.436E-42)
                r1 = r12
                r10 = r22
                r11 = r23
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                net.bytebuddy.description.method.MethodDescription$SignatureToken r1 = r12.asSignatureToken()
                net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Simple r2 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Simple
                r2.<init>(r12)
                r0.put(r1, r2)
                net.bytebuddy.description.method.MethodDescription$Latent r1 = new net.bytebuddy.description.method.MethodDescription$Latent
                java.lang.Class<java.lang.Runnable> r2 = java.lang.Runnable.class
                net.bytebuddy.description.type.TypeDescription r14 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r2)
                java.util.List r17 = java.util.Collections.emptyList()
                java.lang.Class r2 = java.lang.Void.TYPE
                net.bytebuddy.description.type.TypeDescription$Generic r18 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r2)
                java.util.List r19 = java.util.Collections.emptyList()
                java.util.List r20 = java.util.Collections.emptyList()
                java.util.List r21 = java.util.Collections.emptyList()
                java.lang.String r15 = "run"
                r16 = 1025(0x401, float:1.436E-42)
                r13 = r1
                r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                net.bytebuddy.description.method.MethodDescription$SignatureToken r2 = r1.asSignatureToken()
                net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Simple r3 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Simple
                r3.<init>(r1)
                r0.put(r2, r3)
                net.bytebuddy.dynamic.scaffold.MethodGraph$Simple r1 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Simple
                r1.<init>(r0)
                net.bytebuddy.dynamic.scaffold.MethodGraph$Linked$Delegation r0 = new net.bytebuddy.dynamic.scaffold.MethodGraph$Linked$Delegation
                java.util.Map r2 = java.util.Collections.emptyMap()
                r0.<init>(r1, r1, r2)
                r1 = r24
                r1.methodGraph = r0
                return
        }

        public static net.bytebuddy.implementation.auxiliary.MethodCallProxy.PrecomputedMethodGraph valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.auxiliary.MethodCallProxy$PrecomputedMethodGraph> r0 = net.bytebuddy.implementation.auxiliary.MethodCallProxy.PrecomputedMethodGraph.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.auxiliary.MethodCallProxy$PrecomputedMethodGraph r1 = (net.bytebuddy.implementation.auxiliary.MethodCallProxy.PrecomputedMethodGraph) r1
                return r1
        }

        public static net.bytebuddy.implementation.auxiliary.MethodCallProxy.PrecomputedMethodGraph[] values() {
                net.bytebuddy.implementation.auxiliary.MethodCallProxy$PrecomputedMethodGraph[] r0 = net.bytebuddy.implementation.auxiliary.MethodCallProxy.PrecomputedMethodGraph.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.auxiliary.MethodCallProxy$PrecomputedMethodGraph[] r0 = (net.bytebuddy.implementation.auxiliary.MethodCallProxy.PrecomputedMethodGraph[]) r0
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler
        public net.bytebuddy.dynamic.scaffold.MethodGraph.Linked compile(net.bytebuddy.description.type.TypeDefinition r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.MethodGraph$Linked r1 = r0.methodGraph
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler
        public net.bytebuddy.dynamic.scaffold.MethodGraph.Linked compile(net.bytebuddy.description.type.TypeDefinition r1, net.bytebuddy.description.type.TypeDescription r2) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.MethodGraph$Linked r1 = r0.methodGraph
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler
        @java.lang.Deprecated
        public net.bytebuddy.dynamic.scaffold.MethodGraph.Linked compile(net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.MethodGraph$Linked r1 = r0.methodGraph
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler
        @java.lang.Deprecated
        public net.bytebuddy.dynamic.scaffold.MethodGraph.Linked compile(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.type.TypeDescription r2) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.MethodGraph$Linked r1 = r0.methodGraph
                return r1
        }
    }

    public MethodCallProxy(net.bytebuddy.implementation.Implementation.SpecialMethodInvocation r2, boolean r3) {
            r1 = this;
            net.bytebuddy.implementation.bytecode.assign.Assigner r0 = net.bytebuddy.implementation.bytecode.assign.Assigner.DEFAULT
            r1.<init>(r2, r3, r0)
            return
    }

    public MethodCallProxy(net.bytebuddy.implementation.Implementation.SpecialMethodInvocation r1, boolean r2, net.bytebuddy.implementation.bytecode.assign.Assigner r3) {
            r0 = this;
            r0.<init>()
            r0.specialMethodInvocation = r1
            r0.serializableProxy = r2
            r0.assigner = r3
            return
    }

    private static java.util.LinkedHashMap<java.lang.String, net.bytebuddy.description.type.TypeDescription> extractFields(net.bytebuddy.description.method.MethodDescription r4) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            boolean r1 = r4.isStatic()
            r2 = 0
            if (r1 != 0) goto L1c
            java.lang.String r1 = fieldName(r2)
            net.bytebuddy.description.type.TypeDefinition r2 = r4.getDeclaringType()
            net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
            r0.put(r1, r2)
            r2 = 1
        L1c:
            net.bytebuddy.description.method.ParameterList r4 = r4.getParameters()
            java.util.Iterator r4 = r4.iterator()
        L24:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L43
            java.lang.Object r1 = r4.next()
            net.bytebuddy.description.method.ParameterDescription r1 = (net.bytebuddy.description.method.ParameterDescription) r1
            int r3 = r2 + 1
            java.lang.String r2 = fieldName(r2)
            net.bytebuddy.description.type.TypeDescription$Generic r1 = r1.getType()
            net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
            r0.put(r2, r1)
            r2 = r3
            goto L24
        L43:
            return r0
    }

    private static java.lang.String fieldName(int r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "argument"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
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
            boolean r2 = r4.serializableProxy
            net.bytebuddy.implementation.auxiliary.MethodCallProxy r5 = (net.bytebuddy.implementation.auxiliary.MethodCallProxy) r5
            boolean r3 = r5.serializableProxy
            if (r2 == r3) goto L1c
            return r1
        L1c:
            net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r2 = r4.specialMethodInvocation
            net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r3 = r5.specialMethodInvocation
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L27
            return r1
        L27:
            net.bytebuddy.implementation.bytecode.assign.Assigner r2 = r4.assigner
            net.bytebuddy.implementation.bytecode.assign.Assigner r5 = r5.assigner
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L32
            return r1
        L32:
            return r0
    }

    @Override // net.bytebuddy.implementation.auxiliary.AuxiliaryType
    public java.lang.String getSuffix() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r1 = r2.specialMethodInvocation
            net.bytebuddy.description.method.MethodDescription r1 = r1.getMethodDescription()
            int r1 = r1.hashCode()
            java.lang.String r1 = net.bytebuddy.utility.RandomString.hashOf(r1)
            r0.append(r1)
            boolean r1 = r2.serializableProxy
            if (r1 == 0) goto L1d
            java.lang.String r1 = "S"
            goto L1f
        L1d:
            java.lang.String r1 = "0"
        L1f:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r1 = r2.specialMethodInvocation
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.serializableProxy
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.implementation.bytecode.assign.Assigner r1 = r2.assigner
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // net.bytebuddy.implementation.auxiliary.AuxiliaryType
    public net.bytebuddy.dynamic.DynamicType make(java.lang.String r6, net.bytebuddy.ClassFileVersion r7, net.bytebuddy.implementation.MethodAccessorFactory r8) {
            r5 = this;
            net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r0 = r5.specialMethodInvocation
            net.bytebuddy.implementation.MethodAccessorFactory$AccessType r1 = net.bytebuddy.implementation.MethodAccessorFactory.AccessType.DEFAULT
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r8 = r8.registerAccessorFor(r0, r1)
            java.util.LinkedHashMap r0 = extractFields(r8)
            net.bytebuddy.ByteBuddy r1 = new net.bytebuddy.ByteBuddy
            r1.<init>(r7)
            net.bytebuddy.dynamic.scaffold.TypeValidation r7 = net.bytebuddy.dynamic.scaffold.TypeValidation.DISABLED
            net.bytebuddy.ByteBuddy r7 = r1.with(r7)
            net.bytebuddy.implementation.auxiliary.MethodCallProxy$PrecomputedMethodGraph r1 = net.bytebuddy.implementation.auxiliary.MethodCallProxy.PrecomputedMethodGraph.INSTANCE
            net.bytebuddy.ByteBuddy r7 = r7.with(r1)
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default r2 = net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default.NO_CONSTRUCTORS
            net.bytebuddy.dynamic.DynamicType$Builder r7 = r7.subclass(r1, r2)
            net.bytebuddy.dynamic.DynamicType$Builder r6 = r7.name(r6)
            net.bytebuddy.description.modifier.ModifierContributor$ForType[] r7 = net.bytebuddy.implementation.auxiliary.AuxiliaryType.DEFAULT_TYPE_MODIFIER
            net.bytebuddy.dynamic.DynamicType$Builder r6 = r6.modifiers(r7)
            r7 = 2
            java.lang.reflect.Type[] r7 = new java.lang.reflect.Type[r7]
            java.lang.Class<java.lang.Runnable> r1 = java.lang.Runnable.class
            r2 = 0
            r7[r2] = r1
            java.lang.Class<java.util.concurrent.Callable> r1 = java.util.concurrent.Callable.class
            r3 = 1
            r7[r3] = r1
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition$Optional r6 = r6.implement(r7)
            net.bytebuddy.implementation.auxiliary.MethodCallProxy$MethodCall r7 = new net.bytebuddy.implementation.auxiliary.MethodCallProxy$MethodCall
            net.bytebuddy.implementation.bytecode.assign.Assigner r1 = r5.assigner
            r7.<init>(r8, r1)
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r6 = r6.intercept(r7)
            boolean r7 = r5.serializableProxy
            if (r7 == 0) goto L56
            java.lang.Class[] r7 = new java.lang.Class[r3]
            java.lang.Class<java.io.Serializable> r8 = java.io.Serializable.class
            r7[r2] = r8
            goto L58
        L56:
            java.lang.Class[] r7 = new java.lang.Class[r2]
        L58:
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition$Optional r6 = r6.implement(r7)
            net.bytebuddy.description.modifier.ModifierContributor$ForMethod[] r7 = new net.bytebuddy.description.modifier.ModifierContributor.ForMethod[r2]
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r6 = r6.defineConstructor(r7)
            java.util.Collection r7 = r0.values()
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition r6 = r6.withParameters(r7)
            net.bytebuddy.implementation.auxiliary.MethodCallProxy$ConstructorCall r7 = net.bytebuddy.implementation.auxiliary.MethodCallProxy.ConstructorCall.INSTANCE
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r6 = r6.intercept(r7)
            java.util.Set r7 = r0.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L78:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L9b
            java.lang.Object r8 = r7.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r0 = r8.getKey()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r8 = r8.getValue()
            net.bytebuddy.description.type.TypeDefinition r8 = (net.bytebuddy.description.type.TypeDefinition) r8
            net.bytebuddy.description.modifier.ModifierContributor$ForField[] r1 = new net.bytebuddy.description.modifier.ModifierContributor.ForField[r3]
            net.bytebuddy.description.modifier.Visibility r4 = net.bytebuddy.description.modifier.Visibility.PRIVATE
            r1[r2] = r4
            net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional$Valuable r6 = r6.defineField(r0, r8, r1)
            goto L78
        L9b:
            net.bytebuddy.dynamic.DynamicType$Unloaded r6 = r6.make()
            return r6
    }
}
