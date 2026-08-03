package net.bytebuddy.implementation;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class ExceptionMethod implements net.bytebuddy.implementation.Implementation, net.bytebuddy.implementation.bytecode.ByteCodeAppender {
    private final net.bytebuddy.implementation.ExceptionMethod.ConstructionDelegate constructionDelegate;

    public interface ConstructionDelegate {

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForDefaultConstructor implements net.bytebuddy.implementation.ExceptionMethod.ConstructionDelegate {
            private final net.bytebuddy.description.method.MethodDescription targetConstructor;
            private final net.bytebuddy.description.type.TypeDescription throwableType;

            public ForDefaultConstructor(net.bytebuddy.description.type.TypeDescription r3) {
                    r2 = this;
                    r2.<init>()
                    r2.throwableType = r3
                    net.bytebuddy.description.method.MethodList r3 = r3.getDeclaredMethods()
                    net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isConstructor()
                    r1 = 0
                    net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.takesArguments(r1)
                    net.bytebuddy.matcher.ElementMatcher$Junction r0 = r0.and(r1)
                    net.bytebuddy.matcher.FilterableList r3 = r3.filter(r0)
                    net.bytebuddy.description.method.MethodList r3 = (net.bytebuddy.description.method.MethodList) r3
                    java.lang.Object r3 = r3.getOnly()
                    net.bytebuddy.description.method.MethodDescription r3 = (net.bytebuddy.description.method.MethodDescription) r3
                    r2.targetConstructor = r3
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
                    net.bytebuddy.description.type.TypeDescription r2 = r4.throwableType
                    net.bytebuddy.implementation.ExceptionMethod$ConstructionDelegate$ForDefaultConstructor r5 = (net.bytebuddy.implementation.ExceptionMethod.ConstructionDelegate.ForDefaultConstructor) r5
                    net.bytebuddy.description.type.TypeDescription r3 = r5.throwableType
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.description.method.MethodDescription r2 = r4.targetConstructor
                    net.bytebuddy.description.method.MethodDescription r5 = r5.targetConstructor
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
                    net.bytebuddy.description.type.TypeDescription r1 = r2.throwableType
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.description.method.MethodDescription r1 = r2.targetConstructor
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.ExceptionMethod.ConstructionDelegate
            public net.bytebuddy.implementation.bytecode.StackManipulation make() {
                    r5 = this;
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    net.bytebuddy.description.type.TypeDescription r1 = r5.throwableType
                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = net.bytebuddy.implementation.bytecode.TypeCreation.of(r1)
                    net.bytebuddy.description.method.MethodDescription r2 = r5.targetConstructor
                    net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r2 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r2)
                    r3 = 3
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r3 = new net.bytebuddy.implementation.bytecode.StackManipulation[r3]
                    r4 = 0
                    r3[r4] = r1
                    net.bytebuddy.implementation.bytecode.Duplication r1 = net.bytebuddy.implementation.bytecode.Duplication.SINGLE
                    r4 = 1
                    r3[r4] = r1
                    r1 = 2
                    r3[r1] = r2
                    r0.<init>(r3)
                    return r0
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForStringConstructor implements net.bytebuddy.implementation.ExceptionMethod.ConstructionDelegate {
            private final java.lang.String message;
            private final net.bytebuddy.description.method.MethodDescription targetConstructor;
            private final net.bytebuddy.description.type.TypeDescription throwableType;

            public ForStringConstructor(net.bytebuddy.description.type.TypeDescription r3, java.lang.String r4) {
                    r2 = this;
                    r2.<init>()
                    r2.throwableType = r3
                    net.bytebuddy.description.method.MethodList r3 = r3.getDeclaredMethods()
                    net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isConstructor()
                    java.lang.Class<java.lang.String> r1 = java.lang.String.class
                    java.lang.Class[] r1 = new java.lang.Class[]{r1}
                    net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.takesArguments(r1)
                    net.bytebuddy.matcher.ElementMatcher$Junction r0 = r0.and(r1)
                    net.bytebuddy.matcher.FilterableList r3 = r3.filter(r0)
                    net.bytebuddy.description.method.MethodList r3 = (net.bytebuddy.description.method.MethodList) r3
                    java.lang.Object r3 = r3.getOnly()
                    net.bytebuddy.description.method.MethodDescription r3 = (net.bytebuddy.description.method.MethodDescription) r3
                    r2.targetConstructor = r3
                    r2.message = r4
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
                    java.lang.String r2 = r4.message
                    net.bytebuddy.implementation.ExceptionMethod$ConstructionDelegate$ForStringConstructor r5 = (net.bytebuddy.implementation.ExceptionMethod.ConstructionDelegate.ForStringConstructor) r5
                    java.lang.String r3 = r5.message
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.description.type.TypeDescription r2 = r4.throwableType
                    net.bytebuddy.description.type.TypeDescription r3 = r5.throwableType
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L2b
                    return r1
                L2b:
                    net.bytebuddy.description.method.MethodDescription r2 = r4.targetConstructor
                    net.bytebuddy.description.method.MethodDescription r5 = r5.targetConstructor
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
                    net.bytebuddy.description.type.TypeDescription r1 = r2.throwableType
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.description.method.MethodDescription r1 = r2.targetConstructor
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    java.lang.String r1 = r2.message
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.ExceptionMethod.ConstructionDelegate
            public net.bytebuddy.implementation.bytecode.StackManipulation make() {
                    r6 = this;
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    net.bytebuddy.description.type.TypeDescription r1 = r6.throwableType
                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = net.bytebuddy.implementation.bytecode.TypeCreation.of(r1)
                    net.bytebuddy.implementation.bytecode.constant.TextConstant r2 = new net.bytebuddy.implementation.bytecode.constant.TextConstant
                    java.lang.String r3 = r6.message
                    r2.<init>(r3)
                    net.bytebuddy.description.method.MethodDescription r3 = r6.targetConstructor
                    net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r3 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r3)
                    r4 = 4
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r4 = new net.bytebuddy.implementation.bytecode.StackManipulation[r4]
                    r5 = 0
                    r4[r5] = r1
                    net.bytebuddy.implementation.bytecode.Duplication r1 = net.bytebuddy.implementation.bytecode.Duplication.SINGLE
                    r5 = 1
                    r4[r5] = r1
                    r1 = 2
                    r4[r1] = r2
                    r1 = 3
                    r4[r1] = r3
                    r0.<init>(r4)
                    return r0
            }
        }

        net.bytebuddy.implementation.bytecode.StackManipulation make();
    }

    public ExceptionMethod(net.bytebuddy.implementation.ExceptionMethod.ConstructionDelegate r1) {
            r0 = this;
            r0.<init>()
            r0.constructionDelegate = r1
            return
    }

    public static net.bytebuddy.implementation.Implementation throwing(java.lang.Class<? extends java.lang.Throwable> r0) {
            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
            net.bytebuddy.implementation.Implementation r0 = throwing(r0)
            return r0
    }

    public static net.bytebuddy.implementation.Implementation throwing(java.lang.Class<? extends java.lang.Throwable> r0, java.lang.String r1) {
            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
            net.bytebuddy.implementation.Implementation r0 = throwing(r0, r1)
            return r0
    }

    public static net.bytebuddy.implementation.Implementation throwing(net.bytebuddy.description.type.TypeDescription r2) {
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            boolean r0 = r2.isAssignableTo(r0)
            if (r0 == 0) goto L13
            net.bytebuddy.implementation.ExceptionMethod r0 = new net.bytebuddy.implementation.ExceptionMethod
            net.bytebuddy.implementation.ExceptionMethod$ConstructionDelegate$ForDefaultConstructor r1 = new net.bytebuddy.implementation.ExceptionMethod$ConstructionDelegate$ForDefaultConstructor
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
        L13:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = " does not extend throwable"
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    public static net.bytebuddy.implementation.Implementation throwing(net.bytebuddy.description.type.TypeDescription r2, java.lang.String r3) {
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            boolean r0 = r2.isAssignableTo(r0)
            if (r0 == 0) goto L13
            net.bytebuddy.implementation.ExceptionMethod r0 = new net.bytebuddy.implementation.ExceptionMethod
            net.bytebuddy.implementation.ExceptionMethod$ConstructionDelegate$ForStringConstructor r1 = new net.bytebuddy.implementation.ExceptionMethod$ConstructionDelegate$ForStringConstructor
            r1.<init>(r2, r3)
            r0.<init>(r1)
            return r0
        L13:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = " does not extend throwable"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    @Override // net.bytebuddy.implementation.Implementation
    public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r1) {
            r0 = this;
            return r0
    }

    @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
    public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r5, net.bytebuddy.implementation.Implementation.Context r6, net.bytebuddy.description.method.MethodDescription r7) {
            r4 = this;
            net.bytebuddy.implementation.bytecode.StackManipulation$Compound r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
            net.bytebuddy.implementation.ExceptionMethod$ConstructionDelegate r1 = r4.constructionDelegate
            net.bytebuddy.implementation.bytecode.StackManipulation r1 = r1.make()
            r2 = 2
            net.bytebuddy.implementation.bytecode.StackManipulation[] r2 = new net.bytebuddy.implementation.bytecode.StackManipulation[r2]
            r3 = 0
            r2[r3] = r1
            net.bytebuddy.implementation.bytecode.Throw r1 = net.bytebuddy.implementation.bytecode.Throw.INSTANCE
            r3 = 1
            r2[r3] = r1
            r0.<init>(r2)
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r5 = r0.apply(r5, r6)
            net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r6 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
            int r5 = r5.getMaximalSize()
            int r7 = r7.getStackSize()
            r6.<init>(r5, r7)
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
            net.bytebuddy.implementation.ExceptionMethod$ConstructionDelegate r2 = r4.constructionDelegate
            net.bytebuddy.implementation.ExceptionMethod r5 = (net.bytebuddy.implementation.ExceptionMethod) r5
            net.bytebuddy.implementation.ExceptionMethod$ConstructionDelegate r5 = r5.constructionDelegate
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
            net.bytebuddy.implementation.ExceptionMethod$ConstructionDelegate r1 = r2.constructionDelegate
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
