package net.bytebuddy.implementation;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class MethodCall implements net.bytebuddy.implementation.Implementation.Composable {
    protected final java.util.List<net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory> argumentLoaders;
    protected final net.bytebuddy.implementation.bytecode.assign.Assigner assigner;
    protected final net.bytebuddy.implementation.MethodCall.MethodInvoker.Factory methodInvoker;
    protected final net.bytebuddy.implementation.MethodCall.MethodLocator.Factory methodLocator;
    protected final net.bytebuddy.implementation.MethodCall.TargetHandler.Factory targetHandler;
    protected final net.bytebuddy.implementation.MethodCall.TerminationHandler.Factory terminationHandler;
    protected final net.bytebuddy.implementation.bytecode.assign.Assigner.Typing typing;

    /* JADX INFO: renamed from: net.bytebuddy.implementation.MethodCall$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
    public class Appender implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
        private final java.util.List<net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider> argumentProviders;
        private final net.bytebuddy.implementation.Implementation.Target implementationTarget;
        private final net.bytebuddy.implementation.MethodCall.MethodInvoker methodInvoker;
        private final net.bytebuddy.implementation.MethodCall.MethodLocator methodLocator;
        private final net.bytebuddy.implementation.MethodCall.TargetHandler targetHandler;
        private final net.bytebuddy.implementation.MethodCall.TerminationHandler terminationHandler;
        final /* synthetic */ net.bytebuddy.implementation.MethodCall this$0;

        public Appender(net.bytebuddy.implementation.MethodCall r4, net.bytebuddy.implementation.Implementation.Target r5, net.bytebuddy.implementation.MethodCall.TerminationHandler r6) {
                r3 = this;
                r3.this$0 = r4
                r3.<init>()
                r3.implementationTarget = r5
                net.bytebuddy.implementation.MethodCall$MethodLocator$Factory r0 = r4.methodLocator
                net.bytebuddy.description.type.TypeDescription r1 = r5.getInstrumentedType()
                net.bytebuddy.implementation.MethodCall$MethodLocator r0 = r0.make(r1)
                r3.methodLocator = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.List<net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory> r1 = r4.argumentLoaders
                int r1 = r1.size()
                r0.<init>(r1)
                r3.argumentProviders = r0
                java.util.List<net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory> r0 = r4.argumentLoaders
                java.util.Iterator r0 = r0.iterator()
            L26:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L3c
                java.lang.Object r1 = r0.next()
                net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory r1 = (net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory) r1
                java.util.List<net.bytebuddy.implementation.MethodCall$ArgumentLoader$ArgumentProvider> r2 = r3.argumentProviders
                net.bytebuddy.implementation.MethodCall$ArgumentLoader$ArgumentProvider r1 = r1.make(r5)
                r2.add(r1)
                goto L26
            L3c:
                net.bytebuddy.implementation.MethodCall$MethodInvoker$Factory r0 = r4.methodInvoker
                net.bytebuddy.description.type.TypeDescription r1 = r5.getInstrumentedType()
                net.bytebuddy.implementation.MethodCall$MethodInvoker r0 = r0.make(r1)
                r3.methodInvoker = r0
                net.bytebuddy.implementation.MethodCall$TargetHandler$Factory r4 = r4.targetHandler
                net.bytebuddy.implementation.MethodCall$TargetHandler r4 = r4.make(r5)
                r3.targetHandler = r4
                r3.terminationHandler = r6
                return
        }

        public static /* synthetic */ net.bytebuddy.implementation.MethodCall.TargetHandler access$000(net.bytebuddy.implementation.MethodCall.Appender r0) {
                net.bytebuddy.implementation.MethodCall$TargetHandler r0 = r0.targetHandler
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r7, net.bytebuddy.implementation.Implementation.Context r8, net.bytebuddy.description.method.MethodDescription r9) {
                r6 = this;
                net.bytebuddy.implementation.MethodCall$TargetHandler r0 = r6.targetHandler
                net.bytebuddy.implementation.MethodCall$TargetHandler$Resolved r0 = r0.resolve(r9)
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r1 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r2 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.implementation.MethodCall$TerminationHandler r3 = r6.terminationHandler
                net.bytebuddy.implementation.bytecode.StackManipulation r3 = r3.prepare()
                net.bytebuddy.description.method.MethodDescription r4 = r6.toInvokedMethod(r9, r0)
                net.bytebuddy.implementation.bytecode.StackManipulation r0 = r6.toStackManipulation(r9, r4, r0)
                r4 = 2
                net.bytebuddy.implementation.bytecode.StackManipulation[] r4 = new net.bytebuddy.implementation.bytecode.StackManipulation[r4]
                r5 = 0
                r4[r5] = r3
                r3 = 1
                r4[r3] = r0
                r2.<init>(r4)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r7 = r2.apply(r7, r8)
                int r7 = r7.getMaximalSize()
                int r8 = r9.getStackSize()
                r1.<init>(r7, r8)
                return r1
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
                net.bytebuddy.implementation.MethodCall$Appender r5 = (net.bytebuddy.implementation.MethodCall.Appender) r5
                net.bytebuddy.implementation.Implementation$Target r3 = r5.implementationTarget
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                net.bytebuddy.implementation.MethodCall$MethodLocator r2 = r4.methodLocator
                net.bytebuddy.implementation.MethodCall$MethodLocator r3 = r5.methodLocator
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L2b
                return r1
            L2b:
                java.util.List<net.bytebuddy.implementation.MethodCall$ArgumentLoader$ArgumentProvider> r2 = r4.argumentProviders
                java.util.List<net.bytebuddy.implementation.MethodCall$ArgumentLoader$ArgumentProvider> r3 = r5.argumentProviders
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L36
                return r1
            L36:
                net.bytebuddy.implementation.MethodCall$MethodInvoker r2 = r4.methodInvoker
                net.bytebuddy.implementation.MethodCall$MethodInvoker r3 = r5.methodInvoker
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L41
                return r1
            L41:
                net.bytebuddy.implementation.MethodCall$TargetHandler r2 = r4.targetHandler
                net.bytebuddy.implementation.MethodCall$TargetHandler r3 = r5.targetHandler
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L4c
                return r1
            L4c:
                net.bytebuddy.implementation.MethodCall$TerminationHandler r2 = r4.terminationHandler
                net.bytebuddy.implementation.MethodCall$TerminationHandler r3 = r5.terminationHandler
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L57
                return r1
            L57:
                net.bytebuddy.implementation.MethodCall r2 = r4.this$0
                net.bytebuddy.implementation.MethodCall r5 = r5.this$0
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L62
                return r1
            L62:
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
                net.bytebuddy.implementation.MethodCall$MethodLocator r1 = r2.methodLocator
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.util.List<net.bytebuddy.implementation.MethodCall$ArgumentLoader$ArgumentProvider> r1 = r2.argumentProviders
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.MethodCall$MethodInvoker r1 = r2.methodInvoker
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.MethodCall$TargetHandler r1 = r2.targetHandler
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.MethodCall$TerminationHandler r1 = r2.terminationHandler
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.MethodCall r1 = r2.this$0
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        public net.bytebuddy.description.method.MethodDescription toInvokedMethod(net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved r3) {
                r1 = this;
                net.bytebuddy.implementation.MethodCall$MethodLocator r0 = r1.methodLocator
                net.bytebuddy.description.type.TypeDescription r3 = r3.getTypeDescription()
                net.bytebuddy.description.method.MethodDescription r2 = r0.resolve(r3, r2)
                return r2
        }

        public net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation(net.bytebuddy.description.method.MethodDescription r8, net.bytebuddy.description.method.MethodDescription r9, net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved r10) {
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.List<net.bytebuddy.implementation.MethodCall$ArgumentLoader$ArgumentProvider> r1 = r7.argumentProviders
                java.util.Iterator r1 = r1.iterator()
            Lb:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L1f
                java.lang.Object r2 = r1.next()
                net.bytebuddy.implementation.MethodCall$ArgumentLoader$ArgumentProvider r2 = (net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider) r2
                java.util.List r2 = r2.resolve(r8, r9)
                r0.addAll(r2)
                goto Lb
            L1f:
                net.bytebuddy.description.method.ParameterList r1 = r9.getParameters()
                int r2 = r1.size()
                int r3 = r0.size()
                if (r2 != r3) goto L96
                java.util.Iterator r1 = r1.iterator()
                java.util.ArrayList r2 = new java.util.ArrayList
                int r3 = r0.size()
                r2.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L3e:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L5e
                java.lang.Object r3 = r0.next()
                net.bytebuddy.implementation.MethodCall$ArgumentLoader r3 = (net.bytebuddy.implementation.MethodCall.ArgumentLoader) r3
                java.lang.Object r4 = r1.next()
                net.bytebuddy.description.method.ParameterDescription r4 = (net.bytebuddy.description.method.ParameterDescription) r4
                net.bytebuddy.implementation.MethodCall r5 = r7.this$0
                net.bytebuddy.implementation.bytecode.assign.Assigner r6 = r5.assigner
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r5 = r5.typing
                net.bytebuddy.implementation.bytecode.StackManipulation r3 = r3.toStackManipulation(r4, r6, r5)
                r2.add(r3)
                goto L3e
            L5e:
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.implementation.MethodCall r1 = r7.this$0
                net.bytebuddy.implementation.bytecode.assign.Assigner r3 = r1.assigner
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r1 = r1.typing
                net.bytebuddy.implementation.bytecode.StackManipulation r10 = r10.toStackManipulation(r9, r3, r1)
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r1 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                r1.<init>(r2)
                net.bytebuddy.implementation.MethodCall$MethodInvoker r2 = r7.methodInvoker
                net.bytebuddy.implementation.Implementation$Target r3 = r7.implementationTarget
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = r2.toStackManipulation(r9, r3)
                net.bytebuddy.implementation.MethodCall$TerminationHandler r3 = r7.terminationHandler
                net.bytebuddy.implementation.MethodCall r4 = r7.this$0
                net.bytebuddy.implementation.bytecode.assign.Assigner r5 = r4.assigner
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r4 = r4.typing
                net.bytebuddy.implementation.bytecode.StackManipulation r8 = r3.toStackManipulation(r9, r8, r5, r4)
                r9 = 4
                net.bytebuddy.implementation.bytecode.StackManipulation[] r9 = new net.bytebuddy.implementation.bytecode.StackManipulation[r9]
                r3 = 0
                r9[r3] = r10
                r10 = 1
                r9[r10] = r1
                r10 = 2
                r9[r10] = r2
                r10 = 3
                r9[r10] = r8
                r0.<init>(r9)
                return r0
            L96:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r9)
                java.lang.String r9 = " does not accept "
                r10.append(r9)
                int r9 = r0.size()
                r10.append(r9)
                java.lang.String r9 = " arguments"
                r10.append(r9)
                java.lang.String r9 = r10.toString()
                r8.<init>(r9)
                throw r8
        }
    }

    public interface ArgumentLoader {

        public interface ArgumentProvider {
            java.util.List<net.bytebuddy.implementation.MethodCall.ArgumentLoader> resolve(net.bytebuddy.description.method.MethodDescription r1, net.bytebuddy.description.method.MethodDescription r2);
        }

        public interface Factory extends net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable {
            net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider make(net.bytebuddy.implementation.Implementation.Target r1);
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForField implements net.bytebuddy.implementation.MethodCall.ArgumentLoader {
            private final net.bytebuddy.description.field.FieldDescription fieldDescription;
            private final net.bytebuddy.description.method.MethodDescription instrumentedMethod;

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ArgumentProvider implements net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider {
                private final net.bytebuddy.description.field.FieldDescription fieldDescription;

                public ArgumentProvider(net.bytebuddy.description.field.FieldDescription r1) {
                        r0 = this;
                        r0.<init>()
                        r0.fieldDescription = r1
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
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForField$ArgumentProvider r5 = (net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForField.ArgumentProvider) r5
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

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider
                public java.util.List<net.bytebuddy.implementation.MethodCall.ArgumentLoader> resolve(net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.description.method.MethodDescription r3) {
                        r1 = this;
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForField r3 = new net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForField
                        net.bytebuddy.description.field.FieldDescription r0 = r1.fieldDescription
                        r3.<init>(r0, r2)
                        java.util.List r2 = java.util.Collections.singletonList(r3)
                        return r2
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Factory implements net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory {
                private final net.bytebuddy.dynamic.scaffold.FieldLocator.Factory fieldLocatorFactory;
                private final java.lang.String name;

                public Factory(java.lang.String r1, net.bytebuddy.dynamic.scaffold.FieldLocator.Factory r2) {
                        r0 = this;
                        r0.<init>()
                        r0.name = r1
                        r0.fieldLocatorFactory = r2
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
                        java.lang.String r2 = r4.name
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForField$Factory r5 = (net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForField.Factory) r5
                        java.lang.String r3 = r5.name
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        net.bytebuddy.dynamic.scaffold.FieldLocator$Factory r2 = r4.fieldLocatorFactory
                        net.bytebuddy.dynamic.scaffold.FieldLocator$Factory r5 = r5.fieldLocatorFactory
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
                        java.lang.String r1 = r2.name
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.dynamic.scaffold.FieldLocator$Factory r1 = r2.fieldLocatorFactory
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider make(net.bytebuddy.implementation.Implementation.Target r4) {
                        r3 = this;
                        net.bytebuddy.dynamic.scaffold.FieldLocator$Factory r0 = r3.fieldLocatorFactory
                        net.bytebuddy.description.type.TypeDescription r1 = r4.getInstrumentedType()
                        net.bytebuddy.dynamic.scaffold.FieldLocator r0 = r0.make(r1)
                        java.lang.String r1 = r3.name
                        net.bytebuddy.dynamic.scaffold.FieldLocator$Resolution r0 = r0.locate(r1)
                        boolean r1 = r0.isResolved()
                        if (r1 == 0) goto L20
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForField$ArgumentProvider r4 = new net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForField$ArgumentProvider
                        net.bytebuddy.description.field.FieldDescription r0 = r0.getField()
                        r4.<init>(r0)
                        return r4
                    L20:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "Could not locate field '"
                        r1.append(r2)
                        java.lang.String r2 = r3.name
                        r1.append(r2)
                        java.lang.String r2 = "' on "
                        r1.append(r2)
                        net.bytebuddy.description.type.TypeDescription r4 = r4.getInstrumentedType()
                        r1.append(r4)
                        java.lang.String r4 = r1.toString()
                        r0.<init>(r4)
                        throw r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                        r0 = this;
                        return r1
                }
            }

            public ForField(net.bytebuddy.description.field.FieldDescription r1, net.bytebuddy.description.method.MethodDescription r2) {
                    r0 = this;
                    r0.<init>()
                    r0.fieldDescription = r1
                    r0.instrumentedMethod = r2
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
                    net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForField r5 = (net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForField) r5
                    net.bytebuddy.description.field.FieldDescription r3 = r5.fieldDescription
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.description.method.MethodDescription r2 = r4.instrumentedMethod
                    net.bytebuddy.description.method.MethodDescription r5 = r5.instrumentedMethod
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
                    net.bytebuddy.description.field.FieldDescription r1 = r2.fieldDescription
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.description.method.MethodDescription r1 = r2.instrumentedMethod
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader
            public net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation(net.bytebuddy.description.method.ParameterDescription r6, net.bytebuddy.implementation.bytecode.assign.Assigner r7, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r8) {
                    r5 = this;
                    net.bytebuddy.description.field.FieldDescription r0 = r5.fieldDescription
                    boolean r0 = r0.isStatic()
                    if (r0 != 0) goto L34
                    net.bytebuddy.description.method.MethodDescription r0 = r5.instrumentedMethod
                    boolean r0 = r0.isStatic()
                    if (r0 != 0) goto L11
                    goto L34
                L11:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    java.lang.String r8 = "Cannot access non-static "
                    r7.append(r8)
                    net.bytebuddy.description.field.FieldDescription r8 = r5.fieldDescription
                    r7.append(r8)
                    java.lang.String r8 = " from "
                    r7.append(r8)
                    net.bytebuddy.description.method.MethodDescription r8 = r5.instrumentedMethod
                    r7.append(r8)
                    java.lang.String r7 = r7.toString()
                    r6.<init>(r7)
                    throw r6
                L34:
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    net.bytebuddy.description.field.FieldDescription r1 = r5.fieldDescription
                    boolean r1 = r1.isStatic()
                    if (r1 == 0) goto L41
                    net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r1 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
                    goto L45
                L41:
                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                L45:
                    net.bytebuddy.description.field.FieldDescription r2 = r5.fieldDescription
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r2 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r2)
                    net.bytebuddy.implementation.bytecode.StackManipulation r2 = r2.read()
                    net.bytebuddy.description.field.FieldDescription r3 = r5.fieldDescription
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.getType()
                    net.bytebuddy.description.type.TypeDescription$Generic r4 = r6.getType()
                    net.bytebuddy.implementation.bytecode.StackManipulation r7 = r7.assign(r3, r4, r8)
                    r8 = 3
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r8 = new net.bytebuddy.implementation.bytecode.StackManipulation[r8]
                    r3 = 0
                    r8[r3] = r1
                    r1 = 1
                    r8[r1] = r2
                    r1 = 2
                    r8[r1] = r7
                    r0.<init>(r8)
                    boolean r7 = r0.isValid()
                    if (r7 == 0) goto L73
                    return r0
                L73:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>()
                    java.lang.String r0 = "Cannot assign "
                    r8.append(r0)
                    net.bytebuddy.description.field.FieldDescription r0 = r5.fieldDescription
                    r8.append(r0)
                    java.lang.String r0 = " to "
                    r8.append(r0)
                    r8.append(r6)
                    java.lang.String r6 = r8.toString()
                    r7.<init>(r6)
                    throw r7
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForInstance implements net.bytebuddy.implementation.MethodCall.ArgumentLoader, net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider {
            private final net.bytebuddy.description.field.FieldDescription fieldDescription;

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Factory implements net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory {
                private static final java.lang.String FIELD_PREFIX = "methodCall";

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.IGNORE)
                private final java.lang.String name;
                private final java.lang.Object value;

                public Factory(java.lang.Object r3) {
                        r2 = this;
                        r2.<init>()
                        r2.value = r3
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        java.lang.String r1 = "methodCall$"
                        r0.append(r1)
                        java.lang.String r3 = net.bytebuddy.utility.RandomString.hashOf(r3)
                        r0.append(r3)
                        java.lang.String r3 = r0.toString()
                        r2.name = r3
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
                        java.lang.Object r2 = r4.value
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForInstance$Factory r5 = (net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForInstance.Factory) r5
                        java.lang.Object r5 = r5.value
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
                        java.lang.Object r1 = r2.value
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider make(net.bytebuddy.implementation.Implementation.Target r3) {
                        r2 = this;
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForInstance r0 = new net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForInstance
                        net.bytebuddy.description.type.TypeDescription r3 = r3.getInstrumentedType()
                        net.bytebuddy.description.field.FieldList r3 = r3.getDeclaredFields()
                        java.lang.String r1 = r2.name
                        net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                        net.bytebuddy.matcher.FilterableList r3 = r3.filter(r1)
                        net.bytebuddy.description.field.FieldList r3 = (net.bytebuddy.description.field.FieldList) r3
                        java.lang.Object r3 = r3.getOnly()
                        net.bytebuddy.description.field.FieldDescription r3 = (net.bytebuddy.description.field.FieldDescription) r3
                        r0.<init>(r3)
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r5) {
                        r4 = this;
                        net.bytebuddy.description.field.FieldDescription$Token r0 = new net.bytebuddy.description.field.FieldDescription$Token
                        java.lang.String r1 = r4.name
                        java.lang.Object r2 = r4.value
                        java.lang.Class r2 = r2.getClass()
                        net.bytebuddy.description.type.TypeDescription$Generic r2 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r2)
                        r3 = 4105(0x1009, float:5.752E-42)
                        r0.<init>(r1, r3, r2)
                        java.lang.Object r1 = r4.value
                        net.bytebuddy.dynamic.scaffold.InstrumentedType r5 = r5.withAuxiliaryField(r0, r1)
                        return r5
                }
            }

            public ForInstance(net.bytebuddy.description.field.FieldDescription r1) {
                    r0 = this;
                    r0.<init>()
                    r0.fieldDescription = r1
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
                    net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForInstance r5 = (net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForInstance) r5
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

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider
            public java.util.List<net.bytebuddy.implementation.MethodCall.ArgumentLoader> resolve(net.bytebuddy.description.method.MethodDescription r1, net.bytebuddy.description.method.MethodDescription r2) {
                    r0 = this;
                    java.util.List r1 = java.util.Collections.singletonList(r0)
                    return r1
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader
            public net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation(net.bytebuddy.description.method.ParameterDescription r5, net.bytebuddy.implementation.bytecode.assign.Assigner r6, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r7) {
                    r4 = this;
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    net.bytebuddy.description.field.FieldDescription r1 = r4.fieldDescription
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r1 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r1)
                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = r1.read()
                    net.bytebuddy.description.field.FieldDescription r2 = r4.fieldDescription
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.getType()
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = r5.getType()
                    net.bytebuddy.implementation.bytecode.StackManipulation r6 = r6.assign(r2, r3, r7)
                    r7 = 2
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r7 = new net.bytebuddy.implementation.bytecode.StackManipulation[r7]
                    r2 = 0
                    r7[r2] = r1
                    r1 = 1
                    r7[r1] = r6
                    r0.<init>(r7)
                    boolean r6 = r0.isValid()
                    if (r6 == 0) goto L2d
                    return r0
                L2d:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    java.lang.String r0 = "Cannot assign "
                    r7.append(r0)
                    net.bytebuddy.description.field.FieldDescription r0 = r4.fieldDescription
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getType()
                    r7.append(r0)
                    java.lang.String r0 = " to "
                    r7.append(r0)
                    r7.append(r5)
                    java.lang.String r5 = r7.toString()
                    r6.<init>(r5)
                    throw r6
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForInstrumentedType implements net.bytebuddy.implementation.MethodCall.ArgumentLoader, net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider {
            private final net.bytebuddy.description.type.TypeDescription instrumentedType;

            public enum Factory extends java.lang.Enum<net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForInstrumentedType.Factory> implements net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory {
                private static final /* synthetic */ net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForInstrumentedType.Factory[] $VALUES = null;
                public static final net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForInstrumentedType.Factory INSTANCE = null;

                static {
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForInstrumentedType$Factory r0 = new net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForInstrumentedType$Factory
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForInstrumentedType.Factory.INSTANCE = r0
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForInstrumentedType$Factory[] r0 = new net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForInstrumentedType.Factory[]{r0}
                        net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForInstrumentedType.Factory.$VALUES = r0
                        return
                }

                Factory(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForInstrumentedType.Factory valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForInstrumentedType$Factory> r0 = net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForInstrumentedType.Factory.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForInstrumentedType$Factory r1 = (net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForInstrumentedType.Factory) r1
                        return r1
                }

                public static net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForInstrumentedType.Factory[] values() {
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForInstrumentedType$Factory[] r0 = net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForInstrumentedType.Factory.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForInstrumentedType$Factory[] r0 = (net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForInstrumentedType.Factory[]) r0
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider make(net.bytebuddy.implementation.Implementation.Target r2) {
                        r1 = this;
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForInstrumentedType r0 = new net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForInstrumentedType
                        net.bytebuddy.description.type.TypeDescription r2 = r2.getInstrumentedType()
                        r0.<init>(r2)
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                        r0 = this;
                        return r1
                }
            }

            public ForInstrumentedType(net.bytebuddy.description.type.TypeDescription r1) {
                    r0 = this;
                    r0.<init>()
                    r0.instrumentedType = r1
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
                    net.bytebuddy.description.type.TypeDescription r2 = r4.instrumentedType
                    net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForInstrumentedType r5 = (net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForInstrumentedType) r5
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

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider
            public java.util.List<net.bytebuddy.implementation.MethodCall.ArgumentLoader> resolve(net.bytebuddy.description.method.MethodDescription r1, net.bytebuddy.description.method.MethodDescription r2) {
                    r0 = this;
                    java.util.List r1 = java.util.Collections.singletonList(r0)
                    return r1
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader
            public net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation(net.bytebuddy.description.method.ParameterDescription r5, net.bytebuddy.implementation.bytecode.assign.Assigner r6, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r7) {
                    r4 = this;
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    net.bytebuddy.description.type.TypeDescription r1 = r4.instrumentedType
                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = net.bytebuddy.implementation.bytecode.constant.ClassConstant.of(r1)
                    java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r2)
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = r5.getType()
                    net.bytebuddy.implementation.bytecode.StackManipulation r6 = r6.assign(r2, r3, r7)
                    r7 = 2
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r7 = new net.bytebuddy.implementation.bytecode.StackManipulation[r7]
                    r2 = 0
                    r7[r2] = r1
                    r1 = 1
                    r7[r1] = r6
                    r0.<init>(r7)
                    boolean r6 = r0.isValid()
                    if (r6 == 0) goto L29
                    return r0
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    java.lang.String r0 = "Cannot assign Class value to "
                    r7.append(r0)
                    r7.append(r5)
                    java.lang.String r5 = r7.toString()
                    r6.<init>(r5)
                    throw r6
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForMethodCall implements net.bytebuddy.implementation.MethodCall.ArgumentLoader {
            private final net.bytebuddy.implementation.MethodCall.Appender appender;
            private final net.bytebuddy.description.method.MethodDescription instrumentedMethod;
            private final net.bytebuddy.description.method.MethodDescription methodDescription;
            private final net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved targetHandler;

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ArgumentProvider implements net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider {
                private final net.bytebuddy.implementation.MethodCall.Appender appender;

                public ArgumentProvider(net.bytebuddy.implementation.MethodCall.Appender r1) {
                        r0 = this;
                        r0.<init>()
                        r0.appender = r1
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
                        net.bytebuddy.implementation.MethodCall$Appender r2 = r4.appender
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodCall$ArgumentProvider r5 = (net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForMethodCall.ArgumentProvider) r5
                        net.bytebuddy.implementation.MethodCall$Appender r5 = r5.appender
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
                        net.bytebuddy.implementation.MethodCall$Appender r1 = r2.appender
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider
                public java.util.List<net.bytebuddy.implementation.MethodCall.ArgumentLoader> resolve(net.bytebuddy.description.method.MethodDescription r4, net.bytebuddy.description.method.MethodDescription r5) {
                        r3 = this;
                        net.bytebuddy.implementation.MethodCall$Appender r5 = r3.appender
                        net.bytebuddy.implementation.MethodCall$TargetHandler r5 = net.bytebuddy.implementation.MethodCall.Appender.access$000(r5)
                        net.bytebuddy.implementation.MethodCall$TargetHandler$Resolved r5 = r5.resolve(r4)
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodCall r0 = new net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodCall
                        net.bytebuddy.implementation.MethodCall$Appender r1 = r3.appender
                        net.bytebuddy.description.method.MethodDescription r2 = r1.toInvokedMethod(r4, r5)
                        r0.<init>(r1, r2, r4, r5)
                        java.util.List r4 = java.util.Collections.singletonList(r0)
                        return r4
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Factory implements net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory {
                private final net.bytebuddy.implementation.MethodCall methodCall;

                public Factory(net.bytebuddy.implementation.MethodCall r1) {
                        r0 = this;
                        r0.<init>()
                        r0.methodCall = r1
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
                        net.bytebuddy.implementation.MethodCall r2 = r4.methodCall
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodCall$Factory r5 = (net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForMethodCall.Factory) r5
                        net.bytebuddy.implementation.MethodCall r5 = r5.methodCall
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
                        net.bytebuddy.implementation.MethodCall r1 = r2.methodCall
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider make(net.bytebuddy.implementation.Implementation.Target r5) {
                        r4 = this;
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodCall$ArgumentProvider r0 = new net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodCall$ArgumentProvider
                        net.bytebuddy.implementation.MethodCall$Appender r1 = new net.bytebuddy.implementation.MethodCall$Appender
                        net.bytebuddy.implementation.MethodCall r2 = r4.methodCall
                        r2.getClass()
                        net.bytebuddy.implementation.MethodCall$TerminationHandler$Simple r3 = net.bytebuddy.implementation.MethodCall.TerminationHandler.Simple.IGNORING
                        r1.<init>(r2, r5, r3)
                        r0.<init>(r1)
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r2) {
                        r1 = this;
                        net.bytebuddy.implementation.MethodCall r0 = r1.methodCall
                        net.bytebuddy.dynamic.scaffold.InstrumentedType r2 = r0.prepare(r2)
                        return r2
                }
            }

            public ForMethodCall(net.bytebuddy.implementation.MethodCall.Appender r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.description.method.MethodDescription r3, net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved r4) {
                    r0 = this;
                    r0.<init>()
                    r0.appender = r1
                    r0.methodDescription = r2
                    r0.instrumentedMethod = r3
                    r0.targetHandler = r4
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
                    net.bytebuddy.implementation.MethodCall$Appender r2 = r4.appender
                    net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodCall r5 = (net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForMethodCall) r5
                    net.bytebuddy.implementation.MethodCall$Appender r3 = r5.appender
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.description.method.MethodDescription r2 = r4.methodDescription
                    net.bytebuddy.description.method.MethodDescription r3 = r5.methodDescription
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L2b
                    return r1
                L2b:
                    net.bytebuddy.description.method.MethodDescription r2 = r4.instrumentedMethod
                    net.bytebuddy.description.method.MethodDescription r3 = r5.instrumentedMethod
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L36
                    return r1
                L36:
                    net.bytebuddy.implementation.MethodCall$TargetHandler$Resolved r2 = r4.targetHandler
                    net.bytebuddy.implementation.MethodCall$TargetHandler$Resolved r5 = r5.targetHandler
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
                    net.bytebuddy.implementation.MethodCall$Appender r1 = r2.appender
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.description.method.MethodDescription r1 = r2.methodDescription
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.description.method.MethodDescription r1 = r2.instrumentedMethod
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.implementation.MethodCall$TargetHandler$Resolved r1 = r2.targetHandler
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader
            public net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation(net.bytebuddy.description.method.ParameterDescription r6, net.bytebuddy.implementation.bytecode.assign.Assigner r7, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r8) {
                    r5 = this;
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    net.bytebuddy.implementation.MethodCall$Appender r1 = r5.appender
                    net.bytebuddy.description.method.MethodDescription r2 = r5.instrumentedMethod
                    net.bytebuddy.description.method.MethodDescription r3 = r5.methodDescription
                    net.bytebuddy.implementation.MethodCall$TargetHandler$Resolved r4 = r5.targetHandler
                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = r1.toStackManipulation(r2, r3, r4)
                    net.bytebuddy.description.method.MethodDescription r2 = r5.methodDescription
                    boolean r2 = r2.isConstructor()
                    if (r2 == 0) goto L21
                    net.bytebuddy.description.method.MethodDescription r2 = r5.methodDescription
                    net.bytebuddy.description.type.TypeDefinition r2 = r2.getDeclaringType()
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.asGenericType()
                    goto L27
                L21:
                    net.bytebuddy.description.method.MethodDescription r2 = r5.methodDescription
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.getReturnType()
                L27:
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = r6.getType()
                    net.bytebuddy.implementation.bytecode.StackManipulation r7 = r7.assign(r2, r3, r8)
                    r8 = 2
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r8 = new net.bytebuddy.implementation.bytecode.StackManipulation[r8]
                    r2 = 0
                    r8[r2] = r1
                    r1 = 1
                    r8[r1] = r7
                    r0.<init>(r8)
                    boolean r7 = r0.isValid()
                    if (r7 == 0) goto L42
                    return r0
                L42:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>()
                    java.lang.String r0 = "Cannot assign return type of "
                    r8.append(r0)
                    net.bytebuddy.description.method.MethodDescription r0 = r5.methodDescription
                    r8.append(r0)
                    java.lang.String r0 = " to "
                    r8.append(r0)
                    r8.append(r6)
                    java.lang.String r6 = r8.toString()
                    r7.<init>(r6)
                    throw r7
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForMethodParameter implements net.bytebuddy.implementation.MethodCall.ArgumentLoader {
            private final int index;
            private final net.bytebuddy.description.method.MethodDescription instrumentedMethod;

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Factory implements net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory, net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider {
                private final int index;

                public Factory(int r1) {
                        r0 = this;
                        r0.<init>()
                        r0.index = r1
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
                        int r2 = r4.index
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameter$Factory r5 = (net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForMethodParameter.Factory) r5
                        int r5 = r5.index
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
                        int r1 = r2.index
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider make(net.bytebuddy.implementation.Implementation.Target r1) {
                        r0 = this;
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                        r0 = this;
                        return r1
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider
                public java.util.List<net.bytebuddy.implementation.MethodCall.ArgumentLoader> resolve(net.bytebuddy.description.method.MethodDescription r3, net.bytebuddy.description.method.MethodDescription r4) {
                        r2 = this;
                        int r4 = r2.index
                        net.bytebuddy.description.method.ParameterList r0 = r3.getParameters()
                        int r0 = r0.size()
                        if (r4 >= r0) goto L18
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameter r4 = new net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameter
                        int r0 = r2.index
                        r4.<init>(r0, r3)
                        java.util.List r3 = java.util.Collections.singletonList(r4)
                        return r3
                    L18:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        r0.append(r3)
                        java.lang.String r1 = " does not have a parameter with index "
                        r0.append(r1)
                        int r1 = r2.index
                        r0.append(r1)
                        java.lang.String r1 = ", "
                        r0.append(r1)
                        net.bytebuddy.description.method.ParameterList r3 = r3.getParameters()
                        int r3 = r3.size()
                        r0.append(r3)
                        java.lang.String r3 = " defined"
                        r0.append(r3)
                        java.lang.String r3 = r0.toString()
                        r4.<init>(r3)
                        throw r4
                }
            }

            public enum OfInstrumentedMethod extends java.lang.Enum<net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForMethodParameter.OfInstrumentedMethod> implements net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory, net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider {
                private static final /* synthetic */ net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForMethodParameter.OfInstrumentedMethod[] $VALUES = null;
                public static final net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForMethodParameter.OfInstrumentedMethod INSTANCE = null;

                static {
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameter$OfInstrumentedMethod r0 = new net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameter$OfInstrumentedMethod
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForMethodParameter.OfInstrumentedMethod.INSTANCE = r0
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameter$OfInstrumentedMethod[] r0 = new net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForMethodParameter.OfInstrumentedMethod[]{r0}
                        net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForMethodParameter.OfInstrumentedMethod.$VALUES = r0
                        return
                }

                OfInstrumentedMethod(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForMethodParameter.OfInstrumentedMethod valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameter$OfInstrumentedMethod> r0 = net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForMethodParameter.OfInstrumentedMethod.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameter$OfInstrumentedMethod r1 = (net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForMethodParameter.OfInstrumentedMethod) r1
                        return r1
                }

                public static net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForMethodParameter.OfInstrumentedMethod[] values() {
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameter$OfInstrumentedMethod[] r0 = net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForMethodParameter.OfInstrumentedMethod.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameter$OfInstrumentedMethod[] r0 = (net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForMethodParameter.OfInstrumentedMethod[]) r0
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider make(net.bytebuddy.implementation.Implementation.Target r1) {
                        r0 = this;
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                        r0 = this;
                        return r1
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider
                public java.util.List<net.bytebuddy.implementation.MethodCall.ArgumentLoader> resolve(net.bytebuddy.description.method.MethodDescription r4, net.bytebuddy.description.method.MethodDescription r5) {
                        r3 = this;
                        java.util.ArrayList r5 = new java.util.ArrayList
                        net.bytebuddy.description.method.ParameterList r0 = r4.getParameters()
                        int r0 = r0.size()
                        r5.<init>(r0)
                        net.bytebuddy.description.method.ParameterList r0 = r4.getParameters()
                        java.util.Iterator r0 = r0.iterator()
                    L15:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto L2e
                        java.lang.Object r1 = r0.next()
                        net.bytebuddy.description.method.ParameterDescription r1 = (net.bytebuddy.description.method.ParameterDescription) r1
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameter r2 = new net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameter
                        int r1 = r1.getIndex()
                        r2.<init>(r1, r4)
                        r5.add(r2)
                        goto L15
                    L2e:
                        return r5
                }
            }

            public ForMethodParameter(int r1, net.bytebuddy.description.method.MethodDescription r2) {
                    r0 = this;
                    r0.<init>()
                    r0.index = r1
                    r0.instrumentedMethod = r2
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
                    int r2 = r4.index
                    net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameter r5 = (net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForMethodParameter) r5
                    int r3 = r5.index
                    if (r2 == r3) goto L1c
                    return r1
                L1c:
                    net.bytebuddy.description.method.MethodDescription r2 = r4.instrumentedMethod
                    net.bytebuddy.description.method.MethodDescription r5 = r5.instrumentedMethod
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
                    int r1 = r2.index
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.description.method.MethodDescription r1 = r2.instrumentedMethod
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader
            public net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation(net.bytebuddy.description.method.ParameterDescription r6, net.bytebuddy.implementation.bytecode.assign.Assigner r7, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r8) {
                    r5 = this;
                    net.bytebuddy.description.method.MethodDescription r0 = r5.instrumentedMethod
                    net.bytebuddy.description.method.ParameterList r0 = r0.getParameters()
                    int r1 = r5.index
                    java.lang.Object r0 = r0.get(r1)
                    net.bytebuddy.description.method.ParameterDescription r0 = (net.bytebuddy.description.method.ParameterDescription) r0
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r1 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.load(r0)
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = r0.getType()
                    net.bytebuddy.description.type.TypeDescription$Generic r4 = r6.getType()
                    net.bytebuddy.implementation.bytecode.StackManipulation r7 = r7.assign(r3, r4, r8)
                    r8 = 2
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r8 = new net.bytebuddy.implementation.bytecode.StackManipulation[r8]
                    r3 = 0
                    r8[r3] = r2
                    r2 = 1
                    r8[r2] = r7
                    r1.<init>(r8)
                    boolean r7 = r1.isValid()
                    if (r7 == 0) goto L33
                    return r1
                L33:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>()
                    java.lang.String r1 = "Cannot assign "
                    r8.append(r1)
                    r8.append(r0)
                    java.lang.String r0 = " to "
                    r8.append(r0)
                    r8.append(r6)
                    java.lang.String r6 = " for "
                    r8.append(r6)
                    net.bytebuddy.description.method.MethodDescription r6 = r5.instrumentedMethod
                    r8.append(r6)
                    java.lang.String r6 = r8.toString()
                    r7.<init>(r6)
                    throw r7
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForMethodParameterArray implements net.bytebuddy.implementation.MethodCall.ArgumentLoader {
            private final net.bytebuddy.description.method.ParameterList<?> parameters;

            public enum ForInstrumentedMethod extends java.lang.Enum<net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForMethodParameterArray.ForInstrumentedMethod> implements net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory, net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider {
                private static final /* synthetic */ net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForMethodParameterArray.ForInstrumentedMethod[] $VALUES = null;
                public static final net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForMethodParameterArray.ForInstrumentedMethod INSTANCE = null;

                static {
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameterArray$ForInstrumentedMethod r0 = new net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameterArray$ForInstrumentedMethod
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForMethodParameterArray.ForInstrumentedMethod.INSTANCE = r0
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameterArray$ForInstrumentedMethod[] r0 = new net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForMethodParameterArray.ForInstrumentedMethod[]{r0}
                        net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForMethodParameterArray.ForInstrumentedMethod.$VALUES = r0
                        return
                }

                ForInstrumentedMethod(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForMethodParameterArray.ForInstrumentedMethod valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameterArray$ForInstrumentedMethod> r0 = net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForMethodParameterArray.ForInstrumentedMethod.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameterArray$ForInstrumentedMethod r1 = (net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForMethodParameterArray.ForInstrumentedMethod) r1
                        return r1
                }

                public static net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForMethodParameterArray.ForInstrumentedMethod[] values() {
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameterArray$ForInstrumentedMethod[] r0 = net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForMethodParameterArray.ForInstrumentedMethod.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameterArray$ForInstrumentedMethod[] r0 = (net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForMethodParameterArray.ForInstrumentedMethod[]) r0
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider make(net.bytebuddy.implementation.Implementation.Target r1) {
                        r0 = this;
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                        r0 = this;
                        return r1
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider
                public java.util.List<net.bytebuddy.implementation.MethodCall.ArgumentLoader> resolve(net.bytebuddy.description.method.MethodDescription r1, net.bytebuddy.description.method.MethodDescription r2) {
                        r0 = this;
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameterArray r2 = new net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameterArray
                        net.bytebuddy.description.method.ParameterList r1 = r1.getParameters()
                        r2.<init>(r1)
                        java.util.List r1 = java.util.Collections.singletonList(r2)
                        return r1
                }
            }

            public ForMethodParameterArray(net.bytebuddy.description.method.ParameterList<?> r1) {
                    r0 = this;
                    r0.<init>()
                    r0.parameters = r1
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
                    net.bytebuddy.description.method.ParameterList<?> r2 = r4.parameters
                    net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameterArray r5 = (net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForMethodParameterArray) r5
                    net.bytebuddy.description.method.ParameterList<?> r5 = r5.parameters
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
                    net.bytebuddy.description.method.ParameterList<?> r1 = r2.parameters
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader
            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
            public net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation(net.bytebuddy.description.method.ParameterDescription r10, net.bytebuddy.implementation.bytecode.assign.Assigner r11, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r12) {
                    r9 = this;
                    r0 = 1
                    r1 = 0
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = r10.getType()
                    java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
                    boolean r2 = r2.represents(r3)
                    if (r2 == 0) goto L13
                    net.bytebuddy.description.type.TypeDescription$Generic r10 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r3)
                    goto L25
                L13:
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = r10.getType()
                    boolean r2 = r2.isArray()
                    if (r2 == 0) goto L95
                    net.bytebuddy.description.type.TypeDescription$Generic r10 = r10.getType()
                    net.bytebuddy.description.type.TypeDescription$Generic r10 = r10.getComponentType()
                L25:
                    java.util.ArrayList r2 = new java.util.ArrayList
                    net.bytebuddy.description.method.ParameterList<?> r3 = r9.parameters
                    int r3 = r3.size()
                    r2.<init>(r3)
                    net.bytebuddy.description.method.ParameterList<?> r3 = r9.parameters
                    java.util.Iterator r3 = r3.iterator()
                L36:
                    boolean r4 = r3.hasNext()
                    if (r4 == 0) goto L83
                    java.lang.Object r4 = r3.next()
                    net.bytebuddy.description.method.ParameterDescription r4 = (net.bytebuddy.description.method.ParameterDescription) r4
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r5 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    net.bytebuddy.implementation.bytecode.StackManipulation r6 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.load(r4)
                    net.bytebuddy.description.type.TypeDescription$Generic r7 = r4.getType()
                    net.bytebuddy.implementation.bytecode.StackManipulation r7 = r11.assign(r7, r10, r12)
                    r8 = 2
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r8 = new net.bytebuddy.implementation.bytecode.StackManipulation[r8]
                    r8[r1] = r6
                    r8[r0] = r7
                    r5.<init>(r8)
                    boolean r6 = r5.isValid()
                    if (r6 == 0) goto L64
                    r2.add(r5)
                    goto L36
                L64:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r12 = new java.lang.StringBuilder
                    r12.<init>()
                    java.lang.String r0 = "Cannot assign "
                    r12.append(r0)
                    r12.append(r4)
                    java.lang.String r0 = " to "
                    r12.append(r0)
                    r12.append(r10)
                    java.lang.String r10 = r12.toString()
                    r11.<init>(r10)
                    throw r11
                L83:
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r11 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    net.bytebuddy.implementation.bytecode.collection.ArrayFactory r10 = net.bytebuddy.implementation.bytecode.collection.ArrayFactory.forType(r10)
                    net.bytebuddy.implementation.bytecode.StackManipulation r10 = r10.withValues(r2)
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r12 = new net.bytebuddy.implementation.bytecode.StackManipulation[r0]
                    r12[r1] = r10
                    r11.<init>(r12)
                    return r11
                L95:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r12 = new java.lang.StringBuilder
                    r12.<init>()
                    java.lang.String r0 = "Cannot set method parameter array for non-array type: "
                    r12.append(r0)
                    r12.append(r10)
                    java.lang.String r10 = r12.toString()
                    r11.<init>(r10)
                    throw r11
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForMethodParameterArrayElement implements net.bytebuddy.implementation.MethodCall.ArgumentLoader {
            private final int index;
            private final net.bytebuddy.description.method.ParameterDescription parameterDescription;

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class OfInvokedMethod implements net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory, net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider {
                private final int index;

                public OfInvokedMethod(int r1) {
                        r0 = this;
                        r0.<init>()
                        r0.index = r1
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
                        int r2 = r4.index
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameterArrayElement$OfInvokedMethod r5 = (net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForMethodParameterArrayElement.OfInvokedMethod) r5
                        int r5 = r5.index
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
                        int r1 = r2.index
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider make(net.bytebuddy.implementation.Implementation.Target r1) {
                        r0 = this;
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                        r0 = this;
                        return r1
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider
                public java.util.List<net.bytebuddy.implementation.MethodCall.ArgumentLoader> resolve(net.bytebuddy.description.method.MethodDescription r6, net.bytebuddy.description.method.MethodDescription r7) {
                        r5 = this;
                        net.bytebuddy.description.method.ParameterList r0 = r6.getParameters()
                        int r0 = r0.size()
                        int r1 = r5.index
                        if (r0 <= r1) goto L7d
                        net.bytebuddy.description.method.ParameterList r0 = r6.getParameters()
                        int r1 = r5.index
                        java.lang.Object r0 = r0.get(r1)
                        net.bytebuddy.description.method.ParameterDescription r0 = (net.bytebuddy.description.method.ParameterDescription) r0
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getType()
                        boolean r0 = r0.isArray()
                        if (r0 == 0) goto L52
                        java.util.ArrayList r0 = new java.util.ArrayList
                        net.bytebuddy.description.method.ParameterList r1 = r7.getParameters()
                        int r1 = r1.size()
                        r0.<init>(r1)
                        r1 = 0
                    L30:
                        net.bytebuddy.description.method.ParameterList r2 = r7.getParameters()
                        int r2 = r2.size()
                        if (r1 >= r2) goto L51
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameterArrayElement r2 = new net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameterArrayElement
                        net.bytebuddy.description.method.ParameterList r3 = r6.getParameters()
                        int r4 = r5.index
                        java.lang.Object r3 = r3.get(r4)
                        net.bytebuddy.description.method.ParameterDescription r3 = (net.bytebuddy.description.method.ParameterDescription) r3
                        r2.<init>(r3, r1)
                        r0.add(r2)
                        int r1 = r1 + 1
                        goto L30
                    L51:
                        return r0
                    L52:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        java.lang.String r1 = "Cannot access an item from non-array parameter "
                        r0.append(r1)
                        net.bytebuddy.description.method.ParameterList r6 = r6.getParameters()
                        int r1 = r5.index
                        java.lang.Object r6 = r6.get(r1)
                        r0.append(r6)
                        java.lang.String r6 = " at index "
                        r0.append(r6)
                        int r6 = r5.index
                        r0.append(r6)
                        java.lang.String r6 = r0.toString()
                        r7.<init>(r6)
                        throw r7
                    L7d:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        r0.append(r6)
                        java.lang.String r1 = " does not declare a parameter with index "
                        r0.append(r1)
                        int r1 = r5.index
                        r0.append(r1)
                        java.lang.String r1 = ", "
                        r0.append(r1)
                        net.bytebuddy.description.method.ParameterList r6 = r6.getParameters()
                        int r6 = r6.size()
                        r0.append(r6)
                        java.lang.String r6 = " defined"
                        r0.append(r6)
                        java.lang.String r6 = r0.toString()
                        r7.<init>(r6)
                        throw r7
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class OfParameter implements net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory, net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider {
                private final int arrayIndex;
                private final int index;

                public OfParameter(int r1, int r2) {
                        r0 = this;
                        r0.<init>()
                        r0.index = r1
                        r0.arrayIndex = r2
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
                        int r2 = r4.index
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameterArrayElement$OfParameter r5 = (net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForMethodParameterArrayElement.OfParameter) r5
                        int r3 = r5.index
                        if (r2 == r3) goto L1c
                        return r1
                    L1c:
                        int r2 = r4.arrayIndex
                        int r5 = r5.arrayIndex
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
                        int r1 = r2.index
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        int r1 = r2.arrayIndex
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider make(net.bytebuddy.implementation.Implementation.Target r1) {
                        r0 = this;
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                        r0 = this;
                        return r1
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider
                public java.util.List<net.bytebuddy.implementation.MethodCall.ArgumentLoader> resolve(net.bytebuddy.description.method.MethodDescription r3, net.bytebuddy.description.method.MethodDescription r4) {
                        r2 = this;
                        net.bytebuddy.description.method.ParameterList r4 = r3.getParameters()
                        int r4 = r4.size()
                        int r0 = r2.index
                        if (r4 <= r0) goto L65
                        net.bytebuddy.description.method.ParameterList r4 = r3.getParameters()
                        int r0 = r2.index
                        java.lang.Object r4 = r4.get(r0)
                        net.bytebuddy.description.method.ParameterDescription r4 = (net.bytebuddy.description.method.ParameterDescription) r4
                        net.bytebuddy.description.type.TypeDescription$Generic r4 = r4.getType()
                        boolean r4 = r4.isArray()
                        if (r4 == 0) goto L3a
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameterArrayElement r4 = new net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameterArrayElement
                        net.bytebuddy.description.method.ParameterList r3 = r3.getParameters()
                        int r0 = r2.index
                        java.lang.Object r3 = r3.get(r0)
                        net.bytebuddy.description.method.ParameterDescription r3 = (net.bytebuddy.description.method.ParameterDescription) r3
                        int r0 = r2.arrayIndex
                        r4.<init>(r3, r0)
                        java.util.List r3 = java.util.Collections.singletonList(r4)
                        return r3
                    L3a:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        java.lang.String r1 = "Cannot access an item from non-array parameter "
                        r0.append(r1)
                        net.bytebuddy.description.method.ParameterList r3 = r3.getParameters()
                        int r1 = r2.index
                        java.lang.Object r3 = r3.get(r1)
                        r0.append(r3)
                        java.lang.String r3 = " at index "
                        r0.append(r3)
                        int r3 = r2.index
                        r0.append(r3)
                        java.lang.String r3 = r0.toString()
                        r4.<init>(r3)
                        throw r4
                    L65:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        r0.append(r3)
                        java.lang.String r1 = " does not declare a parameter with index "
                        r0.append(r1)
                        int r1 = r2.index
                        r0.append(r1)
                        java.lang.String r1 = ", "
                        r0.append(r1)
                        net.bytebuddy.description.method.ParameterList r3 = r3.getParameters()
                        int r3 = r3.size()
                        r0.append(r3)
                        java.lang.String r3 = " defined"
                        r0.append(r3)
                        java.lang.String r3 = r0.toString()
                        r4.<init>(r3)
                        throw r4
                }
            }

            public ForMethodParameterArrayElement(net.bytebuddy.description.method.ParameterDescription r1, int r2) {
                    r0 = this;
                    r0.<init>()
                    r0.parameterDescription = r1
                    r0.index = r2
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
                    int r2 = r4.index
                    net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameterArrayElement r5 = (net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForMethodParameterArrayElement) r5
                    int r3 = r5.index
                    if (r2 == r3) goto L1c
                    return r1
                L1c:
                    net.bytebuddy.description.method.ParameterDescription r2 = r4.parameterDescription
                    net.bytebuddy.description.method.ParameterDescription r5 = r5.parameterDescription
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
                    net.bytebuddy.description.method.ParameterDescription r1 = r2.parameterDescription
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    int r1 = r2.index
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader
            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
            public net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation(net.bytebuddy.description.method.ParameterDescription r7, net.bytebuddy.implementation.bytecode.assign.Assigner r8, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r9) {
                    r6 = this;
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    net.bytebuddy.description.method.ParameterDescription r1 = r6.parameterDescription
                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.load(r1)
                    int r2 = r6.index
                    net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.forValue(r2)
                    net.bytebuddy.description.method.ParameterDescription r3 = r6.parameterDescription
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.getType()
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.getComponentType()
                    net.bytebuddy.implementation.bytecode.collection.ArrayAccess r3 = net.bytebuddy.implementation.bytecode.collection.ArrayAccess.of(r3)
                    net.bytebuddy.implementation.bytecode.StackManipulation r3 = r3.load()
                    net.bytebuddy.description.method.ParameterDescription r4 = r6.parameterDescription
                    net.bytebuddy.description.type.TypeDescription$Generic r4 = r4.getType()
                    net.bytebuddy.description.type.TypeDescription$Generic r4 = r4.getComponentType()
                    net.bytebuddy.description.type.TypeDescription$Generic r5 = r7.getType()
                    net.bytebuddy.implementation.bytecode.StackManipulation r8 = r8.assign(r4, r5, r9)
                    r9 = 4
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r9 = new net.bytebuddy.implementation.bytecode.StackManipulation[r9]
                    r4 = 0
                    r9[r4] = r1
                    r1 = 1
                    r9[r1] = r2
                    r1 = 2
                    r9[r1] = r3
                    r1 = 3
                    r9[r1] = r8
                    r0.<init>(r9)
                    boolean r8 = r0.isValid()
                    if (r8 == 0) goto L4b
                    return r0
                L4b:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r9 = new java.lang.StringBuilder
                    r9.<init>()
                    java.lang.String r0 = "Cannot assign "
                    r9.append(r0)
                    net.bytebuddy.description.method.ParameterDescription r0 = r6.parameterDescription
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getType()
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getComponentType()
                    r9.append(r0)
                    java.lang.String r0 = " to "
                    r9.append(r0)
                    r9.append(r7)
                    java.lang.String r7 = r9.toString()
                    r8.<init>(r7)
                    throw r8
            }
        }

        public enum ForNullConstant extends java.lang.Enum<net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForNullConstant> implements net.bytebuddy.implementation.MethodCall.ArgumentLoader, net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider, net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory {
            private static final /* synthetic */ net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForNullConstant[] $VALUES = null;
            public static final net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForNullConstant INSTANCE = null;

            static {
                    net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForNullConstant r0 = new net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForNullConstant
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForNullConstant.INSTANCE = r0
                    net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForNullConstant[] r0 = new net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForNullConstant[]{r0}
                    net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForNullConstant.$VALUES = r0
                    return
            }

            ForNullConstant(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForNullConstant valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForNullConstant> r0 = net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForNullConstant.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForNullConstant r1 = (net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForNullConstant) r1
                    return r1
            }

            public static net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForNullConstant[] values() {
                    net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForNullConstant[] r0 = net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForNullConstant.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForNullConstant[] r0 = (net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForNullConstant[]) r0
                    return r0
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
            public net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider make(net.bytebuddy.implementation.Implementation.Target r1) {
                    r0 = this;
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                    r0 = this;
                    return r1
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider
            public java.util.List<net.bytebuddy.implementation.MethodCall.ArgumentLoader> resolve(net.bytebuddy.description.method.MethodDescription r1, net.bytebuddy.description.method.MethodDescription r2) {
                    r0 = this;
                    java.util.List r1 = java.util.Collections.singletonList(r0)
                    return r1
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader
            public net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation(net.bytebuddy.description.method.ParameterDescription r2, net.bytebuddy.implementation.bytecode.assign.Assigner r3, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r4) {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = r2.getType()
                    boolean r3 = r3.isPrimitive()
                    if (r3 != 0) goto Ld
                    net.bytebuddy.implementation.bytecode.constant.NullConstant r2 = net.bytebuddy.implementation.bytecode.constant.NullConstant.INSTANCE
                    return r2
                Ld:
                    java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    java.lang.String r0 = "Cannot assign null to "
                    r4.append(r0)
                    r4.append(r2)
                    java.lang.String r2 = r4.toString()
                    r3.<init>(r2)
                    throw r3
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForStackManipulation implements net.bytebuddy.implementation.MethodCall.ArgumentLoader, net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider, net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory {
            private final net.bytebuddy.implementation.bytecode.StackManipulation stackManipulation;
            private final net.bytebuddy.description.type.TypeDefinition typeDefinition;

            public ForStackManipulation(net.bytebuddy.implementation.bytecode.StackManipulation r1, java.lang.reflect.Type r2) {
                    r0 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r2)
                    r0.<init>(r1, r2)
                    return
            }

            public ForStackManipulation(net.bytebuddy.implementation.bytecode.StackManipulation r1, net.bytebuddy.description.type.TypeDefinition r2) {
                    r0 = this;
                    r0.<init>()
                    r0.stackManipulation = r1
                    r0.typeDefinition = r2
                    return
            }

            public static net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory of(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r2) {
                    if (r2 != 0) goto L5
                    net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForNullConstant r2 = net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForNullConstant.INSTANCE
                    return r2
                L5:
                    net.bytebuddy.utility.ConstantValue r0 = net.bytebuddy.utility.ConstantValue.Simple.wrapOrNull(r2)
                    if (r0 != 0) goto L11
                    net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForInstance$Factory r0 = new net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForInstance$Factory
                    r0.<init>(r2)
                    goto L1f
                L11:
                    net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForStackManipulation r2 = new net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForStackManipulation
                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = r0.toStackManipulation()
                    net.bytebuddy.description.type.TypeDescription r0 = r0.getTypeDescription()
                    r2.<init>(r1, r0)
                    r0 = r2
                L1f:
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
                    net.bytebuddy.implementation.bytecode.StackManipulation r2 = r4.stackManipulation
                    net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForStackManipulation r5 = (net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForStackManipulation) r5
                    net.bytebuddy.implementation.bytecode.StackManipulation r3 = r5.stackManipulation
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.description.type.TypeDefinition r2 = r4.typeDefinition
                    net.bytebuddy.description.type.TypeDefinition r5 = r5.typeDefinition
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
                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = r2.stackManipulation
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.description.type.TypeDefinition r1 = r2.typeDefinition
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
            public net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider make(net.bytebuddy.implementation.Implementation.Target r1) {
                    r0 = this;
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                    r0 = this;
                    return r1
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider
            public java.util.List<net.bytebuddy.implementation.MethodCall.ArgumentLoader> resolve(net.bytebuddy.description.method.MethodDescription r1, net.bytebuddy.description.method.MethodDescription r2) {
                    r0 = this;
                    java.util.List r1 = java.util.Collections.singletonList(r0)
                    return r1
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader
            public net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation(net.bytebuddy.description.method.ParameterDescription r3, net.bytebuddy.implementation.bytecode.assign.Assigner r4, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r5) {
                    r2 = this;
                    net.bytebuddy.description.type.TypeDefinition r0 = r2.typeDefinition
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.asGenericType()
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r3.getType()
                    net.bytebuddy.implementation.bytecode.StackManipulation r4 = r4.assign(r0, r1, r5)
                    boolean r5 = r4.isValid()
                    if (r5 == 0) goto L25
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r3 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    net.bytebuddy.implementation.bytecode.StackManipulation r5 = r2.stackManipulation
                    r0 = 2
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r0 = new net.bytebuddy.implementation.bytecode.StackManipulation[r0]
                    r1 = 0
                    r0[r1] = r5
                    r5 = 1
                    r0[r5] = r4
                    r3.<init>(r0)
                    return r3
                L25:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    r5.<init>()
                    java.lang.String r0 = "Cannot assign "
                    r5.append(r0)
                    r5.append(r3)
                    java.lang.String r3 = " to "
                    r5.append(r3)
                    net.bytebuddy.description.type.TypeDefinition r3 = r2.typeDefinition
                    r5.append(r3)
                    java.lang.String r3 = r5.toString()
                    r4.<init>(r3)
                    throw r4
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForThisReference implements net.bytebuddy.implementation.MethodCall.ArgumentLoader, net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider {
            private final net.bytebuddy.description.type.TypeDescription instrumentedType;

            public enum Factory extends java.lang.Enum<net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForThisReference.Factory> implements net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory {
                private static final /* synthetic */ net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForThisReference.Factory[] $VALUES = null;
                public static final net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForThisReference.Factory INSTANCE = null;

                static {
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForThisReference$Factory r0 = new net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForThisReference$Factory
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForThisReference.Factory.INSTANCE = r0
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForThisReference$Factory[] r0 = new net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForThisReference.Factory[]{r0}
                        net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForThisReference.Factory.$VALUES = r0
                        return
                }

                Factory(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForThisReference.Factory valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForThisReference$Factory> r0 = net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForThisReference.Factory.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForThisReference$Factory r1 = (net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForThisReference.Factory) r1
                        return r1
                }

                public static net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForThisReference.Factory[] values() {
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForThisReference$Factory[] r0 = net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForThisReference.Factory.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForThisReference$Factory[] r0 = (net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForThisReference.Factory[]) r0
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider make(net.bytebuddy.implementation.Implementation.Target r2) {
                        r1 = this;
                        net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForThisReference r0 = new net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForThisReference
                        net.bytebuddy.description.type.TypeDescription r2 = r2.getInstrumentedType()
                        r0.<init>(r2)
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                        r0 = this;
                        return r1
                }
            }

            public ForThisReference(net.bytebuddy.description.type.TypeDescription r1) {
                    r0 = this;
                    r0.<init>()
                    r0.instrumentedType = r1
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
                    net.bytebuddy.description.type.TypeDescription r2 = r4.instrumentedType
                    net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForThisReference r5 = (net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForThisReference) r5
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

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider
            public java.util.List<net.bytebuddy.implementation.MethodCall.ArgumentLoader> resolve(net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.description.method.MethodDescription r3) {
                    r1 = this;
                    boolean r3 = r2.isStatic()
                    if (r3 != 0) goto Lb
                    java.util.List r2 = java.util.Collections.singletonList(r1)
                    return r2
                Lb:
                    java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r2)
                    java.lang.String r2 = " is static and cannot supply an invoker instance"
                    r0.append(r2)
                    java.lang.String r2 = r0.toString()
                    r3.<init>(r2)
                    throw r3
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader
            public net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation(net.bytebuddy.description.method.ParameterDescription r5, net.bytebuddy.implementation.bytecode.assign.Assigner r6, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r7) {
                    r4 = this;
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                    net.bytebuddy.description.type.TypeDescription r2 = r4.instrumentedType
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.asGenericType()
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = r5.getType()
                    net.bytebuddy.implementation.bytecode.StackManipulation r6 = r6.assign(r2, r3, r7)
                    r7 = 2
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r7 = new net.bytebuddy.implementation.bytecode.StackManipulation[r7]
                    r2 = 0
                    r7[r2] = r1
                    r1 = 1
                    r7[r1] = r6
                    r0.<init>(r7)
                    boolean r6 = r0.isValid()
                    if (r6 == 0) goto L27
                    return r0
                L27:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    java.lang.String r0 = "Cannot assign "
                    r7.append(r0)
                    net.bytebuddy.description.type.TypeDescription r0 = r4.instrumentedType
                    r7.append(r0)
                    java.lang.String r0 = " to "
                    r7.append(r0)
                    r7.append(r5)
                    java.lang.String r5 = r7.toString()
                    r6.<init>(r5)
                    throw r6
            }
        }

        net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation(net.bytebuddy.description.method.ParameterDescription r1, net.bytebuddy.implementation.bytecode.assign.Assigner r2, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r3);
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class FieldSetting implements net.bytebuddy.implementation.Implementation.Composable {
        private final net.bytebuddy.implementation.MethodCall methodCall;

        public enum Appender extends java.lang.Enum<net.bytebuddy.implementation.MethodCall.FieldSetting.Appender> implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
            private static final /* synthetic */ net.bytebuddy.implementation.MethodCall.FieldSetting.Appender[] $VALUES = null;
            public static final net.bytebuddy.implementation.MethodCall.FieldSetting.Appender INSTANCE = null;

            static {
                    net.bytebuddy.implementation.MethodCall$FieldSetting$Appender r0 = new net.bytebuddy.implementation.MethodCall$FieldSetting$Appender
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.implementation.MethodCall.FieldSetting.Appender.INSTANCE = r0
                    net.bytebuddy.implementation.MethodCall$FieldSetting$Appender[] r0 = new net.bytebuddy.implementation.MethodCall.FieldSetting.Appender[]{r0}
                    net.bytebuddy.implementation.MethodCall.FieldSetting.Appender.$VALUES = r0
                    return
            }

            Appender(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.implementation.MethodCall.FieldSetting.Appender valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.implementation.MethodCall$FieldSetting$Appender> r0 = net.bytebuddy.implementation.MethodCall.FieldSetting.Appender.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.implementation.MethodCall$FieldSetting$Appender r1 = (net.bytebuddy.implementation.MethodCall.FieldSetting.Appender) r1
                    return r1
            }

            public static net.bytebuddy.implementation.MethodCall.FieldSetting.Appender[] values() {
                    net.bytebuddy.implementation.MethodCall$FieldSetting$Appender[] r0 = net.bytebuddy.implementation.MethodCall.FieldSetting.Appender.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.implementation.MethodCall$FieldSetting$Appender[] r0 = (net.bytebuddy.implementation.MethodCall.FieldSetting.Appender[]) r0
                    return r0
            }

            @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
            public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r3, net.bytebuddy.implementation.Implementation.Context r4, net.bytebuddy.description.method.MethodDescription r5) {
                    r2 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r5.getReturnType()
                    java.lang.Class r1 = java.lang.Void.TYPE
                    boolean r0 = r0.represents(r1)
                    if (r0 == 0) goto L20
                    net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r0 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                    net.bytebuddy.implementation.bytecode.member.MethodReturn r1 = net.bytebuddy.implementation.bytecode.member.MethodReturn.VOID
                    net.bytebuddy.implementation.bytecode.StackManipulation$Size r3 = r1.apply(r3, r4)
                    int r3 = r3.getMaximalSize()
                    int r4 = r5.getStackSize()
                    r0.<init>(r3, r4)
                    return r0
                L20:
                    java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    java.lang.String r0 = "Instrumented method "
                    r4.append(r0)
                    r4.append(r5)
                    java.lang.String r5 = " does not return void for field setting method call"
                    r4.append(r5)
                    java.lang.String r4 = r4.toString()
                    r3.<init>(r4)
                    throw r3
            }
        }

        public FieldSetting(net.bytebuddy.implementation.MethodCall r1) {
                r0 = this;
                r0.<init>()
                r0.methodCall = r1
                return
        }

        @Override // net.bytebuddy.implementation.Implementation.Composable
        public net.bytebuddy.implementation.Implementation.Composable andThen(net.bytebuddy.implementation.Implementation.Composable r3) {
                r2 = this;
                net.bytebuddy.implementation.Implementation$Compound$Composable r0 = new net.bytebuddy.implementation.Implementation$Compound$Composable
                net.bytebuddy.implementation.MethodCall r1 = r2.methodCall
                r0.<init>(r1, r3)
                return r0
        }

        @Override // net.bytebuddy.implementation.Implementation.Composable
        public net.bytebuddy.implementation.Implementation andThen(net.bytebuddy.implementation.Implementation r5) {
                r4 = this;
                net.bytebuddy.implementation.Implementation$Compound r0 = new net.bytebuddy.implementation.Implementation$Compound
                net.bytebuddy.implementation.MethodCall r1 = r4.methodCall
                r2 = 2
                net.bytebuddy.implementation.Implementation[] r2 = new net.bytebuddy.implementation.Implementation[r2]
                r3 = 0
                r2[r3] = r1
                r1 = 1
                r2[r1] = r5
                r0.<init>(r2)
                return r0
        }

        @Override // net.bytebuddy.implementation.Implementation
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r4) {
                r3 = this;
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Compound r0 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Compound
                net.bytebuddy.implementation.MethodCall r1 = r3.methodCall
                net.bytebuddy.implementation.bytecode.ByteCodeAppender r4 = r1.appender(r4)
                r1 = 2
                net.bytebuddy.implementation.bytecode.ByteCodeAppender[] r1 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender[r1]
                r2 = 0
                r1[r2] = r4
                net.bytebuddy.implementation.MethodCall$FieldSetting$Appender r4 = net.bytebuddy.implementation.MethodCall.FieldSetting.Appender.INSTANCE
                r2 = 1
                r1[r2] = r4
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
                net.bytebuddy.implementation.MethodCall r2 = r4.methodCall
                net.bytebuddy.implementation.MethodCall$FieldSetting r5 = (net.bytebuddy.implementation.MethodCall.FieldSetting) r5
                net.bytebuddy.implementation.MethodCall r5 = r5.methodCall
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
                net.bytebuddy.implementation.MethodCall r1 = r2.methodCall
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r2) {
                r1 = this;
                net.bytebuddy.implementation.MethodCall r0 = r1.methodCall
                net.bytebuddy.dynamic.scaffold.InstrumentedType r2 = r0.prepare(r2)
                return r2
        }

        public net.bytebuddy.implementation.Implementation.Composable withAssigner(net.bytebuddy.implementation.bytecode.assign.Assigner r3, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r4) {
                r2 = this;
                net.bytebuddy.implementation.MethodCall$FieldSetting r0 = new net.bytebuddy.implementation.MethodCall$FieldSetting
                net.bytebuddy.implementation.MethodCall r1 = r2.methodCall
                net.bytebuddy.implementation.Implementation$Composable r3 = r1.withAssigner(r3, r4)
                net.bytebuddy.implementation.MethodCall r3 = (net.bytebuddy.implementation.MethodCall) r3
                r0.<init>(r3)
                return r0
        }
    }

    public interface MethodInvoker {

        public interface Factory {
            net.bytebuddy.implementation.MethodCall.MethodInvoker make(net.bytebuddy.description.type.TypeDescription r1);
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForContextualInvocation implements net.bytebuddy.implementation.MethodCall.MethodInvoker {
            private final net.bytebuddy.description.type.TypeDescription instrumentedType;

            public enum Factory extends java.lang.Enum<net.bytebuddy.implementation.MethodCall.MethodInvoker.ForContextualInvocation.Factory> implements net.bytebuddy.implementation.MethodCall.MethodInvoker.Factory {
                private static final /* synthetic */ net.bytebuddy.implementation.MethodCall.MethodInvoker.ForContextualInvocation.Factory[] $VALUES = null;
                public static final net.bytebuddy.implementation.MethodCall.MethodInvoker.ForContextualInvocation.Factory INSTANCE = null;

                static {
                        net.bytebuddy.implementation.MethodCall$MethodInvoker$ForContextualInvocation$Factory r0 = new net.bytebuddy.implementation.MethodCall$MethodInvoker$ForContextualInvocation$Factory
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.implementation.MethodCall.MethodInvoker.ForContextualInvocation.Factory.INSTANCE = r0
                        net.bytebuddy.implementation.MethodCall$MethodInvoker$ForContextualInvocation$Factory[] r0 = new net.bytebuddy.implementation.MethodCall.MethodInvoker.ForContextualInvocation.Factory[]{r0}
                        net.bytebuddy.implementation.MethodCall.MethodInvoker.ForContextualInvocation.Factory.$VALUES = r0
                        return
                }

                Factory(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.implementation.MethodCall.MethodInvoker.ForContextualInvocation.Factory valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.implementation.MethodCall$MethodInvoker$ForContextualInvocation$Factory> r0 = net.bytebuddy.implementation.MethodCall.MethodInvoker.ForContextualInvocation.Factory.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.implementation.MethodCall$MethodInvoker$ForContextualInvocation$Factory r1 = (net.bytebuddy.implementation.MethodCall.MethodInvoker.ForContextualInvocation.Factory) r1
                        return r1
                }

                public static net.bytebuddy.implementation.MethodCall.MethodInvoker.ForContextualInvocation.Factory[] values() {
                        net.bytebuddy.implementation.MethodCall$MethodInvoker$ForContextualInvocation$Factory[] r0 = net.bytebuddy.implementation.MethodCall.MethodInvoker.ForContextualInvocation.Factory.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.implementation.MethodCall$MethodInvoker$ForContextualInvocation$Factory[] r0 = (net.bytebuddy.implementation.MethodCall.MethodInvoker.ForContextualInvocation.Factory[]) r0
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodCall.MethodInvoker.Factory
                public net.bytebuddy.implementation.MethodCall.MethodInvoker make(net.bytebuddy.description.type.TypeDescription r2) {
                        r1 = this;
                        net.bytebuddy.implementation.MethodCall$MethodInvoker$ForContextualInvocation r0 = new net.bytebuddy.implementation.MethodCall$MethodInvoker$ForContextualInvocation
                        r0.<init>(r2)
                        return r0
                }
            }

            public ForContextualInvocation(net.bytebuddy.description.type.TypeDescription r1) {
                    r0 = this;
                    r0.<init>()
                    r0.instrumentedType = r1
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
                    net.bytebuddy.description.type.TypeDescription r2 = r4.instrumentedType
                    net.bytebuddy.implementation.MethodCall$MethodInvoker$ForContextualInvocation r5 = (net.bytebuddy.implementation.MethodCall.MethodInvoker.ForContextualInvocation) r5
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

            @Override // net.bytebuddy.implementation.MethodCall.MethodInvoker
            public net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation(net.bytebuddy.description.method.MethodDescription r3, net.bytebuddy.implementation.Implementation.Target r4) {
                    r2 = this;
                    boolean r4 = r3.isVirtual()
                    if (r4 == 0) goto L30
                    net.bytebuddy.description.type.TypeDescription r4 = r2.instrumentedType
                    boolean r4 = r3.isInvokableOn(r4)
                    if (r4 == 0) goto Lf
                    goto L30
                Lf:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "Cannot invoke "
                    r0.append(r1)
                    r0.append(r3)
                    java.lang.String r3 = " on "
                    r0.append(r3)
                    net.bytebuddy.description.type.TypeDescription r3 = r2.instrumentedType
                    r0.append(r3)
                    java.lang.String r3 = r0.toString()
                    r4.<init>(r3)
                    throw r4
                L30:
                    boolean r4 = r3.isVirtual()
                    if (r4 == 0) goto L41
                    net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r3 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r3)
                    net.bytebuddy.description.type.TypeDescription r4 = r2.instrumentedType
                    net.bytebuddy.implementation.bytecode.StackManipulation r3 = r3.virtual(r4)
                    goto L45
                L41:
                    net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r3 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r3)
                L45:
                    return r3
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForDefaultMethodInvocation implements net.bytebuddy.implementation.MethodCall.MethodInvoker {
            private final net.bytebuddy.description.type.TypeDescription instrumentedType;

            public enum Factory extends java.lang.Enum<net.bytebuddy.implementation.MethodCall.MethodInvoker.ForDefaultMethodInvocation.Factory> implements net.bytebuddy.implementation.MethodCall.MethodInvoker.Factory {
                private static final /* synthetic */ net.bytebuddy.implementation.MethodCall.MethodInvoker.ForDefaultMethodInvocation.Factory[] $VALUES = null;
                public static final net.bytebuddy.implementation.MethodCall.MethodInvoker.ForDefaultMethodInvocation.Factory INSTANCE = null;

                static {
                        net.bytebuddy.implementation.MethodCall$MethodInvoker$ForDefaultMethodInvocation$Factory r0 = new net.bytebuddy.implementation.MethodCall$MethodInvoker$ForDefaultMethodInvocation$Factory
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.implementation.MethodCall.MethodInvoker.ForDefaultMethodInvocation.Factory.INSTANCE = r0
                        net.bytebuddy.implementation.MethodCall$MethodInvoker$ForDefaultMethodInvocation$Factory[] r0 = new net.bytebuddy.implementation.MethodCall.MethodInvoker.ForDefaultMethodInvocation.Factory[]{r0}
                        net.bytebuddy.implementation.MethodCall.MethodInvoker.ForDefaultMethodInvocation.Factory.$VALUES = r0
                        return
                }

                Factory(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.implementation.MethodCall.MethodInvoker.ForDefaultMethodInvocation.Factory valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.implementation.MethodCall$MethodInvoker$ForDefaultMethodInvocation$Factory> r0 = net.bytebuddy.implementation.MethodCall.MethodInvoker.ForDefaultMethodInvocation.Factory.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.implementation.MethodCall$MethodInvoker$ForDefaultMethodInvocation$Factory r1 = (net.bytebuddy.implementation.MethodCall.MethodInvoker.ForDefaultMethodInvocation.Factory) r1
                        return r1
                }

                public static net.bytebuddy.implementation.MethodCall.MethodInvoker.ForDefaultMethodInvocation.Factory[] values() {
                        net.bytebuddy.implementation.MethodCall$MethodInvoker$ForDefaultMethodInvocation$Factory[] r0 = net.bytebuddy.implementation.MethodCall.MethodInvoker.ForDefaultMethodInvocation.Factory.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.implementation.MethodCall$MethodInvoker$ForDefaultMethodInvocation$Factory[] r0 = (net.bytebuddy.implementation.MethodCall.MethodInvoker.ForDefaultMethodInvocation.Factory[]) r0
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodCall.MethodInvoker.Factory
                public net.bytebuddy.implementation.MethodCall.MethodInvoker make(net.bytebuddy.description.type.TypeDescription r2) {
                        r1 = this;
                        net.bytebuddy.implementation.MethodCall$MethodInvoker$ForDefaultMethodInvocation r0 = new net.bytebuddy.implementation.MethodCall$MethodInvoker$ForDefaultMethodInvocation
                        r0.<init>(r2)
                        return r0
                }
            }

            public ForDefaultMethodInvocation(net.bytebuddy.description.type.TypeDescription r1) {
                    r0 = this;
                    r0.<init>()
                    r0.instrumentedType = r1
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
                    net.bytebuddy.description.type.TypeDescription r2 = r4.instrumentedType
                    net.bytebuddy.implementation.MethodCall$MethodInvoker$ForDefaultMethodInvocation r5 = (net.bytebuddy.implementation.MethodCall.MethodInvoker.ForDefaultMethodInvocation) r5
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

            @Override // net.bytebuddy.implementation.MethodCall.MethodInvoker
            public net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation(net.bytebuddy.description.method.MethodDescription r4, net.bytebuddy.implementation.Implementation.Target r5) {
                    r3 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r3.instrumentedType
                    boolean r0 = r4.isInvokableOn(r0)
                    java.lang.String r1 = "Cannot invoke "
                    if (r0 == 0) goto L48
                    net.bytebuddy.description.method.MethodDescription$SignatureToken r0 = r4.asSignatureToken()
                    net.bytebuddy.description.type.TypeDefinition r2 = r4.getDeclaringType()
                    net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
                    net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r5 = r5.invokeDefault(r0, r2)
                    net.bytebuddy.description.method.MethodDescription$TypeToken r0 = r4.asTypeToken()
                    net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r5 = r5.withCheckedCompatibilityTo(r0)
                    boolean r0 = r5.isValid()
                    if (r0 == 0) goto L29
                    return r5
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r1)
                    r0.append(r4)
                    java.lang.String r4 = " on "
                    r0.append(r4)
                    net.bytebuddy.description.type.TypeDescription r4 = r3.instrumentedType
                    r0.append(r4)
                    java.lang.String r4 = r0.toString()
                    r5.<init>(r4)
                    throw r5
                L48:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r1)
                    r0.append(r4)
                    java.lang.String r4 = " as default method of "
                    r0.append(r4)
                    net.bytebuddy.description.type.TypeDescription r4 = r3.instrumentedType
                    r0.append(r4)
                    java.lang.String r4 = r0.toString()
                    r5.<init>(r4)
                    throw r5
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForSuperMethodInvocation implements net.bytebuddy.implementation.MethodCall.MethodInvoker {
            private final net.bytebuddy.description.type.TypeDescription instrumentedType;

            public enum Factory extends java.lang.Enum<net.bytebuddy.implementation.MethodCall.MethodInvoker.ForSuperMethodInvocation.Factory> implements net.bytebuddy.implementation.MethodCall.MethodInvoker.Factory {
                private static final /* synthetic */ net.bytebuddy.implementation.MethodCall.MethodInvoker.ForSuperMethodInvocation.Factory[] $VALUES = null;
                public static final net.bytebuddy.implementation.MethodCall.MethodInvoker.ForSuperMethodInvocation.Factory INSTANCE = null;

                static {
                        net.bytebuddy.implementation.MethodCall$MethodInvoker$ForSuperMethodInvocation$Factory r0 = new net.bytebuddy.implementation.MethodCall$MethodInvoker$ForSuperMethodInvocation$Factory
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.implementation.MethodCall.MethodInvoker.ForSuperMethodInvocation.Factory.INSTANCE = r0
                        net.bytebuddy.implementation.MethodCall$MethodInvoker$ForSuperMethodInvocation$Factory[] r0 = new net.bytebuddy.implementation.MethodCall.MethodInvoker.ForSuperMethodInvocation.Factory[]{r0}
                        net.bytebuddy.implementation.MethodCall.MethodInvoker.ForSuperMethodInvocation.Factory.$VALUES = r0
                        return
                }

                Factory(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.implementation.MethodCall.MethodInvoker.ForSuperMethodInvocation.Factory valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.implementation.MethodCall$MethodInvoker$ForSuperMethodInvocation$Factory> r0 = net.bytebuddy.implementation.MethodCall.MethodInvoker.ForSuperMethodInvocation.Factory.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.implementation.MethodCall$MethodInvoker$ForSuperMethodInvocation$Factory r1 = (net.bytebuddy.implementation.MethodCall.MethodInvoker.ForSuperMethodInvocation.Factory) r1
                        return r1
                }

                public static net.bytebuddy.implementation.MethodCall.MethodInvoker.ForSuperMethodInvocation.Factory[] values() {
                        net.bytebuddy.implementation.MethodCall$MethodInvoker$ForSuperMethodInvocation$Factory[] r0 = net.bytebuddy.implementation.MethodCall.MethodInvoker.ForSuperMethodInvocation.Factory.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.implementation.MethodCall$MethodInvoker$ForSuperMethodInvocation$Factory[] r0 = (net.bytebuddy.implementation.MethodCall.MethodInvoker.ForSuperMethodInvocation.Factory[]) r0
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodCall.MethodInvoker.Factory
                public net.bytebuddy.implementation.MethodCall.MethodInvoker make(net.bytebuddy.description.type.TypeDescription r4) {
                        r3 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r4.getSuperClass()
                        if (r0 == 0) goto Lc
                        net.bytebuddy.implementation.MethodCall$MethodInvoker$ForSuperMethodInvocation r0 = new net.bytebuddy.implementation.MethodCall$MethodInvoker$ForSuperMethodInvocation
                        r0.<init>(r4)
                        return r0
                    Lc:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "Cannot invoke super method for "
                        r1.append(r2)
                        r1.append(r4)
                        java.lang.String r4 = r1.toString()
                        r0.<init>(r4)
                        throw r0
                }
            }

            public ForSuperMethodInvocation(net.bytebuddy.description.type.TypeDescription r1) {
                    r0 = this;
                    r0.<init>()
                    r0.instrumentedType = r1
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
                    net.bytebuddy.description.type.TypeDescription r2 = r4.instrumentedType
                    net.bytebuddy.implementation.MethodCall$MethodInvoker$ForSuperMethodInvocation r5 = (net.bytebuddy.implementation.MethodCall.MethodInvoker.ForSuperMethodInvocation) r5
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

            @Override // net.bytebuddy.implementation.MethodCall.MethodInvoker
            public net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation(net.bytebuddy.description.method.MethodDescription r3, net.bytebuddy.implementation.Implementation.Target r4) {
                    r2 = this;
                    net.bytebuddy.description.type.TypeDefinition r0 = r4.getOriginType()
                    net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                    boolean r0 = r3.isInvokableOn(r0)
                    java.lang.String r1 = "Cannot invoke "
                    if (r0 == 0) goto L41
                    net.bytebuddy.description.method.MethodDescription$SignatureToken r0 = r3.asSignatureToken()
                    net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r4 = r4.invokeDominant(r0)
                    net.bytebuddy.description.method.MethodDescription$TypeToken r0 = r3.asTypeToken()
                    net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r4 = r4.withCheckedCompatibilityTo(r0)
                    boolean r0 = r4.isValid()
                    if (r0 == 0) goto L27
                    return r4
                L27:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r1)
                    r0.append(r3)
                    java.lang.String r3 = " as a super method"
                    r0.append(r3)
                    java.lang.String r3 = r0.toString()
                    r4.<init>(r3)
                    throw r4
                L41:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r1)
                    r0.append(r3)
                    java.lang.String r3 = " as super method of "
                    r0.append(r3)
                    net.bytebuddy.description.type.TypeDescription r3 = r2.instrumentedType
                    r0.append(r3)
                    java.lang.String r3 = r0.toString()
                    r4.<init>(r3)
                    throw r4
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForVirtualInvocation implements net.bytebuddy.implementation.MethodCall.MethodInvoker {
            private final net.bytebuddy.description.type.TypeDescription typeDescription;

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Factory implements net.bytebuddy.implementation.MethodCall.MethodInvoker.Factory {
                private final net.bytebuddy.description.type.TypeDescription typeDescription;

                public Factory(net.bytebuddy.description.type.TypeDescription r1) {
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
                        net.bytebuddy.implementation.MethodCall$MethodInvoker$ForVirtualInvocation$Factory r5 = (net.bytebuddy.implementation.MethodCall.MethodInvoker.ForVirtualInvocation.Factory) r5
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

                @Override // net.bytebuddy.implementation.MethodCall.MethodInvoker.Factory
                public net.bytebuddy.implementation.MethodCall.MethodInvoker make(net.bytebuddy.description.type.TypeDescription r4) {
                        r3 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r3.typeDescription
                        net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                        boolean r0 = r0.isAccessibleTo(r4)
                        if (r0 == 0) goto L14
                        net.bytebuddy.implementation.MethodCall$MethodInvoker$ForVirtualInvocation r4 = new net.bytebuddy.implementation.MethodCall$MethodInvoker$ForVirtualInvocation
                        net.bytebuddy.description.type.TypeDescription r0 = r3.typeDescription
                        r4.<init>(r0)
                        return r4
                    L14:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        net.bytebuddy.description.type.TypeDescription r2 = r3.typeDescription
                        r1.append(r2)
                        java.lang.String r2 = " is not accessible to "
                        r1.append(r2)
                        r1.append(r4)
                        java.lang.String r4 = r1.toString()
                        r0.<init>(r4)
                        throw r0
                }
            }

            public enum WithImplicitType extends java.lang.Enum<net.bytebuddy.implementation.MethodCall.MethodInvoker.ForVirtualInvocation.WithImplicitType> implements net.bytebuddy.implementation.MethodCall.MethodInvoker, net.bytebuddy.implementation.MethodCall.MethodInvoker.Factory {
                private static final /* synthetic */ net.bytebuddy.implementation.MethodCall.MethodInvoker.ForVirtualInvocation.WithImplicitType[] $VALUES = null;
                public static final net.bytebuddy.implementation.MethodCall.MethodInvoker.ForVirtualInvocation.WithImplicitType INSTANCE = null;

                static {
                        net.bytebuddy.implementation.MethodCall$MethodInvoker$ForVirtualInvocation$WithImplicitType r0 = new net.bytebuddy.implementation.MethodCall$MethodInvoker$ForVirtualInvocation$WithImplicitType
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.implementation.MethodCall.MethodInvoker.ForVirtualInvocation.WithImplicitType.INSTANCE = r0
                        net.bytebuddy.implementation.MethodCall$MethodInvoker$ForVirtualInvocation$WithImplicitType[] r0 = new net.bytebuddy.implementation.MethodCall.MethodInvoker.ForVirtualInvocation.WithImplicitType[]{r0}
                        net.bytebuddy.implementation.MethodCall.MethodInvoker.ForVirtualInvocation.WithImplicitType.$VALUES = r0
                        return
                }

                WithImplicitType(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.implementation.MethodCall.MethodInvoker.ForVirtualInvocation.WithImplicitType valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.implementation.MethodCall$MethodInvoker$ForVirtualInvocation$WithImplicitType> r0 = net.bytebuddy.implementation.MethodCall.MethodInvoker.ForVirtualInvocation.WithImplicitType.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.implementation.MethodCall$MethodInvoker$ForVirtualInvocation$WithImplicitType r1 = (net.bytebuddy.implementation.MethodCall.MethodInvoker.ForVirtualInvocation.WithImplicitType) r1
                        return r1
                }

                public static net.bytebuddy.implementation.MethodCall.MethodInvoker.ForVirtualInvocation.WithImplicitType[] values() {
                        net.bytebuddy.implementation.MethodCall$MethodInvoker$ForVirtualInvocation$WithImplicitType[] r0 = net.bytebuddy.implementation.MethodCall.MethodInvoker.ForVirtualInvocation.WithImplicitType.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.implementation.MethodCall$MethodInvoker$ForVirtualInvocation$WithImplicitType[] r0 = (net.bytebuddy.implementation.MethodCall.MethodInvoker.ForVirtualInvocation.WithImplicitType[]) r0
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodCall.MethodInvoker.Factory
                public net.bytebuddy.implementation.MethodCall.MethodInvoker make(net.bytebuddy.description.type.TypeDescription r1) {
                        r0 = this;
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodCall.MethodInvoker
                public net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation(net.bytebuddy.description.method.MethodDescription r3, net.bytebuddy.implementation.Implementation.Target r4) {
                        r2 = this;
                        net.bytebuddy.description.type.TypeDescription r4 = r4.getInstrumentedType()
                        boolean r4 = r3.isAccessibleTo(r4)
                        if (r4 == 0) goto L15
                        boolean r4 = r3.isVirtual()
                        if (r4 == 0) goto L15
                        net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r3 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r3)
                        return r3
                    L15:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        java.lang.String r1 = "Cannot invoke "
                        r0.append(r1)
                        r0.append(r3)
                        java.lang.String r3 = " virtually"
                        r0.append(r3)
                        java.lang.String r3 = r0.toString()
                        r4.<init>(r3)
                        throw r4
                }
            }

            public ForVirtualInvocation(net.bytebuddy.description.type.TypeDescription r1) {
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
                    net.bytebuddy.implementation.MethodCall$MethodInvoker$ForVirtualInvocation r5 = (net.bytebuddy.implementation.MethodCall.MethodInvoker.ForVirtualInvocation) r5
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

            @Override // net.bytebuddy.implementation.MethodCall.MethodInvoker
            public net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation(net.bytebuddy.description.method.MethodDescription r3, net.bytebuddy.implementation.Implementation.Target r4) {
                    r2 = this;
                    net.bytebuddy.description.type.TypeDescription r4 = r2.typeDescription
                    boolean r4 = r3.isInvokableOn(r4)
                    if (r4 == 0) goto L13
                    net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r3 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r3)
                    net.bytebuddy.description.type.TypeDescription r4 = r2.typeDescription
                    net.bytebuddy.implementation.bytecode.StackManipulation r3 = r3.virtual(r4)
                    return r3
                L13:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "Cannot invoke "
                    r0.append(r1)
                    r0.append(r3)
                    java.lang.String r3 = " on "
                    r0.append(r3)
                    net.bytebuddy.description.type.TypeDescription r3 = r2.typeDescription
                    r0.append(r3)
                    java.lang.String r3 = r0.toString()
                    r4.<init>(r3)
                    throw r4
            }
        }

        net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation(net.bytebuddy.description.method.MethodDescription r1, net.bytebuddy.implementation.Implementation.Target r2);
    }

    public interface MethodLocator {

        public interface Factory {
            net.bytebuddy.implementation.MethodCall.MethodLocator make(net.bytebuddy.description.type.TypeDescription r1);
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForElementMatcher implements net.bytebuddy.implementation.MethodCall.MethodLocator {
            private final net.bytebuddy.description.type.TypeDescription instrumentedType;
            private final net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> matcher;
            private final net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler methodGraphCompiler;

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Factory implements net.bytebuddy.implementation.MethodCall.MethodLocator.Factory {
                private final net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> matcher;
                private final net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler methodGraphCompiler;

                public Factory(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r2) {
                        r0 = this;
                        r0.<init>()
                        r0.matcher = r1
                        r0.methodGraphCompiler = r2
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
                        net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2 = r4.matcher
                        net.bytebuddy.implementation.MethodCall$MethodLocator$ForElementMatcher$Factory r5 = (net.bytebuddy.implementation.MethodCall.MethodLocator.ForElementMatcher.Factory) r5
                        net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r3 = r5.matcher
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r2 = r4.methodGraphCompiler
                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r5 = r5.methodGraphCompiler
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
                        net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1 = r2.matcher
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r1 = r2.methodGraphCompiler
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodCall.MethodLocator.Factory
                public net.bytebuddy.implementation.MethodCall.MethodLocator make(net.bytebuddy.description.type.TypeDescription r4) {
                        r3 = this;
                        net.bytebuddy.implementation.MethodCall$MethodLocator$ForElementMatcher r0 = new net.bytebuddy.implementation.MethodCall$MethodLocator$ForElementMatcher
                        net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1 = r3.matcher
                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r2 = r3.methodGraphCompiler
                        r0.<init>(r4, r1, r2)
                        return r0
                }
            }

            public ForElementMatcher(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r3) {
                    r0 = this;
                    r0.<init>()
                    r0.instrumentedType = r1
                    r0.matcher = r2
                    r0.methodGraphCompiler = r3
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
                    net.bytebuddy.description.type.TypeDescription r2 = r4.instrumentedType
                    net.bytebuddy.implementation.MethodCall$MethodLocator$ForElementMatcher r5 = (net.bytebuddy.implementation.MethodCall.MethodLocator.ForElementMatcher) r5
                    net.bytebuddy.description.type.TypeDescription r3 = r5.instrumentedType
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2 = r4.matcher
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r3 = r5.matcher
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L2b
                    return r1
                L2b:
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r2 = r4.methodGraphCompiler
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r5 = r5.methodGraphCompiler
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
                    net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1 = r2.matcher
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r1 = r2.methodGraphCompiler
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.MethodCall.MethodLocator
            public net.bytebuddy.description.method.MethodDescription resolve(net.bytebuddy.description.type.TypeDescription r4, net.bytebuddy.description.method.MethodDescription r5) {
                    r3 = this;
                    net.bytebuddy.description.type.TypeDescription r5 = r3.instrumentedType
                    net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.getSuperClass()
                    if (r5 != 0) goto Ld
                    java.util.List r5 = java.util.Collections.emptyList()
                    goto L1f
                Ld:
                    net.bytebuddy.description.method.MethodList r5 = r5.getDeclaredMethods()
                    net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isConstructor()
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1 = r3.matcher
                    net.bytebuddy.matcher.ElementMatcher$Junction r0 = r0.and(r1)
                    net.bytebuddy.matcher.FilterableList r5 = r5.filter(r0)
                L1f:
                    net.bytebuddy.description.type.TypeDescription r0 = r3.instrumentedType
                    net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                    net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.isVirtual()
                    net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.not(r1)
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2 = r3.matcher
                    net.bytebuddy.matcher.ElementMatcher$Junction r1 = r1.and(r2)
                    net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r1 = r3.methodGraphCompiler
                    net.bytebuddy.description.type.TypeDescription r2 = r3.instrumentedType
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Linked r4 = r1.compile(r4, r2)
                    net.bytebuddy.dynamic.scaffold.MethodGraph$NodeList r4 = r4.listNodes()
                    net.bytebuddy.description.method.MethodList r4 = r4.asMethodList()
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1 = r3.matcher
                    net.bytebuddy.matcher.FilterableList r4 = r4.filter(r1)
                    java.util.List r4 = net.bytebuddy.utility.CompoundList.of(r5, r0, r4)
                    int r5 = r4.size()
                    r0 = 1
                    if (r5 != r0) goto L60
                    r5 = 0
                    java.lang.Object r4 = r4.get(r5)
                    net.bytebuddy.description.method.MethodDescription r4 = (net.bytebuddy.description.method.MethodDescription) r4
                    return r4
                L60:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    net.bytebuddy.description.type.TypeDescription r1 = r3.instrumentedType
                    r0.append(r1)
                    java.lang.String r1 = " does not define exactly one virtual method or constructor for "
                    r0.append(r1)
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1 = r3.matcher
                    r0.append(r1)
                    java.lang.String r1 = " but contained "
                    r0.append(r1)
                    int r1 = r4.size()
                    r0.append(r1)
                    java.lang.String r1 = " candidates: "
                    r0.append(r1)
                    r0.append(r4)
                    java.lang.String r4 = r0.toString()
                    r5.<init>(r4)
                    throw r5
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForExplicitMethod implements net.bytebuddy.implementation.MethodCall.MethodLocator, net.bytebuddy.implementation.MethodCall.MethodLocator.Factory {
            private final net.bytebuddy.description.method.MethodDescription methodDescription;

            public ForExplicitMethod(net.bytebuddy.description.method.MethodDescription r1) {
                    r0 = this;
                    r0.<init>()
                    r0.methodDescription = r1
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
                    net.bytebuddy.implementation.MethodCall$MethodLocator$ForExplicitMethod r5 = (net.bytebuddy.implementation.MethodCall.MethodLocator.ForExplicitMethod) r5
                    net.bytebuddy.description.method.MethodDescription r5 = r5.methodDescription
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
                    net.bytebuddy.description.method.MethodDescription r1 = r2.methodDescription
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.MethodCall.MethodLocator.Factory
            public net.bytebuddy.implementation.MethodCall.MethodLocator make(net.bytebuddy.description.type.TypeDescription r1) {
                    r0 = this;
                    return r0
            }

            @Override // net.bytebuddy.implementation.MethodCall.MethodLocator
            public net.bytebuddy.description.method.MethodDescription resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2) {
                    r0 = this;
                    net.bytebuddy.description.method.MethodDescription r1 = r0.methodDescription
                    return r1
            }
        }

        public enum ForInstrumentedMethod extends java.lang.Enum<net.bytebuddy.implementation.MethodCall.MethodLocator.ForInstrumentedMethod> implements net.bytebuddy.implementation.MethodCall.MethodLocator, net.bytebuddy.implementation.MethodCall.MethodLocator.Factory {
            private static final /* synthetic */ net.bytebuddy.implementation.MethodCall.MethodLocator.ForInstrumentedMethod[] $VALUES = null;
            public static final net.bytebuddy.implementation.MethodCall.MethodLocator.ForInstrumentedMethod INSTANCE = null;

            static {
                    net.bytebuddy.implementation.MethodCall$MethodLocator$ForInstrumentedMethod r0 = new net.bytebuddy.implementation.MethodCall$MethodLocator$ForInstrumentedMethod
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.implementation.MethodCall.MethodLocator.ForInstrumentedMethod.INSTANCE = r0
                    net.bytebuddy.implementation.MethodCall$MethodLocator$ForInstrumentedMethod[] r0 = new net.bytebuddy.implementation.MethodCall.MethodLocator.ForInstrumentedMethod[]{r0}
                    net.bytebuddy.implementation.MethodCall.MethodLocator.ForInstrumentedMethod.$VALUES = r0
                    return
            }

            ForInstrumentedMethod(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.implementation.MethodCall.MethodLocator.ForInstrumentedMethod valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.implementation.MethodCall$MethodLocator$ForInstrumentedMethod> r0 = net.bytebuddy.implementation.MethodCall.MethodLocator.ForInstrumentedMethod.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.implementation.MethodCall$MethodLocator$ForInstrumentedMethod r1 = (net.bytebuddy.implementation.MethodCall.MethodLocator.ForInstrumentedMethod) r1
                    return r1
            }

            public static net.bytebuddy.implementation.MethodCall.MethodLocator.ForInstrumentedMethod[] values() {
                    net.bytebuddy.implementation.MethodCall$MethodLocator$ForInstrumentedMethod[] r0 = net.bytebuddy.implementation.MethodCall.MethodLocator.ForInstrumentedMethod.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.implementation.MethodCall$MethodLocator$ForInstrumentedMethod[] r0 = (net.bytebuddy.implementation.MethodCall.MethodLocator.ForInstrumentedMethod[]) r0
                    return r0
            }

            @Override // net.bytebuddy.implementation.MethodCall.MethodLocator.Factory
            public net.bytebuddy.implementation.MethodCall.MethodLocator make(net.bytebuddy.description.type.TypeDescription r1) {
                    r0 = this;
                    return r0
            }

            @Override // net.bytebuddy.implementation.MethodCall.MethodLocator
            public net.bytebuddy.description.method.MethodDescription resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2) {
                    r0 = this;
                    return r2
            }
        }

        net.bytebuddy.description.method.MethodDescription resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2);
    }

    public interface TargetHandler {

        public interface Factory extends net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable {
            net.bytebuddy.implementation.MethodCall.TargetHandler make(net.bytebuddy.implementation.Implementation.Target r1);
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForConstructingInvocation implements net.bytebuddy.implementation.MethodCall.TargetHandler, net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved {
            private final net.bytebuddy.description.type.TypeDescription instrumentedType;

            public enum Factory extends java.lang.Enum<net.bytebuddy.implementation.MethodCall.TargetHandler.ForConstructingInvocation.Factory> implements net.bytebuddy.implementation.MethodCall.TargetHandler.Factory {
                private static final /* synthetic */ net.bytebuddy.implementation.MethodCall.TargetHandler.ForConstructingInvocation.Factory[] $VALUES = null;
                public static final net.bytebuddy.implementation.MethodCall.TargetHandler.ForConstructingInvocation.Factory INSTANCE = null;

                static {
                        net.bytebuddy.implementation.MethodCall$TargetHandler$ForConstructingInvocation$Factory r0 = new net.bytebuddy.implementation.MethodCall$TargetHandler$ForConstructingInvocation$Factory
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.implementation.MethodCall.TargetHandler.ForConstructingInvocation.Factory.INSTANCE = r0
                        net.bytebuddy.implementation.MethodCall$TargetHandler$ForConstructingInvocation$Factory[] r0 = new net.bytebuddy.implementation.MethodCall.TargetHandler.ForConstructingInvocation.Factory[]{r0}
                        net.bytebuddy.implementation.MethodCall.TargetHandler.ForConstructingInvocation.Factory.$VALUES = r0
                        return
                }

                Factory(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.implementation.MethodCall.TargetHandler.ForConstructingInvocation.Factory valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.implementation.MethodCall$TargetHandler$ForConstructingInvocation$Factory> r0 = net.bytebuddy.implementation.MethodCall.TargetHandler.ForConstructingInvocation.Factory.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.implementation.MethodCall$TargetHandler$ForConstructingInvocation$Factory r1 = (net.bytebuddy.implementation.MethodCall.TargetHandler.ForConstructingInvocation.Factory) r1
                        return r1
                }

                public static net.bytebuddy.implementation.MethodCall.TargetHandler.ForConstructingInvocation.Factory[] values() {
                        net.bytebuddy.implementation.MethodCall$TargetHandler$ForConstructingInvocation$Factory[] r0 = net.bytebuddy.implementation.MethodCall.TargetHandler.ForConstructingInvocation.Factory.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.implementation.MethodCall$TargetHandler$ForConstructingInvocation$Factory[] r0 = (net.bytebuddy.implementation.MethodCall.TargetHandler.ForConstructingInvocation.Factory[]) r0
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Factory
                public net.bytebuddy.implementation.MethodCall.TargetHandler make(net.bytebuddy.implementation.Implementation.Target r2) {
                        r1 = this;
                        net.bytebuddy.implementation.MethodCall$TargetHandler$ForConstructingInvocation r0 = new net.bytebuddy.implementation.MethodCall$TargetHandler$ForConstructingInvocation
                        net.bytebuddy.description.type.TypeDescription r2 = r2.getInstrumentedType()
                        r0.<init>(r2)
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                        r0 = this;
                        return r1
                }
            }

            public ForConstructingInvocation(net.bytebuddy.description.type.TypeDescription r1) {
                    r0 = this;
                    r0.<init>()
                    r0.instrumentedType = r1
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
                    net.bytebuddy.description.type.TypeDescription r2 = r4.instrumentedType
                    net.bytebuddy.implementation.MethodCall$TargetHandler$ForConstructingInvocation r5 = (net.bytebuddy.implementation.MethodCall.TargetHandler.ForConstructingInvocation) r5
                    net.bytebuddy.description.type.TypeDescription r5 = r5.instrumentedType
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L20
                    return r1
                L20:
                    return r0
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved
            public net.bytebuddy.description.type.TypeDescription getTypeDescription() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r1.instrumentedType
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

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler
            public net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved resolve(net.bytebuddy.description.method.MethodDescription r1) {
                    r0 = this;
                    return r0
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved
            public net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation(net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.implementation.bytecode.assign.Assigner r3, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r4) {
                    r1 = this;
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r3 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    net.bytebuddy.description.type.TypeDefinition r2 = r2.getDeclaringType()
                    net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
                    net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.TypeCreation.of(r2)
                    r4 = 2
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r4 = new net.bytebuddy.implementation.bytecode.StackManipulation[r4]
                    r0 = 0
                    r4[r0] = r2
                    net.bytebuddy.implementation.bytecode.Duplication r2 = net.bytebuddy.implementation.bytecode.Duplication.SINGLE
                    r0 = 1
                    r4[r0] = r2
                    r3.<init>(r4)
                    return r3
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForField implements net.bytebuddy.implementation.MethodCall.TargetHandler, net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved {
            private final net.bytebuddy.description.field.FieldDescription fieldDescription;

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Factory implements net.bytebuddy.implementation.MethodCall.TargetHandler.Factory {
                private final net.bytebuddy.implementation.MethodCall.TargetHandler.ForField.Location location;

                public Factory(net.bytebuddy.implementation.MethodCall.TargetHandler.ForField.Location r1) {
                        r0 = this;
                        r0.<init>()
                        r0.location = r1
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
                        net.bytebuddy.implementation.MethodCall$TargetHandler$ForField$Location r2 = r4.location
                        net.bytebuddy.implementation.MethodCall$TargetHandler$ForField$Factory r5 = (net.bytebuddy.implementation.MethodCall.TargetHandler.ForField.Factory) r5
                        net.bytebuddy.implementation.MethodCall$TargetHandler$ForField$Location r5 = r5.location
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
                        net.bytebuddy.implementation.MethodCall$TargetHandler$ForField$Location r1 = r2.location
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Factory
                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming declaring type for type member.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                public net.bytebuddy.implementation.MethodCall.TargetHandler make(net.bytebuddy.implementation.Implementation.Target r5) {
                        r4 = this;
                        net.bytebuddy.implementation.MethodCall$TargetHandler$ForField$Location r0 = r4.location
                        net.bytebuddy.description.type.TypeDescription r1 = r5.getInstrumentedType()
                        net.bytebuddy.description.field.FieldDescription r0 = r0.resolve(r1)
                        boolean r1 = r0.isStatic()
                        if (r1 != 0) goto L46
                        net.bytebuddy.description.type.TypeDescription r1 = r5.getInstrumentedType()
                        net.bytebuddy.description.type.TypeDefinition r2 = r0.getDeclaringType()
                        net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
                        boolean r1 = r1.isAssignableTo(r2)
                        if (r1 == 0) goto L23
                        goto L46
                    L23:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        r2.<init>()
                        java.lang.String r3 = "Cannot access "
                        r2.append(r3)
                        r2.append(r0)
                        java.lang.String r0 = " from "
                        r2.append(r0)
                        net.bytebuddy.description.type.TypeDescription r5 = r5.getInstrumentedType()
                        r2.append(r5)
                        java.lang.String r5 = r2.toString()
                        r1.<init>(r5)
                        throw r1
                    L46:
                        net.bytebuddy.implementation.MethodCall$TargetHandler$ForField r5 = new net.bytebuddy.implementation.MethodCall$TargetHandler$ForField
                        r5.<init>(r0)
                        return r5
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                        r0 = this;
                        return r1
                }
            }

            public interface Location {

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class ForExplicitField implements net.bytebuddy.implementation.MethodCall.TargetHandler.ForField.Location {
                    private final net.bytebuddy.description.field.FieldDescription fieldDescription;

                    public ForExplicitField(net.bytebuddy.description.field.FieldDescription r1) {
                            r0 = this;
                            r0.<init>()
                            r0.fieldDescription = r1
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
                            net.bytebuddy.implementation.MethodCall$TargetHandler$ForField$Location$ForExplicitField r5 = (net.bytebuddy.implementation.MethodCall.TargetHandler.ForField.Location.ForExplicitField) r5
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

                    @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.ForField.Location
                    public net.bytebuddy.description.field.FieldDescription resolve(net.bytebuddy.description.type.TypeDescription r1) {
                            r0 = this;
                            net.bytebuddy.description.field.FieldDescription r1 = r0.fieldDescription
                            return r1
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class ForImplicitField implements net.bytebuddy.implementation.MethodCall.TargetHandler.ForField.Location {
                    private final net.bytebuddy.dynamic.scaffold.FieldLocator.Factory fieldLocatorFactory;
                    private final java.lang.String name;

                    public ForImplicitField(java.lang.String r1, net.bytebuddy.dynamic.scaffold.FieldLocator.Factory r2) {
                            r0 = this;
                            r0.<init>()
                            r0.name = r1
                            r0.fieldLocatorFactory = r2
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
                            java.lang.String r2 = r4.name
                            net.bytebuddy.implementation.MethodCall$TargetHandler$ForField$Location$ForImplicitField r5 = (net.bytebuddy.implementation.MethodCall.TargetHandler.ForField.Location.ForImplicitField) r5
                            java.lang.String r3 = r5.name
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L20
                            return r1
                        L20:
                            net.bytebuddy.dynamic.scaffold.FieldLocator$Factory r2 = r4.fieldLocatorFactory
                            net.bytebuddy.dynamic.scaffold.FieldLocator$Factory r5 = r5.fieldLocatorFactory
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
                            java.lang.String r1 = r2.name
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.dynamic.scaffold.FieldLocator$Factory r1 = r2.fieldLocatorFactory
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.ForField.Location
                    public net.bytebuddy.description.field.FieldDescription resolve(net.bytebuddy.description.type.TypeDescription r4) {
                            r3 = this;
                            net.bytebuddy.dynamic.scaffold.FieldLocator$Factory r0 = r3.fieldLocatorFactory
                            net.bytebuddy.dynamic.scaffold.FieldLocator r0 = r0.make(r4)
                            java.lang.String r1 = r3.name
                            net.bytebuddy.dynamic.scaffold.FieldLocator$Resolution r0 = r0.locate(r1)
                            boolean r1 = r0.isResolved()
                            if (r1 == 0) goto L17
                            net.bytebuddy.description.field.FieldDescription r4 = r0.getField()
                            return r4
                        L17:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            r1.<init>()
                            java.lang.String r2 = "Could not locate field name "
                            r1.append(r2)
                            java.lang.String r2 = r3.name
                            r1.append(r2)
                            java.lang.String r2 = " on "
                            r1.append(r2)
                            r1.append(r4)
                            java.lang.String r4 = r1.toString()
                            r0.<init>(r4)
                            throw r0
                    }
                }

                net.bytebuddy.description.field.FieldDescription resolve(net.bytebuddy.description.type.TypeDescription r1);
            }

            public ForField(net.bytebuddy.description.field.FieldDescription r1) {
                    r0 = this;
                    r0.<init>()
                    r0.fieldDescription = r1
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
                    net.bytebuddy.implementation.MethodCall$TargetHandler$ForField r5 = (net.bytebuddy.implementation.MethodCall.TargetHandler.ForField) r5
                    net.bytebuddy.description.field.FieldDescription r5 = r5.fieldDescription
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L20
                    return r1
                L20:
                    return r0
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved
            public net.bytebuddy.description.type.TypeDescription getTypeDescription() {
                    r1 = this;
                    net.bytebuddy.description.field.FieldDescription r0 = r1.fieldDescription
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getType()
                    net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
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

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler
            public net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved resolve(net.bytebuddy.description.method.MethodDescription r1) {
                    r0 = this;
                    return r0
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved
            public net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation(net.bytebuddy.description.method.MethodDescription r5, net.bytebuddy.implementation.bytecode.assign.Assigner r6, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r7) {
                    r4 = this;
                    boolean r0 = r5.isMethod()
                    java.lang.String r1 = " on "
                    java.lang.String r2 = "Cannot invoke "
                    if (r0 == 0) goto L87
                    boolean r0 = r5.isVirtual()
                    if (r0 == 0) goto L87
                    net.bytebuddy.description.field.FieldDescription r0 = r4.fieldDescription
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getType()
                    net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                    boolean r0 = r5.isVisibleTo(r0)
                    if (r0 == 0) goto L87
                    net.bytebuddy.description.field.FieldDescription r0 = r4.fieldDescription
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getType()
                    net.bytebuddy.description.type.TypeDefinition r3 = r5.getDeclaringType()
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.asGenericType()
                    net.bytebuddy.implementation.bytecode.StackManipulation r6 = r6.assign(r0, r3, r7)
                    boolean r7 = r6.isValid()
                    if (r7 == 0) goto L6a
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r7 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    boolean r5 = r5.isStatic()
                    if (r5 != 0) goto L4e
                    net.bytebuddy.description.field.FieldDescription r5 = r4.fieldDescription
                    boolean r5 = r5.isStatic()
                    if (r5 == 0) goto L49
                    goto L4e
                L49:
                    net.bytebuddy.implementation.bytecode.StackManipulation r5 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                    goto L50
                L4e:
                    net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r5 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
                L50:
                    net.bytebuddy.description.field.FieldDescription r0 = r4.fieldDescription
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r0 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r0)
                    net.bytebuddy.implementation.bytecode.StackManipulation r0 = r0.read()
                    r1 = 3
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r1 = new net.bytebuddy.implementation.bytecode.StackManipulation[r1]
                    r2 = 0
                    r1[r2] = r5
                    r5 = 1
                    r1[r5] = r0
                    r5 = 2
                    r1[r5] = r6
                    r7.<init>(r1)
                    return r7
                L6a:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    r7.append(r2)
                    r7.append(r5)
                    r7.append(r1)
                    net.bytebuddy.description.field.FieldDescription r5 = r4.fieldDescription
                    r7.append(r5)
                    java.lang.String r5 = r7.toString()
                    r6.<init>(r5)
                    throw r6
                L87:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    r7.append(r2)
                    r7.append(r5)
                    r7.append(r1)
                    net.bytebuddy.description.field.FieldDescription r5 = r4.fieldDescription
                    r7.append(r5)
                    java.lang.String r5 = r7.toString()
                    r6.<init>(r5)
                    throw r6
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForMethodCall implements net.bytebuddy.implementation.MethodCall.TargetHandler {
            private final net.bytebuddy.implementation.MethodCall.Appender appender;

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Factory implements net.bytebuddy.implementation.MethodCall.TargetHandler.Factory {
                private final net.bytebuddy.implementation.MethodCall methodCall;

                public Factory(net.bytebuddy.implementation.MethodCall r1) {
                        r0 = this;
                        r0.<init>()
                        r0.methodCall = r1
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
                        net.bytebuddy.implementation.MethodCall r2 = r4.methodCall
                        net.bytebuddy.implementation.MethodCall$TargetHandler$ForMethodCall$Factory r5 = (net.bytebuddy.implementation.MethodCall.TargetHandler.ForMethodCall.Factory) r5
                        net.bytebuddy.implementation.MethodCall r5 = r5.methodCall
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
                        net.bytebuddy.implementation.MethodCall r1 = r2.methodCall
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Factory
                public net.bytebuddy.implementation.MethodCall.TargetHandler make(net.bytebuddy.implementation.Implementation.Target r5) {
                        r4 = this;
                        net.bytebuddy.implementation.MethodCall$TargetHandler$ForMethodCall r0 = new net.bytebuddy.implementation.MethodCall$TargetHandler$ForMethodCall
                        net.bytebuddy.implementation.MethodCall$Appender r1 = new net.bytebuddy.implementation.MethodCall$Appender
                        net.bytebuddy.implementation.MethodCall r2 = r4.methodCall
                        r2.getClass()
                        net.bytebuddy.implementation.MethodCall$TerminationHandler$Simple r3 = net.bytebuddy.implementation.MethodCall.TerminationHandler.Simple.IGNORING
                        r1.<init>(r2, r5, r3)
                        r0.<init>(r1)
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r2) {
                        r1 = this;
                        net.bytebuddy.implementation.MethodCall r0 = r1.methodCall
                        net.bytebuddy.dynamic.scaffold.InstrumentedType r2 = r0.prepare(r2)
                        return r2
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Resolved implements net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved {
                private final net.bytebuddy.implementation.MethodCall.Appender appender;
                private final net.bytebuddy.description.method.MethodDescription instrumentedMethod;
                private final net.bytebuddy.description.method.MethodDescription methodDescription;
                private final net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved targetHandler;

                public Resolved(net.bytebuddy.implementation.MethodCall.Appender r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.description.method.MethodDescription r3, net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved r4) {
                        r0 = this;
                        r0.<init>()
                        r0.appender = r1
                        r0.methodDescription = r2
                        r0.instrumentedMethod = r3
                        r0.targetHandler = r4
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
                        net.bytebuddy.implementation.MethodCall$Appender r2 = r4.appender
                        net.bytebuddy.implementation.MethodCall$TargetHandler$ForMethodCall$Resolved r5 = (net.bytebuddy.implementation.MethodCall.TargetHandler.ForMethodCall.Resolved) r5
                        net.bytebuddy.implementation.MethodCall$Appender r3 = r5.appender
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        net.bytebuddy.description.method.MethodDescription r2 = r4.methodDescription
                        net.bytebuddy.description.method.MethodDescription r3 = r5.methodDescription
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L2b
                        return r1
                    L2b:
                        net.bytebuddy.description.method.MethodDescription r2 = r4.instrumentedMethod
                        net.bytebuddy.description.method.MethodDescription r3 = r5.instrumentedMethod
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L36
                        return r1
                    L36:
                        net.bytebuddy.implementation.MethodCall$TargetHandler$Resolved r2 = r4.targetHandler
                        net.bytebuddy.implementation.MethodCall$TargetHandler$Resolved r5 = r5.targetHandler
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L41
                        return r1
                    L41:
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved
                public net.bytebuddy.description.type.TypeDescription getTypeDescription() {
                        r1 = this;
                        net.bytebuddy.description.method.MethodDescription r0 = r1.methodDescription
                        boolean r0 = r0.isConstructor()
                        if (r0 == 0) goto L13
                        net.bytebuddy.description.method.MethodDescription r0 = r1.methodDescription
                        net.bytebuddy.description.type.TypeDefinition r0 = r0.getDeclaringType()
                        net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                        goto L1d
                    L13:
                        net.bytebuddy.description.method.MethodDescription r0 = r1.methodDescription
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getReturnType()
                        net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                    L1d:
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        net.bytebuddy.implementation.MethodCall$Appender r1 = r2.appender
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.description.method.MethodDescription r1 = r2.methodDescription
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.description.method.MethodDescription r1 = r2.instrumentedMethod
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.implementation.MethodCall$TargetHandler$Resolved r1 = r2.targetHandler
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved
                public net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation(net.bytebuddy.description.method.MethodDescription r4, net.bytebuddy.implementation.bytecode.assign.Assigner r5, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r6) {
                        r3 = this;
                        net.bytebuddy.description.method.MethodDescription r0 = r3.methodDescription
                        boolean r0 = r0.isConstructor()
                        if (r0 == 0) goto L13
                        net.bytebuddy.description.method.MethodDescription r0 = r3.methodDescription
                        net.bytebuddy.description.type.TypeDefinition r0 = r0.getDeclaringType()
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.asGenericType()
                        goto L19
                    L13:
                        net.bytebuddy.description.method.MethodDescription r0 = r3.methodDescription
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getReturnType()
                    L19:
                        net.bytebuddy.description.type.TypeDefinition r1 = r4.getDeclaringType()
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r1.asGenericType()
                        net.bytebuddy.implementation.bytecode.StackManipulation r5 = r5.assign(r0, r1, r6)
                        boolean r6 = r5.isValid()
                        if (r6 != 0) goto L5f
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r6 = new java.lang.StringBuilder
                        r6.<init>()
                        java.lang.String r0 = "Cannot invoke "
                        r6.append(r0)
                        r6.append(r4)
                        java.lang.String r4 = " on "
                        r6.append(r4)
                        net.bytebuddy.description.method.MethodDescription r4 = r3.methodDescription
                        boolean r4 = r4.isConstructor()
                        if (r4 == 0) goto L4e
                        net.bytebuddy.description.method.MethodDescription r4 = r3.methodDescription
                        net.bytebuddy.description.type.TypeDefinition r4 = r4.getDeclaringType()
                        goto L54
                    L4e:
                        net.bytebuddy.description.method.MethodDescription r4 = r3.methodDescription
                        net.bytebuddy.description.type.TypeDescription$Generic r4 = r4.getReturnType()
                    L54:
                        r6.append(r4)
                        java.lang.String r4 = r6.toString()
                        r5.<init>(r4)
                        throw r5
                    L5f:
                        net.bytebuddy.implementation.bytecode.StackManipulation$Compound r4 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                        net.bytebuddy.implementation.MethodCall$Appender r6 = r3.appender
                        net.bytebuddy.description.method.MethodDescription r0 = r3.instrumentedMethod
                        net.bytebuddy.description.method.MethodDescription r1 = r3.methodDescription
                        net.bytebuddy.implementation.MethodCall$TargetHandler$Resolved r2 = r3.targetHandler
                        net.bytebuddy.implementation.bytecode.StackManipulation r6 = r6.toStackManipulation(r0, r1, r2)
                        r0 = 2
                        net.bytebuddy.implementation.bytecode.StackManipulation[] r0 = new net.bytebuddy.implementation.bytecode.StackManipulation[r0]
                        r1 = 0
                        r0[r1] = r6
                        r6 = 1
                        r0[r6] = r5
                        r4.<init>(r0)
                        return r4
                }
            }

            public ForMethodCall(net.bytebuddy.implementation.MethodCall.Appender r1) {
                    r0 = this;
                    r0.<init>()
                    r0.appender = r1
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
                    net.bytebuddy.implementation.MethodCall$Appender r2 = r4.appender
                    net.bytebuddy.implementation.MethodCall$TargetHandler$ForMethodCall r5 = (net.bytebuddy.implementation.MethodCall.TargetHandler.ForMethodCall) r5
                    net.bytebuddy.implementation.MethodCall$Appender r5 = r5.appender
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
                    net.bytebuddy.implementation.MethodCall$Appender r1 = r2.appender
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler
            public net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved resolve(net.bytebuddy.description.method.MethodDescription r5) {
                    r4 = this;
                    net.bytebuddy.implementation.MethodCall$Appender r0 = r4.appender
                    net.bytebuddy.implementation.MethodCall$TargetHandler r0 = net.bytebuddy.implementation.MethodCall.Appender.access$000(r0)
                    net.bytebuddy.implementation.MethodCall$TargetHandler$Resolved r0 = r0.resolve(r5)
                    net.bytebuddy.implementation.MethodCall$TargetHandler$ForMethodCall$Resolved r1 = new net.bytebuddy.implementation.MethodCall$TargetHandler$ForMethodCall$Resolved
                    net.bytebuddy.implementation.MethodCall$Appender r2 = r4.appender
                    net.bytebuddy.description.method.MethodDescription r3 = r2.toInvokedMethod(r5, r0)
                    r1.<init>(r2, r3, r5, r0)
                    return r1
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForMethodParameter implements net.bytebuddy.implementation.MethodCall.TargetHandler, net.bytebuddy.implementation.MethodCall.TargetHandler.Factory {
            private final int index;

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Resolved implements net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved {
                private final net.bytebuddy.description.method.ParameterDescription parameterDescription;

                public Resolved(net.bytebuddy.description.method.ParameterDescription r1) {
                        r0 = this;
                        r0.<init>()
                        r0.parameterDescription = r1
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
                        net.bytebuddy.description.method.ParameterDescription r2 = r4.parameterDescription
                        net.bytebuddy.implementation.MethodCall$TargetHandler$ForMethodParameter$Resolved r5 = (net.bytebuddy.implementation.MethodCall.TargetHandler.ForMethodParameter.Resolved) r5
                        net.bytebuddy.description.method.ParameterDescription r5 = r5.parameterDescription
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L20
                        return r1
                    L20:
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved
                public net.bytebuddy.description.type.TypeDescription getTypeDescription() {
                        r1 = this;
                        net.bytebuddy.description.method.ParameterDescription r0 = r1.parameterDescription
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getType()
                        net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        net.bytebuddy.description.method.ParameterDescription r1 = r2.parameterDescription
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved
                public net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation(net.bytebuddy.description.method.MethodDescription r3, net.bytebuddy.implementation.bytecode.assign.Assigner r4, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r5) {
                        r2 = this;
                        net.bytebuddy.description.method.ParameterDescription r0 = r2.parameterDescription
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getType()
                        net.bytebuddy.description.type.TypeDefinition r1 = r3.getDeclaringType()
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r1.asGenericType()
                        net.bytebuddy.implementation.bytecode.StackManipulation r4 = r4.assign(r0, r1, r5)
                        boolean r5 = r4.isValid()
                        if (r5 == 0) goto L2d
                        net.bytebuddy.implementation.bytecode.StackManipulation$Compound r3 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                        net.bytebuddy.description.method.ParameterDescription r5 = r2.parameterDescription
                        net.bytebuddy.implementation.bytecode.StackManipulation r5 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.load(r5)
                        r0 = 2
                        net.bytebuddy.implementation.bytecode.StackManipulation[] r0 = new net.bytebuddy.implementation.bytecode.StackManipulation[r0]
                        r1 = 0
                        r0[r1] = r5
                        r5 = 1
                        r0[r5] = r4
                        r3.<init>(r0)
                        return r3
                    L2d:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder
                        r5.<init>()
                        java.lang.String r0 = "Cannot invoke "
                        r5.append(r0)
                        r5.append(r3)
                        java.lang.String r3 = " on "
                        r5.append(r3)
                        net.bytebuddy.description.method.ParameterDescription r3 = r2.parameterDescription
                        net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.getType()
                        r5.append(r3)
                        java.lang.String r3 = r5.toString()
                        r4.<init>(r3)
                        throw r4
                }
            }

            public ForMethodParameter(int r1) {
                    r0 = this;
                    r0.<init>()
                    r0.index = r1
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
                    int r2 = r4.index
                    net.bytebuddy.implementation.MethodCall$TargetHandler$ForMethodParameter r5 = (net.bytebuddy.implementation.MethodCall.TargetHandler.ForMethodParameter) r5
                    int r5 = r5.index
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
                    int r1 = r2.index
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Factory
            public net.bytebuddy.implementation.MethodCall.TargetHandler make(net.bytebuddy.implementation.Implementation.Target r1) {
                    r0 = this;
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                    r0 = this;
                    return r1
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler
            public net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved resolve(net.bytebuddy.description.method.MethodDescription r3) {
                    r2 = this;
                    int r0 = r2.index
                    net.bytebuddy.description.method.ParameterList r1 = r3.getParameters()
                    int r1 = r1.size()
                    if (r0 >= r1) goto L1e
                    net.bytebuddy.implementation.MethodCall$TargetHandler$ForMethodParameter$Resolved r0 = new net.bytebuddy.implementation.MethodCall$TargetHandler$ForMethodParameter$Resolved
                    net.bytebuddy.description.method.ParameterList r3 = r3.getParameters()
                    int r1 = r2.index
                    java.lang.Object r3 = r3.get(r1)
                    net.bytebuddy.description.method.ParameterDescription r3 = (net.bytebuddy.description.method.ParameterDescription) r3
                    r0.<init>(r3)
                    return r0
                L1e:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    r1.append(r3)
                    java.lang.String r3 = " does not have a parameter with index "
                    r1.append(r3)
                    int r3 = r2.index
                    r1.append(r3)
                    java.lang.String r3 = r1.toString()
                    r0.<init>(r3)
                    throw r0
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForSelfOrStaticInvocation implements net.bytebuddy.implementation.MethodCall.TargetHandler {
            private final net.bytebuddy.description.type.TypeDescription instrumentedType;

            public enum Factory extends java.lang.Enum<net.bytebuddy.implementation.MethodCall.TargetHandler.ForSelfOrStaticInvocation.Factory> implements net.bytebuddy.implementation.MethodCall.TargetHandler.Factory {
                private static final /* synthetic */ net.bytebuddy.implementation.MethodCall.TargetHandler.ForSelfOrStaticInvocation.Factory[] $VALUES = null;
                public static final net.bytebuddy.implementation.MethodCall.TargetHandler.ForSelfOrStaticInvocation.Factory INSTANCE = null;

                static {
                        net.bytebuddy.implementation.MethodCall$TargetHandler$ForSelfOrStaticInvocation$Factory r0 = new net.bytebuddy.implementation.MethodCall$TargetHandler$ForSelfOrStaticInvocation$Factory
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.implementation.MethodCall.TargetHandler.ForSelfOrStaticInvocation.Factory.INSTANCE = r0
                        net.bytebuddy.implementation.MethodCall$TargetHandler$ForSelfOrStaticInvocation$Factory[] r0 = new net.bytebuddy.implementation.MethodCall.TargetHandler.ForSelfOrStaticInvocation.Factory[]{r0}
                        net.bytebuddy.implementation.MethodCall.TargetHandler.ForSelfOrStaticInvocation.Factory.$VALUES = r0
                        return
                }

                Factory(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.implementation.MethodCall.TargetHandler.ForSelfOrStaticInvocation.Factory valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.implementation.MethodCall$TargetHandler$ForSelfOrStaticInvocation$Factory> r0 = net.bytebuddy.implementation.MethodCall.TargetHandler.ForSelfOrStaticInvocation.Factory.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.implementation.MethodCall$TargetHandler$ForSelfOrStaticInvocation$Factory r1 = (net.bytebuddy.implementation.MethodCall.TargetHandler.ForSelfOrStaticInvocation.Factory) r1
                        return r1
                }

                public static net.bytebuddy.implementation.MethodCall.TargetHandler.ForSelfOrStaticInvocation.Factory[] values() {
                        net.bytebuddy.implementation.MethodCall$TargetHandler$ForSelfOrStaticInvocation$Factory[] r0 = net.bytebuddy.implementation.MethodCall.TargetHandler.ForSelfOrStaticInvocation.Factory.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.implementation.MethodCall$TargetHandler$ForSelfOrStaticInvocation$Factory[] r0 = (net.bytebuddy.implementation.MethodCall.TargetHandler.ForSelfOrStaticInvocation.Factory[]) r0
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Factory
                public net.bytebuddy.implementation.MethodCall.TargetHandler make(net.bytebuddy.implementation.Implementation.Target r2) {
                        r1 = this;
                        net.bytebuddy.implementation.MethodCall$TargetHandler$ForSelfOrStaticInvocation r0 = new net.bytebuddy.implementation.MethodCall$TargetHandler$ForSelfOrStaticInvocation
                        net.bytebuddy.description.type.TypeDescription r2 = r2.getInstrumentedType()
                        r0.<init>(r2)
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                        r0 = this;
                        return r1
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Resolved implements net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved {
                private final net.bytebuddy.description.method.MethodDescription instrumentedMethod;
                private final net.bytebuddy.description.type.TypeDescription instrumentedType;

                public Resolved(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2) {
                        r0 = this;
                        r0.<init>()
                        r0.instrumentedType = r1
                        r0.instrumentedMethod = r2
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
                        net.bytebuddy.description.type.TypeDescription r2 = r4.instrumentedType
                        net.bytebuddy.implementation.MethodCall$TargetHandler$ForSelfOrStaticInvocation$Resolved r5 = (net.bytebuddy.implementation.MethodCall.TargetHandler.ForSelfOrStaticInvocation.Resolved) r5
                        net.bytebuddy.description.type.TypeDescription r3 = r5.instrumentedType
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        net.bytebuddy.description.method.MethodDescription r2 = r4.instrumentedMethod
                        net.bytebuddy.description.method.MethodDescription r5 = r5.instrumentedMethod
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L2b
                        return r1
                    L2b:
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved
                public net.bytebuddy.description.type.TypeDescription getTypeDescription() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.instrumentedType
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
                        net.bytebuddy.description.method.MethodDescription r1 = r2.instrumentedMethod
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved
                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming declaring type for type member.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                public net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation(net.bytebuddy.description.method.MethodDescription r3, net.bytebuddy.implementation.bytecode.assign.Assigner r4, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r5) {
                        r2 = this;
                        net.bytebuddy.description.method.MethodDescription r4 = r2.instrumentedMethod
                        boolean r4 = r4.isStatic()
                        java.lang.String r5 = " from "
                        java.lang.String r0 = "Cannot invoke "
                        if (r4 == 0) goto L36
                        boolean r4 = r3.isStatic()
                        if (r4 != 0) goto L36
                        boolean r4 = r3.isConstructor()
                        if (r4 == 0) goto L19
                        goto L36
                    L19:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        r1.append(r0)
                        r1.append(r3)
                        r1.append(r5)
                        net.bytebuddy.description.method.MethodDescription r3 = r2.instrumentedMethod
                        r1.append(r3)
                        java.lang.String r3 = r1.toString()
                        r4.<init>(r3)
                        throw r4
                    L36:
                        boolean r4 = r3.isConstructor()
                        if (r4 == 0) goto L9c
                        net.bytebuddy.description.method.MethodDescription r4 = r2.instrumentedMethod
                        boolean r4 = r4.isConstructor()
                        if (r4 == 0) goto L75
                        net.bytebuddy.description.type.TypeDescription r4 = r2.instrumentedType
                        net.bytebuddy.description.type.TypeDefinition r1 = r3.getDeclaringType()
                        net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                        boolean r4 = r4.equals(r1)
                        if (r4 != 0) goto L9c
                        net.bytebuddy.description.type.TypeDescription r4 = r2.instrumentedType
                        net.bytebuddy.description.type.TypeDescription$Generic r4 = r4.getSuperClass()
                        if (r4 == 0) goto L75
                        net.bytebuddy.description.type.TypeDescription r4 = r2.instrumentedType
                        net.bytebuddy.description.type.TypeDescription$Generic r4 = r4.getSuperClass()
                        net.bytebuddy.description.type.TypeDescription r4 = r4.asErasure()
                        net.bytebuddy.description.type.TypeDefinition r1 = r3.getDeclaringType()
                        net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                        boolean r4 = r4.equals(r1)
                        if (r4 == 0) goto L75
                        goto L9c
                    L75:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        r1.append(r0)
                        r1.append(r3)
                        r1.append(r5)
                        net.bytebuddy.description.method.MethodDescription r3 = r2.instrumentedMethod
                        r1.append(r3)
                        java.lang.String r3 = " in "
                        r1.append(r3)
                        net.bytebuddy.description.type.TypeDescription r3 = r2.instrumentedType
                        r1.append(r3)
                        java.lang.String r3 = r1.toString()
                        r4.<init>(r3)
                        throw r4
                    L9c:
                        net.bytebuddy.implementation.bytecode.StackManipulation$Compound r4 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                        r5 = 2
                        net.bytebuddy.implementation.bytecode.StackManipulation[] r5 = new net.bytebuddy.implementation.bytecode.StackManipulation[r5]
                        boolean r0 = r3.isStatic()
                        if (r0 == 0) goto Laa
                        net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r0 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
                        goto Lae
                    Laa:
                        net.bytebuddy.implementation.bytecode.StackManipulation r0 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                    Lae:
                        r1 = 0
                        r5[r1] = r0
                        boolean r3 = r3.isConstructor()
                        if (r3 == 0) goto Lba
                        net.bytebuddy.implementation.bytecode.Duplication r3 = net.bytebuddy.implementation.bytecode.Duplication.SINGLE
                        goto Lbc
                    Lba:
                        net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r3 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
                    Lbc:
                        r0 = 1
                        r5[r0] = r3
                        r4.<init>(r5)
                        return r4
                }
            }

            public ForSelfOrStaticInvocation(net.bytebuddy.description.type.TypeDescription r1) {
                    r0 = this;
                    r0.<init>()
                    r0.instrumentedType = r1
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
                    net.bytebuddy.description.type.TypeDescription r2 = r4.instrumentedType
                    net.bytebuddy.implementation.MethodCall$TargetHandler$ForSelfOrStaticInvocation r5 = (net.bytebuddy.implementation.MethodCall.TargetHandler.ForSelfOrStaticInvocation) r5
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

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler
            public net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved resolve(net.bytebuddy.description.method.MethodDescription r3) {
                    r2 = this;
                    net.bytebuddy.implementation.MethodCall$TargetHandler$ForSelfOrStaticInvocation$Resolved r0 = new net.bytebuddy.implementation.MethodCall$TargetHandler$ForSelfOrStaticInvocation$Resolved
                    net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
                    r0.<init>(r1, r3)
                    return r0
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForValue implements net.bytebuddy.implementation.MethodCall.TargetHandler, net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved {
            private final net.bytebuddy.description.field.FieldDescription.InDefinedShape fieldDescription;

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Factory implements net.bytebuddy.implementation.MethodCall.TargetHandler.Factory {
                private static final java.lang.String FIELD_PREFIX = "invocationTarget";
                private final net.bytebuddy.description.type.TypeDescription.Generic fieldType;

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.IGNORE)
                private final java.lang.String name;
                private final java.lang.Object target;

                public Factory(java.lang.Object r2, net.bytebuddy.description.type.TypeDescription.Generic r3) {
                        r1 = this;
                        r1.<init>()
                        r1.target = r2
                        r1.fieldType = r3
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder
                        r3.<init>()
                        java.lang.String r0 = "invocationTarget$"
                        r3.append(r0)
                        java.lang.String r2 = net.bytebuddy.utility.RandomString.hashOf(r2)
                        r3.append(r2)
                        java.lang.String r2 = r3.toString()
                        r1.name = r2
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
                        java.lang.Object r2 = r4.target
                        net.bytebuddy.implementation.MethodCall$TargetHandler$ForValue$Factory r5 = (net.bytebuddy.implementation.MethodCall.TargetHandler.ForValue.Factory) r5
                        java.lang.Object r3 = r5.target
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.fieldType
                        net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.fieldType
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
                        java.lang.Object r1 = r2.target
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.fieldType
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Factory
                public net.bytebuddy.implementation.MethodCall.TargetHandler make(net.bytebuddy.implementation.Implementation.Target r3) {
                        r2 = this;
                        net.bytebuddy.implementation.MethodCall$TargetHandler$ForValue r0 = new net.bytebuddy.implementation.MethodCall$TargetHandler$ForValue
                        net.bytebuddy.description.type.TypeDescription r3 = r3.getInstrumentedType()
                        net.bytebuddy.description.field.FieldList r3 = r3.getDeclaredFields()
                        java.lang.String r1 = r2.name
                        net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                        net.bytebuddy.matcher.FilterableList r3 = r3.filter(r1)
                        net.bytebuddy.description.field.FieldList r3 = (net.bytebuddy.description.field.FieldList) r3
                        java.lang.Object r3 = r3.getOnly()
                        net.bytebuddy.description.field.FieldDescription$InDefinedShape r3 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r3
                        r0.<init>(r3)
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r5) {
                        r4 = this;
                        net.bytebuddy.description.field.FieldDescription$Token r0 = new net.bytebuddy.description.field.FieldDescription$Token
                        java.lang.String r1 = r4.name
                        r2 = 4169(0x1049, float:5.842E-42)
                        net.bytebuddy.description.type.TypeDescription$Generic r3 = r4.fieldType
                        r0.<init>(r1, r2, r3)
                        java.lang.Object r1 = r4.target
                        net.bytebuddy.dynamic.scaffold.InstrumentedType r5 = r5.withAuxiliaryField(r0, r1)
                        return r5
                }
            }

            public ForValue(net.bytebuddy.description.field.FieldDescription.InDefinedShape r1) {
                    r0 = this;
                    r0.<init>()
                    r0.fieldDescription = r1
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
                    net.bytebuddy.description.field.FieldDescription$InDefinedShape r2 = r4.fieldDescription
                    net.bytebuddy.implementation.MethodCall$TargetHandler$ForValue r5 = (net.bytebuddy.implementation.MethodCall.TargetHandler.ForValue) r5
                    net.bytebuddy.description.field.FieldDescription$InDefinedShape r5 = r5.fieldDescription
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L20
                    return r1
                L20:
                    return r0
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved
            public net.bytebuddy.description.type.TypeDescription getTypeDescription() {
                    r1 = this;
                    net.bytebuddy.description.field.FieldDescription$InDefinedShape r0 = r1.fieldDescription
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getType()
                    net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.description.field.FieldDescription$InDefinedShape r1 = r2.fieldDescription
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler
            public net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved resolve(net.bytebuddy.description.method.MethodDescription r1) {
                    r0 = this;
                    return r0
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved
            public net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation(net.bytebuddy.description.method.MethodDescription r3, net.bytebuddy.implementation.bytecode.assign.Assigner r4, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r5) {
                    r2 = this;
                    net.bytebuddy.description.field.FieldDescription$InDefinedShape r0 = r2.fieldDescription
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getType()
                    net.bytebuddy.description.type.TypeDefinition r1 = r3.getDeclaringType()
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r1.asGenericType()
                    net.bytebuddy.implementation.bytecode.StackManipulation r4 = r4.assign(r0, r1, r5)
                    boolean r5 = r4.isValid()
                    if (r5 == 0) goto L31
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r3 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    net.bytebuddy.description.field.FieldDescription$InDefinedShape r5 = r2.fieldDescription
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r5 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r5)
                    net.bytebuddy.implementation.bytecode.StackManipulation r5 = r5.read()
                    r0 = 2
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r0 = new net.bytebuddy.implementation.bytecode.StackManipulation[r0]
                    r1 = 0
                    r0[r1] = r5
                    r5 = 1
                    r0[r5] = r4
                    r3.<init>(r0)
                    return r3
                L31:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    r5.<init>()
                    java.lang.String r0 = "Cannot invoke "
                    r5.append(r0)
                    r5.append(r3)
                    java.lang.String r3 = " on "
                    r5.append(r3)
                    net.bytebuddy.description.field.FieldDescription$InDefinedShape r3 = r2.fieldDescription
                    r5.append(r3)
                    java.lang.String r3 = r5.toString()
                    r4.<init>(r3)
                    throw r4
            }
        }

        public interface Resolved {
            net.bytebuddy.description.type.TypeDescription getTypeDescription();

            net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation(net.bytebuddy.description.method.MethodDescription r1, net.bytebuddy.implementation.bytecode.assign.Assigner r2, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r3);
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Simple implements net.bytebuddy.implementation.MethodCall.TargetHandler, net.bytebuddy.implementation.MethodCall.TargetHandler.Factory, net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved {
            private final net.bytebuddy.implementation.bytecode.StackManipulation stackManipulation;
            private final net.bytebuddy.description.type.TypeDescription typeDescription;

            public Simple(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.implementation.bytecode.StackManipulation r2) {
                    r0 = this;
                    r0.<init>()
                    r0.typeDescription = r1
                    r0.stackManipulation = r2
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
                    net.bytebuddy.implementation.MethodCall$TargetHandler$Simple r5 = (net.bytebuddy.implementation.MethodCall.TargetHandler.Simple) r5
                    net.bytebuddy.description.type.TypeDescription r3 = r5.typeDescription
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.implementation.bytecode.StackManipulation r2 = r4.stackManipulation
                    net.bytebuddy.implementation.bytecode.StackManipulation r5 = r5.stackManipulation
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L2b
                    return r1
                L2b:
                    return r0
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved
            public net.bytebuddy.description.type.TypeDescription getTypeDescription() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
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
                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = r2.stackManipulation
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Factory
            public net.bytebuddy.implementation.MethodCall.TargetHandler make(net.bytebuddy.implementation.Implementation.Target r1) {
                    r0 = this;
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                    r0 = this;
                    return r1
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler
            public net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved resolve(net.bytebuddy.description.method.MethodDescription r1) {
                    r0 = this;
                    return r0
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved
            public net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation(net.bytebuddy.description.method.MethodDescription r1, net.bytebuddy.implementation.bytecode.assign.Assigner r2, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r3) {
                    r0 = this;
                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = r0.stackManipulation
                    return r1
            }
        }

        net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved resolve(net.bytebuddy.description.method.MethodDescription r1);
    }

    public interface TerminationHandler {

        public interface Factory {
            net.bytebuddy.implementation.MethodCall.TerminationHandler make(net.bytebuddy.description.type.TypeDescription r1);
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class FieldSetting implements net.bytebuddy.implementation.MethodCall.TerminationHandler {
            private final net.bytebuddy.description.field.FieldDescription fieldDescription;

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Explicit implements net.bytebuddy.implementation.MethodCall.TerminationHandler.Factory {
                private final net.bytebuddy.description.field.FieldDescription fieldDescription;

                public Explicit(net.bytebuddy.description.field.FieldDescription r1) {
                        r0 = this;
                        r0.<init>()
                        r0.fieldDescription = r1
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
                        net.bytebuddy.implementation.MethodCall$TerminationHandler$FieldSetting$Explicit r5 = (net.bytebuddy.implementation.MethodCall.TerminationHandler.FieldSetting.Explicit) r5
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

                @Override // net.bytebuddy.implementation.MethodCall.TerminationHandler.Factory
                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming declaring type for type member.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                public net.bytebuddy.implementation.MethodCall.TerminationHandler make(net.bytebuddy.description.type.TypeDescription r5) {
                        r4 = this;
                        net.bytebuddy.description.field.FieldDescription r0 = r4.fieldDescription
                        boolean r0 = r0.isStatic()
                        java.lang.String r1 = " from "
                        if (r0 != 0) goto L3a
                        net.bytebuddy.description.field.FieldDescription r0 = r4.fieldDescription
                        net.bytebuddy.description.type.TypeDefinition r0 = r0.getDeclaringType()
                        net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                        boolean r0 = r5.isAssignableTo(r0)
                        if (r0 == 0) goto L1b
                        goto L3a
                    L1b:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        r2.<init>()
                        java.lang.String r3 = "Cannot set "
                        r2.append(r3)
                        net.bytebuddy.description.field.FieldDescription r3 = r4.fieldDescription
                        r2.append(r3)
                        r2.append(r1)
                        r2.append(r5)
                        java.lang.String r5 = r2.toString()
                        r0.<init>(r5)
                        throw r0
                    L3a:
                        net.bytebuddy.description.field.FieldDescription r0 = r4.fieldDescription
                        boolean r0 = r0.isVisibleTo(r5)
                        if (r0 == 0) goto L4a
                        net.bytebuddy.implementation.MethodCall$TerminationHandler$FieldSetting r5 = new net.bytebuddy.implementation.MethodCall$TerminationHandler$FieldSetting
                        net.bytebuddy.description.field.FieldDescription r0 = r4.fieldDescription
                        r5.<init>(r0)
                        return r5
                    L4a:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        r2.<init>()
                        java.lang.String r3 = "Cannot access "
                        r2.append(r3)
                        net.bytebuddy.description.field.FieldDescription r3 = r4.fieldDescription
                        r2.append(r3)
                        r2.append(r1)
                        r2.append(r5)
                        java.lang.String r5 = r2.toString()
                        r0.<init>(r5)
                        throw r0
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Implicit implements net.bytebuddy.implementation.MethodCall.TerminationHandler.Factory {
                private final net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> matcher;

                public Implicit(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r1) {
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
                        net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r2 = r4.matcher
                        net.bytebuddy.implementation.MethodCall$TerminationHandler$FieldSetting$Implicit r5 = (net.bytebuddy.implementation.MethodCall.TerminationHandler.FieldSetting.Implicit) r5
                        net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r5 = r5.matcher
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
                        net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r1 = r2.matcher
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.MethodCall.TerminationHandler.Factory
                public net.bytebuddy.implementation.MethodCall.TerminationHandler make(net.bytebuddy.description.type.TypeDescription r5) {
                        r4 = this;
                        r0 = r5
                    L1:
                        net.bytebuddy.description.field.FieldList r1 = r0.getDeclaredFields()
                        net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.isVisibleTo(r5)
                        net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r3 = r4.matcher
                        net.bytebuddy.matcher.ElementMatcher$Junction r2 = r2.and(r3)
                        net.bytebuddy.matcher.FilterableList r1 = r1.filter(r2)
                        net.bytebuddy.description.field.FieldList r1 = (net.bytebuddy.description.field.FieldList) r1
                        int r2 = r1.size()
                        r3 = 1
                        if (r2 != r3) goto L28
                        net.bytebuddy.implementation.MethodCall$TerminationHandler$FieldSetting r5 = new net.bytebuddy.implementation.MethodCall$TerminationHandler$FieldSetting
                        java.lang.Object r0 = r1.getOnly()
                        net.bytebuddy.description.field.FieldDescription r0 = (net.bytebuddy.description.field.FieldDescription) r0
                        r5.<init>(r0)
                        return r5
                    L28:
                        int r2 = r1.size()
                        r3 = 2
                        if (r2 == r3) goto L52
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getSuperClass()
                        if (r0 == 0) goto L36
                        goto L1
                    L36:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r2 = r4.matcher
                        r1.append(r2)
                        java.lang.String r2 = " does not locate any accessible fields for "
                        r1.append(r2)
                        r1.append(r5)
                        java.lang.String r5 = r1.toString()
                        r0.<init>(r5)
                        throw r0
                    L52:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r2 = r4.matcher
                        r0.append(r2)
                        java.lang.String r2 = " is ambiguous and resolved: "
                        r0.append(r2)
                        r0.append(r1)
                        java.lang.String r0 = r0.toString()
                        r5.<init>(r0)
                        throw r5
                }
            }

            public FieldSetting(net.bytebuddy.description.field.FieldDescription r1) {
                    r0 = this;
                    r0.<init>()
                    r0.fieldDescription = r1
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
                    net.bytebuddy.implementation.MethodCall$TerminationHandler$FieldSetting r5 = (net.bytebuddy.implementation.MethodCall.TerminationHandler.FieldSetting) r5
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

            @Override // net.bytebuddy.implementation.MethodCall.TerminationHandler
            public net.bytebuddy.implementation.bytecode.StackManipulation prepare() {
                    r1 = this;
                    net.bytebuddy.description.field.FieldDescription r0 = r1.fieldDescription
                    boolean r0 = r0.isStatic()
                    if (r0 == 0) goto Lb
                    net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r0 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
                    goto Lf
                Lb:
                    net.bytebuddy.implementation.bytecode.StackManipulation r0 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                Lf:
                    return r0
            }

            @Override // net.bytebuddy.implementation.MethodCall.TerminationHandler
            public net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation(net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.description.method.MethodDescription r3, net.bytebuddy.implementation.bytecode.assign.Assigner r4, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r5) {
                    r1 = this;
                    boolean r3 = r2.isConstructor()
                    if (r3 == 0) goto Lf
                    net.bytebuddy.description.type.TypeDefinition r3 = r2.getDeclaringType()
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.asGenericType()
                    goto L13
                Lf:
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = r2.getReturnType()
                L13:
                    net.bytebuddy.description.field.FieldDescription r0 = r1.fieldDescription
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getType()
                    net.bytebuddy.implementation.bytecode.StackManipulation r3 = r4.assign(r3, r0, r5)
                    boolean r4 = r3.isValid()
                    if (r4 == 0) goto L3c
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r2 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    net.bytebuddy.description.field.FieldDescription r4 = r1.fieldDescription
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r4 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r4)
                    net.bytebuddy.implementation.bytecode.StackManipulation r4 = r4.write()
                    r5 = 2
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r5 = new net.bytebuddy.implementation.bytecode.StackManipulation[r5]
                    r0 = 0
                    r5[r0] = r3
                    r3 = 1
                    r5[r3] = r4
                    r2.<init>(r5)
                    return r2
                L3c:
                    java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    java.lang.String r5 = "Cannot assign result of "
                    r4.append(r5)
                    r4.append(r2)
                    java.lang.String r2 = " to "
                    r4.append(r2)
                    net.bytebuddy.description.field.FieldDescription r2 = r1.fieldDescription
                    r4.append(r2)
                    java.lang.String r2 = r4.toString()
                    r3.<init>(r2)
                    throw r3
            }
        }

        public enum Simple extends java.lang.Enum<net.bytebuddy.implementation.MethodCall.TerminationHandler.Simple> implements net.bytebuddy.implementation.MethodCall.TerminationHandler, net.bytebuddy.implementation.MethodCall.TerminationHandler.Factory {
            private static final /* synthetic */ net.bytebuddy.implementation.MethodCall.TerminationHandler.Simple[] $VALUES = null;
            public static final net.bytebuddy.implementation.MethodCall.TerminationHandler.Simple DROPPING = null;
            public static final net.bytebuddy.implementation.MethodCall.TerminationHandler.Simple IGNORING = null;
            public static final net.bytebuddy.implementation.MethodCall.TerminationHandler.Simple RETURNING = null;




            static {
                    net.bytebuddy.implementation.MethodCall$TerminationHandler$Simple$1 r0 = new net.bytebuddy.implementation.MethodCall$TerminationHandler$Simple$1
                    java.lang.String r1 = "RETURNING"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.implementation.MethodCall.TerminationHandler.Simple.RETURNING = r0
                    net.bytebuddy.implementation.MethodCall$TerminationHandler$Simple$2 r1 = new net.bytebuddy.implementation.MethodCall$TerminationHandler$Simple$2
                    java.lang.String r3 = "DROPPING"
                    r4 = 1
                    r1.<init>(r3, r4)
                    net.bytebuddy.implementation.MethodCall.TerminationHandler.Simple.DROPPING = r1
                    net.bytebuddy.implementation.MethodCall$TerminationHandler$Simple$3 r3 = new net.bytebuddy.implementation.MethodCall$TerminationHandler$Simple$3
                    java.lang.String r5 = "IGNORING"
                    r6 = 2
                    r3.<init>(r5, r6)
                    net.bytebuddy.implementation.MethodCall.TerminationHandler.Simple.IGNORING = r3
                    r5 = 3
                    net.bytebuddy.implementation.MethodCall$TerminationHandler$Simple[] r5 = new net.bytebuddy.implementation.MethodCall.TerminationHandler.Simple[r5]
                    r5[r2] = r0
                    r5[r4] = r1
                    r5[r6] = r3
                    net.bytebuddy.implementation.MethodCall.TerminationHandler.Simple.$VALUES = r5
                    return
            }

            Simple(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            /* synthetic */ Simple(java.lang.String r1, int r2, net.bytebuddy.implementation.MethodCall.AnonymousClass1 r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.implementation.MethodCall.TerminationHandler.Simple valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.implementation.MethodCall$TerminationHandler$Simple> r0 = net.bytebuddy.implementation.MethodCall.TerminationHandler.Simple.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.implementation.MethodCall$TerminationHandler$Simple r1 = (net.bytebuddy.implementation.MethodCall.TerminationHandler.Simple) r1
                    return r1
            }

            public static net.bytebuddy.implementation.MethodCall.TerminationHandler.Simple[] values() {
                    net.bytebuddy.implementation.MethodCall$TerminationHandler$Simple[] r0 = net.bytebuddy.implementation.MethodCall.TerminationHandler.Simple.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.implementation.MethodCall$TerminationHandler$Simple[] r0 = (net.bytebuddy.implementation.MethodCall.TerminationHandler.Simple[]) r0
                    return r0
            }

            @Override // net.bytebuddy.implementation.MethodCall.TerminationHandler.Factory
            public net.bytebuddy.implementation.MethodCall.TerminationHandler make(net.bytebuddy.description.type.TypeDescription r1) {
                    r0 = this;
                    return r0
            }

            @Override // net.bytebuddy.implementation.MethodCall.TerminationHandler
            public net.bytebuddy.implementation.bytecode.StackManipulation prepare() {
                    r1 = this;
                    net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r0 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
                    return r0
            }
        }

        net.bytebuddy.implementation.bytecode.StackManipulation prepare();

        net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation(net.bytebuddy.description.method.MethodDescription r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.implementation.bytecode.assign.Assigner r3, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r4);
    }

    public static class WithoutSpecifiedTarget extends net.bytebuddy.implementation.MethodCall {
        public WithoutSpecifiedTarget(net.bytebuddy.implementation.MethodCall.MethodLocator.Factory r9) {
                r8 = this;
                net.bytebuddy.implementation.MethodCall$TargetHandler$ForSelfOrStaticInvocation$Factory r2 = net.bytebuddy.implementation.MethodCall.TargetHandler.ForSelfOrStaticInvocation.Factory.INSTANCE
                java.util.List r3 = java.util.Collections.emptyList()
                net.bytebuddy.implementation.MethodCall$MethodInvoker$ForContextualInvocation$Factory r4 = net.bytebuddy.implementation.MethodCall.MethodInvoker.ForContextualInvocation.Factory.INSTANCE
                net.bytebuddy.implementation.MethodCall$TerminationHandler$Simple r5 = net.bytebuddy.implementation.MethodCall.TerminationHandler.Simple.RETURNING
                net.bytebuddy.implementation.bytecode.assign.Assigner r6 = net.bytebuddy.implementation.bytecode.assign.Assigner.DEFAULT
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r7 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.STATIC
                r0 = r8
                r1 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
        }

        public net.bytebuddy.implementation.MethodCall on(java.lang.Object r2) {
                r1 = this;
                java.lang.Class r0 = r2.getClass()
                net.bytebuddy.implementation.MethodCall r2 = r1.on(r2, r0)
                return r2
        }

        public <T> net.bytebuddy.implementation.MethodCall on(T r10, java.lang.Class<? super T> r11) {
                r9 = this;
                net.bytebuddy.implementation.MethodCall r8 = new net.bytebuddy.implementation.MethodCall
                net.bytebuddy.implementation.MethodCall$MethodLocator$Factory r1 = r9.methodLocator
                net.bytebuddy.implementation.MethodCall$TargetHandler$ForValue$Factory r2 = new net.bytebuddy.implementation.MethodCall$TargetHandler$ForValue$Factory
                net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r11)
                r2.<init>(r10, r0)
                java.util.List<net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory> r3 = r9.argumentLoaders
                net.bytebuddy.implementation.MethodCall$MethodInvoker$ForVirtualInvocation$Factory r4 = new net.bytebuddy.implementation.MethodCall$MethodInvoker$ForVirtualInvocation$Factory
                net.bytebuddy.description.type.TypeDescription r10 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r11)
                r4.<init>(r10)
                net.bytebuddy.implementation.MethodCall$TerminationHandler$Factory r5 = r9.terminationHandler
                net.bytebuddy.implementation.bytecode.assign.Assigner r6 = r9.assigner
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r7 = r9.typing
                r0 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r8
        }

        public net.bytebuddy.implementation.MethodCall on(net.bytebuddy.implementation.bytecode.StackManipulation r1, java.lang.Class<?> r2) {
                r0 = this;
                net.bytebuddy.description.type.TypeDescription r2 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r2)
                net.bytebuddy.implementation.MethodCall r1 = r0.on(r1, r2)
                return r1
        }

        public net.bytebuddy.implementation.MethodCall on(net.bytebuddy.implementation.bytecode.StackManipulation r10, net.bytebuddy.description.type.TypeDescription r11) {
                r9 = this;
                net.bytebuddy.implementation.MethodCall r8 = new net.bytebuddy.implementation.MethodCall
                net.bytebuddy.implementation.MethodCall$MethodLocator$Factory r1 = r9.methodLocator
                net.bytebuddy.implementation.MethodCall$TargetHandler$Simple r2 = new net.bytebuddy.implementation.MethodCall$TargetHandler$Simple
                r2.<init>(r11, r10)
                java.util.List<net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory> r3 = r9.argumentLoaders
                net.bytebuddy.implementation.MethodCall$MethodInvoker$ForVirtualInvocation$Factory r4 = new net.bytebuddy.implementation.MethodCall$MethodInvoker$ForVirtualInvocation$Factory
                r4.<init>(r11)
                net.bytebuddy.implementation.MethodCall$TerminationHandler$Factory r5 = r9.terminationHandler
                net.bytebuddy.implementation.bytecode.assign.Assigner r6 = r9.assigner
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r7 = r9.typing
                r0 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r8
        }

        public net.bytebuddy.implementation.MethodCall onArgument(int r10) {
                r9 = this;
                if (r10 < 0) goto L1a
                net.bytebuddy.implementation.MethodCall r8 = new net.bytebuddy.implementation.MethodCall
                net.bytebuddy.implementation.MethodCall$MethodLocator$Factory r1 = r9.methodLocator
                net.bytebuddy.implementation.MethodCall$TargetHandler$ForMethodParameter r2 = new net.bytebuddy.implementation.MethodCall$TargetHandler$ForMethodParameter
                r2.<init>(r10)
                java.util.List<net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory> r3 = r9.argumentLoaders
                net.bytebuddy.implementation.MethodCall$MethodInvoker$ForVirtualInvocation$WithImplicitType r4 = net.bytebuddy.implementation.MethodCall.MethodInvoker.ForVirtualInvocation.WithImplicitType.INSTANCE
                net.bytebuddy.implementation.MethodCall$TerminationHandler$Factory r5 = r9.terminationHandler
                net.bytebuddy.implementation.bytecode.assign.Assigner r6 = r9.assigner
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r7 = r9.typing
                r0 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r8
            L1a:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "An argument index cannot be negative: "
                r1.append(r2)
                r1.append(r10)
                java.lang.String r10 = r1.toString()
                r0.<init>(r10)
                throw r0
        }

        public net.bytebuddy.implementation.MethodCall onDefault() {
                r9 = this;
                net.bytebuddy.implementation.MethodCall r8 = new net.bytebuddy.implementation.MethodCall
                net.bytebuddy.implementation.MethodCall$MethodLocator$Factory r1 = r9.methodLocator
                net.bytebuddy.implementation.MethodCall$TargetHandler$ForSelfOrStaticInvocation$Factory r2 = net.bytebuddy.implementation.MethodCall.TargetHandler.ForSelfOrStaticInvocation.Factory.INSTANCE
                java.util.List<net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory> r3 = r9.argumentLoaders
                net.bytebuddy.implementation.MethodCall$MethodInvoker$ForDefaultMethodInvocation$Factory r4 = net.bytebuddy.implementation.MethodCall.MethodInvoker.ForDefaultMethodInvocation.Factory.INSTANCE
                net.bytebuddy.implementation.MethodCall$TerminationHandler$Factory r5 = r9.terminationHandler
                net.bytebuddy.implementation.bytecode.assign.Assigner r6 = r9.assigner
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r7 = r9.typing
                r0 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r8
        }

        public net.bytebuddy.implementation.MethodCall onField(java.lang.String r2) {
                r1 = this;
                net.bytebuddy.dynamic.scaffold.FieldLocator$ForClassHierarchy$Factory r0 = net.bytebuddy.dynamic.scaffold.FieldLocator.ForClassHierarchy.Factory.INSTANCE
                net.bytebuddy.implementation.MethodCall r2 = r1.onField(r2, r0)
                return r2
        }

        public net.bytebuddy.implementation.MethodCall onField(java.lang.String r10, net.bytebuddy.dynamic.scaffold.FieldLocator.Factory r11) {
                r9 = this;
                net.bytebuddy.implementation.MethodCall r8 = new net.bytebuddy.implementation.MethodCall
                net.bytebuddy.implementation.MethodCall$MethodLocator$Factory r1 = r9.methodLocator
                net.bytebuddy.implementation.MethodCall$TargetHandler$ForField$Factory r2 = new net.bytebuddy.implementation.MethodCall$TargetHandler$ForField$Factory
                net.bytebuddy.implementation.MethodCall$TargetHandler$ForField$Location$ForImplicitField r0 = new net.bytebuddy.implementation.MethodCall$TargetHandler$ForField$Location$ForImplicitField
                r0.<init>(r10, r11)
                r2.<init>(r0)
                java.util.List<net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory> r3 = r9.argumentLoaders
                net.bytebuddy.implementation.MethodCall$MethodInvoker$ForVirtualInvocation$WithImplicitType r4 = net.bytebuddy.implementation.MethodCall.MethodInvoker.ForVirtualInvocation.WithImplicitType.INSTANCE
                net.bytebuddy.implementation.MethodCall$TerminationHandler$Factory r5 = r9.terminationHandler
                net.bytebuddy.implementation.bytecode.assign.Assigner r6 = r9.assigner
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r7 = r9.typing
                r0 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r8
        }

        public net.bytebuddy.implementation.MethodCall onField(java.lang.reflect.Field r2) {
                r1 = this;
                net.bytebuddy.description.field.FieldDescription$ForLoadedField r0 = new net.bytebuddy.description.field.FieldDescription$ForLoadedField
                r0.<init>(r2)
                net.bytebuddy.implementation.MethodCall r2 = r1.onField(r0)
                return r2
        }

        public net.bytebuddy.implementation.MethodCall onField(net.bytebuddy.description.field.FieldDescription r10) {
                r9 = this;
                net.bytebuddy.implementation.MethodCall r8 = new net.bytebuddy.implementation.MethodCall
                net.bytebuddy.implementation.MethodCall$MethodLocator$Factory r1 = r9.methodLocator
                net.bytebuddy.implementation.MethodCall$TargetHandler$ForField$Factory r2 = new net.bytebuddy.implementation.MethodCall$TargetHandler$ForField$Factory
                net.bytebuddy.implementation.MethodCall$TargetHandler$ForField$Location$ForExplicitField r0 = new net.bytebuddy.implementation.MethodCall$TargetHandler$ForField$Location$ForExplicitField
                r0.<init>(r10)
                r2.<init>(r0)
                java.util.List<net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory> r3 = r9.argumentLoaders
                net.bytebuddy.implementation.MethodCall$MethodInvoker$ForVirtualInvocation$WithImplicitType r4 = net.bytebuddy.implementation.MethodCall.MethodInvoker.ForVirtualInvocation.WithImplicitType.INSTANCE
                net.bytebuddy.implementation.MethodCall$TerminationHandler$Factory r5 = r9.terminationHandler
                net.bytebuddy.implementation.bytecode.assign.Assigner r6 = r9.assigner
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r7 = r9.typing
                r0 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r8
        }

        public net.bytebuddy.implementation.MethodCall onMethodCall(net.bytebuddy.implementation.MethodCall r10) {
                r9 = this;
                net.bytebuddy.implementation.MethodCall r8 = new net.bytebuddy.implementation.MethodCall
                net.bytebuddy.implementation.MethodCall$MethodLocator$Factory r1 = r9.methodLocator
                net.bytebuddy.implementation.MethodCall$TargetHandler$ForMethodCall$Factory r2 = new net.bytebuddy.implementation.MethodCall$TargetHandler$ForMethodCall$Factory
                r2.<init>(r10)
                java.util.List<net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory> r3 = r9.argumentLoaders
                net.bytebuddy.implementation.MethodCall$MethodInvoker$ForVirtualInvocation$WithImplicitType r4 = net.bytebuddy.implementation.MethodCall.MethodInvoker.ForVirtualInvocation.WithImplicitType.INSTANCE
                net.bytebuddy.implementation.MethodCall$TerminationHandler$Factory r5 = r9.terminationHandler
                net.bytebuddy.implementation.bytecode.assign.Assigner r6 = r9.assigner
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r7 = r9.typing
                r0 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r8
        }

        public net.bytebuddy.implementation.MethodCall onSuper() {
                r9 = this;
                net.bytebuddy.implementation.MethodCall r8 = new net.bytebuddy.implementation.MethodCall
                net.bytebuddy.implementation.MethodCall$MethodLocator$Factory r1 = r9.methodLocator
                net.bytebuddy.implementation.MethodCall$TargetHandler$ForSelfOrStaticInvocation$Factory r2 = net.bytebuddy.implementation.MethodCall.TargetHandler.ForSelfOrStaticInvocation.Factory.INSTANCE
                java.util.List<net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory> r3 = r9.argumentLoaders
                net.bytebuddy.implementation.MethodCall$MethodInvoker$ForSuperMethodInvocation$Factory r4 = net.bytebuddy.implementation.MethodCall.MethodInvoker.ForSuperMethodInvocation.Factory.INSTANCE
                net.bytebuddy.implementation.MethodCall$TerminationHandler$Factory r5 = r9.terminationHandler
                net.bytebuddy.implementation.bytecode.assign.Assigner r6 = r9.assigner
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r7 = r9.typing
                r0 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r8
        }
    }

    public MethodCall(net.bytebuddy.implementation.MethodCall.MethodLocator.Factory r1, net.bytebuddy.implementation.MethodCall.TargetHandler.Factory r2, java.util.List<net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory> r3, net.bytebuddy.implementation.MethodCall.MethodInvoker.Factory r4, net.bytebuddy.implementation.MethodCall.TerminationHandler.Factory r5, net.bytebuddy.implementation.bytecode.assign.Assigner r6, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r7) {
            r0 = this;
            r0.<init>()
            r0.methodLocator = r1
            r0.targetHandler = r2
            r0.argumentLoaders = r3
            r0.methodInvoker = r4
            r0.terminationHandler = r5
            r0.assigner = r6
            r0.typing = r7
            return
    }

    public static net.bytebuddy.implementation.Implementation.Composable call(java.util.concurrent.Callable<?> r3) {
            java.lang.Class<java.util.concurrent.Callable> r0 = java.util.concurrent.Callable.class
            java.lang.String r1 = "call"
            r2 = 0
            java.lang.reflect.Method r1 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L1a
            net.bytebuddy.implementation.MethodCall$WithoutSpecifiedTarget r1 = invoke(r1)     // Catch: java.lang.NoSuchMethodException -> L1a
            net.bytebuddy.implementation.MethodCall r3 = r1.on(r3, r0)     // Catch: java.lang.NoSuchMethodException -> L1a
            net.bytebuddy.implementation.bytecode.assign.Assigner r0 = net.bytebuddy.implementation.bytecode.assign.Assigner.DEFAULT     // Catch: java.lang.NoSuchMethodException -> L1a
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r1 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.DYNAMIC     // Catch: java.lang.NoSuchMethodException -> L1a
            net.bytebuddy.implementation.Implementation$Composable r3 = r3.withAssigner(r0, r1)     // Catch: java.lang.NoSuchMethodException -> L1a
            return r3
        L1a:
            r3 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not locate Callable::call method"
            r0.<init>(r1, r3)
            throw r0
    }

    public static net.bytebuddy.implementation.MethodCall construct(java.lang.reflect.Constructor<?> r1) {
            net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor
            r0.<init>(r1)
            net.bytebuddy.implementation.MethodCall r1 = construct(r0)
            return r1
    }

    public static net.bytebuddy.implementation.MethodCall construct(net.bytebuddy.description.method.MethodDescription r9) {
            boolean r0 = r9.isConstructor()
            if (r0 == 0) goto L20
            net.bytebuddy.implementation.MethodCall r0 = new net.bytebuddy.implementation.MethodCall
            net.bytebuddy.implementation.MethodCall$MethodLocator$ForExplicitMethod r2 = new net.bytebuddy.implementation.MethodCall$MethodLocator$ForExplicitMethod
            r2.<init>(r9)
            net.bytebuddy.implementation.MethodCall$TargetHandler$ForConstructingInvocation$Factory r3 = net.bytebuddy.implementation.MethodCall.TargetHandler.ForConstructingInvocation.Factory.INSTANCE
            java.util.List r4 = java.util.Collections.emptyList()
            net.bytebuddy.implementation.MethodCall$MethodInvoker$ForContextualInvocation$Factory r5 = net.bytebuddy.implementation.MethodCall.MethodInvoker.ForContextualInvocation.Factory.INSTANCE
            net.bytebuddy.implementation.MethodCall$TerminationHandler$Simple r6 = net.bytebuddy.implementation.MethodCall.TerminationHandler.Simple.RETURNING
            net.bytebuddy.implementation.bytecode.assign.Assigner r7 = net.bytebuddy.implementation.bytecode.assign.Assigner.DEFAULT
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r8 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.STATIC
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r0
        L20:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Not a constructor: "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
    }

    public static net.bytebuddy.implementation.MethodCall.WithoutSpecifiedTarget invoke(java.lang.reflect.Constructor<?> r1) {
            net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor
            r0.<init>(r1)
            net.bytebuddy.implementation.MethodCall$WithoutSpecifiedTarget r1 = invoke(r0)
            return r1
    }

    public static net.bytebuddy.implementation.MethodCall.WithoutSpecifiedTarget invoke(java.lang.reflect.Method r1) {
            net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod
            r0.<init>(r1)
            net.bytebuddy.implementation.MethodCall$WithoutSpecifiedTarget r1 = invoke(r0)
            return r1
    }

    public static net.bytebuddy.implementation.MethodCall.WithoutSpecifiedTarget invoke(net.bytebuddy.description.method.MethodDescription r1) {
            net.bytebuddy.implementation.MethodCall$MethodLocator$ForExplicitMethod r0 = new net.bytebuddy.implementation.MethodCall$MethodLocator$ForExplicitMethod
            r0.<init>(r1)
            net.bytebuddy.implementation.MethodCall$WithoutSpecifiedTarget r1 = invoke(r0)
            return r1
    }

    public static net.bytebuddy.implementation.MethodCall.WithoutSpecifiedTarget invoke(net.bytebuddy.implementation.MethodCall.MethodLocator.Factory r1) {
            net.bytebuddy.implementation.MethodCall$WithoutSpecifiedTarget r0 = new net.bytebuddy.implementation.MethodCall$WithoutSpecifiedTarget
            r0.<init>(r1)
            return r0
    }

    public static net.bytebuddy.implementation.MethodCall.WithoutSpecifiedTarget invoke(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1) {
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r0 = net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.DEFAULT
            net.bytebuddy.implementation.MethodCall$WithoutSpecifiedTarget r1 = invoke(r1, r0)
            return r1
    }

    public static net.bytebuddy.implementation.MethodCall.WithoutSpecifiedTarget invoke(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r2) {
            net.bytebuddy.implementation.MethodCall$MethodLocator$ForElementMatcher$Factory r0 = new net.bytebuddy.implementation.MethodCall$MethodLocator$ForElementMatcher$Factory
            r0.<init>(r1, r2)
            net.bytebuddy.implementation.MethodCall$WithoutSpecifiedTarget r1 = invoke(r0)
            return r1
    }

    public static net.bytebuddy.implementation.MethodCall.WithoutSpecifiedTarget invokeSelf() {
            net.bytebuddy.implementation.MethodCall$WithoutSpecifiedTarget r0 = new net.bytebuddy.implementation.MethodCall$WithoutSpecifiedTarget
            net.bytebuddy.implementation.MethodCall$MethodLocator$ForInstrumentedMethod r1 = net.bytebuddy.implementation.MethodCall.MethodLocator.ForInstrumentedMethod.INSTANCE
            r0.<init>(r1)
            return r0
    }

    public static net.bytebuddy.implementation.MethodCall invokeSuper() {
            net.bytebuddy.implementation.MethodCall$WithoutSpecifiedTarget r0 = invokeSelf()
            net.bytebuddy.implementation.MethodCall r0 = r0.onSuper()
            return r0
    }

    public static net.bytebuddy.implementation.Implementation.Composable run(java.lang.Runnable r3) {
            java.lang.Class<java.lang.Runnable> r0 = java.lang.Runnable.class
            java.lang.String r1 = "run"
            r2 = 0
            java.lang.reflect.Method r1 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L1a
            net.bytebuddy.implementation.MethodCall$WithoutSpecifiedTarget r1 = invoke(r1)     // Catch: java.lang.NoSuchMethodException -> L1a
            net.bytebuddy.implementation.MethodCall r3 = r1.on(r3, r0)     // Catch: java.lang.NoSuchMethodException -> L1a
            net.bytebuddy.implementation.bytecode.assign.Assigner r0 = net.bytebuddy.implementation.bytecode.assign.Assigner.DEFAULT     // Catch: java.lang.NoSuchMethodException -> L1a
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r1 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.DYNAMIC     // Catch: java.lang.NoSuchMethodException -> L1a
            net.bytebuddy.implementation.Implementation$Composable r3 = r3.withAssigner(r0, r1)     // Catch: java.lang.NoSuchMethodException -> L1a
            return r3
        L1a:
            r3 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not locate Runnable::run method"
            r0.<init>(r1, r3)
            throw r0
    }

    @Override // net.bytebuddy.implementation.Implementation.Composable
    public net.bytebuddy.implementation.Implementation.Composable andThen(net.bytebuddy.implementation.Implementation.Composable r11) {
            r10 = this;
            net.bytebuddy.implementation.Implementation$Compound$Composable r0 = new net.bytebuddy.implementation.Implementation$Compound$Composable
            net.bytebuddy.implementation.MethodCall r9 = new net.bytebuddy.implementation.MethodCall
            net.bytebuddy.implementation.MethodCall$MethodLocator$Factory r2 = r10.methodLocator
            net.bytebuddy.implementation.MethodCall$TargetHandler$Factory r3 = r10.targetHandler
            java.util.List<net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory> r4 = r10.argumentLoaders
            net.bytebuddy.implementation.MethodCall$MethodInvoker$Factory r5 = r10.methodInvoker
            net.bytebuddy.implementation.MethodCall$TerminationHandler$Simple r6 = net.bytebuddy.implementation.MethodCall.TerminationHandler.Simple.DROPPING
            net.bytebuddy.implementation.bytecode.assign.Assigner r7 = r10.assigner
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r8 = r10.typing
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.<init>(r9, r11)
            return r0
    }

    @Override // net.bytebuddy.implementation.Implementation.Composable
    public net.bytebuddy.implementation.Implementation andThen(net.bytebuddy.implementation.Implementation r11) {
            r10 = this;
            net.bytebuddy.implementation.Implementation$Compound r0 = new net.bytebuddy.implementation.Implementation$Compound
            net.bytebuddy.implementation.MethodCall r9 = new net.bytebuddy.implementation.MethodCall
            net.bytebuddy.implementation.MethodCall$MethodLocator$Factory r2 = r10.methodLocator
            net.bytebuddy.implementation.MethodCall$TargetHandler$Factory r3 = r10.targetHandler
            java.util.List<net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory> r4 = r10.argumentLoaders
            net.bytebuddy.implementation.MethodCall$MethodInvoker$Factory r5 = r10.methodInvoker
            net.bytebuddy.implementation.MethodCall$TerminationHandler$Simple r6 = net.bytebuddy.implementation.MethodCall.TerminationHandler.Simple.DROPPING
            net.bytebuddy.implementation.bytecode.assign.Assigner r7 = r10.assigner
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r8 = r10.typing
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r1 = 2
            net.bytebuddy.implementation.Implementation[] r1 = new net.bytebuddy.implementation.Implementation[r1]
            r2 = 0
            r1[r2] = r9
            r2 = 1
            r1[r2] = r11
            r0.<init>(r1)
            return r0
    }

    @Override // net.bytebuddy.implementation.Implementation
    public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r4) {
            r3 = this;
            net.bytebuddy.implementation.MethodCall$Appender r0 = new net.bytebuddy.implementation.MethodCall$Appender
            net.bytebuddy.implementation.MethodCall$TerminationHandler$Factory r1 = r3.terminationHandler
            net.bytebuddy.description.type.TypeDescription r2 = r4.getInstrumentedType()
            net.bytebuddy.implementation.MethodCall$TerminationHandler r1 = r1.make(r2)
            r0.<init>(r3, r4, r1)
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
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r2 = r4.typing
            net.bytebuddy.implementation.MethodCall r5 = (net.bytebuddy.implementation.MethodCall) r5
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r3 = r5.typing
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L20
            return r1
        L20:
            net.bytebuddy.implementation.MethodCall$MethodLocator$Factory r2 = r4.methodLocator
            net.bytebuddy.implementation.MethodCall$MethodLocator$Factory r3 = r5.methodLocator
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2b
            return r1
        L2b:
            net.bytebuddy.implementation.MethodCall$TargetHandler$Factory r2 = r4.targetHandler
            net.bytebuddy.implementation.MethodCall$TargetHandler$Factory r3 = r5.targetHandler
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L36
            return r1
        L36:
            java.util.List<net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory> r2 = r4.argumentLoaders
            java.util.List<net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory> r3 = r5.argumentLoaders
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L41
            return r1
        L41:
            net.bytebuddy.implementation.MethodCall$MethodInvoker$Factory r2 = r4.methodInvoker
            net.bytebuddy.implementation.MethodCall$MethodInvoker$Factory r3 = r5.methodInvoker
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4c
            return r1
        L4c:
            net.bytebuddy.implementation.MethodCall$TerminationHandler$Factory r2 = r4.terminationHandler
            net.bytebuddy.implementation.MethodCall$TerminationHandler$Factory r3 = r5.terminationHandler
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L57
            return r1
        L57:
            net.bytebuddy.implementation.bytecode.assign.Assigner r2 = r4.assigner
            net.bytebuddy.implementation.bytecode.assign.Assigner r5 = r5.assigner
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L62
            return r1
        L62:
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            net.bytebuddy.implementation.MethodCall$MethodLocator$Factory r1 = r2.methodLocator
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.implementation.MethodCall$TargetHandler$Factory r1 = r2.targetHandler
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List<net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory> r1 = r2.argumentLoaders
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.implementation.MethodCall$MethodInvoker$Factory r1 = r2.methodInvoker
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.implementation.MethodCall$TerminationHandler$Factory r1 = r2.terminationHandler
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.implementation.bytecode.assign.Assigner r1 = r2.assigner
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r1 = r2.typing
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
    public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r3) {
            r2 = this;
            java.util.List<net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory> r0 = r2.argumentLoaders
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L17
            java.lang.Object r1 = r0.next()
            net.bytebuddy.dynamic.scaffold.InstrumentedType$Prepareable r1 = (net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable) r1
            net.bytebuddy.dynamic.scaffold.InstrumentedType r3 = r1.prepare(r3)
            goto L6
        L17:
            net.bytebuddy.implementation.MethodCall$TargetHandler$Factory r0 = r2.targetHandler
            net.bytebuddy.dynamic.scaffold.InstrumentedType r3 = r0.prepare(r3)
            return r3
    }

    public net.bytebuddy.implementation.MethodCall.FieldSetting setsField(java.lang.reflect.Field r2) {
            r1 = this;
            net.bytebuddy.description.field.FieldDescription$ForLoadedField r0 = new net.bytebuddy.description.field.FieldDescription$ForLoadedField
            r0.<init>(r2)
            net.bytebuddy.implementation.MethodCall$FieldSetting r2 = r1.setsField(r0)
            return r2
    }

    public net.bytebuddy.implementation.MethodCall.FieldSetting setsField(net.bytebuddy.description.field.FieldDescription r11) {
            r10 = this;
            net.bytebuddy.implementation.MethodCall$FieldSetting r0 = new net.bytebuddy.implementation.MethodCall$FieldSetting
            net.bytebuddy.implementation.MethodCall r9 = new net.bytebuddy.implementation.MethodCall
            net.bytebuddy.implementation.MethodCall$MethodLocator$Factory r2 = r10.methodLocator
            net.bytebuddy.implementation.MethodCall$TargetHandler$Factory r3 = r10.targetHandler
            java.util.List<net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory> r4 = r10.argumentLoaders
            net.bytebuddy.implementation.MethodCall$MethodInvoker$Factory r5 = r10.methodInvoker
            net.bytebuddy.implementation.MethodCall$TerminationHandler$FieldSetting$Explicit r6 = new net.bytebuddy.implementation.MethodCall$TerminationHandler$FieldSetting$Explicit
            r6.<init>(r11)
            net.bytebuddy.implementation.bytecode.assign.Assigner r7 = r10.assigner
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r8 = r10.typing
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.<init>(r9)
            return r0
    }

    public net.bytebuddy.implementation.MethodCall.FieldSetting setsField(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r11) {
            r10 = this;
            net.bytebuddy.implementation.MethodCall$FieldSetting r0 = new net.bytebuddy.implementation.MethodCall$FieldSetting
            net.bytebuddy.implementation.MethodCall r9 = new net.bytebuddy.implementation.MethodCall
            net.bytebuddy.implementation.MethodCall$MethodLocator$Factory r2 = r10.methodLocator
            net.bytebuddy.implementation.MethodCall$TargetHandler$Factory r3 = r10.targetHandler
            java.util.List<net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory> r4 = r10.argumentLoaders
            net.bytebuddy.implementation.MethodCall$MethodInvoker$Factory r5 = r10.methodInvoker
            net.bytebuddy.implementation.MethodCall$TerminationHandler$FieldSetting$Implicit r6 = new net.bytebuddy.implementation.MethodCall$TerminationHandler$FieldSetting$Implicit
            r6.<init>(r11)
            net.bytebuddy.implementation.bytecode.assign.Assigner r7 = r10.assigner
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r8 = r10.typing
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.<init>(r9)
            return r0
    }

    public net.bytebuddy.implementation.MethodCall with(java.util.List<? extends net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory> r10) {
            r9 = this;
            net.bytebuddy.implementation.MethodCall r8 = new net.bytebuddy.implementation.MethodCall
            net.bytebuddy.implementation.MethodCall$MethodLocator$Factory r1 = r9.methodLocator
            net.bytebuddy.implementation.MethodCall$TargetHandler$Factory r2 = r9.targetHandler
            java.util.List<net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory> r0 = r9.argumentLoaders
            java.util.List r3 = net.bytebuddy.utility.CompoundList.of(r0, r10)
            net.bytebuddy.implementation.MethodCall$MethodInvoker$Factory r4 = r9.methodInvoker
            net.bytebuddy.implementation.MethodCall$TerminationHandler$Factory r5 = r9.terminationHandler
            net.bytebuddy.implementation.bytecode.assign.Assigner r6 = r9.assigner
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r7 = r9.typing
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public net.bytebuddy.implementation.MethodCall with(net.bytebuddy.implementation.bytecode.StackManipulation r1, java.lang.reflect.Type r2) {
            r0 = this;
            net.bytebuddy.description.type.TypeDescription$Generic r2 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r2)
            net.bytebuddy.implementation.MethodCall r1 = r0.with(r1, r2)
            return r1
    }

    public net.bytebuddy.implementation.MethodCall with(net.bytebuddy.implementation.bytecode.StackManipulation r2, net.bytebuddy.description.type.TypeDefinition r3) {
            r1 = this;
            net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForStackManipulation r0 = new net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForStackManipulation
            r0.<init>(r2, r3)
            r2 = 1
            net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory[] r2 = new net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory[r2]
            r3 = 0
            r2[r3] = r0
            net.bytebuddy.implementation.MethodCall r2 = r1.with(r2)
            return r2
    }

    public net.bytebuddy.implementation.MethodCall with(java.lang.Object... r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.length
            r0.<init>(r1)
            int r1 = r5.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L16
            r3 = r5[r2]
            net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory r3 = net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForStackManipulation.of(r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto L8
        L16:
            net.bytebuddy.implementation.MethodCall r5 = r4.with(r0)
            return r5
    }

    public net.bytebuddy.implementation.MethodCall with(net.bytebuddy.description.enumeration.EnumerationDescription... r7) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.length
            r0.<init>(r1)
            int r1 = r7.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L1f
            r3 = r7[r2]
            net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForStackManipulation r4 = new net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForStackManipulation
            net.bytebuddy.implementation.bytecode.StackManipulation r5 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forEnumeration(r3)
            net.bytebuddy.description.type.TypeDescription r3 = r3.getEnumerationType()
            r4.<init>(r5, r3)
            r0.add(r4)
            int r2 = r2 + 1
            goto L8
        L1f:
            net.bytebuddy.implementation.MethodCall r7 = r6.with(r0)
            return r7
    }

    public net.bytebuddy.implementation.MethodCall with(net.bytebuddy.description.type.TypeDescription... r7) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.length
            r0.<init>(r1)
            int r1 = r7.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L1d
            r3 = r7[r2]
            net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForStackManipulation r4 = new net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForStackManipulation
            net.bytebuddy.implementation.bytecode.StackManipulation r3 = net.bytebuddy.implementation.bytecode.constant.ClassConstant.of(r3)
            java.lang.Class<java.lang.Class> r5 = java.lang.Class.class
            r4.<init>(r3, r5)
            r0.add(r4)
            int r2 = r2 + 1
            goto L8
        L1d:
            net.bytebuddy.implementation.MethodCall r7 = r6.with(r0)
            return r7
    }

    public net.bytebuddy.implementation.MethodCall with(net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory... r1) {
            r0 = this;
            java.util.List r1 = java.util.Arrays.asList(r1)
            net.bytebuddy.implementation.MethodCall r1 = r0.with(r1)
            return r1
    }

    public net.bytebuddy.implementation.MethodCall with(net.bytebuddy.utility.ConstantValue... r7) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.length
            r0.<init>(r1)
            int r1 = r7.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L1f
            r3 = r7[r2]
            net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForStackManipulation r4 = new net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForStackManipulation
            net.bytebuddy.implementation.bytecode.StackManipulation r5 = r3.toStackManipulation()
            net.bytebuddy.description.type.TypeDescription r3 = r3.getTypeDescription()
            r4.<init>(r5, r3)
            r0.add(r4)
            int r2 = r2 + 1
            goto L8
        L1f:
            net.bytebuddy.implementation.MethodCall r7 = r6.with(r0)
            return r7
    }

    public net.bytebuddy.implementation.MethodCall with(net.bytebuddy.utility.JavaConstant... r1) {
            r0 = this;
            net.bytebuddy.utility.ConstantValue[] r1 = (net.bytebuddy.utility.ConstantValue[]) r1
            net.bytebuddy.implementation.MethodCall r1 = r0.with(r1)
            return r1
    }

    public net.bytebuddy.implementation.MethodCall withAllArguments() {
            r3 = this;
            r0 = 1
            net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory[] r0 = new net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory[r0]
            net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameter$OfInstrumentedMethod r1 = net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForMethodParameter.OfInstrumentedMethod.INSTANCE
            r2 = 0
            r0[r2] = r1
            net.bytebuddy.implementation.MethodCall r0 = r3.with(r0)
            return r0
    }

    public net.bytebuddy.implementation.MethodCall withArgument(int... r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.length
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L30
            r3 = r6[r2]
            if (r3 < 0) goto L19
            net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameter$Factory r4 = new net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameter$Factory
            r4.<init>(r3)
            r0.add(r4)
            int r2 = r2 + 1
            goto L8
        L19:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Negative index: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L30:
            net.bytebuddy.implementation.MethodCall r6 = r5.with(r0)
            return r6
    }

    public net.bytebuddy.implementation.MethodCall withArgumentArray() {
            r3 = this;
            r0 = 1
            net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory[] r0 = new net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory[r0]
            net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameterArray$ForInstrumentedMethod r1 = net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForMethodParameterArray.ForInstrumentedMethod.INSTANCE
            r2 = 0
            r0[r2] = r1
            net.bytebuddy.implementation.MethodCall r0 = r3.with(r0)
            return r0
    }

    public net.bytebuddy.implementation.MethodCall withArgumentArrayElements(int r4) {
            r3 = this;
            if (r4 < 0) goto L12
            net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameterArrayElement$OfInvokedMethod r0 = new net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameterArrayElement$OfInvokedMethod
            r0.<init>(r4)
            r4 = 1
            net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory[] r4 = new net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory[r4]
            r1 = 0
            r4[r1] = r0
            net.bytebuddy.implementation.MethodCall r4 = r3.with(r4)
            return r4
        L12:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "A parameter index cannot be negative: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public net.bytebuddy.implementation.MethodCall withArgumentArrayElements(int r2, int r3) {
            r1 = this;
            r0 = 0
            net.bytebuddy.implementation.MethodCall r2 = r1.withArgumentArrayElements(r2, r0, r3)
            return r2
    }

    public net.bytebuddy.implementation.MethodCall withArgumentArrayElements(int r5, int r6, int r7) {
            r4 = this;
            if (r5 < 0) goto L51
            if (r6 < 0) goto L3a
            if (r7 != 0) goto L7
            return r4
        L7:
            if (r7 < 0) goto L23
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
            r1 = 0
        Lf:
            if (r1 >= r7) goto L1e
            net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameterArrayElement$OfParameter r2 = new net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodParameterArrayElement$OfParameter
            int r3 = r6 + r1
            r2.<init>(r5, r3)
            r0.add(r2)
            int r1 = r1 + 1
            goto Lf
        L1e:
            net.bytebuddy.implementation.MethodCall r5 = r4.with(r0)
            return r5
        L23:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Size cannot be negative: "
            r6.append(r0)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L3a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "An array index cannot be negative: "
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
        L51:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "A parameter index cannot be negative: "
            r7.append(r0)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
    }

    public net.bytebuddy.implementation.Implementation.Composable withAssigner(net.bytebuddy.implementation.bytecode.assign.Assigner r10, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r11) {
            r9 = this;
            net.bytebuddy.implementation.MethodCall r8 = new net.bytebuddy.implementation.MethodCall
            net.bytebuddy.implementation.MethodCall$MethodLocator$Factory r1 = r9.methodLocator
            net.bytebuddy.implementation.MethodCall$TargetHandler$Factory r2 = r9.targetHandler
            java.util.List<net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory> r3 = r9.argumentLoaders
            net.bytebuddy.implementation.MethodCall$MethodInvoker$Factory r4 = r9.methodInvoker
            net.bytebuddy.implementation.MethodCall$TerminationHandler$Factory r5 = r9.terminationHandler
            r0 = r8
            r6 = r10
            r7 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public net.bytebuddy.implementation.MethodCall withField(net.bytebuddy.dynamic.scaffold.FieldLocator.Factory r6, java.lang.String... r7) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.length
            r0.<init>(r1)
            int r1 = r7.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L17
            r3 = r7[r2]
            net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForField$Factory r4 = new net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForField$Factory
            r4.<init>(r3, r6)
            r0.add(r4)
            int r2 = r2 + 1
            goto L8
        L17:
            net.bytebuddy.implementation.MethodCall r6 = r5.with(r0)
            return r6
    }

    public net.bytebuddy.implementation.MethodCall withField(java.lang.String... r2) {
            r1 = this;
            net.bytebuddy.dynamic.scaffold.FieldLocator$ForClassHierarchy$Factory r0 = net.bytebuddy.dynamic.scaffold.FieldLocator.ForClassHierarchy.Factory.INSTANCE
            net.bytebuddy.implementation.MethodCall r2 = r1.withField(r0, r2)
            return r2
    }

    public net.bytebuddy.implementation.MethodCall withMethodCall(net.bytebuddy.implementation.MethodCall r3) {
            r2 = this;
            net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodCall$Factory r0 = new net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForMethodCall$Factory
            r0.<init>(r3)
            r3 = 1
            net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory[] r3 = new net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory[r3]
            r1 = 0
            r3[r1] = r0
            net.bytebuddy.implementation.MethodCall r3 = r2.with(r3)
            return r3
    }

    public net.bytebuddy.implementation.MethodCall withOwnType() {
            r3 = this;
            r0 = 1
            net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory[] r0 = new net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory[r0]
            net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForInstrumentedType$Factory r1 = net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForInstrumentedType.Factory.INSTANCE
            r2 = 0
            r0[r2] = r1
            net.bytebuddy.implementation.MethodCall r0 = r3.with(r0)
            return r0
    }

    public net.bytebuddy.implementation.MethodCall withReference(java.lang.Object... r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.length
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L1d
            r3 = r6[r2]
            if (r3 != 0) goto L11
            net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForNullConstant r3 = net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForNullConstant.INSTANCE
            goto L17
        L11:
            net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForInstance$Factory r4 = new net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForInstance$Factory
            r4.<init>(r3)
            r3 = r4
        L17:
            r0.add(r3)
            int r2 = r2 + 1
            goto L8
        L1d:
            net.bytebuddy.implementation.MethodCall r6 = r5.with(r0)
            return r6
    }

    public net.bytebuddy.implementation.MethodCall withThis() {
            r3 = this;
            r0 = 1
            net.bytebuddy.implementation.MethodCall$ArgumentLoader$Factory[] r0 = new net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory[r0]
            net.bytebuddy.implementation.MethodCall$ArgumentLoader$ForThisReference$Factory r1 = net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForThisReference.Factory.INSTANCE
            r2 = 0
            r0[r2] = r1
            net.bytebuddy.implementation.MethodCall r0 = r3.with(r0)
            return r0
    }
}
