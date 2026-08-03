package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ConstructorInvocable extends bsh.ExecutingInvocable {
    private java.lang.reflect.Constructor<?> constructor;
    private final boolean isStatic;

    public ConstructorInvocable(java.lang.reflect.Constructor<?> r1) {
            r0 = this;
            r0.<init>(r1)
            r0.constructor = r1
            java.lang.Class r1 = r0.getDeclaringClass()
            boolean r1 = bsh.Reflect.isStatic(r1)
            r0.isStatic = r1
            return
    }

    @Override // bsh.ExecutingInvocable, bsh.Invocable
    public bsh.Invocable.ParameterType collectParamaters(java.lang.Object r2, java.lang.Object[] r3) {
            r1 = this;
            boolean r0 = r1.isInnerClass()
            if (r0 == 0) goto L1c
            boolean r0 = r1.isStatic()
            if (r0 != 0) goto L1c
            java.util.stream.Stream r0 = java.util.stream.Stream.of(r2)
            java.util.stream.Stream r3 = java.util.stream.Stream.of(r3)
            java.util.stream.Stream r3 = java.util.stream.Stream.concat(r0, r3)
            java.lang.Object[] r3 = r3.toArray()
        L1c:
            bsh.Invocable$ParameterType r2 = super.collectParamaters(r2, r3)
            return r2
    }

    @Override // bsh.Invocable
    public java.lang.Class<?> getReturnType() {
            r1 = this;
            java.lang.Class r0 = r1.getDeclaringClass()
            return r0
    }

    @Override // bsh.Invocable
    public boolean isInnerClass() {
            r1 = this;
            java.lang.Class r0 = r1.getDeclaringClass()
            boolean r0 = r0.isMemberClass()
            return r0
    }

    @Override // bsh.Invocable
    public boolean isStatic() {
            r1 = this;
            boolean r0 = r1.isStatic
            return r0
    }

    @Override // bsh.ExecutingInvocable, bsh.Invocable
    public java.lang.invoke.MethodHandle lookup(java.lang.invoke.MethodHandle r3) {
            r2 = this;
            r3 = 0
            java.lang.invoke.MethodHandles$Lookup r0 = java.lang.invoke.MethodHandles.lookup()     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14
            java.lang.reflect.Constructor<?> r1 = r2.constructor     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14
            java.lang.invoke.MethodHandle r0 = r0.unreflectConstructor(r1)     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14
            java.lang.invoke.MethodHandle r0 = super.lookup(r0)     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14
            r2.constructor = r3
            return r0
        L12:
            r0 = move-exception
            goto L1b
        L14:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L12
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L12
            throw r1     // Catch: java.lang.Throwable -> L12
        L1b:
            r2.constructor = r3
            throw r0
    }
}
