package net.bytebuddy.implementation.bind.annotation;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface Morph {

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Binder implements net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<net.bytebuddy.implementation.bind.annotation.Morph> {
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape DEFAULT_METHOD = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape DEFAULT_TARGET = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape SERIALIZABLE_PROXY = null;
        private final net.bytebuddy.description.method.MethodDescription forwardingMethod;

        public interface DefaultMethodLocator {

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Explicit implements net.bytebuddy.implementation.bind.annotation.Morph.Binder.DefaultMethodLocator {
                private final net.bytebuddy.description.type.TypeDescription typeDescription;

                public Explicit(net.bytebuddy.description.type.TypeDescription r1) {
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
                        net.bytebuddy.implementation.bind.annotation.Morph$Binder$DefaultMethodLocator$Explicit r5 = (net.bytebuddy.implementation.bind.annotation.Morph.Binder.DefaultMethodLocator.Explicit) r5
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

                @Override // net.bytebuddy.implementation.bind.annotation.Morph.Binder.DefaultMethodLocator
                public net.bytebuddy.implementation.Implementation.SpecialMethodInvocation resolve(net.bytebuddy.implementation.Implementation.Target r3, net.bytebuddy.description.method.MethodDescription r4) {
                        r2 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r2.typeDescription
                        boolean r0 = r0.isInterface()
                        if (r0 == 0) goto L1b
                        net.bytebuddy.description.method.MethodDescription$SignatureToken r0 = r4.asSignatureToken()
                        net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                        net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r3 = r3.invokeDefault(r0, r1)
                        net.bytebuddy.description.method.MethodDescription$TypeToken r4 = r4.asTypeToken()
                        net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r3 = r3.withCheckedCompatibilityTo(r4)
                        return r3
                    L1b:
                        java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        r0.append(r4)
                        java.lang.String r4 = " method carries default method call parameter on non-interface type"
                        r0.append(r4)
                        java.lang.String r4 = r0.toString()
                        r3.<init>(r4)
                        throw r3
                }
            }

            public enum Implicit extends java.lang.Enum<net.bytebuddy.implementation.bind.annotation.Morph.Binder.DefaultMethodLocator.Implicit> implements net.bytebuddy.implementation.bind.annotation.Morph.Binder.DefaultMethodLocator {
                private static final /* synthetic */ net.bytebuddy.implementation.bind.annotation.Morph.Binder.DefaultMethodLocator.Implicit[] $VALUES = null;
                public static final net.bytebuddy.implementation.bind.annotation.Morph.Binder.DefaultMethodLocator.Implicit INSTANCE = null;

                static {
                        net.bytebuddy.implementation.bind.annotation.Morph$Binder$DefaultMethodLocator$Implicit r0 = new net.bytebuddy.implementation.bind.annotation.Morph$Binder$DefaultMethodLocator$Implicit
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.implementation.bind.annotation.Morph.Binder.DefaultMethodLocator.Implicit.INSTANCE = r0
                        net.bytebuddy.implementation.bind.annotation.Morph$Binder$DefaultMethodLocator$Implicit[] r0 = new net.bytebuddy.implementation.bind.annotation.Morph.Binder.DefaultMethodLocator.Implicit[]{r0}
                        net.bytebuddy.implementation.bind.annotation.Morph.Binder.DefaultMethodLocator.Implicit.$VALUES = r0
                        return
                }

                Implicit(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.implementation.bind.annotation.Morph.Binder.DefaultMethodLocator.Implicit valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.implementation.bind.annotation.Morph$Binder$DefaultMethodLocator$Implicit> r0 = net.bytebuddy.implementation.bind.annotation.Morph.Binder.DefaultMethodLocator.Implicit.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.implementation.bind.annotation.Morph$Binder$DefaultMethodLocator$Implicit r1 = (net.bytebuddy.implementation.bind.annotation.Morph.Binder.DefaultMethodLocator.Implicit) r1
                        return r1
                }

                public static net.bytebuddy.implementation.bind.annotation.Morph.Binder.DefaultMethodLocator.Implicit[] values() {
                        net.bytebuddy.implementation.bind.annotation.Morph$Binder$DefaultMethodLocator$Implicit[] r0 = net.bytebuddy.implementation.bind.annotation.Morph.Binder.DefaultMethodLocator.Implicit.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.implementation.bind.annotation.Morph$Binder$DefaultMethodLocator$Implicit[] r0 = (net.bytebuddy.implementation.bind.annotation.Morph.Binder.DefaultMethodLocator.Implicit[]) r0
                        return r0
                }

                @Override // net.bytebuddy.implementation.bind.annotation.Morph.Binder.DefaultMethodLocator
                public net.bytebuddy.implementation.Implementation.SpecialMethodInvocation resolve(net.bytebuddy.implementation.Implementation.Target r2, net.bytebuddy.description.method.MethodDescription r3) {
                        r1 = this;
                        net.bytebuddy.description.method.MethodDescription$SignatureToken r0 = r3.asSignatureToken()
                        net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r2 = r2.invokeDefault(r0)
                        net.bytebuddy.description.method.MethodDescription$TypeToken r3 = r3.asTypeToken()
                        net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r2 = r2.withCheckedCompatibilityTo(r3)
                        return r2
                }
            }

            net.bytebuddy.implementation.Implementation.SpecialMethodInvocation resolve(net.bytebuddy.implementation.Implementation.Target r1, net.bytebuddy.description.method.MethodDescription r2);
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class RedirectionProxy extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase implements net.bytebuddy.implementation.auxiliary.AuxiliaryType {
            protected static final java.lang.String FIELD_NAME = "target";
            private final net.bytebuddy.implementation.bytecode.assign.Assigner assigner;
            private final net.bytebuddy.description.type.TypeDescription instrumentedType;
            private final net.bytebuddy.description.type.TypeDescription morphingType;
            private final boolean serializableProxy;
            private final net.bytebuddy.implementation.Implementation.SpecialMethodInvocation specialMethodInvocation;

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class InstanceFieldConstructor implements net.bytebuddy.implementation.Implementation {
                private final net.bytebuddy.description.type.TypeDescription instrumentedType;

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class Appender implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
                    private final net.bytebuddy.description.field.FieldDescription fieldDescription;

                    public Appender(net.bytebuddy.implementation.Implementation.Target r2) {
                            r1 = this;
                            r1.<init>()
                            net.bytebuddy.description.type.TypeDescription r2 = r2.getInstrumentedType()
                            net.bytebuddy.description.field.FieldList r2 = r2.getDeclaredFields()
                            java.lang.String r0 = "target"
                            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.named(r0)
                            net.bytebuddy.matcher.FilterableList r2 = r2.filter(r0)
                            net.bytebuddy.description.field.FieldList r2 = (net.bytebuddy.description.field.FieldList) r2
                            java.lang.Object r2 = r2.getOnly()
                            net.bytebuddy.description.field.FieldDescription r2 = (net.bytebuddy.description.field.FieldDescription) r2
                            r1.fieldDescription = r2
                            return
                    }

                    @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
                    public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r8, net.bytebuddy.implementation.Implementation.Context r9, net.bytebuddy.description.method.MethodDescription r10) {
                            r7 = this;
                            net.bytebuddy.implementation.bytecode.StackManipulation$Compound r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                            net.bytebuddy.implementation.bytecode.StackManipulation r1 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                            net.bytebuddy.implementation.bind.annotation.Morph$Binder$RedirectionProxy$StaticFieldConstructor r2 = net.bytebuddy.implementation.bind.annotation.Morph.Binder.RedirectionProxy.StaticFieldConstructor.INSTANCE
                            net.bytebuddy.description.method.MethodDescription r2 = net.bytebuddy.implementation.bind.annotation.Morph.Binder.RedirectionProxy.StaticFieldConstructor.access$000(r2)
                            net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r2 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r2)
                            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$MethodLoading r3 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.allArgumentsOf(r10)
                            net.bytebuddy.implementation.bytecode.StackManipulation r3 = r3.prependThisReference()
                            net.bytebuddy.description.field.FieldDescription r4 = r7.fieldDescription
                            net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r4 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r4)
                            net.bytebuddy.implementation.bytecode.StackManipulation r4 = r4.write()
                            r5 = 5
                            net.bytebuddy.implementation.bytecode.StackManipulation[] r5 = new net.bytebuddy.implementation.bytecode.StackManipulation[r5]
                            r6 = 0
                            r5[r6] = r1
                            r1 = 1
                            r5[r1] = r2
                            r1 = 2
                            r5[r1] = r3
                            r1 = 3
                            r5[r1] = r4
                            net.bytebuddy.implementation.bytecode.member.MethodReturn r1 = net.bytebuddy.implementation.bytecode.member.MethodReturn.VOID
                            r2 = 4
                            r5[r2] = r1
                            r0.<init>(r5)
                            net.bytebuddy.implementation.bytecode.StackManipulation$Size r8 = r0.apply(r8, r9)
                            net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r9 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                            int r8 = r8.getMaximalSize()
                            int r10 = r10.getStackSize()
                            r9.<init>(r8, r10)
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
                            net.bytebuddy.description.field.FieldDescription r2 = r4.fieldDescription
                            net.bytebuddy.implementation.bind.annotation.Morph$Binder$RedirectionProxy$InstanceFieldConstructor$Appender r5 = (net.bytebuddy.implementation.bind.annotation.Morph.Binder.RedirectionProxy.InstanceFieldConstructor.Appender) r5
                            net.bytebuddy.description.field.FieldDescription r5 = r5.fieldDescription
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
                            net.bytebuddy.description.field.FieldDescription r1 = r2.fieldDescription
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }
                }

                public InstanceFieldConstructor(net.bytebuddy.description.type.TypeDescription r1) {
                        r0 = this;
                        r0.<init>()
                        r0.instrumentedType = r1
                        return
                }

                @Override // net.bytebuddy.implementation.Implementation
                public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r2) {
                        r1 = this;
                        net.bytebuddy.implementation.bind.annotation.Morph$Binder$RedirectionProxy$InstanceFieldConstructor$Appender r0 = new net.bytebuddy.implementation.bind.annotation.Morph$Binder$RedirectionProxy$InstanceFieldConstructor$Appender
                        r0.<init>(r2)
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
                        net.bytebuddy.description.type.TypeDescription r2 = r4.instrumentedType
                        net.bytebuddy.implementation.bind.annotation.Morph$Binder$RedirectionProxy$InstanceFieldConstructor r5 = (net.bytebuddy.implementation.bind.annotation.Morph.Binder.RedirectionProxy.InstanceFieldConstructor) r5
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

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r5) {
                        r4 = this;
                        net.bytebuddy.description.field.FieldDescription$Token r0 = new net.bytebuddy.description.field.FieldDescription$Token
                        net.bytebuddy.description.type.TypeDescription r1 = r4.instrumentedType
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r1.asGenericType()
                        java.lang.String r2 = "target"
                        r3 = 18
                        r0.<init>(r2, r3, r1)
                        net.bytebuddy.dynamic.scaffold.InstrumentedType r5 = r5.withField(r0)
                        return r5
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class MethodCall implements net.bytebuddy.implementation.Implementation {
                private final net.bytebuddy.description.method.MethodDescription accessorMethod;
                private final net.bytebuddy.implementation.bytecode.assign.Assigner assigner;

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                public class Appender implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
                    final /* synthetic */ net.bytebuddy.implementation.bind.annotation.Morph.Binder.RedirectionProxy.MethodCall this$0;
                    private final net.bytebuddy.description.type.TypeDescription typeDescription;

                    public Appender(net.bytebuddy.implementation.bind.annotation.Morph.Binder.RedirectionProxy.MethodCall r1, net.bytebuddy.implementation.Implementation.Target r2) {
                            r0 = this;
                            r0.this$0 = r1
                            r0.<init>()
                            net.bytebuddy.description.type.TypeDescription r1 = r2.getInstrumentedType()
                            r0.typeDescription = r1
                            return
                    }

                    @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
                    public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r17, net.bytebuddy.implementation.Implementation.Context r18, net.bytebuddy.description.method.MethodDescription r19) {
                            r16 = this;
                            r0 = r16
                            r2 = 4
                            r3 = 2
                            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r4 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.REFERENCE
                            r5 = 1
                            net.bytebuddy.implementation.bytecode.StackManipulation r4 = r4.loadFrom(r5)
                            net.bytebuddy.implementation.bind.annotation.Morph$Binder$RedirectionProxy$MethodCall r6 = r0.this$0
                            net.bytebuddy.description.method.MethodDescription r6 = net.bytebuddy.implementation.bind.annotation.Morph.Binder.RedirectionProxy.MethodCall.access$100(r6)
                            net.bytebuddy.description.method.ParameterList r6 = r6.getParameters()
                            int r6 = r6.size()
                            net.bytebuddy.implementation.bytecode.StackManipulation[] r6 = new net.bytebuddy.implementation.bytecode.StackManipulation[r6]
                            net.bytebuddy.implementation.bind.annotation.Morph$Binder$RedirectionProxy$MethodCall r7 = r0.this$0
                            net.bytebuddy.description.method.MethodDescription r7 = net.bytebuddy.implementation.bind.annotation.Morph.Binder.RedirectionProxy.MethodCall.access$100(r7)
                            net.bytebuddy.description.method.ParameterList r7 = r7.getParameters()
                            net.bytebuddy.description.type.TypeList$Generic r7 = r7.asTypeList()
                            java.util.Iterator r7 = r7.iterator()
                            r8 = 0
                            r9 = r8
                        L2f:
                            boolean r10 = r7.hasNext()
                            if (r10 == 0) goto L6b
                            java.lang.Object r10 = r7.next()
                            net.bytebuddy.description.type.TypeDescription$Generic r10 = (net.bytebuddy.description.type.TypeDescription.Generic) r10
                            net.bytebuddy.implementation.bytecode.StackManipulation$Compound r11 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                            net.bytebuddy.implementation.bytecode.StackManipulation r12 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.forValue(r9)
                            net.bytebuddy.implementation.bytecode.collection.ArrayAccess r13 = net.bytebuddy.implementation.bytecode.collection.ArrayAccess.REFERENCE
                            net.bytebuddy.implementation.bytecode.StackManipulation r13 = r13.load()
                            net.bytebuddy.implementation.bind.annotation.Morph$Binder$RedirectionProxy$MethodCall r14 = r0.this$0
                            net.bytebuddy.implementation.bytecode.assign.Assigner r14 = net.bytebuddy.implementation.bind.annotation.Morph.Binder.RedirectionProxy.MethodCall.access$200(r14)
                            java.lang.Class<java.lang.Object> r15 = java.lang.Object.class
                            net.bytebuddy.description.type.TypeDescription$Generic r15 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r15)
                            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r1 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.DYNAMIC
                            net.bytebuddy.implementation.bytecode.StackManipulation r1 = r14.assign(r15, r10, r1)
                            net.bytebuddy.implementation.bytecode.StackManipulation[] r10 = new net.bytebuddy.implementation.bytecode.StackManipulation[r2]
                            r10[r8] = r4
                            r10[r5] = r12
                            r10[r3] = r13
                            r12 = 3
                            r10[r12] = r1
                            r11.<init>(r10)
                            r6[r9] = r11
                            int r9 = r9 + r5
                            goto L2f
                        L6b:
                            net.bytebuddy.implementation.bytecode.StackManipulation$Compound r1 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                            net.bytebuddy.implementation.bind.annotation.Morph$Binder$RedirectionProxy$MethodCall r4 = r0.this$0
                            net.bytebuddy.description.method.MethodDescription r4 = net.bytebuddy.implementation.bind.annotation.Morph.Binder.RedirectionProxy.MethodCall.access$100(r4)
                            boolean r4 = r4.isStatic()
                            if (r4 == 0) goto L7c
                            net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r4 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
                            goto Lab
                        L7c:
                            net.bytebuddy.implementation.bytecode.StackManipulation$Compound r4 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                            net.bytebuddy.implementation.bytecode.StackManipulation r7 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                            net.bytebuddy.description.type.TypeDescription r9 = r0.typeDescription
                            net.bytebuddy.description.field.FieldList r9 = r9.getDeclaredFields()
                            java.lang.String r10 = "target"
                            net.bytebuddy.matcher.ElementMatcher$Junction r10 = net.bytebuddy.matcher.ElementMatchers.named(r10)
                            net.bytebuddy.matcher.FilterableList r9 = r9.filter(r10)
                            net.bytebuddy.description.field.FieldList r9 = (net.bytebuddy.description.field.FieldList) r9
                            java.lang.Object r9 = r9.getOnly()
                            net.bytebuddy.description.field.FieldDescription$InDefinedShape r9 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r9
                            net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r9 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r9)
                            net.bytebuddy.implementation.bytecode.StackManipulation r9 = r9.read()
                            net.bytebuddy.implementation.bytecode.StackManipulation[] r10 = new net.bytebuddy.implementation.bytecode.StackManipulation[r3]
                            r10[r8] = r7
                            r10[r5] = r9
                            r4.<init>(r10)
                        Lab:
                            net.bytebuddy.implementation.bytecode.StackManipulation$Compound r7 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                            r7.<init>(r6)
                            net.bytebuddy.implementation.bind.annotation.Morph$Binder$RedirectionProxy$MethodCall r6 = r0.this$0
                            net.bytebuddy.description.method.MethodDescription r6 = net.bytebuddy.implementation.bind.annotation.Morph.Binder.RedirectionProxy.MethodCall.access$100(r6)
                            net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r6 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r6)
                            net.bytebuddy.implementation.bind.annotation.Morph$Binder$RedirectionProxy$MethodCall r9 = r0.this$0
                            net.bytebuddy.implementation.bytecode.assign.Assigner r9 = net.bytebuddy.implementation.bind.annotation.Morph.Binder.RedirectionProxy.MethodCall.access$200(r9)
                            net.bytebuddy.implementation.bind.annotation.Morph$Binder$RedirectionProxy$MethodCall r10 = r0.this$0
                            net.bytebuddy.description.method.MethodDescription r10 = net.bytebuddy.implementation.bind.annotation.Morph.Binder.RedirectionProxy.MethodCall.access$100(r10)
                            net.bytebuddy.description.type.TypeDescription$Generic r10 = r10.getReturnType()
                            net.bytebuddy.description.type.TypeDescription$Generic r11 = r19.getReturnType()
                            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r12 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.DYNAMIC
                            net.bytebuddy.implementation.bytecode.StackManipulation r9 = r9.assign(r10, r11, r12)
                            r10 = 5
                            net.bytebuddy.implementation.bytecode.StackManipulation[] r10 = new net.bytebuddy.implementation.bytecode.StackManipulation[r10]
                            r10[r8] = r4
                            r10[r5] = r7
                            r10[r3] = r6
                            r3 = 3
                            r10[r3] = r9
                            net.bytebuddy.implementation.bytecode.member.MethodReturn r3 = net.bytebuddy.implementation.bytecode.member.MethodReturn.REFERENCE
                            r10[r2] = r3
                            r1.<init>(r10)
                            r2 = r17
                            r3 = r18
                            net.bytebuddy.implementation.bytecode.StackManipulation$Size r1 = r1.apply(r2, r3)
                            net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r2 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                            int r1 = r1.getMaximalSize()
                            int r3 = r19.getStackSize()
                            r2.<init>(r1, r3)
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
                            net.bytebuddy.description.type.TypeDescription r2 = r4.typeDescription
                            net.bytebuddy.implementation.bind.annotation.Morph$Binder$RedirectionProxy$MethodCall$Appender r5 = (net.bytebuddy.implementation.bind.annotation.Morph.Binder.RedirectionProxy.MethodCall.Appender) r5
                            net.bytebuddy.description.type.TypeDescription r3 = r5.typeDescription
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L20
                            return r1
                        L20:
                            net.bytebuddy.implementation.bind.annotation.Morph$Binder$RedirectionProxy$MethodCall r2 = r4.this$0
                            net.bytebuddy.implementation.bind.annotation.Morph$Binder$RedirectionProxy$MethodCall r5 = r5.this$0
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
                            net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.implementation.bind.annotation.Morph$Binder$RedirectionProxy$MethodCall r1 = r2.this$0
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

                public static /* synthetic */ net.bytebuddy.description.method.MethodDescription access$100(net.bytebuddy.implementation.bind.annotation.Morph.Binder.RedirectionProxy.MethodCall r0) {
                        net.bytebuddy.description.method.MethodDescription r0 = r0.accessorMethod
                        return r0
                }

                public static /* synthetic */ net.bytebuddy.implementation.bytecode.assign.Assigner access$200(net.bytebuddy.implementation.bind.annotation.Morph.Binder.RedirectionProxy.MethodCall r0) {
                        net.bytebuddy.implementation.bytecode.assign.Assigner r0 = r0.assigner
                        return r0
                }

                @Override // net.bytebuddy.implementation.Implementation
                public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r2) {
                        r1 = this;
                        net.bytebuddy.implementation.bind.annotation.Morph$Binder$RedirectionProxy$MethodCall$Appender r0 = new net.bytebuddy.implementation.bind.annotation.Morph$Binder$RedirectionProxy$MethodCall$Appender
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
                        net.bytebuddy.description.method.MethodDescription r2 = r4.accessorMethod
                        net.bytebuddy.implementation.bind.annotation.Morph$Binder$RedirectionProxy$MethodCall r5 = (net.bytebuddy.implementation.bind.annotation.Morph.Binder.RedirectionProxy.MethodCall) r5
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

            public enum StaticFieldConstructor extends java.lang.Enum<net.bytebuddy.implementation.bind.annotation.Morph.Binder.RedirectionProxy.StaticFieldConstructor> implements net.bytebuddy.implementation.Implementation {
                private static final /* synthetic */ net.bytebuddy.implementation.bind.annotation.Morph.Binder.RedirectionProxy.StaticFieldConstructor[] $VALUES = null;
                public static final net.bytebuddy.implementation.bind.annotation.Morph.Binder.RedirectionProxy.StaticFieldConstructor INSTANCE = null;
                private final net.bytebuddy.description.method.MethodDescription objectTypeDefaultConstructor;

                static {
                        net.bytebuddy.implementation.bind.annotation.Morph$Binder$RedirectionProxy$StaticFieldConstructor r0 = new net.bytebuddy.implementation.bind.annotation.Morph$Binder$RedirectionProxy$StaticFieldConstructor
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.implementation.bind.annotation.Morph.Binder.RedirectionProxy.StaticFieldConstructor.INSTANCE = r0
                        net.bytebuddy.implementation.bind.annotation.Morph$Binder$RedirectionProxy$StaticFieldConstructor[] r0 = new net.bytebuddy.implementation.bind.annotation.Morph.Binder.RedirectionProxy.StaticFieldConstructor[]{r0}
                        net.bytebuddy.implementation.bind.annotation.Morph.Binder.RedirectionProxy.StaticFieldConstructor.$VALUES = r0
                        return
                }

                StaticFieldConstructor(java.lang.String r1, int r2) {
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

                public static /* synthetic */ net.bytebuddy.description.method.MethodDescription access$000(net.bytebuddy.implementation.bind.annotation.Morph.Binder.RedirectionProxy.StaticFieldConstructor r0) {
                        net.bytebuddy.description.method.MethodDescription r0 = r0.objectTypeDefaultConstructor
                        return r0
                }

                public static net.bytebuddy.implementation.bind.annotation.Morph.Binder.RedirectionProxy.StaticFieldConstructor valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.implementation.bind.annotation.Morph$Binder$RedirectionProxy$StaticFieldConstructor> r0 = net.bytebuddy.implementation.bind.annotation.Morph.Binder.RedirectionProxy.StaticFieldConstructor.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.implementation.bind.annotation.Morph$Binder$RedirectionProxy$StaticFieldConstructor r1 = (net.bytebuddy.implementation.bind.annotation.Morph.Binder.RedirectionProxy.StaticFieldConstructor) r1
                        return r1
                }

                public static net.bytebuddy.implementation.bind.annotation.Morph.Binder.RedirectionProxy.StaticFieldConstructor[] values() {
                        net.bytebuddy.implementation.bind.annotation.Morph$Binder$RedirectionProxy$StaticFieldConstructor[] r0 = net.bytebuddy.implementation.bind.annotation.Morph.Binder.RedirectionProxy.StaticFieldConstructor.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.implementation.bind.annotation.Morph$Binder$RedirectionProxy$StaticFieldConstructor[] r0 = (net.bytebuddy.implementation.bind.annotation.Morph.Binder.RedirectionProxy.StaticFieldConstructor[]) r0
                        return r0
                }

                @Override // net.bytebuddy.implementation.Implementation
                public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r5) {
                        r4 = this;
                        net.bytebuddy.implementation.bytecode.ByteCodeAppender$Simple r5 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Simple
                        net.bytebuddy.implementation.bytecode.StackManipulation r0 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                        net.bytebuddy.description.method.MethodDescription r1 = r4.objectTypeDefaultConstructor
                        net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r1 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r1)
                        r2 = 3
                        net.bytebuddy.implementation.bytecode.StackManipulation[] r2 = new net.bytebuddy.implementation.bytecode.StackManipulation[r2]
                        r3 = 0
                        r2[r3] = r0
                        r0 = 1
                        r2[r0] = r1
                        net.bytebuddy.implementation.bytecode.member.MethodReturn r0 = net.bytebuddy.implementation.bytecode.member.MethodReturn.VOID
                        r1 = 2
                        r2[r1] = r0
                        r5.<init>(r2)
                        return r5
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                        r0 = this;
                        return r1
                }
            }

            public RedirectionProxy(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.implementation.Implementation.SpecialMethodInvocation r3, net.bytebuddy.implementation.bytecode.assign.Assigner r4, boolean r5) {
                    r0 = this;
                    r0.<init>()
                    r0.morphingType = r1
                    r0.instrumentedType = r2
                    r0.specialMethodInvocation = r3
                    r0.assigner = r4
                    r0.serializableProxy = r5
                    return
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r7, net.bytebuddy.implementation.Implementation.Context r8) {
                    r6 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r8.register(r6)
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r1 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.TypeCreation.of(r0)
                    net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r3 = r6.specialMethodInvocation
                    net.bytebuddy.description.method.MethodDescription r3 = r3.getMethodDescription()
                    boolean r3 = r3.isStatic()
                    if (r3 == 0) goto L19
                    net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r3 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
                    goto L1d
                L19:
                    net.bytebuddy.implementation.bytecode.StackManipulation r3 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                L1d:
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
                    boolean r2 = r4.serializableProxy
                    net.bytebuddy.implementation.bind.annotation.Morph$Binder$RedirectionProxy r5 = (net.bytebuddy.implementation.bind.annotation.Morph.Binder.RedirectionProxy) r5
                    boolean r3 = r5.serializableProxy
                    if (r2 == r3) goto L1c
                    return r1
                L1c:
                    net.bytebuddy.description.type.TypeDescription r2 = r4.morphingType
                    net.bytebuddy.description.type.TypeDescription r3 = r5.morphingType
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L27
                    return r1
                L27:
                    net.bytebuddy.description.type.TypeDescription r2 = r4.instrumentedType
                    net.bytebuddy.description.type.TypeDescription r3 = r5.instrumentedType
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L32
                    return r1
                L32:
                    net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r2 = r4.specialMethodInvocation
                    net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r3 = r5.specialMethodInvocation
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L3d
                    return r1
                L3d:
                    net.bytebuddy.implementation.bytecode.assign.Assigner r2 = r4.assigner
                    net.bytebuddy.implementation.bytecode.assign.Assigner r5 = r5.assigner
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L48
                    return r1
                L48:
                    return r0
            }

            @Override // net.bytebuddy.implementation.auxiliary.AuxiliaryType
            public java.lang.String getSuffix() {
                    r2 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    net.bytebuddy.description.type.TypeDescription r1 = r2.morphingType
                    int r1 = r1.hashCode()
                    java.lang.String r1 = net.bytebuddy.utility.RandomString.hashOf(r1)
                    r0.append(r1)
                    boolean r1 = r2.serializableProxy
                    if (r1 == 0) goto L19
                    java.lang.String r1 = "S"
                    goto L1b
                L19:
                    java.lang.String r1 = "0"
                L1b:
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.description.type.TypeDescription r1 = r2.morphingType
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r1 = r2.specialMethodInvocation
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.implementation.bytecode.assign.Assigner r1 = r2.assigner
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    boolean r1 = r2.serializableProxy
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.auxiliary.AuxiliaryType
            public net.bytebuddy.dynamic.DynamicType make(java.lang.String r3, net.bytebuddy.ClassFileVersion r4, net.bytebuddy.implementation.MethodAccessorFactory r5) {
                    r2 = this;
                    net.bytebuddy.ByteBuddy r0 = new net.bytebuddy.ByteBuddy
                    r0.<init>(r4)
                    net.bytebuddy.dynamic.scaffold.TypeValidation r4 = net.bytebuddy.dynamic.scaffold.TypeValidation.DISABLED
                    net.bytebuddy.ByteBuddy r4 = r0.with(r4)
                    net.bytebuddy.description.type.TypeDescription r0 = r2.morphingType
                    net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default r1 = net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default.NO_CONSTRUCTORS
                    net.bytebuddy.dynamic.DynamicType$Builder r4 = r4.subclass(r0, r1)
                    net.bytebuddy.dynamic.DynamicType$Builder r3 = r4.name(r3)
                    net.bytebuddy.description.modifier.ModifierContributor$ForType[] r4 = net.bytebuddy.implementation.auxiliary.AuxiliaryType.DEFAULT_TYPE_MODIFIER
                    net.bytebuddy.dynamic.DynamicType$Builder r3 = r3.modifiers(r4)
                    boolean r4 = r2.serializableProxy
                    r0 = 0
                    if (r4 == 0) goto L2a
                    r4 = 1
                    java.lang.Class[] r4 = new java.lang.Class[r4]
                    java.lang.Class<java.io.Serializable> r1 = java.io.Serializable.class
                    r4[r0] = r1
                    goto L2c
                L2a:
                    java.lang.Class[] r4 = new java.lang.Class[r0]
                L2c:
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition$Optional r3 = r3.implement(r4)
                    net.bytebuddy.description.modifier.ModifierContributor$ForMethod[] r4 = new net.bytebuddy.description.modifier.ModifierContributor.ForMethod[r0]
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r3 = r3.defineConstructor(r4)
                    net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r4 = r2.specialMethodInvocation
                    net.bytebuddy.description.method.MethodDescription r4 = r4.getMethodDescription()
                    boolean r4 = r4.isStatic()
                    if (r4 == 0) goto L47
                    java.util.List r4 = java.util.Collections.emptyList()
                    goto L4d
                L47:
                    net.bytebuddy.description.type.TypeDescription r4 = r2.instrumentedType
                    java.util.List r4 = java.util.Collections.singletonList(r4)
                L4d:
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition r3 = r3.withParameters(r4)
                    net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r4 = r2.specialMethodInvocation
                    net.bytebuddy.description.method.MethodDescription r4 = r4.getMethodDescription()
                    boolean r4 = r4.isStatic()
                    if (r4 == 0) goto L60
                    net.bytebuddy.implementation.bind.annotation.Morph$Binder$RedirectionProxy$StaticFieldConstructor r4 = net.bytebuddy.implementation.bind.annotation.Morph.Binder.RedirectionProxy.StaticFieldConstructor.INSTANCE
                    goto L67
                L60:
                    net.bytebuddy.implementation.bind.annotation.Morph$Binder$RedirectionProxy$InstanceFieldConstructor r4 = new net.bytebuddy.implementation.bind.annotation.Morph$Binder$RedirectionProxy$InstanceFieldConstructor
                    net.bytebuddy.description.type.TypeDescription r0 = r2.instrumentedType
                    r4.<init>(r0)
                L67:
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r3 = r3.intercept(r4)
                    net.bytebuddy.matcher.ElementMatcher$Junction r4 = net.bytebuddy.matcher.ElementMatchers.isAbstract()
                    net.bytebuddy.description.type.TypeDescription r0 = r2.morphingType
                    net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isDeclaredBy(r0)
                    net.bytebuddy.matcher.ElementMatcher$Junction r4 = r4.and(r0)
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r3 = r3.method(r4)
                    net.bytebuddy.implementation.bind.annotation.Morph$Binder$RedirectionProxy$MethodCall r4 = new net.bytebuddy.implementation.bind.annotation.Morph$Binder$RedirectionProxy$MethodCall
                    net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r0 = r2.specialMethodInvocation
                    net.bytebuddy.implementation.MethodAccessorFactory$AccessType r1 = net.bytebuddy.implementation.MethodAccessorFactory.AccessType.DEFAULT
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r5 = r5.registerAccessorFor(r0, r1)
                    net.bytebuddy.implementation.bytecode.assign.Assigner r0 = r2.assigner
                    r4.<init>(r5, r0)
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r3 = r3.intercept(r4)
                    net.bytebuddy.dynamic.DynamicType$Unloaded r3 = r3.make()
                    return r3
            }
        }

        static {
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.Morph> r0 = net.bytebuddy.implementation.bind.annotation.Morph.class
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                java.lang.String r1 = "serializableProxy"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                java.lang.Object r1 = r1.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                net.bytebuddy.implementation.bind.annotation.Morph.Binder.SERIALIZABLE_PROXY = r1
                java.lang.String r1 = "defaultMethod"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                java.lang.Object r1 = r1.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                net.bytebuddy.implementation.bind.annotation.Morph.Binder.DEFAULT_METHOD = r1
                java.lang.String r1 = "defaultTarget"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                java.lang.Object r0 = r0.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                net.bytebuddy.implementation.bind.annotation.Morph.Binder.DEFAULT_TARGET = r0
                return
        }

        public Binder(net.bytebuddy.description.method.MethodDescription r1) {
                r0 = this;
                r0.<init>()
                r0.forwardingMethod = r1
                return
        }

        public static net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<net.bytebuddy.implementation.bind.annotation.Morph> install(java.lang.Class<?> r0) {
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder r0 = install(r0)
                return r0
        }

        public static net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<net.bytebuddy.implementation.bind.annotation.Morph> install(net.bytebuddy.description.type.TypeDescription r1) {
                net.bytebuddy.implementation.bind.annotation.Morph$Binder r0 = new net.bytebuddy.implementation.bind.annotation.Morph$Binder
                net.bytebuddy.description.method.MethodDescription r1 = onlyMethod(r1)
                r0.<init>(r1)
                return r0
        }

        private static net.bytebuddy.description.method.MethodDescription onlyMethod(net.bytebuddy.description.type.TypeDescription r3) {
                boolean r0 = r3.isInterface()
                if (r0 == 0) goto Lda
                net.bytebuddy.description.type.TypeList$Generic r0 = r3.getInterfaces()
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto Lc3
                boolean r0 = r3.isPublic()
                if (r0 == 0) goto Lac
                net.bytebuddy.description.method.MethodList r0 = r3.getDeclaredMethods()
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.isAbstract()
                net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                int r1 = r0.size()
                r2 = 1
                if (r1 != r2) goto L95
                java.lang.Object r3 = r0.getOnly()
                net.bytebuddy.description.method.MethodDescription r3 = (net.bytebuddy.description.method.MethodDescription) r3
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.getReturnType()
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                boolean r0 = r0.represents(r1)
                if (r0 == 0) goto L7e
                net.bytebuddy.description.method.ParameterList r0 = r3.getParameters()
                int r0 = r0.size()
                if (r0 != r2) goto L67
                net.bytebuddy.description.method.ParameterList r0 = r3.getParameters()
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                net.bytebuddy.description.method.ParameterDescription r0 = (net.bytebuddy.description.method.ParameterDescription) r0
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getType()
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
                boolean r0 = r0.represents(r1)
                if (r0 == 0) goto L67
                return r3
            L67:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " does not take a single argument of type Object[]"
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
            L7e:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " does not return an Object-type"
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
            L95:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " must declare exactly one abstract method"
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
            Lac:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " is mot public"
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
            Lc3:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " must not extend other interfaces"
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
            Lda:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " is not an interface"
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding<?> bind(net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.implementation.bind.annotation.Morph> r9, net.bytebuddy.description.method.MethodDescription r10, net.bytebuddy.description.method.ParameterDescription r11, net.bytebuddy.implementation.Implementation.Target r12, net.bytebuddy.implementation.bytecode.assign.Assigner r13, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r14) {
                r8 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r14 = r11.getType()
                net.bytebuddy.description.type.TypeDescription r14 = r14.asErasure()
                net.bytebuddy.description.method.MethodDescription r0 = r8.forwardingMethod
                net.bytebuddy.description.type.TypeDefinition r0 = r0.getDeclaringType()
                boolean r14 = r14.equals(r0)
                if (r14 == 0) goto L98
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r11 = net.bytebuddy.implementation.bind.annotation.Morph.Binder.DEFAULT_TARGET
                net.bytebuddy.description.annotation.AnnotationValue r11 = r9.getValue(r11)
                java.lang.Class<net.bytebuddy.description.type.TypeDescription> r14 = net.bytebuddy.description.type.TypeDescription.class
                java.lang.Object r11 = r11.resolve(r14)
                net.bytebuddy.description.type.TypeDescription r11 = (net.bytebuddy.description.type.TypeDescription) r11
                java.lang.Class r14 = java.lang.Void.TYPE
                boolean r0 = r11.represents(r14)
                java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
                if (r0 == 0) goto L50
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.implementation.bind.annotation.Morph.Binder.DEFAULT_METHOD
                net.bytebuddy.description.annotation.AnnotationValue r0 = r9.getValue(r0)
                java.lang.Object r0 = r0.resolve(r1)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 != 0) goto L50
                net.bytebuddy.description.method.MethodDescription$SignatureToken r11 = r10.asSignatureToken()
                net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r11 = r12.invokeSuper(r11)
                net.bytebuddy.description.method.MethodDescription$TypeToken r10 = r10.asTypeToken()
                net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r10 = r11.withCheckedCompatibilityTo(r10)
            L4e:
                r5 = r10
                goto L64
            L50:
                boolean r14 = r11.represents(r14)
                if (r14 == 0) goto L59
                net.bytebuddy.implementation.bind.annotation.Morph$Binder$DefaultMethodLocator$Implicit r11 = net.bytebuddy.implementation.bind.annotation.Morph.Binder.DefaultMethodLocator.Implicit.INSTANCE
                goto L5f
            L59:
                net.bytebuddy.implementation.bind.annotation.Morph$Binder$DefaultMethodLocator$Explicit r14 = new net.bytebuddy.implementation.bind.annotation.Morph$Binder$DefaultMethodLocator$Explicit
                r14.<init>(r11)
                r11 = r14
            L5f:
                net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r10 = r11.resolve(r12, r10)
                goto L4e
            L64:
                boolean r10 = r5.isValid()
                if (r10 == 0) goto L95
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r10 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous
                net.bytebuddy.implementation.bind.annotation.Morph$Binder$RedirectionProxy r11 = new net.bytebuddy.implementation.bind.annotation.Morph$Binder$RedirectionProxy
                net.bytebuddy.description.method.MethodDescription r14 = r8.forwardingMethod
                net.bytebuddy.description.type.TypeDefinition r14 = r14.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription r3 = r14.asErasure()
                net.bytebuddy.description.type.TypeDescription r4 = r12.getInstrumentedType()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r12 = net.bytebuddy.implementation.bind.annotation.Morph.Binder.SERIALIZABLE_PROXY
                net.bytebuddy.description.annotation.AnnotationValue r9 = r9.getValue(r12)
                java.lang.Object r9 = r9.resolve(r1)
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r7 = r9.booleanValue()
                r2 = r11
                r6 = r13
                r2.<init>(r3, r4, r5, r6, r7)
                r10.<init>(r11)
                goto L97
            L95:
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Illegal r10 = net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE
            L97:
                return r10
            L98:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r12 = "Illegal use of @Morph for "
                r10.append(r12)
                r10.append(r11)
                java.lang.String r11 = " which was installed for "
                r10.append(r11)
                net.bytebuddy.description.method.MethodDescription r11 = r8.forwardingMethod
                net.bytebuddy.description.type.TypeDefinition r11 = r11.getDeclaringType()
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                r9.<init>(r10)
                throw r9
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
                net.bytebuddy.description.method.MethodDescription r2 = r4.forwardingMethod
                net.bytebuddy.implementation.bind.annotation.Morph$Binder r5 = (net.bytebuddy.implementation.bind.annotation.Morph.Binder) r5
                net.bytebuddy.description.method.MethodDescription r5 = r5.forwardingMethod
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L20
                return r1
            L20:
                return r0
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public java.lang.Class<net.bytebuddy.implementation.bind.annotation.Morph> getHandledType() {
                r1 = this;
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.Morph> r0 = net.bytebuddy.implementation.bind.annotation.Morph.class
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.description.method.MethodDescription r1 = r2.forwardingMethod
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    boolean defaultMethod() default false;

    java.lang.Class<?> defaultTarget() default void.class;

    boolean serializableProxy() default false;
}
