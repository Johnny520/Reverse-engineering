package net.bytebuddy.implementation.bind.annotation;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface Pipe {

    /* JADX INFO: renamed from: net.bytebuddy.implementation.bind.annotation.Pipe$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Binder implements net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<net.bytebuddy.implementation.bind.annotation.Pipe> {
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape SERIALIZABLE_PROXY = null;
        private final net.bytebuddy.description.method.MethodDescription forwardingMethod;

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class RedirectionProxy extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase implements net.bytebuddy.implementation.auxiliary.AuxiliaryType {
            private static final java.lang.String FIELD_NAME_PREFIX = "argument";
            private final net.bytebuddy.implementation.bytecode.assign.Assigner assigner;
            private final net.bytebuddy.description.type.TypeDescription forwardingType;
            private final boolean serializableProxy;
            private final net.bytebuddy.description.method.MethodDescription sourceMethod;

            public enum ConstructorCall extends java.lang.Enum<net.bytebuddy.implementation.bind.annotation.Pipe.Binder.RedirectionProxy.ConstructorCall> implements net.bytebuddy.implementation.Implementation {
                private static final /* synthetic */ net.bytebuddy.implementation.bind.annotation.Pipe.Binder.RedirectionProxy.ConstructorCall[] $VALUES = null;
                public static final net.bytebuddy.implementation.bind.annotation.Pipe.Binder.RedirectionProxy.ConstructorCall INSTANCE = null;
                private final transient net.bytebuddy.description.method.MethodDescription.InDefinedShape objectTypeDefaultConstructor;

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class Appender implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
                    private final net.bytebuddy.description.type.TypeDescription instrumentedType;

                    private Appender(net.bytebuddy.description.type.TypeDescription r1) {
                            r0 = this;
                            r0.<init>()
                            r0.instrumentedType = r1
                            return
                    }

                    public /* synthetic */ Appender(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.implementation.bind.annotation.Pipe.AnonymousClass1 r2) {
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
                            net.bytebuddy.implementation.bind.annotation.Pipe$Binder$RedirectionProxy$ConstructorCall r7 = net.bytebuddy.implementation.bind.annotation.Pipe.Binder.RedirectionProxy.ConstructorCall.INSTANCE
                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r7 = net.bytebuddy.implementation.bind.annotation.Pipe.Binder.RedirectionProxy.ConstructorCall.access$200(r7)
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
                            net.bytebuddy.implementation.bind.annotation.Pipe$Binder$RedirectionProxy$ConstructorCall$Appender r5 = (net.bytebuddy.implementation.bind.annotation.Pipe.Binder.RedirectionProxy.ConstructorCall.Appender) r5
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
                        net.bytebuddy.implementation.bind.annotation.Pipe$Binder$RedirectionProxy$ConstructorCall r0 = new net.bytebuddy.implementation.bind.annotation.Pipe$Binder$RedirectionProxy$ConstructorCall
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.implementation.bind.annotation.Pipe.Binder.RedirectionProxy.ConstructorCall.INSTANCE = r0
                        net.bytebuddy.implementation.bind.annotation.Pipe$Binder$RedirectionProxy$ConstructorCall[] r0 = new net.bytebuddy.implementation.bind.annotation.Pipe.Binder.RedirectionProxy.ConstructorCall[]{r0}
                        net.bytebuddy.implementation.bind.annotation.Pipe.Binder.RedirectionProxy.ConstructorCall.$VALUES = r0
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
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                        r0.objectTypeDefaultConstructor = r1
                        return
                }

                public static /* synthetic */ net.bytebuddy.description.method.MethodDescription.InDefinedShape access$200(net.bytebuddy.implementation.bind.annotation.Pipe.Binder.RedirectionProxy.ConstructorCall r0) {
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r0.objectTypeDefaultConstructor
                        return r0
                }

                public static net.bytebuddy.implementation.bind.annotation.Pipe.Binder.RedirectionProxy.ConstructorCall valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.implementation.bind.annotation.Pipe$Binder$RedirectionProxy$ConstructorCall> r0 = net.bytebuddy.implementation.bind.annotation.Pipe.Binder.RedirectionProxy.ConstructorCall.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.implementation.bind.annotation.Pipe$Binder$RedirectionProxy$ConstructorCall r1 = (net.bytebuddy.implementation.bind.annotation.Pipe.Binder.RedirectionProxy.ConstructorCall) r1
                        return r1
                }

                public static net.bytebuddy.implementation.bind.annotation.Pipe.Binder.RedirectionProxy.ConstructorCall[] values() {
                        net.bytebuddy.implementation.bind.annotation.Pipe$Binder$RedirectionProxy$ConstructorCall[] r0 = net.bytebuddy.implementation.bind.annotation.Pipe.Binder.RedirectionProxy.ConstructorCall.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.implementation.bind.annotation.Pipe$Binder$RedirectionProxy$ConstructorCall[] r0 = (net.bytebuddy.implementation.bind.annotation.Pipe.Binder.RedirectionProxy.ConstructorCall[]) r0
                        return r0
                }

                @Override // net.bytebuddy.implementation.Implementation
                public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r3) {
                        r2 = this;
                        net.bytebuddy.implementation.bind.annotation.Pipe$Binder$RedirectionProxy$ConstructorCall$Appender r0 = new net.bytebuddy.implementation.bind.annotation.Pipe$Binder$RedirectionProxy$ConstructorCall$Appender
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
                private final net.bytebuddy.implementation.bytecode.assign.Assigner assigner;
                private final net.bytebuddy.description.method.MethodDescription redirectedMethod;

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                public class Appender implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
                    private final net.bytebuddy.description.type.TypeDescription instrumentedType;
                    final /* synthetic */ net.bytebuddy.implementation.bind.annotation.Pipe.Binder.RedirectionProxy.MethodCall this$0;

                    private Appender(net.bytebuddy.implementation.bind.annotation.Pipe.Binder.RedirectionProxy.MethodCall r1, net.bytebuddy.description.type.TypeDescription r2) {
                            r0 = this;
                            r0.this$0 = r1
                            r0.<init>()
                            r0.instrumentedType = r2
                            return
                    }

                    public /* synthetic */ Appender(net.bytebuddy.implementation.bind.annotation.Pipe.Binder.RedirectionProxy.MethodCall r1, net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.implementation.bind.annotation.Pipe.AnonymousClass1 r3) {
                            r0 = this;
                            r0.<init>(r1, r2)
                            return
                    }

                    @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
                    public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r13, net.bytebuddy.implementation.Implementation.Context r14, net.bytebuddy.description.method.MethodDescription r15) {
                            r12 = this;
                            r0 = 2
                            r1 = 1
                            net.bytebuddy.description.type.TypeDescription r2 = r12.instrumentedType
                            net.bytebuddy.description.field.FieldList r2 = r2.getDeclaredFields()
                            int r3 = r2.size()
                            net.bytebuddy.implementation.bytecode.StackManipulation[] r3 = new net.bytebuddy.implementation.bytecode.StackManipulation[r3]
                            java.util.Iterator r2 = r2.iterator()
                            r4 = 0
                            r5 = r4
                        L14:
                            boolean r6 = r2.hasNext()
                            if (r6 == 0) goto L3d
                            java.lang.Object r6 = r2.next()
                            net.bytebuddy.description.field.FieldDescription r6 = (net.bytebuddy.description.field.FieldDescription) r6
                            int r7 = r5 + 1
                            net.bytebuddy.implementation.bytecode.StackManipulation$Compound r8 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                            net.bytebuddy.implementation.bytecode.StackManipulation r9 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                            net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r6 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r6)
                            net.bytebuddy.implementation.bytecode.StackManipulation r6 = r6.read()
                            net.bytebuddy.implementation.bytecode.StackManipulation[] r10 = new net.bytebuddy.implementation.bytecode.StackManipulation[r0]
                            r10[r4] = r9
                            r10[r1] = r6
                            r8.<init>(r10)
                            r3[r5] = r8
                            r5 = r7
                            goto L14
                        L3d:
                            net.bytebuddy.implementation.bytecode.StackManipulation$Compound r2 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r5 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.REFERENCE
                            net.bytebuddy.implementation.bytecode.StackManipulation r5 = r5.loadFrom(r1)
                            net.bytebuddy.implementation.bind.annotation.Pipe$Binder$RedirectionProxy$MethodCall r6 = r12.this$0
                            net.bytebuddy.implementation.bytecode.assign.Assigner r6 = net.bytebuddy.implementation.bind.annotation.Pipe.Binder.RedirectionProxy.MethodCall.access$500(r6)
                            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
                            net.bytebuddy.description.type.TypeDescription$Generic r7 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r7)
                            net.bytebuddy.implementation.bind.annotation.Pipe$Binder$RedirectionProxy$MethodCall r8 = r12.this$0
                            net.bytebuddy.description.method.MethodDescription r8 = net.bytebuddy.implementation.bind.annotation.Pipe.Binder.RedirectionProxy.MethodCall.access$400(r8)
                            net.bytebuddy.description.type.TypeDefinition r8 = r8.getDeclaringType()
                            net.bytebuddy.description.type.TypeDescription$Generic r8 = r8.asGenericType()
                            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r9 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.DYNAMIC
                            net.bytebuddy.implementation.bytecode.StackManipulation r6 = r6.assign(r7, r8, r9)
                            net.bytebuddy.implementation.bytecode.StackManipulation$Compound r7 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                            r7.<init>(r3)
                            net.bytebuddy.implementation.bind.annotation.Pipe$Binder$RedirectionProxy$MethodCall r3 = r12.this$0
                            net.bytebuddy.description.method.MethodDescription r3 = net.bytebuddy.implementation.bind.annotation.Pipe.Binder.RedirectionProxy.MethodCall.access$400(r3)
                            net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r3 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r3)
                            net.bytebuddy.implementation.bind.annotation.Pipe$Binder$RedirectionProxy$MethodCall r8 = r12.this$0
                            net.bytebuddy.implementation.bytecode.assign.Assigner r8 = net.bytebuddy.implementation.bind.annotation.Pipe.Binder.RedirectionProxy.MethodCall.access$500(r8)
                            net.bytebuddy.implementation.bind.annotation.Pipe$Binder$RedirectionProxy$MethodCall r10 = r12.this$0
                            net.bytebuddy.description.method.MethodDescription r10 = net.bytebuddy.implementation.bind.annotation.Pipe.Binder.RedirectionProxy.MethodCall.access$400(r10)
                            net.bytebuddy.description.type.TypeDescription$Generic r10 = r10.getReturnType()
                            net.bytebuddy.description.type.TypeDescription$Generic r11 = r15.getReturnType()
                            net.bytebuddy.implementation.bytecode.StackManipulation r8 = r8.assign(r10, r11, r9)
                            r9 = 6
                            net.bytebuddy.implementation.bytecode.StackManipulation[] r9 = new net.bytebuddy.implementation.bytecode.StackManipulation[r9]
                            r9[r4] = r5
                            r9[r1] = r6
                            r9[r0] = r7
                            r0 = 3
                            r9[r0] = r3
                            r0 = 4
                            r9[r0] = r8
                            net.bytebuddy.implementation.bytecode.member.MethodReturn r0 = net.bytebuddy.implementation.bytecode.member.MethodReturn.REFERENCE
                            r1 = 5
                            r9[r1] = r0
                            r2.<init>(r9)
                            net.bytebuddy.implementation.bytecode.StackManipulation$Size r13 = r2.apply(r13, r14)
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
                            net.bytebuddy.implementation.bind.annotation.Pipe$Binder$RedirectionProxy$MethodCall$Appender r5 = (net.bytebuddy.implementation.bind.annotation.Pipe.Binder.RedirectionProxy.MethodCall.Appender) r5
                            net.bytebuddy.description.type.TypeDescription r3 = r5.instrumentedType
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L20
                            return r1
                        L20:
                            net.bytebuddy.implementation.bind.annotation.Pipe$Binder$RedirectionProxy$MethodCall r2 = r4.this$0
                            net.bytebuddy.implementation.bind.annotation.Pipe$Binder$RedirectionProxy$MethodCall r5 = r5.this$0
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
                            net.bytebuddy.implementation.bind.annotation.Pipe$Binder$RedirectionProxy$MethodCall r1 = r2.this$0
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }
                }

                private MethodCall(net.bytebuddy.description.method.MethodDescription r1, net.bytebuddy.implementation.bytecode.assign.Assigner r2) {
                        r0 = this;
                        r0.<init>()
                        r0.redirectedMethod = r1
                        r0.assigner = r2
                        return
                }

                public /* synthetic */ MethodCall(net.bytebuddy.description.method.MethodDescription r1, net.bytebuddy.implementation.bytecode.assign.Assigner r2, net.bytebuddy.implementation.bind.annotation.Pipe.AnonymousClass1 r3) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static /* synthetic */ net.bytebuddy.description.method.MethodDescription access$400(net.bytebuddy.implementation.bind.annotation.Pipe.Binder.RedirectionProxy.MethodCall r0) {
                        net.bytebuddy.description.method.MethodDescription r0 = r0.redirectedMethod
                        return r0
                }

                public static /* synthetic */ net.bytebuddy.implementation.bytecode.assign.Assigner access$500(net.bytebuddy.implementation.bind.annotation.Pipe.Binder.RedirectionProxy.MethodCall r0) {
                        net.bytebuddy.implementation.bytecode.assign.Assigner r0 = r0.assigner
                        return r0
                }

                @Override // net.bytebuddy.implementation.Implementation
                public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r3) {
                        r2 = this;
                        net.bytebuddy.description.method.MethodDescription r0 = r2.redirectedMethod
                        net.bytebuddy.description.type.TypeDescription r1 = r3.getInstrumentedType()
                        boolean r0 = r0.isAccessibleTo(r1)
                        if (r0 == 0) goto L17
                        net.bytebuddy.implementation.bind.annotation.Pipe$Binder$RedirectionProxy$MethodCall$Appender r0 = new net.bytebuddy.implementation.bind.annotation.Pipe$Binder$RedirectionProxy$MethodCall$Appender
                        net.bytebuddy.description.type.TypeDescription r3 = r3.getInstrumentedType()
                        r1 = 0
                        r0.<init>(r2, r3, r1)
                        return r0
                    L17:
                        java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        java.lang.String r1 = "Cannot invoke "
                        r0.append(r1)
                        net.bytebuddy.description.method.MethodDescription r1 = r2.redirectedMethod
                        r0.append(r1)
                        java.lang.String r1 = " from outside of class via @Pipe proxy"
                        r0.append(r1)
                        java.lang.String r0 = r0.toString()
                        r3.<init>(r0)
                        throw r3
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
                        net.bytebuddy.description.method.MethodDescription r2 = r4.redirectedMethod
                        net.bytebuddy.implementation.bind.annotation.Pipe$Binder$RedirectionProxy$MethodCall r5 = (net.bytebuddy.implementation.bind.annotation.Pipe.Binder.RedirectionProxy.MethodCall) r5
                        net.bytebuddy.description.method.MethodDescription r3 = r5.redirectedMethod
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
                        net.bytebuddy.description.method.MethodDescription r1 = r2.redirectedMethod
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

            public RedirectionProxy(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.implementation.bytecode.assign.Assigner r3, boolean r4) {
                    r0 = this;
                    r0.<init>()
                    r0.forwardingType = r1
                    r0.sourceMethod = r2
                    r0.assigner = r3
                    r0.serializableProxy = r4
                    return
            }

            private static java.util.LinkedHashMap<java.lang.String, net.bytebuddy.description.type.TypeDescription> extractFields(net.bytebuddy.description.method.MethodDescription r4) {
                    net.bytebuddy.description.method.ParameterList r4 = r4.getParameters()
                    net.bytebuddy.description.type.TypeList$Generic r4 = r4.asTypeList()
                    net.bytebuddy.description.type.TypeList r4 = r4.asErasures()
                    java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                    r0.<init>()
                    java.util.Iterator r4 = r4.iterator()
                    r1 = 0
                L16:
                    boolean r2 = r4.hasNext()
                    if (r2 == 0) goto L2d
                    java.lang.Object r2 = r4.next()
                    net.bytebuddy.description.type.TypeDescription r2 = (net.bytebuddy.description.type.TypeDescription) r2
                    int r3 = r1 + 1
                    java.lang.String r1 = fieldName(r1)
                    r0.put(r1, r2)
                    r1 = r3
                    goto L16
                L2d:
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

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r7, net.bytebuddy.implementation.Implementation.Context r8) {
                    r6 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r8.register(r6)
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r1 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.TypeCreation.of(r0)
                    net.bytebuddy.description.method.MethodDescription r3 = r6.sourceMethod
                    net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$MethodLoading r3 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.allArgumentsOf(r3)
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
                    net.bytebuddy.implementation.bind.annotation.Pipe$Binder$RedirectionProxy r5 = (net.bytebuddy.implementation.bind.annotation.Pipe.Binder.RedirectionProxy) r5
                    boolean r3 = r5.serializableProxy
                    if (r2 == r3) goto L1c
                    return r1
                L1c:
                    net.bytebuddy.description.type.TypeDescription r2 = r4.forwardingType
                    net.bytebuddy.description.type.TypeDescription r3 = r5.forwardingType
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L27
                    return r1
                L27:
                    net.bytebuddy.description.method.MethodDescription r2 = r4.sourceMethod
                    net.bytebuddy.description.method.MethodDescription r3 = r5.sourceMethod
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L32
                    return r1
                L32:
                    net.bytebuddy.implementation.bytecode.assign.Assigner r2 = r4.assigner
                    net.bytebuddy.implementation.bytecode.assign.Assigner r5 = r5.assigner
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L3d
                    return r1
                L3d:
                    return r0
            }

            @Override // net.bytebuddy.implementation.auxiliary.AuxiliaryType
            public java.lang.String getSuffix() {
                    r2 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    net.bytebuddy.description.type.TypeDescription r1 = r2.forwardingType
                    int r1 = r1.hashCode()
                    java.lang.String r1 = net.bytebuddy.utility.RandomString.hashOf(r1)
                    r0.append(r1)
                    net.bytebuddy.description.method.MethodDescription r1 = r2.sourceMethod
                    int r1 = r1.hashCode()
                    java.lang.String r1 = net.bytebuddy.utility.RandomString.hashOf(r1)
                    r0.append(r1)
                    boolean r1 = r2.serializableProxy
                    if (r1 == 0) goto L26
                    java.lang.String r1 = "S"
                    goto L28
                L26:
                    java.lang.String r1 = "0"
                L28:
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.description.type.TypeDescription r1 = r2.forwardingType
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.description.method.MethodDescription r1 = r2.sourceMethod
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
            public net.bytebuddy.dynamic.DynamicType make(java.lang.String r6, net.bytebuddy.ClassFileVersion r7, net.bytebuddy.implementation.MethodAccessorFactory r8) {
                    r5 = this;
                    r8 = 1
                    net.bytebuddy.description.method.MethodDescription r0 = r5.sourceMethod
                    java.util.LinkedHashMap r0 = extractFields(r0)
                    net.bytebuddy.ByteBuddy r1 = new net.bytebuddy.ByteBuddy
                    r1.<init>(r7)
                    net.bytebuddy.dynamic.scaffold.TypeValidation r7 = net.bytebuddy.dynamic.scaffold.TypeValidation.DISABLED
                    net.bytebuddy.ByteBuddy r7 = r1.with(r7)
                    net.bytebuddy.description.type.TypeDescription r1 = r5.forwardingType
                    net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default r2 = net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default.NO_CONSTRUCTORS
                    net.bytebuddy.dynamic.DynamicType$Builder r7 = r7.subclass(r1, r2)
                    net.bytebuddy.dynamic.DynamicType$Builder r6 = r7.name(r6)
                    net.bytebuddy.description.modifier.ModifierContributor$ForType[] r7 = net.bytebuddy.implementation.auxiliary.AuxiliaryType.DEFAULT_TYPE_MODIFIER
                    net.bytebuddy.dynamic.DynamicType$Builder r6 = r6.modifiers(r7)
                    boolean r7 = r5.serializableProxy
                    r1 = 0
                    if (r7 == 0) goto L30
                    java.lang.Class[] r7 = new java.lang.Class[r8]
                    java.lang.Class<java.io.Serializable> r2 = java.io.Serializable.class
                    r7[r1] = r2
                    goto L32
                L30:
                    java.lang.Class[] r7 = new java.lang.Class[r1]
                L32:
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition$Optional r6 = r6.implement(r7)
                    net.bytebuddy.matcher.ElementMatcher$Junction r7 = net.bytebuddy.matcher.ElementMatchers.isAbstract()
                    net.bytebuddy.description.type.TypeDescription r2 = r5.forwardingType
                    net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.isDeclaredBy(r2)
                    net.bytebuddy.matcher.ElementMatcher$Junction r7 = r7.and(r2)
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r6 = r6.method(r7)
                    net.bytebuddy.implementation.bind.annotation.Pipe$Binder$RedirectionProxy$MethodCall r7 = new net.bytebuddy.implementation.bind.annotation.Pipe$Binder$RedirectionProxy$MethodCall
                    net.bytebuddy.description.method.MethodDescription r2 = r5.sourceMethod
                    net.bytebuddy.implementation.bytecode.assign.Assigner r3 = r5.assigner
                    r4 = 0
                    r7.<init>(r2, r3, r4)
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r6 = r6.intercept(r7)
                    net.bytebuddy.description.modifier.ModifierContributor$ForMethod[] r7 = new net.bytebuddy.description.modifier.ModifierContributor.ForMethod[r1]
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r6 = r6.defineConstructor(r7)
                    java.util.Collection r7 = r0.values()
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition r6 = r6.withParameters(r7)
                    net.bytebuddy.implementation.bind.annotation.Pipe$Binder$RedirectionProxy$ConstructorCall r7 = net.bytebuddy.implementation.bind.annotation.Pipe.Binder.RedirectionProxy.ConstructorCall.INSTANCE
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r6 = r6.intercept(r7)
                    java.util.Set r7 = r0.entrySet()
                    java.util.Iterator r7 = r7.iterator()
                L72:
                    boolean r0 = r7.hasNext()
                    if (r0 == 0) goto L95
                    java.lang.Object r0 = r7.next()
                    java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                    java.lang.Object r2 = r0.getKey()
                    java.lang.String r2 = (java.lang.String) r2
                    java.lang.Object r0 = r0.getValue()
                    net.bytebuddy.description.type.TypeDefinition r0 = (net.bytebuddy.description.type.TypeDefinition) r0
                    net.bytebuddy.description.modifier.ModifierContributor$ForField[] r3 = new net.bytebuddy.description.modifier.ModifierContributor.ForField[r8]
                    net.bytebuddy.description.modifier.Visibility r4 = net.bytebuddy.description.modifier.Visibility.PRIVATE
                    r3[r1] = r4
                    net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional$Valuable r6 = r6.defineField(r2, r0, r3)
                    goto L72
                L95:
                    net.bytebuddy.dynamic.DynamicType$Unloaded r6 = r6.make()
                    return r6
            }
        }

        static {
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.Pipe> r0 = net.bytebuddy.implementation.bind.annotation.Pipe.class
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                java.lang.String r1 = "serializableProxy"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                java.lang.Object r0 = r0.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                net.bytebuddy.implementation.bind.annotation.Pipe.Binder.SERIALIZABLE_PROXY = r0
                return
        }

        public Binder(net.bytebuddy.description.method.MethodDescription r1) {
                r0 = this;
                r0.<init>()
                r0.forwardingMethod = r1
                return
        }

        public static net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<net.bytebuddy.implementation.bind.annotation.Pipe> install(java.lang.Class<?> r0) {
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder r0 = install(r0)
                return r0
        }

        public static net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<net.bytebuddy.implementation.bind.annotation.Pipe> install(net.bytebuddy.description.type.TypeDescription r1) {
                net.bytebuddy.implementation.bind.annotation.Pipe$Binder r0 = new net.bytebuddy.implementation.bind.annotation.Pipe$Binder
                net.bytebuddy.description.method.MethodDescription r1 = onlyMethod(r1)
                r0.<init>(r1)
                return r0
        }

        private static net.bytebuddy.description.method.MethodDescription onlyMethod(net.bytebuddy.description.type.TypeDescription r3) {
                boolean r0 = r3.isInterface()
                if (r0 == 0) goto Ld7
                net.bytebuddy.description.type.TypeList$Generic r0 = r3.getInterfaces()
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto Lc0
                boolean r0 = r3.isPublic()
                if (r0 == 0) goto La9
                net.bytebuddy.description.method.MethodList r0 = r3.getDeclaredMethods()
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.isAbstract()
                net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                int r1 = r0.size()
                r2 = 1
                if (r1 != r2) goto L92
                java.lang.Object r3 = r0.getOnly()
                net.bytebuddy.description.method.MethodDescription r3 = (net.bytebuddy.description.method.MethodDescription) r3
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.getReturnType()
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                boolean r0 = r0.represents(r1)
                if (r0 == 0) goto L7b
                net.bytebuddy.description.method.ParameterList r0 = r3.getParameters()
                int r0 = r0.size()
                if (r0 != r2) goto L64
                net.bytebuddy.description.method.ParameterList r0 = r3.getParameters()
                java.lang.Object r0 = r0.getOnly()
                net.bytebuddy.description.method.ParameterDescription r0 = (net.bytebuddy.description.method.ParameterDescription) r0
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getType()
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                boolean r0 = r0.represents(r1)
                if (r0 == 0) goto L64
                return r3
            L64:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " does not take a single Object-typed argument"
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
            L7b:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " does not return an Object-type"
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
            L92:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " must declare exactly one abstract method"
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
            La9:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " is mot public"
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
            Lc0:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " must not extend other interfaces"
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
            Ld7:
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
        public net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding<?> bind(net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.implementation.bind.annotation.Pipe> r2, net.bytebuddy.description.method.MethodDescription r3, net.bytebuddy.description.method.ParameterDescription r4, net.bytebuddy.implementation.Implementation.Target r5, net.bytebuddy.implementation.bytecode.assign.Assigner r6, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r7) {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r5 = r4.getType()
                net.bytebuddy.description.type.TypeDescription r5 = r5.asErasure()
                net.bytebuddy.description.method.MethodDescription r7 = r1.forwardingMethod
                net.bytebuddy.description.type.TypeDefinition r7 = r7.getDeclaringType()
                boolean r5 = r5.equals(r7)
                if (r5 == 0) goto L44
                boolean r4 = r3.isStatic()
                if (r4 == 0) goto L1d
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Illegal r2 = net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE
                return r2
            L1d:
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r4 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous
                net.bytebuddy.implementation.bind.annotation.Pipe$Binder$RedirectionProxy r5 = new net.bytebuddy.implementation.bind.annotation.Pipe$Binder$RedirectionProxy
                net.bytebuddy.description.method.MethodDescription r7 = r1.forwardingMethod
                net.bytebuddy.description.type.TypeDefinition r7 = r7.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription r7 = r7.asErasure()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.implementation.bind.annotation.Pipe.Binder.SERIALIZABLE_PROXY
                net.bytebuddy.description.annotation.AnnotationValue r2 = r2.getValue(r0)
                java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
                java.lang.Object r2 = r2.resolve(r0)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                r5.<init>(r7, r3, r6, r2)
                r4.<init>(r5)
                return r4
            L44:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = "Illegal use of @Pipe for "
                r3.append(r5)
                r3.append(r4)
                java.lang.String r4 = " which was installed for "
                r3.append(r4)
                net.bytebuddy.description.method.MethodDescription r4 = r1.forwardingMethod
                net.bytebuddy.description.type.TypeDefinition r4 = r4.getDeclaringType()
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
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
                net.bytebuddy.implementation.bind.annotation.Pipe$Binder r5 = (net.bytebuddy.implementation.bind.annotation.Pipe.Binder) r5
                net.bytebuddy.description.method.MethodDescription r5 = r5.forwardingMethod
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L20
                return r1
            L20:
                return r0
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public java.lang.Class<net.bytebuddy.implementation.bind.annotation.Pipe> getHandledType() {
                r1 = this;
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.Pipe> r0 = net.bytebuddy.implementation.bind.annotation.Pipe.class
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

    boolean serializableProxy() default false;
}
