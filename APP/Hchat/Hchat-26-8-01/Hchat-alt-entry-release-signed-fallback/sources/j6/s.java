package j6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends j6.v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.reflect.Method f6766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6767c;

    public s(java.lang.reflect.Method r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f6766b = r1
            r0.f6767c = r2
            return
    }

    @Override // j6.v
    public final java.lang.Object a(java.lang.Class r3) {
            r2 = this;
            java.lang.String r0 = h0.q0.b(r3)
            if (r0 != 0) goto L18
            int r0 = r2.f6767c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r0}
            java.lang.reflect.Method r0 = r2.f6766b
            r1 = 0
            java.lang.Object r3 = r0.invoke(r1, r3)
            return r3
        L18:
            java.lang.String r3 = "UnsafeAllocator is used for non-instantiable type: "
            java.lang.String r3 = r3.concat(r0)
            j8.o.f(r3)
            r3 = 0
            return r3
    }
}
