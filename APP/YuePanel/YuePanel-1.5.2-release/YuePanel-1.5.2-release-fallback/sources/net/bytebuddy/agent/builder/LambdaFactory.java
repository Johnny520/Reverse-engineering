package net.bytebuddy.agent.builder;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class LambdaFactory {

    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "The field must be accessible by different class loader instances.", value = {"MS_MUTABLE_COLLECTION_PKGPROTECT"})
    public static final java.util.Map<java.lang.instrument.ClassFileTransformer, net.bytebuddy.agent.builder.LambdaFactory> CLASS_FILE_TRANSFORMERS = null;
    private static final java.lang.String FIELD_NAME = "CLASS_FILE_TRANSFORMERS";
    private final java.lang.reflect.Method dispatcher;
    private final java.lang.Object target;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            net.bytebuddy.agent.builder.LambdaFactory.CLASS_FILE_TRANSFORMERS = r0
            return
    }

    public LambdaFactory(java.lang.Object r1, java.lang.reflect.Method r2) {
            r0 = this;
            r0.<init>()
            r0.target = r1
            r0.dispatcher = r2
            return
    }

    private byte[] invoke(java.lang.Object r14, java.lang.String r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19, boolean r20, java.util.List<java.lang.Class<?>> r21, java.util.List<?> r22, java.util.Collection<java.lang.instrument.ClassFileTransformer> r23) {
            r13 = this;
            r1 = r13
            java.lang.reflect.Method r0 = r1.dispatcher     // Catch: java.lang.Exception -> L24 java.lang.RuntimeException -> L26
            java.lang.Object r2 = r1.target     // Catch: java.lang.Exception -> L24 java.lang.RuntimeException -> L26
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r20)     // Catch: java.lang.Exception -> L24 java.lang.RuntimeException -> L26
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r10 = r21
            r11 = r22
            r12 = r23
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r5, r6, r7, r8, r9, r10, r11, r12}     // Catch: java.lang.Exception -> L24 java.lang.RuntimeException -> L26
            java.lang.Object r0 = r0.invoke(r2, r3)     // Catch: java.lang.Exception -> L24 java.lang.RuntimeException -> L26
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Exception -> L24 java.lang.RuntimeException -> L26
            return r0
        L24:
            r0 = move-exception
            goto L28
        L26:
            r0 = move-exception
            goto L30
        L28:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Cannot create class for lambda expression"
            r2.<init>(r3, r0)
            throw r2
        L30:
            throw r0
    }

    public static byte[] make(java.lang.Object r13, java.lang.String r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18, boolean r19, java.util.List<java.lang.Class<?>> r20, java.util.List<?> r21) {
            java.util.Map<java.lang.instrument.ClassFileTransformer, net.bytebuddy.agent.builder.LambdaFactory> r0 = net.bytebuddy.agent.builder.LambdaFactory.CLASS_FILE_TRANSFORMERS
            java.util.Collection r1 = r0.values()
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = r1.next()
            r2 = r1
            net.bytebuddy.agent.builder.LambdaFactory r2 = (net.bytebuddy.agent.builder.LambdaFactory) r2
            java.util.Set r12 = r0.keySet()
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            byte[] r0 = r2.invoke(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
    }

    public static boolean register(java.lang.instrument.ClassFileTransformer r17, java.lang.Object r18) {
            r1 = r17
            r2 = r18
            java.lang.Class<net.bytebuddy.agent.builder.LambdaFactory> r0 = net.bytebuddy.agent.builder.LambdaFactory.class
            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)     // Catch: java.lang.Exception -> Lb1 java.lang.RuntimeException -> Lb3
            net.bytebuddy.dynamic.loading.ClassInjector r3 = net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.ofSystemClassLoader()     // Catch: java.lang.Exception -> Lb1 java.lang.RuntimeException -> Lb3
            java.lang.Class<net.bytebuddy.agent.builder.LambdaFactory> r4 = net.bytebuddy.agent.builder.LambdaFactory.class
            byte[] r4 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.read(r4)     // Catch: java.lang.Exception -> Lb1 java.lang.RuntimeException -> Lb3
            java.util.Map r4 = java.util.Collections.singletonMap(r0, r4)     // Catch: java.lang.Exception -> Lb1 java.lang.RuntimeException -> Lb3
            java.util.Map r3 = r3.inject(r4)     // Catch: java.lang.Exception -> Lb1 java.lang.RuntimeException -> Lb3
            java.lang.Object r0 = r3.get(r0)     // Catch: java.lang.Exception -> Lb1 java.lang.RuntimeException -> Lb3
            r3 = r0
            java.lang.Class r3 = (java.lang.Class) r3     // Catch: java.lang.Exception -> Lb1 java.lang.RuntimeException -> Lb3
            java.lang.String r0 = "CLASS_FILE_TRANSFORMERS"
            java.lang.reflect.Field r0 = r3.getField(r0)     // Catch: java.lang.Exception -> Lb1 java.lang.RuntimeException -> Lb3
            r4 = 0
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Exception -> Lb1 java.lang.RuntimeException -> Lb3
            r4 = r0
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Exception -> Lb1 java.lang.RuntimeException -> Lb3
            monitor-enter(r4)     // Catch: java.lang.Exception -> Lb1 java.lang.RuntimeException -> Lb3
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Throwable -> L73
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            java.lang.Class<java.lang.reflect.Method> r6 = java.lang.reflect.Method.class
            java.lang.Class[] r5 = new java.lang.Class[]{r5, r6}     // Catch: java.lang.Throwable -> L71
            java.lang.reflect.Constructor r3 = r3.getConstructor(r5)     // Catch: java.lang.Throwable -> L71
            java.lang.Class r5 = r18.getClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r6 = "make"
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
            java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
            java.lang.Class<java.lang.Object> r11 = java.lang.Object.class
            java.lang.Class<java.lang.Object> r12 = java.lang.Object.class
            java.lang.Class r13 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L71
            java.lang.Class<java.util.List> r14 = java.util.List.class
            java.lang.Class<java.util.List> r15 = java.util.List.class
            java.lang.Class<java.util.Collection> r16 = java.util.Collection.class
            java.lang.Class[] r7 = new java.lang.Class[]{r7, r8, r9, r10, r11, r12, r13, r14, r15, r16}     // Catch: java.lang.Throwable -> L71
            java.lang.reflect.Method r5 = r5.getMethod(r6, r7)     // Catch: java.lang.Throwable -> L71
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r5}     // Catch: java.lang.Throwable -> L71
            java.lang.Object r2 = r3.newInstance(r2)     // Catch: java.lang.Throwable -> L71
            r4.put(r1, r2)     // Catch: java.lang.Throwable -> L71
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            return r0
        L71:
            r0 = move-exception
            goto Laf
        L73:
            r0 = move-exception
            r5 = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Class<java.lang.reflect.Method> r6 = java.lang.reflect.Method.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r6}     // Catch: java.lang.Throwable -> L71
            java.lang.reflect.Constructor r0 = r3.getConstructor(r0)     // Catch: java.lang.Throwable -> L71
            java.lang.Class r3 = r18.getClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r6 = "make"
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
            java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
            java.lang.Class<java.lang.Object> r11 = java.lang.Object.class
            java.lang.Class<java.lang.Object> r12 = java.lang.Object.class
            java.lang.Class r13 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L71
            java.lang.Class<java.util.List> r14 = java.util.List.class
            java.lang.Class<java.util.List> r15 = java.util.List.class
            java.lang.Class<java.util.Collection> r16 = java.util.Collection.class
            java.lang.Class[] r7 = new java.lang.Class[]{r7, r8, r9, r10, r11, r12, r13, r14, r15, r16}     // Catch: java.lang.Throwable -> L71
            java.lang.reflect.Method r3 = r3.getMethod(r6, r7)     // Catch: java.lang.Throwable -> L71
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.newInstance(r2)     // Catch: java.lang.Throwable -> L71
            r4.put(r1, r0)     // Catch: java.lang.Throwable -> L71
            throw r5     // Catch: java.lang.Throwable -> L71
        Laf:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            throw r0     // Catch: java.lang.Exception -> Lb1 java.lang.RuntimeException -> Lb3
        Lb1:
            r0 = move-exception
            goto Lb5
        Lb3:
            r0 = move-exception
            goto Lbd
        Lb5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Could not register class file transformer"
            r1.<init>(r2, r0)
            throw r1
        Lbd:
            throw r0
    }

    public static boolean release(java.lang.instrument.ClassFileTransformer r2) {
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Exception -> L31 java.lang.RuntimeException -> L33
            java.lang.Class<net.bytebuddy.agent.builder.LambdaFactory> r1 = net.bytebuddy.agent.builder.LambdaFactory.class
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Exception -> L31 java.lang.RuntimeException -> L33
            java.lang.Class r0 = r0.loadClass(r1)     // Catch: java.lang.Exception -> L31 java.lang.RuntimeException -> L33
            java.lang.String r1 = "CLASS_FILE_TRANSFORMERS"
            java.lang.reflect.Field r0 = r0.getField(r1)     // Catch: java.lang.Exception -> L31 java.lang.RuntimeException -> L33
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L31 java.lang.RuntimeException -> L33
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Exception -> L31 java.lang.RuntimeException -> L33
            monitor-enter(r0)     // Catch: java.lang.Exception -> L31 java.lang.RuntimeException -> L33
            java.lang.Object r2 = r0.remove(r2)     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L2c
            boolean r2 = r0.isEmpty()     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L2c
            r2 = 1
            goto L2d
        L2a:
            r2 = move-exception
            goto L2f
        L2c:
            r2 = 0
        L2d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            return r2
        L2f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r2     // Catch: java.lang.Exception -> L31 java.lang.RuntimeException -> L33
        L31:
            r2 = move-exception
            goto L35
        L33:
            r2 = move-exception
            goto L3d
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not release class file transformer"
            r0.<init>(r1, r2)
            throw r0
        L3d:
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
            java.lang.Object r2 = r4.target
            net.bytebuddy.agent.builder.LambdaFactory r5 = (net.bytebuddy.agent.builder.LambdaFactory) r5
            java.lang.Object r3 = r5.target
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L20
            return r1
        L20:
            java.lang.reflect.Method r2 = r4.dispatcher
            java.lang.reflect.Method r5 = r5.dispatcher
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
            java.lang.reflect.Method r1 = r2.dispatcher
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }
}
