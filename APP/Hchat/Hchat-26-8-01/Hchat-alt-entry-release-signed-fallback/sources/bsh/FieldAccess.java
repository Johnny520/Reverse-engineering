package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class FieldAccess extends bsh.Invocable {
    private java.lang.reflect.Field field;
    private boolean getter;
    private java.lang.invoke.MethodHandle setter;
    private final java.lang.Class<?> type;

    public FieldAccess(java.lang.reflect.Field r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.getter = r0
            java.lang.Class r0 = r2.getType()
            r1.type = r0
            r1.field = r2
            return
    }

    @Override // bsh.Invocable
    public int getParameterCount() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // bsh.Invocable
    public java.lang.Class<?>[] getParameterTypes() {
            r1 = this;
            java.lang.Class<?> r0 = r1.type
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            return r0
    }

    @Override // bsh.Invocable
    public java.lang.Class<?> getReturnType() {
            r1 = this;
            java.lang.Class<?> r0 = r1.type
            return r0
    }

    public java.lang.invoke.MethodHandle getSetterHandle() {
            r1 = this;
            java.lang.invoke.MethodHandle r0 = r1.setter
            if (r0 != 0) goto La
            java.lang.invoke.MethodHandle r0 = r1.lookup()
            r1.setter = r0
        La:
            java.lang.invoke.MethodHandle r0 = r1.setter
            return r0
    }

    @Override // bsh.Invocable
    public synchronized java.lang.Object invoke(java.lang.Object r4, java.lang.Object... r5) {
            r3 = this;
            monitor-enter(r3)
            int r0 = r5.length     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L32
            boolean r5 = r3.isStatic()     // Catch: java.lang.Throwable -> L1d
            if (r5 == 0) goto L1f
            java.lang.invoke.MethodHandle r4 = r3.getMethodHandle()     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r4 = (java.lang.Object) r4.invoke()     // Catch: java.lang.Throwable -> L1d
            java.lang.Class r5 = r3.getReturnType()     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r4 = bsh.Primitive.wrap(r4, r5)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)
            return r4
        L1d:
            r4 = move-exception
            goto L67
        L1f:
            java.lang.invoke.MethodHandle r5 = r3.getMethodHandle()     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r4 = (java.lang.Object) r5.invoke(r4)     // Catch: java.lang.Throwable -> L1d
            java.lang.Class r5 = r3.getReturnType()     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r4 = bsh.Primitive.wrap(r4, r5)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)
            return r4
        L32:
            boolean r0 = r3.isStatic()     // Catch: java.lang.Throwable -> L1d
            r1 = 0
            if (r0 == 0) goto L50
            java.lang.invoke.MethodHandle r4 = r3.getSetterHandle()     // Catch: java.lang.Throwable -> L1d
            r5 = r5[r1]     // Catch: java.lang.Throwable -> L1d
            java.lang.Class[] r0 = r3.getParameterTypes()     // Catch: java.lang.Throwable -> L1d
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r5 = super.coerceToType(r5, r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r4 = (java.lang.Object) r4.invoke(r5)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)
            return r4
        L50:
            java.lang.invoke.MethodHandle r0 = r3.getSetterHandle()     // Catch: java.lang.Throwable -> L1d
            r5 = r5[r1]     // Catch: java.lang.Throwable -> L1d
            java.lang.Class[] r2 = r3.getParameterTypes()     // Catch: java.lang.Throwable -> L1d
            r1 = r2[r1]     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r5 = super.coerceToType(r5, r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r4 = (java.lang.Object) r0.invoke(r4, r5)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)
            return r4
        L67:
            java.lang.reflect.InvocationTargetException r5 = new java.lang.reflect.InvocationTargetException     // Catch: java.lang.Throwable -> L71
            java.lang.Throwable r4 = r4.getCause()     // Catch: java.lang.Throwable -> L71
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L71
            throw r5     // Catch: java.lang.Throwable -> L71
        L71:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L71
            throw r4
    }

    public java.lang.invoke.MethodHandle lookup() {
            r3 = this;
            r0 = 0
            java.lang.invoke.MethodHandles$Lookup r1 = java.lang.invoke.MethodHandles.lookup()     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14
            java.lang.reflect.Field r2 = r3.field     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14
            java.lang.invoke.MethodHandle r1 = r1.unreflectSetter(r2)     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14
            boolean r2 = r3.getter
            if (r2 == 0) goto L11
            r3.field = r0
        L11:
            return r1
        L12:
            r1 = move-exception
            goto L1b
        L14:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L12
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L12
            throw r2     // Catch: java.lang.Throwable -> L12
        L1b:
            boolean r2 = r3.getter
            if (r2 == 0) goto L21
            r3.field = r0
        L21:
            throw r1
    }

    @Override // bsh.Invocable
    public java.lang.invoke.MethodHandle lookup(java.lang.invoke.MethodHandle r4) {
            r3 = this;
            r4 = 0
            r0 = 1
            java.lang.invoke.MethodHandles$Lookup r1 = java.lang.invoke.MethodHandles.lookup()     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
            java.lang.reflect.Field r2 = r3.field     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
            java.lang.invoke.MethodHandle r1 = r1.unreflectGetter(r2)     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
            r3.getter = r0
            java.lang.invoke.MethodHandle r0 = r3.setter
            if (r0 == 0) goto L14
            r3.field = r4
        L14:
            return r1
        L15:
            r1 = move-exception
            goto L1e
        L17:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L15
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L15
            throw r2     // Catch: java.lang.Throwable -> L15
        L1e:
            r3.getter = r0
            java.lang.invoke.MethodHandle r0 = r3.setter
            if (r0 == 0) goto L26
            r3.field = r4
        L26:
            throw r1
    }
}
