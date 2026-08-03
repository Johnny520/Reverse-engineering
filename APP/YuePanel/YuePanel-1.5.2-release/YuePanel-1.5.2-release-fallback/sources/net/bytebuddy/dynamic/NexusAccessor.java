package net.bytebuddy.dynamic;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class NexusAccessor {
    private static final boolean ACCESS_CONTROLLER = false;
    private static final net.bytebuddy.dynamic.NexusAccessor.Dispatcher DISPATCHER = null;

    @net.bytebuddy.utility.nullability.MaybeNull
    @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
    private final java.lang.ref.ReferenceQueue<? super java.lang.ClassLoader> referenceQueue;

    public interface Dispatcher {

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Available implements net.bytebuddy.dynamic.NexusAccessor.Dispatcher {
            private final java.lang.reflect.Method clean;
            private final java.lang.reflect.Method register;

            public Available(java.lang.reflect.Method r1, java.lang.reflect.Method r2) {
                    r0 = this;
                    r0.<init>()
                    r0.register = r1
                    r0.clean = r2
                    return
            }

            @Override // net.bytebuddy.dynamic.NexusAccessor.Dispatcher
            public void clean(java.lang.ref.Reference<? extends java.lang.ClassLoader> r3) {
                    r2 = this;
                    java.lang.reflect.Method r0 = r2.clean     // Catch: java.lang.reflect.InvocationTargetException -> Lb java.lang.IllegalAccessException -> Ld
                    java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.reflect.InvocationTargetException -> Lb java.lang.IllegalAccessException -> Ld
                    r1 = 0
                    r0.invoke(r1, r3)     // Catch: java.lang.reflect.InvocationTargetException -> Lb java.lang.IllegalAccessException -> Ld
                    return
                Lb:
                    r3 = move-exception
                    goto Lf
                Ld:
                    r3 = move-exception
                    goto L19
                Lf:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.Throwable r3 = r3.getTargetException()
                    r0.<init>(r3)
                    throw r0
                L19:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    r0.<init>(r3)
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
                    java.lang.reflect.Method r2 = r4.register
                    net.bytebuddy.dynamic.NexusAccessor$Dispatcher$Available r5 = (net.bytebuddy.dynamic.NexusAccessor.Dispatcher.Available) r5
                    java.lang.reflect.Method r3 = r5.register
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    java.lang.reflect.Method r2 = r4.clean
                    java.lang.reflect.Method r5 = r5.clean
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
                    java.lang.reflect.Method r1 = r2.register
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    java.lang.reflect.Method r1 = r2.clean
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.dynamic.NexusAccessor.Dispatcher
            public boolean isAlive() {
                    r1 = this;
                    r0 = 1
                    return r0
            }

            @Override // net.bytebuddy.dynamic.NexusAccessor.Dispatcher
            public void register(java.lang.String r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r3, @net.bytebuddy.utility.nullability.MaybeNull java.lang.ref.ReferenceQueue<? super java.lang.ClassLoader> r4, int r5, net.bytebuddy.implementation.LoadedTypeInitializer r6) {
                    r1 = this;
                    java.lang.reflect.Method r0 = r1.register     // Catch: java.lang.reflect.InvocationTargetException -> Lf java.lang.IllegalAccessException -> L11
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.reflect.InvocationTargetException -> Lf java.lang.IllegalAccessException -> L11
                    java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4, r5, r6}     // Catch: java.lang.reflect.InvocationTargetException -> Lf java.lang.IllegalAccessException -> L11
                    r3 = 0
                    r0.invoke(r3, r2)     // Catch: java.lang.reflect.InvocationTargetException -> Lf java.lang.IllegalAccessException -> L11
                    return
                Lf:
                    r2 = move-exception
                    goto L13
                L11:
                    r2 = move-exception
                    goto L1d
                L13:
                    java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                    java.lang.Throwable r2 = r2.getTargetException()
                    r3.<init>(r2)
                    throw r3
                L1d:
                    java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                    r3.<init>(r2)
                    throw r3
            }
        }

        public enum CreationAction extends java.lang.Enum<net.bytebuddy.dynamic.NexusAccessor.Dispatcher.CreationAction> implements java.security.PrivilegedAction<net.bytebuddy.dynamic.NexusAccessor.Dispatcher> {
            private static final /* synthetic */ net.bytebuddy.dynamic.NexusAccessor.Dispatcher.CreationAction[] $VALUES = null;
            public static final net.bytebuddy.dynamic.NexusAccessor.Dispatcher.CreationAction INSTANCE = null;

            static {
                    net.bytebuddy.dynamic.NexusAccessor$Dispatcher$CreationAction r0 = new net.bytebuddy.dynamic.NexusAccessor$Dispatcher$CreationAction
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.dynamic.NexusAccessor.Dispatcher.CreationAction.INSTANCE = r0
                    net.bytebuddy.dynamic.NexusAccessor$Dispatcher$CreationAction[] r0 = new net.bytebuddy.dynamic.NexusAccessor.Dispatcher.CreationAction[]{r0}
                    net.bytebuddy.dynamic.NexusAccessor.Dispatcher.CreationAction.$VALUES = r0
                    return
            }

            CreationAction(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.dynamic.NexusAccessor.Dispatcher.CreationAction valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.dynamic.NexusAccessor$Dispatcher$CreationAction> r0 = net.bytebuddy.dynamic.NexusAccessor.Dispatcher.CreationAction.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.dynamic.NexusAccessor$Dispatcher$CreationAction r1 = (net.bytebuddy.dynamic.NexusAccessor.Dispatcher.CreationAction) r1
                    return r1
            }

            public static net.bytebuddy.dynamic.NexusAccessor.Dispatcher.CreationAction[] values() {
                    net.bytebuddy.dynamic.NexusAccessor$Dispatcher$CreationAction[] r0 = net.bytebuddy.dynamic.NexusAccessor.Dispatcher.CreationAction.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.dynamic.NexusAccessor$Dispatcher$CreationAction[] r0 = (net.bytebuddy.dynamic.NexusAccessor.Dispatcher.CreationAction[]) r0
                    return r0
            }

            @Override // java.security.PrivilegedAction
            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
            public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.NexusAccessor.Dispatcher run() {
                    r1 = this;
                    net.bytebuddy.dynamic.NexusAccessor$Dispatcher r0 = r1.run2()
                    return r0
            }

            @Override // java.security.PrivilegedAction
            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
            /* JADX INFO: renamed from: run, reason: avoid collision after fix types in other method */
            public net.bytebuddy.dynamic.NexusAccessor.Dispatcher run2() {
                    r13 = this;
                    java.lang.Class<java.lang.ref.Reference> r0 = java.lang.ref.Reference.class
                    java.lang.String r1 = "clean"
                    java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
                    java.lang.Class<java.lang.ref.ReferenceQueue> r3 = java.lang.ref.ReferenceQueue.class
                    java.lang.Class<java.lang.ClassLoader> r4 = java.lang.ClassLoader.class
                    java.lang.Class<java.lang.String> r5 = java.lang.String.class
                    java.lang.String r6 = "register"
                    java.lang.Class<net.bytebuddy.dynamic.Nexus> r7 = net.bytebuddy.dynamic.Nexus.class
                    java.lang.String r8 = "net.bytebuddy.nexus.disabled"
                    boolean r8 = java.lang.Boolean.getBoolean(r8)
                    if (r8 == 0) goto L20
                    net.bytebuddy.dynamic.NexusAccessor$Dispatcher$Unavailable r0 = new net.bytebuddy.dynamic.NexusAccessor$Dispatcher$Unavailable
                    java.lang.String r1 = "Nexus injection was explicitly disabled"
                    r0.<init>(r1)
                    return r0
                L20:
                    net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection r8 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection     // Catch: java.lang.Exception -> L5d
                    java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Exception -> L5d
                    java.security.ProtectionDomain r10 = net.bytebuddy.dynamic.loading.ClassLoadingStrategy.NO_PROTECTION_DOMAIN     // Catch: java.lang.Exception -> L5d
                    r8.<init>(r9, r10)     // Catch: java.lang.Exception -> L5d
                    net.bytebuddy.description.type.TypeDescription r9 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r7)     // Catch: java.lang.Exception -> L5d
                    byte[] r10 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.read(r7)     // Catch: java.lang.Exception -> L5d
                    java.util.Map r9 = java.util.Collections.singletonMap(r9, r10)     // Catch: java.lang.Exception -> L5d
                    java.util.Map r8 = r8.inject(r9)     // Catch: java.lang.Exception -> L5d
                    net.bytebuddy.description.type.TypeDescription r9 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r7)     // Catch: java.lang.Exception -> L5d
                    java.lang.Object r8 = r8.get(r9)     // Catch: java.lang.Exception -> L5d
                    java.lang.Class r8 = (java.lang.Class) r8     // Catch: java.lang.Exception -> L5d
                    net.bytebuddy.dynamic.NexusAccessor$Dispatcher$Available r9 = new net.bytebuddy.dynamic.NexusAccessor$Dispatcher$Available     // Catch: java.lang.Exception -> L5d
                    java.lang.Class r10 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L5d
                    java.lang.Class[] r10 = new java.lang.Class[]{r5, r4, r3, r10, r2}     // Catch: java.lang.Exception -> L5d
                    java.lang.reflect.Method r10 = r8.getMethod(r6, r10)     // Catch: java.lang.Exception -> L5d
                    java.lang.Class[] r11 = new java.lang.Class[]{r0}     // Catch: java.lang.Exception -> L5d
                    java.lang.reflect.Method r8 = r8.getMethod(r1, r11)     // Catch: java.lang.Exception -> L5d
                    r9.<init>(r10, r8)     // Catch: java.lang.Exception -> L5d
                    return r9
                L5d:
                    r8 = move-exception
                    java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Exception -> Lc0
                    java.lang.String r7 = r7.getName()     // Catch: java.lang.Exception -> Lc0
                    java.lang.Class r7 = r9.loadClass(r7)     // Catch: java.lang.Exception -> Lc0
                    java.lang.Class<net.bytebuddy.dynamic.NexusAccessor> r8 = net.bytebuddy.dynamic.NexusAccessor.class
                    net.bytebuddy.utility.JavaModule r8 = net.bytebuddy.utility.JavaModule.ofType(r8)     // Catch: java.lang.Exception -> L9c
                    net.bytebuddy.utility.JavaModule r9 = net.bytebuddy.utility.JavaModule.ofType(r7)     // Catch: java.lang.Exception -> L9c
                    if (r8 == 0) goto L9e
                    boolean r10 = r8.canRead(r9)     // Catch: java.lang.Exception -> L9c
                    if (r10 != 0) goto L9e
                    java.lang.String r10 = "java.lang.Module"
                    java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch: java.lang.Exception -> L9c
                    java.lang.String r11 = "addReads"
                    java.lang.Class[] r12 = new java.lang.Class[]{r10}     // Catch: java.lang.Exception -> L9c
                    java.lang.reflect.Method r10 = r10.getMethod(r11, r12)     // Catch: java.lang.Exception -> L9c
                    java.lang.Object r8 = r8.unwrap()     // Catch: java.lang.Exception -> L9c
                    java.lang.Object r9 = r9.unwrap()     // Catch: java.lang.Exception -> L9c
                    java.lang.Object[] r9 = new java.lang.Object[]{r9}     // Catch: java.lang.Exception -> L9c
                    r10.invoke(r8, r9)     // Catch: java.lang.Exception -> L9c
                    goto L9e
                L9c:
                    r0 = move-exception
                    goto Lb6
                L9e:
                    net.bytebuddy.dynamic.NexusAccessor$Dispatcher$Available r8 = new net.bytebuddy.dynamic.NexusAccessor$Dispatcher$Available     // Catch: java.lang.Exception -> L9c
                    java.lang.Class r9 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L9c
                    java.lang.Class[] r2 = new java.lang.Class[]{r5, r4, r3, r9, r2}     // Catch: java.lang.Exception -> L9c
                    java.lang.reflect.Method r2 = r7.getMethod(r6, r2)     // Catch: java.lang.Exception -> L9c
                    java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch: java.lang.Exception -> L9c
                    java.lang.reflect.Method r0 = r7.getMethod(r1, r0)     // Catch: java.lang.Exception -> L9c
                    r8.<init>(r2, r0)     // Catch: java.lang.Exception -> L9c
                    return r8
                Lb6:
                    net.bytebuddy.dynamic.NexusAccessor$Dispatcher$Unavailable r1 = new net.bytebuddy.dynamic.NexusAccessor$Dispatcher$Unavailable
                    java.lang.String r0 = r0.toString()
                    r1.<init>(r0)
                    return r1
                Lc0:
                    net.bytebuddy.dynamic.NexusAccessor$Dispatcher$Unavailable r0 = new net.bytebuddy.dynamic.NexusAccessor$Dispatcher$Unavailable
                    java.lang.String r1 = r8.toString()
                    r0.<init>(r1)
                    return r0
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Unavailable implements net.bytebuddy.dynamic.NexusAccessor.Dispatcher {
            private final java.lang.String message;

            public Unavailable(java.lang.String r1) {
                    r0 = this;
                    r0.<init>()
                    r0.message = r1
                    return
            }

            @Override // net.bytebuddy.dynamic.NexusAccessor.Dispatcher
            public void clean(java.lang.ref.Reference<? extends java.lang.ClassLoader> r3) {
                    r2 = this;
                    java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "Could not initialize Nexus accessor: "
                    r0.append(r1)
                    java.lang.String r1 = r2.message
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
                    java.lang.String r2 = r4.message
                    net.bytebuddy.dynamic.NexusAccessor$Dispatcher$Unavailable r5 = (net.bytebuddy.dynamic.NexusAccessor.Dispatcher.Unavailable) r5
                    java.lang.String r5 = r5.message
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
                    java.lang.String r1 = r2.message
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.dynamic.NexusAccessor.Dispatcher
            public boolean isAlive() {
                    r1 = this;
                    r0 = 0
                    return r0
            }

            @Override // net.bytebuddy.dynamic.NexusAccessor.Dispatcher
            public void register(java.lang.String r1, @net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.ref.ReferenceQueue<? super java.lang.ClassLoader> r3, int r4, net.bytebuddy.implementation.LoadedTypeInitializer r5) {
                    r0 = this;
                    java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "Could not initialize Nexus accessor: "
                    r2.append(r3)
                    java.lang.String r3 = r0.message
                    r2.append(r3)
                    java.lang.String r2 = r2.toString()
                    r1.<init>(r2)
                    throw r1
            }
        }

        void clean(java.lang.ref.Reference<? extends java.lang.ClassLoader> r1);

        boolean isAlive();

        void register(java.lang.String r1, @net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.ref.ReferenceQueue<? super java.lang.ClassLoader> r3, int r4, net.bytebuddy.implementation.LoadedTypeInitializer r5);
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class InitializationAppender implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
        private final int identification;

        public InitializationAppender(int r1) {
                r0 = this;
                r0.<init>()
                r0.identification = r1
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r18, net.bytebuddy.implementation.Implementation.Context r19, net.bytebuddy.description.method.MethodDescription r20) {
                r17 = this;
                r0 = 2
                r2 = 0
                java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                java.lang.Class<java.lang.ClassLoader> r5 = java.lang.ClassLoader.class
                java.lang.Class<java.lang.Class> r6 = java.lang.Class.class
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Simple r7 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Simple     // Catch: java.lang.NoSuchMethodException -> L128
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r8 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound     // Catch: java.lang.NoSuchMethodException -> L128
                net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r9 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod     // Catch: java.lang.NoSuchMethodException -> L128
                java.lang.String r10 = "getSystemClassLoader"
                r11 = 0
                java.lang.reflect.Method r10 = r5.getMethod(r10, r11)     // Catch: java.lang.NoSuchMethodException -> L128
                r9.<init>(r10)     // Catch: java.lang.NoSuchMethodException -> L128
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r9 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r9)     // Catch: java.lang.NoSuchMethodException -> L128
                net.bytebuddy.implementation.bytecode.constant.TextConstant r10 = new net.bytebuddy.implementation.bytecode.constant.TextConstant     // Catch: java.lang.NoSuchMethodException -> L128
                java.lang.Class<net.bytebuddy.dynamic.Nexus> r11 = net.bytebuddy.dynamic.Nexus.class
                java.lang.String r11 = r11.getName()     // Catch: java.lang.NoSuchMethodException -> L128
                r10.<init>(r11)     // Catch: java.lang.NoSuchMethodException -> L128
                net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r11 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod     // Catch: java.lang.NoSuchMethodException -> L128
                java.lang.String r12 = "loadClass"
                java.lang.Class[] r13 = new java.lang.Class[]{r4}     // Catch: java.lang.NoSuchMethodException -> L128
                java.lang.reflect.Method r5 = r5.getMethod(r12, r13)     // Catch: java.lang.NoSuchMethodException -> L128
                r11.<init>(r5)     // Catch: java.lang.NoSuchMethodException -> L128
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r5 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r11)     // Catch: java.lang.NoSuchMethodException -> L128
                net.bytebuddy.implementation.bytecode.constant.TextConstant r11 = new net.bytebuddy.implementation.bytecode.constant.TextConstant     // Catch: java.lang.NoSuchMethodException -> L128
                java.lang.String r12 = "initialize"
                r11.<init>(r12)     // Catch: java.lang.NoSuchMethodException -> L128
                net.bytebuddy.description.type.TypeDescription$Generic r12 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r6)     // Catch: java.lang.NoSuchMethodException -> L128
                net.bytebuddy.implementation.bytecode.collection.ArrayFactory r12 = net.bytebuddy.implementation.bytecode.collection.ArrayFactory.forType(r12)     // Catch: java.lang.NoSuchMethodException -> L128
                net.bytebuddy.description.type.TypeDescription r13 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)     // Catch: java.lang.NoSuchMethodException -> L128
                net.bytebuddy.implementation.bytecode.StackManipulation r13 = net.bytebuddy.implementation.bytecode.constant.ClassConstant.of(r13)     // Catch: java.lang.NoSuchMethodException -> L128
                java.lang.Class r14 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L128
                net.bytebuddy.description.type.TypeDescription r15 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r14)     // Catch: java.lang.NoSuchMethodException -> L128
                net.bytebuddy.implementation.bytecode.StackManipulation r15 = net.bytebuddy.implementation.bytecode.constant.ClassConstant.of(r15)     // Catch: java.lang.NoSuchMethodException -> L128
                net.bytebuddy.implementation.bytecode.StackManipulation[] r1 = new net.bytebuddy.implementation.bytecode.StackManipulation[r0]     // Catch: java.lang.NoSuchMethodException -> L128
                r1[r2] = r13     // Catch: java.lang.NoSuchMethodException -> L128
                r13 = 1
                r1[r13] = r15     // Catch: java.lang.NoSuchMethodException -> L128
                java.util.List r1 = java.util.Arrays.asList(r1)     // Catch: java.lang.NoSuchMethodException -> L128
                net.bytebuddy.implementation.bytecode.StackManipulation r1 = r12.withValues(r1)     // Catch: java.lang.NoSuchMethodException -> L128
                net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r12 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod     // Catch: java.lang.NoSuchMethodException -> L128
                java.lang.String r13 = "getMethod"
                java.lang.Class<java.lang.Class[]> r15 = java.lang.Class[].class
                java.lang.Class[] r4 = new java.lang.Class[]{r4, r15}     // Catch: java.lang.NoSuchMethodException -> L128
                java.lang.reflect.Method r4 = r6.getMethod(r13, r4)     // Catch: java.lang.NoSuchMethodException -> L128
                r12.<init>(r4)     // Catch: java.lang.NoSuchMethodException -> L128
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r4 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r12)     // Catch: java.lang.NoSuchMethodException -> L128
                net.bytebuddy.description.type.TypeDescription$Generic r6 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r3)     // Catch: java.lang.NoSuchMethodException -> L128
                net.bytebuddy.implementation.bytecode.collection.ArrayFactory r6 = net.bytebuddy.implementation.bytecode.collection.ArrayFactory.forType(r6)     // Catch: java.lang.NoSuchMethodException -> L128
                net.bytebuddy.description.type.TypeDefinition r12 = r20.getDeclaringType()     // Catch: java.lang.NoSuchMethodException -> L128
                net.bytebuddy.description.type.TypeDescription r12 = r12.asErasure()     // Catch: java.lang.NoSuchMethodException -> L128
                net.bytebuddy.implementation.bytecode.StackManipulation r12 = net.bytebuddy.implementation.bytecode.constant.ClassConstant.of(r12)     // Catch: java.lang.NoSuchMethodException -> L128
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r13 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound     // Catch: java.lang.NoSuchMethodException -> L128
                r15 = r17
                int r2 = r15.identification     // Catch: java.lang.NoSuchMethodException -> L128
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.forValue(r2)     // Catch: java.lang.NoSuchMethodException -> L128
                net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod     // Catch: java.lang.NoSuchMethodException -> L128
                java.lang.Class<java.lang.Integer> r15 = java.lang.Integer.class
                r16 = r7
                java.lang.String r7 = "valueOf"
                java.lang.Class[] r14 = new java.lang.Class[]{r14}     // Catch: java.lang.NoSuchMethodException -> L128
                java.lang.reflect.Method r7 = r15.getMethod(r7, r14)     // Catch: java.lang.NoSuchMethodException -> L128
                r0.<init>(r7)     // Catch: java.lang.NoSuchMethodException -> L128
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r0 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r0)     // Catch: java.lang.NoSuchMethodException -> L128
                r7 = 2
                net.bytebuddy.implementation.bytecode.StackManipulation[] r14 = new net.bytebuddy.implementation.bytecode.StackManipulation[r7]     // Catch: java.lang.NoSuchMethodException -> L128
                r15 = 0
                r14[r15] = r2     // Catch: java.lang.NoSuchMethodException -> L128
                r2 = 1
                r14[r2] = r0     // Catch: java.lang.NoSuchMethodException -> L128
                r13.<init>(r14)     // Catch: java.lang.NoSuchMethodException -> L128
                net.bytebuddy.implementation.bytecode.StackManipulation[] r0 = new net.bytebuddy.implementation.bytecode.StackManipulation[r7]     // Catch: java.lang.NoSuchMethodException -> L128
                r0[r15] = r12     // Catch: java.lang.NoSuchMethodException -> L128
                r0[r2] = r13     // Catch: java.lang.NoSuchMethodException -> L128
                java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: java.lang.NoSuchMethodException -> L128
                net.bytebuddy.implementation.bytecode.StackManipulation r0 = r6.withValues(r0)     // Catch: java.lang.NoSuchMethodException -> L128
                net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r2 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod     // Catch: java.lang.NoSuchMethodException -> L128
                java.lang.Class<java.lang.reflect.Method> r6 = java.lang.reflect.Method.class
                java.lang.String r7 = "invoke"
                java.lang.Class<java.lang.Object[]> r12 = java.lang.Object[].class
                java.lang.Class[] r3 = new java.lang.Class[]{r3, r12}     // Catch: java.lang.NoSuchMethodException -> L128
                java.lang.reflect.Method r3 = r6.getMethod(r7, r3)     // Catch: java.lang.NoSuchMethodException -> L128
                r2.<init>(r3)     // Catch: java.lang.NoSuchMethodException -> L128
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r2 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r2)     // Catch: java.lang.NoSuchMethodException -> L128
                r3 = 10
                net.bytebuddy.implementation.bytecode.StackManipulation[] r3 = new net.bytebuddy.implementation.bytecode.StackManipulation[r3]     // Catch: java.lang.NoSuchMethodException -> L128
                r6 = 0
                r3[r6] = r9     // Catch: java.lang.NoSuchMethodException -> L128
                r6 = 1
                r3[r6] = r10     // Catch: java.lang.NoSuchMethodException -> L128
                r6 = 2
                r3[r6] = r5     // Catch: java.lang.NoSuchMethodException -> L128
                r5 = 3
                r3[r5] = r11     // Catch: java.lang.NoSuchMethodException -> L128
                r5 = 4
                r3[r5] = r1     // Catch: java.lang.NoSuchMethodException -> L128
                r1 = 5
                r3[r1] = r4     // Catch: java.lang.NoSuchMethodException -> L128
                net.bytebuddy.implementation.bytecode.constant.NullConstant r1 = net.bytebuddy.implementation.bytecode.constant.NullConstant.INSTANCE     // Catch: java.lang.NoSuchMethodException -> L128
                r4 = 6
                r3[r4] = r1     // Catch: java.lang.NoSuchMethodException -> L128
                r1 = 7
                r3[r1] = r0     // Catch: java.lang.NoSuchMethodException -> L128
                r0 = 8
                r3[r0] = r2     // Catch: java.lang.NoSuchMethodException -> L128
                net.bytebuddy.implementation.bytecode.Removal r0 = net.bytebuddy.implementation.bytecode.Removal.SINGLE     // Catch: java.lang.NoSuchMethodException -> L128
                r1 = 9
                r3[r1] = r0     // Catch: java.lang.NoSuchMethodException -> L128
                r8.<init>(r3)     // Catch: java.lang.NoSuchMethodException -> L128
                r0 = 1
                net.bytebuddy.implementation.bytecode.StackManipulation[] r0 = new net.bytebuddy.implementation.bytecode.StackManipulation[r0]     // Catch: java.lang.NoSuchMethodException -> L128
                r1 = 0
                r0[r1] = r8     // Catch: java.lang.NoSuchMethodException -> L128
                r1 = r16
                r1.<init>(r0)     // Catch: java.lang.NoSuchMethodException -> L128
                r0 = r18
                r2 = r19
                r3 = r20
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r0 = r1.apply(r0, r2, r3)     // Catch: java.lang.NoSuchMethodException -> L128
                return r0
            L128:
                r0 = move-exception
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Cannot locate method"
                r1.<init>(r2, r0)
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
                int r2 = r4.identification
                net.bytebuddy.dynamic.NexusAccessor$InitializationAppender r5 = (net.bytebuddy.dynamic.NexusAccessor.InitializationAppender) r5
                int r5 = r5.identification
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
                int r1 = r2.identification
                int r0 = r0 + r1
                return r0
        }
    }

    static {
            r0 = 0
            java.lang.String r1 = "java.security.AccessController"
            r2 = 0
            java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            java.lang.String r1 = "net.bytebuddy.securitymanager"
            java.lang.String r2 = "true"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            net.bytebuddy.dynamic.NexusAccessor.ACCESS_CONTROLLER = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            goto L19
        L16:
            r0 = 1
        L17:
            net.bytebuddy.dynamic.NexusAccessor.ACCESS_CONTROLLER = r0
        L19:
            net.bytebuddy.dynamic.NexusAccessor$Dispatcher$CreationAction r0 = net.bytebuddy.dynamic.NexusAccessor.Dispatcher.CreationAction.INSTANCE
            java.lang.Object r0 = doPrivileged(r0)
            net.bytebuddy.dynamic.NexusAccessor$Dispatcher r0 = (net.bytebuddy.dynamic.NexusAccessor.Dispatcher) r0
            net.bytebuddy.dynamic.NexusAccessor.DISPATCHER = r0
            return
    }

    public NexusAccessor() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public NexusAccessor(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ref.ReferenceQueue<? super java.lang.ClassLoader> r1) {
            r0 = this;
            r0.<init>()
            r0.referenceQueue = r1
            return
    }

    public static void clean(java.lang.ref.Reference<? extends java.lang.ClassLoader> r1) {
            net.bytebuddy.dynamic.NexusAccessor$Dispatcher r0 = net.bytebuddy.dynamic.NexusAccessor.DISPATCHER
            r0.clean(r1)
            return
    }

    @net.bytebuddy.build.AccessControllerPlugin.Enhance
    private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
            boolean r0 = net.bytebuddy.dynamic.NexusAccessor.ACCESS_CONTROLLER
            if (r0 == 0) goto L9
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
            return r1
        L9:
            java.lang.Object r1 = r1.run()
            return r1
    }

    public static boolean isAlive() {
            net.bytebuddy.dynamic.NexusAccessor$Dispatcher r0 = net.bytebuddy.dynamic.NexusAccessor.DISPATCHER
            boolean r0 = r0.isAlive()
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
            java.lang.ref.ReferenceQueue<? super java.lang.ClassLoader> r2 = r4.referenceQueue
            net.bytebuddy.dynamic.NexusAccessor r5 = (net.bytebuddy.dynamic.NexusAccessor) r5
            java.lang.ref.ReferenceQueue<? super java.lang.ClassLoader> r5 = r5.referenceQueue
            if (r5 == 0) goto L24
            if (r2 == 0) goto L26
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L27
            return r1
        L24:
            if (r2 == 0) goto L27
        L26:
            return r1
        L27:
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.ref.ReferenceQueue<? super java.lang.ClassLoader> r1 = r2.referenceQueue
            if (r1 == 0) goto L13
            int r1 = r1.hashCode()
            int r0 = r0 + r1
        L13:
            return r0
    }

    public void register(java.lang.String r8, @net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r9, int r10, net.bytebuddy.implementation.LoadedTypeInitializer r11) {
            r7 = this;
            boolean r0 = r11.isAlive()
            if (r0 == 0) goto L11
            net.bytebuddy.dynamic.NexusAccessor$Dispatcher r1 = net.bytebuddy.dynamic.NexusAccessor.DISPATCHER
            java.lang.ref.ReferenceQueue<? super java.lang.ClassLoader> r4 = r7.referenceQueue
            r2 = r8
            r3 = r9
            r5 = r10
            r6 = r11
            r1.register(r2, r3, r4, r5, r6)
        L11:
            return
    }
}
