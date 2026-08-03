package l6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends f8.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Method f7864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Method f7865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Method f7866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.reflect.Method f7867e;

    public b() {
            r3 = this;
            r3.<init>()
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            java.lang.String r1 = "isRecord"
            r2 = 0
            java.lang.reflect.Method r1 = r0.getMethod(r1, r2)
            r3.f7864b = r1
            java.lang.String r1 = "getRecordComponents"
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)
            r3.f7865c = r0
            java.lang.String r0 = "java.lang.reflect.RecordComponent"
            java.lang.Class r0 = java.lang.Class.forName(r0)
            java.lang.String r1 = "getName"
            java.lang.reflect.Method r1 = r0.getMethod(r1, r2)
            r3.f7866d = r1
            java.lang.String r1 = "getType"
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)
            r3.f7867e = r0
            return
    }

    @Override // f8.i
    public final java.lang.reflect.Constructor A(java.lang.Class r7) {
            r6 = this;
            java.lang.reflect.Method r0 = r6.f7865c     // Catch: java.lang.ReflectiveOperationException -> L1f
            r1 = 0
            java.lang.Object r0 = r0.invoke(r7, r1)     // Catch: java.lang.ReflectiveOperationException -> L1f
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch: java.lang.ReflectiveOperationException -> L1f
            int r2 = r0.length     // Catch: java.lang.ReflectiveOperationException -> L1f
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.ReflectiveOperationException -> L1f
            r3 = 0
        Ld:
            int r4 = r0.length     // Catch: java.lang.ReflectiveOperationException -> L1f
            if (r3 >= r4) goto L21
            java.lang.reflect.Method r4 = r6.f7867e     // Catch: java.lang.ReflectiveOperationException -> L1f
            r5 = r0[r3]     // Catch: java.lang.ReflectiveOperationException -> L1f
            java.lang.Object r4 = r4.invoke(r5, r1)     // Catch: java.lang.ReflectiveOperationException -> L1f
            java.lang.Class r4 = (java.lang.Class) r4     // Catch: java.lang.ReflectiveOperationException -> L1f
            r2[r3] = r4     // Catch: java.lang.ReflectiveOperationException -> L1f
            int r3 = r3 + 1
            goto Ld
        L1f:
            r7 = move-exception
            goto L26
        L21:
            java.lang.reflect.Constructor r7 = r7.getDeclaredConstructor(r2)     // Catch: java.lang.ReflectiveOperationException -> L1f
            return r7
        L26:
            java.lang.String r0 = "Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior."
            ah.a.p(r0, r7)
            r7 = 0
            return r7
    }

    @Override // f8.i
    public final java.lang.String[] I(java.lang.Class r6) {
            r5 = this;
            java.lang.reflect.Method r0 = r5.f7865c     // Catch: java.lang.ReflectiveOperationException -> L1f
            r1 = 0
            java.lang.Object r6 = r0.invoke(r6, r1)     // Catch: java.lang.ReflectiveOperationException -> L1f
            java.lang.Object[] r6 = (java.lang.Object[]) r6     // Catch: java.lang.ReflectiveOperationException -> L1f
            int r0 = r6.length     // Catch: java.lang.ReflectiveOperationException -> L1f
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.ReflectiveOperationException -> L1f
            r2 = 0
        Ld:
            int r3 = r6.length     // Catch: java.lang.ReflectiveOperationException -> L1f
            if (r2 >= r3) goto L21
            java.lang.reflect.Method r3 = r5.f7866d     // Catch: java.lang.ReflectiveOperationException -> L1f
            r4 = r6[r2]     // Catch: java.lang.ReflectiveOperationException -> L1f
            java.lang.Object r3 = r3.invoke(r4, r1)     // Catch: java.lang.ReflectiveOperationException -> L1f
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.ReflectiveOperationException -> L1f
            r0[r2] = r3     // Catch: java.lang.ReflectiveOperationException -> L1f
            int r2 = r2 + 1
            goto Ld
        L1f:
            r6 = move-exception
            goto L22
        L21:
            return r0
        L22:
            java.lang.String r0 = "Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior."
            ah.a.p(r0, r6)
            r6 = 0
            return r6
    }

    @Override // f8.i
    public final boolean X(java.lang.Class r3) {
            r2 = this;
            java.lang.reflect.Method r0 = r2.f7864b     // Catch: java.lang.ReflectiveOperationException -> Le
            r1 = 0
            java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: java.lang.ReflectiveOperationException -> Le
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.ReflectiveOperationException -> Le
            boolean r3 = r3.booleanValue()     // Catch: java.lang.ReflectiveOperationException -> Le
            return r3
        Le:
            r3 = move-exception
            java.lang.String r0 = "Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior."
            ah.a.p(r0, r3)
            r3 = 0
            return r3
    }

    @Override // f8.i
    public final java.lang.reflect.Method x(java.lang.Class r2, java.lang.reflect.Field r3) {
            r1 = this;
            java.lang.String r3 = r3.getName()     // Catch: java.lang.ReflectiveOperationException -> La
            r0 = 0
            java.lang.reflect.Method r2 = r2.getMethod(r3, r0)     // Catch: java.lang.ReflectiveOperationException -> La
            return r2
        La:
            r2 = move-exception
            java.lang.String r3 = "Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior."
            ah.a.p(r3, r2)
            r2 = 0
            return r2
    }
}
