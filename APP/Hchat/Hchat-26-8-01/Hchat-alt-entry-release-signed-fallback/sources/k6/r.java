package k6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f7363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Field f7364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.reflect.Method f7365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h6.n f7366d;

    public r(java.lang.String r1, java.lang.reflect.Field r2, java.lang.reflect.Method r3, h6.n r4) {
            r0 = this;
            r0.<init>()
            r0.f7365c = r3
            r0.f7366d = r4
            r0.f7363a = r1
            r0.f7364b = r2
            r2.getName()
            return
    }

    public final void a(o6.a r4, java.lang.Object r5) {
            r3 = this;
            java.lang.reflect.Method r0 = r3.f7365c
            if (r0 == 0) goto L22
            r1 = 0
            java.lang.Object r0 = r0.invoke(r5, r1)     // Catch: java.lang.reflect.InvocationTargetException -> La
            goto L28
        La:
            r4 = move-exception
            r5 = 0
            java.lang.String r5 = l6.c.d(r0, r5)
            af.d r0 = new af.d
            java.lang.String r1 = "Accessor "
            java.lang.String r2 = " threw exception"
            java.lang.String r5 = eh.a.n(r1, r5, r2)
            java.lang.Throwable r4 = r4.getCause()
            r0.<init>(r5, r4)
            throw r0
        L22:
            java.lang.reflect.Field r0 = r3.f7364b
            java.lang.Object r0 = r0.get(r5)
        L28:
            if (r0 != r5) goto L2b
            return
        L2b:
            java.lang.String r5 = r3.f7363a
            r4.i(r5)
            h6.n r5 = r3.f7366d
            r5.b(r4, r0)
            return
    }
}
