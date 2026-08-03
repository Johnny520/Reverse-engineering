package ci;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0.j1 f1813a;

    public z() {
            r1 = this;
            r1.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            i0.j1 r0 = i0.r.u(r0)
            r1.f1813a = r0
            return
    }

    public final boolean a() {
            r1 = this;
            i0.j1 r0 = r1.f1813a
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public final void b(boolean r2) {
            r1 = this;
            i0.j1 r0 = r1.f1813a
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.setValue(r2)
            return
    }
}
