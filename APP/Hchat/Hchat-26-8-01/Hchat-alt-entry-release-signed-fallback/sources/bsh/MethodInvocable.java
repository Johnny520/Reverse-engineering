package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class MethodInvocable extends bsh.ExecutingInvocable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.util.regex.Pattern PROPERTY_PATTERN = null;
    private boolean getter;
    private java.lang.reflect.Method method;
    private boolean setter;
    private final java.lang.Class<?> type;

    static {
            java.lang.String r0 = "(?:[gs]et|is)\\p{javaUpperCase}.*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            bsh.MethodInvocable.PROPERTY_PATTERN = r0
            return
    }

    public MethodInvocable(java.lang.reflect.Method r6) {
            r5 = this;
            r5.<init>(r6)
            r0 = 0
            r5.getter = r0
            r5.setter = r0
            r5.method = r6
            java.lang.Class r6 = r6.getReturnType()
            r5.type = r6
            int r1 = r5.getParameterCount()
            boolean r2 = r5.isVarArgs()
            int r1 = r1 - r2
            r5.lastParameterIndex = r1
            java.util.regex.Pattern r1 = bsh.MethodInvocable.PROPERTY_PATTERN
            java.lang.String r2 = r5.getName()
            java.util.regex.Matcher r1 = r1.matcher(r2)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L74
            java.lang.String r1 = r5.getName()
            java.lang.String r2 = "set"
            boolean r1 = r1.startsWith(r2)
            r5.setter = r1
            java.lang.Class r2 = java.lang.Void.TYPE
            r3 = 1
            if (r1 != 0) goto L46
            int r1 = r5.getParameterCount()
            if (r1 != 0) goto L46
            if (r6 == r2) goto L46
            r1 = r3
            goto L47
        L46:
            r1 = r0
        L47:
            r5.getter = r1
            boolean r1 = r5.setter
            int r4 = r5.getParameterCount()
            if (r4 != r3) goto L55
            if (r6 != r2) goto L55
            r2 = r3
            goto L56
        L55:
            r2 = r0
        L56:
            r1 = r1 & r2
            r5.setter = r1
            boolean r1 = r5.getter
            if (r1 == 0) goto L74
            java.lang.String r1 = r5.getName()
            java.lang.String r2 = "is"
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L74
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            if (r6 == r1) goto L71
            java.lang.Class r1 = java.lang.Boolean.TYPE
            if (r6 != r1) goto L72
        L71:
            r0 = r3
        L72:
            r5.getter = r0
        L74:
            return
    }

    private static java.lang.invoke.MethodHandle getHandle(java.lang.reflect.Method r9) {
            java.lang.String r0 = r9.getName()
            java.lang.Class[] r1 = r9.getParameterTypes()
            java.lang.Class r2 = r9.getDeclaringClass()
            java.lang.invoke.MethodHandles$Lookup r3 = java.lang.invoke.MethodHandles.lookup()
            r4 = r2
        L11:
            if (r4 == 0) goto L3d
            if (r9 == 0) goto L1a
            java.lang.invoke.MethodHandle r9 = r3.unreflect(r9)     // Catch: java.lang.IllegalAccessException -> L1a
            return r9
        L1a:
            java.lang.Class[] r5 = r4.getInterfaces()
            int r6 = r5.length
            r7 = 0
        L20:
            if (r7 >= r6) goto L30
            r8 = r5[r7]
            java.lang.reflect.Method r9 = r8.getDeclaredMethod(r0, r1)     // Catch: java.lang.Throwable -> L2d
            java.lang.invoke.MethodHandle r9 = r3.unreflect(r9)     // Catch: java.lang.Throwable -> L2d
            return r9
        L2d:
            int r7 = r7 + 1
            goto L20
        L30:
            java.lang.Class r4 = r4.getSuperclass()
            if (r4 == 0) goto L11
            java.lang.reflect.Method r9 = r4.getDeclaredMethod(r0, r1)     // Catch: java.lang.Throwable -> L3b
            goto L11
        L3b:
            r9 = 0
            goto L11
        L3d:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.String r1 = "MethodHandle lookup failed to find a "
            java.lang.String r3 = " in "
            java.lang.StringBuilder r0 = bc.e.o(r1, r0, r3)
            java.lang.String r1 = r2.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
    }

    @Override // bsh.ExecutingInvocable, bsh.Invocable
    public bsh.Invocable.ParameterType collectParamaters(java.lang.Object r3, java.lang.Object[] r4) {
            r2 = this;
            bsh.Invocable$ParameterType r4 = super.collectParamaters(r3, r4)
            boolean r0 = r2.isStatic()
            if (r0 != 0) goto L10
            java.util.List<java.lang.Object> r0 = r2.parameters
            r1 = 0
            r0.add(r1, r3)
        L10:
            bsh.Invocable$ParameterType r3 = new bsh.Invocable$ParameterType
            java.util.List<java.lang.Object> r0 = r2.parameters
            boolean r4 = r4.isFixedArity
            r3.<init>(r0, r4)
            return r3
    }

    @Override // bsh.Invocable
    public java.lang.Class<?> getReturnType() {
            r1 = this;
            java.lang.Class<?> r0 = r1.type
            return r0
    }

    @Override // bsh.Invocable
    public boolean isGetter() {
            r1 = this;
            boolean r0 = r1.getter
            return r0
    }

    @Override // bsh.Invocable
    public boolean isSetter() {
            r1 = this;
            boolean r0 = r1.setter
            return r0
    }

    @Override // bsh.ExecutingInvocable, bsh.Invocable
    public java.lang.invoke.MethodHandle lookup(java.lang.invoke.MethodHandle r3) {
            r2 = this;
            r3 = 0
            java.lang.reflect.Method r0 = r2.method     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L10
            java.lang.invoke.MethodHandle r0 = getHandle(r0)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L10
            java.lang.invoke.MethodHandle r0 = super.lookup(r0)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L10
            r2.method = r3
            return r0
        Le:
            r0 = move-exception
            goto L17
        L10:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> Le
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Le
            throw r1     // Catch: java.lang.Throwable -> Le
        L17:
            r2.method = r3
            throw r0
    }
}
