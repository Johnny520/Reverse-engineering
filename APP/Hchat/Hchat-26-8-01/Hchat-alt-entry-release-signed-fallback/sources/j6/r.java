package j6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends j6.v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.reflect.Method f6764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f6765c;

    public r(java.lang.reflect.Method r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            r0.f6764b = r1
            r0.f6765c = r2
            return
    }

    @Override // j6.v
    public final java.lang.Object a(java.lang.Class r3) {
            r2 = this;
            java.lang.String r0 = h0.q0.b(r3)
            if (r0 != 0) goto L13
            java.lang.Object r0 = r2.f6765c
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.reflect.Method r1 = r2.f6764b
            java.lang.Object r3 = r1.invoke(r0, r3)
            return r3
        L13:
            java.lang.String r3 = "UnsafeAllocator is used for non-instantiable type: "
            java.lang.String r3 = r3.concat(r0)
            j8.o.f(r3)
            r3 = 0
            return r3
    }
}
