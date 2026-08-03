package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Invocable implements java.lang.reflect.Member {
    private final java.lang.Class<?> declaringClass;
    private final int flags;
    private java.lang.invoke.MethodHandle handle;
    private final boolean isStatic;
    private final boolean isSynthetic;
    protected int lastParameterIndex;
    private final java.lang.String name;
    protected final java.util.List<java.lang.Object> parameters;
    private final java.lang.String toString;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class ParameterType {
        boolean isFixedArity;
        java.util.List<java.lang.Object> params;

        public ParameterType(java.util.List<java.lang.Object> r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.params = r1
                r0.isFixedArity = r2
                return
        }
    }

    public <M extends java.lang.reflect.AccessibleObject & java.lang.reflect.Member> Invocable(M r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.handle = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.parameters = r0
            r0 = r3
            java.lang.reflect.Member r0 = (java.lang.reflect.Member) r0
            int r1 = r0.getModifiers()
            r2.flags = r1
            java.lang.Class r1 = r0.getDeclaringClass()
            r2.declaringClass = r1
            java.lang.String r0 = r0.getName()
            r2.name = r0
            java.lang.String r0 = r3.toString()
            r2.toString = r0
            r0 = 0
            r2.lastParameterIndex = r0
            r0 = r3
            java.lang.reflect.Member r0 = (java.lang.reflect.Member) r0
            boolean r1 = bsh.Reflect.isStatic(r0)
            r2.isStatic = r1
            boolean r1 = r0.isSynthetic()
            r2.isSynthetic = r1
            boolean r1 = bsh.Capabilities.haveAccessibility()
            if (r1 == 0) goto L4c
            java.lang.Class r0 = r0.getDeclaringClass()
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            if (r0 == r1) goto L4c
            r0 = 1
            r3.setAccessible(r0)     // Catch: java.lang.SecurityException -> L4c
        L4c:
            return
    }

    public static /* synthetic */ java.lang.Integer a(java.lang.Class r0) {
            java.lang.Integer r0 = lambda$hashCode$1(r0)
            return r0
    }

    public static /* synthetic */ java.lang.Integer b(java.lang.Integer r0, java.lang.Integer r1) {
            java.lang.Integer r0 = lambda$hashCode$2(r0, r1)
            return r0
    }

    public static /* synthetic */ java.lang.String[] c(int r0) {
            java.lang.String[] r0 = lambda$getParamTypeDescriptors$0(r0)
            return r0
    }

    public static bsh.FieldAccess get(java.lang.reflect.Field r1) {
            bsh.FieldAccess r0 = new bsh.FieldAccess
            r0.<init>(r1)
            return r0
    }

    public static bsh.Invocable get(java.lang.reflect.Constructor<?> r1) {
            bsh.ConstructorInvocable r0 = new bsh.ConstructorInvocable
            r0.<init>(r1)
            return r0
    }

    public static bsh.Invocable get(java.lang.reflect.Method r1) {
            bsh.MethodInvocable r0 = new bsh.MethodInvocable
            r0.<init>(r1)
            return r0
    }

    private synchronized java.lang.Object invokeTarget(java.lang.Object r2, java.lang.Object[] r3) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "Invoking method (entry): "
            bsh.Reflect.logInvokeMethod(r0, r1, r3)     // Catch: java.lang.Throwable -> L24
            bsh.Invocable$ParameterType r2 = r1.collectParamaters(r2, r3)     // Catch: java.lang.Throwable -> L24
            java.util.List<java.lang.Object> r3 = r2.params     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = "Invoking method (after): "
            bsh.Reflect.logInvokeMethod(r0, r1, r3)     // Catch: java.lang.Throwable -> L24
            int r0 = r1.getParameterCount()     // Catch: java.lang.Throwable -> L24
            if (r0 <= 0) goto L2c
            java.lang.invoke.MethodHandle r0 = r1.getMethodHandle()     // Catch: java.lang.Throwable -> L24
            boolean r2 = r2.isFixedArity     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L26
            java.lang.invoke.MethodHandle r0 = r0.asFixedArity()     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r2 = move-exception
            goto L52
        L26:
            java.lang.Object r2 = r0.invokeWithArguments(r3)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r1)
            return r2
        L2c:
            boolean r2 = r1.isStatic()     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto L47
            boolean r2 = r1 instanceof bsh.ConstructorInvocable     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L37
            goto L47
        L37:
            java.lang.invoke.MethodHandle r2 = r1.getMethodHandle()     // Catch: java.lang.Throwable -> L24
            r0 = 0
            java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.Object r2 = (java.lang.Object) r2.invoke(r3)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r1)
            return r2
        L47:
            java.lang.invoke.MethodHandle r2 = r1.getMethodHandle()     // Catch: java.lang.Throwable -> L24
            java.lang.Object r2 = (java.lang.Object) r2.invoke()     // Catch: java.lang.Throwable -> L24
            monitor-exit(r1)
            return r2
        L52:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            throw r2
    }

    private static /* synthetic */ java.lang.String[] lambda$getParamTypeDescriptors$0(int r0) {
            java.lang.String[] r0 = new java.lang.String[r0]
            return r0
    }

    private static /* synthetic */ java.lang.Integer lambda$hashCode$1(java.lang.Class r0) {
            if (r0 != 0) goto L5
            r0 = 39
            goto L9
        L5:
            int r0 = r0.hashCode()
        L9:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    private static /* synthetic */ java.lang.Integer lambda$hashCode$2(java.lang.Integer r0, java.lang.Integer r1) {
            int r0 = r0.intValue()
            int r1 = r1.intValue()
            r0 = r0 ^ r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    public java.lang.Object coerceToType(java.lang.Object r2, java.lang.Class<?> r3) {
            r1 = this;
            java.lang.Class r0 = bsh.Types.getType(r2)
            if (r0 == 0) goto Lc
            boolean r0 = r3.isAssignableFrom(r0)
            if (r0 != 0) goto L11
        Lc:
            r0 = 0
            java.lang.Object r2 = bsh.Types.castObject(r2, r3, r0)
        L11:
            java.lang.Object r2 = bsh.Primitive.unwrap(r2)
            return r2
    }

    public bsh.Invocable.ParameterType collectParamaters(java.lang.Object r5, java.lang.Object[] r6) {
            r4 = this;
            int r5 = r4.getLastParameterIndex()
            int r0 = r6.length
            if (r5 > r0) goto L2e
            java.util.List<java.lang.Object> r5 = r4.parameters
            r5.clear()
            r5 = 0
            r0 = r5
        Le:
            int r1 = r4.getLastParameterIndex()
            java.util.List<java.lang.Object> r2 = r4.parameters
            if (r0 >= r1) goto L28
            r1 = r6[r0]
            java.lang.Class[] r3 = r4.getParameterTypes()
            r3 = r3[r0]
            java.lang.Object r1 = r4.coerceToType(r1, r3)
            r2.add(r1)
            int r0 = r0 + 1
            goto Le
        L28:
            bsh.Invocable$ParameterType r6 = new bsh.Invocable$ParameterType
            r6.<init>(r2, r5)
            return r6
        L2e:
            java.lang.reflect.InvocationTargetException r5 = new java.lang.reflect.InvocationTargetException
            java.lang.String r6 = r4.getName()
            java.lang.Class[] r0 = r4.getParameterTypes()
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Insufficient parameters passed for method: "
            r1.<init>(r2)
            r1.append(r6)
            r1.append(r0)
            java.lang.String r6 = r1.toString()
            r0 = 0
            r5.<init>(r0, r6)
            throw r5
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r5 != r6) goto L8
            return r1
        L8:
            java.lang.Class r2 = r5.getClass()
            java.lang.Class r3 = r6.getClass()
            if (r2 == r3) goto L13
            return r0
        L13:
            bsh.Invocable r6 = (bsh.Invocable) r6
            java.lang.String r2 = r5.getName()
            java.lang.String r3 = r6.getName()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L66
            java.lang.Class r2 = r5.getDeclaringClass()
            java.lang.Class r3 = r6.getDeclaringClass()
            if (r2 != r3) goto L66
            int r2 = r5.getParameterCount()
            int r3 = r6.getParameterCount()
            if (r2 != r3) goto L66
            java.lang.Class r2 = r5.getReturnType()
            java.lang.Class r3 = r6.getReturnType()
            if (r2 != r3) goto L66
            int r2 = r5.getModifiers()
            int r3 = r6.getModifiers()
            if (r2 == r3) goto L4c
            goto L66
        L4c:
            r2 = r0
        L4d:
            int r3 = r5.getParameterCount()
            if (r2 >= r3) goto L65
            java.lang.Class[] r3 = r5.getParameterTypes()
            r3 = r3[r2]
            java.lang.Class[] r4 = r6.getParameterTypes()
            r4 = r4[r2]
            if (r3 == r4) goto L62
            return r0
        L62:
            int r2 = r2 + 1
            goto L4d
        L65:
            return r1
        L66:
            return r0
    }

    @Override // java.lang.reflect.Member
    public java.lang.Class<?> getDeclaringClass() {
            r1 = this;
            java.lang.Class<?> r0 = r1.declaringClass
            return r0
    }

    public int getLastParameterIndex() {
            r1 = this;
            int r0 = r1.lastParameterIndex
            return r0
    }

    public java.lang.String getMethodDescriptor() {
            r1 = this;
            java.lang.invoke.MethodType r0 = r1.methodType()
            java.lang.String r0 = r0.toMethodDescriptorString()
            return r0
    }

    public java.lang.invoke.MethodHandle getMethodHandle() {
            r1 = this;
            java.lang.invoke.MethodHandle r0 = r1.handle
            if (r0 != 0) goto Lb
            r0 = 0
            java.lang.invoke.MethodHandle r0 = r1.lookup(r0)
            r1.handle = r0
        Lb:
            java.lang.invoke.MethodHandle r0 = r1.handle
            return r0
    }

    @Override // java.lang.reflect.Member
    public int getModifiers() {
            r1 = this;
            int r0 = r1.flags
            return r0
    }

    @Override // java.lang.reflect.Member
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public java.lang.String[] getParamTypeDescriptors() {
            r3 = this;
            java.lang.invoke.MethodType r0 = r3.methodType()
            java.util.List r0 = r0.parameterList()
            java.util.stream.Stream r0 = r0.stream()
            bsh.b r1 = new bsh.b
            r2 = 1
            r1.<init>(r2)
            java.util.stream.Stream r0 = r0.map(r1)
            bsh.e r1 = new bsh.e
            r2 = 3
            r1.<init>(r2)
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    public abstract int getParameterCount();

    public abstract java.lang.Class<?>[] getParameterTypes();

    public abstract java.lang.Class<?> getReturnType();

    public java.lang.String getReturnTypeDescriptor() {
            r1 = this;
            java.lang.Class r0 = r1.getReturnType()
            java.lang.String r0 = bsh.BSHType.getTypeDescriptor(r0)
            return r0
    }

    public java.lang.Class<?> getVarArgsComponentType() {
            r1 = this;
            java.lang.Class r0 = java.lang.Void.TYPE
            return r0
    }

    public java.lang.Class<?> getVarArgsType() {
            r1 = this;
            java.lang.Class r0 = java.lang.Void.TYPE
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.Class r0 = r4.getClass()
            int r0 = r0.hashCode()
            java.lang.String r1 = r4.getName()
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            java.lang.Class r1 = r4.getDeclaringClass()
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            int r1 = r4.getParameterCount()
            r0 = r0 ^ r1
            java.lang.Class r1 = r4.getReturnType()
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            int r1 = r4.getModifiers()
            r0 = r0 ^ r1
            java.lang.Class[] r1 = r4.getParameterTypes()
            java.util.stream.Stream r1 = java.util.stream.Stream.of(r1)
            bsh.b r2 = new bsh.b
            r3 = 11
            r2.<init>(r3)
            java.util.stream.Stream r1 = r1.map(r2)
            r2 = 75
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            bsh.i r3 = new bsh.i
            r3.<init>()
            java.lang.Object r1 = r1.reduce(r2, r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0 = r0 ^ r1
            return r0
    }

    public synchronized java.lang.Object invoke(java.lang.Object r1, java.lang.Object... r2) {
            r0 = this;
            monitor-enter(r0)
            if (r2 != 0) goto L8
            java.lang.Object[] r2 = bsh.Reflect.ZERO_ARGS     // Catch: java.lang.Throwable -> L6
            goto L8
        L6:
            r1 = move-exception
            goto L1d
        L8:
            java.lang.Object r1 = r0.invokeTarget(r1, r2)     // Catch: java.lang.Throwable -> L16
            java.lang.Class r2 = r0.getReturnType()     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = bsh.Primitive.wrap(r1, r2)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            return r1
        L16:
            r1 = move-exception
            java.lang.reflect.InvocationTargetException r2 = new java.lang.reflect.InvocationTargetException     // Catch: java.lang.Throwable -> L6
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L6
            throw r2     // Catch: java.lang.Throwable -> L6
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6
            throw r1
    }

    public boolean isGetter() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isInnerClass() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isSetter() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isStatic() {
            r1 = this;
            boolean r0 = r1.isStatic
            return r0
    }

    @Override // java.lang.reflect.Member
    public boolean isSynthetic() {
            r1 = this;
            boolean r0 = r1.isSynthetic
            return r0
    }

    public boolean isVarArgs() {
            r1 = this;
            r0 = 0
            return r0
    }

    public abstract java.lang.invoke.MethodHandle lookup(java.lang.invoke.MethodHandle r1);

    public java.lang.invoke.MethodType methodType() {
            r2 = this;
            java.lang.Class r0 = r2.getReturnType()
            java.lang.Class[] r1 = r2.getParameterTypes()
            java.lang.invoke.MethodType r0 = java.lang.invoke.MethodType.methodType(r0, r1)
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.toString
            return r0
    }
}
