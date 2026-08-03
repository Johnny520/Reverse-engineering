package net.bytebuddy.implementation;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class MethodDelegation implements net.bytebuddy.implementation.Implementation.Composable {
    private final net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver ambiguityResolver;
    private final net.bytebuddy.implementation.bytecode.assign.Assigner assigner;
    private final net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver bindingResolver;
    private final net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate implementationDelegate;
    private final java.util.List<net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<?>> parameterBinders;
    private final net.bytebuddy.implementation.bind.MethodDelegationBinder.TerminationHandler terminationHandler;

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Appender implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
        private final net.bytebuddy.implementation.bytecode.assign.Assigner assigner;
        private final net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.Compiled compiled;
        private final net.bytebuddy.implementation.Implementation.Target implementationTarget;
        private final net.bytebuddy.implementation.bind.MethodDelegationBinder.Record processor;
        private final net.bytebuddy.implementation.bind.MethodDelegationBinder.TerminationHandler terminationHandler;

        public Appender(net.bytebuddy.implementation.Implementation.Target r1, net.bytebuddy.implementation.bind.MethodDelegationBinder.Record r2, net.bytebuddy.implementation.bind.MethodDelegationBinder.TerminationHandler r3, net.bytebuddy.implementation.bytecode.assign.Assigner r4, net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.Compiled r5) {
                r0 = this;
                r0.<init>()
                r0.implementationTarget = r1
                r0.processor = r2
                r0.terminationHandler = r3
                r0.assigner = r4
                r0.compiled = r5
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r9, net.bytebuddy.implementation.Implementation.Context r10, net.bytebuddy.description.method.MethodDescription r11) {
                r8 = this;
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate$Compiled r1 = r8.compiled
                net.bytebuddy.implementation.bytecode.StackManipulation r1 = r1.prepare(r11)
                net.bytebuddy.implementation.bind.MethodDelegationBinder$Record r2 = r8.processor
                net.bytebuddy.implementation.Implementation$Target r3 = r8.implementationTarget
                net.bytebuddy.implementation.bind.MethodDelegationBinder$TerminationHandler r5 = r8.terminationHandler
                net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate$Compiled r4 = r8.compiled
                net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodInvoker r6 = r4.invoke()
                net.bytebuddy.implementation.bytecode.assign.Assigner r7 = r8.assigner
                r4 = r11
                net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodBinding r2 = r2.bind(r3, r4, r5, r6, r7)
                r3 = 2
                net.bytebuddy.implementation.bytecode.StackManipulation[] r3 = new net.bytebuddy.implementation.bytecode.StackManipulation[r3]
                r4 = 0
                r3[r4] = r1
                r1 = 1
                r3[r1] = r2
                r0.<init>(r3)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r9 = r0.apply(r9, r10)
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r10 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                int r9 = r9.getMaximalSize()
                int r11 = r11.getStackSize()
                r10.<init>(r9, r11)
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
                net.bytebuddy.implementation.Implementation$Target r2 = r4.implementationTarget
                net.bytebuddy.implementation.MethodDelegation$Appender r5 = (net.bytebuddy.implementation.MethodDelegation.Appender) r5
                net.bytebuddy.implementation.Implementation$Target r3 = r5.implementationTarget
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                net.bytebuddy.implementation.bind.MethodDelegationBinder$Record r2 = r4.processor
                net.bytebuddy.implementation.bind.MethodDelegationBinder$Record r3 = r5.processor
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L2b
                return r1
            L2b:
                net.bytebuddy.implementation.bind.MethodDelegationBinder$TerminationHandler r2 = r4.terminationHandler
                net.bytebuddy.implementation.bind.MethodDelegationBinder$TerminationHandler r3 = r5.terminationHandler
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L36
                return r1
            L36:
                net.bytebuddy.implementation.bytecode.assign.Assigner r2 = r4.assigner
                net.bytebuddy.implementation.bytecode.assign.Assigner r3 = r5.assigner
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L41
                return r1
            L41:
                net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate$Compiled r2 = r4.compiled
                net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate$Compiled r5 = r5.compiled
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L4c
                return r1
            L4c:
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
                net.bytebuddy.implementation.bind.MethodDelegationBinder$Record r1 = r2.processor
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.bind.MethodDelegationBinder$TerminationHandler r1 = r2.terminationHandler
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.bytecode.assign.Assigner r1 = r2.assigner
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate$Compiled r1 = r2.compiled
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    public interface ImplementationDelegate extends net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable {
        public static final java.lang.String FIELD_NAME_PREFIX = "delegate";

        public interface Compiled {

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForConstruction implements net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.Compiled {
                private final java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder.Record> records;
                private final net.bytebuddy.description.type.TypeDescription typeDescription;

                public ForConstruction(net.bytebuddy.description.type.TypeDescription r1, java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder.Record> r2) {
                        r0 = this;
                        r0.<init>()
                        r0.typeDescription = r1
                        r0.records = r2
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
                        net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate$Compiled$ForConstruction r5 = (net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.Compiled.ForConstruction) r5
                        net.bytebuddy.description.type.TypeDescription r3 = r5.typeDescription
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder$Record> r2 = r4.records
                        java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder$Record> r5 = r5.records
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L2b
                        return r1
                    L2b:
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.Compiled
                public java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder.Record> getRecords() {
                        r1 = this;
                        java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder$Record> r0 = r1.records
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
                        java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder$Record> r1 = r2.records
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.Compiled
                public net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker invoke() {
                        r1 = this;
                        net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodInvoker$Simple r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker.Simple.INSTANCE
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.Compiled
                public net.bytebuddy.implementation.bytecode.StackManipulation prepare(net.bytebuddy.description.method.MethodDescription r4) {
                        r3 = this;
                        net.bytebuddy.implementation.bytecode.StackManipulation$Compound r4 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                        net.bytebuddy.description.type.TypeDescription r0 = r3.typeDescription
                        net.bytebuddy.implementation.bytecode.StackManipulation r0 = net.bytebuddy.implementation.bytecode.TypeCreation.of(r0)
                        r1 = 2
                        net.bytebuddy.implementation.bytecode.StackManipulation[] r1 = new net.bytebuddy.implementation.bytecode.StackManipulation[r1]
                        r2 = 0
                        r1[r2] = r0
                        net.bytebuddy.implementation.bytecode.Duplication r0 = net.bytebuddy.implementation.bytecode.Duplication.SINGLE
                        r2 = 1
                        r1[r2] = r0
                        r4.<init>(r1)
                        return r4
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForField implements net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.Compiled {
                private final net.bytebuddy.description.field.FieldDescription fieldDescription;
                private final java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder.Record> records;

                public ForField(net.bytebuddy.description.field.FieldDescription r1, java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder.Record> r2) {
                        r0 = this;
                        r0.<init>()
                        r0.fieldDescription = r1
                        r0.records = r2
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
                        net.bytebuddy.description.field.FieldDescription r2 = r4.fieldDescription
                        net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate$Compiled$ForField r5 = (net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.Compiled.ForField) r5
                        net.bytebuddy.description.field.FieldDescription r3 = r5.fieldDescription
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder$Record> r2 = r4.records
                        java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder$Record> r5 = r5.records
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L2b
                        return r1
                    L2b:
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.Compiled
                public java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder.Record> getRecords() {
                        r1 = this;
                        java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder$Record> r0 = r1.records
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
                        int r0 = r0 * 31
                        java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder$Record> r1 = r2.records
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.Compiled
                public net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker invoke() {
                        r2 = this;
                        net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodInvoker$Virtual r0 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodInvoker$Virtual
                        net.bytebuddy.description.field.FieldDescription r1 = r2.fieldDescription
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r1.getType()
                        net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                        r0.<init>(r1)
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.Compiled
                public net.bytebuddy.implementation.bytecode.StackManipulation prepare(net.bytebuddy.description.method.MethodDescription r5) {
                        r4 = this;
                        boolean r0 = r5.isStatic()
                        if (r0 == 0) goto L30
                        net.bytebuddy.description.field.FieldDescription r0 = r4.fieldDescription
                        boolean r0 = r0.isStatic()
                        if (r0 == 0) goto Lf
                        goto L30
                    Lf:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "Cannot read "
                        r1.append(r2)
                        net.bytebuddy.description.field.FieldDescription r2 = r4.fieldDescription
                        r1.append(r2)
                        java.lang.String r2 = " from "
                        r1.append(r2)
                        r1.append(r5)
                        java.lang.String r5 = r1.toString()
                        r0.<init>(r5)
                        throw r0
                    L30:
                        net.bytebuddy.implementation.bytecode.StackManipulation$Compound r5 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                        net.bytebuddy.description.field.FieldDescription r0 = r4.fieldDescription
                        boolean r0 = r0.isStatic()
                        if (r0 == 0) goto L3d
                        net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r0 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
                        goto L41
                    L3d:
                        net.bytebuddy.implementation.bytecode.StackManipulation r0 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                    L41:
                        net.bytebuddy.description.field.FieldDescription r1 = r4.fieldDescription
                        net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r1 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r1)
                        net.bytebuddy.implementation.bytecode.StackManipulation r1 = r1.read()
                        r2 = 2
                        net.bytebuddy.implementation.bytecode.StackManipulation[] r2 = new net.bytebuddy.implementation.bytecode.StackManipulation[r2]
                        r3 = 0
                        r2[r3] = r0
                        r0 = 1
                        r2[r0] = r1
                        r5.<init>(r2)
                        return r5
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForMethodReturn implements net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.Compiled {
                private final net.bytebuddy.description.method.MethodDescription methodDescription;
                private final java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder.Record> records;

                public ForMethodReturn(net.bytebuddy.description.method.MethodDescription r1, java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder.Record> r2) {
                        r0 = this;
                        r0.<init>()
                        r0.methodDescription = r1
                        r0.records = r2
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
                        net.bytebuddy.description.method.MethodDescription r2 = r4.methodDescription
                        net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate$Compiled$ForMethodReturn r5 = (net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.Compiled.ForMethodReturn) r5
                        net.bytebuddy.description.method.MethodDescription r3 = r5.methodDescription
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder$Record> r2 = r4.records
                        java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder$Record> r5 = r5.records
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L2b
                        return r1
                    L2b:
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.Compiled
                public java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder.Record> getRecords() {
                        r1 = this;
                        java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder$Record> r0 = r1.records
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
                        java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder$Record> r1 = r2.records
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.Compiled
                public net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker invoke() {
                        r2 = this;
                        net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodInvoker$Virtual r0 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodInvoker$Virtual
                        net.bytebuddy.description.method.MethodDescription r1 = r2.methodDescription
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r1.getReturnType()
                        net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                        r0.<init>(r1)
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.Compiled
                public net.bytebuddy.implementation.bytecode.StackManipulation prepare(net.bytebuddy.description.method.MethodDescription r5) {
                        r4 = this;
                        boolean r0 = r5.isStatic()
                        if (r0 == 0) goto L30
                        net.bytebuddy.description.method.MethodDescription r0 = r4.methodDescription
                        boolean r0 = r0.isStatic()
                        if (r0 == 0) goto Lf
                        goto L30
                    Lf:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "Cannot invoke "
                        r1.append(r2)
                        net.bytebuddy.description.method.MethodDescription r2 = r4.methodDescription
                        r1.append(r2)
                        java.lang.String r2 = " from "
                        r1.append(r2)
                        r1.append(r5)
                        java.lang.String r5 = r1.toString()
                        r0.<init>(r5)
                        throw r0
                    L30:
                        net.bytebuddy.implementation.bytecode.StackManipulation$Compound r5 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                        net.bytebuddy.description.method.MethodDescription r0 = r4.methodDescription
                        boolean r0 = r0.isStatic()
                        if (r0 == 0) goto L3d
                        net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r0 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
                        goto L41
                    L3d:
                        net.bytebuddy.implementation.bytecode.StackManipulation r0 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                    L41:
                        net.bytebuddy.description.method.MethodDescription r1 = r4.methodDescription
                        net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r1 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r1)
                        r2 = 2
                        net.bytebuddy.implementation.bytecode.StackManipulation[] r2 = new net.bytebuddy.implementation.bytecode.StackManipulation[r2]
                        r3 = 0
                        r2[r3] = r0
                        r0 = 1
                        r2[r0] = r1
                        r5.<init>(r2)
                        return r5
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForStaticCall implements net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.Compiled {
                private final java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder.Record> records;

                public ForStaticCall(java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder.Record> r1) {
                        r0 = this;
                        r0.<init>()
                        r0.records = r1
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
                        java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder$Record> r2 = r4.records
                        net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate$Compiled$ForStaticCall r5 = (net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.Compiled.ForStaticCall) r5
                        java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder$Record> r5 = r5.records
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L20
                        return r1
                    L20:
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.Compiled
                public java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder.Record> getRecords() {
                        r1 = this;
                        java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder$Record> r0 = r1.records
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder$Record> r1 = r2.records
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.Compiled
                public net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker invoke() {
                        r1 = this;
                        net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodInvoker$Simple r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker.Simple.INSTANCE
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.Compiled
                public net.bytebuddy.implementation.bytecode.StackManipulation prepare(net.bytebuddy.description.method.MethodDescription r1) {
                        r0 = this;
                        net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r1 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
                        return r1
                }
            }

            java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder.Record> getRecords();

            net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker invoke();

            net.bytebuddy.implementation.bytecode.StackManipulation prepare(net.bytebuddy.description.method.MethodDescription r1);
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForConstruction implements net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate {
            private final java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder.Record> records;
            private final net.bytebuddy.description.type.TypeDescription typeDescription;

            public ForConstruction(net.bytebuddy.description.type.TypeDescription r1, java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder.Record> r2) {
                    r0 = this;
                    r0.<init>()
                    r0.typeDescription = r1
                    r0.records = r2
                    return
            }

            public static net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate of(net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.description.method.MethodList<?> r3, net.bytebuddy.implementation.bind.MethodDelegationBinder r4) {
                    java.util.ArrayList r0 = new java.util.ArrayList
                    int r1 = r3.size()
                    r0.<init>(r1)
                    java.util.Iterator r3 = r3.iterator()
                Ld:
                    boolean r1 = r3.hasNext()
                    if (r1 == 0) goto L21
                    java.lang.Object r1 = r3.next()
                    net.bytebuddy.description.method.MethodDescription r1 = (net.bytebuddy.description.method.MethodDescription) r1
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$Record r1 = r4.compile(r1)
                    r0.add(r1)
                    goto Ld
                L21:
                    net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate$ForConstruction r3 = new net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate$ForConstruction
                    r3.<init>(r2, r0)
                    return r3
            }

            @Override // net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate
            public net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.Compiled compile(net.bytebuddy.description.type.TypeDescription r3) {
                    r2 = this;
                    net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate$Compiled$ForConstruction r3 = new net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate$Compiled$ForConstruction
                    net.bytebuddy.description.type.TypeDescription r0 = r2.typeDescription
                    java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder$Record> r1 = r2.records
                    r3.<init>(r0, r1)
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
                    net.bytebuddy.description.type.TypeDescription r2 = r4.typeDescription
                    net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate$ForConstruction r5 = (net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.ForConstruction) r5
                    net.bytebuddy.description.type.TypeDescription r3 = r5.typeDescription
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder$Record> r2 = r4.records
                    java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder$Record> r5 = r5.records
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
                    java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder$Record> r1 = r2.records
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

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static abstract class ForField implements net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate {
            protected final java.lang.String fieldName;
            protected final net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> matcher;
            protected final net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler methodGraphCompiler;
            protected final java.util.List<? extends net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<?>> parameterBinders;

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class WithInstance extends net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.ForField {
                private final net.bytebuddy.description.type.TypeDescription.Generic fieldType;
                private final java.lang.Object target;

                public WithInstance(java.lang.String r1, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r2, java.util.List<? extends net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<?>> r3, net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r4, java.lang.Object r5, net.bytebuddy.description.type.TypeDescription.Generic r6) {
                        r0 = this;
                        r0.<init>(r1, r2, r3, r4)
                        r0.target = r5
                        r0.fieldType = r6
                        return
                }

                @Override // net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.ForField
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
                        java.lang.Object r2 = r4.target
                        net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate$ForField$WithInstance r5 = (net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.ForField.WithInstance) r5
                        java.lang.Object r3 = r5.target
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L27
                        return r1
                    L27:
                        net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.fieldType
                        net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.fieldType
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L32
                        return r1
                    L32:
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.ForField
                public int hashCode() {
                        r2 = this;
                        int r0 = super.hashCode()
                        int r0 = r0 * 31
                        java.lang.Object r1 = r2.target
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.fieldType
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r5) {
                        r4 = this;
                        net.bytebuddy.description.field.FieldDescription$Token r0 = new net.bytebuddy.description.field.FieldDescription$Token
                        java.lang.String r1 = r4.fieldName
                        r2 = 4169(0x1049, float:5.842E-42)
                        net.bytebuddy.description.type.TypeDescription$Generic r3 = r4.fieldType
                        r0.<init>(r1, r2, r3)
                        java.lang.Object r1 = r4.target
                        net.bytebuddy.dynamic.scaffold.InstrumentedType r5 = r5.withAuxiliaryField(r0, r1)
                        return r5
                }

                @Override // net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.ForField
                public net.bytebuddy.description.field.FieldDescription resolve(net.bytebuddy.description.type.TypeDescription r4) {
                        r3 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.fieldType
                        net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                        boolean r0 = r0.isVisibleTo(r4)
                        if (r0 == 0) goto L31
                        net.bytebuddy.description.field.FieldList r4 = r4.getDeclaredFields()
                        java.lang.String r0 = r3.fieldName
                        net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.named(r0)
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r3.fieldType
                        net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                        net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.fieldType(r1)
                        net.bytebuddy.matcher.ElementMatcher$Junction r0 = r0.and(r1)
                        net.bytebuddy.matcher.FilterableList r4 = r4.filter(r0)
                        net.bytebuddy.description.field.FieldList r4 = (net.bytebuddy.description.field.FieldList) r4
                        java.lang.Object r4 = r4.getOnly()
                        net.bytebuddy.description.field.FieldDescription r4 = (net.bytebuddy.description.field.FieldDescription) r4
                        return r4
                    L31:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        net.bytebuddy.description.type.TypeDescription$Generic r2 = r3.fieldType
                        r1.append(r2)
                        java.lang.String r2 = " is not visible to "
                        r1.append(r2)
                        r1.append(r4)
                        java.lang.String r4 = r1.toString()
                        r0.<init>(r4)
                        throw r0
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class WithLookup extends net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.ForField {
                private final net.bytebuddy.dynamic.scaffold.FieldLocator.Factory fieldLocatorFactory;

                public WithLookup(java.lang.String r1, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r2, java.util.List<? extends net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<?>> r3, net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r4, net.bytebuddy.dynamic.scaffold.FieldLocator.Factory r5) {
                        r0 = this;
                        r0.<init>(r1, r2, r3, r4)
                        r0.fieldLocatorFactory = r5
                        return
                }

                @Override // net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.ForField
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
                        net.bytebuddy.dynamic.scaffold.FieldLocator$Factory r2 = r4.fieldLocatorFactory
                        net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate$ForField$WithLookup r5 = (net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.ForField.WithLookup) r5
                        net.bytebuddy.dynamic.scaffold.FieldLocator$Factory r5 = r5.fieldLocatorFactory
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L27
                        return r1
                    L27:
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.ForField
                public int hashCode() {
                        r2 = this;
                        int r0 = super.hashCode()
                        int r0 = r0 * 31
                        net.bytebuddy.dynamic.scaffold.FieldLocator$Factory r1 = r2.fieldLocatorFactory
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                        r0 = this;
                        return r1
                }

                @Override // net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.ForField
                public net.bytebuddy.description.field.FieldDescription resolve(net.bytebuddy.description.type.TypeDescription r4) {
                        r3 = this;
                        net.bytebuddy.dynamic.scaffold.FieldLocator$Factory r0 = r3.fieldLocatorFactory
                        net.bytebuddy.dynamic.scaffold.FieldLocator r0 = r0.make(r4)
                        java.lang.String r1 = r3.fieldName
                        net.bytebuddy.dynamic.scaffold.FieldLocator$Resolution r0 = r0.locate(r1)
                        boolean r1 = r0.isResolved()
                        if (r1 == 0) goto L17
                        net.bytebuddy.description.field.FieldDescription r4 = r0.getField()
                        return r4
                    L17:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "Could not locate "
                        r1.append(r2)
                        java.lang.String r2 = r3.fieldName
                        r1.append(r2)
                        java.lang.String r2 = " on "
                        r1.append(r2)
                        r1.append(r4)
                        java.lang.String r4 = r1.toString()
                        r0.<init>(r4)
                        throw r0
                }
            }

            public ForField(java.lang.String r1, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r2, java.util.List<? extends net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<?>> r3, net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r4) {
                    r0 = this;
                    r0.<init>()
                    r0.fieldName = r1
                    r0.methodGraphCompiler = r2
                    r0.parameterBinders = r3
                    r0.matcher = r4
                    return
            }

            @Override // net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate
            public net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.Compiled compile(net.bytebuddy.description.type.TypeDescription r5) {
                    r4 = this;
                    net.bytebuddy.description.field.FieldDescription r0 = r4.resolve(r5)
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.getType()
                    net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                    boolean r1 = r1.isVisibleTo(r5)
                    if (r1 == 0) goto L59
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r1 = r4.methodGraphCompiler
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = r0.getType()
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Linked r5 = r1.compile(r2, r5)
                    net.bytebuddy.dynamic.scaffold.MethodGraph$NodeList r5 = r5.listNodes()
                    net.bytebuddy.description.method.MethodList r5 = r5.asMethodList()
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1 = r4.matcher
                    net.bytebuddy.matcher.FilterableList r5 = r5.filter(r1)
                    net.bytebuddy.description.method.MethodList r5 = (net.bytebuddy.description.method.MethodList) r5
                    java.util.ArrayList r1 = new java.util.ArrayList
                    int r2 = r5.size()
                    r1.<init>(r2)
                    java.util.List<? extends net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<?>> r2 = r4.parameterBinders
                    net.bytebuddy.implementation.bind.MethodDelegationBinder r2 = net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.of(r2)
                    java.util.Iterator r5 = r5.iterator()
                L3f:
                    boolean r3 = r5.hasNext()
                    if (r3 == 0) goto L53
                    java.lang.Object r3 = r5.next()
                    net.bytebuddy.description.method.MethodDescription r3 = (net.bytebuddy.description.method.MethodDescription) r3
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$Record r3 = r2.compile(r3)
                    r1.add(r3)
                    goto L3f
                L53:
                    net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate$Compiled$ForField r5 = new net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate$Compiled$ForField
                    r5.<init>(r0, r1)
                    return r5
                L59:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    r2.append(r0)
                    java.lang.String r0 = " is not visible to "
                    r2.append(r0)
                    r2.append(r5)
                    java.lang.String r5 = r2.toString()
                    r1.<init>(r5)
                    throw r1
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
                    java.lang.String r2 = r4.fieldName
                    net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate$ForField r5 = (net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.ForField) r5
                    java.lang.String r3 = r5.fieldName
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r2 = r4.methodGraphCompiler
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r3 = r5.methodGraphCompiler
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L2b
                    return r1
                L2b:
                    java.util.List<? extends net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<?>> r2 = r4.parameterBinders
                    java.util.List<? extends net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<?>> r3 = r5.parameterBinders
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L36
                    return r1
                L36:
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2 = r4.matcher
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r5 = r5.matcher
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
                    java.lang.String r1 = r2.fieldName
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r1 = r2.methodGraphCompiler
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    java.util.List<? extends net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<?>> r1 = r2.parameterBinders
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1 = r2.matcher
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            public abstract net.bytebuddy.description.field.FieldDescription resolve(net.bytebuddy.description.type.TypeDescription r1);
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForMethodReturn implements net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate {
            private final net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> matcher;
            private final net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler methodGraphCompiler;
            private final java.lang.String name;
            private final java.util.List<? extends net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<?>> parameterBinders;

            public ForMethodReturn(java.lang.String r1, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r2, java.util.List<? extends net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<?>> r3, net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r4) {
                    r0 = this;
                    r0.<init>()
                    r0.name = r1
                    r0.methodGraphCompiler = r2
                    r0.parameterBinders = r3
                    r0.matcher = r4
                    return
            }

            @Override // net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate
            public net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.Compiled compile(net.bytebuddy.description.type.TypeDescription r6) {
                    r5 = this;
                    net.bytebuddy.description.method.MethodList$Explicit r0 = new net.bytebuddy.description.method.MethodList$Explicit
                    net.bytebuddy.description.method.MethodList r1 = r6.getDeclaredMethods()
                    net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.isStatic()
                    net.bytebuddy.matcher.ElementMatcher$Junction r3 = net.bytebuddy.matcher.ElementMatchers.isPrivate()
                    net.bytebuddy.matcher.ElementMatcher$Junction r2 = r2.or(r3)
                    net.bytebuddy.matcher.FilterableList r1 = r1.filter(r2)
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r2 = r5.methodGraphCompiler
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Linked r2 = r2.compile(r6)
                    net.bytebuddy.dynamic.scaffold.MethodGraph$NodeList r2 = r2.listNodes()
                    net.bytebuddy.description.method.MethodList r2 = r2.asMethodList()
                    java.util.List r1 = net.bytebuddy.utility.CompoundList.of(r1, r2)
                    r0.<init>(r1)
                    java.lang.String r1 = r5.name
                    net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                    r2 = 0
                    net.bytebuddy.matcher.ElementMatcher$Junction r3 = net.bytebuddy.matcher.ElementMatchers.takesArguments(r2)
                    net.bytebuddy.matcher.ElementMatcher$Junction r1 = r1.and(r3)
                    net.bytebuddy.matcher.ElementMatcher$Junction r3 = net.bytebuddy.matcher.ElementMatchers.isPrimitive()
                    net.bytebuddy.matcher.ElementMatcher$Junction r4 = net.bytebuddy.matcher.ElementMatchers.isArray()
                    net.bytebuddy.matcher.ElementMatcher$Junction r3 = r3.or(r4)
                    net.bytebuddy.matcher.ElementMatcher$Junction r3 = net.bytebuddy.matcher.ElementMatchers.returns(r3)
                    net.bytebuddy.matcher.ElementMatcher$Junction r3 = net.bytebuddy.matcher.ElementMatchers.not(r3)
                    net.bytebuddy.matcher.ElementMatcher$Junction r1 = r1.and(r3)
                    net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                    net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                    int r1 = r0.size()
                    r3 = 1
                    if (r1 != r3) goto Le4
                    java.lang.Object r1 = r0.getOnly()
                    net.bytebuddy.description.method.MethodDescription r1 = (net.bytebuddy.description.method.MethodDescription) r1
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r1.getReturnType()
                    net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                    boolean r1 = r1.isVisibleTo(r6)
                    if (r1 == 0) goto Lc6
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r1 = r5.methodGraphCompiler
                    java.lang.Object r3 = r0.getOnly()
                    net.bytebuddy.description.method.MethodDescription r3 = (net.bytebuddy.description.method.MethodDescription) r3
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.getReturnType()
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Linked r6 = r1.compile(r3, r6)
                    net.bytebuddy.dynamic.scaffold.MethodGraph$NodeList r6 = r6.listNodes()
                    net.bytebuddy.description.method.MethodList r6 = r6.asMethodList()
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1 = r5.matcher
                    net.bytebuddy.matcher.FilterableList r6 = r6.filter(r1)
                    net.bytebuddy.description.method.MethodList r6 = (net.bytebuddy.description.method.MethodList) r6
                    java.util.ArrayList r1 = new java.util.ArrayList
                    int r3 = r6.size()
                    r1.<init>(r3)
                    java.util.List<? extends net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<?>> r3 = r5.parameterBinders
                    net.bytebuddy.implementation.bind.MethodDelegationBinder r3 = net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.of(r3)
                    java.util.Iterator r6 = r6.iterator()
                La6:
                    boolean r4 = r6.hasNext()
                    if (r4 == 0) goto Lba
                    java.lang.Object r4 = r6.next()
                    net.bytebuddy.description.method.MethodDescription r4 = (net.bytebuddy.description.method.MethodDescription) r4
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$Record r4 = r3.compile(r4)
                    r1.add(r4)
                    goto La6
                Lba:
                    net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate$Compiled$ForMethodReturn r6 = new net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate$Compiled$ForMethodReturn
                    java.lang.Object r0 = r0.get(r2)
                    net.bytebuddy.description.method.MethodDescription r0 = (net.bytebuddy.description.method.MethodDescription) r0
                    r6.<init>(r0, r1)
                    return r6
                Lc6:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.Object r0 = r0.getOnly()
                    r2.append(r0)
                    java.lang.String r0 = " is not visible to "
                    r2.append(r0)
                    r2.append(r6)
                    java.lang.String r6 = r2.toString()
                    r1.<init>(r6)
                    throw r1
                Le4:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    r2.append(r6)
                    java.lang.String r6 = " does not define method without arguments with name "
                    r2.append(r6)
                    java.lang.String r6 = r5.name
                    r2.append(r6)
                    java.lang.String r6 = ": "
                    r2.append(r6)
                    r2.append(r0)
                    java.lang.String r6 = r2.toString()
                    r1.<init>(r6)
                    throw r1
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
                    net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate$ForMethodReturn r5 = (net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.ForMethodReturn) r5
                    java.lang.String r3 = r5.name
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r2 = r4.methodGraphCompiler
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r3 = r5.methodGraphCompiler
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L2b
                    return r1
                L2b:
                    java.util.List<? extends net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<?>> r2 = r4.parameterBinders
                    java.util.List<? extends net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<?>> r3 = r5.parameterBinders
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L36
                    return r1
                L36:
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2 = r4.matcher
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r5 = r5.matcher
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
                    java.lang.String r1 = r2.name
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r1 = r2.methodGraphCompiler
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    java.util.List<? extends net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<?>> r1 = r2.parameterBinders
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1 = r2.matcher
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

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForStaticMethod implements net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate {
            private final java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder.Record> records;

            public ForStaticMethod(java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder.Record> r1) {
                    r0 = this;
                    r0.<init>()
                    r0.records = r1
                    return
            }

            public static net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate of(net.bytebuddy.description.method.MethodList<?> r2, net.bytebuddy.implementation.bind.MethodDelegationBinder r3) {
                    java.util.ArrayList r0 = new java.util.ArrayList
                    int r1 = r2.size()
                    r0.<init>(r1)
                    java.util.Iterator r2 = r2.iterator()
                Ld:
                    boolean r1 = r2.hasNext()
                    if (r1 == 0) goto L21
                    java.lang.Object r1 = r2.next()
                    net.bytebuddy.description.method.MethodDescription r1 = (net.bytebuddy.description.method.MethodDescription) r1
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$Record r1 = r3.compile(r1)
                    r0.add(r1)
                    goto Ld
                L21:
                    net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate$ForStaticMethod r2 = new net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate$ForStaticMethod
                    r2.<init>(r0)
                    return r2
            }

            @Override // net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate
            public net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.Compiled compile(net.bytebuddy.description.type.TypeDescription r2) {
                    r1 = this;
                    net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate$Compiled$ForStaticCall r2 = new net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate$Compiled$ForStaticCall
                    java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder$Record> r0 = r1.records
                    r2.<init>(r0)
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
                    java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder$Record> r2 = r4.records
                    net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate$ForStaticMethod r5 = (net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.ForStaticMethod) r5
                    java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder$Record> r5 = r5.records
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
                    java.util.List<net.bytebuddy.implementation.bind.MethodDelegationBinder$Record> r1 = r2.records
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

        net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.Compiled compile(net.bytebuddy.description.type.TypeDescription r1);
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class WithCustomProperties {
        private final net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver ambiguityResolver;
        private final net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver bindingResolver;
        private final net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> matcher;
        private final java.util.List<net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<?>> parameterBinders;

        public WithCustomProperties(net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver r3, java.util.List<net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<?>> r4) {
                r2 = this;
                net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver$Default r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver.Default.INSTANCE
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.any()
                r2.<init>(r3, r4, r0, r1)
                return
        }

        private WithCustomProperties(net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver r1, java.util.List<net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<?>> r2, net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver r3, net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r4) {
                r0 = this;
                r0.<init>()
                r0.ambiguityResolver = r1
                r0.parameterBinders = r2
                r0.bindingResolver = r3
                r0.matcher = r4
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
                net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver r2 = r4.ambiguityResolver
                net.bytebuddy.implementation.MethodDelegation$WithCustomProperties r5 = (net.bytebuddy.implementation.MethodDelegation.WithCustomProperties) r5
                net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver r3 = r5.ambiguityResolver
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                java.util.List<net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<?>> r2 = r4.parameterBinders
                java.util.List<net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<?>> r3 = r5.parameterBinders
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L2b
                return r1
            L2b:
                net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver r2 = r4.bindingResolver
                net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver r3 = r5.bindingResolver
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L36
                return r1
            L36:
                net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2 = r4.matcher
                net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r5 = r5.matcher
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L41
                return r1
            L41:
                return r0
        }

        public net.bytebuddy.implementation.MethodDelegation.WithCustomProperties filter(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r9) {
                r8 = this;
                net.bytebuddy.implementation.MethodDelegation$WithCustomProperties r0 = new net.bytebuddy.implementation.MethodDelegation$WithCustomProperties
                net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver r1 = r8.ambiguityResolver
                java.util.List<net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<?>> r2 = r8.parameterBinders
                net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver r3 = r8.bindingResolver
                net.bytebuddy.matcher.ElementMatcher$Junction$Conjunction r4 = new net.bytebuddy.matcher.ElementMatcher$Junction$Conjunction
                net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r5 = r8.matcher
                r6 = 2
                net.bytebuddy.matcher.ElementMatcher[] r6 = new net.bytebuddy.matcher.ElementMatcher[r6]
                r7 = 0
                r6[r7] = r5
                r5 = 1
                r6[r5] = r9
                r4.<init>(r6)
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver r1 = r2.ambiguityResolver
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.util.List<net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<?>> r1 = r2.parameterBinders
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver r1 = r2.bindingResolver
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1 = r2.matcher
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        public net.bytebuddy.implementation.MethodDelegation to(java.lang.Class<?> r1) {
                r0 = this;
                net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                net.bytebuddy.implementation.MethodDelegation r1 = r0.to(r1)
                return r1
        }

        public net.bytebuddy.implementation.MethodDelegation to(java.lang.Object r2) {
                r1 = this;
                net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r0 = net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.DEFAULT
                net.bytebuddy.implementation.MethodDelegation r2 = r1.to(r2, r0)
                return r2
        }

        public net.bytebuddy.implementation.MethodDelegation to(java.lang.Object r2, java.lang.String r3) {
                r1 = this;
                net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r0 = net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.DEFAULT
                net.bytebuddy.implementation.MethodDelegation r2 = r1.to(r2, r3, r0)
                return r2
        }

        public net.bytebuddy.implementation.MethodDelegation to(java.lang.Object r2, java.lang.String r3, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r4) {
                r1 = this;
                java.lang.Class r0 = r2.getClass()
                net.bytebuddy.implementation.MethodDelegation r2 = r1.to(r2, r0, r3, r4)
                return r2
        }

        public net.bytebuddy.implementation.MethodDelegation to(java.lang.Object r2, java.lang.reflect.Type r3) {
                r1 = this;
                net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r0 = net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.DEFAULT
                net.bytebuddy.implementation.MethodDelegation r2 = r1.to(r2, r3, r0)
                return r2
        }

        public net.bytebuddy.implementation.MethodDelegation to(java.lang.Object r2, java.lang.reflect.Type r3, java.lang.String r4) {
                r1 = this;
                net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r0 = net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.DEFAULT
                net.bytebuddy.implementation.MethodDelegation r2 = r1.to(r2, r3, r4, r0)
                return r2
        }

        public net.bytebuddy.implementation.MethodDelegation to(java.lang.Object r1, java.lang.reflect.Type r2, java.lang.String r3, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r4) {
                r0 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r2 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r2)
                net.bytebuddy.implementation.MethodDelegation r1 = r0.to(r1, r2, r3, r4)
                return r1
        }

        public net.bytebuddy.implementation.MethodDelegation to(java.lang.Object r3, java.lang.reflect.Type r4, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r5) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "delegate$"
                r0.append(r1)
                java.lang.String r1 = net.bytebuddy.utility.RandomString.hashOf(r3)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                net.bytebuddy.implementation.MethodDelegation r3 = r2.to(r3, r4, r0, r5)
                return r3
        }

        public net.bytebuddy.implementation.MethodDelegation to(java.lang.Object r2, net.bytebuddy.description.type.TypeDefinition r3) {
                r1 = this;
                net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r0 = net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.DEFAULT
                net.bytebuddy.implementation.MethodDelegation r2 = r1.to(r2, r3, r0)
                return r2
        }

        public net.bytebuddy.implementation.MethodDelegation to(java.lang.Object r2, net.bytebuddy.description.type.TypeDefinition r3, java.lang.String r4) {
                r1 = this;
                net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r0 = net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.DEFAULT
                net.bytebuddy.implementation.MethodDelegation r2 = r1.to(r2, r3, r4, r0)
                return r2
        }

        public net.bytebuddy.implementation.MethodDelegation to(java.lang.Object r10, net.bytebuddy.description.type.TypeDefinition r11, java.lang.String r12, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r13) {
                r9 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r11.asErasure()
                boolean r0 = r0.isInstance(r10)
                if (r0 == 0) goto L27
                net.bytebuddy.implementation.MethodDelegation r0 = new net.bytebuddy.implementation.MethodDelegation
                net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate$ForField$WithInstance r8 = new net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate$ForField$WithInstance
                java.util.List<net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<?>> r4 = r9.parameterBinders
                net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r5 = r9.matcher
                net.bytebuddy.description.type.TypeDescription$Generic r7 = r11.asGenericType()
                r1 = r8
                r2 = r12
                r3 = r13
                r6 = r10
                r1.<init>(r2, r3, r4, r5, r6, r7)
                java.util.List<net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<?>> r10 = r9.parameterBinders
                net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver r11 = r9.ambiguityResolver
                net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver r12 = r9.bindingResolver
                r0.<init>(r8, r10, r11, r12)
                return r0
            L27:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r10)
                java.lang.String r10 = " is not an instance of "
                r13.append(r10)
                r13.append(r11)
                java.lang.String r10 = r13.toString()
                r12.<init>(r10)
                throw r12
        }

        public net.bytebuddy.implementation.MethodDelegation to(java.lang.Object r3, net.bytebuddy.description.type.TypeDefinition r4, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r5) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "delegate$"
                r0.append(r1)
                java.lang.String r1 = net.bytebuddy.utility.RandomString.hashOf(r3)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                net.bytebuddy.implementation.MethodDelegation r3 = r2.to(r3, r4, r0, r5)
                return r3
        }

        public net.bytebuddy.implementation.MethodDelegation to(java.lang.Object r2, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r3) {
                r1 = this;
                java.lang.Class r0 = r2.getClass()
                net.bytebuddy.implementation.MethodDelegation r2 = r1.to(r2, r0, r3)
                return r2
        }

        public net.bytebuddy.implementation.MethodDelegation to(net.bytebuddy.description.type.TypeDescription r5) {
                r4 = this;
                boolean r0 = r5.isArray()
                if (r0 != 0) goto L4d
                boolean r0 = r5.isPrimitive()
                if (r0 != 0) goto L36
                net.bytebuddy.implementation.MethodDelegation r0 = new net.bytebuddy.implementation.MethodDelegation
                net.bytebuddy.description.method.MethodList r5 = r5.getDeclaredMethods()
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.isStatic()
                net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2 = r4.matcher
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = r1.and(r2)
                net.bytebuddy.matcher.FilterableList r5 = r5.filter(r1)
                net.bytebuddy.description.method.MethodList r5 = (net.bytebuddy.description.method.MethodList) r5
                java.util.List<net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<?>> r1 = r4.parameterBinders
                net.bytebuddy.implementation.bind.MethodDelegationBinder r1 = net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.of(r1)
                net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate r5 = net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.ForStaticMethod.of(r5, r1)
                java.util.List<net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<?>> r1 = r4.parameterBinders
                net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver r2 = r4.ambiguityResolver
                net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver r3 = r4.bindingResolver
                r0.<init>(r5, r1, r2, r3)
                return r0
            L36:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Cannot delegate to primitive "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                throw r0
            L4d:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Cannot delegate to array "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                throw r0
        }

        public net.bytebuddy.implementation.MethodDelegation toConstructor(java.lang.Class<?> r1) {
                r0 = this;
                net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                net.bytebuddy.implementation.MethodDelegation r1 = r0.toConstructor(r1)
                return r1
        }

        public net.bytebuddy.implementation.MethodDelegation toConstructor(net.bytebuddy.description.type.TypeDescription r5) {
                r4 = this;
                net.bytebuddy.implementation.MethodDelegation r0 = new net.bytebuddy.implementation.MethodDelegation
                net.bytebuddy.description.method.MethodList r1 = r5.getDeclaredMethods()
                net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.isConstructor()
                net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r3 = r4.matcher
                net.bytebuddy.matcher.ElementMatcher$Junction r2 = r2.and(r3)
                net.bytebuddy.matcher.FilterableList r1 = r1.filter(r2)
                net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                java.util.List<net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<?>> r2 = r4.parameterBinders
                net.bytebuddy.implementation.bind.MethodDelegationBinder r2 = net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.of(r2)
                net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate r5 = net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate.ForConstruction.of(r5, r1, r2)
                java.util.List<net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<?>> r1 = r4.parameterBinders
                net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver r2 = r4.ambiguityResolver
                net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver r3 = r4.bindingResolver
                r0.<init>(r5, r1, r2, r3)
                return r0
        }

        public net.bytebuddy.implementation.MethodDelegation toField(java.lang.String r2) {
                r1 = this;
                net.bytebuddy.dynamic.scaffold.FieldLocator$ForClassHierarchy$Factory r0 = net.bytebuddy.dynamic.scaffold.FieldLocator.ForClassHierarchy.Factory.INSTANCE
                net.bytebuddy.implementation.MethodDelegation r2 = r1.toField(r2, r0)
                return r2
        }

        public net.bytebuddy.implementation.MethodDelegation toField(java.lang.String r2, net.bytebuddy.dynamic.scaffold.FieldLocator.Factory r3) {
                r1 = this;
                net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r0 = net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.DEFAULT
                net.bytebuddy.implementation.MethodDelegation r2 = r1.toField(r2, r3, r0)
                return r2
        }

        public net.bytebuddy.implementation.MethodDelegation toField(java.lang.String r9, net.bytebuddy.dynamic.scaffold.FieldLocator.Factory r10, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r11) {
                r8 = this;
                net.bytebuddy.implementation.MethodDelegation r0 = new net.bytebuddy.implementation.MethodDelegation
                net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate$ForField$WithLookup r7 = new net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate$ForField$WithLookup
                java.util.List<net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<?>> r4 = r8.parameterBinders
                net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r5 = r8.matcher
                r1 = r7
                r2 = r9
                r3 = r11
                r6 = r10
                r1.<init>(r2, r3, r4, r5, r6)
                java.util.List<net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<?>> r9 = r8.parameterBinders
                net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver r10 = r8.ambiguityResolver
                net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver r11 = r8.bindingResolver
                r0.<init>(r7, r9, r10, r11)
                return r0
        }

        public net.bytebuddy.implementation.MethodDelegation toField(java.lang.String r2, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r3) {
                r1 = this;
                net.bytebuddy.dynamic.scaffold.FieldLocator$ForClassHierarchy$Factory r0 = net.bytebuddy.dynamic.scaffold.FieldLocator.ForClassHierarchy.Factory.INSTANCE
                net.bytebuddy.implementation.MethodDelegation r2 = r1.toField(r2, r0, r3)
                return r2
        }

        public net.bytebuddy.implementation.MethodDelegation toMethodReturnOf(java.lang.String r2) {
                r1 = this;
                net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r0 = net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.DEFAULT
                net.bytebuddy.implementation.MethodDelegation r2 = r1.toMethodReturnOf(r2, r0)
                return r2
        }

        public net.bytebuddy.implementation.MethodDelegation toMethodReturnOf(java.lang.String r5, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r6) {
                r4 = this;
                net.bytebuddy.implementation.MethodDelegation r0 = new net.bytebuddy.implementation.MethodDelegation
                net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate$ForMethodReturn r1 = new net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate$ForMethodReturn
                java.util.List<net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<?>> r2 = r4.parameterBinders
                net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r3 = r4.matcher
                r1.<init>(r5, r6, r2, r3)
                java.util.List<net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<?>> r5 = r4.parameterBinders
                net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver r6 = r4.ambiguityResolver
                net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver r2 = r4.bindingResolver
                r0.<init>(r1, r5, r6, r2)
                return r0
        }

        public net.bytebuddy.implementation.MethodDelegation.WithCustomProperties withBinders(java.util.List<? extends net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<?>> r5) {
                r4 = this;
                net.bytebuddy.implementation.MethodDelegation$WithCustomProperties r0 = new net.bytebuddy.implementation.MethodDelegation$WithCustomProperties
                net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver r1 = r4.ambiguityResolver
                java.util.List<net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<?>> r2 = r4.parameterBinders
                java.util.List r5 = net.bytebuddy.utility.CompoundList.of(r2, r5)
                net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver r2 = r4.bindingResolver
                net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r3 = r4.matcher
                r0.<init>(r1, r5, r2, r3)
                return r0
        }

        public net.bytebuddy.implementation.MethodDelegation.WithCustomProperties withBinders(net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<?>... r1) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                net.bytebuddy.implementation.MethodDelegation$WithCustomProperties r1 = r0.withBinders(r1)
                return r1
        }

        public net.bytebuddy.implementation.MethodDelegation.WithCustomProperties withBindingResolver(net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver r5) {
                r4 = this;
                net.bytebuddy.implementation.MethodDelegation$WithCustomProperties r0 = new net.bytebuddy.implementation.MethodDelegation$WithCustomProperties
                net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver r1 = r4.ambiguityResolver
                java.util.List<net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<?>> r2 = r4.parameterBinders
                net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r3 = r4.matcher
                r0.<init>(r1, r2, r5, r3)
                return r0
        }

        public net.bytebuddy.implementation.MethodDelegation.WithCustomProperties withResolvers(java.util.List<? extends net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver> r5) {
                r4 = this;
                net.bytebuddy.implementation.MethodDelegation$WithCustomProperties r0 = new net.bytebuddy.implementation.MethodDelegation$WithCustomProperties
                net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Compound r1 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Compound
                net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver r2 = r4.ambiguityResolver
                java.util.List r5 = net.bytebuddy.utility.CompoundList.of(r2, r5)
                r1.<init>(r5)
                java.util.List<net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<?>> r5 = r4.parameterBinders
                net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver r2 = r4.bindingResolver
                net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r3 = r4.matcher
                r0.<init>(r1, r5, r2, r3)
                return r0
        }

        public net.bytebuddy.implementation.MethodDelegation.WithCustomProperties withResolvers(net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver... r1) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                net.bytebuddy.implementation.MethodDelegation$WithCustomProperties r1 = r0.withResolvers(r1)
                return r1
        }
    }

    public MethodDelegation(net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate r8, java.util.List<net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<?>> r9, net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver r10, net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver r11) {
            r7 = this;
            net.bytebuddy.implementation.bind.MethodDelegationBinder$TerminationHandler$Default r4 = net.bytebuddy.implementation.bind.MethodDelegationBinder.TerminationHandler.Default.RETURNING
            net.bytebuddy.implementation.bytecode.assign.Assigner r6 = net.bytebuddy.implementation.bytecode.assign.Assigner.DEFAULT
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    private MethodDelegation(net.bytebuddy.implementation.MethodDelegation.ImplementationDelegate r1, java.util.List<net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<?>> r2, net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver r3, net.bytebuddy.implementation.bind.MethodDelegationBinder.TerminationHandler r4, net.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver r5, net.bytebuddy.implementation.bytecode.assign.Assigner r6) {
            r0 = this;
            r0.<init>()
            r0.implementationDelegate = r1
            r0.parameterBinders = r2
            r0.terminationHandler = r4
            r0.ambiguityResolver = r3
            r0.bindingResolver = r5
            r0.assigner = r6
            return
    }

    public static net.bytebuddy.implementation.MethodDelegation to(java.lang.Class<?> r1) {
            net.bytebuddy.implementation.MethodDelegation$WithCustomProperties r0 = withDefaultConfiguration()
            net.bytebuddy.implementation.MethodDelegation r1 = r0.to(r1)
            return r1
    }

    public static net.bytebuddy.implementation.MethodDelegation to(java.lang.Object r1) {
            net.bytebuddy.implementation.MethodDelegation$WithCustomProperties r0 = withDefaultConfiguration()
            net.bytebuddy.implementation.MethodDelegation r1 = r0.to(r1)
            return r1
    }

    public static net.bytebuddy.implementation.MethodDelegation to(java.lang.Object r1, java.lang.String r2) {
            net.bytebuddy.implementation.MethodDelegation$WithCustomProperties r0 = withDefaultConfiguration()
            net.bytebuddy.implementation.MethodDelegation r1 = r0.to(r1, r2)
            return r1
    }

    public static net.bytebuddy.implementation.MethodDelegation to(java.lang.Object r1, java.lang.String r2, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r3) {
            net.bytebuddy.implementation.MethodDelegation$WithCustomProperties r0 = withDefaultConfiguration()
            net.bytebuddy.implementation.MethodDelegation r1 = r0.to(r1, r2, r3)
            return r1
    }

    public static net.bytebuddy.implementation.MethodDelegation to(java.lang.Object r1, java.lang.reflect.Type r2) {
            net.bytebuddy.implementation.MethodDelegation$WithCustomProperties r0 = withDefaultConfiguration()
            net.bytebuddy.implementation.MethodDelegation r1 = r0.to(r1, r2)
            return r1
    }

    public static net.bytebuddy.implementation.MethodDelegation to(java.lang.Object r1, java.lang.reflect.Type r2, java.lang.String r3) {
            net.bytebuddy.implementation.MethodDelegation$WithCustomProperties r0 = withDefaultConfiguration()
            net.bytebuddy.implementation.MethodDelegation r1 = r0.to(r1, r2, r3)
            return r1
    }

    public static net.bytebuddy.implementation.MethodDelegation to(java.lang.Object r1, java.lang.reflect.Type r2, java.lang.String r3, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r4) {
            net.bytebuddy.implementation.MethodDelegation$WithCustomProperties r0 = withDefaultConfiguration()
            net.bytebuddy.implementation.MethodDelegation r1 = r0.to(r1, r2, r3, r4)
            return r1
    }

    public static net.bytebuddy.implementation.MethodDelegation to(java.lang.Object r1, java.lang.reflect.Type r2, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r3) {
            net.bytebuddy.implementation.MethodDelegation$WithCustomProperties r0 = withDefaultConfiguration()
            net.bytebuddy.implementation.MethodDelegation r1 = r0.to(r1, r2, r3)
            return r1
    }

    public static net.bytebuddy.implementation.MethodDelegation to(java.lang.Object r1, net.bytebuddy.description.type.TypeDefinition r2) {
            net.bytebuddy.implementation.MethodDelegation$WithCustomProperties r0 = withDefaultConfiguration()
            net.bytebuddy.implementation.MethodDelegation r1 = r0.to(r1, r2)
            return r1
    }

    public static net.bytebuddy.implementation.MethodDelegation to(java.lang.Object r1, net.bytebuddy.description.type.TypeDefinition r2, java.lang.String r3) {
            net.bytebuddy.implementation.MethodDelegation$WithCustomProperties r0 = withDefaultConfiguration()
            net.bytebuddy.implementation.MethodDelegation r1 = r0.to(r1, r2, r3)
            return r1
    }

    public static net.bytebuddy.implementation.MethodDelegation to(java.lang.Object r1, net.bytebuddy.description.type.TypeDefinition r2, java.lang.String r3, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r4) {
            net.bytebuddy.implementation.MethodDelegation$WithCustomProperties r0 = withDefaultConfiguration()
            net.bytebuddy.implementation.MethodDelegation r1 = r0.to(r1, r2, r3, r4)
            return r1
    }

    public static net.bytebuddy.implementation.MethodDelegation to(java.lang.Object r1, net.bytebuddy.description.type.TypeDefinition r2, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r3) {
            net.bytebuddy.implementation.MethodDelegation$WithCustomProperties r0 = withDefaultConfiguration()
            net.bytebuddy.implementation.MethodDelegation r1 = r0.to(r1, r2, r3)
            return r1
    }

    public static net.bytebuddy.implementation.MethodDelegation to(java.lang.Object r1, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r2) {
            net.bytebuddy.implementation.MethodDelegation$WithCustomProperties r0 = withDefaultConfiguration()
            net.bytebuddy.implementation.MethodDelegation r1 = r0.to(r1, r2)
            return r1
    }

    public static net.bytebuddy.implementation.MethodDelegation to(net.bytebuddy.description.type.TypeDescription r1) {
            net.bytebuddy.implementation.MethodDelegation$WithCustomProperties r0 = withDefaultConfiguration()
            net.bytebuddy.implementation.MethodDelegation r1 = r0.to(r1)
            return r1
    }

    public static net.bytebuddy.implementation.MethodDelegation toConstructor(java.lang.Class<?> r1) {
            net.bytebuddy.implementation.MethodDelegation$WithCustomProperties r0 = withDefaultConfiguration()
            net.bytebuddy.implementation.MethodDelegation r1 = r0.toConstructor(r1)
            return r1
    }

    public static net.bytebuddy.implementation.MethodDelegation toConstructor(net.bytebuddy.description.type.TypeDescription r1) {
            net.bytebuddy.implementation.MethodDelegation$WithCustomProperties r0 = withDefaultConfiguration()
            net.bytebuddy.implementation.MethodDelegation r1 = r0.toConstructor(r1)
            return r1
    }

    public static net.bytebuddy.implementation.MethodDelegation toField(java.lang.String r1) {
            net.bytebuddy.implementation.MethodDelegation$WithCustomProperties r0 = withDefaultConfiguration()
            net.bytebuddy.implementation.MethodDelegation r1 = r0.toField(r1)
            return r1
    }

    public static net.bytebuddy.implementation.MethodDelegation toField(java.lang.String r1, net.bytebuddy.dynamic.scaffold.FieldLocator.Factory r2) {
            net.bytebuddy.implementation.MethodDelegation$WithCustomProperties r0 = withDefaultConfiguration()
            net.bytebuddy.implementation.MethodDelegation r1 = r0.toField(r1, r2)
            return r1
    }

    public static net.bytebuddy.implementation.MethodDelegation toField(java.lang.String r1, net.bytebuddy.dynamic.scaffold.FieldLocator.Factory r2, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r3) {
            net.bytebuddy.implementation.MethodDelegation$WithCustomProperties r0 = withDefaultConfiguration()
            net.bytebuddy.implementation.MethodDelegation r1 = r0.toField(r1, r2, r3)
            return r1
    }

    public static net.bytebuddy.implementation.MethodDelegation toField(java.lang.String r1, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r2) {
            net.bytebuddy.implementation.MethodDelegation$WithCustomProperties r0 = withDefaultConfiguration()
            net.bytebuddy.implementation.MethodDelegation r1 = r0.toField(r1, r2)
            return r1
    }

    public static net.bytebuddy.implementation.MethodDelegation toMethodReturnOf(java.lang.String r1) {
            net.bytebuddy.implementation.MethodDelegation$WithCustomProperties r0 = withDefaultConfiguration()
            net.bytebuddy.implementation.MethodDelegation r1 = r0.toMethodReturnOf(r1)
            return r1
    }

    public static net.bytebuddy.implementation.MethodDelegation toMethodReturnOf(java.lang.String r1, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r2) {
            net.bytebuddy.implementation.MethodDelegation$WithCustomProperties r0 = withDefaultConfiguration()
            net.bytebuddy.implementation.MethodDelegation r1 = r0.toMethodReturnOf(r1, r2)
            return r1
    }

    public static net.bytebuddy.implementation.MethodDelegation.WithCustomProperties withDefaultConfiguration() {
            net.bytebuddy.implementation.MethodDelegation$WithCustomProperties r0 = new net.bytebuddy.implementation.MethodDelegation$WithCustomProperties
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver r1 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.DEFAULT
            java.util.List<net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<?>> r2 = net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder.DEFAULTS
            r0.<init>(r1, r2)
            return r0
    }

    public static net.bytebuddy.implementation.MethodDelegation.WithCustomProperties withEmptyConfiguration() {
            net.bytebuddy.implementation.MethodDelegation$WithCustomProperties r0 = new net.bytebuddy.implementation.MethodDelegation$WithCustomProperties
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$NoOp r1 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.NoOp.INSTANCE
            java.util.List r2 = java.util.Collections.emptyList()
            r0.<init>(r1, r2)
            return r0
    }

    @Override // net.bytebuddy.implementation.Implementation.Composable
    public net.bytebuddy.implementation.Implementation.Composable andThen(net.bytebuddy.implementation.Implementation.Composable r10) {
            r9 = this;
            net.bytebuddy.implementation.Implementation$Compound$Composable r0 = new net.bytebuddy.implementation.Implementation$Compound$Composable
            net.bytebuddy.implementation.MethodDelegation r8 = new net.bytebuddy.implementation.MethodDelegation
            net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate r2 = r9.implementationDelegate
            java.util.List<net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<?>> r3 = r9.parameterBinders
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver r4 = r9.ambiguityResolver
            net.bytebuddy.implementation.bind.MethodDelegationBinder$TerminationHandler$Default r5 = net.bytebuddy.implementation.bind.MethodDelegationBinder.TerminationHandler.Default.DROPPING
            net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver r6 = r9.bindingResolver
            net.bytebuddy.implementation.bytecode.assign.Assigner r7 = r9.assigner
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.<init>(r8, r10)
            return r0
    }

    @Override // net.bytebuddy.implementation.Implementation.Composable
    public net.bytebuddy.implementation.Implementation andThen(net.bytebuddy.implementation.Implementation r10) {
            r9 = this;
            net.bytebuddy.implementation.Implementation$Compound r0 = new net.bytebuddy.implementation.Implementation$Compound
            net.bytebuddy.implementation.MethodDelegation r8 = new net.bytebuddy.implementation.MethodDelegation
            net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate r2 = r9.implementationDelegate
            java.util.List<net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<?>> r3 = r9.parameterBinders
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver r4 = r9.ambiguityResolver
            net.bytebuddy.implementation.bind.MethodDelegationBinder$TerminationHandler$Default r5 = net.bytebuddy.implementation.bind.MethodDelegationBinder.TerminationHandler.Default.DROPPING
            net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver r6 = r9.bindingResolver
            net.bytebuddy.implementation.bytecode.assign.Assigner r7 = r9.assigner
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r1 = 2
            net.bytebuddy.implementation.Implementation[] r1 = new net.bytebuddy.implementation.Implementation[r1]
            r2 = 0
            r1[r2] = r8
            r2 = 1
            r1[r2] = r10
            r0.<init>(r1)
            return r0
    }

    @Override // net.bytebuddy.implementation.Implementation
    public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r9) {
            r8 = this;
            net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate r0 = r8.implementationDelegate
            net.bytebuddy.description.type.TypeDescription r1 = r9.getInstrumentedType()
            net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate$Compiled r7 = r0.compile(r1)
            net.bytebuddy.implementation.MethodDelegation$Appender r0 = new net.bytebuddy.implementation.MethodDelegation$Appender
            net.bytebuddy.implementation.bind.MethodDelegationBinder$Processor r4 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$Processor
            java.util.List r1 = r7.getRecords()
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver r2 = r8.ambiguityResolver
            net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver r3 = r8.bindingResolver
            r4.<init>(r1, r2, r3)
            net.bytebuddy.implementation.bind.MethodDelegationBinder$TerminationHandler r5 = r8.terminationHandler
            net.bytebuddy.implementation.bytecode.assign.Assigner r6 = r8.assigner
            r2 = r0
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
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
            net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate r2 = r4.implementationDelegate
            net.bytebuddy.implementation.MethodDelegation r5 = (net.bytebuddy.implementation.MethodDelegation) r5
            net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate r3 = r5.implementationDelegate
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L20
            return r1
        L20:
            java.util.List<net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<?>> r2 = r4.parameterBinders
            java.util.List<net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<?>> r3 = r5.parameterBinders
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2b
            return r1
        L2b:
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver r2 = r4.ambiguityResolver
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver r3 = r5.ambiguityResolver
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L36
            return r1
        L36:
            net.bytebuddy.implementation.bind.MethodDelegationBinder$TerminationHandler r2 = r4.terminationHandler
            net.bytebuddy.implementation.bind.MethodDelegationBinder$TerminationHandler r3 = r5.terminationHandler
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L41
            return r1
        L41:
            net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver r2 = r4.bindingResolver
            net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver r3 = r5.bindingResolver
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4c
            return r1
        L4c:
            net.bytebuddy.implementation.bytecode.assign.Assigner r2 = r4.assigner
            net.bytebuddy.implementation.bytecode.assign.Assigner r5 = r5.assigner
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
            net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate r1 = r2.implementationDelegate
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List<net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<?>> r1 = r2.parameterBinders
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver r1 = r2.ambiguityResolver
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.implementation.bind.MethodDelegationBinder$TerminationHandler r1 = r2.terminationHandler
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver r1 = r2.bindingResolver
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.implementation.bytecode.assign.Assigner r1 = r2.assigner
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
    public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r2) {
            r1 = this;
            net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate r0 = r1.implementationDelegate
            net.bytebuddy.dynamic.scaffold.InstrumentedType r2 = r0.prepare(r2)
            return r2
    }

    public net.bytebuddy.implementation.Implementation.Composable withAssigner(net.bytebuddy.implementation.bytecode.assign.Assigner r9) {
            r8 = this;
            net.bytebuddy.implementation.MethodDelegation r7 = new net.bytebuddy.implementation.MethodDelegation
            net.bytebuddy.implementation.MethodDelegation$ImplementationDelegate r1 = r8.implementationDelegate
            java.util.List<net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<?>> r2 = r8.parameterBinders
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver r3 = r8.ambiguityResolver
            net.bytebuddy.implementation.bind.MethodDelegationBinder$TerminationHandler r4 = r8.terminationHandler
            net.bytebuddy.implementation.bind.MethodDelegationBinder$BindingResolver r5 = r8.bindingResolver
            r0 = r7
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
    }
}
