package xhss;

/* JADX INFO: renamed from: xhss.ᲀᛴᲀᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0860 extends xhss.AbstractC1178 {

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public final java.lang.reflect.Method f2777;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final java.lang.reflect.Method f2778;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final java.lang.reflect.Method f2779;

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public final java.lang.reflect.Method f2780;

    public C0860() {
            r3 = this;
            r3.<init>()
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            java.lang.String r1 = "isRecord"
            r2 = 0
            java.lang.reflect.Method r1 = r0.getMethod(r1, r2)
            r3.f2778 = r1
            java.lang.String r1 = "getRecordComponents"
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)
            r3.f2779 = r0
            java.lang.String r0 = "java.lang.reflect.RecordComponent"
            java.lang.Class r0 = java.lang.Class.forName(r0)
            java.lang.String r1 = "getName"
            java.lang.reflect.Method r1 = r0.getMethod(r1, r2)
            r3.f2780 = r1
            java.lang.String r1 = "getType"
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)
            r3.f2777 = r0
            return
    }

    @Override // xhss.AbstractC1178
    /* JADX INFO: renamed from: ᛱᛳᲁᲈ */
    public final boolean mo796(java.lang.Class r2) {
            r1 = this;
            java.lang.reflect.Method r1 = r1.f2778     // Catch: java.lang.ReflectiveOperationException -> Le
            r0 = 0
            java.lang.Object r1 = r1.invoke(r2, r0)     // Catch: java.lang.ReflectiveOperationException -> Le
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.ReflectiveOperationException -> Le
            boolean r1 = r1.booleanValue()     // Catch: java.lang.ReflectiveOperationException -> Le
            return r1
        Le:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = "Unexpected ReflectiveOperationException occurred (Gson 2.14.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior."
            r2.<init>(r0, r1)
            throw r2
    }

    @Override // xhss.AbstractC1178
    /* JADX INFO: renamed from: ᛳᲈᲈᛲ */
    public final java.lang.String[] mo797(java.lang.Class r6) {
            r5 = this;
            java.lang.reflect.Method r0 = r5.f2779     // Catch: java.lang.ReflectiveOperationException -> L20
            r1 = 0
            java.lang.Object r6 = r0.invoke(r6, r1)     // Catch: java.lang.ReflectiveOperationException -> L20
            java.lang.Object[] r6 = (java.lang.Object[]) r6     // Catch: java.lang.ReflectiveOperationException -> L20
            int r0 = r6.length     // Catch: java.lang.ReflectiveOperationException -> L20
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.ReflectiveOperationException -> L20
            r2 = 0
        Ld:
            int r3 = r6.length     // Catch: java.lang.ReflectiveOperationException -> L20
            if (r2 >= r3) goto L1f
            java.lang.reflect.Method r3 = r5.f2780     // Catch: java.lang.ReflectiveOperationException -> L20
            r4 = r6[r2]     // Catch: java.lang.ReflectiveOperationException -> L20
            java.lang.Object r3 = r3.invoke(r4, r1)     // Catch: java.lang.ReflectiveOperationException -> L20
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.ReflectiveOperationException -> L20
            r0[r2] = r3     // Catch: java.lang.ReflectiveOperationException -> L20
            int r2 = r2 + 1
            goto Ld
        L1f:
            return r0
        L20:
            r5 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r0 = "Unexpected ReflectiveOperationException occurred (Gson 2.14.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior."
            r6.<init>(r0, r5)
            throw r6
    }

    @Override // xhss.AbstractC1178
    /* JADX INFO: renamed from: ᲀᲇᛳᲁ */
    public final java.lang.reflect.Constructor mo798(java.lang.Class r7) {
            r6 = this;
            java.lang.reflect.Method r0 = r6.f2779     // Catch: java.lang.ReflectiveOperationException -> L24
            r1 = 0
            java.lang.Object r0 = r0.invoke(r7, r1)     // Catch: java.lang.ReflectiveOperationException -> L24
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch: java.lang.ReflectiveOperationException -> L24
            int r2 = r0.length     // Catch: java.lang.ReflectiveOperationException -> L24
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.ReflectiveOperationException -> L24
            r3 = 0
        Ld:
            int r4 = r0.length     // Catch: java.lang.ReflectiveOperationException -> L24
            if (r3 >= r4) goto L1f
            java.lang.reflect.Method r4 = r6.f2777     // Catch: java.lang.ReflectiveOperationException -> L24
            r5 = r0[r3]     // Catch: java.lang.ReflectiveOperationException -> L24
            java.lang.Object r4 = r4.invoke(r5, r1)     // Catch: java.lang.ReflectiveOperationException -> L24
            java.lang.Class r4 = (java.lang.Class) r4     // Catch: java.lang.ReflectiveOperationException -> L24
            r2[r3] = r4     // Catch: java.lang.ReflectiveOperationException -> L24
            int r3 = r3 + 1
            goto Ld
        L1f:
            java.lang.reflect.Constructor r6 = r7.getDeclaredConstructor(r2)     // Catch: java.lang.ReflectiveOperationException -> L24
            return r6
        L24:
            r6 = move-exception
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = "Unexpected ReflectiveOperationException occurred (Gson 2.14.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior."
            r7.<init>(r0, r6)
            throw r7
    }

    @Override // xhss.AbstractC1178
    /* JADX INFO: renamed from: ᲇᛶᛴᲀ */
    public final java.lang.reflect.Method mo799(java.lang.Class r1, java.lang.reflect.Field r2) {
            r0 = this;
            java.lang.String r0 = r2.getName()     // Catch: java.lang.ReflectiveOperationException -> La
            r2 = 0
            java.lang.reflect.Method r0 = r1.getMethod(r0, r2)     // Catch: java.lang.ReflectiveOperationException -> La
            return r0
        La:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unexpected ReflectiveOperationException occurred (Gson 2.14.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior."
            r1.<init>(r2, r0)
            throw r1
    }
}
