package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
abstract class ExecutingInvocable extends bsh.Invocable {
    private final boolean isVarargs;
    private final int parameterCount;
    private final java.lang.Class<?>[] parameterTypes;
    private final java.lang.Class<?> varArgsType;

    public <M extends java.lang.reflect.Executable & java.lang.reflect.Member> ExecutingInvocable(M r2) {
            r1 = this;
            r1.<init>(r2)
            java.lang.Class[] r0 = r2.getParameterTypes()
            r1.parameterTypes = r0
            int r0 = r2.getParameterCount()
            r1.parameterCount = r0
            boolean r2 = r2.isVarArgs()
            r1.isVarargs = r2
            r2 = 1
            if (r0 <= r2) goto L1a
            int r0 = r0 - r2
            goto L1b
        L1a:
            r0 = 0
        L1b:
            r1.lastParameterIndex = r0
            boolean r2 = r1.isVarArgs()
            if (r2 == 0) goto L2c
            java.lang.Class[] r2 = r1.getParameterTypes()
            int r0 = r1.lastParameterIndex
            r2 = r2[r0]
            goto L2e
        L2c:
            java.lang.Class r2 = java.lang.Void.TYPE
        L2e:
            r1.varArgsType = r2
            return
    }

    @Override // bsh.Invocable
    public bsh.Invocable.ParameterType collectParamaters(java.lang.Object r6, java.lang.Object[] r7) {
            r5 = this;
            super.collectParamaters(r6, r7)
            boolean r6 = r5.isVarArgs()
            r0 = 0
            if (r6 == 0) goto Lc0
            int r6 = r5.getLastParameterIndex()
            int r1 = r7.length
            r2 = 1
            if (r6 >= r1) goto Lb2
            int r6 = r5.getLastParameterIndex()
            r6 = r7[r6]
            int r1 = r5.getParameterCount()
            int r3 = r7.length
            if (r1 != r3) goto L43
            if (r6 == 0) goto L43
            java.lang.Class r1 = r6.getClass()
            boolean r1 = r1.isArray()
            if (r1 == 0) goto L43
            java.lang.Class r1 = r5.getVarArgsComponentType()
            java.lang.Class r3 = r6.getClass()
            java.lang.Class r3 = r3.getComponentType()
            boolean r1 = r1.isAssignableFrom(r3)
            if (r1 == 0) goto L43
            java.util.List<java.lang.Object> r7 = r5.parameters
            r7.add(r6)
            goto Lb0
        L43:
            int r1 = r5.getParameterCount()
            int r3 = r7.length
            if (r1 != r3) goto L86
            if (r6 == 0) goto L86
            java.lang.Class r1 = r6.getClass()
            boolean r1 = r1.isArray()
            if (r1 == 0) goto L86
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            java.lang.Class r3 = r6.getClass()
            boolean r1 = r1.isAssignableFrom(r3)
            if (r1 == 0) goto L86
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            java.lang.Class r7 = r5.getVarArgsComponentType()
            int r1 = r6.length
            java.lang.Object r7 = java.lang.reflect.Array.newInstance(r7, r1)
        L6d:
            int r1 = r6.length
            if (r0 >= r1) goto L80
            r1 = r6[r0]
            java.lang.Class r3 = r5.getVarArgsComponentType()
            java.lang.Object r1 = super.coerceToType(r1, r3)
            java.lang.reflect.Array.set(r7, r0, r1)
            int r0 = r0 + 1
            goto L6d
        L80:
            java.util.List<java.lang.Object> r6 = r5.parameters
            r6.add(r7)
            goto Lb0
        L86:
            int r6 = r7.length
            int r1 = r5.getLastParameterIndex()
            int r6 = r6 - r1
            java.lang.Class r1 = r5.getVarArgsComponentType()
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r6)
        L94:
            if (r0 >= r6) goto Lab
            int r3 = r5.getLastParameterIndex()
            int r3 = r3 + r0
            r3 = r7[r3]
            java.lang.Class r4 = r5.getVarArgsComponentType()
            java.lang.Object r3 = super.coerceToType(r3, r4)
            java.lang.reflect.Array.set(r1, r0, r3)
            int r0 = r0 + 1
            goto L94
        Lab:
            java.util.List<java.lang.Object> r6 = r5.parameters
            r6.add(r1)
        Lb0:
            r0 = r2
            goto Le2
        Lb2:
            java.util.List<java.lang.Object> r6 = r5.parameters
            java.lang.Class r7 = r5.getVarArgsComponentType()
            java.lang.Object r7 = java.lang.reflect.Array.newInstance(r7, r0)
            r6.add(r7)
            goto Lb0
        Lc0:
            if (r7 == 0) goto Le2
            int r6 = r5.getLastParameterIndex()
            int r1 = r7.length
            if (r6 >= r1) goto Le2
            java.util.List<java.lang.Object> r6 = r5.parameters
            int r1 = r5.getLastParameterIndex()
            r7 = r7[r1]
            java.lang.Class[] r1 = r5.getParameterTypes()
            int r2 = r5.getLastParameterIndex()
            r1 = r1[r2]
            java.lang.Object r7 = super.coerceToType(r7, r1)
            r6.add(r7)
        Le2:
            bsh.Invocable$ParameterType r6 = new bsh.Invocable$ParameterType
            java.util.List<java.lang.Object> r7 = r5.parameters
            r6.<init>(r7, r0)
            return r6
    }

    @Override // bsh.Invocable
    public int getParameterCount() {
            r1 = this;
            int r0 = r1.parameterCount
            return r0
    }

    @Override // bsh.Invocable
    public java.lang.Class<?>[] getParameterTypes() {
            r1 = this;
            java.lang.Class<?>[] r0 = r1.parameterTypes
            return r0
    }

    @Override // bsh.Invocable
    public java.lang.Class<?> getVarArgsComponentType() {
            r1 = this;
            java.lang.Class r0 = r1.getVarArgsType()
            java.lang.Class r0 = bsh.Types.arrayElementType(r0)
            return r0
    }

    @Override // bsh.Invocable
    public java.lang.Class<?> getVarArgsType() {
            r1 = this;
            java.lang.Class<?> r0 = r1.varArgsType
            return r0
    }

    @Override // bsh.Invocable
    public boolean isVarArgs() {
            r1 = this;
            boolean r0 = r1.isVarargs
            return r0
    }

    @Override // bsh.Invocable
    public java.lang.invoke.MethodHandle lookup(java.lang.invoke.MethodHandle r2) {
            r1 = this;
            boolean r0 = r1.isVarArgs()
            if (r0 == 0) goto L10
            if (r2 == 0) goto L10
            java.lang.Class r0 = r1.getVarArgsType()
            java.lang.invoke.MethodHandle r2 = r2.asVarargsCollector(r0)
        L10:
            return r2
    }
}
